#ifndef bundle_info_TEST
#define bundle_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bundle_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bundle_info.h"
bundle_info_t* instantiate_bundle_info(int include_optional);



bundle_info_t* instantiate_bundle_info(int include_optional) {
  bundle_info_t* bundle_info = NULL;
  if (include_optional) {
    bundle_info = bundle_info_create(
      "0",
      list_createList(),
      list_createList()
    );
  } else {
    bundle_info = bundle_info_create(
      "0",
      list_createList(),
      list_createList()
    );
  }

  return bundle_info;
}


#ifdef bundle_info_MAIN

void test_bundle_info(int include_optional) {
    bundle_info_t* bundle_info_1 = instantiate_bundle_info(include_optional);

	cJSON* jsonbundle_info_1 = bundle_info_convertToJSON(bundle_info_1);
	printf("bundle_info :\n%s\n", cJSON_Print(jsonbundle_info_1));
	bundle_info_t* bundle_info_2 = bundle_info_parseFromJSON(jsonbundle_info_1);
	cJSON* jsonbundle_info_2 = bundle_info_convertToJSON(bundle_info_2);
	printf("repeating bundle_info:\n%s\n", cJSON_Print(jsonbundle_info_2));
}

int main() {
  test_bundle_info(1);
  test_bundle_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // bundle_info_MAIN
#endif // bundle_info_TEST
