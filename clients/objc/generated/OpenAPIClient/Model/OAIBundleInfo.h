#import <Foundation/Foundation.h>
#import "OAIObject.h"

/**
* Adobe Experience Manager (AEM) API
* Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
*
* The version of the OpenAPI document: 3.5.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#import "OAIBundleData.h"
@protocol OAIBundleData;
@class OAIBundleData;



@protocol OAIBundleInfo
@end

@interface OAIBundleInfo : OAIObject

/* Status description of all bundles [optional]
 */
@property(nonatomic) NSString* status;

@property(nonatomic) NSArray<NSNumber*>* s;

@property(nonatomic) NSArray<OAIBundleData>* data;

@end