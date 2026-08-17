

#include "KeystoreInfo.h"

using namespace Tiny;

KeystoreInfo::KeystoreInfo()
{
	aliases = std::list<KeystoreItems>();
	exists = bool(false);
}

KeystoreInfo::KeystoreInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeystoreInfo::~KeystoreInfo()
{

}

void
KeystoreInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aliasesKey = "aliases";

    if(object.has_key(aliasesKey))
    {
        bourne::json value = object[aliasesKey];


        std::list<KeystoreItems> aliases_list;
        KeystoreItems element;
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
KeystoreInfo::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<KeystoreItems> aliases_list = getAliases();
    bourne::json aliases_arr = bourne::json::array();

    for(auto& var : aliases_list)
    {
        KeystoreItems obj = var;
        aliases_arr.append(obj.toJson());
    }
    object["aliases"] = aliases_arr;







    object["exists"] = isExists();



    return object;

}

std::list<KeystoreItems>
KeystoreInfo::getAliases()
{
	return aliases;
}

void
KeystoreInfo::setAliases(std::list<KeystoreItems> aliases)
{
	this->aliases = aliases;
}

bool
KeystoreInfo::isExists()
{
	return exists;
}

void
KeystoreInfo::setExists(bool exists)
{
	this->exists = exists;
}



