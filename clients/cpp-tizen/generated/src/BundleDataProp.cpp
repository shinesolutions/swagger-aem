#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BundleDataProp.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BundleDataProp::BundleDataProp()
{
	//__init();
}

BundleDataProp::~BundleDataProp()
{
	//__cleanup();
}

void
BundleDataProp::__init()
{
	//key = std::string();
	//value = std::string();
}

void
BundleDataProp::__cleanup()
{
	//if(key != NULL) {
	//
	//delete key;
	//key = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
BundleDataProp::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *keyKey = "key";
	node = json_object_get_member(pJsonObject, keyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&key, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
		}
	}
}

BundleDataProp::BundleDataProp(char* json)
{
	this->fromJson(json);
}

char*
BundleDataProp::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getKey();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *keyKey = "key";
	json_object_set_member(pJsonObject, keyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BundleDataProp::getKey()
{
	return key;
}

void
BundleDataProp::setKey(std::string  key)
{
	this->key = key;
}

std::string
BundleDataProp::getValue()
{
	return value;
}

void
BundleDataProp::setValue(std::string  value)
{
	this->value = value;
}


