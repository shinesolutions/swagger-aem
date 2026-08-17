import { KeystoreItems } from './keystore-items';


export interface KeystoreInfo { 
  aliases?: Array<KeystoreItems>;
  /**
   * False if truststore don\'t exist
   */
  exists?: boolean;
}

