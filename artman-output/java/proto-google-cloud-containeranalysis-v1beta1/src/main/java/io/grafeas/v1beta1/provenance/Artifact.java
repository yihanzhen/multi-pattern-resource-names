// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/provenance/provenance.proto

package io.grafeas.v1beta1.provenance;

/**
 * <pre>
 * Artifact describes a build product.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.provenance.Artifact}
 */
public  final class Artifact extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.provenance.Artifact)
    ArtifactOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Artifact.newBuilder() to construct.
  private Artifact(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Artifact() {
    checksum_ = "";
    id_ = "";
    names_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Artifact(
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

            checksum_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              names_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            names_.add(s);
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
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        names_ = names_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grafeas.v1beta1.provenance.Provenance.internal_static_grafeas_v1beta1_provenance_Artifact_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.provenance.Provenance.internal_static_grafeas_v1beta1_provenance_Artifact_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.provenance.Artifact.class, io.grafeas.v1beta1.provenance.Artifact.Builder.class);
  }

  private int bitField0_;
  public static final int CHECKSUM_FIELD_NUMBER = 1;
  private volatile java.lang.Object checksum_;
  /**
   * <pre>
   * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
   * container.
   * </pre>
   *
   * <code>string checksum = 1;</code>
   */
  public java.lang.String getChecksum() {
    java.lang.Object ref = checksum_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      checksum_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
   * container.
   * </pre>
   *
   * <code>string checksum = 1;</code>
   */
  public com.google.protobuf.ByteString
      getChecksumBytes() {
    java.lang.Object ref = checksum_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      checksum_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * Artifact ID, if any; for container images, this will be a URL by digest
   * like `gcr.io/projectID/imagename&#64;sha256:123456`.
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Artifact ID, if any; for container images, this will be a URL by digest
   * like `gcr.io/projectID/imagename&#64;sha256:123456`.
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAMES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList names_;
  /**
   * <pre>
   * Related artifact names. This may be the path to a binary or jar file, or in
   * the case of a container build, the name used to push the container image to
   * Google Container Registry, as presented to `docker push`. Note that a
   * single Artifact ID can have multiple names, for example if two tags are
   * applied to one image.
   * </pre>
   *
   * <code>repeated string names = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getNamesList() {
    return names_;
  }
  /**
   * <pre>
   * Related artifact names. This may be the path to a binary or jar file, or in
   * the case of a container build, the name used to push the container image to
   * Google Container Registry, as presented to `docker push`. Note that a
   * single Artifact ID can have multiple names, for example if two tags are
   * applied to one image.
   * </pre>
   *
   * <code>repeated string names = 3;</code>
   */
  public int getNamesCount() {
    return names_.size();
  }
  /**
   * <pre>
   * Related artifact names. This may be the path to a binary or jar file, or in
   * the case of a container build, the name used to push the container image to
   * Google Container Registry, as presented to `docker push`. Note that a
   * single Artifact ID can have multiple names, for example if two tags are
   * applied to one image.
   * </pre>
   *
   * <code>repeated string names = 3;</code>
   */
  public java.lang.String getNames(int index) {
    return names_.get(index);
  }
  /**
   * <pre>
   * Related artifact names. This may be the path to a binary or jar file, or in
   * the case of a container build, the name used to push the container image to
   * Google Container Registry, as presented to `docker push`. Note that a
   * single Artifact ID can have multiple names, for example if two tags are
   * applied to one image.
   * </pre>
   *
   * <code>repeated string names = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNamesBytes(int index) {
    return names_.getByteString(index);
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
    if (!getChecksumBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, checksum_);
    }
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, id_);
    }
    for (int i = 0; i < names_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, names_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getChecksumBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, checksum_);
    }
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, id_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < names_.size(); i++) {
        dataSize += computeStringSizeNoTag(names_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNamesList().size();
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
    if (!(obj instanceof io.grafeas.v1beta1.provenance.Artifact)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.provenance.Artifact other = (io.grafeas.v1beta1.provenance.Artifact) obj;

    if (!getChecksum()
        .equals(other.getChecksum())) return false;
    if (!getId()
        .equals(other.getId())) return false;
    if (!getNamesList()
        .equals(other.getNamesList())) return false;
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
    hash = (37 * hash) + CHECKSUM_FIELD_NUMBER;
    hash = (53 * hash) + getChecksum().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (getNamesCount() > 0) {
      hash = (37 * hash) + NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getNamesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.provenance.Artifact parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.provenance.Artifact parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.provenance.Artifact parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.provenance.Artifact parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.provenance.Artifact parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.provenance.Artifact parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.provenance.Artifact parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.provenance.Artifact parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.provenance.Artifact parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.provenance.Artifact parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.provenance.Artifact parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.provenance.Artifact parseFrom(
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
  public static Builder newBuilder(io.grafeas.v1beta1.provenance.Artifact prototype) {
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
   * Artifact describes a build product.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.provenance.Artifact}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.provenance.Artifact)
      io.grafeas.v1beta1.provenance.ArtifactOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grafeas.v1beta1.provenance.Provenance.internal_static_grafeas_v1beta1_provenance_Artifact_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.provenance.Provenance.internal_static_grafeas_v1beta1_provenance_Artifact_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.provenance.Artifact.class, io.grafeas.v1beta1.provenance.Artifact.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.provenance.Artifact.newBuilder()
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
      checksum_ = "";

      id_ = "";

      names_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grafeas.v1beta1.provenance.Provenance.internal_static_grafeas_v1beta1_provenance_Artifact_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.provenance.Artifact getDefaultInstanceForType() {
      return io.grafeas.v1beta1.provenance.Artifact.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.provenance.Artifact build() {
      io.grafeas.v1beta1.provenance.Artifact result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.provenance.Artifact buildPartial() {
      io.grafeas.v1beta1.provenance.Artifact result = new io.grafeas.v1beta1.provenance.Artifact(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.checksum_ = checksum_;
      result.id_ = id_;
      if (((bitField0_ & 0x00000004) != 0)) {
        names_ = names_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.names_ = names_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.grafeas.v1beta1.provenance.Artifact) {
        return mergeFrom((io.grafeas.v1beta1.provenance.Artifact)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.provenance.Artifact other) {
      if (other == io.grafeas.v1beta1.provenance.Artifact.getDefaultInstance()) return this;
      if (!other.getChecksum().isEmpty()) {
        checksum_ = other.checksum_;
        onChanged();
      }
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.names_.isEmpty()) {
        if (names_.isEmpty()) {
          names_ = other.names_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureNamesIsMutable();
          names_.addAll(other.names_);
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
      io.grafeas.v1beta1.provenance.Artifact parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.provenance.Artifact) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object checksum_ = "";
    /**
     * <pre>
     * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
     * container.
     * </pre>
     *
     * <code>string checksum = 1;</code>
     */
    public java.lang.String getChecksum() {
      java.lang.Object ref = checksum_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        checksum_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
     * container.
     * </pre>
     *
     * <code>string checksum = 1;</code>
     */
    public com.google.protobuf.ByteString
        getChecksumBytes() {
      java.lang.Object ref = checksum_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        checksum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
     * container.
     * </pre>
     *
     * <code>string checksum = 1;</code>
     */
    public Builder setChecksum(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      checksum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
     * container.
     * </pre>
     *
     * <code>string checksum = 1;</code>
     */
    public Builder clearChecksum() {
      
      checksum_ = getDefaultInstance().getChecksum();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a
     * container.
     * </pre>
     *
     * <code>string checksum = 1;</code>
     */
    public Builder setChecksumBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      checksum_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * Artifact ID, if any; for container images, this will be a URL by digest
     * like `gcr.io/projectID/imagename&#64;sha256:123456`.
     * </pre>
     *
     * <code>string id = 2;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Artifact ID, if any; for container images, this will be a URL by digest
     * like `gcr.io/projectID/imagename&#64;sha256:123456`.
     * </pre>
     *
     * <code>string id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Artifact ID, if any; for container images, this will be a URL by digest
     * like `gcr.io/projectID/imagename&#64;sha256:123456`.
     * </pre>
     *
     * <code>string id = 2;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Artifact ID, if any; for container images, this will be a URL by digest
     * like `gcr.io/projectID/imagename&#64;sha256:123456`.
     * </pre>
     *
     * <code>string id = 2;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Artifact ID, if any; for container images, this will be a URL by digest
     * like `gcr.io/projectID/imagename&#64;sha256:123456`.
     * </pre>
     *
     * <code>string id = 2;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList names_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureNamesIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        names_ = new com.google.protobuf.LazyStringArrayList(names_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * Related artifact names. This may be the path to a binary or jar file, or in
     * the case of a container build, the name used to push the container image to
     * Google Container Registry, as presented to `docker push`. Note that a
     * single Artifact ID can have multiple names, for example if two tags are
     * applied to one image.
     * </pre>
     *
     * <code>repeated string names = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getNamesList() {
      return names_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Related artifact names. This may be the path to a binary or jar file, or in
     * the case of a container build, the name used to push the container image to
     * Google Container Registry, as presented to `docker push`. Note that a
     * single Artifact ID can have multiple names, for example if two tags are
     * applied to one image.
     * </pre>
     *
     * <code>repeated string names = 3;</code>
     */
    public int getNamesCount() {
      return names_.size();
    }
    /**
     * <pre>
     * Related artifact names. This may be the path to a binary or jar file, or in
     * the case of a container build, the name used to push the container image to
     * Google Container Registry, as presented to `docker push`. Note that a
     * single Artifact ID can have multiple names, for example if two tags are
     * applied to one image.
     * </pre>
     *
     * <code>repeated string names = 3;</code>
     */
    public java.lang.String getNames(int index) {
      return names_.get(index);
    }
    /**
     * <pre>
     * Related artifact names. This may be the path to a binary or jar file, or in
     * the case of a container build, the name used to push the container image to
     * Google Container Registry, as presented to `docker push`. Note that a
     * single Artifact ID can have multiple names, for example if two tags are
     * applied to one image.
     * </pre>
     *
     * <code>repeated string names = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNamesBytes(int index) {
      return names_.getByteString(index);
    }
    /**
     * <pre>
     * Related artifact names. This may be the path to a binary or jar file, or in
     * the case of a container build, the name used to push the container image to
     * Google Container Registry, as presented to `docker push`. Note that a
     * single Artifact ID can have multiple names, for example if two tags are
     * applied to one image.
     * </pre>
     *
     * <code>repeated string names = 3;</code>
     */
    public Builder setNames(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNamesIsMutable();
      names_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Related artifact names. This may be the path to a binary or jar file, or in
     * the case of a container build, the name used to push the container image to
     * Google Container Registry, as presented to `docker push`. Note that a
     * single Artifact ID can have multiple names, for example if two tags are
     * applied to one image.
     * </pre>
     *
     * <code>repeated string names = 3;</code>
     */
    public Builder addNames(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNamesIsMutable();
      names_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Related artifact names. This may be the path to a binary or jar file, or in
     * the case of a container build, the name used to push the container image to
     * Google Container Registry, as presented to `docker push`. Note that a
     * single Artifact ID can have multiple names, for example if two tags are
     * applied to one image.
     * </pre>
     *
     * <code>repeated string names = 3;</code>
     */
    public Builder addAllNames(
        java.lang.Iterable<java.lang.String> values) {
      ensureNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, names_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Related artifact names. This may be the path to a binary or jar file, or in
     * the case of a container build, the name used to push the container image to
     * Google Container Registry, as presented to `docker push`. Note that a
     * single Artifact ID can have multiple names, for example if two tags are
     * applied to one image.
     * </pre>
     *
     * <code>repeated string names = 3;</code>
     */
    public Builder clearNames() {
      names_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Related artifact names. This may be the path to a binary or jar file, or in
     * the case of a container build, the name used to push the container image to
     * Google Container Registry, as presented to `docker push`. Note that a
     * single Artifact ID can have multiple names, for example if two tags are
     * applied to one image.
     * </pre>
     *
     * <code>repeated string names = 3;</code>
     */
    public Builder addNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureNamesIsMutable();
      names_.add(value);
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


    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.provenance.Artifact)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.provenance.Artifact)
  private static final io.grafeas.v1beta1.provenance.Artifact DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.provenance.Artifact();
  }

  public static io.grafeas.v1beta1.provenance.Artifact getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Artifact>
      PARSER = new com.google.protobuf.AbstractParser<Artifact>() {
    @java.lang.Override
    public Artifact parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Artifact(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Artifact> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Artifact> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.provenance.Artifact getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

