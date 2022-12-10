// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: olcut_proto.proto

package com.oracle.labs.mlrg.olcut.config.protobuf.protos;

/**
 * <pre>
 *A property list in a component.
 * </pre>
 *
 * Protobuf type {@code olcut.PropertyListProto}
 */
public final class PropertyListProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:olcut.PropertyListProto)
    PropertyListProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PropertyListProto.newBuilder() to construct.
  private PropertyListProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PropertyListProto() {
    name_ = "";
    item_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    type_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PropertyListProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PropertyListProto(
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              item_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            item_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              type_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            type_.add(s);
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
        item_ = item_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        type_ = type_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.oracle.labs.mlrg.olcut.config.protobuf.protos.OlcutProto.internal_static_olcut_PropertyListProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.oracle.labs.mlrg.olcut.config.protobuf.protos.OlcutProto.internal_static_olcut_PropertyListProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto.class, com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto.Builder.class);
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

  public static final int ITEM_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList item_;
  /**
   * <code>repeated string item = 2;</code>
   * @return A list containing the item.
   */
  public com.google.protobuf.ProtocolStringList
      getItemList() {
    return item_;
  }
  /**
   * <code>repeated string item = 2;</code>
   * @return The count of item.
   */
  public int getItemCount() {
    return item_.size();
  }
  /**
   * <code>repeated string item = 2;</code>
   * @param index The index of the element to return.
   * @return The item at the given index.
   */
  public java.lang.String getItem(int index) {
    return item_.get(index);
  }
  /**
   * <code>repeated string item = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the item at the given index.
   */
  public com.google.protobuf.ByteString
      getItemBytes(int index) {
    return item_.getByteString(index);
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList type_;
  /**
   * <code>repeated string type = 3;</code>
   * @return A list containing the type.
   */
  public com.google.protobuf.ProtocolStringList
      getTypeList() {
    return type_;
  }
  /**
   * <code>repeated string type = 3;</code>
   * @return The count of type.
   */
  public int getTypeCount() {
    return type_.size();
  }
  /**
   * <code>repeated string type = 3;</code>
   * @param index The index of the element to return.
   * @return The type at the given index.
   */
  public java.lang.String getType(int index) {
    return type_.get(index);
  }
  /**
   * <code>repeated string type = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the type at the given index.
   */
  public com.google.protobuf.ByteString
      getTypeBytes(int index) {
    return type_.getByteString(index);
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
    for (int i = 0; i < item_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, item_.getRaw(i));
    }
    for (int i = 0; i < type_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_.getRaw(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < item_.size(); i++) {
        dataSize += computeStringSizeNoTag(item_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getItemList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < type_.size(); i++) {
        dataSize += computeStringSizeNoTag(type_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTypeList().size();
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
    if (!(obj instanceof com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto)) {
      return super.equals(obj);
    }
    com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto other = (com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getItemList()
        .equals(other.getItemList())) return false;
    if (!getTypeList()
        .equals(other.getTypeList())) return false;
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
    if (getItemCount() > 0) {
      hash = (37 * hash) + ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getItemList().hashCode();
    }
    if (getTypeCount() > 0) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getTypeList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto parseFrom(
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
  public static Builder newBuilder(com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto prototype) {
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
   *A property list in a component.
   * </pre>
   *
   * Protobuf type {@code olcut.PropertyListProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:olcut.PropertyListProto)
      com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.oracle.labs.mlrg.olcut.config.protobuf.protos.OlcutProto.internal_static_olcut_PropertyListProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.oracle.labs.mlrg.olcut.config.protobuf.protos.OlcutProto.internal_static_olcut_PropertyListProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto.class, com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto.Builder.class);
    }

    // Construct using com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto.newBuilder()
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

      item_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.oracle.labs.mlrg.olcut.config.protobuf.protos.OlcutProto.internal_static_olcut_PropertyListProto_descriptor;
    }

    @java.lang.Override
    public com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto getDefaultInstanceForType() {
      return com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto build() {
      com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto buildPartial() {
      com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto result = new com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      if (((bitField0_ & 0x00000001) != 0)) {
        item_ = item_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.item_ = item_;
      if (((bitField0_ & 0x00000002) != 0)) {
        type_ = type_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.type_ = type_;
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
      if (other instanceof com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto) {
        return mergeFrom((com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto other) {
      if (other == com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.item_.isEmpty()) {
        if (item_.isEmpty()) {
          item_ = other.item_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureItemIsMutable();
          item_.addAll(other.item_);
        }
        onChanged();
      }
      if (!other.type_.isEmpty()) {
        if (type_.isEmpty()) {
          type_ = other.type_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureTypeIsMutable();
          type_.addAll(other.type_);
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
      com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto) e.getUnfinishedMessage();
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

    private com.google.protobuf.LazyStringList item_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureItemIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        item_ = new com.google.protobuf.LazyStringArrayList(item_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string item = 2;</code>
     * @return A list containing the item.
     */
    public com.google.protobuf.ProtocolStringList
        getItemList() {
      return item_.getUnmodifiableView();
    }
    /**
     * <code>repeated string item = 2;</code>
     * @return The count of item.
     */
    public int getItemCount() {
      return item_.size();
    }
    /**
     * <code>repeated string item = 2;</code>
     * @param index The index of the element to return.
     * @return The item at the given index.
     */
    public java.lang.String getItem(int index) {
      return item_.get(index);
    }
    /**
     * <code>repeated string item = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the item at the given index.
     */
    public com.google.protobuf.ByteString
        getItemBytes(int index) {
      return item_.getByteString(index);
    }
    /**
     * <code>repeated string item = 2;</code>
     * @param index The index to set the value at.
     * @param value The item to set.
     * @return This builder for chaining.
     */
    public Builder setItem(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureItemIsMutable();
      item_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string item = 2;</code>
     * @param value The item to add.
     * @return This builder for chaining.
     */
    public Builder addItem(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureItemIsMutable();
      item_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string item = 2;</code>
     * @param values The item to add.
     * @return This builder for chaining.
     */
    public Builder addAllItem(
        java.lang.Iterable<java.lang.String> values) {
      ensureItemIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, item_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string item = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearItem() {
      item_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string item = 2;</code>
     * @param value The bytes of the item to add.
     * @return This builder for chaining.
     */
    public Builder addItemBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureItemIsMutable();
      item_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList type_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTypeIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        type_ = new com.google.protobuf.LazyStringArrayList(type_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string type = 3;</code>
     * @return A list containing the type.
     */
    public com.google.protobuf.ProtocolStringList
        getTypeList() {
      return type_.getUnmodifiableView();
    }
    /**
     * <code>repeated string type = 3;</code>
     * @return The count of type.
     */
    public int getTypeCount() {
      return type_.size();
    }
    /**
     * <code>repeated string type = 3;</code>
     * @param index The index of the element to return.
     * @return The type at the given index.
     */
    public java.lang.String getType(int index) {
      return type_.get(index);
    }
    /**
     * <code>repeated string type = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the type at the given index.
     */
    public com.google.protobuf.ByteString
        getTypeBytes(int index) {
      return type_.getByteString(index);
    }
    /**
     * <code>repeated string type = 3;</code>
     * @param index The index to set the value at.
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTypeIsMutable();
      type_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string type = 3;</code>
     * @param value The type to add.
     * @return This builder for chaining.
     */
    public Builder addType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTypeIsMutable();
      type_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string type = 3;</code>
     * @param values The type to add.
     * @return This builder for chaining.
     */
    public Builder addAllType(
        java.lang.Iterable<java.lang.String> values) {
      ensureTypeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, type_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string type = 3;</code>
     * @param value The bytes of the type to add.
     * @return This builder for chaining.
     */
    public Builder addTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTypeIsMutable();
      type_.add(value);
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


    // @@protoc_insertion_point(builder_scope:olcut.PropertyListProto)
  }

  // @@protoc_insertion_point(class_scope:olcut.PropertyListProto)
  private static final com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto();
  }

  public static com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PropertyListProto>
      PARSER = new com.google.protobuf.AbstractParser<PropertyListProto>() {
    @java.lang.Override
    public PropertyListProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PropertyListProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PropertyListProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PropertyListProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.oracle.labs.mlrg.olcut.config.protobuf.protos.PropertyListProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
