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
    public partial class BundleData : IEquatable<BundleData>
    {
        /// <summary>
        /// Bundle ID
        /// </summary>
        /// <value>Bundle ID</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public int Id { get; set; }

        /// <summary>
        /// Bundle name
        /// </summary>
        /// <value>Bundle name</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Is bundle a fragment
        /// </summary>
        /// <value>Is bundle a fragment</value>
        [DataMember(Name="fragment", EmitDefaultValue=false)]
        public bool Fragment { get; set; }

        /// <summary>
        /// Numeric raw bundle state value
        /// </summary>
        /// <value>Numeric raw bundle state value</value>
        [DataMember(Name="stateRaw", EmitDefaultValue=false)]
        public int StateRaw { get; set; }

        /// <summary>
        /// Bundle state value
        /// </summary>
        /// <value>Bundle state value</value>
        [DataMember(Name="state", EmitDefaultValue=false)]
        public string State { get; set; }

        /// <summary>
        /// Bundle version
        /// </summary>
        /// <value>Bundle version</value>
        [DataMember(Name="version", EmitDefaultValue=false)]
        public string _Version { get; set; }

        /// <summary>
        /// Bundle symbolic name
        /// </summary>
        /// <value>Bundle symbolic name</value>
        [DataMember(Name="symbolicName", EmitDefaultValue=false)]
        public string SymbolicName { get; set; }

        /// <summary>
        /// Bundle category
        /// </summary>
        /// <value>Bundle category</value>
        [DataMember(Name="category", EmitDefaultValue=false)]
        public string Category { get; set; }

        /// <summary>
        /// Gets or Sets Props
        /// </summary>
        [DataMember(Name="props", EmitDefaultValue=false)]
        public List<BundleDataProp> Props { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BundleData {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Fragment: ").Append(Fragment).Append("\n");
            sb.Append("  StateRaw: ").Append(StateRaw).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  _Version: ").Append(_Version).Append("\n");
            sb.Append("  SymbolicName: ").Append(SymbolicName).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  Props: ").Append(Props).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BundleData)obj);
        }

        /// <summary>
        /// Returns true if BundleData instances are equal
        /// </summary>
        /// <param name="other">Instance of BundleData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BundleData other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Fragment == other.Fragment ||
                    
                    Fragment.Equals(other.Fragment)
                ) && 
                (
                    StateRaw == other.StateRaw ||
                    
                    StateRaw.Equals(other.StateRaw)
                ) && 
                (
                    State == other.State ||
                    State != null &&
                    State.Equals(other.State)
                ) && 
                (
                    _Version == other._Version ||
                    _Version != null &&
                    _Version.Equals(other._Version)
                ) && 
                (
                    SymbolicName == other.SymbolicName ||
                    SymbolicName != null &&
                    SymbolicName.Equals(other.SymbolicName)
                ) && 
                (
                    Category == other.Category ||
                    Category != null &&
                    Category.Equals(other.Category)
                ) && 
                (
                    Props == other.Props ||
                    Props != null &&
                    other.Props != null &&
                    Props.SequenceEqual(other.Props)
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
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + Fragment.GetHashCode();
                    
                    hashCode = hashCode * 59 + StateRaw.GetHashCode();
                    if (State != null)
                    hashCode = hashCode * 59 + State.GetHashCode();
                    if (_Version != null)
                    hashCode = hashCode * 59 + _Version.GetHashCode();
                    if (SymbolicName != null)
                    hashCode = hashCode * 59 + SymbolicName.GetHashCode();
                    if (Category != null)
                    hashCode = hashCode * 59 + Category.GetHashCode();
                    if (Props != null)
                    hashCode = hashCode * 59 + Props.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BundleData left, BundleData right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BundleData left, BundleData right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}