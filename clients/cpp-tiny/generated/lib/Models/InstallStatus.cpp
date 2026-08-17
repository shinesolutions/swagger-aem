

#include "InstallStatus.h"

using namespace Tiny;

InstallStatus::InstallStatus()
{
	status = InstallStatus_status();
}

InstallStatus::InstallStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

InstallStatus::~InstallStatus()
{

}

void
InstallStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        InstallStatus_status* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
InstallStatus::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();


    return object;

}

InstallStatus_status
InstallStatus::getStatus()
{
	return status;
}

void
InstallStatus::setStatus(InstallStatus_status status)
{
	this->status = status;
}



