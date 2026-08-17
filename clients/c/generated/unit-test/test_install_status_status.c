#ifndef install_status_status_TEST
#define install_status_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define install_status_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/install_status_status.h"
install_status_status_t* instantiate_install_status_status(int include_optional);



install_status_status_t* instantiate_install_status_status(int include_optional) {
  install_status_status_t* install_status_status = NULL;
  if (include_optional) {
    install_status_status = install_status_status_create(
      1,
      56
    );
  } else {
    install_status_status = install_status_status_create(
      1,
      56
    );
  }

  return install_status_status;
}


#ifdef install_status_status_MAIN

void test_install_status_status(int include_optional) {
    install_status_status_t* install_status_status_1 = instantiate_install_status_status(include_optional);

	cJSON* jsoninstall_status_status_1 = install_status_status_convertToJSON(install_status_status_1);
	printf("install_status_status :\n%s\n", cJSON_Print(jsoninstall_status_status_1));
	install_status_status_t* install_status_status_2 = install_status_status_parseFromJSON(jsoninstall_status_status_1);
	cJSON* jsoninstall_status_status_2 = install_status_status_convertToJSON(install_status_status_2);
	printf("repeating install_status_status:\n%s\n", cJSON_Print(jsoninstall_status_status_2));
}

int main() {
  test_install_status_status(1);
  test_install_status_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // install_status_status_MAIN
#endif // install_status_status_TEST
