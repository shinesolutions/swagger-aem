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
  public class TruststoreItems {
    /// <summary>
    /// Truststore alias name
    /// </summary>
    /// <value>Truststore alias name</value>
    [DataMember(Name="alias", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "alias")]
    public string Alias { get; set; }

    /// <summary>
    /// Gets or Sets EntryType
    /// </summary>
    [DataMember(Name="entryType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "entryType")]
    public string EntryType { get; set; }

    /// <summary>
    /// e.g. \"CN=localhost\"
    /// </summary>
    /// <value>e.g. \"CN=localhost\"</value>
    [DataMember(Name="subject", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subject")]
    public string Subject { get; set; }

    /// <summary>
    /// e.g. \"CN=Admin\"
    /// </summary>
    /// <value>e.g. \"CN=Admin\"</value>
    [DataMember(Name="issuer", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "issuer")]
    public string Issuer { get; set; }

    /// <summary>
    /// e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
    /// </summary>
    /// <value>e.g. \"Sun Jul 01 12:00:00 AEST 2018\"</value>
    [DataMember(Name="notBefore", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "notBefore")]
    public string NotBefore { get; set; }

    /// <summary>
    /// e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
    /// </summary>
    /// <value>e.g. \"Sun Jun 30 23:59:50 AEST 2019\"</value>
    [DataMember(Name="notAfter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "notAfter")]
    public string NotAfter { get; set; }

    /// <summary>
    /// 18165099476682912368
    /// </summary>
    /// <value>18165099476682912368</value>
    [DataMember(Name="serialNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serialNumber")]
    public int? SerialNumber { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class TruststoreItems {\n");
      sb.Append("  Alias: ").Append(Alias).Append("\n");
      sb.Append("  EntryType: ").Append(EntryType).Append("\n");
      sb.Append("  Subject: ").Append(Subject).Append("\n");
      sb.Append("  Issuer: ").Append(Issuer).Append("\n");
      sb.Append("  NotBefore: ").Append(NotBefore).Append("\n");
      sb.Append("  NotAfter: ").Append(NotAfter).Append("\n");
      sb.Append("  SerialNumber: ").Append(SerialNumber).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
