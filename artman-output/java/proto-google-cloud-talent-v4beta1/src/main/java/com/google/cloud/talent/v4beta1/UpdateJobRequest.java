// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/job_service.proto

package com.google.cloud.talent.v4beta1;

/**
 * <pre>
 * Update job request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.UpdateJobRequest}
 */
public  final class UpdateJobRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.UpdateJobRequest)
    UpdateJobRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateJobRequest.newBuilder() to construct.
  private UpdateJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateJobRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateJobRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateJobRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.cloud.talent.v4beta1.Job.Builder subBuilder = null;
            if (job_ != null) {
              subBuilder = job_.toBuilder();
            }
            job_ = input.readMessage(com.google.cloud.talent.v4beta1.Job.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(job_);
              job_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.talent.v4beta1.JobServiceProto.internal_static_google_cloud_talent_v4beta1_UpdateJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.JobServiceProto.internal_static_google_cloud_talent_v4beta1_UpdateJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.UpdateJobRequest.class, com.google.cloud.talent.v4beta1.UpdateJobRequest.Builder.class);
  }

  public static final int JOB_FIELD_NUMBER = 1;
  private com.google.cloud.talent.v4beta1.Job job_;
  /**
   * <pre>
   * Required. The Job to be updated.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the job field is set.
   */
  public boolean hasJob() {
    return job_ != null;
  }
  /**
   * <pre>
   * Required. The Job to be updated.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The job.
   */
  public com.google.cloud.talent.v4beta1.Job getJob() {
    return job_ == null ? com.google.cloud.talent.v4beta1.Job.getDefaultInstance() : job_;
  }
  /**
   * <pre>
   * Required. The Job to be updated.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.cloud.talent.v4beta1.JobOrBuilder getJobOrBuilder() {
    return getJob();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Strongly recommended for the best service experience.
   * If [update_mask][google.cloud.talent.v4beta1.UpdateJobRequest.update_mask] is provided, only the specified fields in
   * [job][google.cloud.talent.v4beta1.UpdateJobRequest.job] are updated. Otherwise all the fields are updated.
   * A field mask to restrict the fields that are updated. Only
   * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Strongly recommended for the best service experience.
   * If [update_mask][google.cloud.talent.v4beta1.UpdateJobRequest.update_mask] is provided, only the specified fields in
   * [job][google.cloud.talent.v4beta1.UpdateJobRequest.job] are updated. Otherwise all the fields are updated.
   * A field mask to restrict the fields that are updated. Only
   * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Strongly recommended for the best service experience.
   * If [update_mask][google.cloud.talent.v4beta1.UpdateJobRequest.update_mask] is provided, only the specified fields in
   * [job][google.cloud.talent.v4beta1.UpdateJobRequest.job] are updated. Otherwise all the fields are updated.
   * A field mask to restrict the fields that are updated. Only
   * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (job_ != null) {
      output.writeMessage(1, getJob());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (job_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getJob());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.talent.v4beta1.UpdateJobRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.UpdateJobRequest other = (com.google.cloud.talent.v4beta1.UpdateJobRequest) obj;

    if (hasJob() != other.hasJob()) return false;
    if (hasJob()) {
      if (!getJob()
          .equals(other.getJob())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasJob()) {
      hash = (37 * hash) + JOB_FIELD_NUMBER;
      hash = (53 * hash) + getJob().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.UpdateJobRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4beta1.UpdateJobRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4beta1.UpdateJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4beta1.UpdateJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4beta1.UpdateJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4beta1.UpdateJobRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4beta1.UpdateJobRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4beta1.UpdateJobRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.talent.v4beta1.UpdateJobRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4beta1.UpdateJobRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.talent.v4beta1.UpdateJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4beta1.UpdateJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.talent.v4beta1.UpdateJobRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Update job request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.UpdateJobRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.UpdateJobRequest)
      com.google.cloud.talent.v4beta1.UpdateJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.talent.v4beta1.JobServiceProto.internal_static_google_cloud_talent_v4beta1_UpdateJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.JobServiceProto.internal_static_google_cloud_talent_v4beta1_UpdateJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.UpdateJobRequest.class, com.google.cloud.talent.v4beta1.UpdateJobRequest.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.UpdateJobRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (jobBuilder_ == null) {
        job_ = null;
      } else {
        job_ = null;
        jobBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.JobServiceProto.internal_static_google_cloud_talent_v4beta1_UpdateJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.UpdateJobRequest getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.UpdateJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.UpdateJobRequest build() {
      com.google.cloud.talent.v4beta1.UpdateJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.UpdateJobRequest buildPartial() {
      com.google.cloud.talent.v4beta1.UpdateJobRequest result = new com.google.cloud.talent.v4beta1.UpdateJobRequest(this);
      if (jobBuilder_ == null) {
        result.job_ = job_;
      } else {
        result.job_ = jobBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.talent.v4beta1.UpdateJobRequest) {
        return mergeFrom((com.google.cloud.talent.v4beta1.UpdateJobRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.UpdateJobRequest other) {
      if (other == com.google.cloud.talent.v4beta1.UpdateJobRequest.getDefaultInstance()) return this;
      if (other.hasJob()) {
        mergeJob(other.getJob());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.talent.v4beta1.UpdateJobRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.talent.v4beta1.UpdateJobRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.talent.v4beta1.Job job_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.talent.v4beta1.Job, com.google.cloud.talent.v4beta1.Job.Builder, com.google.cloud.talent.v4beta1.JobOrBuilder> jobBuilder_;
    /**
     * <pre>
     * Required. The Job to be updated.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the job field is set.
     */
    public boolean hasJob() {
      return jobBuilder_ != null || job_ != null;
    }
    /**
     * <pre>
     * Required. The Job to be updated.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The job.
     */
    public com.google.cloud.talent.v4beta1.Job getJob() {
      if (jobBuilder_ == null) {
        return job_ == null ? com.google.cloud.talent.v4beta1.Job.getDefaultInstance() : job_;
      } else {
        return jobBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The Job to be updated.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setJob(com.google.cloud.talent.v4beta1.Job value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        job_ = value;
        onChanged();
      } else {
        jobBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The Job to be updated.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setJob(
        com.google.cloud.talent.v4beta1.Job.Builder builderForValue) {
      if (jobBuilder_ == null) {
        job_ = builderForValue.build();
        onChanged();
      } else {
        jobBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The Job to be updated.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeJob(com.google.cloud.talent.v4beta1.Job value) {
      if (jobBuilder_ == null) {
        if (job_ != null) {
          job_ =
            com.google.cloud.talent.v4beta1.Job.newBuilder(job_).mergeFrom(value).buildPartial();
        } else {
          job_ = value;
        }
        onChanged();
      } else {
        jobBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The Job to be updated.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearJob() {
      if (jobBuilder_ == null) {
        job_ = null;
        onChanged();
      } else {
        job_ = null;
        jobBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The Job to be updated.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.talent.v4beta1.Job.Builder getJobBuilder() {
      
      onChanged();
      return getJobFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The Job to be updated.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.talent.v4beta1.JobOrBuilder getJobOrBuilder() {
      if (jobBuilder_ != null) {
        return jobBuilder_.getMessageOrBuilder();
      } else {
        return job_ == null ?
            com.google.cloud.talent.v4beta1.Job.getDefaultInstance() : job_;
      }
    }
    /**
     * <pre>
     * Required. The Job to be updated.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Job job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.talent.v4beta1.Job, com.google.cloud.talent.v4beta1.Job.Builder, com.google.cloud.talent.v4beta1.JobOrBuilder> 
        getJobFieldBuilder() {
      if (jobBuilder_ == null) {
        jobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Job, com.google.cloud.talent.v4beta1.Job.Builder, com.google.cloud.talent.v4beta1.JobOrBuilder>(
                getJob(),
                getParentForChildren(),
                isClean());
        job_ = null;
      }
      return jobBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateJobRequest.update_mask] is provided, only the specified fields in
     * [job][google.cloud.talent.v4beta1.UpdateJobRequest.job] are updated. Otherwise all the fields are updated.
     * A field mask to restrict the fields that are updated. Only
     * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateJobRequest.update_mask] is provided, only the specified fields in
     * [job][google.cloud.talent.v4beta1.UpdateJobRequest.job] are updated. Otherwise all the fields are updated.
     * A field mask to restrict the fields that are updated. Only
     * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateJobRequest.update_mask] is provided, only the specified fields in
     * [job][google.cloud.talent.v4beta1.UpdateJobRequest.job] are updated. Otherwise all the fields are updated.
     * A field mask to restrict the fields that are updated. Only
     * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateJobRequest.update_mask] is provided, only the specified fields in
     * [job][google.cloud.talent.v4beta1.UpdateJobRequest.job] are updated. Otherwise all the fields are updated.
     * A field mask to restrict the fields that are updated. Only
     * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateJobRequest.update_mask] is provided, only the specified fields in
     * [job][google.cloud.talent.v4beta1.UpdateJobRequest.job] are updated. Otherwise all the fields are updated.
     * A field mask to restrict the fields that are updated. Only
     * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateJobRequest.update_mask] is provided, only the specified fields in
     * [job][google.cloud.talent.v4beta1.UpdateJobRequest.job] are updated. Otherwise all the fields are updated.
     * A field mask to restrict the fields that are updated. Only
     * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateJobRequest.update_mask] is provided, only the specified fields in
     * [job][google.cloud.talent.v4beta1.UpdateJobRequest.job] are updated. Otherwise all the fields are updated.
     * A field mask to restrict the fields that are updated. Only
     * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateJobRequest.update_mask] is provided, only the specified fields in
     * [job][google.cloud.talent.v4beta1.UpdateJobRequest.job] are updated. Otherwise all the fields are updated.
     * A field mask to restrict the fields that are updated. Only
     * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Strongly recommended for the best service experience.
     * If [update_mask][google.cloud.talent.v4beta1.UpdateJobRequest.update_mask] is provided, only the specified fields in
     * [job][google.cloud.talent.v4beta1.UpdateJobRequest.job] are updated. Otherwise all the fields are updated.
     * A field mask to restrict the fields that are updated. Only
     * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.UpdateJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.UpdateJobRequest)
  private static final com.google.cloud.talent.v4beta1.UpdateJobRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.UpdateJobRequest();
  }

  public static com.google.cloud.talent.v4beta1.UpdateJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateJobRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateJobRequest>() {
    @java.lang.Override
    public UpdateJobRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateJobRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.UpdateJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

