#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "InstallStatus.h"

using namespace std;
using namespace Tizen::ArtikCloud;

InstallStatus::InstallStatus()
{
	//__init();
}

InstallStatus::~InstallStatus()
{
	//__cleanup();
}

void
InstallStatus::__init()
{
	//status = new InstallStatus_status();
}

void
InstallStatus::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
InstallStatus::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("InstallStatus_status")) {
			jsonToValue(&status, node, "InstallStatus_status", "InstallStatus_status");
		} else {
			
			InstallStatus_status* obj = static_cast<InstallStatus_status*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

InstallStatus::InstallStatus(char* json)
{
	this->fromJson(json);
}

char*
InstallStatus::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("InstallStatus_status")) {
		InstallStatus_status obj = getStatus();
		node = converttoJson(&obj, "InstallStatus_status", "");
	}
	else {
		
		InstallStatus_status obj = static_cast<InstallStatus_status> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

InstallStatus_status
InstallStatus::getStatus()
{
	return status;
}

void
InstallStatus::setStatus(InstallStatus_status  status)
{
	this->status = status;
}


