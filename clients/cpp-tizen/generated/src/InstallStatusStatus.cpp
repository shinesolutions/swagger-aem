#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "InstallStatus_status.h"

using namespace std;
using namespace Tizen::ArtikCloud;

InstallStatus_status::InstallStatus_status()
{
	//__init();
}

InstallStatus_status::~InstallStatus_status()
{
	//__cleanup();
}

void
InstallStatus_status::__init()
{
	//finished = bool(false);
	//itemCount = int(0);
}

void
InstallStatus_status::__cleanup()
{
	//if(finished != NULL) {
	//
	//delete finished;
	//finished = NULL;
	//}
	//if(itemCount != NULL) {
	//
	//delete itemCount;
	//itemCount = NULL;
	//}
	//
}

void
InstallStatus_status::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *finishedKey = "finished";
	node = json_object_get_member(pJsonObject, finishedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&finished, node, "bool", "");
		} else {
			
		}
	}
	const gchar *itemCountKey = "itemCount";
	node = json_object_get_member(pJsonObject, itemCountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&itemCount, node, "int", "");
		} else {
			
		}
	}
}

InstallStatus_status::InstallStatus_status(char* json)
{
	this->fromJson(json);
}

char*
InstallStatus_status::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getFinished();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *finishedKey = "finished";
	json_object_set_member(pJsonObject, finishedKey, node);
	if (isprimitive("int")) {
		int obj = getItemCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *itemCountKey = "itemCount";
	json_object_set_member(pJsonObject, itemCountKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
InstallStatus_status::getFinished()
{
	return finished;
}

void
InstallStatus_status::setFinished(bool  finished)
{
	this->finished = finished;
}

int
InstallStatus_status::getItemCount()
{
	return itemCount;
}

void
InstallStatus_status::setItemCount(int  itemCount)
{
	this->itemCount = itemCount;
}


