// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Response message for ListDeidentifyTemplates.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.ListDeidentifyTemplatesResponse}
 */
public  final class ListDeidentifyTemplatesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.ListDeidentifyTemplatesResponse)
    ListDeidentifyTemplatesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDeidentifyTemplatesResponse.newBuilder() to construct.
  private ListDeidentifyTemplatesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDeidentifyTemplatesResponse() {
    deidentifyTemplates_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListDeidentifyTemplatesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListDeidentifyTemplatesResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              deidentifyTemplates_ = new java.util.ArrayList<com.google.privacy.dlp.v2.DeidentifyTemplate>();
              mutable_bitField0_ |= 0x00000001;
            }
            deidentifyTemplates_.add(
                input.readMessage(com.google.privacy.dlp.v2.DeidentifyTemplate.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
        deidentifyTemplates_ = java.util.Collections.unmodifiableList(deidentifyTemplates_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ListDeidentifyTemplatesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ListDeidentifyTemplatesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse.class, com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse.Builder.class);
  }

  public static final int DEIDENTIFY_TEMPLATES_FIELD_NUMBER = 1;
  private java.util.List<com.google.privacy.dlp.v2.DeidentifyTemplate> deidentifyTemplates_;
  /**
   * <pre>
   * List of deidentify templates, up to page_size in
   * ListDeidentifyTemplatesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
   */
  public java.util.List<com.google.privacy.dlp.v2.DeidentifyTemplate> getDeidentifyTemplatesList() {
    return deidentifyTemplates_;
  }
  /**
   * <pre>
   * List of deidentify templates, up to page_size in
   * ListDeidentifyTemplatesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
   */
  public java.util.List<? extends com.google.privacy.dlp.v2.DeidentifyTemplateOrBuilder> 
      getDeidentifyTemplatesOrBuilderList() {
    return deidentifyTemplates_;
  }
  /**
   * <pre>
   * List of deidentify templates, up to page_size in
   * ListDeidentifyTemplatesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
   */
  public int getDeidentifyTemplatesCount() {
    return deidentifyTemplates_.size();
  }
  /**
   * <pre>
   * List of deidentify templates, up to page_size in
   * ListDeidentifyTemplatesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
   */
  public com.google.privacy.dlp.v2.DeidentifyTemplate getDeidentifyTemplates(int index) {
    return deidentifyTemplates_.get(index);
  }
  /**
   * <pre>
   * List of deidentify templates, up to page_size in
   * ListDeidentifyTemplatesRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
   */
  public com.google.privacy.dlp.v2.DeidentifyTemplateOrBuilder getDeidentifyTemplatesOrBuilder(
      int index) {
    return deidentifyTemplates_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * If the next page is available then the next page token to be used
   * in following ListDeidentifyTemplates request.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If the next page is available then the next page token to be used
   * in following ListDeidentifyTemplates request.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < deidentifyTemplates_.size(); i++) {
      output.writeMessage(1, deidentifyTemplates_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < deidentifyTemplates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, deidentifyTemplates_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse other = (com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse) obj;

    if (!getDeidentifyTemplatesList()
        .equals(other.getDeidentifyTemplatesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getDeidentifyTemplatesCount() > 0) {
      hash = (37 * hash) + DEIDENTIFY_TEMPLATES_FIELD_NUMBER;
      hash = (53 * hash) + getDeidentifyTemplatesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse prototype) {
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
   * Response message for ListDeidentifyTemplates.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.ListDeidentifyTemplatesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.ListDeidentifyTemplatesResponse)
      com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ListDeidentifyTemplatesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ListDeidentifyTemplatesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse.class, com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse.newBuilder()
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
        getDeidentifyTemplatesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (deidentifyTemplatesBuilder_ == null) {
        deidentifyTemplates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        deidentifyTemplatesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_ListDeidentifyTemplatesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse build() {
      com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse buildPartial() {
      com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse result = new com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse(this);
      int from_bitField0_ = bitField0_;
      if (deidentifyTemplatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          deidentifyTemplates_ = java.util.Collections.unmodifiableList(deidentifyTemplates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.deidentifyTemplates_ = deidentifyTemplates_;
      } else {
        result.deidentifyTemplates_ = deidentifyTemplatesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse) {
        return mergeFrom((com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse other) {
      if (other == com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse.getDefaultInstance()) return this;
      if (deidentifyTemplatesBuilder_ == null) {
        if (!other.deidentifyTemplates_.isEmpty()) {
          if (deidentifyTemplates_.isEmpty()) {
            deidentifyTemplates_ = other.deidentifyTemplates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDeidentifyTemplatesIsMutable();
            deidentifyTemplates_.addAll(other.deidentifyTemplates_);
          }
          onChanged();
        }
      } else {
        if (!other.deidentifyTemplates_.isEmpty()) {
          if (deidentifyTemplatesBuilder_.isEmpty()) {
            deidentifyTemplatesBuilder_.dispose();
            deidentifyTemplatesBuilder_ = null;
            deidentifyTemplates_ = other.deidentifyTemplates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            deidentifyTemplatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDeidentifyTemplatesFieldBuilder() : null;
          } else {
            deidentifyTemplatesBuilder_.addAllMessages(other.deidentifyTemplates_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.privacy.dlp.v2.DeidentifyTemplate> deidentifyTemplates_ =
      java.util.Collections.emptyList();
    private void ensureDeidentifyTemplatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        deidentifyTemplates_ = new java.util.ArrayList<com.google.privacy.dlp.v2.DeidentifyTemplate>(deidentifyTemplates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2.DeidentifyTemplate, com.google.privacy.dlp.v2.DeidentifyTemplate.Builder, com.google.privacy.dlp.v2.DeidentifyTemplateOrBuilder> deidentifyTemplatesBuilder_;

    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.DeidentifyTemplate> getDeidentifyTemplatesList() {
      if (deidentifyTemplatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(deidentifyTemplates_);
      } else {
        return deidentifyTemplatesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public int getDeidentifyTemplatesCount() {
      if (deidentifyTemplatesBuilder_ == null) {
        return deidentifyTemplates_.size();
      } else {
        return deidentifyTemplatesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public com.google.privacy.dlp.v2.DeidentifyTemplate getDeidentifyTemplates(int index) {
      if (deidentifyTemplatesBuilder_ == null) {
        return deidentifyTemplates_.get(index);
      } else {
        return deidentifyTemplatesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public Builder setDeidentifyTemplates(
        int index, com.google.privacy.dlp.v2.DeidentifyTemplate value) {
      if (deidentifyTemplatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeidentifyTemplatesIsMutable();
        deidentifyTemplates_.set(index, value);
        onChanged();
      } else {
        deidentifyTemplatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public Builder setDeidentifyTemplates(
        int index, com.google.privacy.dlp.v2.DeidentifyTemplate.Builder builderForValue) {
      if (deidentifyTemplatesBuilder_ == null) {
        ensureDeidentifyTemplatesIsMutable();
        deidentifyTemplates_.set(index, builderForValue.build());
        onChanged();
      } else {
        deidentifyTemplatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public Builder addDeidentifyTemplates(com.google.privacy.dlp.v2.DeidentifyTemplate value) {
      if (deidentifyTemplatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeidentifyTemplatesIsMutable();
        deidentifyTemplates_.add(value);
        onChanged();
      } else {
        deidentifyTemplatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public Builder addDeidentifyTemplates(
        int index, com.google.privacy.dlp.v2.DeidentifyTemplate value) {
      if (deidentifyTemplatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeidentifyTemplatesIsMutable();
        deidentifyTemplates_.add(index, value);
        onChanged();
      } else {
        deidentifyTemplatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public Builder addDeidentifyTemplates(
        com.google.privacy.dlp.v2.DeidentifyTemplate.Builder builderForValue) {
      if (deidentifyTemplatesBuilder_ == null) {
        ensureDeidentifyTemplatesIsMutable();
        deidentifyTemplates_.add(builderForValue.build());
        onChanged();
      } else {
        deidentifyTemplatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public Builder addDeidentifyTemplates(
        int index, com.google.privacy.dlp.v2.DeidentifyTemplate.Builder builderForValue) {
      if (deidentifyTemplatesBuilder_ == null) {
        ensureDeidentifyTemplatesIsMutable();
        deidentifyTemplates_.add(index, builderForValue.build());
        onChanged();
      } else {
        deidentifyTemplatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public Builder addAllDeidentifyTemplates(
        java.lang.Iterable<? extends com.google.privacy.dlp.v2.DeidentifyTemplate> values) {
      if (deidentifyTemplatesBuilder_ == null) {
        ensureDeidentifyTemplatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, deidentifyTemplates_);
        onChanged();
      } else {
        deidentifyTemplatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public Builder clearDeidentifyTemplates() {
      if (deidentifyTemplatesBuilder_ == null) {
        deidentifyTemplates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        deidentifyTemplatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public Builder removeDeidentifyTemplates(int index) {
      if (deidentifyTemplatesBuilder_ == null) {
        ensureDeidentifyTemplatesIsMutable();
        deidentifyTemplates_.remove(index);
        onChanged();
      } else {
        deidentifyTemplatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public com.google.privacy.dlp.v2.DeidentifyTemplate.Builder getDeidentifyTemplatesBuilder(
        int index) {
      return getDeidentifyTemplatesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public com.google.privacy.dlp.v2.DeidentifyTemplateOrBuilder getDeidentifyTemplatesOrBuilder(
        int index) {
      if (deidentifyTemplatesBuilder_ == null) {
        return deidentifyTemplates_.get(index);  } else {
        return deidentifyTemplatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public java.util.List<? extends com.google.privacy.dlp.v2.DeidentifyTemplateOrBuilder> 
         getDeidentifyTemplatesOrBuilderList() {
      if (deidentifyTemplatesBuilder_ != null) {
        return deidentifyTemplatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(deidentifyTemplates_);
      }
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public com.google.privacy.dlp.v2.DeidentifyTemplate.Builder addDeidentifyTemplatesBuilder() {
      return getDeidentifyTemplatesFieldBuilder().addBuilder(
          com.google.privacy.dlp.v2.DeidentifyTemplate.getDefaultInstance());
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public com.google.privacy.dlp.v2.DeidentifyTemplate.Builder addDeidentifyTemplatesBuilder(
        int index) {
      return getDeidentifyTemplatesFieldBuilder().addBuilder(
          index, com.google.privacy.dlp.v2.DeidentifyTemplate.getDefaultInstance());
    }
    /**
     * <pre>
     * List of deidentify templates, up to page_size in
     * ListDeidentifyTemplatesRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.DeidentifyTemplate deidentify_templates = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.DeidentifyTemplate.Builder> 
         getDeidentifyTemplatesBuilderList() {
      return getDeidentifyTemplatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2.DeidentifyTemplate, com.google.privacy.dlp.v2.DeidentifyTemplate.Builder, com.google.privacy.dlp.v2.DeidentifyTemplateOrBuilder> 
        getDeidentifyTemplatesFieldBuilder() {
      if (deidentifyTemplatesBuilder_ == null) {
        deidentifyTemplatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2.DeidentifyTemplate, com.google.privacy.dlp.v2.DeidentifyTemplate.Builder, com.google.privacy.dlp.v2.DeidentifyTemplateOrBuilder>(
                deidentifyTemplates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        deidentifyTemplates_ = null;
      }
      return deidentifyTemplatesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * If the next page is available then the next page token to be used
     * in following ListDeidentifyTemplates request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If the next page is available then the next page token to be used
     * in following ListDeidentifyTemplates request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If the next page is available then the next page token to be used
     * in following ListDeidentifyTemplates request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If the next page is available then the next page token to be used
     * in following ListDeidentifyTemplates request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If the next page is available then the next page token to be used
     * in following ListDeidentifyTemplates request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.ListDeidentifyTemplatesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.ListDeidentifyTemplatesResponse)
  private static final com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse();
  }

  public static com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDeidentifyTemplatesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDeidentifyTemplatesResponse>() {
    @java.lang.Override
    public ListDeidentifyTemplatesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListDeidentifyTemplatesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListDeidentifyTemplatesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDeidentifyTemplatesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.ListDeidentifyTemplatesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

