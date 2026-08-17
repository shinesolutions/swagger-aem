#' Create a new KeystoreItems
#'
#' @description
#' KeystoreItems Class
#'
#' @docType class
#' @title KeystoreItems
#' @description KeystoreItems Class
#' @format An \code{R6Class} generator object
#' @field alias Keystore alias name character [optional]
#' @field entryType e.g. \"privateKey\" character [optional]
#' @field algorithm e.g. \"RSA\" character [optional]
#' @field format e.g. \"PKCS#8\" character [optional]
#' @field chain  list(\link{KeystoreChainItems}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
KeystoreItems <- R6::R6Class(
  "KeystoreItems",
  public = list(
    `alias` = NULL,
    `entryType` = NULL,
    `algorithm` = NULL,
    `format` = NULL,
    `chain` = NULL,

    #' @description
    #' Initialize a new KeystoreItems class.
    #'
    #' @param alias Keystore alias name
    #' @param entryType e.g. \"privateKey\"
    #' @param algorithm e.g. \"RSA\"
    #' @param format e.g. \"PKCS#8\"
    #' @param chain chain
    #' @param ... Other optional arguments.
    initialize = function(`alias` = NULL, `entryType` = NULL, `algorithm` = NULL, `format` = NULL, `chain` = NULL, ...) {
      if (!is.null(`alias`)) {
        if (!(is.character(`alias`) && length(`alias`) == 1)) {
          stop(paste("Error! Invalid data for `alias`. Must be a string:", `alias`))
        }
        self$`alias` <- `alias`
      }
      if (!is.null(`entryType`)) {
        if (!(is.character(`entryType`) && length(`entryType`) == 1)) {
          stop(paste("Error! Invalid data for `entryType`. Must be a string:", `entryType`))
        }
        self$`entryType` <- `entryType`
      }
      if (!is.null(`algorithm`)) {
        if (!(is.character(`algorithm`) && length(`algorithm`) == 1)) {
          stop(paste("Error! Invalid data for `algorithm`. Must be a string:", `algorithm`))
        }
        self$`algorithm` <- `algorithm`
      }
      if (!is.null(`format`)) {
        if (!(is.character(`format`) && length(`format`) == 1)) {
          stop(paste("Error! Invalid data for `format`. Must be a string:", `format`))
        }
        self$`format` <- `format`
      }
      if (!is.null(`chain`)) {
        stopifnot(is.vector(`chain`), length(`chain`) != 0)
        sapply(`chain`, function(x) stopifnot(R6::is.R6(x)))
        self$`chain` <- `chain`
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
    #' @return KeystoreItems as a base R list.
    #' @examples
    #' # convert array of KeystoreItems (x) to a data frame
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
    #' Convert KeystoreItems to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      KeystoreItemsObject <- list()
      if (!is.null(self$`alias`)) {
        KeystoreItemsObject[["alias"]] <-
          self$`alias`
      }
      if (!is.null(self$`entryType`)) {
        KeystoreItemsObject[["entryType"]] <-
          self$`entryType`
      }
      if (!is.null(self$`algorithm`)) {
        KeystoreItemsObject[["algorithm"]] <-
          self$`algorithm`
      }
      if (!is.null(self$`format`)) {
        KeystoreItemsObject[["format"]] <-
          self$`format`
      }
      if (!is.null(self$`chain`)) {
        KeystoreItemsObject[["chain"]] <-
          self$extractSimpleType(self$`chain`)
      }
      return(KeystoreItemsObject)
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
    #' Deserialize JSON string into an instance of KeystoreItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeystoreItems
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`alias`)) {
        self$`alias` <- this_object$`alias`
      }
      if (!is.null(this_object$`entryType`)) {
        self$`entryType` <- this_object$`entryType`
      }
      if (!is.null(this_object$`algorithm`)) {
        self$`algorithm` <- this_object$`algorithm`
      }
      if (!is.null(this_object$`format`)) {
        self$`format` <- this_object$`format`
      }
      if (!is.null(this_object$`chain`)) {
        self$`chain` <- ApiClient$new()$deserializeObj(this_object$`chain`, "array[KeystoreChainItems]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return KeystoreItems in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of KeystoreItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeystoreItems
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`alias` <- this_object$`alias`
      self$`entryType` <- this_object$`entryType`
      self$`algorithm` <- this_object$`algorithm`
      self$`format` <- this_object$`format`
      self$`chain` <- ApiClient$new()$deserializeObj(this_object$`chain`, "array[KeystoreChainItems]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to KeystoreItems and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of KeystoreItems
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
# KeystoreItems$unlock()
#
## Below is an example to define the print function
# KeystoreItems$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# KeystoreItems$lock()

