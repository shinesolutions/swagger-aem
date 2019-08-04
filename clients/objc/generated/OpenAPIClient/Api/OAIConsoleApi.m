#import "OAIConsoleApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAISamlConfigurationInfo.h"


@interface OAIConsoleApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIConsoleApi

NSString* kOAIConsoleApiErrorDomain = @"OAIConsoleApiErrorDomain";
NSInteger kOAIConsoleApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[OAIApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(OAIApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// 
/// 
///  @returns NSArray<NSString*>*
///
-(NSURLSessionTask*) getAemProductInfoWithCompletionHandler: 
    (void (^)(NSArray<NSString*>* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/system/console/status-productinfo.json"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"aemAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<NSString*>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<NSString*>*)data, error);
                                }
                            }];
}

///
/// 
/// 
///  @returns NSString*
///
-(NSURLSessionTask*) getConfigMgrWithCompletionHandler: 
    (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/system/console/configMgr"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"text/xml"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"aemAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSString*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSString*)data, error);
                                }
                            }];
}

///
/// 
/// 
///  @param name  
///
///  @param action  
///
///  @returns void
///
-(NSURLSessionTask*) postBundleWithName: (NSString*) name
    action: (NSString*) action
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kOAIConsoleApiErrorDomain code:kOAIConsoleApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'action' is set
    if (action == nil) {
        NSParameterAssert(action);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"action"] };
            NSError* error = [NSError errorWithDomain:kOAIConsoleApiErrorDomain code:kOAIConsoleApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/system/console/bundles/{name}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (name != nil) {
        pathParams[@"name"] = name;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (action != nil) {
        queryParams[@"action"] = action;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"aemAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// 
/// 
///  @param action  
///
///  @returns void
///
-(NSURLSessionTask*) postJmxRepositoryWithAction: (NSString*) action
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'action' is set
    if (action == nil) {
        NSParameterAssert(action);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"action"] };
            NSError* error = [NSError errorWithDomain:kOAIConsoleApiErrorDomain code:kOAIConsoleApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/system/console/jmx/com.adobe.granite:type=Repository/op/{action}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (action != nil) {
        pathParams[@"action"] = action;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"aemAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// 
/// 
///  @param post  (optional)
///
///  @param apply  (optional)
///
///  @param delete  (optional)
///
///  @param action  (optional)
///
///  @param location  (optional)
///
///  @param path  (optional)
///
///  @param serviceRanking  (optional)
///
///  @param idpUrl  (optional)
///
///  @param idpCertAlias  (optional)
///
///  @param idpHttpRedirect  (optional)
///
///  @param serviceProviderEntityId  (optional)
///
///  @param assertionConsumerServiceURL  (optional)
///
///  @param spPrivateKeyAlias  (optional)
///
///  @param keyStorePassword  (optional)
///
///  @param defaultRedirectUrl  (optional)
///
///  @param userIDAttribute  (optional)
///
///  @param useEncryption  (optional)
///
///  @param createUser  (optional)
///
///  @param addGroupMemberships  (optional)
///
///  @param groupMembershipAttribute  (optional)
///
///  @param defaultGroups  (optional)
///
///  @param nameIdFormat  (optional)
///
///  @param synchronizeAttributes  (optional)
///
///  @param handleLogout  (optional)
///
///  @param logoutUrl  (optional)
///
///  @param clockTolerance  (optional)
///
///  @param digestMethod  (optional)
///
///  @param signatureMethod  (optional)
///
///  @param userIntermediatePath  (optional)
///
///  @param propertylist  (optional)
///
///  @returns OAISamlConfigurationInfo*
///
-(NSURLSessionTask*) postSamlConfigurationWithPost: (NSNumber*) post
    apply: (NSNumber*) apply
    delete: (NSNumber*) delete
    action: (NSString*) action
    location: (NSString*) location
    path: (NSArray<NSString*>*) path
    serviceRanking: (NSNumber*) serviceRanking
    idpUrl: (NSString*) idpUrl
    idpCertAlias: (NSString*) idpCertAlias
    idpHttpRedirect: (NSNumber*) idpHttpRedirect
    serviceProviderEntityId: (NSString*) serviceProviderEntityId
    assertionConsumerServiceURL: (NSString*) assertionConsumerServiceURL
    spPrivateKeyAlias: (NSString*) spPrivateKeyAlias
    keyStorePassword: (NSString*) keyStorePassword
    defaultRedirectUrl: (NSString*) defaultRedirectUrl
    userIDAttribute: (NSString*) userIDAttribute
    useEncryption: (NSNumber*) useEncryption
    createUser: (NSNumber*) createUser
    addGroupMemberships: (NSNumber*) addGroupMemberships
    groupMembershipAttribute: (NSString*) groupMembershipAttribute
    defaultGroups: (NSArray<NSString*>*) defaultGroups
    nameIdFormat: (NSString*) nameIdFormat
    synchronizeAttributes: (NSArray<NSString*>*) synchronizeAttributes
    handleLogout: (NSNumber*) handleLogout
    logoutUrl: (NSString*) logoutUrl
    clockTolerance: (NSNumber*) clockTolerance
    digestMethod: (NSString*) digestMethod
    signatureMethod: (NSString*) signatureMethod
    userIntermediatePath: (NSString*) userIntermediatePath
    propertylist: (NSArray<NSString*>*) propertylist
    completionHandler: (void (^)(OAISamlConfigurationInfo* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (post != nil) {
        queryParams[@"post"] = [post isEqual:@(YES)] ? @"true" : @"false";
    }
    if (apply != nil) {
        queryParams[@"apply"] = [apply isEqual:@(YES)] ? @"true" : @"false";
    }
    if (delete != nil) {
        queryParams[@"delete"] = [delete isEqual:@(YES)] ? @"true" : @"false";
    }
    if (action != nil) {
        queryParams[@"action"] = action;
    }
    if (location != nil) {
        queryParams[@"$location"] = location;
    }
    if (path != nil) {
        queryParams[@"path"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: path format: @"multi"];
    }
    if (serviceRanking != nil) {
        queryParams[@"service.ranking"] = serviceRanking;
    }
    if (idpUrl != nil) {
        queryParams[@"idpUrl"] = idpUrl;
    }
    if (idpCertAlias != nil) {
        queryParams[@"idpCertAlias"] = idpCertAlias;
    }
    if (idpHttpRedirect != nil) {
        queryParams[@"idpHttpRedirect"] = [idpHttpRedirect isEqual:@(YES)] ? @"true" : @"false";
    }
    if (serviceProviderEntityId != nil) {
        queryParams[@"serviceProviderEntityId"] = serviceProviderEntityId;
    }
    if (assertionConsumerServiceURL != nil) {
        queryParams[@"assertionConsumerServiceURL"] = assertionConsumerServiceURL;
    }
    if (spPrivateKeyAlias != nil) {
        queryParams[@"spPrivateKeyAlias"] = spPrivateKeyAlias;
    }
    if (keyStorePassword != nil) {
        queryParams[@"keyStorePassword"] = keyStorePassword;
    }
    if (defaultRedirectUrl != nil) {
        queryParams[@"defaultRedirectUrl"] = defaultRedirectUrl;
    }
    if (userIDAttribute != nil) {
        queryParams[@"userIDAttribute"] = userIDAttribute;
    }
    if (useEncryption != nil) {
        queryParams[@"useEncryption"] = [useEncryption isEqual:@(YES)] ? @"true" : @"false";
    }
    if (createUser != nil) {
        queryParams[@"createUser"] = [createUser isEqual:@(YES)] ? @"true" : @"false";
    }
    if (addGroupMemberships != nil) {
        queryParams[@"addGroupMemberships"] = [addGroupMemberships isEqual:@(YES)] ? @"true" : @"false";
    }
    if (groupMembershipAttribute != nil) {
        queryParams[@"groupMembershipAttribute"] = groupMembershipAttribute;
    }
    if (defaultGroups != nil) {
        queryParams[@"defaultGroups"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: defaultGroups format: @"multi"];
    }
    if (nameIdFormat != nil) {
        queryParams[@"nameIdFormat"] = nameIdFormat;
    }
    if (synchronizeAttributes != nil) {
        queryParams[@"synchronizeAttributes"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: synchronizeAttributes format: @"multi"];
    }
    if (handleLogout != nil) {
        queryParams[@"handleLogout"] = [handleLogout isEqual:@(YES)] ? @"true" : @"false";
    }
    if (logoutUrl != nil) {
        queryParams[@"logoutUrl"] = logoutUrl;
    }
    if (clockTolerance != nil) {
        queryParams[@"clockTolerance"] = clockTolerance;
    }
    if (digestMethod != nil) {
        queryParams[@"digestMethod"] = digestMethod;
    }
    if (signatureMethod != nil) {
        queryParams[@"signatureMethod"] = signatureMethod;
    }
    if (userIntermediatePath != nil) {
        queryParams[@"userIntermediatePath"] = userIntermediatePath;
    }
    if (propertylist != nil) {
        queryParams[@"propertylist"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: propertylist format: @"csv"];
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"text/plain"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"aemAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAISamlConfigurationInfo*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAISamlConfigurationInfo*)data, error);
                                }
                            }];
}



@end
