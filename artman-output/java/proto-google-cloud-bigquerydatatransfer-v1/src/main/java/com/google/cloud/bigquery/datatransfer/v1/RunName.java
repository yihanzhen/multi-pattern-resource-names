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
public class RunName implements ResourceName {
  
  @Deprecated
  protected RunName() { }

  private static final PathTemplate PROJECT_TRANSFER_CONFIG_RUN_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/transferConfigs/{transfer_config}/runs/{run}");
  private static final PathTemplate PROJECT_LOCATION_TRANSFER_CONFIG_RUN_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/locations/{location}/transferConfigs/{transfer_config}/runs/{run}");

  private volatile Map<String, String> fieldValuesMap;
  private PathTemplate pathTemplate;
  private String fixedValue;

  private String project;
  private String transferConfig;
  private String run;
  private String location;

  public String getProject() {
    return project;
  }

  public String getTransferConfig() {
    return transferConfig;
  }

  public String getRun() {
    return run;
  }

  public String getLocation() {
    return location;
  }


  private RunName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    transferConfig = Preconditions.checkNotNull(builder.getTransferConfig());
    run = Preconditions.checkNotNull(builder.getRun());
    pathTemplate = PROJECT_TRANSFER_CONFIG_RUN_PATH_TEMPLATE;
  }

  private RunName(ProjectLocationTransferConfigRunBuilder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    transferConfig = Preconditions.checkNotNull(builder.getTransferConfig());
    run = Preconditions.checkNotNull(builder.getRun());
    pathTemplate = PROJECT_LOCATION_TRANSFER_CONFIG_RUN_PATH_TEMPLATE;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static Builder newProjectTransferConfigRunBuilder() {
  	return new Builder();
  }

  public static ProjectLocationTransferConfigRunBuilder newProjectLocationTransferConfigRunBuilder() {
  	return new ProjectLocationTransferConfigRunBuilder();
  }

  public Builder toBuilder() {
		return new Builder(this);
	}
		
  public static RunName of(String project, String transferConfig, String run) {
  	return newProjectTransferConfigRunBuilder()
        .setProject(project)
        .setTransferConfig(transferConfig)
        .setRun(run)
        .build();
  }

  public static RunName ofProjectTransferConfigRunName(String project, String transferConfig, String run) {
    return newProjectTransferConfigRunBuilder()
        .setProject(project)
        .setTransferConfig(transferConfig)
        .setRun(run)
        .build();
  }

  public static RunName ofProjectLocationTransferConfigRunName(String project, String location, String transferConfig, String run) {
    return newProjectLocationTransferConfigRunBuilder()
        .setProject(project)
        .setLocation(location)
        .setTransferConfig(transferConfig)
        .setRun(run)
        .build();
  }

	public static String format(String project, String transferConfig, String run) {
  	return newBuilder()
        .setProject(project)
        .setTransferConfig(transferConfig)
        .setRun(run)
        .build()
        .toString();
  }

  public static String formatProjectTransferConfigRunName(String project, String transferConfig, String run) {
  	return newBuilder()
        .setProject(project)
        .setTransferConfig(transferConfig)
        .setRun(run)
        .build()
        .toString();
  }

  public static String formatProjectLocationTransferConfigRunName(String project, String location, String transferConfig, String run) {
  	return newProjectLocationTransferConfigRunBuilder()
        .setProject(project)
        .setLocation(location)
        .setTransferConfig(transferConfig)
        .setRun(run)
        .build()
        .toString();
  }

  public static RunName parse(String formattedString) {
  	if (formattedString.isEmpty()) {
  		return null;
  	}
  	if (PROJECT_TRANSFER_CONFIG_RUN_PATH_TEMPLATE.matches(formattedString)) {
  		Map<String, String> matchMap = PROJECT_TRANSFER_CONFIG_RUN_PATH_TEMPLATE.match(formattedString);
  		return ofProjectTransferConfigRunName(
  		    matchMap.get("project"), 
  		    matchMap.get("transfer_config"), 
  		    matchMap.get("run"));
  	} else if (PROJECT_LOCATION_TRANSFER_CONFIG_RUN_PATH_TEMPLATE.matches(formattedString)) {
  		Map<String, String> matchMap = PROJECT_LOCATION_TRANSFER_CONFIG_RUN_PATH_TEMPLATE.match(formattedString);
  		return ofProjectLocationTransferConfigRunName(
  		    matchMap.get("project"), 
  		    matchMap.get("location"), 
  		    matchMap.get("transfer_config"), 
  		    matchMap.get("run"));
  	}
  	throw new ValidationException("JobName.parse: formattedString not in valid format");
  }

  public static List<? extends RunName> parseList(List<String> formattedStrings) {
    List<RunName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  @BetaApi("The method will be renamed to toStringList after subclasses of this class are removed.")
  public static List<String> toStrings(List<RunName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (RunName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
  	return PROJECT_TRANSFER_CONFIG_RUN_PATH_TEMPLATE.matches(formattedString)    
  	    || PROJECT_LOCATION_TRANSFER_CONFIG_RUN_PATH_TEMPLATE.matches(formattedString);
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
        	if (run != null) {
        		fieldMapBuilder.put("run", run);
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

  /** Builder for projects/{project}/transferConfigs/{transfer_config}/runs/{run}. */
  public static class Builder {

    private String project;
    private String transferConfig;
    private String run;

    public String getProject() {
      return project;
    }

    public String getTransferConfig() {
      return transferConfig;
    }

    public String getRun() {
      return run;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setTransferConfig(String transferConfig) {
      this.transferConfig = transferConfig;
      return this;
    }

    public Builder setRun(String run) {
      this.run = run;
      return this;
    }

    protected Builder() { }

    private Builder(RunName runName) {
    	  Preconditions.checkArgument(
    	      runName.pathTemplate == PROJECT_TRANSFER_CONFIG_RUN_PATH_TEMPLATE,
    		    "toBuilder is only supported when RunName has the pattern of "
    		    + "projects/{project}/transferConfigs/{transfer_config}/runs/{run}.");
      project = runName.project;
      transferConfig = runName.transferConfig;
      run = runName.run;
    }

    public RunName build() {
      return new RunName(this);
    }
  }

  /** Builder for projects/{project}/locations/{location}/transferConfigs/{transfer_config}/runs/{run}. */
  public static class ProjectLocationTransferConfigRunBuilder {

    private String project;
    private String location;
    private String transferConfig;
    private String run;

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getTransferConfig() {
      return transferConfig;
    }

    public String getRun() {
      return run;
    }

    public ProjectLocationTransferConfigRunBuilder setProject(String project) {
      this.project = project;
      return this;
    }

    public ProjectLocationTransferConfigRunBuilder setLocation(String location) {
      this.location = location;
      return this;
    }

    public ProjectLocationTransferConfigRunBuilder setTransferConfig(String transferConfig) {
      this.transferConfig = transferConfig;
      return this;
    }

    public ProjectLocationTransferConfigRunBuilder setRun(String run) {
      this.run = run;
      return this;
    }

    private ProjectLocationTransferConfigRunBuilder() { }

    public RunName build() {
      return new RunName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RunName) {
      RunName that = (RunName) o;
      return (Objects.equals(this.project, that.project))
          && (Objects.equals(this.transferConfig, that.transferConfig))
          && (Objects.equals(this.run, that.run))
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
    h ^= Objects.hashCode(run);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    return h;
  }
}
