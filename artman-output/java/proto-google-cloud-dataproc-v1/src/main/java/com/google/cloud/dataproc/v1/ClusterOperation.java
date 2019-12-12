// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/workflow_templates.proto

package com.google.cloud.dataproc.v1;

/**
 * <pre>
 * The cluster operation triggered by a workflow.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.ClusterOperation}
 */
public  final class ClusterOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.ClusterOperation)
    ClusterOperationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClusterOperation.newBuilder() to construct.
  private ClusterOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClusterOperation() {
    operationId_ = "";
    error_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClusterOperation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            operationId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            error_ = s;
            break;
          }
          case 24: {

            done_ = input.readBool();
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
    return com.google.cloud.dataproc.v1.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1_ClusterOperation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1_ClusterOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.ClusterOperation.class, com.google.cloud.dataproc.v1.ClusterOperation.Builder.class);
  }

  public static final int OPERATION_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object operationId_;
  /**
   * <pre>
   * Output only. The id of the cluster operation.
   * </pre>
   *
   * <code>string operation_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  public java.lang.String getOperationId() {
    java.lang.Object ref = operationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operationId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The id of the cluster operation.
   * </pre>
   *
   * <code>string operation_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  public com.google.protobuf.ByteString
      getOperationIdBytes() {
    java.lang.Object ref = operationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      operationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  private volatile java.lang.Object error_;
  /**
   * <pre>
   * Output only. Error, if operation failed.
   * </pre>
   *
   * <code>string error = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  public java.lang.String getError() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      error_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Error, if operation failed.
   * </pre>
   *
   * <code>string error = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  public com.google.protobuf.ByteString
      getErrorBytes() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      error_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DONE_FIELD_NUMBER = 3;
  private boolean done_;
  /**
   * <pre>
   * Output only. Indicates the operation is done.
   * </pre>
   *
   * <code>bool done = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  public boolean getDone() {
    return done_;
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
    if (!getOperationIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, operationId_);
    }
    if (!getErrorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, error_);
    }
    if (done_ != false) {
      output.writeBool(3, done_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOperationIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, operationId_);
    }
    if (!getErrorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, error_);
    }
    if (done_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, done_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.ClusterOperation)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.ClusterOperation other = (com.google.cloud.dataproc.v1.ClusterOperation) obj;

    if (!getOperationId()
        .equals(other.getOperationId())) return false;
    if (!getError()
        .equals(other.getError())) return false;
    if (getDone()
        != other.getDone()) return false;
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
    hash = (37 * hash) + OPERATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOperationId().hashCode();
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    hash = (37 * hash) + DONE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDone());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.ClusterOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.ClusterOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.ClusterOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.ClusterOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.ClusterOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.ClusterOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.ClusterOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.ClusterOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.ClusterOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.ClusterOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.ClusterOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.ClusterOperation parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1.ClusterOperation prototype) {
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
   * The cluster operation triggered by a workflow.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.ClusterOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.ClusterOperation)
      com.google.cloud.dataproc.v1.ClusterOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1_ClusterOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1_ClusterOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.ClusterOperation.class, com.google.cloud.dataproc.v1.ClusterOperation.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.ClusterOperation.newBuilder()
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
      operationId_ = "";

      error_ = "";

      done_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1_ClusterOperation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ClusterOperation getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.ClusterOperation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ClusterOperation build() {
      com.google.cloud.dataproc.v1.ClusterOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ClusterOperation buildPartial() {
      com.google.cloud.dataproc.v1.ClusterOperation result = new com.google.cloud.dataproc.v1.ClusterOperation(this);
      result.operationId_ = operationId_;
      result.error_ = error_;
      result.done_ = done_;
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
      if (other instanceof com.google.cloud.dataproc.v1.ClusterOperation) {
        return mergeFrom((com.google.cloud.dataproc.v1.ClusterOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.ClusterOperation other) {
      if (other == com.google.cloud.dataproc.v1.ClusterOperation.getDefaultInstance()) return this;
      if (!other.getOperationId().isEmpty()) {
        operationId_ = other.operationId_;
        onChanged();
      }
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
        onChanged();
      }
      if (other.getDone() != false) {
        setDone(other.getDone());
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
      com.google.cloud.dataproc.v1.ClusterOperation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1.ClusterOperation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object operationId_ = "";
    /**
     * <pre>
     * Output only. The id of the cluster operation.
     * </pre>
     *
     * <code>string operation_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.lang.String getOperationId() {
      java.lang.Object ref = operationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The id of the cluster operation.
     * </pre>
     *
     * <code>string operation_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.ByteString
        getOperationIdBytes() {
      java.lang.Object ref = operationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        operationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The id of the cluster operation.
     * </pre>
     *
     * <code>string operation_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setOperationId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      operationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The id of the cluster operation.
     * </pre>
     *
     * <code>string operation_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearOperationId() {
      
      operationId_ = getDefaultInstance().getOperationId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The id of the cluster operation.
     * </pre>
     *
     * <code>string operation_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setOperationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      operationId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object error_ = "";
    /**
     * <pre>
     * Output only. Error, if operation failed.
     * </pre>
     *
     * <code>string error = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        error_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Error, if operation failed.
     * </pre>
     *
     * <code>string error = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.ByteString
        getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Error, if operation failed.
     * </pre>
     *
     * <code>string error = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setError(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      error_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Error, if operation failed.
     * </pre>
     *
     * <code>string error = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearError() {
      
      error_ = getDefaultInstance().getError();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Error, if operation failed.
     * </pre>
     *
     * <code>string error = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setErrorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      error_ = value;
      onChanged();
      return this;
    }

    private boolean done_ ;
    /**
     * <pre>
     * Output only. Indicates the operation is done.
     * </pre>
     *
     * <code>bool done = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public boolean getDone() {
      return done_;
    }
    /**
     * <pre>
     * Output only. Indicates the operation is done.
     * </pre>
     *
     * <code>bool done = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setDone(boolean value) {
      
      done_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Indicates the operation is done.
     * </pre>
     *
     * <code>bool done = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearDone() {
      
      done_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.ClusterOperation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.ClusterOperation)
  private static final com.google.cloud.dataproc.v1.ClusterOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.ClusterOperation();
  }

  public static com.google.cloud.dataproc.v1.ClusterOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClusterOperation>
      PARSER = new com.google.protobuf.AbstractParser<ClusterOperation>() {
    @java.lang.Override
    public ClusterOperation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClusterOperation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClusterOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClusterOperation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.ClusterOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

