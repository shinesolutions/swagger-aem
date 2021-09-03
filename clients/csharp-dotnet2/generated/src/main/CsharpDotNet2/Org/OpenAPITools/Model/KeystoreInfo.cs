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
  public class KeystoreInfo {
    /// <summary>
    /// Gets or Sets Aliases
    /// </summary>
    [DataMember(Name="aliases", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "aliases")]
    public List<KeystoreItems> Aliases { get; set; }

    /// <summary>
    /// False if truststore don't exist
    /// </summary>
    /// <value>False if truststore don't exist</value>
    [DataMember(Name="exists", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "exists")]
    public bool? Exists { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class KeystoreInfo {\n");
      sb.Append("  Aliases: ").Append(Aliases).Append("\n");
      sb.Append("  Exists: ").Append(Exists).Append("\n");
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
