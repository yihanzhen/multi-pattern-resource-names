// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public interface ApplicationOutcomeNotesFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.ApplicationOutcomeNotesFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. User entered or selected outcome reason. The API does an exact match on the
   * [Application.outcome_notes][google.cloud.talent.v4beta1.Application.outcome_notes] in profiles.
   * </pre>
   *
   * <code>string outcome_notes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The outcomeNotes.
   */
  java.lang.String getOutcomeNotes();
  /**
   * <pre>
   * Required. User entered or selected outcome reason. The API does an exact match on the
   * [Application.outcome_notes][google.cloud.talent.v4beta1.Application.outcome_notes] in profiles.
   * </pre>
   *
   * <code>string outcome_notes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for outcomeNotes.
   */
  com.google.protobuf.ByteString
      getOutcomeNotesBytes();

  /**
   * <pre>
   * If true, The API excludes all candidates with any
   * [Application.outcome_notes][google.cloud.talent.v4beta1.Application.outcome_notes] matching the outcome reason specified in
   * the filter.
   * </pre>
   *
   * <code>bool negated = 2;</code>
   * @return The negated.
   */
  boolean getNegated();
}
