#' Create a new TruststoreItems
#'
#' @description
#' TruststoreItems Class
#'
#' @docType class
#' @title TruststoreItems
#' @description TruststoreItems Class
#' @format An \code{R6Class} generator object
#' @field alias Truststore alias name character [optional]
#' @field entryType  character [optional]
#' @field subject e.g. \"CN=localhost\" character [optional]
#' @field issuer e.g. \"CN=Admin\" character [optional]
#' @field notBefore e.g. \"Sun Jul 01 12:00:00 AEST 2018\" character [optional]
#' @field notAfter e.g. \"Sun Jun 30 23:59:50 AEST 2019\" character [optional]
#' @field serialNumber 18165099476682912368 integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TruststoreItems <- R6::R6Class(
  "TruststoreItems",
  public = list(
    `alias` = NULL,
    `entryType` = NULL,
    `subject` = NULL,
    `issuer` = NULL,
    `notBefore` = NULL,
    `notAfter` = NULL,
    `serialNumber` = NULL,

    #' @description
    #' Initialize a new TruststoreItems class.
    #'
    #' @param alias Truststore alias name
    #' @param entryType entryType
    #' @param subject e.g. \"CN=localhost\"
    #' @param issuer e.g. \"CN=Admin\"
    #' @param notBefore e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
    #' @param notAfter e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
    #' @param serialNumber 18165099476682912368
    #' @param ... Other optional arguments.
    initialize = function(`alias` = NULL, `entryType` = NULL, `subject` = NULL, `issuer` = NULL, `notBefore` = NULL, `notAfter` = NULL, `serialNumber` = NULL, ...) {
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
    #' @return TruststoreItems as a base R list.
    #' @examples
    #' # convert array of TruststoreItems (x) to a data frame
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
    #' Convert TruststoreItems to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TruststoreItemsObject <- list()
      if (!is.null(self$`alias`)) {
        TruststoreItemsObject[["alias"]] <-
          self$`alias`
      }
      if (!is.null(self$`entryType`)) {
        TruststoreItemsObject[["entryType"]] <-
          self$`entryType`
      }
      if (!is.null(self$`subject`)) {
        TruststoreItemsObject[["subject"]] <-
          self$`subject`
      }
      if (!is.null(self$`issuer`)) {
        TruststoreItemsObject[["issuer"]] <-
          self$`issuer`
      }
      if (!is.null(self$`notBefore`)) {
        TruststoreItemsObject[["notBefore"]] <-
          self$`notBefore`
      }
      if (!is.null(self$`notAfter`)) {
        TruststoreItemsObject[["notAfter"]] <-
          self$`notAfter`
      }
      if (!is.null(self$`serialNumber`)) {
        TruststoreItemsObject[["serialNumber"]] <-
          self$`serialNumber`
      }
      return(TruststoreItemsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TruststoreItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of TruststoreItems
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`alias`)) {
        self$`alias` <- this_object$`alias`
      }
      if (!is.null(this_object$`entryType`)) {
        self$`entryType` <- this_object$`entryType`
      }
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
    #' @return TruststoreItems in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TruststoreItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of TruststoreItems
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`alias` <- this_object$`alias`
      self$`entryType` <- this_object$`entryType`
      self$`subject` <- this_object$`subject`
      self$`issuer` <- this_object$`issuer`
      self$`notBefore` <- this_object$`notBefore`
      self$`notAfter` <- this_object$`notAfter`
      self$`serialNumber` <- this_object$`serialNumber`
      self
    },

    #' @description
    #' Validate JSON input with respect to TruststoreItems and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TruststoreItems
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
# TruststoreItems$unlock()
#
## Below is an example to define the print function
# TruststoreItems$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TruststoreItems$lock()

