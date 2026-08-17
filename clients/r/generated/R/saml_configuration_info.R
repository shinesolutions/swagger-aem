#' Create a new SamlConfigurationInfo
#'
#' @description
#' SamlConfigurationInfo Class
#'
#' @docType class
#' @title SamlConfigurationInfo
#' @description SamlConfigurationInfo Class
#' @format An \code{R6Class} generator object
#' @field pid Persistent Identity (PID) character [optional]
#' @field title Title character [optional]
#' @field description Title character [optional]
#' @field bundle_location needed for configuration binding character [optional]
#' @field service_location needed for configuraiton binding character [optional]
#' @field properties  \link{SamlConfigurationProperties} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SamlConfigurationInfo <- R6::R6Class(
  "SamlConfigurationInfo",
  public = list(
    `pid` = NULL,
    `title` = NULL,
    `description` = NULL,
    `bundle_location` = NULL,
    `service_location` = NULL,
    `properties` = NULL,

    #' @description
    #' Initialize a new SamlConfigurationInfo class.
    #'
    #' @param pid Persistent Identity (PID)
    #' @param title Title
    #' @param description Title
    #' @param bundle_location needed for configuration binding
    #' @param service_location needed for configuraiton binding
    #' @param properties properties
    #' @param ... Other optional arguments.
    initialize = function(`pid` = NULL, `title` = NULL, `description` = NULL, `bundle_location` = NULL, `service_location` = NULL, `properties` = NULL, ...) {
      if (!is.null(`pid`)) {
        if (!(is.character(`pid`) && length(`pid`) == 1)) {
          stop(paste("Error! Invalid data for `pid`. Must be a string:", `pid`))
        }
        self$`pid` <- `pid`
      }
      if (!is.null(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`bundle_location`)) {
        if (!(is.character(`bundle_location`) && length(`bundle_location`) == 1)) {
          stop(paste("Error! Invalid data for `bundle_location`. Must be a string:", `bundle_location`))
        }
        self$`bundle_location` <- `bundle_location`
      }
      if (!is.null(`service_location`)) {
        if (!(is.character(`service_location`) && length(`service_location`) == 1)) {
          stop(paste("Error! Invalid data for `service_location`. Must be a string:", `service_location`))
        }
        self$`service_location` <- `service_location`
      }
      if (!is.null(`properties`)) {
        stopifnot(R6::is.R6(`properties`))
        self$`properties` <- `properties`
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
    #' @return SamlConfigurationInfo as a base R list.
    #' @examples
    #' # convert array of SamlConfigurationInfo (x) to a data frame
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
    #' Convert SamlConfigurationInfo to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SamlConfigurationInfoObject <- list()
      if (!is.null(self$`pid`)) {
        SamlConfigurationInfoObject[["pid"]] <-
          self$`pid`
      }
      if (!is.null(self$`title`)) {
        SamlConfigurationInfoObject[["title"]] <-
          self$`title`
      }
      if (!is.null(self$`description`)) {
        SamlConfigurationInfoObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`bundle_location`)) {
        SamlConfigurationInfoObject[["bundle_location"]] <-
          self$`bundle_location`
      }
      if (!is.null(self$`service_location`)) {
        SamlConfigurationInfoObject[["service_location"]] <-
          self$`service_location`
      }
      if (!is.null(self$`properties`)) {
        SamlConfigurationInfoObject[["properties"]] <-
          self$extractSimpleType(self$`properties`)
      }
      return(SamlConfigurationInfoObject)
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
    #' Deserialize JSON string into an instance of SamlConfigurationInfo
    #'
    #' @param input_json the JSON input
    #' @return the instance of SamlConfigurationInfo
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`pid`)) {
        self$`pid` <- this_object$`pid`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`bundle_location`)) {
        self$`bundle_location` <- this_object$`bundle_location`
      }
      if (!is.null(this_object$`service_location`)) {
        self$`service_location` <- this_object$`service_location`
      }
      if (!is.null(this_object$`properties`)) {
        `properties_object` <- SamlConfigurationProperties$new()
        `properties_object`$fromJSON(jsonlite::toJSON(this_object$`properties`, auto_unbox = TRUE, digits = NA))
        self$`properties` <- `properties_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SamlConfigurationInfo in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SamlConfigurationInfo
    #'
    #' @param input_json the JSON input
    #' @return the instance of SamlConfigurationInfo
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`pid` <- this_object$`pid`
      self$`title` <- this_object$`title`
      self$`description` <- this_object$`description`
      self$`bundle_location` <- this_object$`bundle_location`
      self$`service_location` <- this_object$`service_location`
      self$`properties` <- SamlConfigurationProperties$new()$fromJSON(jsonlite::toJSON(this_object$`properties`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to SamlConfigurationInfo and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SamlConfigurationInfo
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
# SamlConfigurationInfo$unlock()
#
## Below is an example to define the print function
# SamlConfigurationInfo$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SamlConfigurationInfo$lock()

