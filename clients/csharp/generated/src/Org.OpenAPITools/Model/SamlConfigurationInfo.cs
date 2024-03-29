/*
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// SamlConfigurationInfo
    /// </summary>
    [DataContract]
    public partial class SamlConfigurationInfo :  IEquatable<SamlConfigurationInfo>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SamlConfigurationInfo" /> class.
        /// </summary>
        /// <param name="pid">Persistent Identity (PID).</param>
        /// <param name="title">Title.</param>
        /// <param name="description">Title.</param>
        /// <param name="bundleLocation">needed for configuration binding.</param>
        /// <param name="serviceLocation">needed for configuraiton binding.</param>
        /// <param name="properties">properties.</param>
        public SamlConfigurationInfo(string pid = default(string), string title = default(string), string description = default(string), string bundleLocation = default(string), string serviceLocation = default(string), SamlConfigurationProperties properties = default(SamlConfigurationProperties))
        {
            this.Pid = pid;
            this.Title = title;
            this.Description = description;
            this.BundleLocation = bundleLocation;
            this.ServiceLocation = serviceLocation;
            this.Properties = properties;
        }

        /// <summary>
        /// Persistent Identity (PID)
        /// </summary>
        /// <value>Persistent Identity (PID)</value>
        [DataMember(Name="pid", EmitDefaultValue=false)]
        public string Pid { get; set; }

        /// <summary>
        /// Title
        /// </summary>
        /// <value>Title</value>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Title
        /// </summary>
        /// <value>Title</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// needed for configuration binding
        /// </summary>
        /// <value>needed for configuration binding</value>
        [DataMember(Name="bundle_location", EmitDefaultValue=false)]
        public string BundleLocation { get; set; }

        /// <summary>
        /// needed for configuraiton binding
        /// </summary>
        /// <value>needed for configuraiton binding</value>
        [DataMember(Name="service_location", EmitDefaultValue=false)]
        public string ServiceLocation { get; set; }

        /// <summary>
        /// Gets or Sets Properties
        /// </summary>
        [DataMember(Name="properties", EmitDefaultValue=false)]
        public SamlConfigurationProperties Properties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SamlConfigurationInfo {\n");
            sb.Append("  Pid: ").Append(Pid).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  BundleLocation: ").Append(BundleLocation).Append("\n");
            sb.Append("  ServiceLocation: ").Append(ServiceLocation).Append("\n");
            sb.Append("  Properties: ").Append(Properties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as SamlConfigurationInfo);
        }

        /// <summary>
        /// Returns true if SamlConfigurationInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of SamlConfigurationInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SamlConfigurationInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Pid == input.Pid ||
                    (this.Pid != null &&
                    this.Pid.Equals(input.Pid))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.BundleLocation == input.BundleLocation ||
                    (this.BundleLocation != null &&
                    this.BundleLocation.Equals(input.BundleLocation))
                ) && 
                (
                    this.ServiceLocation == input.ServiceLocation ||
                    (this.ServiceLocation != null &&
                    this.ServiceLocation.Equals(input.ServiceLocation))
                ) && 
                (
                    this.Properties == input.Properties ||
                    (this.Properties != null &&
                    this.Properties.Equals(input.Properties))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Pid != null)
                    hashCode = hashCode * 59 + this.Pid.GetHashCode();
                if (this.Title != null)
                    hashCode = hashCode * 59 + this.Title.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.BundleLocation != null)
                    hashCode = hashCode * 59 + this.BundleLocation.GetHashCode();
                if (this.ServiceLocation != null)
                    hashCode = hashCode * 59 + this.ServiceLocation.GetHashCode();
                if (this.Properties != null)
                    hashCode = hashCode * 59 + this.Properties.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
