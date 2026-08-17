

#include "SamlConfigurationInfo.h"

using namespace Tiny;

SamlConfigurationInfo::SamlConfigurationInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	bundle_location = std::string();
	service_location = std::string();
	properties = SamlConfigurationProperties();
}

SamlConfigurationInfo::SamlConfigurationInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

SamlConfigurationInfo::~SamlConfigurationInfo()
{

}

void
SamlConfigurationInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pidKey = "pid";

    if(object.has_key(pidKey))
    {
        bourne::json value = object[pidKey];



        jsonToValue(&pid, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *bundle_locationKey = "bundle_location";

    if(object.has_key(bundle_locationKey))
    {
        bourne::json value = object[bundle_locationKey];



        jsonToValue(&bundle_location, value, "std::string");


    }

    const char *service_locationKey = "service_location";

    if(object.has_key(service_locationKey))
    {
        bourne::json value = object[service_locationKey];



        jsonToValue(&service_location, value, "std::string");


    }

    const char *propertiesKey = "properties";

    if(object.has_key(propertiesKey))
    {
        bourne::json value = object[propertiesKey];




        SamlConfigurationProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
SamlConfigurationInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();






    object["bundle_location"] = getBundleLocation();






    object["service_location"] = getServiceLocation();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
SamlConfigurationInfo::getPid()
{
	return pid;
}

void
SamlConfigurationInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
SamlConfigurationInfo::getTitle()
{
	return title;
}

void
SamlConfigurationInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
SamlConfigurationInfo::getDescription()
{
	return description;
}

void
SamlConfigurationInfo::setDescription(std::string description)
{
	this->description = description;
}

std::string
SamlConfigurationInfo::getBundleLocation()
{
	return bundle_location;
}

void
SamlConfigurationInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
SamlConfigurationInfo::getServiceLocation()
{
	return service_location;
}

void
SamlConfigurationInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}

SamlConfigurationProperties
SamlConfigurationInfo::getProperties()
{
	return properties;
}

void
SamlConfigurationInfo::setProperties(SamlConfigurationProperties properties)
{
	this->properties = properties;
}



