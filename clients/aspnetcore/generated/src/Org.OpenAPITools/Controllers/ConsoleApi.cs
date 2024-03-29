/*
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Http;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using Org.OpenAPITools.Attributes;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class ConsoleApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <response code="0">Default response</response>
        [HttpGet]
        [Route("/system/console/status-productinfo.json")]
        [ValidateModelState]
        [SwaggerOperation("GetAemProductInfo")]
        [SwaggerResponse(statusCode: 0, type: typeof(List<string>), description: "Default response")]
        public virtual IActionResult GetAemProductInfo()
        { 

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(List<string>));
            string exampleJson = null;
            exampleJson = "\"\"";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<string>>(exampleJson)
            : default(List<string>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="name"></param>
        /// <response code="200">Retrieved bundle info</response>
        /// <response code="0">Default response</response>
        [HttpGet]
        [Route("/system/console/bundles/{name}.json")]
        [ValidateModelState]
        [SwaggerOperation("GetBundleInfo")]
        [SwaggerResponse(statusCode: 200, type: typeof(BundleInfo), description: "Retrieved bundle info")]
        [SwaggerResponse(statusCode: 0, type: typeof(string), description: "Default response")]
        public virtual IActionResult GetBundleInfo([FromRoute (Name = "name")][Required]string name)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(BundleInfo));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(string));
            string exampleJson = null;
            exampleJson = "{\n  \"s\" : [ 0, 0 ],\n  \"data\" : [ {\n    \"fragment\" : true,\n    \"stateRaw\" : 1,\n    \"name\" : \"name\",\n    \"symbolicName\" : \"symbolicName\",\n    \"id\" : 6,\n    \"state\" : \"state\",\n    \"category\" : \"category\",\n    \"version\" : \"version\",\n    \"props\" : [ {\n      \"value\" : \"value\",\n      \"key\" : \"key\"\n    }, {\n      \"value\" : \"value\",\n      \"key\" : \"key\"\n    } ]\n  }, {\n    \"fragment\" : true,\n    \"stateRaw\" : 1,\n    \"name\" : \"name\",\n    \"symbolicName\" : \"symbolicName\",\n    \"id\" : 6,\n    \"state\" : \"state\",\n    \"category\" : \"category\",\n    \"version\" : \"version\",\n    \"props\" : [ {\n      \"value\" : \"value\",\n      \"key\" : \"key\"\n    }, {\n      \"value\" : \"value\",\n      \"key\" : \"key\"\n    } ]\n  } ],\n  \"status\" : \"status\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<BundleInfo>(exampleJson)
            : default(BundleInfo);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <response code="200">OK</response>
        /// <response code="5XX">Unexpected error.</response>
        [HttpGet]
        [Route("/system/console/configMgr")]
        [ValidateModelState]
        [SwaggerOperation("GetConfigMgr")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "OK")]
        public virtual IActionResult GetConfigMgr()
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(string));
            //TODO: Uncomment the next line to return response 5XX or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(5XX);
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<string>(exampleJson)
            : default(string);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="name"></param>
        /// <param name="action"></param>
        /// <response code="0">Default response</response>
        [HttpPost]
        [Route("/system/console/bundles/{name}")]
        [ValidateModelState]
        [SwaggerOperation("PostBundle")]
        public virtual IActionResult PostBundle([FromRoute (Name = "name")][Required]string name, [FromQuery (Name = "action")][Required()]string action)
        { 

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0);

            throw new NotImplementedException();
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="action"></param>
        /// <response code="0">Default response</response>
        [HttpPost]
        [Route("/system/console/jmx/com.adobe.granite:type=Repository/op/{action}")]
        [ValidateModelState]
        [SwaggerOperation("PostJmxRepository")]
        public virtual IActionResult PostJmxRepository([FromRoute (Name = "action")][Required]string action)
        { 

            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0);

            throw new NotImplementedException();
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="post"></param>
        /// <param name="apply"></param>
        /// <param name="delete"></param>
        /// <param name="action"></param>
        /// <param name="location"></param>
        /// <param name="path"></param>
        /// <param name="serviceRanking"></param>
        /// <param name="idpUrl"></param>
        /// <param name="idpCertAlias"></param>
        /// <param name="idpHttpRedirect"></param>
        /// <param name="serviceProviderEntityId"></param>
        /// <param name="assertionConsumerServiceURL"></param>
        /// <param name="spPrivateKeyAlias"></param>
        /// <param name="keyStorePassword"></param>
        /// <param name="defaultRedirectUrl"></param>
        /// <param name="userIDAttribute"></param>
        /// <param name="useEncryption"></param>
        /// <param name="createUser"></param>
        /// <param name="addGroupMemberships"></param>
        /// <param name="groupMembershipAttribute"></param>
        /// <param name="defaultGroups"></param>
        /// <param name="nameIdFormat"></param>
        /// <param name="synchronizeAttributes"></param>
        /// <param name="handleLogout"></param>
        /// <param name="logoutUrl"></param>
        /// <param name="clockTolerance"></param>
        /// <param name="digestMethod"></param>
        /// <param name="signatureMethod"></param>
        /// <param name="userIntermediatePath"></param>
        /// <param name="propertylist"></param>
        /// <response code="200">Retrieved AEM SAML Configuration</response>
        /// <response code="302">Default response</response>
        /// <response code="0">Default response</response>
        [HttpPost]
        [Route("/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler")]
        [ValidateModelState]
        [SwaggerOperation("PostSamlConfiguration")]
        [SwaggerResponse(statusCode: 200, type: typeof(SamlConfigurationInfo), description: "Retrieved AEM SAML Configuration")]
        [SwaggerResponse(statusCode: 302, type: typeof(string), description: "Default response")]
        [SwaggerResponse(statusCode: 0, type: typeof(string), description: "Default response")]
        public virtual IActionResult PostSamlConfiguration([FromQuery (Name = "post")]bool? post, [FromQuery (Name = "apply")]bool? apply, [FromQuery (Name = "delete")]bool? delete, [FromQuery (Name = "action")]string action, [FromQuery (Name = "$location")]string location, [FromQuery (Name = "path")]List<string> path, [FromQuery (Name = "service.ranking")]int? serviceRanking, [FromQuery (Name = "idpUrl")]string idpUrl, [FromQuery (Name = "idpCertAlias")]string idpCertAlias, [FromQuery (Name = "idpHttpRedirect")]bool? idpHttpRedirect, [FromQuery (Name = "serviceProviderEntityId")]string serviceProviderEntityId, [FromQuery (Name = "assertionConsumerServiceURL")]string assertionConsumerServiceURL, [FromQuery (Name = "spPrivateKeyAlias")]string spPrivateKeyAlias, [FromQuery (Name = "keyStorePassword")]string keyStorePassword, [FromQuery (Name = "defaultRedirectUrl")]string defaultRedirectUrl, [FromQuery (Name = "userIDAttribute")]string userIDAttribute, [FromQuery (Name = "useEncryption")]bool? useEncryption, [FromQuery (Name = "createUser")]bool? createUser, [FromQuery (Name = "addGroupMemberships")]bool? addGroupMemberships, [FromQuery (Name = "groupMembershipAttribute")]string groupMembershipAttribute, [FromQuery (Name = "defaultGroups")]List<string> defaultGroups, [FromQuery (Name = "nameIdFormat")]string nameIdFormat, [FromQuery (Name = "synchronizeAttributes")]List<string> synchronizeAttributes, [FromQuery (Name = "handleLogout")]bool? handleLogout, [FromQuery (Name = "logoutUrl")]string logoutUrl, [FromQuery (Name = "clockTolerance")]int? clockTolerance, [FromQuery (Name = "digestMethod")]string digestMethod, [FromQuery (Name = "signatureMethod")]string signatureMethod, [FromQuery (Name = "userIntermediatePath")]string userIntermediatePath, [FromQuery (Name = "propertylist")]List<string> propertylist)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(SamlConfigurationInfo));
            //TODO: Uncomment the next line to return response 302 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(302, default(string));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(string));
            string exampleJson = null;
            exampleJson = "";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<SamlConfigurationInfo>(exampleJson)
            : default(SamlConfigurationInfo);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
