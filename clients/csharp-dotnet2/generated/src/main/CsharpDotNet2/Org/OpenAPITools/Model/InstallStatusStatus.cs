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
  public class InstallStatusStatus {
    /// <summary>
    /// Gets or Sets Finished
    /// </summary>
    [DataMember(Name="finished", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "finished")]
    public bool? Finished { get; set; }

    /// <summary>
    /// Gets or Sets ItemCount
    /// </summary>
    [DataMember(Name="itemCount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "itemCount")]
    public int? ItemCount { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class InstallStatusStatus {\n");
      sb.Append("  Finished: ").Append(Finished).Append("\n");
      sb.Append("  ItemCount: ").Append(ItemCount).Append("\n");
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
