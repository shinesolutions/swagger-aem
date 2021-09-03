#import "OAIBundleData.h"

@implementation OAIBundleData

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"name": @"name", @"fragment": @"fragment", @"stateRaw": @"stateRaw", @"state": @"state", @"version": @"version", @"symbolicName": @"symbolicName", @"category": @"category", @"props": @"props" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"name", @"fragment", @"stateRaw", @"state", @"version", @"symbolicName", @"category", @"props"];
  return [optionalProperties containsObject:propertyName];
}

@end
