#ifndef keystore_info_TEST
#define keystore_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define keystore_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/keystore_info.h"
keystore_info_t* instantiate_keystore_info(int include_optional);



keystore_info_t* instantiate_keystore_info(int include_optional) {
  keystore_info_t* keystore_info = NULL;
  if (include_optional) {
    keystore_info = keystore_info_create(
      list_createList(),
      1
    );
  } else {
    keystore_info = keystore_info_create(
      list_createList(),
      1
    );
  }

  return keystore_info;
}


#ifdef keystore_info_MAIN

void test_keystore_info(int include_optional) {
    keystore_info_t* keystore_info_1 = instantiate_keystore_info(include_optional);

	cJSON* jsonkeystore_info_1 = keystore_info_convertToJSON(keystore_info_1);
	printf("keystore_info :\n%s\n", cJSON_Print(jsonkeystore_info_1));
	keystore_info_t* keystore_info_2 = keystore_info_parseFromJSON(jsonkeystore_info_1);
	cJSON* jsonkeystore_info_2 = keystore_info_convertToJSON(keystore_info_2);
	printf("repeating keystore_info:\n%s\n", cJSON_Print(jsonkeystore_info_2));
}

int main() {
  test_keystore_info(1);
  test_keystore_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // keystore_info_MAIN
#endif // keystore_info_TEST
