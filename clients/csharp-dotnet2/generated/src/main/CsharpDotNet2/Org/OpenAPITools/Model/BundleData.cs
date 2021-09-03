using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class BundleData {
    /// <summary>
    /// Bundle ID
    /// </summary>
    /// <value>Bundle ID</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public int? Id { get; set; }

    /// <summary>
    /// Bundle name
    /// </summary>
    /// <value>Bundle name</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Is bundle a fragment
    /// </summary>
    /// <value>Is bundle a fragment</value>
    [DataMember(Name="fragment", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fragment")]
    public bool? Fragment { get; set; }

    /// <summary>
    /// Numeric raw bundle state value
    /// </summary>
    /// <value>Numeric raw bundle state value</value>
    [DataMember(Name="stateRaw", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stateRaw")]
    public int? StateRaw { get; set; }

    /// <summary>
    /// Bundle state value
    /// </summary>
    /// <value>Bundle state value</value>
    [DataMember(Name="state", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "state")]
    public string State { get; set; }

    /// <summary>
    /// Bundle version
    /// </summary>
    /// <value>Bundle version</value>
    [DataMember(Name="version", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "version")]
    public string _Version { get; set; }

    /// <summary>
    /// Bundle symbolic name
    /// </summary>
    /// <value>Bundle symbolic name</value>
    [DataMember(Name="symbolicName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "symbolicName")]
    public string SymbolicName { get; set; }

    /// <summary>
    /// Bundle category
    /// </summary>
    /// <value>Bundle category</value>
    [DataMember(Name="category", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "category")]
    public string Category { get; set; }

    /// <summary>
    /// Gets or Sets Props
    /// </summary>
    [DataMember(Name="props", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "props")]
    public List<BundleDataProp> Props { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
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
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }

}
}
