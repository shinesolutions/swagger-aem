

#include "SamlConfigurationPropertyItemsString.h"

using namespace Tiny;

SamlConfigurationPropertyItemsString::SamlConfigurationPropertyItemsString()
{
	name = std::string();
	optional = bool(false);
	is_set = bool(false);
	type = int(0);
	value = std::string();
	description = std::string();
}

SamlConfigurationPropertyItemsString::SamlConfigurationPropertyItemsString(std::string jsonString)
{
	this->fromJson(jsonString);
}

SamlConfigurationPropertyItemsString::~SamlConfigurationPropertyItemsString()
{

}

void
SamlConfigurationPropertyItemsString::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *optionalKey = "optional";

    if(object.has_key(optionalKey))
    {
        bourne::json value = object[optionalKey];



        jsonToValue(&optional, value, "bool");


    }

    const char *is_setKey = "is_set";

    if(object.has_key(is_setKey))
    {
        bourne::json value = object[is_setKey];



        jsonToValue(&is_set, value, "bool");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "int");


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }


}

bourne::json
SamlConfigurationPropertyItemsString::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["optional"] = isOptional();






    object["is_set"] = isIsSet();






    object["type"] = getType();






    object["value"] = getValue();






    object["description"] = getDescription();



    return object;

}

std::string
SamlConfigurationPropertyItemsString::getName()
{
	return name;
}

void
SamlConfigurationPropertyItemsString::setName(std::string name)
{
	this->name = name;
}

bool
SamlConfigurationPropertyItemsString::isOptional()
{
	return optional;
}

void
SamlConfigurationPropertyItemsString::setOptional(bool optional)
{
	this->optional = optional;
}

bool
SamlConfigurationPropertyItemsString::isIsSet()
{
	return is_set;
}

void
SamlConfigurationPropertyItemsString::setIsSet(bool is_set)
{
	this->is_set = is_set;
}

int
SamlConfigurationPropertyItemsString::getType()
{
	return type;
}

void
SamlConfigurationPropertyItemsString::setType(int type)
{
	this->type = type;
}

std::string
SamlConfigurationPropertyItemsString::getValue()
{
	return value;
}

void
SamlConfigurationPropertyItemsString::setValue(std::string value)
{
	this->value = value;
}

std::string
SamlConfigurationPropertyItemsString::getDescription()
{
	return description;
}

void
SamlConfigurationPropertyItemsString::setDescription(std::string description)
{
	this->description = description;
}



