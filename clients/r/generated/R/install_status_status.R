#' Create a new InstallStatusStatus
#'
#' @description
#' InstallStatusStatus Class
#'
#' @docType class
#' @title InstallStatusStatus
#' @description InstallStatusStatus Class
#' @format An \code{R6Class} generator object
#' @field finished  character [optional]
#' @field itemCount  integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
InstallStatusStatus <- R6::R6Class(
  "InstallStatusStatus",
  public = list(
    `finished` = NULL,
    `itemCount` = NULL,

    #' @description
    #' Initialize a new InstallStatusStatus class.
    #'
    #' @param finished finished
    #' @param itemCount itemCount
    #' @param ... Other optional arguments.
    initialize = function(`finished` = NULL, `itemCount` = NULL, ...) {
      if (!is.null(`finished`)) {
        if (!(is.logical(`finished`) && length(`finished`) == 1)) {
          stop(paste("Error! Invalid data for `finished`. Must be a boolean:", `finished`))
        }
        self$`finished` <- `finished`
      }
      if (!is.null(`itemCount`)) {
        if (!(is.numeric(`itemCount`) && length(`itemCount`) == 1)) {
          stop(paste("Error! Invalid data for `itemCount`. Must be an integer:", `itemCount`))
        }
        self$`itemCount` <- `itemCount`
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
    #' @return InstallStatusStatus as a base R list.
    #' @examples
    #' # convert array of InstallStatusStatus (x) to a data frame
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
    #' Convert InstallStatusStatus to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      InstallStatusStatusObject <- list()
      if (!is.null(self$`finished`)) {
        InstallStatusStatusObject[["finished"]] <-
          self$`finished`
      }
      if (!is.null(self$`itemCount`)) {
        InstallStatusStatusObject[["itemCount"]] <-
          self$`itemCount`
      }
      return(InstallStatusStatusObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of InstallStatusStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of InstallStatusStatus
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`finished`)) {
        self$`finished` <- this_object$`finished`
      }
      if (!is.null(this_object$`itemCount`)) {
        self$`itemCount` <- this_object$`itemCount`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return InstallStatusStatus in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of InstallStatusStatus
    #'
    #' @param input_json the JSON input
    #' @return the instance of InstallStatusStatus
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`finished` <- this_object$`finished`
      self$`itemCount` <- this_object$`itemCount`
      self
    },

    #' @description
    #' Validate JSON input with respect to InstallStatusStatus and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of InstallStatusStatus
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
# InstallStatusStatus$unlock()
#
## Below is an example to define the print function
# InstallStatusStatus$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# InstallStatusStatus$lock()

