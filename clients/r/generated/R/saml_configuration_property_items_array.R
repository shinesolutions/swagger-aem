# Adobe Experience Manager (AEM) API
#
# Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
#
# The version of the OpenAPI document: 3.5.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title SamlConfigurationPropertyItemsArray
#'
#' @description SamlConfigurationPropertyItemsArray Class
#'
#' @format An \code{R6Class} generator object
#'
#' @field name  character [optional]
#'
#' @field optional  character [optional]
#'
#' @field is_set  character [optional]
#'
#' @field type  integer [optional]
#'
#' @field values  list( character ) [optional]
#'
#' @field description  character [optional]
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SamlConfigurationPropertyItemsArray <- R6::R6Class(
  'SamlConfigurationPropertyItemsArray',
  public = list(
    `name` = NULL,
    `optional` = NULL,
    `is_set` = NULL,
    `type` = NULL,
    `values` = NULL,
    `description` = NULL,
    initialize = function(
        `name`=NULL, `optional`=NULL, `is_set`=NULL, `type`=NULL, `values`=NULL, `description`=NULL, ...
    ) {
      local.optional.var <- list(...)
      if (!is.null(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!is.null(`optional`)) {
        stopifnot(is.logical(`optional`), length(`optional`) == 1)
        self$`optional` <- `optional`
      }
      if (!is.null(`is_set`)) {
        stopifnot(is.logical(`is_set`), length(`is_set`) == 1)
        self$`is_set` <- `is_set`
      }
      if (!is.null(`type`)) {
        stopifnot(is.numeric(`type`), length(`type`) == 1)
        self$`type` <- `type`
      }
      if (!is.null(`values`)) {
        stopifnot(is.vector(`values`), length(`values`) != 0)
        sapply(`values`, function(x) stopifnot(is.character(x)))
        self$`values` <- `values`
      }
      if (!is.null(`description`)) {
        stopifnot(is.character(`description`), length(`description`) == 1)
        self$`description` <- `description`
      }
    },
    toJSON = function() {
      SamlConfigurationPropertyItemsArrayObject <- list()
      if (!is.null(self$`name`)) {
        SamlConfigurationPropertyItemsArrayObject[['name']] <-
          self$`name`
      }
      if (!is.null(self$`optional`)) {
        SamlConfigurationPropertyItemsArrayObject[['optional']] <-
          self$`optional`
      }
      if (!is.null(self$`is_set`)) {
        SamlConfigurationPropertyItemsArrayObject[['is_set']] <-
          self$`is_set`
      }
      if (!is.null(self$`type`)) {
        SamlConfigurationPropertyItemsArrayObject[['type']] <-
          self$`type`
      }
      if (!is.null(self$`values`)) {
        SamlConfigurationPropertyItemsArrayObject[['values']] <-
          self$`values`
      }
      if (!is.null(self$`description`)) {
        SamlConfigurationPropertyItemsArrayObject[['description']] <-
          self$`description`
      }

      SamlConfigurationPropertyItemsArrayObject
    },
    fromJSON = function(SamlConfigurationPropertyItemsArrayJson) {
      SamlConfigurationPropertyItemsArrayObject <- jsonlite::fromJSON(SamlConfigurationPropertyItemsArrayJson)
      if (!is.null(SamlConfigurationPropertyItemsArrayObject$`name`)) {
        self$`name` <- SamlConfigurationPropertyItemsArrayObject$`name`
      }
      if (!is.null(SamlConfigurationPropertyItemsArrayObject$`optional`)) {
        self$`optional` <- SamlConfigurationPropertyItemsArrayObject$`optional`
      }
      if (!is.null(SamlConfigurationPropertyItemsArrayObject$`is_set`)) {
        self$`is_set` <- SamlConfigurationPropertyItemsArrayObject$`is_set`
      }
      if (!is.null(SamlConfigurationPropertyItemsArrayObject$`type`)) {
        self$`type` <- SamlConfigurationPropertyItemsArrayObject$`type`
      }
      if (!is.null(SamlConfigurationPropertyItemsArrayObject$`values`)) {
        self$`values` <- ApiClient$new()$deserializeObj(SamlConfigurationPropertyItemsArrayObject$`values`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(SamlConfigurationPropertyItemsArrayObject$`description`)) {
        self$`description` <- SamlConfigurationPropertyItemsArrayObject$`description`
      }
      self
    },
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
        sprintf(
        '"name":
          "%s"
                ',
        self$`name`
        )},
        if (!is.null(self$`optional`)) {
        sprintf(
        '"optional":
          %s
                ',
        tolower(self$`optional`)
        )},
        if (!is.null(self$`is_set`)) {
        sprintf(
        '"is_set":
          %s
                ',
        tolower(self$`is_set`)
        )},
        if (!is.null(self$`type`)) {
        sprintf(
        '"type":
          %d
                ',
        self$`type`
        )},
        if (!is.null(self$`values`)) {
        sprintf(
        '"values":
           [%s]
        ',
        paste(unlist(lapply(self$`values`, function(x) paste0('"', x, '"'))), collapse=",")
        )},
        if (!is.null(self$`description`)) {
        sprintf(
        '"description":
          "%s"
                ',
        self$`description`
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(SamlConfigurationPropertyItemsArrayJson) {
      SamlConfigurationPropertyItemsArrayObject <- jsonlite::fromJSON(SamlConfigurationPropertyItemsArrayJson)
      self$`name` <- SamlConfigurationPropertyItemsArrayObject$`name`
      self$`optional` <- SamlConfigurationPropertyItemsArrayObject$`optional`
      self$`is_set` <- SamlConfigurationPropertyItemsArrayObject$`is_set`
      self$`type` <- SamlConfigurationPropertyItemsArrayObject$`type`
      self$`values` <- ApiClient$new()$deserializeObj(SamlConfigurationPropertyItemsArrayObject$`values`, "array[character]", loadNamespace("openapi"))
      self$`description` <- SamlConfigurationPropertyItemsArrayObject$`description`
      self
    }
  )
)
