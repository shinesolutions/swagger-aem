#ifndef keystore_chain_items_TEST
#define keystore_chain_items_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define keystore_chain_items_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/keystore_chain_items.h"
keystore_chain_items_t* instantiate_keystore_chain_items(int include_optional);



keystore_chain_items_t* instantiate_keystore_chain_items(int include_optional) {
  keystore_chain_items_t* keystore_chain_items = NULL;
  if (include_optional) {
    keystore_chain_items = keystore_chain_items_create(
      "0",
      "0",
      "0",
      "0",
      56
    );
  } else {
    keystore_chain_items = keystore_chain_items_create(
      "0",
      "0",
      "0",
      "0",
      56
    );
  }

  return keystore_chain_items;
}


#ifdef keystore_chain_items_MAIN

void test_keystore_chain_items(int include_optional) {
    keystore_chain_items_t* keystore_chain_items_1 = instantiate_keystore_chain_items(include_optional);

	cJSON* jsonkeystore_chain_items_1 = keystore_chain_items_convertToJSON(keystore_chain_items_1);
	printf("keystore_chain_items :\n%s\n", cJSON_Print(jsonkeystore_chain_items_1));
	keystore_chain_items_t* keystore_chain_items_2 = keystore_chain_items_parseFromJSON(jsonkeystore_chain_items_1);
	cJSON* jsonkeystore_chain_items_2 = keystore_chain_items_convertToJSON(keystore_chain_items_2);
	printf("repeating keystore_chain_items:\n%s\n", cJSON_Print(jsonkeystore_chain_items_2));
}

int main() {
  test_keystore_chain_items(1);
  test_keystore_chain_items(0);

  printf("Hello world \n");
  return 0;
}

#endif // keystore_chain_items_MAIN
#endif // keystore_chain_items_TEST
