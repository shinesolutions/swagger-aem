package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TruststoreItems;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TruststoreInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-17T07:15:54.600438135Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TruststoreInfo {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid TruststoreItems> aliases = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean exists;

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
   */
  @Valid 
  @Schema(name = "aliases", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aliases")
  public List<@Valid TruststoreItems> getAliases() {
    return aliases;
  }

  @JsonProperty("aliases")
  public void setAliases(List<@Valid TruststoreItems> aliases) {
    this.aliases = aliases;
  }

  public TruststoreInfo exists(@Nullable Boolean exists) {
    this.exists = exists;
    return this;
  }

  /**
   * False if truststore don't exist
   * @return exists
   */
  
  @Schema(name = "exists", description = "False if truststore don't exist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exists")
  public @Nullable Boolean getExists() {
    return exists;
  }

  @JsonProperty("exists")
  public void setExists(@Nullable Boolean exists) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

