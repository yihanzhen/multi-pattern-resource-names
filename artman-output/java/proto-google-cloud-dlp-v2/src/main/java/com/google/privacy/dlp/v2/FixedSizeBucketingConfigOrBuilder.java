// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface FixedSizeBucketingConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.FixedSizeBucketingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Lower bound value of buckets. All values less than `lower_bound` are
   * grouped together into a single bucket; for example if `lower_bound` = 10,
   * then all values less than 10 are replaced with the value “-10”.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Value lower_bound = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the lowerBound field is set.
   */
  boolean hasLowerBound();
  /**
   * <pre>
   * Required. Lower bound value of buckets. All values less than `lower_bound` are
   * grouped together into a single bucket; for example if `lower_bound` = 10,
   * then all values less than 10 are replaced with the value “-10”.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Value lower_bound = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The lowerBound.
   */
  com.google.privacy.dlp.v2.Value getLowerBound();
  /**
   * <pre>
   * Required. Lower bound value of buckets. All values less than `lower_bound` are
   * grouped together into a single bucket; for example if `lower_bound` = 10,
   * then all values less than 10 are replaced with the value “-10”.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Value lower_bound = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.privacy.dlp.v2.ValueOrBuilder getLowerBoundOrBuilder();

  /**
   * <pre>
   * Required. Upper bound value of buckets. All values greater than upper_bound are
   * grouped together into a single bucket; for example if `upper_bound` = 89,
   * then all values greater than 89 are replaced with the value “89+”.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Value upper_bound = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the upperBound field is set.
   */
  boolean hasUpperBound();
  /**
   * <pre>
   * Required. Upper bound value of buckets. All values greater than upper_bound are
   * grouped together into a single bucket; for example if `upper_bound` = 89,
   * then all values greater than 89 are replaced with the value “89+”.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Value upper_bound = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The upperBound.
   */
  com.google.privacy.dlp.v2.Value getUpperBound();
  /**
   * <pre>
   * Required. Upper bound value of buckets. All values greater than upper_bound are
   * grouped together into a single bucket; for example if `upper_bound` = 89,
   * then all values greater than 89 are replaced with the value “89+”.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Value upper_bound = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.privacy.dlp.v2.ValueOrBuilder getUpperBoundOrBuilder();

  /**
   * <pre>
   * Required. Size of each bucket (except for minimum and maximum buckets). So if
   * `lower_bound` = 10, `upper_bound` = 89, and `bucket_size` = 10, then the
   * following buckets would be used: -10, 10-20, 20-30, 30-40, 40-50, 50-60,
   * 60-70, 70-80, 80-89, 89+. Precision up to 2 decimals works.
   * </pre>
   *
   * <code>double bucket_size = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bucketSize.
   */
  double getBucketSize();
}
