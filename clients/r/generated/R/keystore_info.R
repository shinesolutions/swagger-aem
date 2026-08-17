#' Create a new KeystoreInfo
#'
#' @description
#' KeystoreInfo Class
#'
#' @docType class
#' @title KeystoreInfo
#' @description KeystoreInfo Class
#' @format An \code{R6Class} generator object
#' @field aliases  list(\link{KeystoreItems}) [optional]
#' @field exists False if truststore don't exist character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
KeystoreInfo <- R6::R6Class(
  "KeystoreInfo",
  public = list(
    `aliases` = NULL,
    `exists` = NULL,

    #' @description
    #' Initialize a new KeystoreInfo class.
    #'
    #' @param aliases aliases
    #' @param exists False if truststore don't exist
    #' @param ... Other optional arguments.
    initialize = function(`aliases` = NULL, `exists` = NULL, ...) {
      if (!is.null(`aliases`)) {
        stopifnot(is.vector(`aliases`), length(`aliases`) != 0)
        sapply(`aliases`, function(x) stopifnot(R6::is.R6(x)))
        self$`aliases` <- `aliases`
      }
      if (!is.null(`exists`)) {
        if (!(is.logical(`exists`) && length(`exists`) == 1)) {
          stop(paste("Error! Invalid data for `exists`. Must be a boolean:", `exists`))
        }
        self$`exists` <- `exists`
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
    #' @return KeystoreInfo as a base R list.
    #' @examples
    #' # convert array of KeystoreInfo (x) to a data frame
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
    #' Convert KeystoreInfo to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      KeystoreInfoObject <- list()
      if (!is.null(self$`aliases`)) {
        KeystoreInfoObject[["aliases"]] <-
          self$extractSimpleType(self$`aliases`)
      }
      if (!is.null(self$`exists`)) {
        KeystoreInfoObject[["exists"]] <-
          self$`exists`
      }
      return(KeystoreInfoObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of KeystoreInfo
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeystoreInfo
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`aliases`)) {
        self$`aliases` <- ApiClient$new()$deserializeObj(this_object$`aliases`, "array[KeystoreItems]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`exists`)) {
        self$`exists` <- this_object$`exists`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return KeystoreInfo in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of KeystoreInfo
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeystoreInfo
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`aliases` <- ApiClient$new()$deserializeObj(this_object$`aliases`, "array[KeystoreItems]", loadNamespace("openapi"))
      self$`exists` <- this_object$`exists`
      self
    },

    #' @description
    #' Validate JSON input with respect to KeystoreInfo and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of KeystoreInfo
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
# KeystoreInfo$unlock()
#
## Below is an example to define the print function
# KeystoreInfo$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# KeystoreInfo$lock()

