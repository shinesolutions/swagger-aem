#' Create a new BundleInfo
#'
#' @description
#' BundleInfo Class
#'
#' @docType class
#' @title BundleInfo
#' @description BundleInfo Class
#' @format An \code{R6Class} generator object
#' @field status Status description of all bundles character [optional]
#' @field s  list(integer) [optional]
#' @field data  list(\link{BundleData}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BundleInfo <- R6::R6Class(
  "BundleInfo",
  public = list(
    `status` = NULL,
    `s` = NULL,
    `data` = NULL,

    #' @description
    #' Initialize a new BundleInfo class.
    #'
    #' @param status Status description of all bundles
    #' @param s s
    #' @param data data
    #' @param ... Other optional arguments.
    initialize = function(`status` = NULL, `s` = NULL, `data` = NULL, ...) {
      if (!is.null(`status`)) {
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!is.null(`s`)) {
        stopifnot(is.vector(`s`), length(`s`) != 0)
        sapply(`s`, function(x) stopifnot(is.character(x)))
        self$`s` <- `s`
      }
      if (!is.null(`data`)) {
        stopifnot(is.vector(`data`), length(`data`) != 0)
        sapply(`data`, function(x) stopifnot(R6::is.R6(x)))
        self$`data` <- `data`
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
    #' @return BundleInfo as a base R list.
    #' @examples
    #' # convert array of BundleInfo (x) to a data frame
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
    #' Convert BundleInfo to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BundleInfoObject <- list()
      if (!is.null(self$`status`)) {
        BundleInfoObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`s`)) {
        BundleInfoObject[["s"]] <-
          self$`s`
      }
      if (!is.null(self$`data`)) {
        BundleInfoObject[["data"]] <-
          self$extractSimpleType(self$`data`)
      }
      return(BundleInfoObject)
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
    #' Deserialize JSON string into an instance of BundleInfo
    #'
    #' @param input_json the JSON input
    #' @return the instance of BundleInfo
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status`)) {
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`s`)) {
        self$`s` <- ApiClient$new()$deserializeObj(this_object$`s`, "array[integer]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`data`)) {
        self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[BundleData]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BundleInfo in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BundleInfo
    #'
    #' @param input_json the JSON input
    #' @return the instance of BundleInfo
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status` <- this_object$`status`
      self$`s` <- ApiClient$new()$deserializeObj(this_object$`s`, "array[integer]", loadNamespace("openapi"))
      self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[BundleData]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to BundleInfo and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BundleInfo
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
# BundleInfo$unlock()
#
## Below is an example to define the print function
# BundleInfo$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BundleInfo$lock()

