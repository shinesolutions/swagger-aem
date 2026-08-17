#ifndef saml_configuration_info_TEST
#define saml_configuration_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define saml_configuration_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/saml_configuration_info.h"
saml_configuration_info_t* instantiate_saml_configuration_info(int include_optional);

#include "test_saml_configuration_properties.c"


saml_configuration_info_t* instantiate_saml_configuration_info(int include_optional) {
  saml_configuration_info_t* saml_configuration_info = NULL;
  if (include_optional) {
    saml_configuration_info = saml_configuration_info_create(
      "0",
      "0",
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_saml_configuration_properties(0)
    );
  } else {
    saml_configuration_info = saml_configuration_info_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      NULL
    );
  }

  return saml_configuration_info;
}


#ifdef saml_configuration_info_MAIN

void test_saml_configuration_info(int include_optional) {
    saml_configuration_info_t* saml_configuration_info_1 = instantiate_saml_configuration_info(include_optional);

	cJSON* jsonsaml_configuration_info_1 = saml_configuration_info_convertToJSON(saml_configuration_info_1);
	printf("saml_configuration_info :\n%s\n", cJSON_Print(jsonsaml_configuration_info_1));
	saml_configuration_info_t* saml_configuration_info_2 = saml_configuration_info_parseFromJSON(jsonsaml_configuration_info_1);
	cJSON* jsonsaml_configuration_info_2 = saml_configuration_info_convertToJSON(saml_configuration_info_2);
	printf("repeating saml_configuration_info:\n%s\n", cJSON_Print(jsonsaml_configuration_info_2));
}

int main() {
  test_saml_configuration_info(1);
  test_saml_configuration_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // saml_configuration_info_MAIN
#endif // saml_configuration_info_TEST
