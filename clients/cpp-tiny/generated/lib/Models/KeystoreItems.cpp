

#include "KeystoreItems.h"

using namespace Tiny;

KeystoreItems::KeystoreItems()
{
	alias = std::string();
	entryType = std::string();
	algorithm = std::string();
	format = std::string();
	chain = std::list<KeystoreChainItems>();
}

KeystoreItems::KeystoreItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeystoreItems::~KeystoreItems()
{

}

void
KeystoreItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aliasKey = "alias";

    if(object.has_key(aliasKey))
    {
        bourne::json value = object[aliasKey];



        jsonToValue(&alias, value, "std::string");


    }

    const char *entryTypeKey = "entryType";

    if(object.has_key(entryTypeKey))
    {
        bourne::json value = object[entryTypeKey];



        jsonToValue(&entryType, value, "std::string");


    }

    const char *algorithmKey = "algorithm";

    if(object.has_key(algorithmKey))
    {
        bourne::json value = object[algorithmKey];



        jsonToValue(&algorithm, value, "std::string");


    }

    const char *formatKey = "format";

    if(object.has_key(formatKey))
    {
        bourne::json value = object[formatKey];



        jsonToValue(&format, value, "std::string");


    }

    const char *chainKey = "chain";

    if(object.has_key(chainKey))
    {
        bourne::json value = object[chainKey];


        std::list<KeystoreChainItems> chain_list;
        KeystoreChainItems element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            chain_list.push_back(element);
        }
        chain = chain_list;


    }


}

bourne::json
KeystoreItems::toJson()
{
    bourne::json object = bourne::json::object();





    object["alias"] = getAlias();






    object["entryType"] = getEntryType();






    object["algorithm"] = getAlgorithm();






    object["format"] = getFormat();





    std::list<KeystoreChainItems> chain_list = getChain();
    bourne::json chain_arr = bourne::json::array();

    for(auto& var : chain_list)
    {
        KeystoreChainItems obj = var;
        chain_arr.append(obj.toJson());
    }
    object["chain"] = chain_arr;




    return object;

}

std::string
KeystoreItems::getAlias()
{
	return alias;
}

void
KeystoreItems::setAlias(std::string alias)
{
	this->alias = alias;
}

std::string
KeystoreItems::getEntryType()
{
	return entryType;
}

void
KeystoreItems::setEntryType(std::string entryType)
{
	this->entryType = entryType;
}

std::string
KeystoreItems::getAlgorithm()
{
	return algorithm;
}

void
KeystoreItems::setAlgorithm(std::string algorithm)
{
	this->algorithm = algorithm;
}

std::string
KeystoreItems::getFormat()
{
	return format;
}

void
KeystoreItems::setFormat(std::string format)
{
	this->format = format;
}

std::list<KeystoreChainItems>
KeystoreItems::getChain()
{
	return chain;
}

void
KeystoreItems::setChain(std::list<KeystoreChainItems> chain)
{
	this->chain = chain;
}



