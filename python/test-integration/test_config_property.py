import helper
import swaggeraem
from swaggeraem.rest import ApiException
import unittest

class TestConfigProperty(unittest.TestCase):

    def setUp(self):
        client = helper.init_client()
        self.sling = swaggeraem.apis.SlingApi(client)

        # ensure config.author already exists
        try:
            response = self.sling.post_path_with_http_info('apps/system', 'sling:Folder', 'config.author')
            # create config.author when it does not exist
            self.assertIn(response[1], [200, 201])
        except ApiException as err:
            # ignore when it already exists
            self.assertEqual(err.status, 500)

    def test_create_ssl_should_succeed_when_path_node_already_exists(self):

        # ensure http OSGI config node exists
        try:
            response = self.sling.post_path_with_http_info('apps/system/config.author', 'sling:OsgiConfig', 'org.apache.felix.http')
            # create config when it does not exist
            self.assertIn(response[1], [200, 201])
        except ApiException as err:
            # ignore when it already exists
            self.assertEqual(err.status, 500)

        opts = {
            'org_apache_felix_https_nio': True,
            'org_apache_felix_https_nio_type_hint': 'Boolean',
            'org_apache_felix_https_keystore': '/some/path/to/keystore',
            'org_apache_felix_https_keystore_type_hint': 'String',
            'org_apache_felix_https_keystore_password': 'somepassword',
            'org_apache_felix_https_keystore_password_type_hint': 'String',
            'org_apache_felix_https_keystore_key': 'somekey',
            'org_apache_felix_https_keystore_key_type_hint': 'String',
            'org_apache_felix_https_keystore_key_password': 'somekeypassword',
            'org_apache_felix_https_keystore_key_password_type_hint': 'String',
            'org_apache_felix_https_truststore': '/some/path/to/truststore',
            'org_apache_felix_https_truststore_type_hint': 'String',
            'org_apache_felix_https_truststore_password': 'sometruststorepassword',
            'org_apache_felix_https_truststore_password_type_hint': 'String',
            'org_apache_felix_https_clientcertificate': 'none',
            'org_apache_felix_https_clientcertificate_type_hint': 'String',
            'org_apache_felix_https_enable': False,
            'org_apache_felix_https_enable_type_hint': 'Boolean',
            'org_osgi_service_http_port_secure': 4503,
            'org_osgi_service_http_port_secure_type_hint': 'Long'
        }
        response = self.sling.post_config_with_http_info('author', 'org.apache.felix.http', **opts)
        self.assertIn(response[1], [200, 201])
