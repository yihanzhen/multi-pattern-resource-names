// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public interface ApplicationJobFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.ApplicationJobFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The job requisition id in the application. The API does an exact match on
   * the [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id] of [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
   * </pre>
   *
   * <code>string job_requisition_id = 2;</code>
   * @return The jobRequisitionId.
   */
  java.lang.String getJobRequisitionId();
  /**
   * <pre>
   * The job requisition id in the application. The API does an exact match on
   * the [Job.requisition_id][google.cloud.talent.v4beta1.Job.requisition_id] of [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
   * </pre>
   *
   * <code>string job_requisition_id = 2;</code>
   * @return The bytes for jobRequisitionId.
   */
  com.google.protobuf.ByteString
      getJobRequisitionIdBytes();

  /**
   * <pre>
   * The job title in the application. The API does an exact match on the
   * [Job.title][google.cloud.talent.v4beta1.Job.title] of [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
   * </pre>
   *
   * <code>string job_title = 3;</code>
   * @return The jobTitle.
   */
  java.lang.String getJobTitle();
  /**
   * <pre>
   * The job title in the application. The API does an exact match on the
   * [Job.title][google.cloud.talent.v4beta1.Job.title] of [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
   * </pre>
   *
   * <code>string job_title = 3;</code>
   * @return The bytes for jobTitle.
   */
  com.google.protobuf.ByteString
      getJobTitleBytes();

  /**
   * <pre>
   * If true, the API excludes all profiles with any [Application.job][google.cloud.talent.v4beta1.Application.job]
   * matching the filters.
   * </pre>
   *
   * <code>bool negated = 4;</code>
   * @return The negated.
   */
  boolean getNegated();
}
