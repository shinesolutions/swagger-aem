package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TruststoreItems;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-09-03T15:26:06.461+10:00[Australia/Melbourne]")public class TruststoreInfo   {
  
  private @Valid List<TruststoreItems> aliases = new ArrayList<TruststoreItems>();
  private @Valid Boolean exists;

  /**
   **/
  public TruststoreInfo aliases(List<TruststoreItems> aliases) {
    this.aliases = aliases;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("aliases")
  public List<TruststoreItems> getAliases() {
    return aliases;
  }

  public void setAliases(List<TruststoreItems> aliases) {
    this.aliases = aliases;
  }

/**
   * False if truststore don&#39;t exist
   **/
  public TruststoreInfo exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

  

  
  @ApiModelProperty(value = "False if truststore don't exist")
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
    return Objects.equals(this.aliases, truststoreInfo.aliases) &&
        Objects.equals(this.exists, truststoreInfo.exists);
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

