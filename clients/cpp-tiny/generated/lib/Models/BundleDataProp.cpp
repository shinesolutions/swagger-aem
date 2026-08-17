

#include "BundleDataProp.h"

using namespace Tiny;

BundleDataProp::BundleDataProp()
{
	key = std::string();
	value = std::string();
}

BundleDataProp::BundleDataProp(std::string jsonString)
{
	this->fromJson(jsonString);
}

BundleDataProp::~BundleDataProp()
{

}

void
BundleDataProp::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *keyKey = "key";

    if(object.has_key(keyKey))
    {
        bourne::json value = object[keyKey];



        jsonToValue(&key, value, "std::string");


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }


}

bourne::json
BundleDataProp::toJson()
{
    bourne::json object = bourne::json::object();





    object["key"] = getKey();






    object["value"] = getValue();



    return object;

}

std::string
BundleDataProp::getKey()
{
	return key;
}

void
BundleDataProp::setKey(std::string key)
{
	this->key = key;
}

std::string
BundleDataProp::getValue()
{
	return value;
}

void
BundleDataProp::setValue(std::string value)
{
	this->value = value;
}



