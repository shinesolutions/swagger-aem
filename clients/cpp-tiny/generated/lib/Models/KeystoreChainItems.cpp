

#include "KeystoreChainItems.h"

using namespace Tiny;

KeystoreChainItems::KeystoreChainItems()
{
	subject = std::string();
	issuer = std::string();
	notBefore = std::string();
	notAfter = std::string();
	serialNumber = int(0);
}

KeystoreChainItems::KeystoreChainItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeystoreChainItems::~KeystoreChainItems()
{

}

void
KeystoreChainItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
KeystoreChainItems::toJson()
{
    bourne::json object = bourne::json::object();





    object["subject"] = getSubject();






    object["issuer"] = getIssuer();






    object["notBefore"] = getNotBefore();






    object["notAfter"] = getNotAfter();






    object["serialNumber"] = getSerialNumber();



    return object;

}

std::string
KeystoreChainItems::getSubject()
{
	return subject;
}

void
KeystoreChainItems::setSubject(std::string subject)
{
	this->subject = subject;
}

std::string
KeystoreChainItems::getIssuer()
{
	return issuer;
}

void
KeystoreChainItems::setIssuer(std::string issuer)
{
	this->issuer = issuer;
}

std::string
KeystoreChainItems::getNotBefore()
{
	return notBefore;
}

void
KeystoreChainItems::setNotBefore(std::string notBefore)
{
	this->notBefore = notBefore;
}

std::string
KeystoreChainItems::getNotAfter()
{
	return notAfter;
}

void
KeystoreChainItems::setNotAfter(std::string notAfter)
{
	this->notAfter = notAfter;
}

int
KeystoreChainItems::getSerialNumber()
{
	return serialNumber;
}

void
KeystoreChainItems::setSerialNumber(int serialNumber)
{
	this->serialNumber = serialNumber;
}



