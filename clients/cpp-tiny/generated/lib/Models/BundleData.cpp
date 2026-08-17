

#include "BundleData.h"

using namespace Tiny;

BundleData::BundleData()
{
	id = int(0);
	name = std::string();
	fragment = bool(false);
	stateRaw = int(0);
	state = std::string();
	version = std::string();
	symbolicName = std::string();
	category = std::string();
	props = std::list<BundleDataProp>();
}

BundleData::BundleData(std::string jsonString)
{
	this->fromJson(jsonString);
}

BundleData::~BundleData()
{

}

void
BundleData::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *fragmentKey = "fragment";

    if(object.has_key(fragmentKey))
    {
        bourne::json value = object[fragmentKey];



        jsonToValue(&fragment, value, "bool");


    }

    const char *stateRawKey = "stateRaw";

    if(object.has_key(stateRawKey))
    {
        bourne::json value = object[stateRawKey];



        jsonToValue(&stateRaw, value, "int");


    }

    const char *stateKey = "state";

    if(object.has_key(stateKey))
    {
        bourne::json value = object[stateKey];



        jsonToValue(&state, value, "std::string");


    }

    const char *versionKey = "version";

    if(object.has_key(versionKey))
    {
        bourne::json value = object[versionKey];



        jsonToValue(&version, value, "std::string");


    }

    const char *symbolicNameKey = "symbolicName";

    if(object.has_key(symbolicNameKey))
    {
        bourne::json value = object[symbolicNameKey];



        jsonToValue(&symbolicName, value, "std::string");


    }

    const char *categoryKey = "category";

    if(object.has_key(categoryKey))
    {
        bourne::json value = object[categoryKey];



        jsonToValue(&category, value, "std::string");


    }

    const char *propsKey = "props";

    if(object.has_key(propsKey))
    {
        bourne::json value = object[propsKey];


        std::list<BundleDataProp> props_list;
        BundleDataProp element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            props_list.push_back(element);
        }
        props = props_list;


    }


}

bourne::json
BundleData::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["fragment"] = isFragment();






    object["stateRaw"] = getStateRaw();






    object["state"] = getState();






    object["version"] = getVersion();






    object["symbolicName"] = getSymbolicName();






    object["category"] = getCategory();





    std::list<BundleDataProp> props_list = getProps();
    bourne::json props_arr = bourne::json::array();

    for(auto& var : props_list)
    {
        BundleDataProp obj = var;
        props_arr.append(obj.toJson());
    }
    object["props"] = props_arr;




    return object;

}

int
BundleData::getId()
{
	return id;
}

void
BundleData::setId(int id)
{
	this->id = id;
}

std::string
BundleData::getName()
{
	return name;
}

void
BundleData::setName(std::string name)
{
	this->name = name;
}

bool
BundleData::isFragment()
{
	return fragment;
}

void
BundleData::setFragment(bool fragment)
{
	this->fragment = fragment;
}

int
BundleData::getStateRaw()
{
	return stateRaw;
}

void
BundleData::setStateRaw(int stateRaw)
{
	this->stateRaw = stateRaw;
}

std::string
BundleData::getState()
{
	return state;
}

void
BundleData::setState(std::string state)
{
	this->state = state;
}

std::string
BundleData::getVersion()
{
	return version;
}

void
BundleData::setVersion(std::string version)
{
	this->version = version;
}

std::string
BundleData::getSymbolicName()
{
	return symbolicName;
}

void
BundleData::setSymbolicName(std::string symbolicName)
{
	this->symbolicName = symbolicName;
}

std::string
BundleData::getCategory()
{
	return category;
}

void
BundleData::setCategory(std::string category)
{
	this->category = category;
}

std::list<BundleDataProp>
BundleData::getProps()
{
	return props;
}

void
BundleData::setProps(std::list<BundleDataProp> props)
{
	this->props = props;
}



