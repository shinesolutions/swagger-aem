package apimodels;

import apimodels.TruststoreItems;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * TruststoreInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-09-03T15:25:32.040+10:00[Australia/Melbourne]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TruststoreInfo   {
  @JsonProperty("aliases")
  @Valid

  private List<TruststoreItems> aliases = null;

  @JsonProperty("exists")
  
  private Boolean exists;

  public TruststoreInfo aliases(List<TruststoreItems> aliases) {
    this.aliases = aliases;
    return this;
  }

  public TruststoreInfo addAliasesItem(TruststoreItems aliasesItem) {
    if (aliases == null) {
      aliases = new ArrayList<>();
    }
    aliases.add(aliasesItem);
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  public List<TruststoreItems> getAliases() {
    return aliases;
  }

  public void setAliases(List<TruststoreItems> aliases) {
    this.aliases = aliases;
  }

  public TruststoreInfo exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

   /**
   * False if truststore don't exist
   * @return exists
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

