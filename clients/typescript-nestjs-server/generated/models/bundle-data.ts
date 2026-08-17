import { BundleDataProp } from './bundle-data-prop';


export interface BundleData { 
  /**
   * Bundle ID
   */
  id?: number;
  /**
   * Bundle name
   */
  name?: string;
  /**
   * Is bundle a fragment
   */
  fragment?: boolean;
  /**
   * Numeric raw bundle state value
   */
  stateRaw?: number;
  /**
   * Bundle state value
   */
  state?: string;
  /**
   * Bundle version
   */
  version?: string;
  /**
   * Bundle symbolic name
   */
  symbolicName?: string;
  /**
   * Bundle category
   */
  category?: string;
  props?: Array<BundleDataProp>;
}

