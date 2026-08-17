

export interface SamlConfigurationPropertyItemsBoolean { 
  /**
   * property name
   */
  name?: string;
  /**
   * True if optional
   */
  optional?: boolean;
  /**
   * True if property is set
   */
  is_set?: boolean;
  /**
   * Property type, 1=String, 3=long, 11=boolean, 12=Password
   */
  type?: number;
  /**
   * Property value
   */
  value?: boolean;
  /**
   * Property description
   */
  description?: string;
}

