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
  public class SamlConfigurationInfo {
    /// <summary>
    /// Persistent Identity (PID)
    /// </summary>
    /// <value>Persistent Identity (PID)</value>
    [DataMember(Name="pid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pid")]
    public string Pid { get; set; }

    /// <summary>
    /// Title
    /// </summary>
    /// <value>Title</value>
    [DataMember(Name="title", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "title")]
    public string Title { get; set; }

    /// <summary>
    /// Title
    /// </summary>
    /// <value>Title</value>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// needed for configuration binding
    /// </summary>
    /// <value>needed for configuration binding</value>
    [DataMember(Name="bundle_location", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "bundle_location")]
    public string BundleLocation { get; set; }

    /// <summary>
    /// needed for configuraiton binding
    /// </summary>
    /// <value>needed for configuraiton binding</value>
    [DataMember(Name="service_location", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service_location")]
    public string ServiceLocation { get; set; }

    /// <summary>
    /// Gets or Sets Properties
    /// </summary>
    [DataMember(Name="properties", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "properties")]
    public SamlConfigurationProperties Properties { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
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
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
