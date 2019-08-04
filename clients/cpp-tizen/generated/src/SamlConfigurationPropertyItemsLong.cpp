#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SamlConfigurationPropertyItemsLong.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SamlConfigurationPropertyItemsLong::SamlConfigurationPropertyItemsLong()
{
	//__init();
}

SamlConfigurationPropertyItemsLong::~SamlConfigurationPropertyItemsLong()
{
	//__cleanup();
}

void
SamlConfigurationPropertyItemsLong::__init()
{
	//name = std::string();
	//optional = bool(false);
	//is_set = bool(false);
	//type = int(0);
	//value = int(0);
	//description = std::string();
}

void
SamlConfigurationPropertyItemsLong::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(optional != NULL) {
	//
	//delete optional;
	//optional = NULL;
	//}
	//if(is_set != NULL) {
	//
	//delete is_set;
	//is_set = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//
}

void
SamlConfigurationPropertyItemsLong::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *optionalKey = "optional";
	node = json_object_get_member(pJsonObject, optionalKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&optional, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_setKey = "is_set";
	node = json_object_get_member(pJsonObject, is_setKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_set, node, "bool", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&type, node, "int", "");
		} else {
			
		}
	}
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&value, node, "int", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
}

SamlConfigurationPropertyItemsLong::SamlConfigurationPropertyItemsLong(char* json)
{
	this->fromJson(json);
}

char*
SamlConfigurationPropertyItemsLong::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("bool")) {
		bool obj = getOptional();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *optionalKey = "optional";
	json_object_set_member(pJsonObject, optionalKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsSet();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_setKey = "is_set";
	json_object_set_member(pJsonObject, is_setKey, node);
	if (isprimitive("int")) {
		int obj = getType();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("int")) {
		int obj = getValue();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SamlConfigurationPropertyItemsLong::getName()
{
	return name;
}

void
SamlConfigurationPropertyItemsLong::setName(std::string  name)
{
	this->name = name;
}

bool
SamlConfigurationPropertyItemsLong::getOptional()
{
	return optional;
}

void
SamlConfigurationPropertyItemsLong::setOptional(bool  optional)
{
	this->optional = optional;
}

bool
SamlConfigurationPropertyItemsLong::getIsSet()
{
	return is_set;
}

void
SamlConfigurationPropertyItemsLong::setIsSet(bool  is_set)
{
	this->is_set = is_set;
}

int
SamlConfigurationPropertyItemsLong::getType()
{
	return type;
}

void
SamlConfigurationPropertyItemsLong::setType(int  type)
{
	this->type = type;
}

int
SamlConfigurationPropertyItemsLong::getValue()
{
	return value;
}

void
SamlConfigurationPropertyItemsLong::setValue(int  value)
{
	this->value = value;
}

std::string
SamlConfigurationPropertyItemsLong::getDescription()
{
	return description;
}

void
SamlConfigurationPropertyItemsLong::setDescription(std::string  description)
{
	this->description = description;
}


