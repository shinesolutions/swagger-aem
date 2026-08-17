

#include "SamlConfigurationProperties.h"

using namespace Tiny;

SamlConfigurationProperties::SamlConfigurationProperties()
{
	path = SamlConfigurationPropertyItemsArray();
	serviceranking = SamlConfigurationPropertyItemsLong();
	idpUrl = SamlConfigurationPropertyItemsString();
	idpCertAlias = SamlConfigurationPropertyItemsString();
	idpHttpRedirect = SamlConfigurationPropertyItemsBoolean();
	serviceProviderEntityId = SamlConfigurationPropertyItemsString();
	assertionConsumerServiceURL = SamlConfigurationPropertyItemsString();
	spPrivateKeyAlias = SamlConfigurationPropertyItemsString();
	keyStorePassword = SamlConfigurationPropertyItemsString();
	defaultRedirectUrl = SamlConfigurationPropertyItemsString();
	userIDAttribute = SamlConfigurationPropertyItemsString();
	useEncryption = SamlConfigurationPropertyItemsBoolean();
	createUser = SamlConfigurationPropertyItemsBoolean();
	addGroupMemberships = SamlConfigurationPropertyItemsBoolean();
	groupMembershipAttribute = SamlConfigurationPropertyItemsString();
	defaultGroups = SamlConfigurationPropertyItemsArray();
	nameIdFormat = SamlConfigurationPropertyItemsString();
	synchronizeAttributes = SamlConfigurationPropertyItemsArray();
	handleLogout = SamlConfigurationPropertyItemsBoolean();
	logoutUrl = SamlConfigurationPropertyItemsString();
	clockTolerance = SamlConfigurationPropertyItemsLong();
	digestMethod = SamlConfigurationPropertyItemsString();
	signatureMethod = SamlConfigurationPropertyItemsString();
	userIntermediatePath = SamlConfigurationPropertyItemsString();
}

SamlConfigurationProperties::SamlConfigurationProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

SamlConfigurationProperties::~SamlConfigurationProperties()
{

}

void
SamlConfigurationProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        SamlConfigurationPropertyItemsArray* obj = &path;
		obj->fromJson(value.dump());

    }

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        SamlConfigurationPropertyItemsLong* obj = &serviceranking;
		obj->fromJson(value.dump());

    }

    const char *idpUrlKey = "idpUrl";

    if(object.has_key(idpUrlKey))
    {
        bourne::json value = object[idpUrlKey];




        SamlConfigurationPropertyItemsString* obj = &idpUrl;
		obj->fromJson(value.dump());

    }

    const char *idpCertAliasKey = "idpCertAlias";

    if(object.has_key(idpCertAliasKey))
    {
        bourne::json value = object[idpCertAliasKey];




        SamlConfigurationPropertyItemsString* obj = &idpCertAlias;
		obj->fromJson(value.dump());

    }

    const char *idpHttpRedirectKey = "idpHttpRedirect";

    if(object.has_key(idpHttpRedirectKey))
    {
        bourne::json value = object[idpHttpRedirectKey];




        SamlConfigurationPropertyItemsBoolean* obj = &idpHttpRedirect;
		obj->fromJson(value.dump());

    }

    const char *serviceProviderEntityIdKey = "serviceProviderEntityId";

    if(object.has_key(serviceProviderEntityIdKey))
    {
        bourne::json value = object[serviceProviderEntityIdKey];




        SamlConfigurationPropertyItemsString* obj = &serviceProviderEntityId;
		obj->fromJson(value.dump());

    }

    const char *assertionConsumerServiceURLKey = "assertionConsumerServiceURL";

    if(object.has_key(assertionConsumerServiceURLKey))
    {
        bourne::json value = object[assertionConsumerServiceURLKey];




        SamlConfigurationPropertyItemsString* obj = &assertionConsumerServiceURL;
		obj->fromJson(value.dump());

    }

    const char *spPrivateKeyAliasKey = "spPrivateKeyAlias";

    if(object.has_key(spPrivateKeyAliasKey))
    {
        bourne::json value = object[spPrivateKeyAliasKey];




        SamlConfigurationPropertyItemsString* obj = &spPrivateKeyAlias;
		obj->fromJson(value.dump());

    }

    const char *keyStorePasswordKey = "keyStorePassword";

    if(object.has_key(keyStorePasswordKey))
    {
        bourne::json value = object[keyStorePasswordKey];




        SamlConfigurationPropertyItemsString* obj = &keyStorePassword;
		obj->fromJson(value.dump());

    }

    const char *defaultRedirectUrlKey = "defaultRedirectUrl";

    if(object.has_key(defaultRedirectUrlKey))
    {
        bourne::json value = object[defaultRedirectUrlKey];




        SamlConfigurationPropertyItemsString* obj = &defaultRedirectUrl;
		obj->fromJson(value.dump());

    }

    const char *userIDAttributeKey = "userIDAttribute";

    if(object.has_key(userIDAttributeKey))
    {
        bourne::json value = object[userIDAttributeKey];




        SamlConfigurationPropertyItemsString* obj = &userIDAttribute;
		obj->fromJson(value.dump());

    }

    const char *useEncryptionKey = "useEncryption";

    if(object.has_key(useEncryptionKey))
    {
        bourne::json value = object[useEncryptionKey];




        SamlConfigurationPropertyItemsBoolean* obj = &useEncryption;
		obj->fromJson(value.dump());

    }

    const char *createUserKey = "createUser";

    if(object.has_key(createUserKey))
    {
        bourne::json value = object[createUserKey];




        SamlConfigurationPropertyItemsBoolean* obj = &createUser;
		obj->fromJson(value.dump());

    }

    const char *addGroupMembershipsKey = "addGroupMemberships";

    if(object.has_key(addGroupMembershipsKey))
    {
        bourne::json value = object[addGroupMembershipsKey];




        SamlConfigurationPropertyItemsBoolean* obj = &addGroupMemberships;
		obj->fromJson(value.dump());

    }

    const char *groupMembershipAttributeKey = "groupMembershipAttribute";

    if(object.has_key(groupMembershipAttributeKey))
    {
        bourne::json value = object[groupMembershipAttributeKey];




        SamlConfigurationPropertyItemsString* obj = &groupMembershipAttribute;
		obj->fromJson(value.dump());

    }

    const char *defaultGroupsKey = "defaultGroups";

    if(object.has_key(defaultGroupsKey))
    {
        bourne::json value = object[defaultGroupsKey];




        SamlConfigurationPropertyItemsArray* obj = &defaultGroups;
		obj->fromJson(value.dump());

    }

    const char *nameIdFormatKey = "nameIdFormat";

    if(object.has_key(nameIdFormatKey))
    {
        bourne::json value = object[nameIdFormatKey];




        SamlConfigurationPropertyItemsString* obj = &nameIdFormat;
		obj->fromJson(value.dump());

    }

    const char *synchronizeAttributesKey = "synchronizeAttributes";

    if(object.has_key(synchronizeAttributesKey))
    {
        bourne::json value = object[synchronizeAttributesKey];




        SamlConfigurationPropertyItemsArray* obj = &synchronizeAttributes;
		obj->fromJson(value.dump());

    }

    const char *handleLogoutKey = "handleLogout";

    if(object.has_key(handleLogoutKey))
    {
        bourne::json value = object[handleLogoutKey];




        SamlConfigurationPropertyItemsBoolean* obj = &handleLogout;
		obj->fromJson(value.dump());

    }

    const char *logoutUrlKey = "logoutUrl";

    if(object.has_key(logoutUrlKey))
    {
        bourne::json value = object[logoutUrlKey];




        SamlConfigurationPropertyItemsString* obj = &logoutUrl;
		obj->fromJson(value.dump());

    }

    const char *clockToleranceKey = "clockTolerance";

    if(object.has_key(clockToleranceKey))
    {
        bourne::json value = object[clockToleranceKey];




        SamlConfigurationPropertyItemsLong* obj = &clockTolerance;
		obj->fromJson(value.dump());

    }

    const char *digestMethodKey = "digestMethod";

    if(object.has_key(digestMethodKey))
    {
        bourne::json value = object[digestMethodKey];




        SamlConfigurationPropertyItemsString* obj = &digestMethod;
		obj->fromJson(value.dump());

    }

    const char *signatureMethodKey = "signatureMethod";

    if(object.has_key(signatureMethodKey))
    {
        bourne::json value = object[signatureMethodKey];




        SamlConfigurationPropertyItemsString* obj = &signatureMethod;
		obj->fromJson(value.dump());

    }

    const char *userIntermediatePathKey = "userIntermediatePath";

    if(object.has_key(userIntermediatePathKey))
    {
        bourne::json value = object[userIntermediatePathKey];




        SamlConfigurationPropertyItemsString* obj = &userIntermediatePath;
		obj->fromJson(value.dump());

    }


}

bourne::json
SamlConfigurationProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["path"] = getPath().toJson();






	object["serviceranking"] = getServiceranking().toJson();






	object["idpUrl"] = getIdpUrl().toJson();






	object["idpCertAlias"] = getIdpCertAlias().toJson();






	object["idpHttpRedirect"] = getIdpHttpRedirect().toJson();






	object["serviceProviderEntityId"] = getServiceProviderEntityId().toJson();






	object["assertionConsumerServiceURL"] = getAssertionConsumerServiceURL().toJson();






	object["spPrivateKeyAlias"] = getSpPrivateKeyAlias().toJson();






	object["keyStorePassword"] = getKeyStorePassword().toJson();






	object["defaultRedirectUrl"] = getDefaultRedirectUrl().toJson();






	object["userIDAttribute"] = getUserIDAttribute().toJson();






	object["useEncryption"] = getUseEncryption().toJson();






	object["createUser"] = getCreateUser().toJson();






	object["addGroupMemberships"] = getAddGroupMemberships().toJson();






	object["groupMembershipAttribute"] = getGroupMembershipAttribute().toJson();






	object["defaultGroups"] = getDefaultGroups().toJson();






	object["nameIdFormat"] = getNameIdFormat().toJson();






	object["synchronizeAttributes"] = getSynchronizeAttributes().toJson();






	object["handleLogout"] = getHandleLogout().toJson();






	object["logoutUrl"] = getLogoutUrl().toJson();






	object["clockTolerance"] = getClockTolerance().toJson();






	object["digestMethod"] = getDigestMethod().toJson();






	object["signatureMethod"] = getSignatureMethod().toJson();






	object["userIntermediatePath"] = getUserIntermediatePath().toJson();


    return object;

}

SamlConfigurationPropertyItemsArray
SamlConfigurationProperties::getPath()
{
	return path;
}

void
SamlConfigurationProperties::setPath(SamlConfigurationPropertyItemsArray path)
{
	this->path = path;
}

SamlConfigurationPropertyItemsLong
SamlConfigurationProperties::getServiceranking()
{
	return serviceranking;
}

void
SamlConfigurationProperties::setServiceranking(SamlConfigurationPropertyItemsLong serviceranking)
{
	this->serviceranking = serviceranking;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getIdpUrl()
{
	return idpUrl;
}

void
SamlConfigurationProperties::setIdpUrl(SamlConfigurationPropertyItemsString idpUrl)
{
	this->idpUrl = idpUrl;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getIdpCertAlias()
{
	return idpCertAlias;
}

void
SamlConfigurationProperties::setIdpCertAlias(SamlConfigurationPropertyItemsString idpCertAlias)
{
	this->idpCertAlias = idpCertAlias;
}

SamlConfigurationPropertyItemsBoolean
SamlConfigurationProperties::getIdpHttpRedirect()
{
	return idpHttpRedirect;
}

void
SamlConfigurationProperties::setIdpHttpRedirect(SamlConfigurationPropertyItemsBoolean idpHttpRedirect)
{
	this->idpHttpRedirect = idpHttpRedirect;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getServiceProviderEntityId()
{
	return serviceProviderEntityId;
}

void
SamlConfigurationProperties::setServiceProviderEntityId(SamlConfigurationPropertyItemsString serviceProviderEntityId)
{
	this->serviceProviderEntityId = serviceProviderEntityId;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getAssertionConsumerServiceURL()
{
	return assertionConsumerServiceURL;
}

void
SamlConfigurationProperties::setAssertionConsumerServiceURL(SamlConfigurationPropertyItemsString assertionConsumerServiceURL)
{
	this->assertionConsumerServiceURL = assertionConsumerServiceURL;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getSpPrivateKeyAlias()
{
	return spPrivateKeyAlias;
}

void
SamlConfigurationProperties::setSpPrivateKeyAlias(SamlConfigurationPropertyItemsString spPrivateKeyAlias)
{
	this->spPrivateKeyAlias = spPrivateKeyAlias;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getKeyStorePassword()
{
	return keyStorePassword;
}

void
SamlConfigurationProperties::setKeyStorePassword(SamlConfigurationPropertyItemsString keyStorePassword)
{
	this->keyStorePassword = keyStorePassword;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getDefaultRedirectUrl()
{
	return defaultRedirectUrl;
}

void
SamlConfigurationProperties::setDefaultRedirectUrl(SamlConfigurationPropertyItemsString defaultRedirectUrl)
{
	this->defaultRedirectUrl = defaultRedirectUrl;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getUserIDAttribute()
{
	return userIDAttribute;
}

void
SamlConfigurationProperties::setUserIDAttribute(SamlConfigurationPropertyItemsString userIDAttribute)
{
	this->userIDAttribute = userIDAttribute;
}

SamlConfigurationPropertyItemsBoolean
SamlConfigurationProperties::getUseEncryption()
{
	return useEncryption;
}

void
SamlConfigurationProperties::setUseEncryption(SamlConfigurationPropertyItemsBoolean useEncryption)
{
	this->useEncryption = useEncryption;
}

SamlConfigurationPropertyItemsBoolean
SamlConfigurationProperties::getCreateUser()
{
	return createUser;
}

void
SamlConfigurationProperties::setCreateUser(SamlConfigurationPropertyItemsBoolean createUser)
{
	this->createUser = createUser;
}

SamlConfigurationPropertyItemsBoolean
SamlConfigurationProperties::getAddGroupMemberships()
{
	return addGroupMemberships;
}

void
SamlConfigurationProperties::setAddGroupMemberships(SamlConfigurationPropertyItemsBoolean addGroupMemberships)
{
	this->addGroupMemberships = addGroupMemberships;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getGroupMembershipAttribute()
{
	return groupMembershipAttribute;
}

void
SamlConfigurationProperties::setGroupMembershipAttribute(SamlConfigurationPropertyItemsString groupMembershipAttribute)
{
	this->groupMembershipAttribute = groupMembershipAttribute;
}

SamlConfigurationPropertyItemsArray
SamlConfigurationProperties::getDefaultGroups()
{
	return defaultGroups;
}

void
SamlConfigurationProperties::setDefaultGroups(SamlConfigurationPropertyItemsArray defaultGroups)
{
	this->defaultGroups = defaultGroups;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getNameIdFormat()
{
	return nameIdFormat;
}

void
SamlConfigurationProperties::setNameIdFormat(SamlConfigurationPropertyItemsString nameIdFormat)
{
	this->nameIdFormat = nameIdFormat;
}

SamlConfigurationPropertyItemsArray
SamlConfigurationProperties::getSynchronizeAttributes()
{
	return synchronizeAttributes;
}

void
SamlConfigurationProperties::setSynchronizeAttributes(SamlConfigurationPropertyItemsArray synchronizeAttributes)
{
	this->synchronizeAttributes = synchronizeAttributes;
}

SamlConfigurationPropertyItemsBoolean
SamlConfigurationProperties::getHandleLogout()
{
	return handleLogout;
}

void
SamlConfigurationProperties::setHandleLogout(SamlConfigurationPropertyItemsBoolean handleLogout)
{
	this->handleLogout = handleLogout;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getLogoutUrl()
{
	return logoutUrl;
}

void
SamlConfigurationProperties::setLogoutUrl(SamlConfigurationPropertyItemsString logoutUrl)
{
	this->logoutUrl = logoutUrl;
}

SamlConfigurationPropertyItemsLong
SamlConfigurationProperties::getClockTolerance()
{
	return clockTolerance;
}

void
SamlConfigurationProperties::setClockTolerance(SamlConfigurationPropertyItemsLong clockTolerance)
{
	this->clockTolerance = clockTolerance;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getDigestMethod()
{
	return digestMethod;
}

void
SamlConfigurationProperties::setDigestMethod(SamlConfigurationPropertyItemsString digestMethod)
{
	this->digestMethod = digestMethod;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getSignatureMethod()
{
	return signatureMethod;
}

void
SamlConfigurationProperties::setSignatureMethod(SamlConfigurationPropertyItemsString signatureMethod)
{
	this->signatureMethod = signatureMethod;
}

SamlConfigurationPropertyItemsString
SamlConfigurationProperties::getUserIntermediatePath()
{
	return userIntermediatePath;
}

void
SamlConfigurationProperties::setUserIntermediatePath(SamlConfigurationPropertyItemsString userIntermediatePath)
{
	this->userIntermediatePath = userIntermediatePath;
}



