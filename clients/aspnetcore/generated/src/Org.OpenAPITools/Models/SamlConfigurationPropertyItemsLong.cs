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
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class SamlConfigurationPropertyItemsLong : IEquatable<SamlConfigurationPropertyItemsLong>
    {
        /// <summary>
        /// property name
        /// </summary>
        /// <value>property name</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// True if optional
        /// </summary>
        /// <value>True if optional</value>
        [DataMember(Name="optional", EmitDefaultValue=false)]
        public bool Optional { get; set; }

        /// <summary>
        /// True if property is set
        /// </summary>
        /// <value>True if property is set</value>
        [DataMember(Name="is_set", EmitDefaultValue=false)]
        public bool IsSet { get; set; }

        /// <summary>
        /// Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password
        /// </summary>
        /// <value>Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password</value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public int Type { get; set; }

        /// <summary>
        /// Property value
        /// </summary>
        /// <value>Property value</value>
        [DataMember(Name="value", EmitDefaultValue=false)]
        public int Value { get; set; }

        /// <summary>
        /// Property description
        /// </summary>
        /// <value>Property description</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SamlConfigurationPropertyItemsLong {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Optional: ").Append(Optional).Append("\n");
            sb.Append("  IsSet: ").Append(IsSet).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((SamlConfigurationPropertyItemsLong)obj);
        }

        /// <summary>
        /// Returns true if SamlConfigurationPropertyItemsLong instances are equal
        /// </summary>
        /// <param name="other">Instance of SamlConfigurationPropertyItemsLong to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SamlConfigurationPropertyItemsLong other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Optional == other.Optional ||
                    
                    Optional.Equals(other.Optional)
                ) && 
                (
                    IsSet == other.IsSet ||
                    
                    IsSet.Equals(other.IsSet)
                ) && 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
                ) && 
                (
                    Value == other.Value ||
                    
                    Value.Equals(other.Value)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
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
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + Optional.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsSet.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    
                    hashCode = hashCode * 59 + Value.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SamlConfigurationPropertyItemsLong left, SamlConfigurationPropertyItemsLong right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SamlConfigurationPropertyItemsLong left, SamlConfigurationPropertyItemsLong right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
