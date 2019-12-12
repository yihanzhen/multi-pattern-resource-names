// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1alpha1/containeranalysis.proto

package com.google.containeranalysis.v1alpha1;

public interface UpdateOccurrenceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.containeranalysis.v1alpha1.UpdateOccurrenceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the occurrence.
   * Should be of the form "projects/{project_id}/occurrences/{OCCURRENCE_ID}".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the occurrence.
   * Should be of the form "projects/{project_id}/occurrences/{OCCURRENCE_ID}".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The updated occurrence.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.Occurrence occurrence = 2;</code>
   */
  boolean hasOccurrence();
  /**
   * <pre>
   * The updated occurrence.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.Occurrence occurrence = 2;</code>
   */
  com.google.containeranalysis.v1alpha1.Occurrence getOccurrence();
  /**
   * <pre>
   * The updated occurrence.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.Occurrence occurrence = 2;</code>
   */
  com.google.containeranalysis.v1alpha1.OccurrenceOrBuilder getOccurrenceOrBuilder();

  /**
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
