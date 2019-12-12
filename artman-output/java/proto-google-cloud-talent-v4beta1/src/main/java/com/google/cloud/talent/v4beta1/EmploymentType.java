// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

/**
 * <pre>
 * An enum that represents the employment type of a job.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.talent.v4beta1.EmploymentType}
 */
public enum EmploymentType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The default value if the employment type isn't specified.
   * </pre>
   *
   * <code>EMPLOYMENT_TYPE_UNSPECIFIED = 0;</code>
   */
  EMPLOYMENT_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * The job requires working a number of hours that constitute full
   * time employment, typically 40 or more hours per week.
   * </pre>
   *
   * <code>FULL_TIME = 1;</code>
   */
  FULL_TIME(1),
  /**
   * <pre>
   * The job entails working fewer hours than a full time job,
   * typically less than 40 hours a week.
   * </pre>
   *
   * <code>PART_TIME = 2;</code>
   */
  PART_TIME(2),
  /**
   * <pre>
   * The job is offered as a contracted, as opposed to a salaried employee,
   * position.
   * </pre>
   *
   * <code>CONTRACTOR = 3;</code>
   */
  CONTRACTOR(3),
  /**
   * <pre>
   * The job is offered as a contracted position with the understanding
   * that it's converted into a full-time position at the end of the
   * contract. Jobs of this type are also returned by a search for
   * [EmploymentType.CONTRACTOR][google.cloud.talent.v4beta1.EmploymentType.CONTRACTOR]
   * jobs.
   * </pre>
   *
   * <code>CONTRACT_TO_HIRE = 4;</code>
   */
  CONTRACT_TO_HIRE(4),
  /**
   * <pre>
   * The job is offered as a temporary employment opportunity, usually
   * a short-term engagement.
   * </pre>
   *
   * <code>TEMPORARY = 5;</code>
   */
  TEMPORARY(5),
  /**
   * <pre>
   * The job is a fixed-term opportunity for students or entry-level job
   * seekers to obtain on-the-job training, typically offered as a summer
   * position.
   * </pre>
   *
   * <code>INTERN = 6;</code>
   */
  INTERN(6),
  /**
   * <pre>
   * The is an opportunity for an individual to volunteer, where there's no
   * expectation of compensation for the provided services.
   * </pre>
   *
   * <code>VOLUNTEER = 7;</code>
   */
  VOLUNTEER(7),
  /**
   * <pre>
   * The job requires an employee to work on an as-needed basis with a
   * flexible schedule.
   * </pre>
   *
   * <code>PER_DIEM = 8;</code>
   */
  PER_DIEM(8),
  /**
   * <pre>
   * The job involves employing people in remote areas and flying them
   * temporarily to the work site instead of relocating employees and their
   * families permanently.
   * </pre>
   *
   * <code>FLY_IN_FLY_OUT = 9;</code>
   */
  FLY_IN_FLY_OUT(9),
  /**
   * <pre>
   * The job does not fit any of the other listed types.
   * </pre>
   *
   * <code>OTHER_EMPLOYMENT_TYPE = 10;</code>
   */
  OTHER_EMPLOYMENT_TYPE(10),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The default value if the employment type isn't specified.
   * </pre>
   *
   * <code>EMPLOYMENT_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int EMPLOYMENT_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * The job requires working a number of hours that constitute full
   * time employment, typically 40 or more hours per week.
   * </pre>
   *
   * <code>FULL_TIME = 1;</code>
   */
  public static final int FULL_TIME_VALUE = 1;
  /**
   * <pre>
   * The job entails working fewer hours than a full time job,
   * typically less than 40 hours a week.
   * </pre>
   *
   * <code>PART_TIME = 2;</code>
   */
  public static final int PART_TIME_VALUE = 2;
  /**
   * <pre>
   * The job is offered as a contracted, as opposed to a salaried employee,
   * position.
   * </pre>
   *
   * <code>CONTRACTOR = 3;</code>
   */
  public static final int CONTRACTOR_VALUE = 3;
  /**
   * <pre>
   * The job is offered as a contracted position with the understanding
   * that it's converted into a full-time position at the end of the
   * contract. Jobs of this type are also returned by a search for
   * [EmploymentType.CONTRACTOR][google.cloud.talent.v4beta1.EmploymentType.CONTRACTOR]
   * jobs.
   * </pre>
   *
   * <code>CONTRACT_TO_HIRE = 4;</code>
   */
  public static final int CONTRACT_TO_HIRE_VALUE = 4;
  /**
   * <pre>
   * The job is offered as a temporary employment opportunity, usually
   * a short-term engagement.
   * </pre>
   *
   * <code>TEMPORARY = 5;</code>
   */
  public static final int TEMPORARY_VALUE = 5;
  /**
   * <pre>
   * The job is a fixed-term opportunity for students or entry-level job
   * seekers to obtain on-the-job training, typically offered as a summer
   * position.
   * </pre>
   *
   * <code>INTERN = 6;</code>
   */
  public static final int INTERN_VALUE = 6;
  /**
   * <pre>
   * The is an opportunity for an individual to volunteer, where there's no
   * expectation of compensation for the provided services.
   * </pre>
   *
   * <code>VOLUNTEER = 7;</code>
   */
  public static final int VOLUNTEER_VALUE = 7;
  /**
   * <pre>
   * The job requires an employee to work on an as-needed basis with a
   * flexible schedule.
   * </pre>
   *
   * <code>PER_DIEM = 8;</code>
   */
  public static final int PER_DIEM_VALUE = 8;
  /**
   * <pre>
   * The job involves employing people in remote areas and flying them
   * temporarily to the work site instead of relocating employees and their
   * families permanently.
   * </pre>
   *
   * <code>FLY_IN_FLY_OUT = 9;</code>
   */
  public static final int FLY_IN_FLY_OUT_VALUE = 9;
  /**
   * <pre>
   * The job does not fit any of the other listed types.
   * </pre>
   *
   * <code>OTHER_EMPLOYMENT_TYPE = 10;</code>
   */
  public static final int OTHER_EMPLOYMENT_TYPE_VALUE = 10;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static EmploymentType valueOf(int value) {
    return forNumber(value);
  }

  public static EmploymentType forNumber(int value) {
    switch (value) {
      case 0: return EMPLOYMENT_TYPE_UNSPECIFIED;
      case 1: return FULL_TIME;
      case 2: return PART_TIME;
      case 3: return CONTRACTOR;
      case 4: return CONTRACT_TO_HIRE;
      case 5: return TEMPORARY;
      case 6: return INTERN;
      case 7: return VOLUNTEER;
      case 8: return PER_DIEM;
      case 9: return FLY_IN_FLY_OUT;
      case 10: return OTHER_EMPLOYMENT_TYPE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EmploymentType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EmploymentType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EmploymentType>() {
          public EmploymentType findValueByNumber(int number) {
            return EmploymentType.forNumber(number);
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
    return com.google.cloud.talent.v4beta1.CommonProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final EmploymentType[] VALUES = values();

  public static EmploymentType valueOf(
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

  private EmploymentType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.talent.v4beta1.EmploymentType)
}
