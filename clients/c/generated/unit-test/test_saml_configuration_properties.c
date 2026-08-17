#ifndef saml_configuration_properties_TEST
#define saml_configuration_properties_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define saml_configuration_properties_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/saml_configuration_properties.h"
saml_configuration_properties_t* instantiate_saml_configuration_properties(int include_optional);

#include "test_saml_configuration_property_items_array.c"
#include "test_saml_configuration_property_items_long.c"
#include "test_saml_configuration_property_items_string.c"
#include "test_saml_configuration_property_items_string.c"
#include "test_saml_configuration_property_items_boolean.c"
#include "test_saml_configuration_property_items_string.c"
#include "test_saml_configuration_property_items_string.c"
#include "test_saml_configuration_property_items_string.c"
#include "test_saml_configuration_property_items_string.c"
#include "test_saml_configuration_property_items_string.c"
#include "test_saml_configuration_property_items_string.c"
#include "test_saml_configuration_property_items_boolean.c"
#include "test_saml_configuration_property_items_boolean.c"
#include "test_saml_configuration_property_items_boolean.c"
#include "test_saml_configuration_property_items_string.c"
#include "test_saml_configuration_property_items_array.c"
#include "test_saml_configuration_property_items_string.c"
#include "test_saml_configuration_property_items_array.c"
#include "test_saml_configuration_property_items_boolean.c"
#include "test_saml_configuration_property_items_string.c"
#include "test_saml_configuration_property_items_long.c"
#include "test_saml_configuration_property_items_string.c"
#include "test_saml_configuration_property_items_string.c"
#include "test_saml_configuration_property_items_string.c"


saml_configuration_properties_t* instantiate_saml_configuration_properties(int include_optional) {
  saml_configuration_properties_t* saml_configuration_properties = NULL;
  if (include_optional) {
    saml_configuration_properties = saml_configuration_properties_create(
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_array(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_long(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_string(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_string(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_boolean(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_string(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_string(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_string(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_string(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_string(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_string(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_boolean(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_boolean(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_boolean(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_string(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_array(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_string(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_array(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_boolean(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_string(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_long(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_string(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_string(0),
       // false, not to have infinite recursion
      instantiate_saml_configuration_property_items_string(0)
    );
  } else {
    saml_configuration_properties = saml_configuration_properties_create(
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL
    );
  }

  return saml_configuration_properties;
}


#ifdef saml_configuration_properties_MAIN

void test_saml_configuration_properties(int include_optional) {
    saml_configuration_properties_t* saml_configuration_properties_1 = instantiate_saml_configuration_properties(include_optional);

	cJSON* jsonsaml_configuration_properties_1 = saml_configuration_properties_convertToJSON(saml_configuration_properties_1);
	printf("saml_configuration_properties :\n%s\n", cJSON_Print(jsonsaml_configuration_properties_1));
	saml_configuration_properties_t* saml_configuration_properties_2 = saml_configuration_properties_parseFromJSON(jsonsaml_configuration_properties_1);
	cJSON* jsonsaml_configuration_properties_2 = saml_configuration_properties_convertToJSON(saml_configuration_properties_2);
	printf("repeating saml_configuration_properties:\n%s\n", cJSON_Print(jsonsaml_configuration_properties_2));
}

int main() {
  test_saml_configuration_properties(1);
  test_saml_configuration_properties(0);

  printf("Hello world \n");
  return 0;
}

#endif // saml_configuration_properties_MAIN
#endif // saml_configuration_properties_TEST
