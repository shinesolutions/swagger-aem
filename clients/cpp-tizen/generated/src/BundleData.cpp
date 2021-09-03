#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BundleData.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BundleData::BundleData()
{
	//__init();
}

BundleData::~BundleData()
{
	//__cleanup();
}

void
BundleData::__init()
{
	//id = int(0);
	//name = std::string();
	//fragment = bool(false);
	//stateRaw = int(0);
	//state = std::string();
	//version = std::string();
	//symbolicName = std::string();
	//category = std::string();
	//new std::list()std::list> props;
}

void
BundleData::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(fragment != NULL) {
	//
	//delete fragment;
	//fragment = NULL;
	//}
	//if(stateRaw != NULL) {
	//
	//delete stateRaw;
	//stateRaw = NULL;
	//}
	//if(state != NULL) {
	//
	//delete state;
	//state = NULL;
	//}
	//if(version != NULL) {
	//
	//delete version;
	//version = NULL;
	//}
	//if(symbolicName != NULL) {
	//
	//delete symbolicName;
	//symbolicName = NULL;
	//}
	//if(category != NULL) {
	//
	//delete category;
	//category = NULL;
	//}
	//if(props != NULL) {
	//props.RemoveAll(true);
	//delete props;
	//props = NULL;
	//}
	//
}

void
BundleData::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *fragmentKey = "fragment";
	node = json_object_get_member(pJsonObject, fragmentKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&fragment, node, "bool", "");
		} else {
			
		}
	}
	const gchar *stateRawKey = "stateRaw";
	node = json_object_get_member(pJsonObject, stateRawKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&stateRaw, node, "int", "");
		} else {
			
		}
	}
	const gchar *stateKey = "state";
	node = json_object_get_member(pJsonObject, stateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&state, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *versionKey = "version";
	node = json_object_get_member(pJsonObject, versionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&version, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *symbolicNameKey = "symbolicName";
	node = json_object_get_member(pJsonObject, symbolicNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&symbolicName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *categoryKey = "category";
	node = json_object_get_member(pJsonObject, categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&category, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *propsKey = "props";
	node = json_object_get_member(pJsonObject, propsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<BundleDataProp> new_list;
			BundleDataProp inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BundleDataProp")) {
					jsonToValue(&inst, temp_json, "BundleDataProp", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			props = new_list;
		}
		
	}
}

BundleData::BundleData(char* json)
{
	this->fromJson(json);
}

char*
BundleData::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("bool")) {
		bool obj = getFragment();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *fragmentKey = "fragment";
	json_object_set_member(pJsonObject, fragmentKey, node);
	if (isprimitive("int")) {
		int obj = getStateRaw();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *stateRawKey = "stateRaw";
	json_object_set_member(pJsonObject, stateRawKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getState();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *stateKey = "state";
	json_object_set_member(pJsonObject, stateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVersion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *versionKey = "version";
	json_object_set_member(pJsonObject, versionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSymbolicName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *symbolicNameKey = "symbolicName";
	json_object_set_member(pJsonObject, symbolicNameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCategory();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *categoryKey = "category";
	json_object_set_member(pJsonObject, categoryKey, node);
	if (isprimitive("BundleDataProp")) {
		list<BundleDataProp> new_list = static_cast<list <BundleDataProp> > (getProps());
		node = converttoJson(&new_list, "BundleDataProp", "array");
	} else {
		node = json_node_alloc();
		list<BundleDataProp> new_list = static_cast<list <BundleDataProp> > (getProps());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BundleDataProp>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BundleDataProp obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *propsKey = "props";
	json_object_set_member(pJsonObject, propsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
BundleData::getId()
{
	return id;
}

void
BundleData::setId(int  id)
{
	this->id = id;
}

std::string
BundleData::getName()
{
	return name;
}

void
BundleData::setName(std::string  name)
{
	this->name = name;
}

bool
BundleData::getFragment()
{
	return fragment;
}

void
BundleData::setFragment(bool  fragment)
{
	this->fragment = fragment;
}

int
BundleData::getStateRaw()
{
	return stateRaw;
}

void
BundleData::setStateRaw(int  stateRaw)
{
	this->stateRaw = stateRaw;
}

std::string
BundleData::getState()
{
	return state;
}

void
BundleData::setState(std::string  state)
{
	this->state = state;
}

std::string
BundleData::getVersion()
{
	return version;
}

void
BundleData::setVersion(std::string  version)
{
	this->version = version;
}

std::string
BundleData::getSymbolicName()
{
	return symbolicName;
}

void
BundleData::setSymbolicName(std::string  symbolicName)
{
	this->symbolicName = symbolicName;
}

std::string
BundleData::getCategory()
{
	return category;
}

void
BundleData::setCategory(std::string  category)
{
	this->category = category;
}

std::list<BundleDataProp>
BundleData::getProps()
{
	return props;
}

void
BundleData::setProps(std::list <BundleDataProp> props)
{
	this->props = props;
}


