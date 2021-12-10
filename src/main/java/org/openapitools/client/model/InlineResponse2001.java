/*
 * Training Menu API
 * A simple menu for exercise
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-10T14:22:04.245960+09:00[Asia/Tokyo]")
public class InlineResponse2001 {
  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private Integer planId;

  public static final String SERIALIZED_NAME_PLAN_NAME = "plan_name";
  @SerializedName(SERIALIZED_NAME_PLAN_NAME)
  private String planName;

  public static final String SERIALIZED_NAME_PLANNER_NAME = "planner_name";
  @SerializedName(SERIALIZED_NAME_PLANNER_NAME)
  private String plannerName;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_DIFFICULTY = "difficulty";
  @SerializedName(SERIALIZED_NAME_DIFFICULTY)
  private Integer difficulty;


  public InlineResponse2001 planId(Integer planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getPlanId() {
    return planId;
  }


  public void setPlanId(Integer planId) {
    this.planId = planId;
  }


  public InlineResponse2001 planName(String planName) {
    
    this.planName = planName;
    return this;
  }

   /**
   * Get planName
   * @return planName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlanName() {
    return planName;
  }


  public void setPlanName(String planName) {
    this.planName = planName;
  }


  public InlineResponse2001 plannerName(String plannerName) {
    
    this.plannerName = plannerName;
    return this;
  }

   /**
   * Get plannerName
   * @return plannerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlannerName() {
    return plannerName;
  }


  public void setPlannerName(String plannerName) {
    this.plannerName = plannerName;
  }


  public InlineResponse2001 duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public InlineResponse2001 difficulty(Integer difficulty) {
    
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Get difficulty
   * @return difficulty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDifficulty() {
    return difficulty;
  }


  public void setDifficulty(Integer difficulty) {
    this.difficulty = difficulty;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.planId, inlineResponse2001.planId) &&
        Objects.equals(this.planName, inlineResponse2001.planName) &&
        Objects.equals(this.plannerName, inlineResponse2001.plannerName) &&
        Objects.equals(this.duration, inlineResponse2001.duration) &&
        Objects.equals(this.difficulty, inlineResponse2001.difficulty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planId, planName, plannerName, duration, difficulty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    plannerName: ").append(toIndentedString(plannerName)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
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

