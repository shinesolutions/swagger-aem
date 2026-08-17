
#include "InstallStatus_status.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_InstallStatus_status_finished_is_assigned_from_json()
{




    bourne::json input =
    {
        "finished", true
    };

    InstallStatus_status obj(input.dump());

    TEST_ASSERT(true == obj.isFinished());




}


void test_InstallStatus_status_itemCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "itemCount", 1
    };

    InstallStatus_status obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getItemCount());








}



void test_InstallStatus_status_finished_is_converted_to_json()
{


    bourne::json input =
    {
        "finished", true
    };

    InstallStatus_status obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["finished"] == output["finished"]);


}


void test_InstallStatus_status_itemCount_is_converted_to_json()
{
    bourne::json input =
    {
        "itemCount", 1
    };

    InstallStatus_status obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["itemCount"] == output["itemCount"]);




}


