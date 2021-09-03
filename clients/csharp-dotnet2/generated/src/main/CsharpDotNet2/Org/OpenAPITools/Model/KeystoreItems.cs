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
  public class KeystoreItems {
    /// <summary>
    /// Keystore alias name
    /// </summary>
    /// <value>Keystore alias name</value>
    [DataMember(Name="alias", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "alias")]
    public string Alias { get; set; }

    /// <summary>
    /// e.g. \"privateKey\"
    /// </summary>
    /// <value>e.g. \"privateKey\"</value>
    [DataMember(Name="entryType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "entryType")]
    public string EntryType { get; set; }

    /// <summary>
    /// e.g. \"RSA\"
    /// </summary>
    /// <value>e.g. \"RSA\"</value>
    [DataMember(Name="algorithm", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "algorithm")]
    public string Algorithm { get; set; }

    /// <summary>
    /// e.g. \"PKCS#8\"
    /// </summary>
    /// <value>e.g. \"PKCS#8\"</value>
    [DataMember(Name="format", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "format")]
    public string Format { get; set; }

    /// <summary>
    /// Gets or Sets Chain
    /// </summary>
    [DataMember(Name="chain", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "chain")]
    public List<KeystoreChainItems> Chain { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class KeystoreItems {\n");
      sb.Append("  Alias: ").Append(Alias).Append("\n");
      sb.Append("  EntryType: ").Append(EntryType).Append("\n");
      sb.Append("  Algorithm: ").Append(Algorithm).Append("\n");
      sb.Append("  Format: ").Append(Format).Append("\n");
      sb.Append("  Chain: ").Append(Chain).Append("\n");
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
