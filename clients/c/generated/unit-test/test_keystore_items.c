#ifndef keystore_items_TEST
#define keystore_items_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define keystore_items_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/keystore_items.h"
keystore_items_t* instantiate_keystore_items(int include_optional);



keystore_items_t* instantiate_keystore_items(int include_optional) {
  keystore_items_t* keystore_items = NULL;
  if (include_optional) {
    keystore_items = keystore_items_create(
      "0",
      "0",
      "0",
      "0",
      list_createList()
    );
  } else {
    keystore_items = keystore_items_create(
      "0",
      "0",
      "0",
      "0",
      list_createList()
    );
  }

  return keystore_items;
}


#ifdef keystore_items_MAIN

void test_keystore_items(int include_optional) {
    keystore_items_t* keystore_items_1 = instantiate_keystore_items(include_optional);

	cJSON* jsonkeystore_items_1 = keystore_items_convertToJSON(keystore_items_1);
	printf("keystore_items :\n%s\n", cJSON_Print(jsonkeystore_items_1));
	keystore_items_t* keystore_items_2 = keystore_items_parseFromJSON(jsonkeystore_items_1);
	cJSON* jsonkeystore_items_2 = keystore_items_convertToJSON(keystore_items_2);
	printf("repeating keystore_items:\n%s\n", cJSON_Print(jsonkeystore_items_2));
}

int main() {
  test_keystore_items(1);
  test_keystore_items(0);

  printf("Hello world \n");
  return 0;
}

#endif // keystore_items_MAIN
#endif // keystore_items_TEST
