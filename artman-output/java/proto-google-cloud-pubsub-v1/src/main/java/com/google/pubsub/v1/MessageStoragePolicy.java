// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 * Protobuf type {@code google.pubsub.v1.MessageStoragePolicy}
 */
public  final class MessageStoragePolicy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.MessageStoragePolicy)
    MessageStoragePolicyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MessageStoragePolicy.newBuilder() to construct.
  private MessageStoragePolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MessageStoragePolicy() {
    allowedPersistenceRegions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MessageStoragePolicy();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MessageStoragePolicy(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              allowedPersistenceRegions_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            allowedPersistenceRegions_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        allowedPersistenceRegions_ = allowedPersistenceRegions_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_MessageStoragePolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_MessageStoragePolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.MessageStoragePolicy.class, com.google.pubsub.v1.MessageStoragePolicy.Builder.class);
  }

  public static final int ALLOWED_PERSISTENCE_REGIONS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList allowedPersistenceRegions_;
  /**
   * <pre>
   * A list of IDs of GCP regions where messages that are published to the topic
   * may be persisted in storage. Messages published by publishers running in
   * non-allowed GCP regions (or running outside of GCP altogether) will be
   * routed for storage in one of the allowed regions. An empty list means that
   * no regions are allowed, and is not a valid configuration.
   * </pre>
   *
   * <code>repeated string allowed_persistence_regions = 1;</code>
   * @return A list containing the allowedPersistenceRegions.
   */
  public com.google.protobuf.ProtocolStringList
      getAllowedPersistenceRegionsList() {
    return allowedPersistenceRegions_;
  }
  /**
   * <pre>
   * A list of IDs of GCP regions where messages that are published to the topic
   * may be persisted in storage. Messages published by publishers running in
   * non-allowed GCP regions (or running outside of GCP altogether) will be
   * routed for storage in one of the allowed regions. An empty list means that
   * no regions are allowed, and is not a valid configuration.
   * </pre>
   *
   * <code>repeated string allowed_persistence_regions = 1;</code>
   * @return The count of allowedPersistenceRegions.
   */
  public int getAllowedPersistenceRegionsCount() {
    return allowedPersistenceRegions_.size();
  }
  /**
   * <pre>
   * A list of IDs of GCP regions where messages that are published to the topic
   * may be persisted in storage. Messages published by publishers running in
   * non-allowed GCP regions (or running outside of GCP altogether) will be
   * routed for storage in one of the allowed regions. An empty list means that
   * no regions are allowed, and is not a valid configuration.
   * </pre>
   *
   * <code>repeated string allowed_persistence_regions = 1;</code>
   * @param index The index of the element to return.
   * @return The allowedPersistenceRegions at the given index.
   */
  public java.lang.String getAllowedPersistenceRegions(int index) {
    return allowedPersistenceRegions_.get(index);
  }
  /**
   * <pre>
   * A list of IDs of GCP regions where messages that are published to the topic
   * may be persisted in storage. Messages published by publishers running in
   * non-allowed GCP regions (or running outside of GCP altogether) will be
   * routed for storage in one of the allowed regions. An empty list means that
   * no regions are allowed, and is not a valid configuration.
   * </pre>
   *
   * <code>repeated string allowed_persistence_regions = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the allowedPersistenceRegions at the given index.
   */
  public com.google.protobuf.ByteString
      getAllowedPersistenceRegionsBytes(int index) {
    return allowedPersistenceRegions_.getByteString(index);
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
    for (int i = 0; i < allowedPersistenceRegions_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, allowedPersistenceRegions_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < allowedPersistenceRegions_.size(); i++) {
        dataSize += computeStringSizeNoTag(allowedPersistenceRegions_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAllowedPersistenceRegionsList().size();
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
    if (!(obj instanceof com.google.pubsub.v1.MessageStoragePolicy)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.MessageStoragePolicy other = (com.google.pubsub.v1.MessageStoragePolicy) obj;

    if (!getAllowedPersistenceRegionsList()
        .equals(other.getAllowedPersistenceRegionsList())) return false;
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
    if (getAllowedPersistenceRegionsCount() > 0) {
      hash = (37 * hash) + ALLOWED_PERSISTENCE_REGIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAllowedPersistenceRegionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.MessageStoragePolicy parseFrom(
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
  public static Builder newBuilder(com.google.pubsub.v1.MessageStoragePolicy prototype) {
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
   * Protobuf type {@code google.pubsub.v1.MessageStoragePolicy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.MessageStoragePolicy)
      com.google.pubsub.v1.MessageStoragePolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_MessageStoragePolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_MessageStoragePolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.MessageStoragePolicy.class, com.google.pubsub.v1.MessageStoragePolicy.Builder.class);
    }

    // Construct using com.google.pubsub.v1.MessageStoragePolicy.newBuilder()
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
      allowedPersistenceRegions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_MessageStoragePolicy_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1.MessageStoragePolicy getDefaultInstanceForType() {
      return com.google.pubsub.v1.MessageStoragePolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1.MessageStoragePolicy build() {
      com.google.pubsub.v1.MessageStoragePolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1.MessageStoragePolicy buildPartial() {
      com.google.pubsub.v1.MessageStoragePolicy result = new com.google.pubsub.v1.MessageStoragePolicy(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        allowedPersistenceRegions_ = allowedPersistenceRegions_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.allowedPersistenceRegions_ = allowedPersistenceRegions_;
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
      if (other instanceof com.google.pubsub.v1.MessageStoragePolicy) {
        return mergeFrom((com.google.pubsub.v1.MessageStoragePolicy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.MessageStoragePolicy other) {
      if (other == com.google.pubsub.v1.MessageStoragePolicy.getDefaultInstance()) return this;
      if (!other.allowedPersistenceRegions_.isEmpty()) {
        if (allowedPersistenceRegions_.isEmpty()) {
          allowedPersistenceRegions_ = other.allowedPersistenceRegions_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAllowedPersistenceRegionsIsMutable();
          allowedPersistenceRegions_.addAll(other.allowedPersistenceRegions_);
        }
        onChanged();
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
      com.google.pubsub.v1.MessageStoragePolicy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.MessageStoragePolicy) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList allowedPersistenceRegions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAllowedPersistenceRegionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        allowedPersistenceRegions_ = new com.google.protobuf.LazyStringArrayList(allowedPersistenceRegions_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * A list of IDs of GCP regions where messages that are published to the topic
     * may be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list means that
     * no regions are allowed, and is not a valid configuration.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     * @return A list containing the allowedPersistenceRegions.
     */
    public com.google.protobuf.ProtocolStringList
        getAllowedPersistenceRegionsList() {
      return allowedPersistenceRegions_.getUnmodifiableView();
    }
    /**
     * <pre>
     * A list of IDs of GCP regions where messages that are published to the topic
     * may be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list means that
     * no regions are allowed, and is not a valid configuration.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     * @return The count of allowedPersistenceRegions.
     */
    public int getAllowedPersistenceRegionsCount() {
      return allowedPersistenceRegions_.size();
    }
    /**
     * <pre>
     * A list of IDs of GCP regions where messages that are published to the topic
     * may be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list means that
     * no regions are allowed, and is not a valid configuration.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     * @param index The index of the element to return.
     * @return The allowedPersistenceRegions at the given index.
     */
    public java.lang.String getAllowedPersistenceRegions(int index) {
      return allowedPersistenceRegions_.get(index);
    }
    /**
     * <pre>
     * A list of IDs of GCP regions where messages that are published to the topic
     * may be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list means that
     * no regions are allowed, and is not a valid configuration.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the allowedPersistenceRegions at the given index.
     */
    public com.google.protobuf.ByteString
        getAllowedPersistenceRegionsBytes(int index) {
      return allowedPersistenceRegions_.getByteString(index);
    }
    /**
     * <pre>
     * A list of IDs of GCP regions where messages that are published to the topic
     * may be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list means that
     * no regions are allowed, and is not a valid configuration.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     * @param index The index to set the value at.
     * @param value The allowedPersistenceRegions to set.
     * @return This builder for chaining.
     */
    public Builder setAllowedPersistenceRegions(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAllowedPersistenceRegionsIsMutable();
      allowedPersistenceRegions_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of IDs of GCP regions where messages that are published to the topic
     * may be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list means that
     * no regions are allowed, and is not a valid configuration.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     * @param value The allowedPersistenceRegions to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedPersistenceRegions(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAllowedPersistenceRegionsIsMutable();
      allowedPersistenceRegions_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of IDs of GCP regions where messages that are published to the topic
     * may be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list means that
     * no regions are allowed, and is not a valid configuration.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     * @param values The allowedPersistenceRegions to add.
     * @return This builder for chaining.
     */
    public Builder addAllAllowedPersistenceRegions(
        java.lang.Iterable<java.lang.String> values) {
      ensureAllowedPersistenceRegionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, allowedPersistenceRegions_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of IDs of GCP regions where messages that are published to the topic
     * may be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list means that
     * no regions are allowed, and is not a valid configuration.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowedPersistenceRegions() {
      allowedPersistenceRegions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of IDs of GCP regions where messages that are published to the topic
     * may be persisted in storage. Messages published by publishers running in
     * non-allowed GCP regions (or running outside of GCP altogether) will be
     * routed for storage in one of the allowed regions. An empty list means that
     * no regions are allowed, and is not a valid configuration.
     * </pre>
     *
     * <code>repeated string allowed_persistence_regions = 1;</code>
     * @param value The bytes of the allowedPersistenceRegions to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedPersistenceRegionsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAllowedPersistenceRegionsIsMutable();
      allowedPersistenceRegions_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.MessageStoragePolicy)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.MessageStoragePolicy)
  private static final com.google.pubsub.v1.MessageStoragePolicy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.MessageStoragePolicy();
  }

  public static com.google.pubsub.v1.MessageStoragePolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MessageStoragePolicy>
      PARSER = new com.google.protobuf.AbstractParser<MessageStoragePolicy>() {
    @java.lang.Override
    public MessageStoragePolicy parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MessageStoragePolicy(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MessageStoragePolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MessageStoragePolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1.MessageStoragePolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
