

#include "BundleInfo.h"

using namespace Tiny;

BundleInfo::BundleInfo()
{
	status = std::string();
	s = std::list<int>();
	data = std::list<BundleData>();
}

BundleInfo::BundleInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

BundleInfo::~BundleInfo()
{

}

void
BundleInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }

    const char *sKey = "s";

    if(object.has_key(sKey))
    {
        bourne::json value = object[sKey];


        std::list<int> s_list;
        int element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "int");


            s_list.push_back(element);
        }
        s = s_list;


    }

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];


        std::list<BundleData> data_list;
        BundleData element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            data_list.push_back(element);
        }
        data = data_list;


    }


}

bourne::json
BundleInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["status"] = getStatus();





    std::list<int> s_list = getS();
    bourne::json s_arr = bourne::json::array();

    for(auto& var : s_list)
    {
        s_arr.append(var);
    }
    object["s"] = s_arr;








    std::list<BundleData> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        BundleData obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;




    return object;

}

std::string
BundleInfo::getStatus()
{
	return status;
}

void
BundleInfo::setStatus(std::string status)
{
	this->status = status;
}

std::list<int>
BundleInfo::getS()
{
	return s;
}

void
BundleInfo::setS(std::list<int> s)
{
	this->s = s;
}

std::list<BundleData>
BundleInfo::getData()
{
	return data;
}

void
BundleInfo::setData(std::list<BundleData> data)
{
	this->data = data;
}



