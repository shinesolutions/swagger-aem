package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.TruststoreItems;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TruststoreInfo   {
  
  private List<TruststoreItems> aliases = new ArrayList<>();
  private Boolean exists;

  public TruststoreInfo () {

  }

  public TruststoreInfo (List<TruststoreItems> aliases, Boolean exists) {
    this.aliases = aliases;
    this.exists = exists;
  }

    
  @JsonProperty("aliases")
  public List<TruststoreItems> getAliases() {
    return aliases;
  }
  public void setAliases(List<TruststoreItems> aliases) {
    this.aliases = aliases;
  }

    
  @JsonProperty("exists")
  public Boolean getExists() {
    return exists;
  }
  public void setExists(Boolean exists) {
    this.exists = exists;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TruststoreInfo truststoreInfo = (TruststoreInfo) o;
    return Objects.equals(aliases, truststoreInfo.aliases) &&
        Objects.equals(exists, truststoreInfo.exists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, exists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TruststoreInfo {\n");
    
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
