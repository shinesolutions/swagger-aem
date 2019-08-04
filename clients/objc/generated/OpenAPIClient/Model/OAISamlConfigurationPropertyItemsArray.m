#import "OAISamlConfigurationPropertyItemsArray.h"

@implementation OAISamlConfigurationPropertyItemsArray

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"optional": @"optional", @"isSet": @"is_set", @"type": @"type", @"values": @"values", @"_description": @"description" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"optional", @"isSet", @"type", @"values", @"_description"];
  return [optionalProperties containsObject:propertyName];
}

@end
