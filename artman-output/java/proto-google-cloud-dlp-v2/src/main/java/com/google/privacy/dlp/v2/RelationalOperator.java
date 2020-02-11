// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Operators available for comparing the value of fields.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2.RelationalOperator}
 */
public enum RelationalOperator
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unused
   * </pre>
   *
   * <code>RELATIONAL_OPERATOR_UNSPECIFIED = 0;</code>
   */
  RELATIONAL_OPERATOR_UNSPECIFIED(0),
  /**
   * <pre>
   * Equal. Attempts to match even with incompatible types.
   * </pre>
   *
   * <code>EQUAL_TO = 1;</code>
   */
  EQUAL_TO(1),
  /**
   * <pre>
   * Not equal to. Attempts to match even with incompatible types.
   * </pre>
   *
   * <code>NOT_EQUAL_TO = 2;</code>
   */
  NOT_EQUAL_TO(2),
  /**
   * <pre>
   * Greater than.
   * </pre>
   *
   * <code>GREATER_THAN = 3;</code>
   */
  GREATER_THAN(3),
  /**
   * <pre>
   * Less than.
   * </pre>
   *
   * <code>LESS_THAN = 4;</code>
   */
  LESS_THAN(4),
  /**
   * <pre>
   * Greater than or equals.
   * </pre>
   *
   * <code>GREATER_THAN_OR_EQUALS = 5;</code>
   */
  GREATER_THAN_OR_EQUALS(5),
  /**
   * <pre>
   * Less than or equals.
   * </pre>
   *
   * <code>LESS_THAN_OR_EQUALS = 6;</code>
   */
  LESS_THAN_OR_EQUALS(6),
  /**
   * <pre>
   * Exists
   * </pre>
   *
   * <code>EXISTS = 7;</code>
   */
  EXISTS(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unused
   * </pre>
   *
   * <code>RELATIONAL_OPERATOR_UNSPECIFIED = 0;</code>
   */
  public static final int RELATIONAL_OPERATOR_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Equal. Attempts to match even with incompatible types.
   * </pre>
   *
   * <code>EQUAL_TO = 1;</code>
   */
  public static final int EQUAL_TO_VALUE = 1;
  /**
   * <pre>
   * Not equal to. Attempts to match even with incompatible types.
   * </pre>
   *
   * <code>NOT_EQUAL_TO = 2;</code>
   */
  public static final int NOT_EQUAL_TO_VALUE = 2;
  /**
   * <pre>
   * Greater than.
   * </pre>
   *
   * <code>GREATER_THAN = 3;</code>
   */
  public static final int GREATER_THAN_VALUE = 3;
  /**
   * <pre>
   * Less than.
   * </pre>
   *
   * <code>LESS_THAN = 4;</code>
   */
  public static final int LESS_THAN_VALUE = 4;
  /**
   * <pre>
   * Greater than or equals.
   * </pre>
   *
   * <code>GREATER_THAN_OR_EQUALS = 5;</code>
   */
  public static final int GREATER_THAN_OR_EQUALS_VALUE = 5;
  /**
   * <pre>
   * Less than or equals.
   * </pre>
   *
   * <code>LESS_THAN_OR_EQUALS = 6;</code>
   */
  public static final int LESS_THAN_OR_EQUALS_VALUE = 6;
  /**
   * <pre>
   * Exists
   * </pre>
   *
   * <code>EXISTS = 7;</code>
   */
  public static final int EXISTS_VALUE = 7;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static RelationalOperator valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RelationalOperator forNumber(int value) {
    switch (value) {
      case 0: return RELATIONAL_OPERATOR_UNSPECIFIED;
      case 1: return EQUAL_TO;
      case 2: return NOT_EQUAL_TO;
      case 3: return GREATER_THAN;
      case 4: return LESS_THAN;
      case 5: return GREATER_THAN_OR_EQUALS;
      case 6: return LESS_THAN_OR_EQUALS;
      case 7: return EXISTS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RelationalOperator>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RelationalOperator> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RelationalOperator>() {
          public RelationalOperator findValueByNumber(int number) {
            return RelationalOperator.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final RelationalOperator[] VALUES = values();

  public static RelationalOperator valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private RelationalOperator(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.RelationalOperator)
}

