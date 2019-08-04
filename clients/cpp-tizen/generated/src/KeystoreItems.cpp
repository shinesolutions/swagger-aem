#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "KeystoreItems.h"

using namespace std;
using namespace Tizen::ArtikCloud;

KeystoreItems::KeystoreItems()
{
	//__init();
}

KeystoreItems::~KeystoreItems()
{
	//__cleanup();
}

void
KeystoreItems::__init()
{
	//alias = std::string();
	//entryType = std::string();
	//algorithm = std::string();
	//format = std::string();
	//new std::list()std::list> chain;
}

void
KeystoreItems::__cleanup()
{
	//if(alias != NULL) {
	//
	//delete alias;
	//alias = NULL;
	//}
	//if(entryType != NULL) {
	//
	//delete entryType;
	//entryType = NULL;
	//}
	//if(algorithm != NULL) {
	//
	//delete algorithm;
	//algorithm = NULL;
	//}
	//if(format != NULL) {
	//
	//delete format;
	//format = NULL;
	//}
	//if(chain != NULL) {
	//chain.RemoveAll(true);
	//delete chain;
	//chain = NULL;
	//}
	//
}

void
KeystoreItems::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aliasKey = "alias";
	node = json_object_get_member(pJsonObject, aliasKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&alias, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *entryTypeKey = "entryType";
	node = json_object_get_member(pJsonObject, entryTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&entryType, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *algorithmKey = "algorithm";
	node = json_object_get_member(pJsonObject, algorithmKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&algorithm, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *formatKey = "format";
	node = json_object_get_member(pJsonObject, formatKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&format, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *chainKey = "chain";
	node = json_object_get_member(pJsonObject, chainKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<KeystoreChainItems> new_list;
			KeystoreChainItems inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("KeystoreChainItems")) {
					jsonToValue(&inst, temp_json, "KeystoreChainItems", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			chain = new_list;
		}
		
	}
}

KeystoreItems::KeystoreItems(char* json)
{
	this->fromJson(json);
}

char*
KeystoreItems::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAlias();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *aliasKey = "alias";
	json_object_set_member(pJsonObject, aliasKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEntryType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *entryTypeKey = "entryType";
	json_object_set_member(pJsonObject, entryTypeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAlgorithm();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *algorithmKey = "algorithm";
	json_object_set_member(pJsonObject, algorithmKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFormat();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *formatKey = "format";
	json_object_set_member(pJsonObject, formatKey, node);
	if (isprimitive("KeystoreChainItems")) {
		list<KeystoreChainItems> new_list = static_cast<list <KeystoreChainItems> > (getChain());
		node = converttoJson(&new_list, "KeystoreChainItems", "array");
	} else {
		node = json_node_alloc();
		list<KeystoreChainItems> new_list = static_cast<list <KeystoreChainItems> > (getChain());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<KeystoreChainItems>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			KeystoreChainItems obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *chainKey = "chain";
	json_object_set_member(pJsonObject, chainKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
KeystoreItems::getAlias()
{
	return alias;
}

void
KeystoreItems::setAlias(std::string  alias)
{
	this->alias = alias;
}

std::string
KeystoreItems::getEntryType()
{
	return entryType;
}

void
KeystoreItems::setEntryType(std::string  entryType)
{
	this->entryType = entryType;
}

std::string
KeystoreItems::getAlgorithm()
{
	return algorithm;
}

void
KeystoreItems::setAlgorithm(std::string  algorithm)
{
	this->algorithm = algorithm;
}

std::string
KeystoreItems::getFormat()
{
	return format;
}

void
KeystoreItems::setFormat(std::string  format)
{
	this->format = format;
}

std::list<KeystoreChainItems>
KeystoreItems::getChain()
{
	return chain;
}

void
KeystoreItems::setChain(std::list <KeystoreChainItems> chain)
{
	this->chain = chain;
}


