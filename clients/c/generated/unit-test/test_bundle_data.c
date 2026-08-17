#ifndef bundle_data_TEST
#define bundle_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bundle_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bundle_data.h"
bundle_data_t* instantiate_bundle_data(int include_optional);



bundle_data_t* instantiate_bundle_data(int include_optional) {
  bundle_data_t* bundle_data = NULL;
  if (include_optional) {
    bundle_data = bundle_data_create(
      56,
      "0",
      1,
      56,
      "0",
      "0",
      "0",
      "0",
      list_createList()
    );
  } else {
    bundle_data = bundle_data_create(
      56,
      "0",
      1,
      56,
      "0",
      "0",
      "0",
      "0",
      list_createList()
    );
  }

  return bundle_data;
}


#ifdef bundle_data_MAIN

void test_bundle_data(int include_optional) {
    bundle_data_t* bundle_data_1 = instantiate_bundle_data(include_optional);

	cJSON* jsonbundle_data_1 = bundle_data_convertToJSON(bundle_data_1);
	printf("bundle_data :\n%s\n", cJSON_Print(jsonbundle_data_1));
	bundle_data_t* bundle_data_2 = bundle_data_parseFromJSON(jsonbundle_data_1);
	cJSON* jsonbundle_data_2 = bundle_data_convertToJSON(bundle_data_2);
	printf("repeating bundle_data:\n%s\n", cJSON_Print(jsonbundle_data_2));
}

int main() {
  test_bundle_data(1);
  test_bundle_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // bundle_data_MAIN
#endif // bundle_data_TEST
