#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SamlConfigurationProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SamlConfigurationProperties::SamlConfigurationProperties()
{
	//__init();
}

SamlConfigurationProperties::~SamlConfigurationProperties()
{
	//__cleanup();
}

void
SamlConfigurationProperties::__init()
{
	//path = new SamlConfigurationPropertyItemsArray();
	//serviceranking = new SamlConfigurationPropertyItemsLong();
	//idpUrl = new SamlConfigurationPropertyItemsString();
	//idpCertAlias = new SamlConfigurationPropertyItemsString();
	//idpHttpRedirect = new SamlConfigurationPropertyItemsBoolean();
	//serviceProviderEntityId = new SamlConfigurationPropertyItemsString();
	//assertionConsumerServiceURL = new SamlConfigurationPropertyItemsString();
	//spPrivateKeyAlias = new SamlConfigurationPropertyItemsString();
	//keyStorePassword = new SamlConfigurationPropertyItemsString();
	//defaultRedirectUrl = new SamlConfigurationPropertyItemsString();
	//userIDAttribute = new SamlConfigurationPropertyItemsString();
	//useEncryption = new SamlConfigurationPropertyItemsBoolean();
	//createUser = new SamlConfigurationPropertyItemsBoolean();
	//addGroupMemberships = new SamlConfigurationPropertyItemsBoolean();
	//groupMembershipAttribute = new SamlConfigurationPropertyItemsString();
	//defaultGroups = new SamlConfigurationPropertyItemsArray();
	//nameIdFormat = new SamlConfigurationPropertyItemsString();
	//synchronizeAttributes = new SamlConfigurationPropertyItemsArray();
	//handleLogout = new SamlConfigurationPropertyItemsBoolean();
	//logoutUrl = new SamlConfigurationPropertyItemsString();
	//clockTolerance = new SamlConfigurationPropertyItemsLong();
	//digestMethod = new SamlConfigurationPropertyItemsString();
	//signatureMethod = new SamlConfigurationPropertyItemsString();
	//userIntermediatePath = new SamlConfigurationPropertyItemsString();
}

void
SamlConfigurationProperties::__cleanup()
{
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//if(idpUrl != NULL) {
	//
	//delete idpUrl;
	//idpUrl = NULL;
	//}
	//if(idpCertAlias != NULL) {
	//
	//delete idpCertAlias;
	//idpCertAlias = NULL;
	//}
	//if(idpHttpRedirect != NULL) {
	//
	//delete idpHttpRedirect;
	//idpHttpRedirect = NULL;
	//}
	//if(serviceProviderEntityId != NULL) {
	//
	//delete serviceProviderEntityId;
	//serviceProviderEntityId = NULL;
	//}
	//if(assertionConsumerServiceURL != NULL) {
	//
	//delete assertionConsumerServiceURL;
	//assertionConsumerServiceURL = NULL;
	//}
	//if(spPrivateKeyAlias != NULL) {
	//
	//delete spPrivateKeyAlias;
	//spPrivateKeyAlias = NULL;
	//}
	//if(keyStorePassword != NULL) {
	//
	//delete keyStorePassword;
	//keyStorePassword = NULL;
	//}
	//if(defaultRedirectUrl != NULL) {
	//
	//delete defaultRedirectUrl;
	//defaultRedirectUrl = NULL;
	//}
	//if(userIDAttribute != NULL) {
	//
	//delete userIDAttribute;
	//userIDAttribute = NULL;
	//}
	//if(useEncryption != NULL) {
	//
	//delete useEncryption;
	//useEncryption = NULL;
	//}
	//if(createUser != NULL) {
	//
	//delete createUser;
	//createUser = NULL;
	//}
	//if(addGroupMemberships != NULL) {
	//
	//delete addGroupMemberships;
	//addGroupMemberships = NULL;
	//}
	//if(groupMembershipAttribute != NULL) {
	//
	//delete groupMembershipAttribute;
	//groupMembershipAttribute = NULL;
	//}
	//if(defaultGroups != NULL) {
	//
	//delete defaultGroups;
	//defaultGroups = NULL;
	//}
	//if(nameIdFormat != NULL) {
	//
	//delete nameIdFormat;
	//nameIdFormat = NULL;
	//}
	//if(synchronizeAttributes != NULL) {
	//
	//delete synchronizeAttributes;
	//synchronizeAttributes = NULL;
	//}
	//if(handleLogout != NULL) {
	//
	//delete handleLogout;
	//handleLogout = NULL;
	//}
	//if(logoutUrl != NULL) {
	//
	//delete logoutUrl;
	//logoutUrl = NULL;
	//}
	//if(clockTolerance != NULL) {
	//
	//delete clockTolerance;
	//clockTolerance = NULL;
	//}
	//if(digestMethod != NULL) {
	//
	//delete digestMethod;
	//digestMethod = NULL;
	//}
	//if(signatureMethod != NULL) {
	//
	//delete signatureMethod;
	//signatureMethod = NULL;
	//}
	//if(userIntermediatePath != NULL) {
	//
	//delete userIntermediatePath;
	//userIntermediatePath = NULL;
	//}
	//
}

void
SamlConfigurationProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pathKey = "path";
	node = json_object_get_member(pJsonObject, pathKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsArray")) {
			jsonToValue(&path, node, "SamlConfigurationPropertyItemsArray", "SamlConfigurationPropertyItemsArray");
		} else {
			
			SamlConfigurationPropertyItemsArray* obj = static_cast<SamlConfigurationPropertyItemsArray*> (&path);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servicerankingKey = "service.ranking";
	node = json_object_get_member(pJsonObject, servicerankingKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsLong")) {
			jsonToValue(&serviceranking, node, "SamlConfigurationPropertyItemsLong", "SamlConfigurationPropertyItemsLong");
		} else {
			
			SamlConfigurationPropertyItemsLong* obj = static_cast<SamlConfigurationPropertyItemsLong*> (&serviceranking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idpUrlKey = "idpUrl";
	node = json_object_get_member(pJsonObject, idpUrlKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsString")) {
			jsonToValue(&idpUrl, node, "SamlConfigurationPropertyItemsString", "SamlConfigurationPropertyItemsString");
		} else {
			
			SamlConfigurationPropertyItemsString* obj = static_cast<SamlConfigurationPropertyItemsString*> (&idpUrl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idpCertAliasKey = "idpCertAlias";
	node = json_object_get_member(pJsonObject, idpCertAliasKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsString")) {
			jsonToValue(&idpCertAlias, node, "SamlConfigurationPropertyItemsString", "SamlConfigurationPropertyItemsString");
		} else {
			
			SamlConfigurationPropertyItemsString* obj = static_cast<SamlConfigurationPropertyItemsString*> (&idpCertAlias);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idpHttpRedirectKey = "idpHttpRedirect";
	node = json_object_get_member(pJsonObject, idpHttpRedirectKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsBoolean")) {
			jsonToValue(&idpHttpRedirect, node, "SamlConfigurationPropertyItemsBoolean", "SamlConfigurationPropertyItemsBoolean");
		} else {
			
			SamlConfigurationPropertyItemsBoolean* obj = static_cast<SamlConfigurationPropertyItemsBoolean*> (&idpHttpRedirect);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *serviceProviderEntityIdKey = "serviceProviderEntityId";
	node = json_object_get_member(pJsonObject, serviceProviderEntityIdKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsString")) {
			jsonToValue(&serviceProviderEntityId, node, "SamlConfigurationPropertyItemsString", "SamlConfigurationPropertyItemsString");
		} else {
			
			SamlConfigurationPropertyItemsString* obj = static_cast<SamlConfigurationPropertyItemsString*> (&serviceProviderEntityId);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *assertionConsumerServiceURLKey = "assertionConsumerServiceURL";
	node = json_object_get_member(pJsonObject, assertionConsumerServiceURLKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsString")) {
			jsonToValue(&assertionConsumerServiceURL, node, "SamlConfigurationPropertyItemsString", "SamlConfigurationPropertyItemsString");
		} else {
			
			SamlConfigurationPropertyItemsString* obj = static_cast<SamlConfigurationPropertyItemsString*> (&assertionConsumerServiceURL);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *spPrivateKeyAliasKey = "spPrivateKeyAlias";
	node = json_object_get_member(pJsonObject, spPrivateKeyAliasKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsString")) {
			jsonToValue(&spPrivateKeyAlias, node, "SamlConfigurationPropertyItemsString", "SamlConfigurationPropertyItemsString");
		} else {
			
			SamlConfigurationPropertyItemsString* obj = static_cast<SamlConfigurationPropertyItemsString*> (&spPrivateKeyAlias);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *keyStorePasswordKey = "keyStorePassword";
	node = json_object_get_member(pJsonObject, keyStorePasswordKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsString")) {
			jsonToValue(&keyStorePassword, node, "SamlConfigurationPropertyItemsString", "SamlConfigurationPropertyItemsString");
		} else {
			
			SamlConfigurationPropertyItemsString* obj = static_cast<SamlConfigurationPropertyItemsString*> (&keyStorePassword);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultRedirectUrlKey = "defaultRedirectUrl";
	node = json_object_get_member(pJsonObject, defaultRedirectUrlKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsString")) {
			jsonToValue(&defaultRedirectUrl, node, "SamlConfigurationPropertyItemsString", "SamlConfigurationPropertyItemsString");
		} else {
			
			SamlConfigurationPropertyItemsString* obj = static_cast<SamlConfigurationPropertyItemsString*> (&defaultRedirectUrl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userIDAttributeKey = "userIDAttribute";
	node = json_object_get_member(pJsonObject, userIDAttributeKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsString")) {
			jsonToValue(&userIDAttribute, node, "SamlConfigurationPropertyItemsString", "SamlConfigurationPropertyItemsString");
		} else {
			
			SamlConfigurationPropertyItemsString* obj = static_cast<SamlConfigurationPropertyItemsString*> (&userIDAttribute);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *useEncryptionKey = "useEncryption";
	node = json_object_get_member(pJsonObject, useEncryptionKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsBoolean")) {
			jsonToValue(&useEncryption, node, "SamlConfigurationPropertyItemsBoolean", "SamlConfigurationPropertyItemsBoolean");
		} else {
			
			SamlConfigurationPropertyItemsBoolean* obj = static_cast<SamlConfigurationPropertyItemsBoolean*> (&useEncryption);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *createUserKey = "createUser";
	node = json_object_get_member(pJsonObject, createUserKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsBoolean")) {
			jsonToValue(&createUser, node, "SamlConfigurationPropertyItemsBoolean", "SamlConfigurationPropertyItemsBoolean");
		} else {
			
			SamlConfigurationPropertyItemsBoolean* obj = static_cast<SamlConfigurationPropertyItemsBoolean*> (&createUser);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *addGroupMembershipsKey = "addGroupMemberships";
	node = json_object_get_member(pJsonObject, addGroupMembershipsKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsBoolean")) {
			jsonToValue(&addGroupMemberships, node, "SamlConfigurationPropertyItemsBoolean", "SamlConfigurationPropertyItemsBoolean");
		} else {
			
			SamlConfigurationPropertyItemsBoolean* obj = static_cast<SamlConfigurationPropertyItemsBoolean*> (&addGroupMemberships);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *groupMembershipAttributeKey = "groupMembershipAttribute";
	node = json_object_get_member(pJsonObject, groupMembershipAttributeKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsString")) {
			jsonToValue(&groupMembershipAttribute, node, "SamlConfigurationPropertyItemsString", "SamlConfigurationPropertyItemsString");
		} else {
			
			SamlConfigurationPropertyItemsString* obj = static_cast<SamlConfigurationPropertyItemsString*> (&groupMembershipAttribute);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultGroupsKey = "defaultGroups";
	node = json_object_get_member(pJsonObject, defaultGroupsKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsArray")) {
			jsonToValue(&defaultGroups, node, "SamlConfigurationPropertyItemsArray", "SamlConfigurationPropertyItemsArray");
		} else {
			
			SamlConfigurationPropertyItemsArray* obj = static_cast<SamlConfigurationPropertyItemsArray*> (&defaultGroups);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nameIdFormatKey = "nameIdFormat";
	node = json_object_get_member(pJsonObject, nameIdFormatKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsString")) {
			jsonToValue(&nameIdFormat, node, "SamlConfigurationPropertyItemsString", "SamlConfigurationPropertyItemsString");
		} else {
			
			SamlConfigurationPropertyItemsString* obj = static_cast<SamlConfigurationPropertyItemsString*> (&nameIdFormat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *synchronizeAttributesKey = "synchronizeAttributes";
	node = json_object_get_member(pJsonObject, synchronizeAttributesKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsArray")) {
			jsonToValue(&synchronizeAttributes, node, "SamlConfigurationPropertyItemsArray", "SamlConfigurationPropertyItemsArray");
		} else {
			
			SamlConfigurationPropertyItemsArray* obj = static_cast<SamlConfigurationPropertyItemsArray*> (&synchronizeAttributes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *handleLogoutKey = "handleLogout";
	node = json_object_get_member(pJsonObject, handleLogoutKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsBoolean")) {
			jsonToValue(&handleLogout, node, "SamlConfigurationPropertyItemsBoolean", "SamlConfigurationPropertyItemsBoolean");
		} else {
			
			SamlConfigurationPropertyItemsBoolean* obj = static_cast<SamlConfigurationPropertyItemsBoolean*> (&handleLogout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *logoutUrlKey = "logoutUrl";
	node = json_object_get_member(pJsonObject, logoutUrlKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsString")) {
			jsonToValue(&logoutUrl, node, "SamlConfigurationPropertyItemsString", "SamlConfigurationPropertyItemsString");
		} else {
			
			SamlConfigurationPropertyItemsString* obj = static_cast<SamlConfigurationPropertyItemsString*> (&logoutUrl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *clockToleranceKey = "clockTolerance";
	node = json_object_get_member(pJsonObject, clockToleranceKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsLong")) {
			jsonToValue(&clockTolerance, node, "SamlConfigurationPropertyItemsLong", "SamlConfigurationPropertyItemsLong");
		} else {
			
			SamlConfigurationPropertyItemsLong* obj = static_cast<SamlConfigurationPropertyItemsLong*> (&clockTolerance);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *digestMethodKey = "digestMethod";
	node = json_object_get_member(pJsonObject, digestMethodKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsString")) {
			jsonToValue(&digestMethod, node, "SamlConfigurationPropertyItemsString", "SamlConfigurationPropertyItemsString");
		} else {
			
			SamlConfigurationPropertyItemsString* obj = static_cast<SamlConfigurationPropertyItemsString*> (&digestMethod);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *signatureMethodKey = "signatureMethod";
	node = json_object_get_member(pJsonObject, signatureMethodKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsString")) {
			jsonToValue(&signatureMethod, node, "SamlConfigurationPropertyItemsString", "SamlConfigurationPropertyItemsString");
		} else {
			
			SamlConfigurationPropertyItemsString* obj = static_cast<SamlConfigurationPropertyItemsString*> (&signatureMethod);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userIntermediatePathKey = "userIntermediatePath";
	node = json_object_get_member(pJsonObject, userIntermediatePathKey);
	if (node !=NULL) {
	

		if (isprimitive("SamlConfigurationPropertyItemsString")) {
			jsonToValue(&userIntermediatePath, node, "SamlConfigurationPropertyItemsString", "SamlConfigurationPropertyItemsString");
		} else {
			
			SamlConfigurationPropertyItemsString* obj = static_cast<SamlConfigurationPropertyItemsString*> (&userIntermediatePath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

SamlConfigurationProperties::SamlConfigurationProperties(char* json)
{
	this->fromJson(json);
}

char*
SamlConfigurationProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("SamlConfigurationPropertyItemsArray")) {
		SamlConfigurationPropertyItemsArray obj = getPath();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsArray", "");
	}
	else {
		
		SamlConfigurationPropertyItemsArray obj = static_cast<SamlConfigurationPropertyItemsArray> (getPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathKey = "path";
	json_object_set_member(pJsonObject, pathKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsLong")) {
		SamlConfigurationPropertyItemsLong obj = getServiceranking();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsLong", "");
	}
	else {
		
		SamlConfigurationPropertyItemsLong obj = static_cast<SamlConfigurationPropertyItemsLong> (getServiceranking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicerankingKey = "service.ranking";
	json_object_set_member(pJsonObject, servicerankingKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsString")) {
		SamlConfigurationPropertyItemsString obj = getIdpUrl();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsString", "");
	}
	else {
		
		SamlConfigurationPropertyItemsString obj = static_cast<SamlConfigurationPropertyItemsString> (getIdpUrl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *idpUrlKey = "idpUrl";
	json_object_set_member(pJsonObject, idpUrlKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsString")) {
		SamlConfigurationPropertyItemsString obj = getIdpCertAlias();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsString", "");
	}
	else {
		
		SamlConfigurationPropertyItemsString obj = static_cast<SamlConfigurationPropertyItemsString> (getIdpCertAlias());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *idpCertAliasKey = "idpCertAlias";
	json_object_set_member(pJsonObject, idpCertAliasKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsBoolean")) {
		SamlConfigurationPropertyItemsBoolean obj = getIdpHttpRedirect();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsBoolean", "");
	}
	else {
		
		SamlConfigurationPropertyItemsBoolean obj = static_cast<SamlConfigurationPropertyItemsBoolean> (getIdpHttpRedirect());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *idpHttpRedirectKey = "idpHttpRedirect";
	json_object_set_member(pJsonObject, idpHttpRedirectKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsString")) {
		SamlConfigurationPropertyItemsString obj = getServiceProviderEntityId();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsString", "");
	}
	else {
		
		SamlConfigurationPropertyItemsString obj = static_cast<SamlConfigurationPropertyItemsString> (getServiceProviderEntityId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *serviceProviderEntityIdKey = "serviceProviderEntityId";
	json_object_set_member(pJsonObject, serviceProviderEntityIdKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsString")) {
		SamlConfigurationPropertyItemsString obj = getAssertionConsumerServiceURL();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsString", "");
	}
	else {
		
		SamlConfigurationPropertyItemsString obj = static_cast<SamlConfigurationPropertyItemsString> (getAssertionConsumerServiceURL());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *assertionConsumerServiceURLKey = "assertionConsumerServiceURL";
	json_object_set_member(pJsonObject, assertionConsumerServiceURLKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsString")) {
		SamlConfigurationPropertyItemsString obj = getSpPrivateKeyAlias();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsString", "");
	}
	else {
		
		SamlConfigurationPropertyItemsString obj = static_cast<SamlConfigurationPropertyItemsString> (getSpPrivateKeyAlias());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *spPrivateKeyAliasKey = "spPrivateKeyAlias";
	json_object_set_member(pJsonObject, spPrivateKeyAliasKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsString")) {
		SamlConfigurationPropertyItemsString obj = getKeyStorePassword();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsString", "");
	}
	else {
		
		SamlConfigurationPropertyItemsString obj = static_cast<SamlConfigurationPropertyItemsString> (getKeyStorePassword());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *keyStorePasswordKey = "keyStorePassword";
	json_object_set_member(pJsonObject, keyStorePasswordKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsString")) {
		SamlConfigurationPropertyItemsString obj = getDefaultRedirectUrl();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsString", "");
	}
	else {
		
		SamlConfigurationPropertyItemsString obj = static_cast<SamlConfigurationPropertyItemsString> (getDefaultRedirectUrl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultRedirectUrlKey = "defaultRedirectUrl";
	json_object_set_member(pJsonObject, defaultRedirectUrlKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsString")) {
		SamlConfigurationPropertyItemsString obj = getUserIDAttribute();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsString", "");
	}
	else {
		
		SamlConfigurationPropertyItemsString obj = static_cast<SamlConfigurationPropertyItemsString> (getUserIDAttribute());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userIDAttributeKey = "userIDAttribute";
	json_object_set_member(pJsonObject, userIDAttributeKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsBoolean")) {
		SamlConfigurationPropertyItemsBoolean obj = getUseEncryption();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsBoolean", "");
	}
	else {
		
		SamlConfigurationPropertyItemsBoolean obj = static_cast<SamlConfigurationPropertyItemsBoolean> (getUseEncryption());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *useEncryptionKey = "useEncryption";
	json_object_set_member(pJsonObject, useEncryptionKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsBoolean")) {
		SamlConfigurationPropertyItemsBoolean obj = getCreateUser();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsBoolean", "");
	}
	else {
		
		SamlConfigurationPropertyItemsBoolean obj = static_cast<SamlConfigurationPropertyItemsBoolean> (getCreateUser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *createUserKey = "createUser";
	json_object_set_member(pJsonObject, createUserKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsBoolean")) {
		SamlConfigurationPropertyItemsBoolean obj = getAddGroupMemberships();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsBoolean", "");
	}
	else {
		
		SamlConfigurationPropertyItemsBoolean obj = static_cast<SamlConfigurationPropertyItemsBoolean> (getAddGroupMemberships());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *addGroupMembershipsKey = "addGroupMemberships";
	json_object_set_member(pJsonObject, addGroupMembershipsKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsString")) {
		SamlConfigurationPropertyItemsString obj = getGroupMembershipAttribute();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsString", "");
	}
	else {
		
		SamlConfigurationPropertyItemsString obj = static_cast<SamlConfigurationPropertyItemsString> (getGroupMembershipAttribute());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *groupMembershipAttributeKey = "groupMembershipAttribute";
	json_object_set_member(pJsonObject, groupMembershipAttributeKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsArray")) {
		SamlConfigurationPropertyItemsArray obj = getDefaultGroups();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsArray", "");
	}
	else {
		
		SamlConfigurationPropertyItemsArray obj = static_cast<SamlConfigurationPropertyItemsArray> (getDefaultGroups());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultGroupsKey = "defaultGroups";
	json_object_set_member(pJsonObject, defaultGroupsKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsString")) {
		SamlConfigurationPropertyItemsString obj = getNameIdFormat();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsString", "");
	}
	else {
		
		SamlConfigurationPropertyItemsString obj = static_cast<SamlConfigurationPropertyItemsString> (getNameIdFormat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nameIdFormatKey = "nameIdFormat";
	json_object_set_member(pJsonObject, nameIdFormatKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsArray")) {
		SamlConfigurationPropertyItemsArray obj = getSynchronizeAttributes();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsArray", "");
	}
	else {
		
		SamlConfigurationPropertyItemsArray obj = static_cast<SamlConfigurationPropertyItemsArray> (getSynchronizeAttributes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *synchronizeAttributesKey = "synchronizeAttributes";
	json_object_set_member(pJsonObject, synchronizeAttributesKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsBoolean")) {
		SamlConfigurationPropertyItemsBoolean obj = getHandleLogout();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsBoolean", "");
	}
	else {
		
		SamlConfigurationPropertyItemsBoolean obj = static_cast<SamlConfigurationPropertyItemsBoolean> (getHandleLogout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *handleLogoutKey = "handleLogout";
	json_object_set_member(pJsonObject, handleLogoutKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsString")) {
		SamlConfigurationPropertyItemsString obj = getLogoutUrl();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsString", "");
	}
	else {
		
		SamlConfigurationPropertyItemsString obj = static_cast<SamlConfigurationPropertyItemsString> (getLogoutUrl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *logoutUrlKey = "logoutUrl";
	json_object_set_member(pJsonObject, logoutUrlKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsLong")) {
		SamlConfigurationPropertyItemsLong obj = getClockTolerance();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsLong", "");
	}
	else {
		
		SamlConfigurationPropertyItemsLong obj = static_cast<SamlConfigurationPropertyItemsLong> (getClockTolerance());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *clockToleranceKey = "clockTolerance";
	json_object_set_member(pJsonObject, clockToleranceKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsString")) {
		SamlConfigurationPropertyItemsString obj = getDigestMethod();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsString", "");
	}
	else {
		
		SamlConfigurationPropertyItemsString obj = static_cast<SamlConfigurationPropertyItemsString> (getDigestMethod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *digestMethodKey = "digestMethod";
	json_object_set_member(pJsonObject, digestMethodKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsString")) {
		SamlConfigurationPropertyItemsString obj = getSignatureMethod();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsString", "");
	}
	else {
		
		SamlConfigurationPropertyItemsString obj = static_cast<SamlConfigurationPropertyItemsString> (getSignatureMethod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *signatureMethodKey = "signatureMethod";
	json_object_set_member(pJsonObject, signatureMethodKey, node);
	if (isprimitive("SamlConfigurationPropertyItemsString")) {
		SamlConfigurationPropertyItemsString obj = getUserIntermediatePath();
		node = converttoJson(&obj, "SamlConfigurationPropertyItemsString", "");
	}
	else {
		
		SamlConfigurationPropertyItemsString obj = static_cast<SamlConfigurationPropertyItemsString> (getUserIntermediatePath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userIntermediatePathKey = "userIntermediatePath";
	json_object_set_member(pJsonObject, userIntermediatePathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

SamlConfigurationPropertyItemsArray
SamlConfigurationProperties::getPath()
{
	return path;
}

void
SamlConfigurationProperties::setPath(SamlConfigurationPropertyItemsArray  path)
{
	this->path = path;
}

SamlConfigurationPropertyItemsLong
SamlConfigurationProperties::getServiceranking()
{
	return serviceranking;
}

void
SamlConfigurationProperties::setServiceranking(SamlConfigurationPropertyItemsLong  serviceranking)
{
	this->serviceranking = serviceranking;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getIdpUrl()
{
	return idpUrl;
}

void
SamlConfigurationProperties::setIdpUrl(SamlConfigurationPropertyItemsString  idpUrl)
{
	this->idpUrl = idpUrl;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getIdpCertAlias()
{
	return idpCertAlias;
}

void
SamlConfigurationProperties::setIdpCertAlias(SamlConfigurationPropertyItemsString  idpCertAlias)
{
	this->idpCertAlias = idpCertAlias;
}

SamlConfigurationPropertyItemsBoolean
SamlConfigurationProperties::getIdpHttpRedirect()
{
	return idpHttpRedirect;
}

void
SamlConfigurationProperties::setIdpHttpRedirect(SamlConfigurationPropertyItemsBoolean  idpHttpRedirect)
{
	this->idpHttpRedirect = idpHttpRedirect;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getServiceProviderEntityId()
{
	return serviceProviderEntityId;
}

void
SamlConfigurationProperties::setServiceProviderEntityId(SamlConfigurationPropertyItemsString  serviceProviderEntityId)
{
	this->serviceProviderEntityId = serviceProviderEntityId;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getAssertionConsumerServiceURL()
{
	return assertionConsumerServiceURL;
}

void
SamlConfigurationProperties::setAssertionConsumerServiceURL(SamlConfigurationPropertyItemsString  assertionConsumerServiceURL)
{
	this->assertionConsumerServiceURL = assertionConsumerServiceURL;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getSpPrivateKeyAlias()
{
	return spPrivateKeyAlias;
}

void
SamlConfigurationProperties::setSpPrivateKeyAlias(SamlConfigurationPropertyItemsString  spPrivateKeyAlias)
{
	this->spPrivateKeyAlias = spPrivateKeyAlias;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getKeyStorePassword()
{
	return keyStorePassword;
}

void
SamlConfigurationProperties::setKeyStorePassword(SamlConfigurationPropertyItemsString  keyStorePassword)
{
	this->keyStorePassword = keyStorePassword;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getDefaultRedirectUrl()
{
	return defaultRedirectUrl;
}

void
SamlConfigurationProperties::setDefaultRedirectUrl(SamlConfigurationPropertyItemsString  defaultRedirectUrl)
{
	this->defaultRedirectUrl = defaultRedirectUrl;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getUserIDAttribute()
{
	return userIDAttribute;
}

void
SamlConfigurationProperties::setUserIDAttribute(SamlConfigurationPropertyItemsString  userIDAttribute)
{
	this->userIDAttribute = userIDAttribute;
}

SamlConfigurationPropertyItemsBoolean
SamlConfigurationProperties::getUseEncryption()
{
	return useEncryption;
}

void
SamlConfigurationProperties::setUseEncryption(SamlConfigurationPropertyItemsBoolean  useEncryption)
{
	this->useEncryption = useEncryption;
}

SamlConfigurationPropertyItemsBoolean
SamlConfigurationProperties::getCreateUser()
{
	return createUser;
}

void
SamlConfigurationProperties::setCreateUser(SamlConfigurationPropertyItemsBoolean  createUser)
{
	this->createUser = createUser;
}

SamlConfigurationPropertyItemsBoolean
SamlConfigurationProperties::getAddGroupMemberships()
{
	return addGroupMemberships;
}

void
SamlConfigurationProperties::setAddGroupMemberships(SamlConfigurationPropertyItemsBoolean  addGroupMemberships)
{
	this->addGroupMemberships = addGroupMemberships;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getGroupMembershipAttribute()
{
	return groupMembershipAttribute;
}

void
SamlConfigurationProperties::setGroupMembershipAttribute(SamlConfigurationPropertyItemsString  groupMembershipAttribute)
{
	this->groupMembershipAttribute = groupMembershipAttribute;
}

SamlConfigurationPropertyItemsArray
SamlConfigurationProperties::getDefaultGroups()
{
	return defaultGroups;
}

void
SamlConfigurationProperties::setDefaultGroups(SamlConfigurationPropertyItemsArray  defaultGroups)
{
	this->defaultGroups = defaultGroups;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getNameIdFormat()
{
	return nameIdFormat;
}

void
SamlConfigurationProperties::setNameIdFormat(SamlConfigurationPropertyItemsString  nameIdFormat)
{
	this->nameIdFormat = nameIdFormat;
}

SamlConfigurationPropertyItemsArray
SamlConfigurationProperties::getSynchronizeAttributes()
{
	return synchronizeAttributes;
}

void
SamlConfigurationProperties::setSynchronizeAttributes(SamlConfigurationPropertyItemsArray  synchronizeAttributes)
{
	this->synchronizeAttributes = synchronizeAttributes;
}

SamlConfigurationPropertyItemsBoolean
SamlConfigurationProperties::getHandleLogout()
{
	return handleLogout;
}

void
SamlConfigurationProperties::setHandleLogout(SamlConfigurationPropertyItemsBoolean  handleLogout)
{
	this->handleLogout = handleLogout;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getLogoutUrl()
{
	return logoutUrl;
}

void
SamlConfigurationProperties::setLogoutUrl(SamlConfigurationPropertyItemsString  logoutUrl)
{
	this->logoutUrl = logoutUrl;
}

SamlConfigurationPropertyItemsLong
SamlConfigurationProperties::getClockTolerance()
{
	return clockTolerance;
}

void
SamlConfigurationProperties::setClockTolerance(SamlConfigurationPropertyItemsLong  clockTolerance)
{
	this->clockTolerance = clockTolerance;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getDigestMethod()
{
	return digestMethod;
}

void
SamlConfigurationProperties::setDigestMethod(SamlConfigurationPropertyItemsString  digestMethod)
{
	this->digestMethod = digestMethod;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getSignatureMethod()
{
	return signatureMethod;
}

void
SamlConfigurationProperties::setSignatureMethod(SamlConfigurationPropertyItemsString  signatureMethod)
{
	this->signatureMethod = signatureMethod;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getUserIntermediatePath()
{
	return userIntermediatePath;
}

void
SamlConfigurationProperties::setUserIntermediatePath(SamlConfigurationPropertyItemsString  userIntermediatePath)
{
	this->userIntermediatePath = userIntermediatePath;
}


