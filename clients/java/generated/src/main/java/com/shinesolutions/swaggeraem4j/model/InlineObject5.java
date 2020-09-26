/*
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.4.0-pre.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.io.IOException;

/**
 * InlineObject5
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-26T04:28:17.575Z[GMT]")
public class InlineObject5 {
  public static final String SERIALIZED_NAME_PRIVATEKEY_FILE = "privatekeyFile";
  @SerializedName(SERIALIZED_NAME_PRIVATEKEY_FILE)
  private File privatekeyFile;

  public static final String SERIALIZED_NAME_CERTIFICATE_FILE = "certificateFile";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_FILE)
  private File certificateFile;


  public InlineObject5 privatekeyFile(File privatekeyFile) {
    
    this.privatekeyFile = privatekeyFile;
    return this;
  }

   /**
   * Get privatekeyFile
   * @return privatekeyFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getPrivatekeyFile() {
    return privatekeyFile;
  }


  public void setPrivatekeyFile(File privatekeyFile) {
    this.privatekeyFile = privatekeyFile;
  }


  public InlineObject5 certificateFile(File certificateFile) {
    
    this.certificateFile = certificateFile;
    return this;
  }

   /**
   * Get certificateFile
   * @return certificateFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getCertificateFile() {
    return certificateFile;
  }


  public void setCertificateFile(File certificateFile) {
    this.certificateFile = certificateFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject5 inlineObject5 = (InlineObject5) o;
    return Objects.equals(this.privatekeyFile, inlineObject5.privatekeyFile) &&
        Objects.equals(this.certificateFile, inlineObject5.certificateFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privatekeyFile, certificateFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject5 {\n");
    sb.append("    privatekeyFile: ").append(toIndentedString(privatekeyFile)).append("\n");
    sb.append("    certificateFile: ").append(toIndentedString(certificateFile)).append("\n");
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
