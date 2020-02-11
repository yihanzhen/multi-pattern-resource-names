// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/workflow_templates.proto

package com.google.cloud.dataproc.v1beta2;

public interface TemplateParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.TemplateParameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Parameter name.
   * The parameter name is used as the key, and paired with the
   * parameter value, which are passed to the template when the template
   * is instantiated.
   * The name must contain only capital letters (A-Z), numbers (0-9), and
   * underscores (_), and must not start with a number. The maximum length is
   * 40 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Parameter name.
   * The parameter name is used as the key, and paired with the
   * parameter value, which are passed to the template when the template
   * is instantiated.
   * The name must contain only capital letters (A-Z), numbers (0-9), and
   * underscores (_), and must not start with a number. The maximum length is
   * 40 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. Paths to all fields that the parameter replaces.
   * A field is allowed to appear in at most one parameter's list of field
   * paths.
   * A field path is similar in syntax to a [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * For example, a field path that references the zone field of a workflow
   * template's cluster selector would be specified as
   * `placement.clusterSelector.zone`.
   * Also, field paths can reference fields using the following syntax:
   * * Values in maps can be referenced by key:
   *     * labels['key']
   *     * placement.clusterSelector.clusterLabels['key']
   *     * placement.managedCluster.labels['key']
   *     * placement.clusterSelector.clusterLabels['key']
   *     * jobs['step-id'].labels['key']
   * * Jobs in the jobs list can be referenced by step-id:
   *     * jobs['step-id'].hadoopJob.mainJarFileUri
   *     * jobs['step-id'].hiveJob.queryFileUri
   *     * jobs['step-id'].pySparkJob.mainPythonFileUri
   *     * jobs['step-id'].hadoopJob.jarFileUris[0]
   *     * jobs['step-id'].hadoopJob.archiveUris[0]
   *     * jobs['step-id'].hadoopJob.fileUris[0]
   *     * jobs['step-id'].pySparkJob.pythonFileUris[0]
   * * Items in repeated fields can be referenced by a zero-based index:
   *     * jobs['step-id'].sparkJob.args[0]
   * * Other examples:
   *     * jobs['step-id'].hadoopJob.properties['key']
   *     * jobs['step-id'].hadoopJob.args[0]
   *     * jobs['step-id'].hiveJob.scriptVariables['key']
   *     * jobs['step-id'].hadoopJob.mainJarFileUri
   *     * placement.clusterSelector.zone
   * It may not be possible to parameterize maps and repeated fields in their
   * entirety since only individual map values and individual items in repeated
   * fields can be referenced. For example, the following field paths are
   * invalid:
   * - placement.clusterSelector.clusterLabels
   * - jobs['step-id'].sparkJob.args
   * </pre>
   *
   * <code>repeated string fields = 2;</code>
   * @return A list containing the fields.
   */
  java.util.List<java.lang.String>
      getFieldsList();
  /**
   * <pre>
   * Required. Paths to all fields that the parameter replaces.
   * A field is allowed to appear in at most one parameter's list of field
   * paths.
   * A field path is similar in syntax to a [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * For example, a field path that references the zone field of a workflow
   * template's cluster selector would be specified as
   * `placement.clusterSelector.zone`.
   * Also, field paths can reference fields using the following syntax:
   * * Values in maps can be referenced by key:
   *     * labels['key']
   *     * placement.clusterSelector.clusterLabels['key']
   *     * placement.managedCluster.labels['key']
   *     * placement.clusterSelector.clusterLabels['key']
   *     * jobs['step-id'].labels['key']
   * * Jobs in the jobs list can be referenced by step-id:
   *     * jobs['step-id'].hadoopJob.mainJarFileUri
   *     * jobs['step-id'].hiveJob.queryFileUri
   *     * jobs['step-id'].pySparkJob.mainPythonFileUri
   *     * jobs['step-id'].hadoopJob.jarFileUris[0]
   *     * jobs['step-id'].hadoopJob.archiveUris[0]
   *     * jobs['step-id'].hadoopJob.fileUris[0]
   *     * jobs['step-id'].pySparkJob.pythonFileUris[0]
   * * Items in repeated fields can be referenced by a zero-based index:
   *     * jobs['step-id'].sparkJob.args[0]
   * * Other examples:
   *     * jobs['step-id'].hadoopJob.properties['key']
   *     * jobs['step-id'].hadoopJob.args[0]
   *     * jobs['step-id'].hiveJob.scriptVariables['key']
   *     * jobs['step-id'].hadoopJob.mainJarFileUri
   *     * placement.clusterSelector.zone
   * It may not be possible to parameterize maps and repeated fields in their
   * entirety since only individual map values and individual items in repeated
   * fields can be referenced. For example, the following field paths are
   * invalid:
   * - placement.clusterSelector.clusterLabels
   * - jobs['step-id'].sparkJob.args
   * </pre>
   *
   * <code>repeated string fields = 2;</code>
   * @return The count of fields.
   */
  int getFieldsCount();
  /**
   * <pre>
   * Required. Paths to all fields that the parameter replaces.
   * A field is allowed to appear in at most one parameter's list of field
   * paths.
   * A field path is similar in syntax to a [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * For example, a field path that references the zone field of a workflow
   * template's cluster selector would be specified as
   * `placement.clusterSelector.zone`.
   * Also, field paths can reference fields using the following syntax:
   * * Values in maps can be referenced by key:
   *     * labels['key']
   *     * placement.clusterSelector.clusterLabels['key']
   *     * placement.managedCluster.labels['key']
   *     * placement.clusterSelector.clusterLabels['key']
   *     * jobs['step-id'].labels['key']
   * * Jobs in the jobs list can be referenced by step-id:
   *     * jobs['step-id'].hadoopJob.mainJarFileUri
   *     * jobs['step-id'].hiveJob.queryFileUri
   *     * jobs['step-id'].pySparkJob.mainPythonFileUri
   *     * jobs['step-id'].hadoopJob.jarFileUris[0]
   *     * jobs['step-id'].hadoopJob.archiveUris[0]
   *     * jobs['step-id'].hadoopJob.fileUris[0]
   *     * jobs['step-id'].pySparkJob.pythonFileUris[0]
   * * Items in repeated fields can be referenced by a zero-based index:
   *     * jobs['step-id'].sparkJob.args[0]
   * * Other examples:
   *     * jobs['step-id'].hadoopJob.properties['key']
   *     * jobs['step-id'].hadoopJob.args[0]
   *     * jobs['step-id'].hiveJob.scriptVariables['key']
   *     * jobs['step-id'].hadoopJob.mainJarFileUri
   *     * placement.clusterSelector.zone
   * It may not be possible to parameterize maps and repeated fields in their
   * entirety since only individual map values and individual items in repeated
   * fields can be referenced. For example, the following field paths are
   * invalid:
   * - placement.clusterSelector.clusterLabels
   * - jobs['step-id'].sparkJob.args
   * </pre>
   *
   * <code>repeated string fields = 2;</code>
   * @param index The index of the element to return.
   * @return The fields at the given index.
   */
  java.lang.String getFields(int index);
  /**
   * <pre>
   * Required. Paths to all fields that the parameter replaces.
   * A field is allowed to appear in at most one parameter's list of field
   * paths.
   * A field path is similar in syntax to a [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * For example, a field path that references the zone field of a workflow
   * template's cluster selector would be specified as
   * `placement.clusterSelector.zone`.
   * Also, field paths can reference fields using the following syntax:
   * * Values in maps can be referenced by key:
   *     * labels['key']
   *     * placement.clusterSelector.clusterLabels['key']
   *     * placement.managedCluster.labels['key']
   *     * placement.clusterSelector.clusterLabels['key']
   *     * jobs['step-id'].labels['key']
   * * Jobs in the jobs list can be referenced by step-id:
   *     * jobs['step-id'].hadoopJob.mainJarFileUri
   *     * jobs['step-id'].hiveJob.queryFileUri
   *     * jobs['step-id'].pySparkJob.mainPythonFileUri
   *     * jobs['step-id'].hadoopJob.jarFileUris[0]
   *     * jobs['step-id'].hadoopJob.archiveUris[0]
   *     * jobs['step-id'].hadoopJob.fileUris[0]
   *     * jobs['step-id'].pySparkJob.pythonFileUris[0]
   * * Items in repeated fields can be referenced by a zero-based index:
   *     * jobs['step-id'].sparkJob.args[0]
   * * Other examples:
   *     * jobs['step-id'].hadoopJob.properties['key']
   *     * jobs['step-id'].hadoopJob.args[0]
   *     * jobs['step-id'].hiveJob.scriptVariables['key']
   *     * jobs['step-id'].hadoopJob.mainJarFileUri
   *     * placement.clusterSelector.zone
   * It may not be possible to parameterize maps and repeated fields in their
   * entirety since only individual map values and individual items in repeated
   * fields can be referenced. For example, the following field paths are
   * invalid:
   * - placement.clusterSelector.clusterLabels
   * - jobs['step-id'].sparkJob.args
   * </pre>
   *
   * <code>repeated string fields = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the fields at the given index.
   */
  com.google.protobuf.ByteString
      getFieldsBytes(int index);

  /**
   * <pre>
   * Optional. Brief description of the parameter.
   * Must not exceed 1024 characters.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Optional. Brief description of the parameter.
   * Must not exceed 1024 characters.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Optional. Validation rules to be applied to this parameter's value.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ParameterValidation validation = 4;</code>
   * @return Whether the validation field is set.
   */
  boolean hasValidation();
  /**
   * <pre>
   * Optional. Validation rules to be applied to this parameter's value.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ParameterValidation validation = 4;</code>
   * @return The validation.
   */
  com.google.cloud.dataproc.v1beta2.ParameterValidation getValidation();
  /**
   * <pre>
   * Optional. Validation rules to be applied to this parameter's value.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ParameterValidation validation = 4;</code>
   */
  com.google.cloud.dataproc.v1beta2.ParameterValidationOrBuilder getValidationOrBuilder();
}
