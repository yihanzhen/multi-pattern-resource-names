// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

/**
 * <pre>
 * Security related configuration, including Kerberos.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.SecurityConfig}
 */
public  final class SecurityConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.SecurityConfig)
    SecurityConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SecurityConfig.newBuilder() to construct.
  private SecurityConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SecurityConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SecurityConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SecurityConfig(
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
            com.google.cloud.dataproc.v1.KerberosConfig.Builder subBuilder = null;
            if (kerberosConfig_ != null) {
              subBuilder = kerberosConfig_.toBuilder();
            }
            kerberosConfig_ = input.readMessage(com.google.cloud.dataproc.v1.KerberosConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(kerberosConfig_);
              kerberosConfig_ = subBuilder.buildPartial();
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
    return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_SecurityConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_SecurityConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.SecurityConfig.class, com.google.cloud.dataproc.v1.SecurityConfig.Builder.class);
  }

  public static final int KERBEROS_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.dataproc.v1.KerberosConfig kerberosConfig_;
  /**
   * <pre>
   * Kerberos related configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1;</code>
   * @return Whether the kerberosConfig field is set.
   */
  public boolean hasKerberosConfig() {
    return kerberosConfig_ != null;
  }
  /**
   * <pre>
   * Kerberos related configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1;</code>
   * @return The kerberosConfig.
   */
  public com.google.cloud.dataproc.v1.KerberosConfig getKerberosConfig() {
    return kerberosConfig_ == null ? com.google.cloud.dataproc.v1.KerberosConfig.getDefaultInstance() : kerberosConfig_;
  }
  /**
   * <pre>
   * Kerberos related configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1;</code>
   */
  public com.google.cloud.dataproc.v1.KerberosConfigOrBuilder getKerberosConfigOrBuilder() {
    return getKerberosConfig();
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
    if (kerberosConfig_ != null) {
      output.writeMessage(1, getKerberosConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kerberosConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKerberosConfig());
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.SecurityConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.SecurityConfig other = (com.google.cloud.dataproc.v1.SecurityConfig) obj;

    if (hasKerberosConfig() != other.hasKerberosConfig()) return false;
    if (hasKerberosConfig()) {
      if (!getKerberosConfig()
          .equals(other.getKerberosConfig())) return false;
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
    if (hasKerberosConfig()) {
      hash = (37 * hash) + KERBEROS_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getKerberosConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.SecurityConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.SecurityConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.SecurityConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.SecurityConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.SecurityConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.SecurityConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.SecurityConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.SecurityConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.SecurityConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.SecurityConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.SecurityConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.SecurityConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1.SecurityConfig prototype) {
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
   * Security related configuration, including Kerberos.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.SecurityConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.SecurityConfig)
      com.google.cloud.dataproc.v1.SecurityConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_SecurityConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_SecurityConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.SecurityConfig.class, com.google.cloud.dataproc.v1.SecurityConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.SecurityConfig.newBuilder()
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
      if (kerberosConfigBuilder_ == null) {
        kerberosConfig_ = null;
      } else {
        kerberosConfig_ = null;
        kerberosConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_SecurityConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.SecurityConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.SecurityConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.SecurityConfig build() {
      com.google.cloud.dataproc.v1.SecurityConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.SecurityConfig buildPartial() {
      com.google.cloud.dataproc.v1.SecurityConfig result = new com.google.cloud.dataproc.v1.SecurityConfig(this);
      if (kerberosConfigBuilder_ == null) {
        result.kerberosConfig_ = kerberosConfig_;
      } else {
        result.kerberosConfig_ = kerberosConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.dataproc.v1.SecurityConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1.SecurityConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.SecurityConfig other) {
      if (other == com.google.cloud.dataproc.v1.SecurityConfig.getDefaultInstance()) return this;
      if (other.hasKerberosConfig()) {
        mergeKerberosConfig(other.getKerberosConfig());
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
      com.google.cloud.dataproc.v1.SecurityConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1.SecurityConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.dataproc.v1.KerberosConfig kerberosConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataproc.v1.KerberosConfig, com.google.cloud.dataproc.v1.KerberosConfig.Builder, com.google.cloud.dataproc.v1.KerberosConfigOrBuilder> kerberosConfigBuilder_;
    /**
     * <pre>
     * Kerberos related configuration.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1;</code>
     * @return Whether the kerberosConfig field is set.
     */
    public boolean hasKerberosConfig() {
      return kerberosConfigBuilder_ != null || kerberosConfig_ != null;
    }
    /**
     * <pre>
     * Kerberos related configuration.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1;</code>
     * @return The kerberosConfig.
     */
    public com.google.cloud.dataproc.v1.KerberosConfig getKerberosConfig() {
      if (kerberosConfigBuilder_ == null) {
        return kerberosConfig_ == null ? com.google.cloud.dataproc.v1.KerberosConfig.getDefaultInstance() : kerberosConfig_;
      } else {
        return kerberosConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Kerberos related configuration.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1;</code>
     */
    public Builder setKerberosConfig(com.google.cloud.dataproc.v1.KerberosConfig value) {
      if (kerberosConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kerberosConfig_ = value;
        onChanged();
      } else {
        kerberosConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Kerberos related configuration.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1;</code>
     */
    public Builder setKerberosConfig(
        com.google.cloud.dataproc.v1.KerberosConfig.Builder builderForValue) {
      if (kerberosConfigBuilder_ == null) {
        kerberosConfig_ = builderForValue.build();
        onChanged();
      } else {
        kerberosConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Kerberos related configuration.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1;</code>
     */
    public Builder mergeKerberosConfig(com.google.cloud.dataproc.v1.KerberosConfig value) {
      if (kerberosConfigBuilder_ == null) {
        if (kerberosConfig_ != null) {
          kerberosConfig_ =
            com.google.cloud.dataproc.v1.KerberosConfig.newBuilder(kerberosConfig_).mergeFrom(value).buildPartial();
        } else {
          kerberosConfig_ = value;
        }
        onChanged();
      } else {
        kerberosConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Kerberos related configuration.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1;</code>
     */
    public Builder clearKerberosConfig() {
      if (kerberosConfigBuilder_ == null) {
        kerberosConfig_ = null;
        onChanged();
      } else {
        kerberosConfig_ = null;
        kerberosConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Kerberos related configuration.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1;</code>
     */
    public com.google.cloud.dataproc.v1.KerberosConfig.Builder getKerberosConfigBuilder() {
      
      onChanged();
      return getKerberosConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Kerberos related configuration.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1;</code>
     */
    public com.google.cloud.dataproc.v1.KerberosConfigOrBuilder getKerberosConfigOrBuilder() {
      if (kerberosConfigBuilder_ != null) {
        return kerberosConfigBuilder_.getMessageOrBuilder();
      } else {
        return kerberosConfig_ == null ?
            com.google.cloud.dataproc.v1.KerberosConfig.getDefaultInstance() : kerberosConfig_;
      }
    }
    /**
     * <pre>
     * Kerberos related configuration.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.KerberosConfig kerberos_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataproc.v1.KerberosConfig, com.google.cloud.dataproc.v1.KerberosConfig.Builder, com.google.cloud.dataproc.v1.KerberosConfigOrBuilder> 
        getKerberosConfigFieldBuilder() {
      if (kerberosConfigBuilder_ == null) {
        kerberosConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.KerberosConfig, com.google.cloud.dataproc.v1.KerberosConfig.Builder, com.google.cloud.dataproc.v1.KerberosConfigOrBuilder>(
                getKerberosConfig(),
                getParentForChildren(),
                isClean());
        kerberosConfig_ = null;
      }
      return kerberosConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.SecurityConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.SecurityConfig)
  private static final com.google.cloud.dataproc.v1.SecurityConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.SecurityConfig();
  }

  public static com.google.cloud.dataproc.v1.SecurityConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityConfig>
      PARSER = new com.google.protobuf.AbstractParser<SecurityConfig>() {
    @java.lang.Override
    public SecurityConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SecurityConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SecurityConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.SecurityConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

