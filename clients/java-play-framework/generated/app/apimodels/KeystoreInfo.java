package apimodels;

import apimodels.KeystoreItems;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * KeystoreInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-09-03T15:25:32.040+10:00[Australia/Melbourne]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class KeystoreInfo   {
  @JsonProperty("aliases")
  @Valid

  private List<KeystoreItems> aliases = null;

  @JsonProperty("exists")
  
  private Boolean exists;

  public KeystoreInfo aliases(List<KeystoreItems> aliases) {
    this.aliases = aliases;
    return this;
  }

  public KeystoreInfo addAliasesItem(KeystoreItems aliasesItem) {
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
  public List<KeystoreItems> getAliases() {
    return aliases;
  }

  public void setAliases(List<KeystoreItems> aliases) {
    this.aliases = aliases;
  }

  public KeystoreInfo exists(Boolean exists) {
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
    KeystoreInfo keystoreInfo = (KeystoreInfo) o;
    return Objects.equals(aliases, keystoreInfo.aliases) &&
        Objects.equals(exists, keystoreInfo.exists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, exists);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeystoreInfo {\n");
    
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

