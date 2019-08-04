#import "OAISamlConfigurationInfo.h"

@implementation OAISamlConfigurationInfo

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"pid": @"pid", @"title": @"title", @"_description": @"description", @"bundleLocation": @"bundle_location", @"serviceLocation": @"service_location", @"properties": @"properties" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"pid", @"title", @"_description", @"bundleLocation", @"serviceLocation", @"properties"];
  return [optionalProperties containsObject:propertyName];
}

@end
