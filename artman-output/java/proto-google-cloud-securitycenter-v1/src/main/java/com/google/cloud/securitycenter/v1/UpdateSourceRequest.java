// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

/**
 * <pre>
 * Request message for updating a source.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.UpdateSourceRequest}
 */
public  final class UpdateSourceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.UpdateSourceRequest)
    UpdateSourceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateSourceRequest.newBuilder() to construct.
  private UpdateSourceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateSourceRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateSourceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateSourceRequest(
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
            com.google.cloud.securitycenter.v1.Source.Builder subBuilder = null;
            if (source_ != null) {
              subBuilder = source_.toBuilder();
            }
            source_ = input.readMessage(com.google.cloud.securitycenter.v1.Source.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(source_);
              source_ = subBuilder.buildPartial();
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
    return com.google.cloud.securitycenter.v1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1_UpdateSourceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1_UpdateSourceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.UpdateSourceRequest.class, com.google.cloud.securitycenter.v1.UpdateSourceRequest.Builder.class);
  }

  public static final int SOURCE_FIELD_NUMBER = 1;
  private com.google.cloud.securitycenter.v1.Source source_;
  /**
   * <pre>
   * Required. The source resource to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Source source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the source field is set.
   */
  public boolean hasSource() {
    return source_ != null;
  }
  /**
   * <pre>
   * Required. The source resource to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Source source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The source.
   */
  public com.google.cloud.securitycenter.v1.Source getSource() {
    return source_ == null ? com.google.cloud.securitycenter.v1.Source.getDefaultInstance() : source_;
  }
  /**
   * <pre>
   * Required. The source resource to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Source source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.cloud.securitycenter.v1.SourceOrBuilder getSourceOrBuilder() {
    return getSource();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The FieldMask to use when updating the source resource.
   * If empty all mutable fields will be updated.
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
   * The FieldMask to use when updating the source resource.
   * If empty all mutable fields will be updated.
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
   * The FieldMask to use when updating the source resource.
   * If empty all mutable fields will be updated.
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
    if (source_ != null) {
      output.writeMessage(1, getSource());
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
    if (source_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSource());
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.UpdateSourceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.UpdateSourceRequest other = (com.google.cloud.securitycenter.v1.UpdateSourceRequest) obj;

    if (hasSource() != other.hasSource()) return false;
    if (hasSource()) {
      if (!getSource()
          .equals(other.getSource())) return false;
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
    if (hasSource()) {
      hash = (37 * hash) + SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getSource().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.UpdateSourceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSourceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSourceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSourceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSourceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSourceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSourceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSourceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSourceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSourceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSourceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSourceRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.securitycenter.v1.UpdateSourceRequest prototype) {
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
   * Request message for updating a source.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.UpdateSourceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.UpdateSourceRequest)
      com.google.cloud.securitycenter.v1.UpdateSourceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1_UpdateSourceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1_UpdateSourceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.UpdateSourceRequest.class, com.google.cloud.securitycenter.v1.UpdateSourceRequest.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.UpdateSourceRequest.newBuilder()
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
      if (sourceBuilder_ == null) {
        source_ = null;
      } else {
        source_ = null;
        sourceBuilder_ = null;
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
      return com.google.cloud.securitycenter.v1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1_UpdateSourceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.UpdateSourceRequest getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.UpdateSourceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.UpdateSourceRequest build() {
      com.google.cloud.securitycenter.v1.UpdateSourceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.UpdateSourceRequest buildPartial() {
      com.google.cloud.securitycenter.v1.UpdateSourceRequest result = new com.google.cloud.securitycenter.v1.UpdateSourceRequest(this);
      if (sourceBuilder_ == null) {
        result.source_ = source_;
      } else {
        result.source_ = sourceBuilder_.build();
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
      if (other instanceof com.google.cloud.securitycenter.v1.UpdateSourceRequest) {
        return mergeFrom((com.google.cloud.securitycenter.v1.UpdateSourceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.UpdateSourceRequest other) {
      if (other == com.google.cloud.securitycenter.v1.UpdateSourceRequest.getDefaultInstance()) return this;
      if (other.hasSource()) {
        mergeSource(other.getSource());
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
      com.google.cloud.securitycenter.v1.UpdateSourceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.securitycenter.v1.UpdateSourceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.securitycenter.v1.Source source_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.securitycenter.v1.Source, com.google.cloud.securitycenter.v1.Source.Builder, com.google.cloud.securitycenter.v1.SourceOrBuilder> sourceBuilder_;
    /**
     * <pre>
     * Required. The source resource to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.Source source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the source field is set.
     */
    public boolean hasSource() {
      return sourceBuilder_ != null || source_ != null;
    }
    /**
     * <pre>
     * Required. The source resource to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.Source source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The source.
     */
    public com.google.cloud.securitycenter.v1.Source getSource() {
      if (sourceBuilder_ == null) {
        return source_ == null ? com.google.cloud.securitycenter.v1.Source.getDefaultInstance() : source_;
      } else {
        return sourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The source resource to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.Source source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSource(com.google.cloud.securitycenter.v1.Source value) {
      if (sourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        sourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The source resource to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.Source source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSource(
        com.google.cloud.securitycenter.v1.Source.Builder builderForValue) {
      if (sourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        sourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The source resource to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.Source source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSource(com.google.cloud.securitycenter.v1.Source value) {
      if (sourceBuilder_ == null) {
        if (source_ != null) {
          source_ =
            com.google.cloud.securitycenter.v1.Source.newBuilder(source_).mergeFrom(value).buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        sourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The source resource to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.Source source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSource() {
      if (sourceBuilder_ == null) {
        source_ = null;
        onChanged();
      } else {
        source_ = null;
        sourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The source resource to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.Source source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.securitycenter.v1.Source.Builder getSourceBuilder() {
      
      onChanged();
      return getSourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The source resource to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.Source source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.securitycenter.v1.SourceOrBuilder getSourceOrBuilder() {
      if (sourceBuilder_ != null) {
        return sourceBuilder_.getMessageOrBuilder();
      } else {
        return source_ == null ?
            com.google.cloud.securitycenter.v1.Source.getDefaultInstance() : source_;
      }
    }
    /**
     * <pre>
     * Required. The source resource to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.Source source = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.securitycenter.v1.Source, com.google.cloud.securitycenter.v1.Source.Builder, com.google.cloud.securitycenter.v1.SourceOrBuilder> 
        getSourceFieldBuilder() {
      if (sourceBuilder_ == null) {
        sourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1.Source, com.google.cloud.securitycenter.v1.Source.Builder, com.google.cloud.securitycenter.v1.SourceOrBuilder>(
                getSource(),
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      return sourceBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The FieldMask to use when updating the source resource.
     * If empty all mutable fields will be updated.
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
     * The FieldMask to use when updating the source resource.
     * If empty all mutable fields will be updated.
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
     * The FieldMask to use when updating the source resource.
     * If empty all mutable fields will be updated.
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
     * The FieldMask to use when updating the source resource.
     * If empty all mutable fields will be updated.
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
     * The FieldMask to use when updating the source resource.
     * If empty all mutable fields will be updated.
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
     * The FieldMask to use when updating the source resource.
     * If empty all mutable fields will be updated.
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
     * The FieldMask to use when updating the source resource.
     * If empty all mutable fields will be updated.
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
     * The FieldMask to use when updating the source resource.
     * If empty all mutable fields will be updated.
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
     * The FieldMask to use when updating the source resource.
     * If empty all mutable fields will be updated.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.UpdateSourceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.UpdateSourceRequest)
  private static final com.google.cloud.securitycenter.v1.UpdateSourceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.UpdateSourceRequest();
  }

  public static com.google.cloud.securitycenter.v1.UpdateSourceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSourceRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateSourceRequest>() {
    @java.lang.Override
    public UpdateSourceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateSourceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateSourceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSourceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.UpdateSourceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

