

#include "InstallStatus_status.h"

using namespace Tiny;

InstallStatus_status::InstallStatus_status()
{
	finished = bool(false);
	itemCount = int(0);
}

InstallStatus_status::InstallStatus_status(std::string jsonString)
{
	this->fromJson(jsonString);
}

InstallStatus_status::~InstallStatus_status()
{

}

void
InstallStatus_status::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *finishedKey = "finished";

    if(object.has_key(finishedKey))
    {
        bourne::json value = object[finishedKey];



        jsonToValue(&finished, value, "bool");


    }

    const char *itemCountKey = "itemCount";

    if(object.has_key(itemCountKey))
    {
        bourne::json value = object[itemCountKey];



        jsonToValue(&itemCount, value, "int");


    }


}

bourne::json
InstallStatus_status::toJson()
{
    bourne::json object = bourne::json::object();





    object["finished"] = isFinished();






    object["itemCount"] = getItemCount();



    return object;

}

bool
InstallStatus_status::isFinished()
{
	return finished;
}

void
InstallStatus_status::setFinished(bool finished)
{
	this->finished = finished;
}

int
InstallStatus_status::getItemCount()
{
	return itemCount;
}

void
InstallStatus_status::setItemCount(int itemCount)
{
	this->itemCount = itemCount;
}



