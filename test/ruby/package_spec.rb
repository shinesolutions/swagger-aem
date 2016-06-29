require_relative 'spec_helper'

describe 'Package' do
  before do
    init_client
    @crx = SwaggerAemClient::CrxApi.new
    @sling = SwaggerAemClient::SlingApi.new

    # ensure package does not exist
    data, status_code, headers = @crx.post_package_service_json_with_http_info(
      path = 'etc/packages/somepackagegroup/somepackage-1.2.3.zip',
      cmd = 'delete'
    )
    expect(status_code).to eq(200)

    # create package
    data, status_code, headers = @crx.post_package_service_json_with_http_info(
      path = 'etc/packages/somepackage',
      cmd = 'create',
      {
        :group_name => 'somepackagegroup',
        :package_name => 'somepackage',
        :package_version => '1.2.3',
        :charset => 'utf-8'
      }
    )
    expect(status_code).to eq(200)
  end

  after do
  end

  describe 'test package build install replicate download' do

    it 'should succeed' do
      # build package
      data, status_code, headers = @crx.post_package_service_json_with_http_info(
        path = 'etc/packages/somepackagegroup/somepackage-1.2.3.zip',
        cmd = 'build'
      )
      expect(status_code).to eq(200)

      # install package
      data, status_code, headers = @crx.post_package_service_json_with_http_info(
        path = 'etc/packages/somepackagegroup/somepackage-1.2.3.zip',
        cmd = 'install'
      )
      expect(status_code).to eq(200)

      # replicate package
      data, status_code, headers = @crx.post_package_service_json_with_http_info(
        path = 'etc/packages/somepackagegroup/somepackage-1.2.3.zip',
        cmd = 'replicate'
      )
      expect(status_code).to eq(200)

      # download package
      data, status_code, headers = @sling.get_package_with_http_info(
        group = 'somepackagegroup',
        name = 'somepackage',
        version = '1.2.3'
      )
      expect(status_code).to eq(200)
      # data is a temporary file created by Swagger API client
      FileUtils.cp(data.path, '/tmp/somepackage-1.2.3.zip')
      data.delete
    end

  end

  describe 'test package upload rebuild install replicate' do

    it 'should succeed' do

      File.open('/tmp/somepackage-1.2.3.zip', 'r') { |file|
        # upload package
        data, status_code, headers = @crx.post_package_service_json_with_http_info(
          path = '',
          cmd = 'upload',
          {
            :force => true,
            :package => file
          }
        )
        expect(status_code).to eq(200)
      }

      # rebuild package
      data, status_code, headers = @crx.post_package_service_json_with_http_info(
        path = 'etc/packages/somepackagegroup/somepackage-1.2.3.zip',
        cmd = 'build'
      )
      expect(status_code).to eq(200)

      # install package
      data, status_code, headers = @crx.post_package_service_json_with_http_info(
        path = 'etc/packages/somepackagegroup/somepackage-1.2.3.zip',
        cmd = 'install'
      )
      expect(status_code).to eq(200)

      # replicate package
      data, status_code, headers = @crx.post_package_service_json_with_http_info(
        path = 'etc/packages/somepackagegroup/somepackage-1.2.3.zip',
        cmd = 'replicate'
      )
      expect(status_code).to eq(200)

    end

  end

  describe 'test package update and get filter' do

    it 'should succeed when the package has filter' do

      # update package filter
      data, status_code, headers = @crx.post_package_update_with_http_info(
        groupName = 'somepackagegroup',
        packageName = 'somepackage',
        version = '1.2.3',
        path = '/etc/packages/somepackagegroup/somepackage-1.2.3.zip',
        {
          :filter => '[{"root":"/apps/geometrixx","rules":[]}]',
          :charset => 'utf-8'
        }
      )
      expect(status_code).to eq(200)

      # get package filter
      data, status_code, headers = @sling.get_package_filter_with_http_info(
        group = 'somepackagegroup',
        name = 'somepackage',
        version = '1.2.3'
      )
      expect(status_code).to eq(200)
    end

    it 'should error when the package does not have any filter' do
      begin
        data, status_code, headers = @sling.get_package_filter_with_http_info(
          group = 'somepackagegroup',
          name = 'somepackage',
          version = '1.2.3'
        )
      rescue SwaggerAemClient::ApiError => err
        expect(err.code).to eq(404)
      end
    end

  end

  describe 'test package list' do

    it 'should succeed' do
      data, status_code, headers = @crx.post_package_service_with_http_info(
        cmd = 'ls'
      )
      expect(status_code).to eq(200)
    end

  end

end
