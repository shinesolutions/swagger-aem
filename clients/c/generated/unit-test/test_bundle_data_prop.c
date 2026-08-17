#ifndef bundle_data_prop_TEST
#define bundle_data_prop_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bundle_data_prop_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bundle_data_prop.h"
bundle_data_prop_t* instantiate_bundle_data_prop(int include_optional);



bundle_data_prop_t* instantiate_bundle_data_prop(int include_optional) {
  bundle_data_prop_t* bundle_data_prop = NULL;
  if (include_optional) {
    bundle_data_prop = bundle_data_prop_create(
      "0",
      "0"
    );
  } else {
    bundle_data_prop = bundle_data_prop_create(
      "0",
      "0"
    );
  }

  return bundle_data_prop;
}


#ifdef bundle_data_prop_MAIN

void test_bundle_data_prop(int include_optional) {
    bundle_data_prop_t* bundle_data_prop_1 = instantiate_bundle_data_prop(include_optional);

	cJSON* jsonbundle_data_prop_1 = bundle_data_prop_convertToJSON(bundle_data_prop_1);
	printf("bundle_data_prop :\n%s\n", cJSON_Print(jsonbundle_data_prop_1));
	bundle_data_prop_t* bundle_data_prop_2 = bundle_data_prop_parseFromJSON(jsonbundle_data_prop_1);
	cJSON* jsonbundle_data_prop_2 = bundle_data_prop_convertToJSON(bundle_data_prop_2);
	printf("repeating bundle_data_prop:\n%s\n", cJSON_Print(jsonbundle_data_prop_2));
}

int main() {
  test_bundle_data_prop(1);
  test_bundle_data_prop(0);

  printf("Hello world \n");
  return 0;
}

#endif // bundle_data_prop_MAIN
#endif // bundle_data_prop_TEST
