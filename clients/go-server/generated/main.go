/*
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * API version: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package main

import (
	"log"
	"net/http"

	openapi "github.com/GIT_USER_ID/GIT_REPO_ID/go"
)

func main() {
	log.Printf("Server started")

	ConsoleApiService := openapi.NewConsoleApiService()
	ConsoleApiController := openapi.NewConsoleApiController(ConsoleApiService)

	CqApiService := openapi.NewCqApiService()
	CqApiController := openapi.NewCqApiController(CqApiService)

	CrxApiService := openapi.NewCrxApiService()
	CrxApiController := openapi.NewCrxApiController(CrxApiService)

	CustomApiService := openapi.NewCustomApiService()
	CustomApiController := openapi.NewCustomApiController(CustomApiService)

	GraniteApiService := openapi.NewGraniteApiService()
	GraniteApiController := openapi.NewGraniteApiController(GraniteApiService)

	SlingApiService := openapi.NewSlingApiService()
	SlingApiController := openapi.NewSlingApiController(SlingApiService)

	router := openapi.NewRouter(ConsoleApiController, CqApiController, CrxApiController, CustomApiController, GraniteApiController, SlingApiController)

	log.Fatal(http.ListenAndServe(":8080", router))
}
