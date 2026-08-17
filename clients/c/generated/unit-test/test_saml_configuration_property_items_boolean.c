#ifndef saml_configuration_property_items_boolean_TEST
#define saml_configuration_property_items_boolean_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define saml_configuration_property_items_boolean_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/saml_configuration_property_items_boolean.h"
saml_configuration_property_items_boolean_t* instantiate_saml_configuration_property_items_boolean(int include_optional);



saml_configuration_property_items_boolean_t* instantiate_saml_configuration_property_items_boolean(int include_optional) {
  saml_configuration_property_items_boolean_t* saml_configuration_property_items_boolean = NULL;
  if (include_optional) {
    saml_configuration_property_items_boolean = saml_configuration_property_items_boolean_create(
      "0",
      1,
      1,
      56,
      1,
      "0"
    );
  } else {
    saml_configuration_property_items_boolean = saml_configuration_property_items_boolean_create(
      "0",
      1,
      1,
      56,
      1,
      "0"
    );
  }

  return saml_configuration_property_items_boolean;
}


#ifdef saml_configuration_property_items_boolean_MAIN

void test_saml_configuration_property_items_boolean(int include_optional) {
    saml_configuration_property_items_boolean_t* saml_configuration_property_items_boolean_1 = instantiate_saml_configuration_property_items_boolean(include_optional);

	cJSON* jsonsaml_configuration_property_items_boolean_1 = saml_configuration_property_items_boolean_convertToJSON(saml_configuration_property_items_boolean_1);
	printf("saml_configuration_property_items_boolean :\n%s\n", cJSON_Print(jsonsaml_configuration_property_items_boolean_1));
	saml_configuration_property_items_boolean_t* saml_configuration_property_items_boolean_2 = saml_configuration_property_items_boolean_parseFromJSON(jsonsaml_configuration_property_items_boolean_1);
	cJSON* jsonsaml_configuration_property_items_boolean_2 = saml_configuration_property_items_boolean_convertToJSON(saml_configuration_property_items_boolean_2);
	printf("repeating saml_configuration_property_items_boolean:\n%s\n", cJSON_Print(jsonsaml_configuration_property_items_boolean_2));
}

int main() {
  test_saml_configuration_property_items_boolean(1);
  test_saml_configuration_property_items_boolean(0);

  printf("Hello world \n");
  return 0;
}

#endif // saml_configuration_property_items_boolean_MAIN
#endif // saml_configuration_property_items_boolean_TEST
