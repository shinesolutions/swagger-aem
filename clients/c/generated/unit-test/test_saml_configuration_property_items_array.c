#ifndef saml_configuration_property_items_array_TEST
#define saml_configuration_property_items_array_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define saml_configuration_property_items_array_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/saml_configuration_property_items_array.h"
saml_configuration_property_items_array_t* instantiate_saml_configuration_property_items_array(int include_optional);



saml_configuration_property_items_array_t* instantiate_saml_configuration_property_items_array(int include_optional) {
  saml_configuration_property_items_array_t* saml_configuration_property_items_array = NULL;
  if (include_optional) {
    saml_configuration_property_items_array = saml_configuration_property_items_array_create(
      "0",
      1,
      1,
      56,
      list_createList(),
      "0"
    );
  } else {
    saml_configuration_property_items_array = saml_configuration_property_items_array_create(
      "0",
      1,
      1,
      56,
      list_createList(),
      "0"
    );
  }

  return saml_configuration_property_items_array;
}


#ifdef saml_configuration_property_items_array_MAIN

void test_saml_configuration_property_items_array(int include_optional) {
    saml_configuration_property_items_array_t* saml_configuration_property_items_array_1 = instantiate_saml_configuration_property_items_array(include_optional);

	cJSON* jsonsaml_configuration_property_items_array_1 = saml_configuration_property_items_array_convertToJSON(saml_configuration_property_items_array_1);
	printf("saml_configuration_property_items_array :\n%s\n", cJSON_Print(jsonsaml_configuration_property_items_array_1));
	saml_configuration_property_items_array_t* saml_configuration_property_items_array_2 = saml_configuration_property_items_array_parseFromJSON(jsonsaml_configuration_property_items_array_1);
	cJSON* jsonsaml_configuration_property_items_array_2 = saml_configuration_property_items_array_convertToJSON(saml_configuration_property_items_array_2);
	printf("repeating saml_configuration_property_items_array:\n%s\n", cJSON_Print(jsonsaml_configuration_property_items_array_2));
}

int main() {
  test_saml_configuration_property_items_array(1);
  test_saml_configuration_property_items_array(0);

  printf("Hello world \n");
  return 0;
}

#endif // saml_configuration_property_items_array_MAIN
#endif // saml_configuration_property_items_array_TEST
