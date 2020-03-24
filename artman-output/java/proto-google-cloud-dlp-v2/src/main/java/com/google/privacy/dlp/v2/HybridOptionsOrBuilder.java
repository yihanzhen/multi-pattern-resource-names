// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/storage.proto

package com.google.privacy.dlp.v2;

public interface HybridOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.HybridOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A short description of where the data is coming from. Will be stored once
   * in the job. 256 max length.
   * </pre>
   *
   * <code>string description = 1;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A short description of where the data is coming from. Will be stored once
   * in the job. 256 max length.
   * </pre>
   *
   * <code>string description = 1;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * These are labels that each inspection request must include within their
   * 'finding_labels' map. Request may contain others, but any missing one of
   * these will be rejected.
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: &#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?.
   * No more than 10 keys can be required.
   * </pre>
   *
   * <code>repeated string required_finding_label_keys = 2;</code>
   * @return A list containing the requiredFindingLabelKeys.
   */
  java.util.List<java.lang.String>
      getRequiredFindingLabelKeysList();
  /**
   * <pre>
   * These are labels that each inspection request must include within their
   * 'finding_labels' map. Request may contain others, but any missing one of
   * these will be rejected.
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: &#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?.
   * No more than 10 keys can be required.
   * </pre>
   *
   * <code>repeated string required_finding_label_keys = 2;</code>
   * @return The count of requiredFindingLabelKeys.
   */
  int getRequiredFindingLabelKeysCount();
  /**
   * <pre>
   * These are labels that each inspection request must include within their
   * 'finding_labels' map. Request may contain others, but any missing one of
   * these will be rejected.
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: &#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?.
   * No more than 10 keys can be required.
   * </pre>
   *
   * <code>repeated string required_finding_label_keys = 2;</code>
   * @param index The index of the element to return.
   * @return The requiredFindingLabelKeys at the given index.
   */
  java.lang.String getRequiredFindingLabelKeys(int index);
  /**
   * <pre>
   * These are labels that each inspection request must include within their
   * 'finding_labels' map. Request may contain others, but any missing one of
   * these will be rejected.
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: &#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?.
   * No more than 10 keys can be required.
   * </pre>
   *
   * <code>repeated string required_finding_label_keys = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the requiredFindingLabelKeys at the given index.
   */
  com.google.protobuf.ByteString
      getRequiredFindingLabelKeysBytes(int index);

  /**
   * <pre>
   * To organize findings, these labels will be added to each finding.
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: &#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?.
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression (&#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?)?.
   * No more than 10 labels can be associated with a given finding.
   * Example: &lt;code&gt;"environment" : "production"&lt;/code&gt;
   * Example: &lt;code&gt;"pipeline" : "etl"&lt;/code&gt;
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * To organize findings, these labels will be added to each finding.
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: &#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?.
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression (&#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?)?.
   * No more than 10 labels can be associated with a given finding.
   * Example: &lt;code&gt;"environment" : "production"&lt;/code&gt;
   * Example: &lt;code&gt;"pipeline" : "etl"&lt;/code&gt;
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * To organize findings, these labels will be added to each finding.
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: &#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?.
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression (&#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?)?.
   * No more than 10 labels can be associated with a given finding.
   * Example: &lt;code&gt;"environment" : "production"&lt;/code&gt;
   * Example: &lt;code&gt;"pipeline" : "etl"&lt;/code&gt;
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * To organize findings, these labels will be added to each finding.
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: &#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?.
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression (&#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?)?.
   * No more than 10 labels can be associated with a given finding.
   * Example: &lt;code&gt;"environment" : "production"&lt;/code&gt;
   * Example: &lt;code&gt;"pipeline" : "etl"&lt;/code&gt;
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * To organize findings, these labels will be added to each finding.
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: &#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?.
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression (&#92;[a-z&#92;](&#92;[-a-z0-9&#92;]*&#92;[a-z0-9&#92;])?)?.
   * No more than 10 labels can be associated with a given finding.
   * Example: &lt;code&gt;"environment" : "production"&lt;/code&gt;
   * Example: &lt;code&gt;"pipeline" : "etl"&lt;/code&gt;
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * If the container is a table, additional information to make findings
   * meaningful such as the columns that are primary keys.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableOptions table_options = 4;</code>
   * @return Whether the tableOptions field is set.
   */
  boolean hasTableOptions();
  /**
   * <pre>
   * If the container is a table, additional information to make findings
   * meaningful such as the columns that are primary keys.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableOptions table_options = 4;</code>
   * @return The tableOptions.
   */
  com.google.privacy.dlp.v2.TableOptions getTableOptions();
  /**
   * <pre>
   * If the container is a table, additional information to make findings
   * meaningful such as the columns that are primary keys.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableOptions table_options = 4;</code>
   */
  com.google.privacy.dlp.v2.TableOptionsOrBuilder getTableOptionsOrBuilder();
}
