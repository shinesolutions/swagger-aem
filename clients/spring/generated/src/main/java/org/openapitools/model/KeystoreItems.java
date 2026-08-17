package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeystoreChainItems;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * KeystoreItems
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-17T07:15:54.600438135Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class KeystoreItems {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String alias;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String entryType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String algorithm;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String format;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid KeystoreChainItems> chain = new ArrayList<>();

  public KeystoreItems alias(@Nullable String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Keystore alias name
   * @return alias
   */
  
  @Schema(name = "alias", description = "Keystore alias name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alias")
  public @Nullable String getAlias() {
    return alias;
  }

  @JsonProperty("alias")
  public void setAlias(@Nullable String alias) {
    this.alias = alias;
  }

  public KeystoreItems entryType(@Nullable String entryType) {
    this.entryType = entryType;
    return this;
  }

  /**
   * e.g. \"privateKey\"
   * @return entryType
   */
  
  @Schema(name = "entryType", description = "e.g. \"privateKey\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entryType")
  public @Nullable String getEntryType() {
    return entryType;
  }

  @JsonProperty("entryType")
  public void setEntryType(@Nullable String entryType) {
    this.entryType = entryType;
  }

  public KeystoreItems algorithm(@Nullable String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  /**
   * e.g. \"RSA\"
   * @return algorithm
   */
  
  @Schema(name = "algorithm", description = "e.g. \"RSA\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("algorithm")
  public @Nullable String getAlgorithm() {
    return algorithm;
  }

  @JsonProperty("algorithm")
  public void setAlgorithm(@Nullable String algorithm) {
    this.algorithm = algorithm;
  }

  public KeystoreItems format(@Nullable String format) {
    this.format = format;
    return this;
  }

  /**
   * e.g. \"PKCS#8\"
   * @return format
   */
  
  @Schema(name = "format", description = "e.g. \"PKCS#8\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("format")
  public @Nullable String getFormat() {
    return format;
  }

  @JsonProperty("format")
  public void setFormat(@Nullable String format) {
    this.format = format;
  }

  public KeystoreItems chain(List<@Valid KeystoreChainItems> chain) {
    this.chain = chain;
    return this;
  }

  public KeystoreItems addChainItem(KeystoreChainItems chainItem) {
    if (this.chain == null) {
      this.chain = new ArrayList<>();
    }
    this.chain.add(chainItem);
    return this;
  }

  /**
   * Get chain
   * @return chain
   */
  @Valid 
  @Schema(name = "chain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("chain")
  public List<@Valid KeystoreChainItems> getChain() {
    return chain;
  }

  @JsonProperty("chain")
  public void setChain(List<@Valid KeystoreChainItems> chain) {
    this.chain = chain;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeystoreItems keystoreItems = (KeystoreItems) o;
    return Objects.equals(this.alias, keystoreItems.alias) &&
        Objects.equals(this.entryType, keystoreItems.entryType) &&
        Objects.equals(this.algorithm, keystoreItems.algorithm) &&
        Objects.equals(this.format, keystoreItems.format) &&
        Objects.equals(this.chain, keystoreItems.chain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, entryType, algorithm, format, chain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeystoreItems {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
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

