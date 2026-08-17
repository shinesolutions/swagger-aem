

#include "TruststoreItems.h"

using namespace Tiny;

TruststoreItems::TruststoreItems()
{
	alias = std::string();
	entryType = std::string();
	subject = std::string();
	issuer = std::string();
	notBefore = std::string();
	notAfter = std::string();
	serialNumber = int(0);
}

TruststoreItems::TruststoreItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

TruststoreItems::~TruststoreItems()
{

}

void
TruststoreItems::fromJson(std::string jsonObj)
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

    const char *subjectKey = "subject";

    if(object.has_key(subjectKey))
    {
        bourne::json value = object[subjectKey];



        jsonToValue(&subject, value, "std::string");


    }

    const char *issuerKey = "issuer";

    if(object.has_key(issuerKey))
    {
        bourne::json value = object[issuerKey];



        jsonToValue(&issuer, value, "std::string");


    }

    const char *notBeforeKey = "notBefore";

    if(object.has_key(notBeforeKey))
    {
        bourne::json value = object[notBeforeKey];



        jsonToValue(&notBefore, value, "std::string");


    }

    const char *notAfterKey = "notAfter";

    if(object.has_key(notAfterKey))
    {
        bourne::json value = object[notAfterKey];



        jsonToValue(&notAfter, value, "std::string");


    }

    const char *serialNumberKey = "serialNumber";

    if(object.has_key(serialNumberKey))
    {
        bourne::json value = object[serialNumberKey];



        jsonToValue(&serialNumber, value, "int");


    }


}

bourne::json
TruststoreItems::toJson()
{
    bourne::json object = bourne::json::object();





    object["alias"] = getAlias();






    object["entryType"] = getEntryType();






    object["subject"] = getSubject();






    object["issuer"] = getIssuer();






    object["notBefore"] = getNotBefore();






    object["notAfter"] = getNotAfter();






    object["serialNumber"] = getSerialNumber();



    return object;

}

std::string
TruststoreItems::getAlias()
{
	return alias;
}

void
TruststoreItems::setAlias(std::string alias)
{
	this->alias = alias;
}

std::string
TruststoreItems::getEntryType()
{
	return entryType;
}

void
TruststoreItems::setEntryType(std::string entryType)
{
	this->entryType = entryType;
}

std::string
TruststoreItems::getSubject()
{
	return subject;
}

void
TruststoreItems::setSubject(std::string subject)
{
	this->subject = subject;
}

std::string
TruststoreItems::getIssuer()
{
	return issuer;
}

void
TruststoreItems::setIssuer(std::string issuer)
{
	this->issuer = issuer;
}

std::string
TruststoreItems::getNotBefore()
{
	return notBefore;
}

void
TruststoreItems::setNotBefore(std::string notBefore)
{
	this->notBefore = notBefore;
}

std::string
TruststoreItems::getNotAfter()
{
	return notAfter;
}

void
TruststoreItems::setNotAfter(std::string notAfter)
{
	this->notAfter = notAfter;
}

int
TruststoreItems::getSerialNumber()
{
	return serialNumber;
}

void
TruststoreItems::setSerialNumber(int serialNumber)
{
	this->serialNumber = serialNumber;
}



