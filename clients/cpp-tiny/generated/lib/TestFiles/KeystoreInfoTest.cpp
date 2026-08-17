
#include "KeystoreInfo.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_KeystoreInfo_exists_is_assigned_from_json()
{




    bourne::json input =
    {
        "exists", true
    };

    KeystoreInfo obj(input.dump());

    TEST_ASSERT(true == obj.isExists());




}




void test_KeystoreInfo_exists_is_converted_to_json()
{


    bourne::json input =
    {
        "exists", true
    };

    KeystoreInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["exists"] == output["exists"]);


}


