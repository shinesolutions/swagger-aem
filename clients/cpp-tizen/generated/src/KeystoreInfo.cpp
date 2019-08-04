#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "KeystoreInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

KeystoreInfo::KeystoreInfo()
{
	//__init();
}

KeystoreInfo::~KeystoreInfo()
{
	//__cleanup();
}

void
KeystoreInfo::__init()
{
	//new std::list()std::list> aliases;
	//exists = bool(false);
}

void
KeystoreInfo::__cleanup()
{
	//if(aliases != NULL) {
	//aliases.RemoveAll(true);
	//delete aliases;
	//aliases = NULL;
	//}
	//if(exists != NULL) {
	//
	//delete exists;
	//exists = NULL;
	//}
	//
}

void
KeystoreInfo::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aliasesKey = "aliases";
	node = json_object_get_member(pJsonObject, aliasesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<KeystoreItems> new_list;
			KeystoreItems inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("KeystoreItems")) {
					jsonToValue(&inst, temp_json, "KeystoreItems", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			aliases = new_list;
		}
		
	}
	const gchar *existsKey = "exists";
	node = json_object_get_member(pJsonObject, existsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&exists, node, "bool", "");
		} else {
			
		}
	}
}

KeystoreInfo::KeystoreInfo(char* json)
{
	this->fromJson(json);
}

char*
KeystoreInfo::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("KeystoreItems")) {
		list<KeystoreItems> new_list = static_cast<list <KeystoreItems> > (getAliases());
		node = converttoJson(&new_list, "KeystoreItems", "array");
	} else {
		node = json_node_alloc();
		list<KeystoreItems> new_list = static_cast<list <KeystoreItems> > (getAliases());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<KeystoreItems>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			KeystoreItems obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *aliasesKey = "aliases";
	json_object_set_member(pJsonObject, aliasesKey, node);
	if (isprimitive("bool")) {
		bool obj = getExists();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *existsKey = "exists";
	json_object_set_member(pJsonObject, existsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<KeystoreItems>
KeystoreInfo::getAliases()
{
	return aliases;
}

void
KeystoreInfo::setAliases(std::list <KeystoreItems> aliases)
{
	this->aliases = aliases;
}

bool
KeystoreInfo::getExists()
{
	return exists;
}

void
KeystoreInfo::setExists(bool  exists)
{
	this->exists = exists;
}


