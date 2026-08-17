#' Create a new SamlConfigurationPropertyItemsArray
#'
#' @description
#' SamlConfigurationPropertyItemsArray Class
#'
#' @docType class
#' @title SamlConfigurationPropertyItemsArray
#' @description SamlConfigurationPropertyItemsArray Class
#' @format An \code{R6Class} generator object
#' @field name property name character [optional]
#' @field optional True if optional character [optional]
#' @field is_set True if property is set character [optional]
#' @field type Property type, 1=String, 3=long, 11=boolean, 12=Password integer [optional]
#' @field values Property value list(character) [optional]
#' @field description Property description character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SamlConfigurationPropertyItemsArray <- R6::R6Class(
  "SamlConfigurationPropertyItemsArray",
  public = list(
    `name` = NULL,
    `optional` = NULL,
    `is_set` = NULL,
    `type` = NULL,
    `values` = NULL,
    `description` = NULL,

    #' @description
    #' Initialize a new SamlConfigurationPropertyItemsArray class.
    #'
    #' @param name property name
    #' @param optional True if optional
    #' @param is_set True if property is set
    #' @param type Property type, 1=String, 3=long, 11=boolean, 12=Password
    #' @param values Property value
    #' @param description Property description
    #' @param ... Other optional arguments.
    initialize = function(`name` = NULL, `optional` = NULL, `is_set` = NULL, `type` = NULL, `values` = NULL, `description` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`optional`)) {
        if (!(is.logical(`optional`) && length(`optional`) == 1)) {
          stop(paste("Error! Invalid data for `optional`. Must be a boolean:", `optional`))
        }
        self$`optional` <- `optional`
      }
      if (!is.null(`is_set`)) {
        if (!(is.logical(`is_set`) && length(`is_set`) == 1)) {
          stop(paste("Error! Invalid data for `is_set`. Must be a boolean:", `is_set`))
        }
        self$`is_set` <- `is_set`
      }
      if (!is.null(`type`)) {
        if (!(is.numeric(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be an integer:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`values`)) {
        stopifnot(is.vector(`values`), length(`values`) != 0)
        sapply(`values`, function(x) stopifnot(is.character(x)))
        self$`values` <- `values`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return SamlConfigurationPropertyItemsArray as a base R list.
    #' @examples
    #' # convert array of SamlConfigurationPropertyItemsArray (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert SamlConfigurationPropertyItemsArray to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SamlConfigurationPropertyItemsArrayObject <- list()
      if (!is.null(self$`name`)) {
        SamlConfigurationPropertyItemsArrayObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`optional`)) {
        SamlConfigurationPropertyItemsArrayObject[["optional"]] <-
          self$`optional`
      }
      if (!is.null(self$`is_set`)) {
        SamlConfigurationPropertyItemsArrayObject[["is_set"]] <-
          self$`is_set`
      }
      if (!is.null(self$`type`)) {
        SamlConfigurationPropertyItemsArrayObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`values`)) {
        SamlConfigurationPropertyItemsArrayObject[["values"]] <-
          self$`values`
      }
      if (!is.null(self$`description`)) {
        SamlConfigurationPropertyItemsArrayObject[["description"]] <-
          self$`description`
      }
      return(SamlConfigurationPropertyItemsArrayObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of SamlConfigurationPropertyItemsArray
    #'
    #' @param input_json the JSON input
    #' @return the instance of SamlConfigurationPropertyItemsArray
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`optional`)) {
        self$`optional` <- this_object$`optional`
      }
      if (!is.null(this_object$`is_set`)) {
        self$`is_set` <- this_object$`is_set`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`values`)) {
        self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SamlConfigurationPropertyItemsArray in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SamlConfigurationPropertyItemsArray
    #'
    #' @param input_json the JSON input
    #' @return the instance of SamlConfigurationPropertyItemsArray
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`optional` <- this_object$`optional`
      self$`is_set` <- this_object$`is_set`
      self$`type` <- this_object$`type`
      self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[character]", loadNamespace("openapi"))
      self$`description` <- this_object$`description`
      self
    },

    #' @description
    #' Validate JSON input with respect to SamlConfigurationPropertyItemsArray and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SamlConfigurationPropertyItemsArray
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# SamlConfigurationPropertyItemsArray$unlock()
#
## Below is an example to define the print function
# SamlConfigurationPropertyItemsArray$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SamlConfigurationPropertyItemsArray$lock()

