/*
 * SamlConfigurationProperties.h
 *
 * 
 */

#ifndef _SamlConfigurationProperties_H_
#define _SamlConfigurationProperties_H_


#include <string>
#include "SamlConfigurationPropertyItemsArray.h"
#include "SamlConfigurationPropertyItemsBoolean.h"
#include "SamlConfigurationPropertyItemsLong.h"
#include "SamlConfigurationPropertyItemsString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SamlConfigurationProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	SamlConfigurationProperties();
	SamlConfigurationProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SamlConfigurationProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsArray getPath();

	/*! \brief Set 
	 */
	void setPath(SamlConfigurationPropertyItemsArray  path);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsLong getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(SamlConfigurationPropertyItemsLong  serviceranking);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsString getIdpUrl();

	/*! \brief Set 
	 */
	void setIdpUrl(SamlConfigurationPropertyItemsString  idpUrl);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsString getIdpCertAlias();

	/*! \brief Set 
	 */
	void setIdpCertAlias(SamlConfigurationPropertyItemsString  idpCertAlias);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsBoolean getIdpHttpRedirect();

	/*! \brief Set 
	 */
	void setIdpHttpRedirect(SamlConfigurationPropertyItemsBoolean  idpHttpRedirect);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsString getServiceProviderEntityId();

	/*! \brief Set 
	 */
	void setServiceProviderEntityId(SamlConfigurationPropertyItemsString  serviceProviderEntityId);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsString getAssertionConsumerServiceURL();

	/*! \brief Set 
	 */
	void setAssertionConsumerServiceURL(SamlConfigurationPropertyItemsString  assertionConsumerServiceURL);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsString getSpPrivateKeyAlias();

	/*! \brief Set 
	 */
	void setSpPrivateKeyAlias(SamlConfigurationPropertyItemsString  spPrivateKeyAlias);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsString getKeyStorePassword();

	/*! \brief Set 
	 */
	void setKeyStorePassword(SamlConfigurationPropertyItemsString  keyStorePassword);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsString getDefaultRedirectUrl();

	/*! \brief Set 
	 */
	void setDefaultRedirectUrl(SamlConfigurationPropertyItemsString  defaultRedirectUrl);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsString getUserIDAttribute();

	/*! \brief Set 
	 */
	void setUserIDAttribute(SamlConfigurationPropertyItemsString  userIDAttribute);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsBoolean getUseEncryption();

	/*! \brief Set 
	 */
	void setUseEncryption(SamlConfigurationPropertyItemsBoolean  useEncryption);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsBoolean getCreateUser();

	/*! \brief Set 
	 */
	void setCreateUser(SamlConfigurationPropertyItemsBoolean  createUser);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsBoolean getAddGroupMemberships();

	/*! \brief Set 
	 */
	void setAddGroupMemberships(SamlConfigurationPropertyItemsBoolean  addGroupMemberships);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsString getGroupMembershipAttribute();

	/*! \brief Set 
	 */
	void setGroupMembershipAttribute(SamlConfigurationPropertyItemsString  groupMembershipAttribute);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsArray getDefaultGroups();

	/*! \brief Set 
	 */
	void setDefaultGroups(SamlConfigurationPropertyItemsArray  defaultGroups);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsString getNameIdFormat();

	/*! \brief Set 
	 */
	void setNameIdFormat(SamlConfigurationPropertyItemsString  nameIdFormat);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsArray getSynchronizeAttributes();

	/*! \brief Set 
	 */
	void setSynchronizeAttributes(SamlConfigurationPropertyItemsArray  synchronizeAttributes);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsBoolean getHandleLogout();

	/*! \brief Set 
	 */
	void setHandleLogout(SamlConfigurationPropertyItemsBoolean  handleLogout);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsString getLogoutUrl();

	/*! \brief Set 
	 */
	void setLogoutUrl(SamlConfigurationPropertyItemsString  logoutUrl);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsLong getClockTolerance();

	/*! \brief Set 
	 */
	void setClockTolerance(SamlConfigurationPropertyItemsLong  clockTolerance);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsString getDigestMethod();

	/*! \brief Set 
	 */
	void setDigestMethod(SamlConfigurationPropertyItemsString  digestMethod);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsString getSignatureMethod();

	/*! \brief Set 
	 */
	void setSignatureMethod(SamlConfigurationPropertyItemsString  signatureMethod);
	/*! \brief Get 
	 */
	SamlConfigurationPropertyItemsString getUserIntermediatePath();

	/*! \brief Set 
	 */
	void setUserIntermediatePath(SamlConfigurationPropertyItemsString  userIntermediatePath);

private:
	SamlConfigurationPropertyItemsArray path;
	SamlConfigurationPropertyItemsLong serviceranking;
	SamlConfigurationPropertyItemsString idpUrl;
	SamlConfigurationPropertyItemsString idpCertAlias;
	SamlConfigurationPropertyItemsBoolean idpHttpRedirect;
	SamlConfigurationPropertyItemsString serviceProviderEntityId;
	SamlConfigurationPropertyItemsString assertionConsumerServiceURL;
	SamlConfigurationPropertyItemsString spPrivateKeyAlias;
	SamlConfigurationPropertyItemsString keyStorePassword;
	SamlConfigurationPropertyItemsString defaultRedirectUrl;
	SamlConfigurationPropertyItemsString userIDAttribute;
	SamlConfigurationPropertyItemsBoolean useEncryption;
	SamlConfigurationPropertyItemsBoolean createUser;
	SamlConfigurationPropertyItemsBoolean addGroupMemberships;
	SamlConfigurationPropertyItemsString groupMembershipAttribute;
	SamlConfigurationPropertyItemsArray defaultGroups;
	SamlConfigurationPropertyItemsString nameIdFormat;
	SamlConfigurationPropertyItemsArray synchronizeAttributes;
	SamlConfigurationPropertyItemsBoolean handleLogout;
	SamlConfigurationPropertyItemsString logoutUrl;
	SamlConfigurationPropertyItemsLong clockTolerance;
	SamlConfigurationPropertyItemsString digestMethod;
	SamlConfigurationPropertyItemsString signatureMethod;
	SamlConfigurationPropertyItemsString userIntermediatePath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SamlConfigurationProperties_H_ */
