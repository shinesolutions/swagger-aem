package apimodels;

import apimodels.TruststoreItems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TruststoreInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-17T02:15:17.717598878Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TruststoreInfo   {
  @JsonProperty("aliases")
  @Valid

  private List<@Valid TruststoreItems> aliases = null;

  @JsonProperty("exists")
  
  private Boolean exists;

  public TruststoreInfo aliases(List<@Valid TruststoreItems> aliases) {
    this.aliases = aliases;
    return this;
  }

  public TruststoreInfo addAliasesItem(TruststoreItems aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  public List<@Valid TruststoreItems> getAliases() {
    return aliases;
  }

  public void setAliases(List<@Valid TruststoreItems> aliases) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

