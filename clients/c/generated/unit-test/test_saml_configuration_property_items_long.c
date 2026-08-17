#ifndef saml_configuration_property_items_long_TEST
#define saml_configuration_property_items_long_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define saml_configuration_property_items_long_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/saml_configuration_property_items_long.h"
saml_configuration_property_items_long_t* instantiate_saml_configuration_property_items_long(int include_optional);



saml_configuration_property_items_long_t* instantiate_saml_configuration_property_items_long(int include_optional) {
  saml_configuration_property_items_long_t* saml_configuration_property_items_long = NULL;
  if (include_optional) {
    saml_configuration_property_items_long = saml_configuration_property_items_long_create(
      "0",
      1,
      1,
      56,
      56,
      "0"
    );
  } else {
    saml_configuration_property_items_long = saml_configuration_property_items_long_create(
      "0",
      1,
      1,
      56,
      56,
      "0"
    );
  }

  return saml_configuration_property_items_long;
}


#ifdef saml_configuration_property_items_long_MAIN

void test_saml_configuration_property_items_long(int include_optional) {
    saml_configuration_property_items_long_t* saml_configuration_property_items_long_1 = instantiate_saml_configuration_property_items_long(include_optional);

	cJSON* jsonsaml_configuration_property_items_long_1 = saml_configuration_property_items_long_convertToJSON(saml_configuration_property_items_long_1);
	printf("saml_configuration_property_items_long :\n%s\n", cJSON_Print(jsonsaml_configuration_property_items_long_1));
	saml_configuration_property_items_long_t* saml_configuration_property_items_long_2 = saml_configuration_property_items_long_parseFromJSON(jsonsaml_configuration_property_items_long_1);
	cJSON* jsonsaml_configuration_property_items_long_2 = saml_configuration_property_items_long_convertToJSON(saml_configuration_property_items_long_2);
	printf("repeating saml_configuration_property_items_long:\n%s\n", cJSON_Print(jsonsaml_configuration_property_items_long_2));
}

int main() {
  test_saml_configuration_property_items_long(1);
  test_saml_configuration_property_items_long(0);

  printf("Hello world \n");
  return 0;
}

#endif // saml_configuration_property_items_long_MAIN
#endif // saml_configuration_property_items_long_TEST
