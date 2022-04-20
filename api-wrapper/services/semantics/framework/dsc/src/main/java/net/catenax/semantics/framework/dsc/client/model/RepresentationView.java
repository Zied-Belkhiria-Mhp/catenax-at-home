/*
 * Dataspace Connector
 * IDS Connector originally developed by the Fraunhofer ISST
 *
 * OpenAPI spec version: 6.2.0
 * Contact: info@dataspace-connector.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.catenax.semantics.framework.dsc.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
/**
 * RepresentationView
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-08T16:15:16.333286600+02:00[Europe/Berlin]")
public class RepresentationView {
  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("modificationDate")
  private OffsetDateTime modificationDate = null;

  @JsonProperty("remoteId")
  private String remoteId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("mediaType")
  private String mediaType = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("additional")
  private Map<String, String> additional = null;

  @JsonProperty("_links")
  private Links _links = null;

  public RepresentationView creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @Schema(description = "")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public RepresentationView modificationDate(OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

   /**
   * Get modificationDate
   * @return modificationDate
  **/
  @Schema(description = "")
  public OffsetDateTime getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
  }

  public RepresentationView remoteId(String remoteId) {
    this.remoteId = remoteId;
    return this;
  }

   /**
   * Get remoteId
   * @return remoteId
  **/
  @Schema(description = "")
  public String getRemoteId() {
    return remoteId;
  }

  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }

  public RepresentationView title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RepresentationView description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RepresentationView mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @Schema(description = "")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public RepresentationView language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @Schema(description = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public RepresentationView additional(Map<String, String> additional) {
    this.additional = additional;
    return this;
  }

  public RepresentationView putAdditionalItem(String key, String additionalItem) {
    if (this.additional == null) {
      this.additional = new HashMap<>();
    }
    this.additional.put(key, additionalItem);
    return this;
  }

   /**
   * Get additional
   * @return additional
  **/
  @Schema(description = "")
  public Map<String, String> getAdditional() {
    return additional;
  }

  public void setAdditional(Map<String, String> additional) {
    this.additional = additional;
  }

  public RepresentationView _links(Links _links) {
    this._links = _links;
    return this;
  }

   /**
   * Get _links
   * @return _links
  **/
  @Schema(description = "")
  public Links getLinks() {
    return _links;
  }

  public void setLinks(Links _links) {
    this._links = _links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepresentationView representationView = (RepresentationView) o;
    return Objects.equals(this.creationDate, representationView.creationDate) &&
        Objects.equals(this.modificationDate, representationView.modificationDate) &&
        Objects.equals(this.remoteId, representationView.remoteId) &&
        Objects.equals(this.title, representationView.title) &&
        Objects.equals(this.description, representationView.description) &&
        Objects.equals(this.mediaType, representationView.mediaType) &&
        Objects.equals(this.language, representationView.language) &&
        Objects.equals(this.additional, representationView.additional) &&
        Objects.equals(this._links, representationView._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, modificationDate, remoteId, title, description, mediaType, language, additional, _links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepresentationView {\n");
    
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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