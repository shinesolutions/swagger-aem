#import "OAISlingApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIKeystoreInfo.h"
#import "OAITruststoreInfo.h"


@interface OAISlingApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAISlingApi

NSString* kOAISlingApiErrorDomain = @"OAISlingApiErrorDomain";
NSInteger kOAISlingApiMissingParamErrorCode = 234513;

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
///  @param runmode  
///
///  @param name  
///
///  @returns void
///
-(NSURLSessionTask*) deleteAgentWithRunmode: (NSString*) runmode
    name: (NSString*) name
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'runmode' is set
    if (runmode == nil) {
        NSParameterAssert(runmode);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"runmode"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/etc/replication/agents.{runmode}/{name}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (runmode != nil) {
        pathParams[@"runmode"] = runmode;
    }
    if (name != nil) {
        pathParams[@"name"] = name;
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
                                    method: @"DELETE"
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
///  @param path  
///
///  @param name  
///
///  @returns void
///
-(NSURLSessionTask*) deleteNodeWithPath: (NSString*) path
    name: (NSString*) name
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'path' is set
    if (path == nil) {
        NSParameterAssert(path);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"path"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/{path}/{name}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (path != nil) {
        pathParams[@"path"] = path;
    }
    if (name != nil) {
        pathParams[@"name"] = name;
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
                                    method: @"DELETE"
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
///  @param runmode  
///
///  @param name  
///
///  @returns void
///
-(NSURLSessionTask*) getAgentWithRunmode: (NSString*) runmode
    name: (NSString*) name
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'runmode' is set
    if (runmode == nil) {
        NSParameterAssert(runmode);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"runmode"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/etc/replication/agents.{runmode}/{name}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (runmode != nil) {
        pathParams[@"runmode"] = runmode;
    }
    if (name != nil) {
        pathParams[@"name"] = name;
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
///  @param runmode  
///
///  @returns NSString*
///
-(NSURLSessionTask*) getAgentsWithRunmode: (NSString*) runmode
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'runmode' is set
    if (runmode == nil) {
        NSParameterAssert(runmode);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"runmode"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/etc/replication/agents.{runmode}.-1.json"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (runmode != nil) {
        pathParams[@"runmode"] = runmode;
    }

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
///  @param intermediatePath  
///
///  @param authorizableId  
///
///  @returns OAIKeystoreInfo*
///
-(NSURLSessionTask*) getAuthorizableKeystoreWithIntermediatePath: (NSString*) intermediatePath
    authorizableId: (NSString*) authorizableId
    completionHandler: (void (^)(OAIKeystoreInfo* output, NSError* error)) handler {
    // verify the required parameter 'intermediatePath' is set
    if (intermediatePath == nil) {
        NSParameterAssert(intermediatePath);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"intermediatePath"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'authorizableId' is set
    if (authorizableId == nil) {
        NSParameterAssert(authorizableId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorizableId"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/{intermediatePath}/{authorizableId}.ks.json"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (intermediatePath != nil) {
        pathParams[@"intermediatePath"] = intermediatePath;
    }
    if (authorizableId != nil) {
        pathParams[@"authorizableId"] = authorizableId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
                              responseType: @"OAIKeystoreInfo*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIKeystoreInfo*)data, error);
                                }
                            }];
}

///
/// 
/// 
///  @param intermediatePath  
///
///  @param authorizableId  
///
///  @returns NSURL*
///
-(NSURLSessionTask*) getKeystoreWithIntermediatePath: (NSString*) intermediatePath
    authorizableId: (NSString*) authorizableId
    completionHandler: (void (^)(NSURL* output, NSError* error)) handler {
    // verify the required parameter 'intermediatePath' is set
    if (intermediatePath == nil) {
        NSParameterAssert(intermediatePath);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"intermediatePath"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'authorizableId' is set
    if (authorizableId == nil) {
        NSParameterAssert(authorizableId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorizableId"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/{intermediatePath}/{authorizableId}/keystore/store.p12"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (intermediatePath != nil) {
        pathParams[@"intermediatePath"] = intermediatePath;
    }
    if (authorizableId != nil) {
        pathParams[@"authorizableId"] = authorizableId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/octet-stream"]];
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
                              responseType: @"NSURL*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSURL*)data, error);
                                }
                            }];
}

///
/// 
/// 
///  @param path  
///
///  @param name  
///
///  @returns void
///
-(NSURLSessionTask*) getNodeWithPath: (NSString*) path
    name: (NSString*) name
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'path' is set
    if (path == nil) {
        NSParameterAssert(path);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"path"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/{path}/{name}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (path != nil) {
        pathParams[@"path"] = path;
    }
    if (name != nil) {
        pathParams[@"name"] = name;
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
///  @param group  
///
///  @param name  
///
///  @param version  
///
///  @returns NSURL*
///
-(NSURLSessionTask*) getPackageWithGroup: (NSString*) group
    name: (NSString*) name
    version: (NSString*) version
    completionHandler: (void (^)(NSURL* output, NSError* error)) handler {
    // verify the required parameter 'group' is set
    if (group == nil) {
        NSParameterAssert(group);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"group"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'version' is set
    if (version == nil) {
        NSParameterAssert(version);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"version"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/etc/packages/{group}/{name}-{version}.zip"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (group != nil) {
        pathParams[@"group"] = group;
    }
    if (name != nil) {
        pathParams[@"name"] = name;
    }
    if (version != nil) {
        pathParams[@"version"] = version;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/octet-stream"]];
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
                              responseType: @"NSURL*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSURL*)data, error);
                                }
                            }];
}

///
/// 
/// 
///  @param group  
///
///  @param name  
///
///  @param version  
///
///  @returns NSString*
///
-(NSURLSessionTask*) getPackageFilterWithGroup: (NSString*) group
    name: (NSString*) name
    version: (NSString*) version
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'group' is set
    if (group == nil) {
        NSParameterAssert(group);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"group"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'version' is set
    if (version == nil) {
        NSParameterAssert(version);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"version"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (group != nil) {
        pathParams[@"group"] = group;
    }
    if (name != nil) {
        pathParams[@"name"] = name;
    }
    if (version != nil) {
        pathParams[@"version"] = version;
    }

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
///  @param path  
///
///  @param pLimit  
///
///  @param _1property  
///
///  @param _1propertyValue  
///
///  @returns NSString*
///
-(NSURLSessionTask*) getQueryWithPath: (NSString*) path
    pLimit: (NSNumber*) pLimit
    _1property: (NSString*) _1property
    _1propertyValue: (NSString*) _1propertyValue
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'path' is set
    if (path == nil) {
        NSParameterAssert(path);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"path"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'pLimit' is set
    if (pLimit == nil) {
        NSParameterAssert(pLimit);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pLimit"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter '_1property' is set
    if (_1property == nil) {
        NSParameterAssert(_1property);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"_1property"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter '_1propertyValue' is set
    if (_1propertyValue == nil) {
        NSParameterAssert(_1propertyValue);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"_1propertyValue"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/bin/querybuilder.json"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (path != nil) {
        queryParams[@"path"] = path;
    }
    if (pLimit != nil) {
        queryParams[@"p.limit"] = pLimit;
    }
    if (_1property != nil) {
        queryParams[@"1_property"] = _1property;
    }
    if (_1propertyValue != nil) {
        queryParams[@"1_property.value"] = _1propertyValue;
    }
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
///  @returns NSURL*
///
-(NSURLSessionTask*) getTruststoreWithCompletionHandler: 
    (void (^)(NSURL* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/etc/truststore/truststore.p12"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/octet-stream"]];
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
                              responseType: @"NSURL*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSURL*)data, error);
                                }
                            }];
}

///
/// 
/// 
///  @returns OAITruststoreInfo*
///
-(NSURLSessionTask*) getTruststoreInfoWithCompletionHandler: 
    (void (^)(OAITruststoreInfo* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/libs/granite/security/truststore.json"];

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
                              responseType: @"OAITruststoreInfo*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAITruststoreInfo*)data, error);
                                }
                            }];
}

///
/// 
/// 
///  @param runmode  
///
///  @param name  
///
///  @param jcrcontentCqdistribute  (optional)
///
///  @param jcrcontentCqdistributeTypeHint  (optional)
///
///  @param jcrcontentCqname  (optional)
///
///  @param jcrcontentCqtemplate  (optional)
///
///  @param jcrcontentEnabled  (optional)
///
///  @param jcrcontentJcrdescription  (optional)
///
///  @param jcrcontentJcrlastModified  (optional)
///
///  @param jcrcontentJcrlastModifiedBy  (optional)
///
///  @param jcrcontentJcrmixinTypes  (optional)
///
///  @param jcrcontentJcrtitle  (optional)
///
///  @param jcrcontentLogLevel  (optional)
///
///  @param jcrcontentNoStatusUpdate  (optional)
///
///  @param jcrcontentNoVersioning  (optional)
///
///  @param jcrcontentProtocolConnectTimeout  (optional)
///
///  @param jcrcontentProtocolHTTPConnectionClosed  (optional)
///
///  @param jcrcontentProtocolHTTPExpired  (optional)
///
///  @param jcrcontentProtocolHTTPHeaders  (optional)
///
///  @param jcrcontentProtocolHTTPHeadersTypeHint  (optional)
///
///  @param jcrcontentProtocolHTTPMethod  (optional)
///
///  @param jcrcontentProtocolHTTPSRelaxed  (optional)
///
///  @param jcrcontentProtocolInterface  (optional)
///
///  @param jcrcontentProtocolSocketTimeout  (optional)
///
///  @param jcrcontentProtocolVersion  (optional)
///
///  @param jcrcontentProxyNTLMDomain  (optional)
///
///  @param jcrcontentProxyNTLMHost  (optional)
///
///  @param jcrcontentProxyHost  (optional)
///
///  @param jcrcontentProxyPassword  (optional)
///
///  @param jcrcontentProxyPort  (optional)
///
///  @param jcrcontentProxyUser  (optional)
///
///  @param jcrcontentQueueBatchMaxSize  (optional)
///
///  @param jcrcontentQueueBatchMode  (optional)
///
///  @param jcrcontentQueueBatchWaitTime  (optional)
///
///  @param jcrcontentRetryDelay  (optional)
///
///  @param jcrcontentReverseReplication  (optional)
///
///  @param jcrcontentSerializationType  (optional)
///
///  @param jcrcontentSlingresourceType  (optional)
///
///  @param jcrcontentSsl  (optional)
///
///  @param jcrcontentTransportNTLMDomain  (optional)
///
///  @param jcrcontentTransportNTLMHost  (optional)
///
///  @param jcrcontentTransportPassword  (optional)
///
///  @param jcrcontentTransportUri  (optional)
///
///  @param jcrcontentTransportUser  (optional)
///
///  @param jcrcontentTriggerDistribute  (optional)
///
///  @param jcrcontentTriggerModified  (optional)
///
///  @param jcrcontentTriggerOnOffTime  (optional)
///
///  @param jcrcontentTriggerReceive  (optional)
///
///  @param jcrcontentTriggerSpecific  (optional)
///
///  @param jcrcontentUserId  (optional)
///
///  @param jcrprimaryType  (optional)
///
///  @param operation  (optional)
///
///  @returns void
///
-(NSURLSessionTask*) postAgentWithRunmode: (NSString*) runmode
    name: (NSString*) name
    jcrcontentCqdistribute: (NSNumber*) jcrcontentCqdistribute
    jcrcontentCqdistributeTypeHint: (NSString*) jcrcontentCqdistributeTypeHint
    jcrcontentCqname: (NSString*) jcrcontentCqname
    jcrcontentCqtemplate: (NSString*) jcrcontentCqtemplate
    jcrcontentEnabled: (NSNumber*) jcrcontentEnabled
    jcrcontentJcrdescription: (NSString*) jcrcontentJcrdescription
    jcrcontentJcrlastModified: (NSString*) jcrcontentJcrlastModified
    jcrcontentJcrlastModifiedBy: (NSString*) jcrcontentJcrlastModifiedBy
    jcrcontentJcrmixinTypes: (NSString*) jcrcontentJcrmixinTypes
    jcrcontentJcrtitle: (NSString*) jcrcontentJcrtitle
    jcrcontentLogLevel: (NSString*) jcrcontentLogLevel
    jcrcontentNoStatusUpdate: (NSNumber*) jcrcontentNoStatusUpdate
    jcrcontentNoVersioning: (NSNumber*) jcrcontentNoVersioning
    jcrcontentProtocolConnectTimeout: (NSNumber*) jcrcontentProtocolConnectTimeout
    jcrcontentProtocolHTTPConnectionClosed: (NSNumber*) jcrcontentProtocolHTTPConnectionClosed
    jcrcontentProtocolHTTPExpired: (NSString*) jcrcontentProtocolHTTPExpired
    jcrcontentProtocolHTTPHeaders: (NSArray<NSString*>*) jcrcontentProtocolHTTPHeaders
    jcrcontentProtocolHTTPHeadersTypeHint: (NSString*) jcrcontentProtocolHTTPHeadersTypeHint
    jcrcontentProtocolHTTPMethod: (NSString*) jcrcontentProtocolHTTPMethod
    jcrcontentProtocolHTTPSRelaxed: (NSNumber*) jcrcontentProtocolHTTPSRelaxed
    jcrcontentProtocolInterface: (NSString*) jcrcontentProtocolInterface
    jcrcontentProtocolSocketTimeout: (NSNumber*) jcrcontentProtocolSocketTimeout
    jcrcontentProtocolVersion: (NSString*) jcrcontentProtocolVersion
    jcrcontentProxyNTLMDomain: (NSString*) jcrcontentProxyNTLMDomain
    jcrcontentProxyNTLMHost: (NSString*) jcrcontentProxyNTLMHost
    jcrcontentProxyHost: (NSString*) jcrcontentProxyHost
    jcrcontentProxyPassword: (NSString*) jcrcontentProxyPassword
    jcrcontentProxyPort: (NSNumber*) jcrcontentProxyPort
    jcrcontentProxyUser: (NSString*) jcrcontentProxyUser
    jcrcontentQueueBatchMaxSize: (NSNumber*) jcrcontentQueueBatchMaxSize
    jcrcontentQueueBatchMode: (NSString*) jcrcontentQueueBatchMode
    jcrcontentQueueBatchWaitTime: (NSNumber*) jcrcontentQueueBatchWaitTime
    jcrcontentRetryDelay: (NSString*) jcrcontentRetryDelay
    jcrcontentReverseReplication: (NSNumber*) jcrcontentReverseReplication
    jcrcontentSerializationType: (NSString*) jcrcontentSerializationType
    jcrcontentSlingresourceType: (NSString*) jcrcontentSlingresourceType
    jcrcontentSsl: (NSString*) jcrcontentSsl
    jcrcontentTransportNTLMDomain: (NSString*) jcrcontentTransportNTLMDomain
    jcrcontentTransportNTLMHost: (NSString*) jcrcontentTransportNTLMHost
    jcrcontentTransportPassword: (NSString*) jcrcontentTransportPassword
    jcrcontentTransportUri: (NSString*) jcrcontentTransportUri
    jcrcontentTransportUser: (NSString*) jcrcontentTransportUser
    jcrcontentTriggerDistribute: (NSNumber*) jcrcontentTriggerDistribute
    jcrcontentTriggerModified: (NSNumber*) jcrcontentTriggerModified
    jcrcontentTriggerOnOffTime: (NSNumber*) jcrcontentTriggerOnOffTime
    jcrcontentTriggerReceive: (NSNumber*) jcrcontentTriggerReceive
    jcrcontentTriggerSpecific: (NSNumber*) jcrcontentTriggerSpecific
    jcrcontentUserId: (NSString*) jcrcontentUserId
    jcrprimaryType: (NSString*) jcrprimaryType
    operation: (NSString*) operation
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'runmode' is set
    if (runmode == nil) {
        NSParameterAssert(runmode);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"runmode"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/etc/replication/agents.{runmode}/{name}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (runmode != nil) {
        pathParams[@"runmode"] = runmode;
    }
    if (name != nil) {
        pathParams[@"name"] = name;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (jcrcontentCqdistribute != nil) {
        queryParams[@"jcr:content/cq:distribute"] = [jcrcontentCqdistribute isEqual:@(YES)] ? @"true" : @"false";
    }
    if (jcrcontentCqdistributeTypeHint != nil) {
        queryParams[@"jcr:content/cq:distribute@TypeHint"] = jcrcontentCqdistributeTypeHint;
    }
    if (jcrcontentCqname != nil) {
        queryParams[@"jcr:content/cq:name"] = jcrcontentCqname;
    }
    if (jcrcontentCqtemplate != nil) {
        queryParams[@"jcr:content/cq:template"] = jcrcontentCqtemplate;
    }
    if (jcrcontentEnabled != nil) {
        queryParams[@"jcr:content/enabled"] = [jcrcontentEnabled isEqual:@(YES)] ? @"true" : @"false";
    }
    if (jcrcontentJcrdescription != nil) {
        queryParams[@"jcr:content/jcr:description"] = jcrcontentJcrdescription;
    }
    if (jcrcontentJcrlastModified != nil) {
        queryParams[@"jcr:content/jcr:lastModified"] = jcrcontentJcrlastModified;
    }
    if (jcrcontentJcrlastModifiedBy != nil) {
        queryParams[@"jcr:content/jcr:lastModifiedBy"] = jcrcontentJcrlastModifiedBy;
    }
    if (jcrcontentJcrmixinTypes != nil) {
        queryParams[@"jcr:content/jcr:mixinTypes"] = jcrcontentJcrmixinTypes;
    }
    if (jcrcontentJcrtitle != nil) {
        queryParams[@"jcr:content/jcr:title"] = jcrcontentJcrtitle;
    }
    if (jcrcontentLogLevel != nil) {
        queryParams[@"jcr:content/logLevel"] = jcrcontentLogLevel;
    }
    if (jcrcontentNoStatusUpdate != nil) {
        queryParams[@"jcr:content/noStatusUpdate"] = [jcrcontentNoStatusUpdate isEqual:@(YES)] ? @"true" : @"false";
    }
    if (jcrcontentNoVersioning != nil) {
        queryParams[@"jcr:content/noVersioning"] = [jcrcontentNoVersioning isEqual:@(YES)] ? @"true" : @"false";
    }
    if (jcrcontentProtocolConnectTimeout != nil) {
        queryParams[@"jcr:content/protocolConnectTimeout"] = jcrcontentProtocolConnectTimeout;
    }
    if (jcrcontentProtocolHTTPConnectionClosed != nil) {
        queryParams[@"jcr:content/protocolHTTPConnectionClosed"] = [jcrcontentProtocolHTTPConnectionClosed isEqual:@(YES)] ? @"true" : @"false";
    }
    if (jcrcontentProtocolHTTPExpired != nil) {
        queryParams[@"jcr:content/protocolHTTPExpired"] = jcrcontentProtocolHTTPExpired;
    }
    if (jcrcontentProtocolHTTPHeaders != nil) {
        queryParams[@"jcr:content/protocolHTTPHeaders"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: jcrcontentProtocolHTTPHeaders format: @"multi"];
    }
    if (jcrcontentProtocolHTTPHeadersTypeHint != nil) {
        queryParams[@"jcr:content/protocolHTTPHeaders@TypeHint"] = jcrcontentProtocolHTTPHeadersTypeHint;
    }
    if (jcrcontentProtocolHTTPMethod != nil) {
        queryParams[@"jcr:content/protocolHTTPMethod"] = jcrcontentProtocolHTTPMethod;
    }
    if (jcrcontentProtocolHTTPSRelaxed != nil) {
        queryParams[@"jcr:content/protocolHTTPSRelaxed"] = [jcrcontentProtocolHTTPSRelaxed isEqual:@(YES)] ? @"true" : @"false";
    }
    if (jcrcontentProtocolInterface != nil) {
        queryParams[@"jcr:content/protocolInterface"] = jcrcontentProtocolInterface;
    }
    if (jcrcontentProtocolSocketTimeout != nil) {
        queryParams[@"jcr:content/protocolSocketTimeout"] = jcrcontentProtocolSocketTimeout;
    }
    if (jcrcontentProtocolVersion != nil) {
        queryParams[@"jcr:content/protocolVersion"] = jcrcontentProtocolVersion;
    }
    if (jcrcontentProxyNTLMDomain != nil) {
        queryParams[@"jcr:content/proxyNTLMDomain"] = jcrcontentProxyNTLMDomain;
    }
    if (jcrcontentProxyNTLMHost != nil) {
        queryParams[@"jcr:content/proxyNTLMHost"] = jcrcontentProxyNTLMHost;
    }
    if (jcrcontentProxyHost != nil) {
        queryParams[@"jcr:content/proxyHost"] = jcrcontentProxyHost;
    }
    if (jcrcontentProxyPassword != nil) {
        queryParams[@"jcr:content/proxyPassword"] = jcrcontentProxyPassword;
    }
    if (jcrcontentProxyPort != nil) {
        queryParams[@"jcr:content/proxyPort"] = jcrcontentProxyPort;
    }
    if (jcrcontentProxyUser != nil) {
        queryParams[@"jcr:content/proxyUser"] = jcrcontentProxyUser;
    }
    if (jcrcontentQueueBatchMaxSize != nil) {
        queryParams[@"jcr:content/queueBatchMaxSize"] = jcrcontentQueueBatchMaxSize;
    }
    if (jcrcontentQueueBatchMode != nil) {
        queryParams[@"jcr:content/queueBatchMode"] = jcrcontentQueueBatchMode;
    }
    if (jcrcontentQueueBatchWaitTime != nil) {
        queryParams[@"jcr:content/queueBatchWaitTime"] = jcrcontentQueueBatchWaitTime;
    }
    if (jcrcontentRetryDelay != nil) {
        queryParams[@"jcr:content/retryDelay"] = jcrcontentRetryDelay;
    }
    if (jcrcontentReverseReplication != nil) {
        queryParams[@"jcr:content/reverseReplication"] = [jcrcontentReverseReplication isEqual:@(YES)] ? @"true" : @"false";
    }
    if (jcrcontentSerializationType != nil) {
        queryParams[@"jcr:content/serializationType"] = jcrcontentSerializationType;
    }
    if (jcrcontentSlingresourceType != nil) {
        queryParams[@"jcr:content/sling:resourceType"] = jcrcontentSlingresourceType;
    }
    if (jcrcontentSsl != nil) {
        queryParams[@"jcr:content/ssl"] = jcrcontentSsl;
    }
    if (jcrcontentTransportNTLMDomain != nil) {
        queryParams[@"jcr:content/transportNTLMDomain"] = jcrcontentTransportNTLMDomain;
    }
    if (jcrcontentTransportNTLMHost != nil) {
        queryParams[@"jcr:content/transportNTLMHost"] = jcrcontentTransportNTLMHost;
    }
    if (jcrcontentTransportPassword != nil) {
        queryParams[@"jcr:content/transportPassword"] = jcrcontentTransportPassword;
    }
    if (jcrcontentTransportUri != nil) {
        queryParams[@"jcr:content/transportUri"] = jcrcontentTransportUri;
    }
    if (jcrcontentTransportUser != nil) {
        queryParams[@"jcr:content/transportUser"] = jcrcontentTransportUser;
    }
    if (jcrcontentTriggerDistribute != nil) {
        queryParams[@"jcr:content/triggerDistribute"] = [jcrcontentTriggerDistribute isEqual:@(YES)] ? @"true" : @"false";
    }
    if (jcrcontentTriggerModified != nil) {
        queryParams[@"jcr:content/triggerModified"] = [jcrcontentTriggerModified isEqual:@(YES)] ? @"true" : @"false";
    }
    if (jcrcontentTriggerOnOffTime != nil) {
        queryParams[@"jcr:content/triggerOnOffTime"] = [jcrcontentTriggerOnOffTime isEqual:@(YES)] ? @"true" : @"false";
    }
    if (jcrcontentTriggerReceive != nil) {
        queryParams[@"jcr:content/triggerReceive"] = [jcrcontentTriggerReceive isEqual:@(YES)] ? @"true" : @"false";
    }
    if (jcrcontentTriggerSpecific != nil) {
        queryParams[@"jcr:content/triggerSpecific"] = [jcrcontentTriggerSpecific isEqual:@(YES)] ? @"true" : @"false";
    }
    if (jcrcontentUserId != nil) {
        queryParams[@"jcr:content/userId"] = jcrcontentUserId;
    }
    if (jcrprimaryType != nil) {
        queryParams[@"jcr:primaryType"] = jcrprimaryType;
    }
    if (operation != nil) {
        queryParams[@":operation"] = operation;
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
///  @param intermediatePath  
///
///  @param authorizableId  
///
///  @param operation  (optional)
///
///  @param currentPassword  (optional)
///
///  @param varNewPassword  (optional)
///
///  @param rePassword  (optional)
///
///  @param keyPassword  (optional)
///
///  @param keyStorePass  (optional)
///
///  @param alias  (optional)
///
///  @param varNewAlias  (optional)
///
///  @param removeAlias  (optional)
///
///  @param certChain  (optional)
///
///  @param pk  (optional)
///
///  @param keyStore  (optional)
///
///  @returns OAIKeystoreInfo*
///
-(NSURLSessionTask*) postAuthorizableKeystoreWithIntermediatePath: (NSString*) intermediatePath
    authorizableId: (NSString*) authorizableId
    operation: (NSString*) operation
    currentPassword: (NSString*) currentPassword
    varNewPassword: (NSString*) varNewPassword
    rePassword: (NSString*) rePassword
    keyPassword: (NSString*) keyPassword
    keyStorePass: (NSString*) keyStorePass
    alias: (NSString*) alias
    varNewAlias: (NSString*) varNewAlias
    removeAlias: (NSString*) removeAlias
    certChain: (NSURL*) certChain
    pk: (NSURL*) pk
    keyStore: (NSURL*) keyStore
    completionHandler: (void (^)(OAIKeystoreInfo* output, NSError* error)) handler {
    // verify the required parameter 'intermediatePath' is set
    if (intermediatePath == nil) {
        NSParameterAssert(intermediatePath);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"intermediatePath"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'authorizableId' is set
    if (authorizableId == nil) {
        NSParameterAssert(authorizableId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorizableId"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/{intermediatePath}/{authorizableId}.ks.html"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (intermediatePath != nil) {
        pathParams[@"intermediatePath"] = intermediatePath;
    }
    if (authorizableId != nil) {
        pathParams[@"authorizableId"] = authorizableId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (operation != nil) {
        queryParams[@":operation"] = operation;
    }
    if (currentPassword != nil) {
        queryParams[@"currentPassword"] = currentPassword;
    }
    if (varNewPassword != nil) {
        queryParams[@"newPassword"] = varNewPassword;
    }
    if (rePassword != nil) {
        queryParams[@"rePassword"] = rePassword;
    }
    if (keyPassword != nil) {
        queryParams[@"keyPassword"] = keyPassword;
    }
    if (keyStorePass != nil) {
        queryParams[@"keyStorePass"] = keyStorePass;
    }
    if (alias != nil) {
        queryParams[@"alias"] = alias;
    }
    if (varNewAlias != nil) {
        queryParams[@"newAlias"] = varNewAlias;
    }
    if (removeAlias != nil) {
        queryParams[@"removeAlias"] = removeAlias;
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
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[@"aemAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    localVarFiles[@"certChain"] = certChain;
    localVarFiles[@"pk"] = pk;
    localVarFiles[@"keyStore"] = keyStore;

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
                              responseType: @"OAIKeystoreInfo*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIKeystoreInfo*)data, error);
                                }
                            }];
}

///
/// 
/// 
///  @param authorizableId  
///
///  @param intermediatePath  
///
///  @param createUser  (optional)
///
///  @param createGroup  (optional)
///
///  @param reppassword  (optional)
///
///  @param profileGivenName  (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) postAuthorizablesWithAuthorizableId: (NSString*) authorizableId
    intermediatePath: (NSString*) intermediatePath
    createUser: (NSString*) createUser
    createGroup: (NSString*) createGroup
    reppassword: (NSString*) reppassword
    profileGivenName: (NSString*) profileGivenName
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'authorizableId' is set
    if (authorizableId == nil) {
        NSParameterAssert(authorizableId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"authorizableId"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'intermediatePath' is set
    if (intermediatePath == nil) {
        NSParameterAssert(intermediatePath);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"intermediatePath"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/libs/granite/security/post/authorizables"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (authorizableId != nil) {
        queryParams[@"authorizableId"] = authorizableId;
    }
    if (intermediatePath != nil) {
        queryParams[@"intermediatePath"] = intermediatePath;
    }
    if (createUser != nil) {
        queryParams[@"createUser"] = createUser;
    }
    if (createGroup != nil) {
        queryParams[@"createGroup"] = createGroup;
    }
    if (reppassword != nil) {
        queryParams[@"rep:password"] = reppassword;
    }
    if (profileGivenName != nil) {
        queryParams[@"profile/givenName"] = profileGivenName;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"text/html"]];
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
///  @param keyStorePassword  (optional)
///
///  @param keyStorePasswordTypeHint  (optional)
///
///  @param serviceRanking  (optional)
///
///  @param serviceRankingTypeHint  (optional)
///
///  @param idpHttpRedirect  (optional)
///
///  @param idpHttpRedirectTypeHint  (optional)
///
///  @param createUser  (optional)
///
///  @param createUserTypeHint  (optional)
///
///  @param defaultRedirectUrl  (optional)
///
///  @param defaultRedirectUrlTypeHint  (optional)
///
///  @param userIDAttribute  (optional)
///
///  @param userIDAttributeTypeHint  (optional)
///
///  @param defaultGroups  (optional)
///
///  @param defaultGroupsTypeHint  (optional)
///
///  @param idpCertAlias  (optional)
///
///  @param idpCertAliasTypeHint  (optional)
///
///  @param addGroupMemberships  (optional)
///
///  @param addGroupMembershipsTypeHint  (optional)
///
///  @param path  (optional)
///
///  @param pathTypeHint  (optional)
///
///  @param synchronizeAttributes  (optional)
///
///  @param synchronizeAttributesTypeHint  (optional)
///
///  @param clockTolerance  (optional)
///
///  @param clockToleranceTypeHint  (optional)
///
///  @param groupMembershipAttribute  (optional)
///
///  @param groupMembershipAttributeTypeHint  (optional)
///
///  @param idpUrl  (optional)
///
///  @param idpUrlTypeHint  (optional)
///
///  @param logoutUrl  (optional)
///
///  @param logoutUrlTypeHint  (optional)
///
///  @param serviceProviderEntityId  (optional)
///
///  @param serviceProviderEntityIdTypeHint  (optional)
///
///  @param assertionConsumerServiceURL  (optional)
///
///  @param assertionConsumerServiceURLTypeHint  (optional)
///
///  @param handleLogout  (optional)
///
///  @param handleLogoutTypeHint  (optional)
///
///  @param spPrivateKeyAlias  (optional)
///
///  @param spPrivateKeyAliasTypeHint  (optional)
///
///  @param useEncryption  (optional)
///
///  @param useEncryptionTypeHint  (optional)
///
///  @param nameIdFormat  (optional)
///
///  @param nameIdFormatTypeHint  (optional)
///
///  @param digestMethod  (optional)
///
///  @param digestMethodTypeHint  (optional)
///
///  @param signatureMethod  (optional)
///
///  @param signatureMethodTypeHint  (optional)
///
///  @param userIntermediatePath  (optional)
///
///  @param userIntermediatePathTypeHint  (optional)
///
///  @returns void
///
-(NSURLSessionTask*) postConfigAdobeGraniteSamlAuthenticationHandlerWithKeyStorePassword: (NSString*) keyStorePassword
    keyStorePasswordTypeHint: (NSString*) keyStorePasswordTypeHint
    serviceRanking: (NSNumber*) serviceRanking
    serviceRankingTypeHint: (NSString*) serviceRankingTypeHint
    idpHttpRedirect: (NSNumber*) idpHttpRedirect
    idpHttpRedirectTypeHint: (NSString*) idpHttpRedirectTypeHint
    createUser: (NSNumber*) createUser
    createUserTypeHint: (NSString*) createUserTypeHint
    defaultRedirectUrl: (NSString*) defaultRedirectUrl
    defaultRedirectUrlTypeHint: (NSString*) defaultRedirectUrlTypeHint
    userIDAttribute: (NSString*) userIDAttribute
    userIDAttributeTypeHint: (NSString*) userIDAttributeTypeHint
    defaultGroups: (NSArray<NSString*>*) defaultGroups
    defaultGroupsTypeHint: (NSString*) defaultGroupsTypeHint
    idpCertAlias: (NSString*) idpCertAlias
    idpCertAliasTypeHint: (NSString*) idpCertAliasTypeHint
    addGroupMemberships: (NSNumber*) addGroupMemberships
    addGroupMembershipsTypeHint: (NSString*) addGroupMembershipsTypeHint
    path: (NSArray<NSString*>*) path
    pathTypeHint: (NSString*) pathTypeHint
    synchronizeAttributes: (NSArray<NSString*>*) synchronizeAttributes
    synchronizeAttributesTypeHint: (NSString*) synchronizeAttributesTypeHint
    clockTolerance: (NSNumber*) clockTolerance
    clockToleranceTypeHint: (NSString*) clockToleranceTypeHint
    groupMembershipAttribute: (NSString*) groupMembershipAttribute
    groupMembershipAttributeTypeHint: (NSString*) groupMembershipAttributeTypeHint
    idpUrl: (NSString*) idpUrl
    idpUrlTypeHint: (NSString*) idpUrlTypeHint
    logoutUrl: (NSString*) logoutUrl
    logoutUrlTypeHint: (NSString*) logoutUrlTypeHint
    serviceProviderEntityId: (NSString*) serviceProviderEntityId
    serviceProviderEntityIdTypeHint: (NSString*) serviceProviderEntityIdTypeHint
    assertionConsumerServiceURL: (NSString*) assertionConsumerServiceURL
    assertionConsumerServiceURLTypeHint: (NSString*) assertionConsumerServiceURLTypeHint
    handleLogout: (NSNumber*) handleLogout
    handleLogoutTypeHint: (NSString*) handleLogoutTypeHint
    spPrivateKeyAlias: (NSString*) spPrivateKeyAlias
    spPrivateKeyAliasTypeHint: (NSString*) spPrivateKeyAliasTypeHint
    useEncryption: (NSNumber*) useEncryption
    useEncryptionTypeHint: (NSString*) useEncryptionTypeHint
    nameIdFormat: (NSString*) nameIdFormat
    nameIdFormatTypeHint: (NSString*) nameIdFormatTypeHint
    digestMethod: (NSString*) digestMethod
    digestMethodTypeHint: (NSString*) digestMethodTypeHint
    signatureMethod: (NSString*) signatureMethod
    signatureMethodTypeHint: (NSString*) signatureMethodTypeHint
    userIntermediatePath: (NSString*) userIntermediatePath
    userIntermediatePathTypeHint: (NSString*) userIntermediatePathTypeHint
    completionHandler: (void (^)(NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (keyStorePassword != nil) {
        queryParams[@"keyStorePassword"] = keyStorePassword;
    }
    if (keyStorePasswordTypeHint != nil) {
        queryParams[@"keyStorePassword@TypeHint"] = keyStorePasswordTypeHint;
    }
    if (serviceRanking != nil) {
        queryParams[@"service.ranking"] = serviceRanking;
    }
    if (serviceRankingTypeHint != nil) {
        queryParams[@"service.ranking@TypeHint"] = serviceRankingTypeHint;
    }
    if (idpHttpRedirect != nil) {
        queryParams[@"idpHttpRedirect"] = [idpHttpRedirect isEqual:@(YES)] ? @"true" : @"false";
    }
    if (idpHttpRedirectTypeHint != nil) {
        queryParams[@"idpHttpRedirect@TypeHint"] = idpHttpRedirectTypeHint;
    }
    if (createUser != nil) {
        queryParams[@"createUser"] = [createUser isEqual:@(YES)] ? @"true" : @"false";
    }
    if (createUserTypeHint != nil) {
        queryParams[@"createUser@TypeHint"] = createUserTypeHint;
    }
    if (defaultRedirectUrl != nil) {
        queryParams[@"defaultRedirectUrl"] = defaultRedirectUrl;
    }
    if (defaultRedirectUrlTypeHint != nil) {
        queryParams[@"defaultRedirectUrl@TypeHint"] = defaultRedirectUrlTypeHint;
    }
    if (userIDAttribute != nil) {
        queryParams[@"userIDAttribute"] = userIDAttribute;
    }
    if (userIDAttributeTypeHint != nil) {
        queryParams[@"userIDAttribute@TypeHint"] = userIDAttributeTypeHint;
    }
    if (defaultGroups != nil) {
        queryParams[@"defaultGroups"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: defaultGroups format: @"multi"];
    }
    if (defaultGroupsTypeHint != nil) {
        queryParams[@"defaultGroups@TypeHint"] = defaultGroupsTypeHint;
    }
    if (idpCertAlias != nil) {
        queryParams[@"idpCertAlias"] = idpCertAlias;
    }
    if (idpCertAliasTypeHint != nil) {
        queryParams[@"idpCertAlias@TypeHint"] = idpCertAliasTypeHint;
    }
    if (addGroupMemberships != nil) {
        queryParams[@"addGroupMemberships"] = [addGroupMemberships isEqual:@(YES)] ? @"true" : @"false";
    }
    if (addGroupMembershipsTypeHint != nil) {
        queryParams[@"addGroupMemberships@TypeHint"] = addGroupMembershipsTypeHint;
    }
    if (path != nil) {
        queryParams[@"path"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: path format: @"multi"];
    }
    if (pathTypeHint != nil) {
        queryParams[@"path@TypeHint"] = pathTypeHint;
    }
    if (synchronizeAttributes != nil) {
        queryParams[@"synchronizeAttributes"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: synchronizeAttributes format: @"multi"];
    }
    if (synchronizeAttributesTypeHint != nil) {
        queryParams[@"synchronizeAttributes@TypeHint"] = synchronizeAttributesTypeHint;
    }
    if (clockTolerance != nil) {
        queryParams[@"clockTolerance"] = clockTolerance;
    }
    if (clockToleranceTypeHint != nil) {
        queryParams[@"clockTolerance@TypeHint"] = clockToleranceTypeHint;
    }
    if (groupMembershipAttribute != nil) {
        queryParams[@"groupMembershipAttribute"] = groupMembershipAttribute;
    }
    if (groupMembershipAttributeTypeHint != nil) {
        queryParams[@"groupMembershipAttribute@TypeHint"] = groupMembershipAttributeTypeHint;
    }
    if (idpUrl != nil) {
        queryParams[@"idpUrl"] = idpUrl;
    }
    if (idpUrlTypeHint != nil) {
        queryParams[@"idpUrl@TypeHint"] = idpUrlTypeHint;
    }
    if (logoutUrl != nil) {
        queryParams[@"logoutUrl"] = logoutUrl;
    }
    if (logoutUrlTypeHint != nil) {
        queryParams[@"logoutUrl@TypeHint"] = logoutUrlTypeHint;
    }
    if (serviceProviderEntityId != nil) {
        queryParams[@"serviceProviderEntityId"] = serviceProviderEntityId;
    }
    if (serviceProviderEntityIdTypeHint != nil) {
        queryParams[@"serviceProviderEntityId@TypeHint"] = serviceProviderEntityIdTypeHint;
    }
    if (assertionConsumerServiceURL != nil) {
        queryParams[@"assertionConsumerServiceURL"] = assertionConsumerServiceURL;
    }
    if (assertionConsumerServiceURLTypeHint != nil) {
        queryParams[@"assertionConsumerServiceURL@TypeHint"] = assertionConsumerServiceURLTypeHint;
    }
    if (handleLogout != nil) {
        queryParams[@"handleLogout"] = [handleLogout isEqual:@(YES)] ? @"true" : @"false";
    }
    if (handleLogoutTypeHint != nil) {
        queryParams[@"handleLogout@TypeHint"] = handleLogoutTypeHint;
    }
    if (spPrivateKeyAlias != nil) {
        queryParams[@"spPrivateKeyAlias"] = spPrivateKeyAlias;
    }
    if (spPrivateKeyAliasTypeHint != nil) {
        queryParams[@"spPrivateKeyAlias@TypeHint"] = spPrivateKeyAliasTypeHint;
    }
    if (useEncryption != nil) {
        queryParams[@"useEncryption"] = [useEncryption isEqual:@(YES)] ? @"true" : @"false";
    }
    if (useEncryptionTypeHint != nil) {
        queryParams[@"useEncryption@TypeHint"] = useEncryptionTypeHint;
    }
    if (nameIdFormat != nil) {
        queryParams[@"nameIdFormat"] = nameIdFormat;
    }
    if (nameIdFormatTypeHint != nil) {
        queryParams[@"nameIdFormat@TypeHint"] = nameIdFormatTypeHint;
    }
    if (digestMethod != nil) {
        queryParams[@"digestMethod"] = digestMethod;
    }
    if (digestMethodTypeHint != nil) {
        queryParams[@"digestMethod@TypeHint"] = digestMethodTypeHint;
    }
    if (signatureMethod != nil) {
        queryParams[@"signatureMethod"] = signatureMethod;
    }
    if (signatureMethodTypeHint != nil) {
        queryParams[@"signatureMethod@TypeHint"] = signatureMethodTypeHint;
    }
    if (userIntermediatePath != nil) {
        queryParams[@"userIntermediatePath"] = userIntermediatePath;
    }
    if (userIntermediatePathTypeHint != nil) {
        queryParams[@"userIntermediatePath@TypeHint"] = userIntermediatePathTypeHint;
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
///  @param orgApacheFelixHttpsNio  (optional)
///
///  @param orgApacheFelixHttpsNioTypeHint  (optional)
///
///  @param orgApacheFelixHttpsKeystore  (optional)
///
///  @param orgApacheFelixHttpsKeystoreTypeHint  (optional)
///
///  @param orgApacheFelixHttpsKeystorePassword  (optional)
///
///  @param orgApacheFelixHttpsKeystorePasswordTypeHint  (optional)
///
///  @param orgApacheFelixHttpsKeystoreKey  (optional)
///
///  @param orgApacheFelixHttpsKeystoreKeyTypeHint  (optional)
///
///  @param orgApacheFelixHttpsKeystoreKeyPassword  (optional)
///
///  @param orgApacheFelixHttpsKeystoreKeyPasswordTypeHint  (optional)
///
///  @param orgApacheFelixHttpsTruststore  (optional)
///
///  @param orgApacheFelixHttpsTruststoreTypeHint  (optional)
///
///  @param orgApacheFelixHttpsTruststorePassword  (optional)
///
///  @param orgApacheFelixHttpsTruststorePasswordTypeHint  (optional)
///
///  @param orgApacheFelixHttpsClientcertificate  (optional)
///
///  @param orgApacheFelixHttpsClientcertificateTypeHint  (optional)
///
///  @param orgApacheFelixHttpsEnable  (optional)
///
///  @param orgApacheFelixHttpsEnableTypeHint  (optional)
///
///  @param orgOsgiServiceHttpPortSecure  (optional)
///
///  @param orgOsgiServiceHttpPortSecureTypeHint  (optional)
///
///  @returns void
///
-(NSURLSessionTask*) postConfigApacheFelixJettyBasedHttpServiceWithOrgApacheFelixHttpsNio: (NSNumber*) orgApacheFelixHttpsNio
    orgApacheFelixHttpsNioTypeHint: (NSString*) orgApacheFelixHttpsNioTypeHint
    orgApacheFelixHttpsKeystore: (NSString*) orgApacheFelixHttpsKeystore
    orgApacheFelixHttpsKeystoreTypeHint: (NSString*) orgApacheFelixHttpsKeystoreTypeHint
    orgApacheFelixHttpsKeystorePassword: (NSString*) orgApacheFelixHttpsKeystorePassword
    orgApacheFelixHttpsKeystorePasswordTypeHint: (NSString*) orgApacheFelixHttpsKeystorePasswordTypeHint
    orgApacheFelixHttpsKeystoreKey: (NSString*) orgApacheFelixHttpsKeystoreKey
    orgApacheFelixHttpsKeystoreKeyTypeHint: (NSString*) orgApacheFelixHttpsKeystoreKeyTypeHint
    orgApacheFelixHttpsKeystoreKeyPassword: (NSString*) orgApacheFelixHttpsKeystoreKeyPassword
    orgApacheFelixHttpsKeystoreKeyPasswordTypeHint: (NSString*) orgApacheFelixHttpsKeystoreKeyPasswordTypeHint
    orgApacheFelixHttpsTruststore: (NSString*) orgApacheFelixHttpsTruststore
    orgApacheFelixHttpsTruststoreTypeHint: (NSString*) orgApacheFelixHttpsTruststoreTypeHint
    orgApacheFelixHttpsTruststorePassword: (NSString*) orgApacheFelixHttpsTruststorePassword
    orgApacheFelixHttpsTruststorePasswordTypeHint: (NSString*) orgApacheFelixHttpsTruststorePasswordTypeHint
    orgApacheFelixHttpsClientcertificate: (NSString*) orgApacheFelixHttpsClientcertificate
    orgApacheFelixHttpsClientcertificateTypeHint: (NSString*) orgApacheFelixHttpsClientcertificateTypeHint
    orgApacheFelixHttpsEnable: (NSNumber*) orgApacheFelixHttpsEnable
    orgApacheFelixHttpsEnableTypeHint: (NSString*) orgApacheFelixHttpsEnableTypeHint
    orgOsgiServiceHttpPortSecure: (NSString*) orgOsgiServiceHttpPortSecure
    orgOsgiServiceHttpPortSecureTypeHint: (NSString*) orgOsgiServiceHttpPortSecureTypeHint
    completionHandler: (void (^)(NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apps/system/config/org.apache.felix.http"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (orgApacheFelixHttpsNio != nil) {
        queryParams[@"org.apache.felix.https.nio"] = [orgApacheFelixHttpsNio isEqual:@(YES)] ? @"true" : @"false";
    }
    if (orgApacheFelixHttpsNioTypeHint != nil) {
        queryParams[@"org.apache.felix.https.nio@TypeHint"] = orgApacheFelixHttpsNioTypeHint;
    }
    if (orgApacheFelixHttpsKeystore != nil) {
        queryParams[@"org.apache.felix.https.keystore"] = orgApacheFelixHttpsKeystore;
    }
    if (orgApacheFelixHttpsKeystoreTypeHint != nil) {
        queryParams[@"org.apache.felix.https.keystore@TypeHint"] = orgApacheFelixHttpsKeystoreTypeHint;
    }
    if (orgApacheFelixHttpsKeystorePassword != nil) {
        queryParams[@"org.apache.felix.https.keystore.password"] = orgApacheFelixHttpsKeystorePassword;
    }
    if (orgApacheFelixHttpsKeystorePasswordTypeHint != nil) {
        queryParams[@"org.apache.felix.https.keystore.password@TypeHint"] = orgApacheFelixHttpsKeystorePasswordTypeHint;
    }
    if (orgApacheFelixHttpsKeystoreKey != nil) {
        queryParams[@"org.apache.felix.https.keystore.key"] = orgApacheFelixHttpsKeystoreKey;
    }
    if (orgApacheFelixHttpsKeystoreKeyTypeHint != nil) {
        queryParams[@"org.apache.felix.https.keystore.key@TypeHint"] = orgApacheFelixHttpsKeystoreKeyTypeHint;
    }
    if (orgApacheFelixHttpsKeystoreKeyPassword != nil) {
        queryParams[@"org.apache.felix.https.keystore.key.password"] = orgApacheFelixHttpsKeystoreKeyPassword;
    }
    if (orgApacheFelixHttpsKeystoreKeyPasswordTypeHint != nil) {
        queryParams[@"org.apache.felix.https.keystore.key.password@TypeHint"] = orgApacheFelixHttpsKeystoreKeyPasswordTypeHint;
    }
    if (orgApacheFelixHttpsTruststore != nil) {
        queryParams[@"org.apache.felix.https.truststore"] = orgApacheFelixHttpsTruststore;
    }
    if (orgApacheFelixHttpsTruststoreTypeHint != nil) {
        queryParams[@"org.apache.felix.https.truststore@TypeHint"] = orgApacheFelixHttpsTruststoreTypeHint;
    }
    if (orgApacheFelixHttpsTruststorePassword != nil) {
        queryParams[@"org.apache.felix.https.truststore.password"] = orgApacheFelixHttpsTruststorePassword;
    }
    if (orgApacheFelixHttpsTruststorePasswordTypeHint != nil) {
        queryParams[@"org.apache.felix.https.truststore.password@TypeHint"] = orgApacheFelixHttpsTruststorePasswordTypeHint;
    }
    if (orgApacheFelixHttpsClientcertificate != nil) {
        queryParams[@"org.apache.felix.https.clientcertificate"] = orgApacheFelixHttpsClientcertificate;
    }
    if (orgApacheFelixHttpsClientcertificateTypeHint != nil) {
        queryParams[@"org.apache.felix.https.clientcertificate@TypeHint"] = orgApacheFelixHttpsClientcertificateTypeHint;
    }
    if (orgApacheFelixHttpsEnable != nil) {
        queryParams[@"org.apache.felix.https.enable"] = [orgApacheFelixHttpsEnable isEqual:@(YES)] ? @"true" : @"false";
    }
    if (orgApacheFelixHttpsEnableTypeHint != nil) {
        queryParams[@"org.apache.felix.https.enable@TypeHint"] = orgApacheFelixHttpsEnableTypeHint;
    }
    if (orgOsgiServiceHttpPortSecure != nil) {
        queryParams[@"org.osgi.service.http.port.secure"] = orgOsgiServiceHttpPortSecure;
    }
    if (orgOsgiServiceHttpPortSecureTypeHint != nil) {
        queryParams[@"org.osgi.service.http.port.secure@TypeHint"] = orgOsgiServiceHttpPortSecureTypeHint;
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
///  @param proxyHost  (optional)
///
///  @param proxyHostTypeHint  (optional)
///
///  @param proxyPort  (optional)
///
///  @param proxyPortTypeHint  (optional)
///
///  @param proxyExceptions  (optional)
///
///  @param proxyExceptionsTypeHint  (optional)
///
///  @param proxyEnabled  (optional)
///
///  @param proxyEnabledTypeHint  (optional)
///
///  @param proxyUser  (optional)
///
///  @param proxyUserTypeHint  (optional)
///
///  @param proxyPassword  (optional)
///
///  @param proxyPasswordTypeHint  (optional)
///
///  @returns void
///
-(NSURLSessionTask*) postConfigApacheHttpComponentsProxyConfigurationWithProxyHost: (NSString*) proxyHost
    proxyHostTypeHint: (NSString*) proxyHostTypeHint
    proxyPort: (NSNumber*) proxyPort
    proxyPortTypeHint: (NSString*) proxyPortTypeHint
    proxyExceptions: (NSArray<NSString*>*) proxyExceptions
    proxyExceptionsTypeHint: (NSString*) proxyExceptionsTypeHint
    proxyEnabled: (NSNumber*) proxyEnabled
    proxyEnabledTypeHint: (NSString*) proxyEnabledTypeHint
    proxyUser: (NSString*) proxyUser
    proxyUserTypeHint: (NSString*) proxyUserTypeHint
    proxyPassword: (NSString*) proxyPassword
    proxyPasswordTypeHint: (NSString*) proxyPasswordTypeHint
    completionHandler: (void (^)(NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apps/system/config/org.apache.http.proxyconfigurator.config"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (proxyHost != nil) {
        queryParams[@"proxy.host"] = proxyHost;
    }
    if (proxyHostTypeHint != nil) {
        queryParams[@"proxy.host@TypeHint"] = proxyHostTypeHint;
    }
    if (proxyPort != nil) {
        queryParams[@"proxy.port"] = proxyPort;
    }
    if (proxyPortTypeHint != nil) {
        queryParams[@"proxy.port@TypeHint"] = proxyPortTypeHint;
    }
    if (proxyExceptions != nil) {
        queryParams[@"proxy.exceptions"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: proxyExceptions format: @"multi"];
    }
    if (proxyExceptionsTypeHint != nil) {
        queryParams[@"proxy.exceptions@TypeHint"] = proxyExceptionsTypeHint;
    }
    if (proxyEnabled != nil) {
        queryParams[@"proxy.enabled"] = [proxyEnabled isEqual:@(YES)] ? @"true" : @"false";
    }
    if (proxyEnabledTypeHint != nil) {
        queryParams[@"proxy.enabled@TypeHint"] = proxyEnabledTypeHint;
    }
    if (proxyUser != nil) {
        queryParams[@"proxy.user"] = proxyUser;
    }
    if (proxyUserTypeHint != nil) {
        queryParams[@"proxy.user@TypeHint"] = proxyUserTypeHint;
    }
    if (proxyPassword != nil) {
        queryParams[@"proxy.password"] = proxyPassword;
    }
    if (proxyPasswordTypeHint != nil) {
        queryParams[@"proxy.password@TypeHint"] = proxyPasswordTypeHint;
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
///  @param alias  (optional)
///
///  @param aliasTypeHint  (optional)
///
///  @param davCreateAbsoluteUri  (optional)
///
///  @param davCreateAbsoluteUriTypeHint  (optional)
///
///  @returns void
///
-(NSURLSessionTask*) postConfigApacheSlingDavExServletWithAlias: (NSString*) alias
    aliasTypeHint: (NSString*) aliasTypeHint
    davCreateAbsoluteUri: (NSNumber*) davCreateAbsoluteUri
    davCreateAbsoluteUriTypeHint: (NSString*) davCreateAbsoluteUriTypeHint
    completionHandler: (void (^)(NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (alias != nil) {
        queryParams[@"alias"] = alias;
    }
    if (aliasTypeHint != nil) {
        queryParams[@"alias@TypeHint"] = aliasTypeHint;
    }
    if (davCreateAbsoluteUri != nil) {
        queryParams[@"dav.create-absolute-uri"] = [davCreateAbsoluteUri isEqual:@(YES)] ? @"true" : @"false";
    }
    if (davCreateAbsoluteUriTypeHint != nil) {
        queryParams[@"dav.create-absolute-uri@TypeHint"] = davCreateAbsoluteUriTypeHint;
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
///  @param jsonMaximumresults  (optional)
///
///  @param jsonMaximumresultsTypeHint  (optional)
///
///  @param enableHtml  (optional)
///
///  @param enableHtmlTypeHint  (optional)
///
///  @param enableTxt  (optional)
///
///  @param enableTxtTypeHint  (optional)
///
///  @param enableXml  (optional)
///
///  @param enableXmlTypeHint  (optional)
///
///  @returns void
///
-(NSURLSessionTask*) postConfigApacheSlingGetServletWithJsonMaximumresults: (NSString*) jsonMaximumresults
    jsonMaximumresultsTypeHint: (NSString*) jsonMaximumresultsTypeHint
    enableHtml: (NSNumber*) enableHtml
    enableHtmlTypeHint: (NSString*) enableHtmlTypeHint
    enableTxt: (NSNumber*) enableTxt
    enableTxtTypeHint: (NSString*) enableTxtTypeHint
    enableXml: (NSNumber*) enableXml
    enableXmlTypeHint: (NSString*) enableXmlTypeHint
    completionHandler: (void (^)(NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (jsonMaximumresults != nil) {
        queryParams[@"json.maximumresults"] = jsonMaximumresults;
    }
    if (jsonMaximumresultsTypeHint != nil) {
        queryParams[@"json.maximumresults@TypeHint"] = jsonMaximumresultsTypeHint;
    }
    if (enableHtml != nil) {
        queryParams[@"enable.html"] = [enableHtml isEqual:@(YES)] ? @"true" : @"false";
    }
    if (enableHtmlTypeHint != nil) {
        queryParams[@"enable.html@TypeHint"] = enableHtmlTypeHint;
    }
    if (enableTxt != nil) {
        queryParams[@"enable.txt"] = [enableTxt isEqual:@(YES)] ? @"true" : @"false";
    }
    if (enableTxtTypeHint != nil) {
        queryParams[@"enable.txt@TypeHint"] = enableTxtTypeHint;
    }
    if (enableXml != nil) {
        queryParams[@"enable.xml"] = [enableXml isEqual:@(YES)] ? @"true" : @"false";
    }
    if (enableXmlTypeHint != nil) {
        queryParams[@"enable.xml@TypeHint"] = enableXmlTypeHint;
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
///  @param allowEmpty  (optional)
///
///  @param allowEmptyTypeHint  (optional)
///
///  @param allowHosts  (optional)
///
///  @param allowHostsTypeHint  (optional)
///
///  @param allowHostsRegexp  (optional)
///
///  @param allowHostsRegexpTypeHint  (optional)
///
///  @param filterMethods  (optional)
///
///  @param filterMethodsTypeHint  (optional)
///
///  @returns void
///
-(NSURLSessionTask*) postConfigApacheSlingReferrerFilterWithAllowEmpty: (NSNumber*) allowEmpty
    allowEmptyTypeHint: (NSString*) allowEmptyTypeHint
    allowHosts: (NSString*) allowHosts
    allowHostsTypeHint: (NSString*) allowHostsTypeHint
    allowHostsRegexp: (NSString*) allowHostsRegexp
    allowHostsRegexpTypeHint: (NSString*) allowHostsRegexpTypeHint
    filterMethods: (NSString*) filterMethods
    filterMethodsTypeHint: (NSString*) filterMethodsTypeHint
    completionHandler: (void (^)(NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apps/system/config/org.apache.sling.security.impl.ReferrerFilter"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (allowEmpty != nil) {
        queryParams[@"allow.empty"] = [allowEmpty isEqual:@(YES)] ? @"true" : @"false";
    }
    if (allowEmptyTypeHint != nil) {
        queryParams[@"allow.empty@TypeHint"] = allowEmptyTypeHint;
    }
    if (allowHosts != nil) {
        queryParams[@"allow.hosts"] = allowHosts;
    }
    if (allowHostsTypeHint != nil) {
        queryParams[@"allow.hosts@TypeHint"] = allowHostsTypeHint;
    }
    if (allowHostsRegexp != nil) {
        queryParams[@"allow.hosts.regexp"] = allowHostsRegexp;
    }
    if (allowHostsRegexpTypeHint != nil) {
        queryParams[@"allow.hosts.regexp@TypeHint"] = allowHostsRegexpTypeHint;
    }
    if (filterMethods != nil) {
        queryParams[@"filter.methods"] = filterMethods;
    }
    if (filterMethodsTypeHint != nil) {
        queryParams[@"filter.methods@TypeHint"] = filterMethodsTypeHint;
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
///  @param configNodeName  
///
///  @returns void
///
-(NSURLSessionTask*) postConfigPropertyWithConfigNodeName: (NSString*) configNodeName
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'configNodeName' is set
    if (configNodeName == nil) {
        NSParameterAssert(configNodeName);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"configNodeName"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apps/system/config/{configNodeName}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (configNodeName != nil) {
        pathParams[@"configNodeName"] = configNodeName;
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
///  @param path  
///
///  @param name  
///
///  @param operation  (optional)
///
///  @param deleteAuthorizable  (optional)
///
///  @param file  (optional)
///
///  @returns void
///
-(NSURLSessionTask*) postNodeWithPath: (NSString*) path
    name: (NSString*) name
    operation: (NSString*) operation
    deleteAuthorizable: (NSString*) deleteAuthorizable
    file: (NSURL*) file
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'path' is set
    if (path == nil) {
        NSParameterAssert(path);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"path"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/{path}/{name}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (path != nil) {
        pathParams[@"path"] = path;
    }
    if (name != nil) {
        pathParams[@"name"] = name;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (operation != nil) {
        queryParams[@":operation"] = operation;
    }
    if (deleteAuthorizable != nil) {
        queryParams[@"deleteAuthorizable"] = deleteAuthorizable;
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
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[@"aemAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    localVarFiles[@"file"] = file;

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
///  @param path  
///
///  @param name  
///
///  @param addMembers  (optional)
///
///  @returns void
///
-(NSURLSessionTask*) postNodeRwWithPath: (NSString*) path
    name: (NSString*) name
    addMembers: (NSString*) addMembers
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'path' is set
    if (path == nil) {
        NSParameterAssert(path);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"path"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/{path}/{name}.rw.html"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (path != nil) {
        pathParams[@"path"] = path;
    }
    if (name != nil) {
        pathParams[@"name"] = name;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (addMembers != nil) {
        queryParams[@"addMembers"] = addMembers;
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
///  @param path  
///
///  @param jcrprimaryType  
///
///  @param name  
///
///  @returns void
///
-(NSURLSessionTask*) postPathWithPath: (NSString*) path
    jcrprimaryType: (NSString*) jcrprimaryType
    name: (NSString*) name
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'path' is set
    if (path == nil) {
        NSParameterAssert(path);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"path"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'jcrprimaryType' is set
    if (jcrprimaryType == nil) {
        NSParameterAssert(jcrprimaryType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"jcrprimaryType"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/{path}/"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (path != nil) {
        pathParams[@"path"] = path;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (jcrprimaryType != nil) {
        queryParams[@"jcr:primaryType"] = jcrprimaryType;
    }
    if (name != nil) {
        queryParams[@":name"] = name;
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
///  @param path  
///
///  @param pLimit  
///
///  @param _1property  
///
///  @param _1propertyValue  
///
///  @returns NSString*
///
-(NSURLSessionTask*) postQueryWithPath: (NSString*) path
    pLimit: (NSNumber*) pLimit
    _1property: (NSString*) _1property
    _1propertyValue: (NSString*) _1propertyValue
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'path' is set
    if (path == nil) {
        NSParameterAssert(path);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"path"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'pLimit' is set
    if (pLimit == nil) {
        NSParameterAssert(pLimit);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pLimit"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter '_1property' is set
    if (_1property == nil) {
        NSParameterAssert(_1property);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"_1property"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter '_1propertyValue' is set
    if (_1propertyValue == nil) {
        NSParameterAssert(_1propertyValue);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"_1propertyValue"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/bin/querybuilder.json"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (path != nil) {
        queryParams[@"path"] = path;
    }
    if (pLimit != nil) {
        queryParams[@"p.limit"] = pLimit;
    }
    if (_1property != nil) {
        queryParams[@"1_property"] = _1property;
    }
    if (_1propertyValue != nil) {
        queryParams[@"1_property.value"] = _1propertyValue;
    }
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
///  @param ignoredeactivated  
///
///  @param onlymodified  
///
///  @param path  
///
///  @returns void
///
-(NSURLSessionTask*) postTreeActivationWithIgnoredeactivated: (NSNumber*) ignoredeactivated
    onlymodified: (NSNumber*) onlymodified
    path: (NSString*) path
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'ignoredeactivated' is set
    if (ignoredeactivated == nil) {
        NSParameterAssert(ignoredeactivated);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"ignoredeactivated"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'onlymodified' is set
    if (onlymodified == nil) {
        NSParameterAssert(onlymodified);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"onlymodified"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'path' is set
    if (path == nil) {
        NSParameterAssert(path);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"path"] };
            NSError* error = [NSError errorWithDomain:kOAISlingApiErrorDomain code:kOAISlingApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/etc/replication/treeactivation.html"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (ignoredeactivated != nil) {
        queryParams[@"ignoredeactivated"] = [ignoredeactivated isEqual:@(YES)] ? @"true" : @"false";
    }
    if (onlymodified != nil) {
        queryParams[@"onlymodified"] = [onlymodified isEqual:@(YES)] ? @"true" : @"false";
    }
    if (path != nil) {
        queryParams[@"path"] = path;
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
///  @param operation  (optional)
///
///  @param varNewPassword  (optional)
///
///  @param rePassword  (optional)
///
///  @param keyStoreType  (optional)
///
///  @param removeAlias  (optional)
///
///  @param certificate  (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) postTruststoreWithOperation: (NSString*) operation
    varNewPassword: (NSString*) varNewPassword
    rePassword: (NSString*) rePassword
    keyStoreType: (NSString*) keyStoreType
    removeAlias: (NSString*) removeAlias
    certificate: (NSURL*) certificate
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/libs/granite/security/post/truststore"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (operation != nil) {
        queryParams[@":operation"] = operation;
    }
    if (varNewPassword != nil) {
        queryParams[@"newPassword"] = varNewPassword;
    }
    if (rePassword != nil) {
        queryParams[@"rePassword"] = rePassword;
    }
    if (keyStoreType != nil) {
        queryParams[@"keyStoreType"] = keyStoreType;
    }
    if (removeAlias != nil) {
        queryParams[@"removeAlias"] = removeAlias;
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
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[@"aemAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    localVarFiles[@"certificate"] = certificate;

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
///  @param truststoreP12  (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) postTruststorePKCS12WithTruststoreP12: (NSURL*) truststoreP12
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/etc/truststore"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[@"aemAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    localVarFiles[@"truststoreP12"] = truststoreP12;

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
                              responseType: @"NSString*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSString*)data, error);
                                }
                            }];
}



@end
