#' Create a new BundleDataProp
#'
#' @description
#' BundleDataProp Class
#'
#' @docType class
#' @title BundleDataProp
#' @description BundleDataProp Class
#' @format An \code{R6Class} generator object
#' @field key Bundle data key character [optional]
#' @field value Bundle data value character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BundleDataProp <- R6::R6Class(
  "BundleDataProp",
  public = list(
    `key` = NULL,
    `value` = NULL,

    #' @description
    #' Initialize a new BundleDataProp class.
    #'
    #' @param key Bundle data key
    #' @param value Bundle data value
    #' @param ... Other optional arguments.
    initialize = function(`key` = NULL, `value` = NULL, ...) {
      if (!is.null(`key`)) {
        if (!(is.character(`key`) && length(`key`) == 1)) {
          stop(paste("Error! Invalid data for `key`. Must be a string:", `key`))
        }
        self$`key` <- `key`
      }
      if (!is.null(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
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
    #' @return BundleDataProp as a base R list.
    #' @examples
    #' # convert array of BundleDataProp (x) to a data frame
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
    #' Convert BundleDataProp to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BundleDataPropObject <- list()
      if (!is.null(self$`key`)) {
        BundleDataPropObject[["key"]] <-
          self$`key`
      }
      if (!is.null(self$`value`)) {
        BundleDataPropObject[["value"]] <-
          self$`value`
      }
      return(BundleDataPropObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BundleDataProp
    #'
    #' @param input_json the JSON input
    #' @return the instance of BundleDataProp
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`key`)) {
        self$`key` <- this_object$`key`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BundleDataProp in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BundleDataProp
    #'
    #' @param input_json the JSON input
    #' @return the instance of BundleDataProp
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`key` <- this_object$`key`
      self$`value` <- this_object$`value`
      self
    },

    #' @description
    #' Validate JSON input with respect to BundleDataProp and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BundleDataProp
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
# BundleDataProp$unlock()
#
## Below is an example to define the print function
# BundleDataProp$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BundleDataProp$lock()

