// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: olcut_proto.proto

package com.oracle.labs.mlrg.olcut.config.protobuf.protos;

/**
 * <pre>
 *A property map in a component.
 * </pre>
 *
 * Protobuf type {@code olcut.PropertyMapProto}
 */
public final class PropertyMapProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:olcut.PropertyMapProto)
    PropertyMapProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PropertyMapProto.newBuilder() to construct.
  private PropertyMapProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PropertyMapProto() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PropertyMapProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PropertyMapProto(
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

            name_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              elements_ = com.google.protobuf.MapField.newMapField(
                  ElementsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            elements__ = input.readMessage(
                ElementsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            elements_.getMutableMap().put(
                elements__.getKey(), elements__.getValue());
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
    return com.oracle.labs.mlrg.olcut.config.protobuf.protos.OlcutProto.internal_static_olcut_PropertyMapProto_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetElements();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.oracle.labs.mlrg.olcut.config.protobuf.protos.OlcutProto.internal_static_olcut_PropertyMapProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto.class, com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
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
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
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

  public static final int ELEMENTS_FIELD_NUMBER = 2;
  private static final class ElementsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.oracle.labs.mlrg.olcut.config.protobuf.protos.OlcutProto.internal_static_olcut_PropertyMapProto_ElementsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> elements_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetElements() {
    if (elements_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ElementsDefaultEntryHolder.defaultEntry);
    }
    return elements_;
  }

  public int getElementsCount() {
    return internalGetElements().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; elements = 2;</code>
   */

  @java.lang.Override
  public boolean containsElements(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetElements().getMap().containsKey(key);
  }
  /**
   * Use {@link #getElementsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getElements() {
    return getElementsMap();
  }
  /**
   * <code>map&lt;string, string&gt; elements = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getElementsMap() {
    return internalGetElements().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; elements = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getElementsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetElements().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; elements = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getElementsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetElements().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetElements(),
        ElementsDefaultEntryHolder.defaultEntry,
        2);
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
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetElements().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      elements__ = ElementsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, elements__);
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
    if (!(obj instanceof com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto)) {
      return super.equals(obj);
    }
    com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto other = (com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!internalGetElements().equals(
        other.internalGetElements())) return false;
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
    if (!internalGetElements().getMap().isEmpty()) {
      hash = (37 * hash) + ELEMENTS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetElements().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto parseFrom(
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
  public static Builder newBuilder(com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto prototype) {
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
   *A property map in a component.
   * </pre>
   *
   * Protobuf type {@code olcut.PropertyMapProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:olcut.PropertyMapProto)
      com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.oracle.labs.mlrg.olcut.config.protobuf.protos.OlcutProto.internal_static_olcut_PropertyMapProto_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetElements();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableElements();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.oracle.labs.mlrg.olcut.config.protobuf.protos.OlcutProto.internal_static_olcut_PropertyMapProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto.class, com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto.Builder.class);
    }

    // Construct using com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto.newBuilder()
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

      internalGetMutableElements().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.oracle.labs.mlrg.olcut.config.protobuf.protos.OlcutProto.internal_static_olcut_PropertyMapProto_descriptor;
    }

    @java.lang.Override
    public com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto getDefaultInstanceForType() {
      return com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto build() {
      com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto buildPartial() {
      com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto result = new com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.elements_ = internalGetElements();
      result.elements_.makeImmutable();
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
      if (other instanceof com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto) {
        return mergeFrom((com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto other) {
      if (other == com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      internalGetMutableElements().mergeFrom(
          other.internalGetElements());
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
      com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
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
     * <code>string name = 1;</code>
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
     * <code>string name = 1;</code>
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
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
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

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> elements_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetElements() {
      if (elements_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ElementsDefaultEntryHolder.defaultEntry);
      }
      return elements_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableElements() {
      onChanged();;
      if (elements_ == null) {
        elements_ = com.google.protobuf.MapField.newMapField(
            ElementsDefaultEntryHolder.defaultEntry);
      }
      if (!elements_.isMutable()) {
        elements_ = elements_.copy();
      }
      return elements_;
    }

    public int getElementsCount() {
      return internalGetElements().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; elements = 2;</code>
     */

    @java.lang.Override
    public boolean containsElements(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetElements().getMap().containsKey(key);
    }
    /**
     * Use {@link #getElementsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getElements() {
      return getElementsMap();
    }
    /**
     * <code>map&lt;string, string&gt; elements = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getElementsMap() {
      return internalGetElements().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; elements = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getElementsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetElements().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; elements = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getElementsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetElements().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearElements() {
      internalGetMutableElements().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; elements = 2;</code>
     */

    public Builder removeElements(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableElements().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableElements() {
      return internalGetMutableElements().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; elements = 2;</code>
     */
    public Builder putElements(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableElements().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; elements = 2;</code>
     */

    public Builder putAllElements(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableElements().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:olcut.PropertyMapProto)
  }

  // @@protoc_insertion_point(class_scope:olcut.PropertyMapProto)
  private static final com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto();
  }

  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PropertyMapProto>
      PARSER = new com.google.protobuf.AbstractParser<PropertyMapProto>() {
    @java.lang.Override
    public PropertyMapProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PropertyMapProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PropertyMapProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PropertyMapProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyMapProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

