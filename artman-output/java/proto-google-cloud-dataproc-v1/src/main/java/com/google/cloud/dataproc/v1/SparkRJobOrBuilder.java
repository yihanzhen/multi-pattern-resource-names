// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

public interface SparkRJobOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.SparkRJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The HCFS URI of the main R file to use as the driver.
   * Must be a .R file.
   * </pre>
   *
   * <code>string main_r_file_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The mainRFileUri.
   */
  java.lang.String getMainRFileUri();
  /**
   * <pre>
   * Required. The HCFS URI of the main R file to use as the driver.
   * Must be a .R file.
   * </pre>
   *
   * <code>string main_r_file_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for mainRFileUri.
   */
  com.google.protobuf.ByteString
      getMainRFileUriBytes();

  /**
   * <pre>
   * Optional. The arguments to pass to the driver.  Do not include arguments,
   * such as `--conf`, that can be set as job properties, since a collision may
   * occur that causes an incorrect job submission.
   * </pre>
   *
   * <code>repeated string args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the args.
   */
  java.util.List<java.lang.String>
      getArgsList();
  /**
   * <pre>
   * Optional. The arguments to pass to the driver.  Do not include arguments,
   * such as `--conf`, that can be set as job properties, since a collision may
   * occur that causes an incorrect job submission.
   * </pre>
   *
   * <code>repeated string args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of args.
   */
  int getArgsCount();
  /**
   * <pre>
   * Optional. The arguments to pass to the driver.  Do not include arguments,
   * such as `--conf`, that can be set as job properties, since a collision may
   * occur that causes an incorrect job submission.
   * </pre>
   *
   * <code>repeated string args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The args at the given index.
   */
  java.lang.String getArgs(int index);
  /**
   * <pre>
   * Optional. The arguments to pass to the driver.  Do not include arguments,
   * such as `--conf`, that can be set as job properties, since a collision may
   * occur that causes an incorrect job submission.
   * </pre>
   *
   * <code>repeated string args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The bytes of the args at the given index.
   */
  com.google.protobuf.ByteString
      getArgsBytes(int index);

  /**
   * <pre>
   * Optional. HCFS URIs of files to be copied to the working directory of
   * R drivers and distributed tasks. Useful for naively parallel tasks.
   * </pre>
   *
   * <code>repeated string file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the fileUris.
   */
  java.util.List<java.lang.String>
      getFileUrisList();
  /**
   * <pre>
   * Optional. HCFS URIs of files to be copied to the working directory of
   * R drivers and distributed tasks. Useful for naively parallel tasks.
   * </pre>
   *
   * <code>repeated string file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of fileUris.
   */
  int getFileUrisCount();
  /**
   * <pre>
   * Optional. HCFS URIs of files to be copied to the working directory of
   * R drivers and distributed tasks. Useful for naively parallel tasks.
   * </pre>
   *
   * <code>repeated string file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The fileUris at the given index.
   */
  java.lang.String getFileUris(int index);
  /**
   * <pre>
   * Optional. HCFS URIs of files to be copied to the working directory of
   * R drivers and distributed tasks. Useful for naively parallel tasks.
   * </pre>
   *
   * <code>repeated string file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The bytes of the fileUris at the given index.
   */
  com.google.protobuf.ByteString
      getFileUrisBytes(int index);

  /**
   * <pre>
   * Optional. HCFS URIs of archives to be extracted in the working directory of
   * Spark drivers and tasks. Supported file types:
   * .jar, .tar, .tar.gz, .tgz, and .zip.
   * </pre>
   *
   * <code>repeated string archive_uris = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the archiveUris.
   */
  java.util.List<java.lang.String>
      getArchiveUrisList();
  /**
   * <pre>
   * Optional. HCFS URIs of archives to be extracted in the working directory of
   * Spark drivers and tasks. Supported file types:
   * .jar, .tar, .tar.gz, .tgz, and .zip.
   * </pre>
   *
   * <code>repeated string archive_uris = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of archiveUris.
   */
  int getArchiveUrisCount();
  /**
   * <pre>
   * Optional. HCFS URIs of archives to be extracted in the working directory of
   * Spark drivers and tasks. Supported file types:
   * .jar, .tar, .tar.gz, .tgz, and .zip.
   * </pre>
   *
   * <code>repeated string archive_uris = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The archiveUris at the given index.
   */
  java.lang.String getArchiveUris(int index);
  /**
   * <pre>
   * Optional. HCFS URIs of archives to be extracted in the working directory of
   * Spark drivers and tasks. Supported file types:
   * .jar, .tar, .tar.gz, .tgz, and .zip.
   * </pre>
   *
   * <code>repeated string archive_uris = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The bytes of the archiveUris at the given index.
   */
  com.google.protobuf.ByteString
      getArchiveUrisBytes(int index);

  /**
   * <pre>
   * Optional. A mapping of property names to values, used to configure SparkR.
   * Properties that conflict with values set by the Dataproc API may be
   * overwritten. Can include properties set in
   * /etc/spark/conf/spark-defaults.conf and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getPropertiesCount();
  /**
   * <pre>
   * Optional. A mapping of property names to values, used to configure SparkR.
   * Properties that conflict with values set by the Dataproc API may be
   * overwritten. Can include properties set in
   * /etc/spark/conf/spark-defaults.conf and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsProperties(
      java.lang.String key);
  /**
   * Use {@link #getPropertiesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getProperties();
  /**
   * <pre>
   * Optional. A mapping of property names to values, used to configure SparkR.
   * Properties that conflict with values set by the Dataproc API may be
   * overwritten. Can include properties set in
   * /etc/spark/conf/spark-defaults.conf and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getPropertiesMap();
  /**
   * <pre>
   * Optional. A mapping of property names to values, used to configure SparkR.
   * Properties that conflict with values set by the Dataproc API may be
   * overwritten. Can include properties set in
   * /etc/spark/conf/spark-defaults.conf and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  java.lang.String getPropertiesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. A mapping of property names to values, used to configure SparkR.
   * Properties that conflict with values set by the Dataproc API may be
   * overwritten. Can include properties set in
   * /etc/spark/conf/spark-defaults.conf and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  java.lang.String getPropertiesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Optional. The runtime log config for job execution.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.LoggingConfig logging_config = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the loggingConfig field is set.
   */
  boolean hasLoggingConfig();
  /**
   * <pre>
   * Optional. The runtime log config for job execution.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.LoggingConfig logging_config = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The loggingConfig.
   */
  com.google.cloud.dataproc.v1.LoggingConfig getLoggingConfig();
  /**
   * <pre>
   * Optional. The runtime log config for job execution.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.LoggingConfig logging_config = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.LoggingConfigOrBuilder getLoggingConfigOrBuilder();
}
