/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.cloud.bigquery.datatransfer.v1;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.core.BetaApi;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.pathtemplate.ValidationException;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AUTO-GENERATED DOCUMENTATION AND CLASS
 */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class TransferConfigName implements ResourceName {
  
  @Deprecated
  protected TransferConfigName() { }

  private static final PathTemplate PROJECT_TRANSFER_CONFIG_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/transferConfigs/{transfer_config}");
  private static final PathTemplate PROJECT_LOCATION_TRANSFER_CONFIG_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/locations/{location}/transferConfigs/{transfer_config}");

  private volatile Map<String, String> fieldValuesMap;
  private PathTemplate pathTemplate;
  private String fixedValue;

  private String project;
  private String transferConfig;
  private String location;

  public String getProject() {
    return project;
  }

  public String getTransferConfig() {
    return transferConfig;
  }

  public String getLocation() {
    return location;
  }


  private TransferConfigName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    transferConfig = Preconditions.checkNotNull(builder.getTransferConfig());
    pathTemplate = PROJECT_TRANSFER_CONFIG_PATH_TEMPLATE;
  }

  private TransferConfigName(ProjectLocationTransferConfigBuilder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    transferConfig = Preconditions.checkNotNull(builder.getTransferConfig());
    pathTemplate = PROJECT_LOCATION_TRANSFER_CONFIG_PATH_TEMPLATE;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static Builder newProjectTransferConfigBuilder() {
  	return new Builder();
  }

  public static ProjectLocationTransferConfigBuilder newProjectLocationTransferConfigBuilder() {
  	return new ProjectLocationTransferConfigBuilder();
  }

  public Builder toBuilder() {
		return new Builder(this);
	}
		
  public static TransferConfigName of(String project, String transferConfig) {
  	return newProjectTransferConfigBuilder()
        .setProject(project)
        .setTransferConfig(transferConfig)
        .build();
  }

  public static TransferConfigName ofProjectTransferConfigName(String project, String transferConfig) {
    return newProjectTransferConfigBuilder()
        .setProject(project)
        .setTransferConfig(transferConfig)
        .build();
  }

  public static TransferConfigName ofProjectLocationTransferConfigName(String project, String location, String transferConfig) {
    return newProjectLocationTransferConfigBuilder()
        .setProject(project)
        .setLocation(location)
        .setTransferConfig(transferConfig)
        .build();
  }

	public static String format(String project, String transferConfig) {
  	return newBuilder()
        .setProject(project)
        .setTransferConfig(transferConfig)
        .build()
        .toString();
  }

  public static String formatProjectTransferConfigName(String project, String transferConfig) {
  	return newBuilder()
        .setProject(project)
        .setTransferConfig(transferConfig)
        .build()
        .toString();
  }

  public static String formatProjectLocationTransferConfigName(String project, String location, String transferConfig) {
  	return newProjectLocationTransferConfigBuilder()
        .setProject(project)
        .setLocation(location)
        .setTransferConfig(transferConfig)
        .build()
        .toString();
  }

  public static TransferConfigName parse(String formattedString) {
  	if (formattedString.isEmpty()) {
  		return null;
  	}
  	if (PROJECT_TRANSFER_CONFIG_PATH_TEMPLATE.matches(formattedString)) {
  		Map<String, String> matchMap = PROJECT_TRANSFER_CONFIG_PATH_TEMPLATE.match(formattedString);
  		return ofProjectTransferConfigName(
  		    matchMap.get("project"), 
  		    matchMap.get("transfer_config"));
  	} else if (PROJECT_LOCATION_TRANSFER_CONFIG_PATH_TEMPLATE.matches(formattedString)) {
  		Map<String, String> matchMap = PROJECT_LOCATION_TRANSFER_CONFIG_PATH_TEMPLATE.match(formattedString);
  		return ofProjectLocationTransferConfigName(
  		    matchMap.get("project"), 
  		    matchMap.get("location"), 
  		    matchMap.get("transfer_config"));
  	}
  	throw new ValidationException("JobName.parse: formattedString not in valid format");
  }

  public static List<? extends TransferConfigName> parseList(List<String> formattedStrings) {
    List<TransferConfigName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  @BetaApi("The method will be renamed to toStringList after subclasses of this class are removed.")
  public static List<String> toStrings(List<TransferConfigName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (TransferConfigName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
  	return PROJECT_TRANSFER_CONFIG_PATH_TEMPLATE.matches(formattedString)    
  	    || PROJECT_LOCATION_TRANSFER_CONFIG_PATH_TEMPLATE.matches(formattedString);
  }
  
  @Override
  public Map<String, String> getFieldValuesMap() {
  	if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
        	ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
        	if (project != null) {
        		fieldMapBuilder.put("project", project);
        	}
        	if (transferConfig != null) {
        		fieldMapBuilder.put("transfer_config", transferConfig);
        	}
        	if (location != null) {
        		fieldMapBuilder.put("location", location);
        	}
        	fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return fixedValue != null ? fixedValue : pathTemplate.instantiate(getFieldValuesMap());
  }

  /** Builder for projects/{project}/transferConfigs/{transfer_config}. */
  public static class Builder {

    private String project;
    private String transferConfig;

    public String getProject() {
      return project;
    }

    public String getTransferConfig() {
      return transferConfig;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setTransferConfig(String transferConfig) {
      this.transferConfig = transferConfig;
      return this;
    }

    protected Builder() { }

    private Builder(TransferConfigName transferConfigName) {
    	  Preconditions.checkArgument(
    	      transferConfigName.pathTemplate == PROJECT_TRANSFER_CONFIG_PATH_TEMPLATE,
    		    "toBuilder is only supported when TransferConfigName has the pattern of "
    		    + "projects/{project}/transferConfigs/{transfer_config}.");
      project = transferConfigName.project;
      transferConfig = transferConfigName.transferConfig;
    }

    public TransferConfigName build() {
      return new TransferConfigName(this);
    }
  }

  /** Builder for projects/{project}/locations/{location}/transferConfigs/{transfer_config}. */
  public static class ProjectLocationTransferConfigBuilder {

    private String project;
    private String location;
    private String transferConfig;

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getTransferConfig() {
      return transferConfig;
    }

    public ProjectLocationTransferConfigBuilder setProject(String project) {
      this.project = project;
      return this;
    }

    public ProjectLocationTransferConfigBuilder setLocation(String location) {
      this.location = location;
      return this;
    }

    public ProjectLocationTransferConfigBuilder setTransferConfig(String transferConfig) {
      this.transferConfig = transferConfig;
      return this;
    }

    private ProjectLocationTransferConfigBuilder() { }

    public TransferConfigName build() {
      return new TransferConfigName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TransferConfigName) {
      TransferConfigName that = (TransferConfigName) o;
      return (Objects.equals(this.project, that.project))
          && (Objects.equals(this.transferConfig, that.transferConfig))
          && (Objects.equals(this.location, that.location));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(fixedValue);
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(transferConfig);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    return h;
  }
}
