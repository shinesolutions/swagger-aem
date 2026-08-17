
#include "KeystoreChainItems.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_KeystoreChainItems_subject_is_assigned_from_json()
{


    bourne::json input =
    {
        "subject", "hello"
    };

    KeystoreChainItems obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSubject().c_str());






}


void test_KeystoreChainItems_issuer_is_assigned_from_json()
{


    bourne::json input =
    {
        "issuer", "hello"
    };

    KeystoreChainItems obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getIssuer().c_str());






}


void test_KeystoreChainItems_notBefore_is_assigned_from_json()
{


    bourne::json input =
    {
        "notBefore", "hello"
    };

    KeystoreChainItems obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNotBefore().c_str());






}


void test_KeystoreChainItems_notAfter_is_assigned_from_json()
{


    bourne::json input =
    {
        "notAfter", "hello"
    };

    KeystoreChainItems obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNotAfter().c_str());






}


void test_KeystoreChainItems_serialNumber_is_assigned_from_json()
{
    bourne::json input =
    {
        "serialNumber", 1
    };

    KeystoreChainItems obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSerialNumber());








}



void test_KeystoreChainItems_subject_is_converted_to_json()
{

    bourne::json input =
    {
        "subject", "hello"
    };

    KeystoreChainItems obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["subject"] == output["subject"]);



}


void test_KeystoreChainItems_issuer_is_converted_to_json()
{

    bourne::json input =
    {
        "issuer", "hello"
    };

    KeystoreChainItems obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["issuer"] == output["issuer"]);



}


void test_KeystoreChainItems_notBefore_is_converted_to_json()
{

    bourne::json input =
    {
        "notBefore", "hello"
    };

    KeystoreChainItems obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["notBefore"] == output["notBefore"]);



}


void test_KeystoreChainItems_notAfter_is_converted_to_json()
{

    bourne::json input =
    {
        "notAfter", "hello"
    };

    KeystoreChainItems obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["notAfter"] == output["notAfter"]);



}


void test_KeystoreChainItems_serialNumber_is_converted_to_json()
{
    bourne::json input =
    {
        "serialNumber", 1
    };

    KeystoreChainItems obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["serialNumber"] == output["serialNumber"]);




}


