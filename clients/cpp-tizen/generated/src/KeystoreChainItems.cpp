#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "KeystoreChainItems.h"

using namespace std;
using namespace Tizen::ArtikCloud;

KeystoreChainItems::KeystoreChainItems()
{
	//__init();
}

KeystoreChainItems::~KeystoreChainItems()
{
	//__cleanup();
}

void
KeystoreChainItems::__init()
{
	//subject = std::string();
	//issuer = std::string();
	//notBefore = std::string();
	//notAfter = std::string();
	//serialNumber = int(0);
}

void
KeystoreChainItems::__cleanup()
{
	//if(subject != NULL) {
	//
	//delete subject;
	//subject = NULL;
	//}
	//if(issuer != NULL) {
	//
	//delete issuer;
	//issuer = NULL;
	//}
	//if(notBefore != NULL) {
	//
	//delete notBefore;
	//notBefore = NULL;
	//}
	//if(notAfter != NULL) {
	//
	//delete notAfter;
	//notAfter = NULL;
	//}
	//if(serialNumber != NULL) {
	//
	//delete serialNumber;
	//serialNumber = NULL;
	//}
	//
}

void
KeystoreChainItems::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *subjectKey = "subject";
	node = json_object_get_member(pJsonObject, subjectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&subject, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *issuerKey = "issuer";
	node = json_object_get_member(pJsonObject, issuerKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&issuer, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *notBeforeKey = "notBefore";
	node = json_object_get_member(pJsonObject, notBeforeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&notBefore, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *notAfterKey = "notAfter";
	node = json_object_get_member(pJsonObject, notAfterKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&notAfter, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *serialNumberKey = "serialNumber";
	node = json_object_get_member(pJsonObject, serialNumberKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&serialNumber, node, "int", "");
		} else {
			
		}
	}
}

KeystoreChainItems::KeystoreChainItems(char* json)
{
	this->fromJson(json);
}

char*
KeystoreChainItems::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getSubject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *subjectKey = "subject";
	json_object_set_member(pJsonObject, subjectKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getIssuer();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *issuerKey = "issuer";
	json_object_set_member(pJsonObject, issuerKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNotBefore();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *notBeforeKey = "notBefore";
	json_object_set_member(pJsonObject, notBeforeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNotAfter();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *notAfterKey = "notAfter";
	json_object_set_member(pJsonObject, notAfterKey, node);
	if (isprimitive("int")) {
		int obj = getSerialNumber();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *serialNumberKey = "serialNumber";
	json_object_set_member(pJsonObject, serialNumberKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
KeystoreChainItems::getSubject()
{
	return subject;
}

void
KeystoreChainItems::setSubject(std::string  subject)
{
	this->subject = subject;
}

std::string
KeystoreChainItems::getIssuer()
{
	return issuer;
}

void
KeystoreChainItems::setIssuer(std::string  issuer)
{
	this->issuer = issuer;
}

std::string
KeystoreChainItems::getNotBefore()
{
	return notBefore;
}

void
KeystoreChainItems::setNotBefore(std::string  notBefore)
{
	this->notBefore = notBefore;
}

std::string
KeystoreChainItems::getNotAfter()
{
	return notAfter;
}

void
KeystoreChainItems::setNotAfter(std::string  notAfter)
{
	this->notAfter = notAfter;
}

int
KeystoreChainItems::getSerialNumber()
{
	return serialNumber;
}

void
KeystoreChainItems::setSerialNumber(int  serialNumber)
{
	this->serialNumber = serialNumber;
}


