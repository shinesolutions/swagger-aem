#' Create a new SamlConfigurationProperties
#'
#' @description
#' SamlConfigurationProperties Class
#'
#' @docType class
#' @title SamlConfigurationProperties
#' @description SamlConfigurationProperties Class
#' @format An \code{R6Class} generator object
#' @field path  \link{SamlConfigurationPropertyItemsArray} [optional]
#' @field service.ranking  \link{SamlConfigurationPropertyItemsLong} [optional]
#' @field idpUrl  \link{SamlConfigurationPropertyItemsString} [optional]
#' @field idpCertAlias  \link{SamlConfigurationPropertyItemsString} [optional]
#' @field idpHttpRedirect  \link{SamlConfigurationPropertyItemsBoolean} [optional]
#' @field serviceProviderEntityId  \link{SamlConfigurationPropertyItemsString} [optional]
#' @field assertionConsumerServiceURL  \link{SamlConfigurationPropertyItemsString} [optional]
#' @field spPrivateKeyAlias  \link{SamlConfigurationPropertyItemsString} [optional]
#' @field keyStorePassword  \link{SamlConfigurationPropertyItemsString} [optional]
#' @field defaultRedirectUrl  \link{SamlConfigurationPropertyItemsString} [optional]
#' @field userIDAttribute  \link{SamlConfigurationPropertyItemsString} [optional]
#' @field useEncryption  \link{SamlConfigurationPropertyItemsBoolean} [optional]
#' @field createUser  \link{SamlConfigurationPropertyItemsBoolean} [optional]
#' @field addGroupMemberships  \link{SamlConfigurationPropertyItemsBoolean} [optional]
#' @field groupMembershipAttribute  \link{SamlConfigurationPropertyItemsString} [optional]
#' @field defaultGroups  \link{SamlConfigurationPropertyItemsArray} [optional]
#' @field nameIdFormat  \link{SamlConfigurationPropertyItemsString} [optional]
#' @field synchronizeAttributes  \link{SamlConfigurationPropertyItemsArray} [optional]
#' @field handleLogout  \link{SamlConfigurationPropertyItemsBoolean} [optional]
#' @field logoutUrl  \link{SamlConfigurationPropertyItemsString} [optional]
#' @field clockTolerance  \link{SamlConfigurationPropertyItemsLong} [optional]
#' @field digestMethod  \link{SamlConfigurationPropertyItemsString} [optional]
#' @field signatureMethod  \link{SamlConfigurationPropertyItemsString} [optional]
#' @field userIntermediatePath  \link{SamlConfigurationPropertyItemsString} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SamlConfigurationProperties <- R6::R6Class(
  "SamlConfigurationProperties",
  public = list(
    `path` = NULL,
    `service.ranking` = NULL,
    `idpUrl` = NULL,
    `idpCertAlias` = NULL,
    `idpHttpRedirect` = NULL,
    `serviceProviderEntityId` = NULL,
    `assertionConsumerServiceURL` = NULL,
    `spPrivateKeyAlias` = NULL,
    `keyStorePassword` = NULL,
    `defaultRedirectUrl` = NULL,
    `userIDAttribute` = NULL,
    `useEncryption` = NULL,
    `createUser` = NULL,
    `addGroupMemberships` = NULL,
    `groupMembershipAttribute` = NULL,
    `defaultGroups` = NULL,
    `nameIdFormat` = NULL,
    `synchronizeAttributes` = NULL,
    `handleLogout` = NULL,
    `logoutUrl` = NULL,
    `clockTolerance` = NULL,
    `digestMethod` = NULL,
    `signatureMethod` = NULL,
    `userIntermediatePath` = NULL,

    #' @description
    #' Initialize a new SamlConfigurationProperties class.
    #'
    #' @param path path
    #' @param service.ranking service.ranking
    #' @param idpUrl idpUrl
    #' @param idpCertAlias idpCertAlias
    #' @param idpHttpRedirect idpHttpRedirect
    #' @param serviceProviderEntityId serviceProviderEntityId
    #' @param assertionConsumerServiceURL assertionConsumerServiceURL
    #' @param spPrivateKeyAlias spPrivateKeyAlias
    #' @param keyStorePassword keyStorePassword
    #' @param defaultRedirectUrl defaultRedirectUrl
    #' @param userIDAttribute userIDAttribute
    #' @param useEncryption useEncryption
    #' @param createUser createUser
    #' @param addGroupMemberships addGroupMemberships
    #' @param groupMembershipAttribute groupMembershipAttribute
    #' @param defaultGroups defaultGroups
    #' @param nameIdFormat nameIdFormat
    #' @param synchronizeAttributes synchronizeAttributes
    #' @param handleLogout handleLogout
    #' @param logoutUrl logoutUrl
    #' @param clockTolerance clockTolerance
    #' @param digestMethod digestMethod
    #' @param signatureMethod signatureMethod
    #' @param userIntermediatePath userIntermediatePath
    #' @param ... Other optional arguments.
    initialize = function(`path` = NULL, `service.ranking` = NULL, `idpUrl` = NULL, `idpCertAlias` = NULL, `idpHttpRedirect` = NULL, `serviceProviderEntityId` = NULL, `assertionConsumerServiceURL` = NULL, `spPrivateKeyAlias` = NULL, `keyStorePassword` = NULL, `defaultRedirectUrl` = NULL, `userIDAttribute` = NULL, `useEncryption` = NULL, `createUser` = NULL, `addGroupMemberships` = NULL, `groupMembershipAttribute` = NULL, `defaultGroups` = NULL, `nameIdFormat` = NULL, `synchronizeAttributes` = NULL, `handleLogout` = NULL, `logoutUrl` = NULL, `clockTolerance` = NULL, `digestMethod` = NULL, `signatureMethod` = NULL, `userIntermediatePath` = NULL, ...) {
      if (!is.null(`path`)) {
        stopifnot(R6::is.R6(`path`))
        self$`path` <- `path`
      }
      if (!is.null(`service.ranking`)) {
        stopifnot(R6::is.R6(`service.ranking`))
        self$`service.ranking` <- `service.ranking`
      }
      if (!is.null(`idpUrl`)) {
        stopifnot(R6::is.R6(`idpUrl`))
        self$`idpUrl` <- `idpUrl`
      }
      if (!is.null(`idpCertAlias`)) {
        stopifnot(R6::is.R6(`idpCertAlias`))
        self$`idpCertAlias` <- `idpCertAlias`
      }
      if (!is.null(`idpHttpRedirect`)) {
        stopifnot(R6::is.R6(`idpHttpRedirect`))
        self$`idpHttpRedirect` <- `idpHttpRedirect`
      }
      if (!is.null(`serviceProviderEntityId`)) {
        stopifnot(R6::is.R6(`serviceProviderEntityId`))
        self$`serviceProviderEntityId` <- `serviceProviderEntityId`
      }
      if (!is.null(`assertionConsumerServiceURL`)) {
        stopifnot(R6::is.R6(`assertionConsumerServiceURL`))
        self$`assertionConsumerServiceURL` <- `assertionConsumerServiceURL`
      }
      if (!is.null(`spPrivateKeyAlias`)) {
        stopifnot(R6::is.R6(`spPrivateKeyAlias`))
        self$`spPrivateKeyAlias` <- `spPrivateKeyAlias`
      }
      if (!is.null(`keyStorePassword`)) {
        stopifnot(R6::is.R6(`keyStorePassword`))
        self$`keyStorePassword` <- `keyStorePassword`
      }
      if (!is.null(`defaultRedirectUrl`)) {
        stopifnot(R6::is.R6(`defaultRedirectUrl`))
        self$`defaultRedirectUrl` <- `defaultRedirectUrl`
      }
      if (!is.null(`userIDAttribute`)) {
        stopifnot(R6::is.R6(`userIDAttribute`))
        self$`userIDAttribute` <- `userIDAttribute`
      }
      if (!is.null(`useEncryption`)) {
        stopifnot(R6::is.R6(`useEncryption`))
        self$`useEncryption` <- `useEncryption`
      }
      if (!is.null(`createUser`)) {
        stopifnot(R6::is.R6(`createUser`))
        self$`createUser` <- `createUser`
      }
      if (!is.null(`addGroupMemberships`)) {
        stopifnot(R6::is.R6(`addGroupMemberships`))
        self$`addGroupMemberships` <- `addGroupMemberships`
      }
      if (!is.null(`groupMembershipAttribute`)) {
        stopifnot(R6::is.R6(`groupMembershipAttribute`))
        self$`groupMembershipAttribute` <- `groupMembershipAttribute`
      }
      if (!is.null(`defaultGroups`)) {
        stopifnot(R6::is.R6(`defaultGroups`))
        self$`defaultGroups` <- `defaultGroups`
      }
      if (!is.null(`nameIdFormat`)) {
        stopifnot(R6::is.R6(`nameIdFormat`))
        self$`nameIdFormat` <- `nameIdFormat`
      }
      if (!is.null(`synchronizeAttributes`)) {
        stopifnot(R6::is.R6(`synchronizeAttributes`))
        self$`synchronizeAttributes` <- `synchronizeAttributes`
      }
      if (!is.null(`handleLogout`)) {
        stopifnot(R6::is.R6(`handleLogout`))
        self$`handleLogout` <- `handleLogout`
      }
      if (!is.null(`logoutUrl`)) {
        stopifnot(R6::is.R6(`logoutUrl`))
        self$`logoutUrl` <- `logoutUrl`
      }
      if (!is.null(`clockTolerance`)) {
        stopifnot(R6::is.R6(`clockTolerance`))
        self$`clockTolerance` <- `clockTolerance`
      }
      if (!is.null(`digestMethod`)) {
        stopifnot(R6::is.R6(`digestMethod`))
        self$`digestMethod` <- `digestMethod`
      }
      if (!is.null(`signatureMethod`)) {
        stopifnot(R6::is.R6(`signatureMethod`))
        self$`signatureMethod` <- `signatureMethod`
      }
      if (!is.null(`userIntermediatePath`)) {
        stopifnot(R6::is.R6(`userIntermediatePath`))
        self$`userIntermediatePath` <- `userIntermediatePath`
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
    #' @return SamlConfigurationProperties as a base R list.
    #' @examples
    #' # convert array of SamlConfigurationProperties (x) to a data frame
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
    #' Convert SamlConfigurationProperties to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SamlConfigurationPropertiesObject <- list()
      if (!is.null(self$`path`)) {
        SamlConfigurationPropertiesObject[["path"]] <-
          self$extractSimpleType(self$`path`)
      }
      if (!is.null(self$`service.ranking`)) {
        SamlConfigurationPropertiesObject[["service.ranking"]] <-
          self$extractSimpleType(self$`service.ranking`)
      }
      if (!is.null(self$`idpUrl`)) {
        SamlConfigurationPropertiesObject[["idpUrl"]] <-
          self$extractSimpleType(self$`idpUrl`)
      }
      if (!is.null(self$`idpCertAlias`)) {
        SamlConfigurationPropertiesObject[["idpCertAlias"]] <-
          self$extractSimpleType(self$`idpCertAlias`)
      }
      if (!is.null(self$`idpHttpRedirect`)) {
        SamlConfigurationPropertiesObject[["idpHttpRedirect"]] <-
          self$extractSimpleType(self$`idpHttpRedirect`)
      }
      if (!is.null(self$`serviceProviderEntityId`)) {
        SamlConfigurationPropertiesObject[["serviceProviderEntityId"]] <-
          self$extractSimpleType(self$`serviceProviderEntityId`)
      }
      if (!is.null(self$`assertionConsumerServiceURL`)) {
        SamlConfigurationPropertiesObject[["assertionConsumerServiceURL"]] <-
          self$extractSimpleType(self$`assertionConsumerServiceURL`)
      }
      if (!is.null(self$`spPrivateKeyAlias`)) {
        SamlConfigurationPropertiesObject[["spPrivateKeyAlias"]] <-
          self$extractSimpleType(self$`spPrivateKeyAlias`)
      }
      if (!is.null(self$`keyStorePassword`)) {
        SamlConfigurationPropertiesObject[["keyStorePassword"]] <-
          self$extractSimpleType(self$`keyStorePassword`)
      }
      if (!is.null(self$`defaultRedirectUrl`)) {
        SamlConfigurationPropertiesObject[["defaultRedirectUrl"]] <-
          self$extractSimpleType(self$`defaultRedirectUrl`)
      }
      if (!is.null(self$`userIDAttribute`)) {
        SamlConfigurationPropertiesObject[["userIDAttribute"]] <-
          self$extractSimpleType(self$`userIDAttribute`)
      }
      if (!is.null(self$`useEncryption`)) {
        SamlConfigurationPropertiesObject[["useEncryption"]] <-
          self$extractSimpleType(self$`useEncryption`)
      }
      if (!is.null(self$`createUser`)) {
        SamlConfigurationPropertiesObject[["createUser"]] <-
          self$extractSimpleType(self$`createUser`)
      }
      if (!is.null(self$`addGroupMemberships`)) {
        SamlConfigurationPropertiesObject[["addGroupMemberships"]] <-
          self$extractSimpleType(self$`addGroupMemberships`)
      }
      if (!is.null(self$`groupMembershipAttribute`)) {
        SamlConfigurationPropertiesObject[["groupMembershipAttribute"]] <-
          self$extractSimpleType(self$`groupMembershipAttribute`)
      }
      if (!is.null(self$`defaultGroups`)) {
        SamlConfigurationPropertiesObject[["defaultGroups"]] <-
          self$extractSimpleType(self$`defaultGroups`)
      }
      if (!is.null(self$`nameIdFormat`)) {
        SamlConfigurationPropertiesObject[["nameIdFormat"]] <-
          self$extractSimpleType(self$`nameIdFormat`)
      }
      if (!is.null(self$`synchronizeAttributes`)) {
        SamlConfigurationPropertiesObject[["synchronizeAttributes"]] <-
          self$extractSimpleType(self$`synchronizeAttributes`)
      }
      if (!is.null(self$`handleLogout`)) {
        SamlConfigurationPropertiesObject[["handleLogout"]] <-
          self$extractSimpleType(self$`handleLogout`)
      }
      if (!is.null(self$`logoutUrl`)) {
        SamlConfigurationPropertiesObject[["logoutUrl"]] <-
          self$extractSimpleType(self$`logoutUrl`)
      }
      if (!is.null(self$`clockTolerance`)) {
        SamlConfigurationPropertiesObject[["clockTolerance"]] <-
          self$extractSimpleType(self$`clockTolerance`)
      }
      if (!is.null(self$`digestMethod`)) {
        SamlConfigurationPropertiesObject[["digestMethod"]] <-
          self$extractSimpleType(self$`digestMethod`)
      }
      if (!is.null(self$`signatureMethod`)) {
        SamlConfigurationPropertiesObject[["signatureMethod"]] <-
          self$extractSimpleType(self$`signatureMethod`)
      }
      if (!is.null(self$`userIntermediatePath`)) {
        SamlConfigurationPropertiesObject[["userIntermediatePath"]] <-
          self$extractSimpleType(self$`userIntermediatePath`)
      }
      return(SamlConfigurationPropertiesObject)
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
    #' Deserialize JSON string into an instance of SamlConfigurationProperties
    #'
    #' @param input_json the JSON input
    #' @return the instance of SamlConfigurationProperties
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`path`)) {
        `path_object` <- SamlConfigurationPropertyItemsArray$new()
        `path_object`$fromJSON(jsonlite::toJSON(this_object$`path`, auto_unbox = TRUE, digits = NA))
        self$`path` <- `path_object`
      }
      if (!is.null(this_object$`service.ranking`)) {
        `service.ranking_object` <- SamlConfigurationPropertyItemsLong$new()
        `service.ranking_object`$fromJSON(jsonlite::toJSON(this_object$`service.ranking`, auto_unbox = TRUE, digits = NA))
        self$`service.ranking` <- `service.ranking_object`
      }
      if (!is.null(this_object$`idpUrl`)) {
        `idpurl_object` <- SamlConfigurationPropertyItemsString$new()
        `idpurl_object`$fromJSON(jsonlite::toJSON(this_object$`idpUrl`, auto_unbox = TRUE, digits = NA))
        self$`idpUrl` <- `idpurl_object`
      }
      if (!is.null(this_object$`idpCertAlias`)) {
        `idpcertalias_object` <- SamlConfigurationPropertyItemsString$new()
        `idpcertalias_object`$fromJSON(jsonlite::toJSON(this_object$`idpCertAlias`, auto_unbox = TRUE, digits = NA))
        self$`idpCertAlias` <- `idpcertalias_object`
      }
      if (!is.null(this_object$`idpHttpRedirect`)) {
        `idphttpredirect_object` <- SamlConfigurationPropertyItemsBoolean$new()
        `idphttpredirect_object`$fromJSON(jsonlite::toJSON(this_object$`idpHttpRedirect`, auto_unbox = TRUE, digits = NA))
        self$`idpHttpRedirect` <- `idphttpredirect_object`
      }
      if (!is.null(this_object$`serviceProviderEntityId`)) {
        `serviceproviderentityid_object` <- SamlConfigurationPropertyItemsString$new()
        `serviceproviderentityid_object`$fromJSON(jsonlite::toJSON(this_object$`serviceProviderEntityId`, auto_unbox = TRUE, digits = NA))
        self$`serviceProviderEntityId` <- `serviceproviderentityid_object`
      }
      if (!is.null(this_object$`assertionConsumerServiceURL`)) {
        `assertionconsumerserviceurl_object` <- SamlConfigurationPropertyItemsString$new()
        `assertionconsumerserviceurl_object`$fromJSON(jsonlite::toJSON(this_object$`assertionConsumerServiceURL`, auto_unbox = TRUE, digits = NA))
        self$`assertionConsumerServiceURL` <- `assertionconsumerserviceurl_object`
      }
      if (!is.null(this_object$`spPrivateKeyAlias`)) {
        `spprivatekeyalias_object` <- SamlConfigurationPropertyItemsString$new()
        `spprivatekeyalias_object`$fromJSON(jsonlite::toJSON(this_object$`spPrivateKeyAlias`, auto_unbox = TRUE, digits = NA))
        self$`spPrivateKeyAlias` <- `spprivatekeyalias_object`
      }
      if (!is.null(this_object$`keyStorePassword`)) {
        `keystorepassword_object` <- SamlConfigurationPropertyItemsString$new()
        `keystorepassword_object`$fromJSON(jsonlite::toJSON(this_object$`keyStorePassword`, auto_unbox = TRUE, digits = NA))
        self$`keyStorePassword` <- `keystorepassword_object`
      }
      if (!is.null(this_object$`defaultRedirectUrl`)) {
        `defaultredirecturl_object` <- SamlConfigurationPropertyItemsString$new()
        `defaultredirecturl_object`$fromJSON(jsonlite::toJSON(this_object$`defaultRedirectUrl`, auto_unbox = TRUE, digits = NA))
        self$`defaultRedirectUrl` <- `defaultredirecturl_object`
      }
      if (!is.null(this_object$`userIDAttribute`)) {
        `useridattribute_object` <- SamlConfigurationPropertyItemsString$new()
        `useridattribute_object`$fromJSON(jsonlite::toJSON(this_object$`userIDAttribute`, auto_unbox = TRUE, digits = NA))
        self$`userIDAttribute` <- `useridattribute_object`
      }
      if (!is.null(this_object$`useEncryption`)) {
        `useencryption_object` <- SamlConfigurationPropertyItemsBoolean$new()
        `useencryption_object`$fromJSON(jsonlite::toJSON(this_object$`useEncryption`, auto_unbox = TRUE, digits = NA))
        self$`useEncryption` <- `useencryption_object`
      }
      if (!is.null(this_object$`createUser`)) {
        `createuser_object` <- SamlConfigurationPropertyItemsBoolean$new()
        `createuser_object`$fromJSON(jsonlite::toJSON(this_object$`createUser`, auto_unbox = TRUE, digits = NA))
        self$`createUser` <- `createuser_object`
      }
      if (!is.null(this_object$`addGroupMemberships`)) {
        `addgroupmemberships_object` <- SamlConfigurationPropertyItemsBoolean$new()
        `addgroupmemberships_object`$fromJSON(jsonlite::toJSON(this_object$`addGroupMemberships`, auto_unbox = TRUE, digits = NA))
        self$`addGroupMemberships` <- `addgroupmemberships_object`
      }
      if (!is.null(this_object$`groupMembershipAttribute`)) {
        `groupmembershipattribute_object` <- SamlConfigurationPropertyItemsString$new()
        `groupmembershipattribute_object`$fromJSON(jsonlite::toJSON(this_object$`groupMembershipAttribute`, auto_unbox = TRUE, digits = NA))
        self$`groupMembershipAttribute` <- `groupmembershipattribute_object`
      }
      if (!is.null(this_object$`defaultGroups`)) {
        `defaultgroups_object` <- SamlConfigurationPropertyItemsArray$new()
        `defaultgroups_object`$fromJSON(jsonlite::toJSON(this_object$`defaultGroups`, auto_unbox = TRUE, digits = NA))
        self$`defaultGroups` <- `defaultgroups_object`
      }
      if (!is.null(this_object$`nameIdFormat`)) {
        `nameidformat_object` <- SamlConfigurationPropertyItemsString$new()
        `nameidformat_object`$fromJSON(jsonlite::toJSON(this_object$`nameIdFormat`, auto_unbox = TRUE, digits = NA))
        self$`nameIdFormat` <- `nameidformat_object`
      }
      if (!is.null(this_object$`synchronizeAttributes`)) {
        `synchronizeattributes_object` <- SamlConfigurationPropertyItemsArray$new()
        `synchronizeattributes_object`$fromJSON(jsonlite::toJSON(this_object$`synchronizeAttributes`, auto_unbox = TRUE, digits = NA))
        self$`synchronizeAttributes` <- `synchronizeattributes_object`
      }
      if (!is.null(this_object$`handleLogout`)) {
        `handlelogout_object` <- SamlConfigurationPropertyItemsBoolean$new()
        `handlelogout_object`$fromJSON(jsonlite::toJSON(this_object$`handleLogout`, auto_unbox = TRUE, digits = NA))
        self$`handleLogout` <- `handlelogout_object`
      }
      if (!is.null(this_object$`logoutUrl`)) {
        `logouturl_object` <- SamlConfigurationPropertyItemsString$new()
        `logouturl_object`$fromJSON(jsonlite::toJSON(this_object$`logoutUrl`, auto_unbox = TRUE, digits = NA))
        self$`logoutUrl` <- `logouturl_object`
      }
      if (!is.null(this_object$`clockTolerance`)) {
        `clocktolerance_object` <- SamlConfigurationPropertyItemsLong$new()
        `clocktolerance_object`$fromJSON(jsonlite::toJSON(this_object$`clockTolerance`, auto_unbox = TRUE, digits = NA))
        self$`clockTolerance` <- `clocktolerance_object`
      }
      if (!is.null(this_object$`digestMethod`)) {
        `digestmethod_object` <- SamlConfigurationPropertyItemsString$new()
        `digestmethod_object`$fromJSON(jsonlite::toJSON(this_object$`digestMethod`, auto_unbox = TRUE, digits = NA))
        self$`digestMethod` <- `digestmethod_object`
      }
      if (!is.null(this_object$`signatureMethod`)) {
        `signaturemethod_object` <- SamlConfigurationPropertyItemsString$new()
        `signaturemethod_object`$fromJSON(jsonlite::toJSON(this_object$`signatureMethod`, auto_unbox = TRUE, digits = NA))
        self$`signatureMethod` <- `signaturemethod_object`
      }
      if (!is.null(this_object$`userIntermediatePath`)) {
        `userintermediatepath_object` <- SamlConfigurationPropertyItemsString$new()
        `userintermediatepath_object`$fromJSON(jsonlite::toJSON(this_object$`userIntermediatePath`, auto_unbox = TRUE, digits = NA))
        self$`userIntermediatePath` <- `userintermediatepath_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SamlConfigurationProperties in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SamlConfigurationProperties
    #'
    #' @param input_json the JSON input
    #' @return the instance of SamlConfigurationProperties
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`path` <- SamlConfigurationPropertyItemsArray$new()$fromJSON(jsonlite::toJSON(this_object$`path`, auto_unbox = TRUE, digits = NA))
      self$`service.ranking` <- SamlConfigurationPropertyItemsLong$new()$fromJSON(jsonlite::toJSON(this_object$`service.ranking`, auto_unbox = TRUE, digits = NA))
      self$`idpUrl` <- SamlConfigurationPropertyItemsString$new()$fromJSON(jsonlite::toJSON(this_object$`idpUrl`, auto_unbox = TRUE, digits = NA))
      self$`idpCertAlias` <- SamlConfigurationPropertyItemsString$new()$fromJSON(jsonlite::toJSON(this_object$`idpCertAlias`, auto_unbox = TRUE, digits = NA))
      self$`idpHttpRedirect` <- SamlConfigurationPropertyItemsBoolean$new()$fromJSON(jsonlite::toJSON(this_object$`idpHttpRedirect`, auto_unbox = TRUE, digits = NA))
      self$`serviceProviderEntityId` <- SamlConfigurationPropertyItemsString$new()$fromJSON(jsonlite::toJSON(this_object$`serviceProviderEntityId`, auto_unbox = TRUE, digits = NA))
      self$`assertionConsumerServiceURL` <- SamlConfigurationPropertyItemsString$new()$fromJSON(jsonlite::toJSON(this_object$`assertionConsumerServiceURL`, auto_unbox = TRUE, digits = NA))
      self$`spPrivateKeyAlias` <- SamlConfigurationPropertyItemsString$new()$fromJSON(jsonlite::toJSON(this_object$`spPrivateKeyAlias`, auto_unbox = TRUE, digits = NA))
      self$`keyStorePassword` <- SamlConfigurationPropertyItemsString$new()$fromJSON(jsonlite::toJSON(this_object$`keyStorePassword`, auto_unbox = TRUE, digits = NA))
      self$`defaultRedirectUrl` <- SamlConfigurationPropertyItemsString$new()$fromJSON(jsonlite::toJSON(this_object$`defaultRedirectUrl`, auto_unbox = TRUE, digits = NA))
      self$`userIDAttribute` <- SamlConfigurationPropertyItemsString$new()$fromJSON(jsonlite::toJSON(this_object$`userIDAttribute`, auto_unbox = TRUE, digits = NA))
      self$`useEncryption` <- SamlConfigurationPropertyItemsBoolean$new()$fromJSON(jsonlite::toJSON(this_object$`useEncryption`, auto_unbox = TRUE, digits = NA))
      self$`createUser` <- SamlConfigurationPropertyItemsBoolean$new()$fromJSON(jsonlite::toJSON(this_object$`createUser`, auto_unbox = TRUE, digits = NA))
      self$`addGroupMemberships` <- SamlConfigurationPropertyItemsBoolean$new()$fromJSON(jsonlite::toJSON(this_object$`addGroupMemberships`, auto_unbox = TRUE, digits = NA))
      self$`groupMembershipAttribute` <- SamlConfigurationPropertyItemsString$new()$fromJSON(jsonlite::toJSON(this_object$`groupMembershipAttribute`, auto_unbox = TRUE, digits = NA))
      self$`defaultGroups` <- SamlConfigurationPropertyItemsArray$new()$fromJSON(jsonlite::toJSON(this_object$`defaultGroups`, auto_unbox = TRUE, digits = NA))
      self$`nameIdFormat` <- SamlConfigurationPropertyItemsString$new()$fromJSON(jsonlite::toJSON(this_object$`nameIdFormat`, auto_unbox = TRUE, digits = NA))
      self$`synchronizeAttributes` <- SamlConfigurationPropertyItemsArray$new()$fromJSON(jsonlite::toJSON(this_object$`synchronizeAttributes`, auto_unbox = TRUE, digits = NA))
      self$`handleLogout` <- SamlConfigurationPropertyItemsBoolean$new()$fromJSON(jsonlite::toJSON(this_object$`handleLogout`, auto_unbox = TRUE, digits = NA))
      self$`logoutUrl` <- SamlConfigurationPropertyItemsString$new()$fromJSON(jsonlite::toJSON(this_object$`logoutUrl`, auto_unbox = TRUE, digits = NA))
      self$`clockTolerance` <- SamlConfigurationPropertyItemsLong$new()$fromJSON(jsonlite::toJSON(this_object$`clockTolerance`, auto_unbox = TRUE, digits = NA))
      self$`digestMethod` <- SamlConfigurationPropertyItemsString$new()$fromJSON(jsonlite::toJSON(this_object$`digestMethod`, auto_unbox = TRUE, digits = NA))
      self$`signatureMethod` <- SamlConfigurationPropertyItemsString$new()$fromJSON(jsonlite::toJSON(this_object$`signatureMethod`, auto_unbox = TRUE, digits = NA))
      self$`userIntermediatePath` <- SamlConfigurationPropertyItemsString$new()$fromJSON(jsonlite::toJSON(this_object$`userIntermediatePath`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to SamlConfigurationProperties and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SamlConfigurationProperties
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
# SamlConfigurationProperties$unlock()
#
## Below is an example to define the print function
# SamlConfigurationProperties$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SamlConfigurationProperties$lock()

