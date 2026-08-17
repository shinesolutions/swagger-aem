import { SamlConfigurationProperties } from './saml-configuration-properties';


export interface SamlConfigurationInfo { 
  /**
   * Persistent Identity (PID)
   */
  pid?: string;
  /**
   * Title
   */
  title?: string;
  /**
   * Title
   */
  description?: string;
  /**
   * needed for configuration binding
   */
  bundle_location?: string;
  /**
   * needed for configuraiton binding
   */
  service_location?: string;
  properties?: SamlConfigurationProperties;
}

