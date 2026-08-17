

#include "SamlConfigurationPropertyItemsBoolean.h"

using namespace Tiny;

SamlConfigurationPropertyItemsBoolean::SamlConfigurationPropertyItemsBoolean()
{
	name = std::string();
	optional = bool(false);
	is_set = bool(false);
	type = int(0);
	value = bool(false);
	description = std::string();
}

SamlConfigurationPropertyItemsBoolean::SamlConfigurationPropertyItemsBoolean(std::string jsonString)
{
	this->fromJson(jsonString);
}

SamlConfigurationPropertyItemsBoolean::~SamlConfigurationPropertyItemsBoolean()
{

}

void
SamlConfigurationPropertyItemsBoolean::fromJson(std::string jsonObj)
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



        jsonToValue(&value, value, "bool");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }


}

bourne::json
SamlConfigurationPropertyItemsBoolean::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["optional"] = isOptional();






    object["is_set"] = isIsSet();






    object["type"] = getType();






    object["value"] = isValue();






    object["description"] = getDescription();



    return object;

}

std::string
SamlConfigurationPropertyItemsBoolean::getName()
{
	return name;
}

void
SamlConfigurationPropertyItemsBoolean::setName(std::string name)
{
	this->name = name;
}

bool
SamlConfigurationPropertyItemsBoolean::isOptional()
{
	return optional;
}

void
SamlConfigurationPropertyItemsBoolean::setOptional(bool optional)
{
	this->optional = optional;
}

bool
SamlConfigurationPropertyItemsBoolean::isIsSet()
{
	return is_set;
}

void
SamlConfigurationPropertyItemsBoolean::setIsSet(bool is_set)
{
	this->is_set = is_set;
}

int
SamlConfigurationPropertyItemsBoolean::getType()
{
	return type;
}

void
SamlConfigurationPropertyItemsBoolean::setType(int type)
{
	this->type = type;
}

bool
SamlConfigurationPropertyItemsBoolean::isValue()
{
	return value;
}

void
SamlConfigurationPropertyItemsBoolean::setValue(bool value)
{
	this->value = value;
}

std::string
SamlConfigurationPropertyItemsBoolean::getDescription()
{
	return description;
}

void
SamlConfigurationPropertyItemsBoolean::setDescription(std::string description)
{
	this->description = description;
}



