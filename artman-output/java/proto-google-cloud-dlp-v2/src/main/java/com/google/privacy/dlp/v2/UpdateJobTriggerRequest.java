// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Request message for UpdateJobTrigger.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.UpdateJobTriggerRequest}
 */
public  final class UpdateJobTriggerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.UpdateJobTriggerRequest)
    UpdateJobTriggerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateJobTriggerRequest.newBuilder() to construct.
  private UpdateJobTriggerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateJobTriggerRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateJobTriggerRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateJobTriggerRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            com.google.privacy.dlp.v2.JobTrigger.Builder subBuilder = null;
            if (jobTrigger_ != null) {
              subBuilder = jobTrigger_.toBuilder();
            }
            jobTrigger_ = input.readMessage(com.google.privacy.dlp.v2.JobTrigger.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(jobTrigger_);
              jobTrigger_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
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
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateJobTriggerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateJobTriggerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.UpdateJobTriggerRequest.class, com.google.privacy.dlp.v2.UpdateJobTriggerRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. Resource name of the project and the triggeredJob, for example
   * `projects/dlp-test-project/jobTriggers/53234423`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Resource name of the project and the triggeredJob, for example
   * `projects/dlp-test-project/jobTriggers/53234423`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_TRIGGER_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2.JobTrigger jobTrigger_;
  /**
   * <pre>
   * New JobTrigger value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
   * @return Whether the jobTrigger field is set.
   */
  public boolean hasJobTrigger() {
    return jobTrigger_ != null;
  }
  /**
   * <pre>
   * New JobTrigger value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
   * @return The jobTrigger.
   */
  public com.google.privacy.dlp.v2.JobTrigger getJobTrigger() {
    return jobTrigger_ == null ? com.google.privacy.dlp.v2.JobTrigger.getDefaultInstance() : jobTrigger_;
  }
  /**
   * <pre>
   * New JobTrigger value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
   */
  public com.google.privacy.dlp.v2.JobTriggerOrBuilder getJobTriggerOrBuilder() {
    return getJobTrigger();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (jobTrigger_ != null) {
      output.writeMessage(2, getJobTrigger());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (jobTrigger_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getJobTrigger());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUpdateMask());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.UpdateJobTriggerRequest)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.UpdateJobTriggerRequest other = (com.google.privacy.dlp.v2.UpdateJobTriggerRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasJobTrigger() != other.hasJobTrigger()) return false;
    if (hasJobTrigger()) {
      if (!getJobTrigger()
          .equals(other.getJobTrigger())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasJobTrigger()) {
      hash = (37 * hash) + JOB_TRIGGER_FIELD_NUMBER;
      hash = (53 * hash) + getJobTrigger().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.UpdateJobTriggerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.UpdateJobTriggerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateJobTriggerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.UpdateJobTriggerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateJobTriggerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.UpdateJobTriggerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateJobTriggerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.UpdateJobTriggerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateJobTriggerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.UpdateJobTriggerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.UpdateJobTriggerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.UpdateJobTriggerRequest parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.UpdateJobTriggerRequest prototype) {
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
   * Request message for UpdateJobTrigger.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.UpdateJobTriggerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.UpdateJobTriggerRequest)
      com.google.privacy.dlp.v2.UpdateJobTriggerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateJobTriggerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateJobTriggerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.UpdateJobTriggerRequest.class, com.google.privacy.dlp.v2.UpdateJobTriggerRequest.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.UpdateJobTriggerRequest.newBuilder()
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
      name_ = "";

      if (jobTriggerBuilder_ == null) {
        jobTrigger_ = null;
      } else {
        jobTrigger_ = null;
        jobTriggerBuilder_ = null;
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
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_UpdateJobTriggerRequest_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.UpdateJobTriggerRequest getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.UpdateJobTriggerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.UpdateJobTriggerRequest build() {
      com.google.privacy.dlp.v2.UpdateJobTriggerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.UpdateJobTriggerRequest buildPartial() {
      com.google.privacy.dlp.v2.UpdateJobTriggerRequest result = new com.google.privacy.dlp.v2.UpdateJobTriggerRequest(this);
      result.name_ = name_;
      if (jobTriggerBuilder_ == null) {
        result.jobTrigger_ = jobTrigger_;
      } else {
        result.jobTrigger_ = jobTriggerBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.UpdateJobTriggerRequest) {
        return mergeFrom((com.google.privacy.dlp.v2.UpdateJobTriggerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.UpdateJobTriggerRequest other) {
      if (other == com.google.privacy.dlp.v2.UpdateJobTriggerRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasJobTrigger()) {
        mergeJobTrigger(other.getJobTrigger());
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
      com.google.privacy.dlp.v2.UpdateJobTriggerRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.UpdateJobTriggerRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. Resource name of the project and the triggeredJob, for example
     * `projects/dlp-test-project/jobTriggers/53234423`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Resource name of the project and the triggeredJob, for example
     * `projects/dlp-test-project/jobTriggers/53234423`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Resource name of the project and the triggeredJob, for example
     * `projects/dlp-test-project/jobTriggers/53234423`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource name of the project and the triggeredJob, for example
     * `projects/dlp-test-project/jobTriggers/53234423`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource name of the project and the triggeredJob, for example
     * `projects/dlp-test-project/jobTriggers/53234423`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.privacy.dlp.v2.JobTrigger jobTrigger_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.JobTrigger, com.google.privacy.dlp.v2.JobTrigger.Builder, com.google.privacy.dlp.v2.JobTriggerOrBuilder> jobTriggerBuilder_;
    /**
     * <pre>
     * New JobTrigger value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     * @return Whether the jobTrigger field is set.
     */
    public boolean hasJobTrigger() {
      return jobTriggerBuilder_ != null || jobTrigger_ != null;
    }
    /**
     * <pre>
     * New JobTrigger value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     * @return The jobTrigger.
     */
    public com.google.privacy.dlp.v2.JobTrigger getJobTrigger() {
      if (jobTriggerBuilder_ == null) {
        return jobTrigger_ == null ? com.google.privacy.dlp.v2.JobTrigger.getDefaultInstance() : jobTrigger_;
      } else {
        return jobTriggerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * New JobTrigger value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     */
    public Builder setJobTrigger(com.google.privacy.dlp.v2.JobTrigger value) {
      if (jobTriggerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jobTrigger_ = value;
        onChanged();
      } else {
        jobTriggerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * New JobTrigger value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     */
    public Builder setJobTrigger(
        com.google.privacy.dlp.v2.JobTrigger.Builder builderForValue) {
      if (jobTriggerBuilder_ == null) {
        jobTrigger_ = builderForValue.build();
        onChanged();
      } else {
        jobTriggerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * New JobTrigger value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     */
    public Builder mergeJobTrigger(com.google.privacy.dlp.v2.JobTrigger value) {
      if (jobTriggerBuilder_ == null) {
        if (jobTrigger_ != null) {
          jobTrigger_ =
            com.google.privacy.dlp.v2.JobTrigger.newBuilder(jobTrigger_).mergeFrom(value).buildPartial();
        } else {
          jobTrigger_ = value;
        }
        onChanged();
      } else {
        jobTriggerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * New JobTrigger value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     */
    public Builder clearJobTrigger() {
      if (jobTriggerBuilder_ == null) {
        jobTrigger_ = null;
        onChanged();
      } else {
        jobTrigger_ = null;
        jobTriggerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * New JobTrigger value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     */
    public com.google.privacy.dlp.v2.JobTrigger.Builder getJobTriggerBuilder() {
      
      onChanged();
      return getJobTriggerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * New JobTrigger value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     */
    public com.google.privacy.dlp.v2.JobTriggerOrBuilder getJobTriggerOrBuilder() {
      if (jobTriggerBuilder_ != null) {
        return jobTriggerBuilder_.getMessageOrBuilder();
      } else {
        return jobTrigger_ == null ?
            com.google.privacy.dlp.v2.JobTrigger.getDefaultInstance() : jobTrigger_;
      }
    }
    /**
     * <pre>
     * New JobTrigger value.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.JobTrigger job_trigger = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.JobTrigger, com.google.privacy.dlp.v2.JobTrigger.Builder, com.google.privacy.dlp.v2.JobTriggerOrBuilder> 
        getJobTriggerFieldBuilder() {
      if (jobTriggerBuilder_ == null) {
        jobTriggerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.JobTrigger, com.google.privacy.dlp.v2.JobTrigger.Builder, com.google.privacy.dlp.v2.JobTriggerOrBuilder>(
                getJobTrigger(),
                getParentForChildren(),
                isClean());
        jobTrigger_ = null;
      }
      return jobTriggerBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.UpdateJobTriggerRequest)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.UpdateJobTriggerRequest)
  private static final com.google.privacy.dlp.v2.UpdateJobTriggerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.UpdateJobTriggerRequest();
  }

  public static com.google.privacy.dlp.v2.UpdateJobTriggerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateJobTriggerRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateJobTriggerRequest>() {
    @java.lang.Override
    public UpdateJobTriggerRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateJobTriggerRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateJobTriggerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateJobTriggerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.UpdateJobTriggerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

