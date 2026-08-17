import { TruststoreItems } from './truststore-items';


export interface TruststoreInfo { 
  aliases?: Array<TruststoreItems>;
  /**
   * False if truststore don\'t exist
   */
  exists?: boolean;
}

