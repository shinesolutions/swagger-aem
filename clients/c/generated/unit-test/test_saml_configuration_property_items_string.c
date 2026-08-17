#ifndef saml_configuration_property_items_string_TEST
#define saml_configuration_property_items_string_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define saml_configuration_property_items_string_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/saml_configuration_property_items_string.h"
saml_configuration_property_items_string_t* instantiate_saml_configuration_property_items_string(int include_optional);



saml_configuration_property_items_string_t* instantiate_saml_configuration_property_items_string(int include_optional) {
  saml_configuration_property_items_string_t* saml_configuration_property_items_string = NULL;
  if (include_optional) {
    saml_configuration_property_items_string = saml_configuration_property_items_string_create(
      "0",
      1,
      1,
      56,
      "0",
      "0"
    );
  } else {
    saml_configuration_property_items_string = saml_configuration_property_items_string_create(
      "0",
      1,
      1,
      56,
      "0",
      "0"
    );
  }

  return saml_configuration_property_items_string;
}


#ifdef saml_configuration_property_items_string_MAIN

void test_saml_configuration_property_items_string(int include_optional) {
    saml_configuration_property_items_string_t* saml_configuration_property_items_string_1 = instantiate_saml_configuration_property_items_string(include_optional);

	cJSON* jsonsaml_configuration_property_items_string_1 = saml_configuration_property_items_string_convertToJSON(saml_configuration_property_items_string_1);
	printf("saml_configuration_property_items_string :\n%s\n", cJSON_Print(jsonsaml_configuration_property_items_string_1));
	saml_configuration_property_items_string_t* saml_configuration_property_items_string_2 = saml_configuration_property_items_string_parseFromJSON(jsonsaml_configuration_property_items_string_1);
	cJSON* jsonsaml_configuration_property_items_string_2 = saml_configuration_property_items_string_convertToJSON(saml_configuration_property_items_string_2);
	printf("repeating saml_configuration_property_items_string:\n%s\n", cJSON_Print(jsonsaml_configuration_property_items_string_2));
}

int main() {
  test_saml_configuration_property_items_string(1);
  test_saml_configuration_property_items_string(0);

  printf("Hello world \n");
  return 0;
}

#endif // saml_configuration_property_items_string_MAIN
#endif // saml_configuration_property_items_string_TEST
