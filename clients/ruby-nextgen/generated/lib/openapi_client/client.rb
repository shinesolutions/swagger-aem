# frozen_string_literal: true

module OpenapiClient
  class Client
    attr_reader :configuration, :connection

    def initialize(base_url: nil, **options, &block)
      @configuration = Configuration.new(base_url: base_url, **options, &block)
      @connection = Connection.new(@configuration)
    end

    def _cqactions_html
      @_cqactions_html ||= OpenapiClient::Api::CqactionsHtml.new(@connection)
    end

    def apps
      @apps ||= OpenapiClient::Api::Apps.new(@connection)
    end

    def bin
      @bin ||= OpenapiClient::Api::Bin.new(@connection)
    end

    def crx
      @crx ||= OpenapiClient::Api::Crx.new(@connection)
    end

    def etc
      @etc ||= OpenapiClient::Api::Etc.new(@connection)
    end

    def keystore
      @keystore ||= OpenapiClient::Api::Keystore.new(@connection)
    end

    def libs
      @libs ||= OpenapiClient::Api::Libs.new(@connection)
    end

    def root
      @root ||= OpenapiClient::Api::Root.new(@connection)
    end

    def system
      @system ||= OpenapiClient::Api::System.new(@connection)
    end

    def authorizable_id_ks_html
      @authorizable_id_ks_html ||= OpenapiClient::Api::{AuthorizableId}KsHtml.new(@connection)
    end

    def authorizable_id_ks_json
      @authorizable_id_ks_json ||= OpenapiClient::Api::{AuthorizableId}KsJson.new(@connection)
    end

    def name_rw_html
      @name_rw_html ||= OpenapiClient::Api::{Name}RwHtml.new(@connection)
    end
  end
end
