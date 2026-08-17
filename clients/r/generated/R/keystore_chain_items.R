#' Create a new KeystoreChainItems
#'
#' @description
#' KeystoreChainItems Class
#'
#' @docType class
#' @title KeystoreChainItems
#' @description KeystoreChainItems Class
#' @format An \code{R6Class} generator object
#' @field subject e.g. \"CN=localhost\" character [optional]
#' @field issuer e.g. \"CN=Admin\" character [optional]
#' @field notBefore e.g. \"Sun Jul 01 12:00:00 AEST 2018\" character [optional]
#' @field notAfter e.g. \"Sun Jun 30 23:59:50 AEST 2019\" character [optional]
#' @field serialNumber 18165099476682912368 integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
KeystoreChainItems <- R6::R6Class(
  "KeystoreChainItems",
  public = list(
    `subject` = NULL,
    `issuer` = NULL,
    `notBefore` = NULL,
    `notAfter` = NULL,
    `serialNumber` = NULL,

    #' @description
    #' Initialize a new KeystoreChainItems class.
    #'
    #' @param subject e.g. \"CN=localhost\"
    #' @param issuer e.g. \"CN=Admin\"
    #' @param notBefore e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
    #' @param notAfter e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
    #' @param serialNumber 18165099476682912368
    #' @param ... Other optional arguments.
    initialize = function(`subject` = NULL, `issuer` = NULL, `notBefore` = NULL, `notAfter` = NULL, `serialNumber` = NULL, ...) {
      if (!is.null(`subject`)) {
        if (!(is.character(`subject`) && length(`subject`) == 1)) {
          stop(paste("Error! Invalid data for `subject`. Must be a string:", `subject`))
        }
        self$`subject` <- `subject`
      }
      if (!is.null(`issuer`)) {
        if (!(is.character(`issuer`) && length(`issuer`) == 1)) {
          stop(paste("Error! Invalid data for `issuer`. Must be a string:", `issuer`))
        }
        self$`issuer` <- `issuer`
      }
      if (!is.null(`notBefore`)) {
        if (!(is.character(`notBefore`) && length(`notBefore`) == 1)) {
          stop(paste("Error! Invalid data for `notBefore`. Must be a string:", `notBefore`))
        }
        self$`notBefore` <- `notBefore`
      }
      if (!is.null(`notAfter`)) {
        if (!(is.character(`notAfter`) && length(`notAfter`) == 1)) {
          stop(paste("Error! Invalid data for `notAfter`. Must be a string:", `notAfter`))
        }
        self$`notAfter` <- `notAfter`
      }
      if (!is.null(`serialNumber`)) {
        if (!(is.numeric(`serialNumber`) && length(`serialNumber`) == 1)) {
          stop(paste("Error! Invalid data for `serialNumber`. Must be an integer:", `serialNumber`))
        }
        self$`serialNumber` <- `serialNumber`
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
    #' @return KeystoreChainItems as a base R list.
    #' @examples
    #' # convert array of KeystoreChainItems (x) to a data frame
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
    #' Convert KeystoreChainItems to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      KeystoreChainItemsObject <- list()
      if (!is.null(self$`subject`)) {
        KeystoreChainItemsObject[["subject"]] <-
          self$`subject`
      }
      if (!is.null(self$`issuer`)) {
        KeystoreChainItemsObject[["issuer"]] <-
          self$`issuer`
      }
      if (!is.null(self$`notBefore`)) {
        KeystoreChainItemsObject[["notBefore"]] <-
          self$`notBefore`
      }
      if (!is.null(self$`notAfter`)) {
        KeystoreChainItemsObject[["notAfter"]] <-
          self$`notAfter`
      }
      if (!is.null(self$`serialNumber`)) {
        KeystoreChainItemsObject[["serialNumber"]] <-
          self$`serialNumber`
      }
      return(KeystoreChainItemsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of KeystoreChainItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeystoreChainItems
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`subject`)) {
        self$`subject` <- this_object$`subject`
      }
      if (!is.null(this_object$`issuer`)) {
        self$`issuer` <- this_object$`issuer`
      }
      if (!is.null(this_object$`notBefore`)) {
        self$`notBefore` <- this_object$`notBefore`
      }
      if (!is.null(this_object$`notAfter`)) {
        self$`notAfter` <- this_object$`notAfter`
      }
      if (!is.null(this_object$`serialNumber`)) {
        self$`serialNumber` <- this_object$`serialNumber`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return KeystoreChainItems in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of KeystoreChainItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeystoreChainItems
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`subject` <- this_object$`subject`
      self$`issuer` <- this_object$`issuer`
      self$`notBefore` <- this_object$`notBefore`
      self$`notAfter` <- this_object$`notAfter`
      self$`serialNumber` <- this_object$`serialNumber`
      self
    },

    #' @description
    #' Validate JSON input with respect to KeystoreChainItems and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of KeystoreChainItems
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
# KeystoreChainItems$unlock()
#
## Below is an example to define the print function
# KeystoreChainItems$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# KeystoreChainItems$lock()

