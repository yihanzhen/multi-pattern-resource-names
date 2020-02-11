// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/autoscaling_policies.proto

package com.google.cloud.dataproc.v1beta2;

/**
 * <pre>
 * A request to update an autoscaling policy.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest}
 */
public  final class UpdateAutoscalingPolicyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest)
    UpdateAutoscalingPolicyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateAutoscalingPolicyRequest.newBuilder() to construct.
  private UpdateAutoscalingPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateAutoscalingPolicyRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateAutoscalingPolicyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateAutoscalingPolicyRequest(
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
            com.google.cloud.dataproc.v1beta2.AutoscalingPolicy.Builder subBuilder = null;
            if (policy_ != null) {
              subBuilder = policy_.toBuilder();
            }
            policy_ = input.readMessage(com.google.cloud.dataproc.v1beta2.AutoscalingPolicy.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(policy_);
              policy_ = subBuilder.buildPartial();
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
    return com.google.cloud.dataproc.v1beta2.AutoscalingPoliciesProto.internal_static_google_cloud_dataproc_v1beta2_UpdateAutoscalingPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1beta2.AutoscalingPoliciesProto.internal_static_google_cloud_dataproc_v1beta2_UpdateAutoscalingPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest.class, com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest.Builder.class);
  }

  public static final int POLICY_FIELD_NUMBER = 1;
  private com.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy_;
  /**
   * <pre>
   * Required. The updated autoscaling policy.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the policy field is set.
   */
  public boolean hasPolicy() {
    return policy_ != null;
  }
  /**
   * <pre>
   * Required. The updated autoscaling policy.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The policy.
   */
  public com.google.cloud.dataproc.v1beta2.AutoscalingPolicy getPolicy() {
    return policy_ == null ? com.google.cloud.dataproc.v1beta2.AutoscalingPolicy.getDefaultInstance() : policy_;
  }
  /**
   * <pre>
   * Required. The updated autoscaling policy.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   */
  public com.google.cloud.dataproc.v1beta2.AutoscalingPolicyOrBuilder getPolicyOrBuilder() {
    return getPolicy();
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
    if (policy_ != null) {
      output.writeMessage(1, getPolicy());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (policy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPolicy());
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
    if (!(obj instanceof com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest other = (com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest) obj;

    if (hasPolicy() != other.hasPolicy()) return false;
    if (hasPolicy()) {
      if (!getPolicy()
          .equals(other.getPolicy())) return false;
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
    if (hasPolicy()) {
      hash = (37 * hash) + POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getPolicy().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest prototype) {
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
   * A request to update an autoscaling policy.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest)
      com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1beta2.AutoscalingPoliciesProto.internal_static_google_cloud_dataproc_v1beta2_UpdateAutoscalingPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1beta2.AutoscalingPoliciesProto.internal_static_google_cloud_dataproc_v1beta2_UpdateAutoscalingPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest.class, com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest.newBuilder()
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
      if (policyBuilder_ == null) {
        policy_ = null;
      } else {
        policy_ = null;
        policyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1beta2.AutoscalingPoliciesProto.internal_static_google_cloud_dataproc_v1beta2_UpdateAutoscalingPolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest build() {
      com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest buildPartial() {
      com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest result = new com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest(this);
      if (policyBuilder_ == null) {
        result.policy_ = policy_;
      } else {
        result.policy_ = policyBuilder_.build();
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
      if (other instanceof com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest) {
        return mergeFrom((com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest other) {
      if (other == com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest.getDefaultInstance()) return this;
      if (other.hasPolicy()) {
        mergePolicy(other.getPolicy());
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
      com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataproc.v1beta2.AutoscalingPolicy, com.google.cloud.dataproc.v1beta2.AutoscalingPolicy.Builder, com.google.cloud.dataproc.v1beta2.AutoscalingPolicyOrBuilder> policyBuilder_;
    /**
     * <pre>
     * Required. The updated autoscaling policy.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return Whether the policy field is set.
     */
    public boolean hasPolicy() {
      return policyBuilder_ != null || policy_ != null;
    }
    /**
     * <pre>
     * Required. The updated autoscaling policy.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The policy.
     */
    public com.google.cloud.dataproc.v1beta2.AutoscalingPolicy getPolicy() {
      if (policyBuilder_ == null) {
        return policy_ == null ? com.google.cloud.dataproc.v1beta2.AutoscalingPolicy.getDefaultInstance() : policy_;
      } else {
        return policyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The updated autoscaling policy.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     */
    public Builder setPolicy(com.google.cloud.dataproc.v1beta2.AutoscalingPolicy value) {
      if (policyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policy_ = value;
        onChanged();
      } else {
        policyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The updated autoscaling policy.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     */
    public Builder setPolicy(
        com.google.cloud.dataproc.v1beta2.AutoscalingPolicy.Builder builderForValue) {
      if (policyBuilder_ == null) {
        policy_ = builderForValue.build();
        onChanged();
      } else {
        policyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The updated autoscaling policy.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     */
    public Builder mergePolicy(com.google.cloud.dataproc.v1beta2.AutoscalingPolicy value) {
      if (policyBuilder_ == null) {
        if (policy_ != null) {
          policy_ =
            com.google.cloud.dataproc.v1beta2.AutoscalingPolicy.newBuilder(policy_).mergeFrom(value).buildPartial();
        } else {
          policy_ = value;
        }
        onChanged();
      } else {
        policyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The updated autoscaling policy.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     */
    public Builder clearPolicy() {
      if (policyBuilder_ == null) {
        policy_ = null;
        onChanged();
      } else {
        policy_ = null;
        policyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The updated autoscaling policy.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     */
    public com.google.cloud.dataproc.v1beta2.AutoscalingPolicy.Builder getPolicyBuilder() {
      
      onChanged();
      return getPolicyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The updated autoscaling policy.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     */
    public com.google.cloud.dataproc.v1beta2.AutoscalingPolicyOrBuilder getPolicyOrBuilder() {
      if (policyBuilder_ != null) {
        return policyBuilder_.getMessageOrBuilder();
      } else {
        return policy_ == null ?
            com.google.cloud.dataproc.v1beta2.AutoscalingPolicy.getDefaultInstance() : policy_;
      }
    }
    /**
     * <pre>
     * Required. The updated autoscaling policy.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataproc.v1beta2.AutoscalingPolicy, com.google.cloud.dataproc.v1beta2.AutoscalingPolicy.Builder, com.google.cloud.dataproc.v1beta2.AutoscalingPolicyOrBuilder> 
        getPolicyFieldBuilder() {
      if (policyBuilder_ == null) {
        policyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1beta2.AutoscalingPolicy, com.google.cloud.dataproc.v1beta2.AutoscalingPolicy.Builder, com.google.cloud.dataproc.v1beta2.AutoscalingPolicyOrBuilder>(
                getPolicy(),
                getParentForChildren(),
                isClean());
        policy_ = null;
      }
      return policyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest)
  private static final com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest();
  }

  public static com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAutoscalingPolicyRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateAutoscalingPolicyRequest>() {
    @java.lang.Override
    public UpdateAutoscalingPolicyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateAutoscalingPolicyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateAutoscalingPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAutoscalingPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

