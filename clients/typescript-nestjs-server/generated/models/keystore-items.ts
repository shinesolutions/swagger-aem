import { KeystoreChainItems } from './keystore-chain-items';


export interface KeystoreItems { 
  /**
   * Keystore alias name
   */
  alias?: string;
  /**
   * e.g. \"privateKey\"
   */
  entryType?: string;
  /**
   * e.g. \"RSA\"
   */
  algorithm?: string;
  /**
   * e.g. \"PKCS#8\"
   */
  format?: string;
  chain?: Array<KeystoreChainItems>;
}

