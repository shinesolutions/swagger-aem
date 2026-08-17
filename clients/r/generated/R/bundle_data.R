#' Create a new BundleData
#'
#' @description
#' BundleData Class
#'
#' @docType class
#' @title BundleData
#' @description BundleData Class
#' @format An \code{R6Class} generator object
#' @field id Bundle ID integer [optional]
#' @field name Bundle name character [optional]
#' @field fragment Is bundle a fragment character [optional]
#' @field stateRaw Numeric raw bundle state value integer [optional]
#' @field state Bundle state value character [optional]
#' @field version Bundle version character [optional]
#' @field symbolicName Bundle symbolic name character [optional]
#' @field category Bundle category character [optional]
#' @field props  list(\link{BundleDataProp}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BundleData <- R6::R6Class(
  "BundleData",
  public = list(
    `id` = NULL,
    `name` = NULL,
    `fragment` = NULL,
    `stateRaw` = NULL,
    `state` = NULL,
    `version` = NULL,
    `symbolicName` = NULL,
    `category` = NULL,
    `props` = NULL,

    #' @description
    #' Initialize a new BundleData class.
    #'
    #' @param id Bundle ID
    #' @param name Bundle name
    #' @param fragment Is bundle a fragment
    #' @param stateRaw Numeric raw bundle state value
    #' @param state Bundle state value
    #' @param version Bundle version
    #' @param symbolicName Bundle symbolic name
    #' @param category Bundle category
    #' @param props props
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `name` = NULL, `fragment` = NULL, `stateRaw` = NULL, `state` = NULL, `version` = NULL, `symbolicName` = NULL, `category` = NULL, `props` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.numeric(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be an integer:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`fragment`)) {
        if (!(is.logical(`fragment`) && length(`fragment`) == 1)) {
          stop(paste("Error! Invalid data for `fragment`. Must be a boolean:", `fragment`))
        }
        self$`fragment` <- `fragment`
      }
      if (!is.null(`stateRaw`)) {
        if (!(is.numeric(`stateRaw`) && length(`stateRaw`) == 1)) {
          stop(paste("Error! Invalid data for `stateRaw`. Must be an integer:", `stateRaw`))
        }
        self$`stateRaw` <- `stateRaw`
      }
      if (!is.null(`state`)) {
        if (!(is.character(`state`) && length(`state`) == 1)) {
          stop(paste("Error! Invalid data for `state`. Must be a string:", `state`))
        }
        self$`state` <- `state`
      }
      if (!is.null(`version`)) {
        if (!(is.character(`version`) && length(`version`) == 1)) {
          stop(paste("Error! Invalid data for `version`. Must be a string:", `version`))
        }
        self$`version` <- `version`
      }
      if (!is.null(`symbolicName`)) {
        if (!(is.character(`symbolicName`) && length(`symbolicName`) == 1)) {
          stop(paste("Error! Invalid data for `symbolicName`. Must be a string:", `symbolicName`))
        }
        self$`symbolicName` <- `symbolicName`
      }
      if (!is.null(`category`)) {
        if (!(is.character(`category`) && length(`category`) == 1)) {
          stop(paste("Error! Invalid data for `category`. Must be a string:", `category`))
        }
        self$`category` <- `category`
      }
      if (!is.null(`props`)) {
        stopifnot(is.vector(`props`), length(`props`) != 0)
        sapply(`props`, function(x) stopifnot(R6::is.R6(x)))
        self$`props` <- `props`
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
    #' @return BundleData as a base R list.
    #' @examples
    #' # convert array of BundleData (x) to a data frame
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
    #' Convert BundleData to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BundleDataObject <- list()
      if (!is.null(self$`id`)) {
        BundleDataObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        BundleDataObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`fragment`)) {
        BundleDataObject[["fragment"]] <-
          self$`fragment`
      }
      if (!is.null(self$`stateRaw`)) {
        BundleDataObject[["stateRaw"]] <-
          self$`stateRaw`
      }
      if (!is.null(self$`state`)) {
        BundleDataObject[["state"]] <-
          self$`state`
      }
      if (!is.null(self$`version`)) {
        BundleDataObject[["version"]] <-
          self$`version`
      }
      if (!is.null(self$`symbolicName`)) {
        BundleDataObject[["symbolicName"]] <-
          self$`symbolicName`
      }
      if (!is.null(self$`category`)) {
        BundleDataObject[["category"]] <-
          self$`category`
      }
      if (!is.null(self$`props`)) {
        BundleDataObject[["props"]] <-
          self$extractSimpleType(self$`props`)
      }
      return(BundleDataObject)
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
    #' Deserialize JSON string into an instance of BundleData
    #'
    #' @param input_json the JSON input
    #' @return the instance of BundleData
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`fragment`)) {
        self$`fragment` <- this_object$`fragment`
      }
      if (!is.null(this_object$`stateRaw`)) {
        self$`stateRaw` <- this_object$`stateRaw`
      }
      if (!is.null(this_object$`state`)) {
        self$`state` <- this_object$`state`
      }
      if (!is.null(this_object$`version`)) {
        self$`version` <- this_object$`version`
      }
      if (!is.null(this_object$`symbolicName`)) {
        self$`symbolicName` <- this_object$`symbolicName`
      }
      if (!is.null(this_object$`category`)) {
        self$`category` <- this_object$`category`
      }
      if (!is.null(this_object$`props`)) {
        self$`props` <- ApiClient$new()$deserializeObj(this_object$`props`, "array[BundleDataProp]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BundleData in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BundleData
    #'
    #' @param input_json the JSON input
    #' @return the instance of BundleData
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`fragment` <- this_object$`fragment`
      self$`stateRaw` <- this_object$`stateRaw`
      self$`state` <- this_object$`state`
      self$`version` <- this_object$`version`
      self$`symbolicName` <- this_object$`symbolicName`
      self$`category` <- this_object$`category`
      self$`props` <- ApiClient$new()$deserializeObj(this_object$`props`, "array[BundleDataProp]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to BundleData and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BundleData
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
# BundleData$unlock()
#
## Below is an example to define the print function
# BundleData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BundleData$lock()

