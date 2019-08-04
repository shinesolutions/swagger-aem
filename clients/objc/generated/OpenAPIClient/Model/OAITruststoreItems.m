#import "OAITruststoreItems.h"

@implementation OAITruststoreItems

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"alias": @"alias", @"entryType": @"entryType", @"subject": @"subject", @"issuer": @"issuer", @"notBefore": @"notBefore", @"notAfter": @"notAfter", @"serialNumber": @"serialNumber" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"alias", @"entryType", @"subject", @"issuer", @"notBefore", @"notAfter", @"serialNumber"];
  return [optionalProperties containsObject:propertyName];
}

@end
