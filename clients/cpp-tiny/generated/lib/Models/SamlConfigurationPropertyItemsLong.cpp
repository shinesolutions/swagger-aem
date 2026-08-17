

#include "SamlConfigurationPropertyItemsLong.h"

using namespace Tiny;

SamlConfigurationPropertyItemsLong::SamlConfigurationPropertyItemsLong()
{
	name = std::string();
	optional = bool(false);
	is_set = bool(false);
	type = int(0);
	value = int(0);
	description = std::string();
}

SamlConfigurationPropertyItemsLong::SamlConfigurationPropertyItemsLong(std::string jsonString)
{
	this->fromJson(jsonString);
}

SamlConfigurationPropertyItemsLong::~SamlConfigurationPropertyItemsLong()
{

}

void
SamlConfigurationPropertyItemsLong::fromJson(std::string jsonObj)
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



        jsonToValue(&value, value, "int");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }


}

bourne::json
SamlConfigurationPropertyItemsLong::toJson()
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
SamlConfigurationPropertyItemsLong::getName()
{
	return name;
}

void
SamlConfigurationPropertyItemsLong::setName(std::string name)
{
	this->name = name;
}

bool
SamlConfigurationPropertyItemsLong::isOptional()
{
	return optional;
}

void
SamlConfigurationPropertyItemsLong::setOptional(bool optional)
{
	this->optional = optional;
}

bool
SamlConfigurationPropertyItemsLong::isIsSet()
{
	return is_set;
}

void
SamlConfigurationPropertyItemsLong::setIsSet(bool is_set)
{
	this->is_set = is_set;
}

int
SamlConfigurationPropertyItemsLong::getType()
{
	return type;
}

void
SamlConfigurationPropertyItemsLong::setType(int type)
{
	this->type = type;
}

int
SamlConfigurationPropertyItemsLong::getValue()
{
	return value;
}

void
SamlConfigurationPropertyItemsLong::setValue(int value)
{
	this->value = value;
}

std::string
SamlConfigurationPropertyItemsLong::getDescription()
{
	return description;
}

void
SamlConfigurationPropertyItemsLong::setDescription(std::string description)
{
	this->description = description;
}



