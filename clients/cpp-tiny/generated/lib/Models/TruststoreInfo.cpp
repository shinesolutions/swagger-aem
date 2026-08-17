

#include "TruststoreInfo.h"

using namespace Tiny;

TruststoreInfo::TruststoreInfo()
{
	aliases = std::list<TruststoreItems>();
	exists = bool(false);
}

TruststoreInfo::TruststoreInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

TruststoreInfo::~TruststoreInfo()
{

}

void
TruststoreInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aliasesKey = "aliases";

    if(object.has_key(aliasesKey))
    {
        bourne::json value = object[aliasesKey];


        std::list<TruststoreItems> aliases_list;
        TruststoreItems element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            aliases_list.push_back(element);
        }
        aliases = aliases_list;


    }

    const char *existsKey = "exists";

    if(object.has_key(existsKey))
    {
        bourne::json value = object[existsKey];



        jsonToValue(&exists, value, "bool");


    }


}

bourne::json
TruststoreInfo::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<TruststoreItems> aliases_list = getAliases();
    bourne::json aliases_arr = bourne::json::array();

    for(auto& var : aliases_list)
    {
        TruststoreItems obj = var;
        aliases_arr.append(obj.toJson());
    }
    object["aliases"] = aliases_arr;







    object["exists"] = isExists();



    return object;

}

std::list<TruststoreItems>
TruststoreInfo::getAliases()
{
	return aliases;
}

void
TruststoreInfo::setAliases(std::list<TruststoreItems> aliases)
{
	this->aliases = aliases;
}

bool
TruststoreInfo::isExists()
{
	return exists;
}

void
TruststoreInfo::setExists(bool exists)
{
	this->exists = exists;
}



