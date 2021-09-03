#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BundleInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BundleInfo::BundleInfo()
{
	//__init();
}

BundleInfo::~BundleInfo()
{
	//__cleanup();
}

void
BundleInfo::__init()
{
	//status = std::string();
	//new std::list()std::list> s;
	//new std::list()std::list> data;
}

void
BundleInfo::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(s != NULL) {
	//s.RemoveAll(true);
	//delete s;
	//s = NULL;
	//}
	//if(data != NULL) {
	//data.RemoveAll(true);
	//delete data;
	//data = NULL;
	//}
	//
}

void
BundleInfo::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sKey = "s";
	node = json_object_get_member(pJsonObject, sKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<int> new_list;
			int inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("int")) {
					jsonToValue(&inst, temp_json, "int", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			s = new_list;
		}
		
	}
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<BundleData> new_list;
			BundleData inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BundleData")) {
					jsonToValue(&inst, temp_json, "BundleData", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			data = new_list;
		}
		
	}
}

BundleInfo::BundleInfo(char* json)
{
	this->fromJson(json);
}

char*
BundleInfo::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("int")) {
		list<int> new_list = static_cast<list <int> > (getS());
		node = converttoJson(&new_list, "int", "array");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getS());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *sKey = "s";
	json_object_set_member(pJsonObject, sKey, node);
	if (isprimitive("BundleData")) {
		list<BundleData> new_list = static_cast<list <BundleData> > (getData());
		node = converttoJson(&new_list, "BundleData", "array");
	} else {
		node = json_node_alloc();
		list<BundleData> new_list = static_cast<list <BundleData> > (getData());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BundleData>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BundleData obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BundleInfo::getStatus()
{
	return status;
}

void
BundleInfo::setStatus(std::string  status)
{
	this->status = status;
}

std::list<int>
BundleInfo::getS()
{
	return s;
}

void
BundleInfo::setS(std::list <int> s)
{
	this->s = s;
}

std::list<BundleData>
BundleInfo::getData()
{
	return data;
}

void
BundleInfo::setData(std::list <BundleData> data)
{
	this->data = data;
}


