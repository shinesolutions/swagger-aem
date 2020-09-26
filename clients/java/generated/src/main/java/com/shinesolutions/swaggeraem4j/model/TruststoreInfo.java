/*
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraem4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraem4j.model.TruststoreItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TruststoreInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-26T04:43:48.113Z[GMT]")
public class TruststoreInfo {
  public static final String SERIALIZED_NAME_ALIASES = "aliases";
  @SerializedName(SERIALIZED_NAME_ALIASES)
  private List<TruststoreItems> aliases = null;

  public static final String SERIALIZED_NAME_EXISTS = "exists";
  @SerializedName(SERIALIZED_NAME_EXISTS)
  private Boolean exists;


  public TruststoreInfo aliases(List<TruststoreItems> aliases) {
    
    this.aliases = aliases;
    return this;
  }

  public TruststoreInfo addAliasesItem(TruststoreItems aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<TruststoreItems>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * False if truststore don&#39;t exist
   * @return exists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "False if truststore don't exist")

  public Boolean getExists() {
    return exists;
  }


  public void setExists(Boolean exists) {
    this.exists = exists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

