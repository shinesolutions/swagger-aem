import { BundleData } from './bundle-data';


export interface BundleInfo { 
  /**
   * Status description of all bundles
   */
  status?: string;
  s?: Array<number>;
  data?: Array<BundleData>;
}

