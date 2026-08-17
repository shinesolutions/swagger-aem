#ifndef truststore_info_TEST
#define truststore_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define truststore_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/truststore_info.h"
truststore_info_t* instantiate_truststore_info(int include_optional);



truststore_info_t* instantiate_truststore_info(int include_optional) {
  truststore_info_t* truststore_info = NULL;
  if (include_optional) {
    truststore_info = truststore_info_create(
      list_createList(),
      1
    );
  } else {
    truststore_info = truststore_info_create(
      list_createList(),
      1
    );
  }

  return truststore_info;
}


#ifdef truststore_info_MAIN

void test_truststore_info(int include_optional) {
    truststore_info_t* truststore_info_1 = instantiate_truststore_info(include_optional);

	cJSON* jsontruststore_info_1 = truststore_info_convertToJSON(truststore_info_1);
	printf("truststore_info :\n%s\n", cJSON_Print(jsontruststore_info_1));
	truststore_info_t* truststore_info_2 = truststore_info_parseFromJSON(jsontruststore_info_1);
	cJSON* jsontruststore_info_2 = truststore_info_convertToJSON(truststore_info_2);
	printf("repeating truststore_info:\n%s\n", cJSON_Print(jsontruststore_info_2));
}

int main() {
  test_truststore_info(1);
  test_truststore_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // truststore_info_MAIN
#endif // truststore_info_TEST
