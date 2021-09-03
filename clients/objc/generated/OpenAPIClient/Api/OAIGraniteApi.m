#import "OAIGraniteApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"


@interface OAIGraniteApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIGraniteApi

NSString* kOAIGraniteApiErrorDomain = @"OAIGraniteApiErrorDomain";
NSInteger kOAIGraniteApiMissingParamErrorCode = 234513;

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
///  @param keystorePassword  
///
///  @param keystorePasswordConfirm  
///
///  @param truststorePassword  
///
///  @param truststorePasswordConfirm  
///
///  @param httpsHostname  
///
///  @param httpsPort  
///
///  @param privatekeyFile  (optional)
///
///  @param certificateFile  (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) sslSetupWithKeystorePassword: (NSString*) keystorePassword
    keystorePasswordConfirm: (NSString*) keystorePasswordConfirm
    truststorePassword: (NSString*) truststorePassword
    truststorePasswordConfirm: (NSString*) truststorePasswordConfirm
    httpsHostname: (NSString*) httpsHostname
    httpsPort: (NSString*) httpsPort
    privatekeyFile: (NSURL*) privatekeyFile
    certificateFile: (NSURL*) certificateFile
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'keystorePassword' is set
    if (keystorePassword == nil) {
        NSParameterAssert(keystorePassword);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"keystorePassword"] };
            NSError* error = [NSError errorWithDomain:kOAIGraniteApiErrorDomain code:kOAIGraniteApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'keystorePasswordConfirm' is set
    if (keystorePasswordConfirm == nil) {
        NSParameterAssert(keystorePasswordConfirm);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"keystorePasswordConfirm"] };
            NSError* error = [NSError errorWithDomain:kOAIGraniteApiErrorDomain code:kOAIGraniteApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'truststorePassword' is set
    if (truststorePassword == nil) {
        NSParameterAssert(truststorePassword);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"truststorePassword"] };
            NSError* error = [NSError errorWithDomain:kOAIGraniteApiErrorDomain code:kOAIGraniteApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'truststorePasswordConfirm' is set
    if (truststorePasswordConfirm == nil) {
        NSParameterAssert(truststorePasswordConfirm);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"truststorePasswordConfirm"] };
            NSError* error = [NSError errorWithDomain:kOAIGraniteApiErrorDomain code:kOAIGraniteApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'httpsHostname' is set
    if (httpsHostname == nil) {
        NSParameterAssert(httpsHostname);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"httpsHostname"] };
            NSError* error = [NSError errorWithDomain:kOAIGraniteApiErrorDomain code:kOAIGraniteApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'httpsPort' is set
    if (httpsPort == nil) {
        NSParameterAssert(httpsPort);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"httpsPort"] };
            NSError* error = [NSError errorWithDomain:kOAIGraniteApiErrorDomain code:kOAIGraniteApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/libs/granite/security/post/sslSetup.html"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (keystorePassword != nil) {
        queryParams[@"keystorePassword"] = keystorePassword;
    }
    if (keystorePasswordConfirm != nil) {
        queryParams[@"keystorePasswordConfirm"] = keystorePasswordConfirm;
    }
    if (truststorePassword != nil) {
        queryParams[@"truststorePassword"] = truststorePassword;
    }
    if (truststorePasswordConfirm != nil) {
        queryParams[@"truststorePasswordConfirm"] = truststorePasswordConfirm;
    }
    if (httpsHostname != nil) {
        queryParams[@"httpsHostname"] = httpsHostname;
    }
    if (httpsPort != nil) {
        queryParams[@"httpsPort"] = httpsPort;
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
    localVarFiles[@"privatekeyFile"] = privatekeyFile;
    localVarFiles[@"certificateFile"] = certificateFile;

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
