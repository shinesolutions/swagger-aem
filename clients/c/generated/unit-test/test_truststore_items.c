#ifndef truststore_items_TEST
#define truststore_items_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define truststore_items_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/truststore_items.h"
truststore_items_t* instantiate_truststore_items(int include_optional);



truststore_items_t* instantiate_truststore_items(int include_optional) {
  truststore_items_t* truststore_items = NULL;
  if (include_optional) {
    truststore_items = truststore_items_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      56
    );
  } else {
    truststore_items = truststore_items_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      56
    );
  }

  return truststore_items;
}


#ifdef truststore_items_MAIN

void test_truststore_items(int include_optional) {
    truststore_items_t* truststore_items_1 = instantiate_truststore_items(include_optional);

	cJSON* jsontruststore_items_1 = truststore_items_convertToJSON(truststore_items_1);
	printf("truststore_items :\n%s\n", cJSON_Print(jsontruststore_items_1));
	truststore_items_t* truststore_items_2 = truststore_items_parseFromJSON(jsontruststore_items_1);
	cJSON* jsontruststore_items_2 = truststore_items_convertToJSON(truststore_items_2);
	printf("repeating truststore_items:\n%s\n", cJSON_Print(jsontruststore_items_2));
}

int main() {
  test_truststore_items(1);
  test_truststore_items(0);

  printf("Hello world \n");
  return 0;
}

#endif // truststore_items_MAIN
#endif // truststore_items_TEST
