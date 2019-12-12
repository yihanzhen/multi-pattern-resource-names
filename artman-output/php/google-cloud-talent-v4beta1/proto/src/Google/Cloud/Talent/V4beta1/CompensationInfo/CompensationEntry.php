<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4beta1/common.proto

namespace Google\Cloud\Talent\V4beta1\CompensationInfo;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A compensation entry that represents one component of compensation, such
 * as base pay, bonus, or other compensation type.
 * Annualization: One compensation entry can be annualized if
 * - it contains valid
 * [amount][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.amount]
 * or
 * [range][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.range].
 * - and its
 * [expected_units_per_year][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.expected_units_per_year]
 * is set or can be derived. Its annualized range is determined as
 * ([amount][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.amount]
 * or
 * [range][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.range])
 * times
 * [expected_units_per_year][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.expected_units_per_year].
 *
 * Generated from protobuf message <code>google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry</code>
 */
final class CompensationEntry extends \Google\Protobuf\Internal\Message
{
    /**
     * Compensation type.
     * Default is
     * [CompensationType.COMPENSATION_TYPE_UNSPECIFIED][google.cloud.talent.v4beta1.CompensationInfo.CompensationType.COMPENSATION_TYPE_UNSPECIFIED].
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.CompensationInfo.CompensationType type = 1;</code>
     */
    private $type = 0;
    /**
     * Frequency of the specified amount.
     * Default is
     * [CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED][google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED].
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit unit = 2;</code>
     */
    private $unit = 0;
    /**
     * Compensation description.  For example, could
     * indicate equity terms or provide additional context to an estimated
     * bonus.
     *
     * Generated from protobuf field <code>string description = 5;</code>
     */
    private $description = '';
    /**
     * Expected number of units paid each year. If not specified, when
     * [Job.employment_types][google.cloud.talent.v4beta1.Job.employment_types]
     * is FULLTIME, a default value is inferred based on
     * [unit][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.unit].
     * Default values:
     * - HOURLY: 2080
     * - DAILY: 260
     * - WEEKLY: 52
     * - MONTHLY: 12
     * - ANNUAL: 1
     *
     * Generated from protobuf field <code>.google.protobuf.DoubleValue expected_units_per_year = 6;</code>
     */
    private $expected_units_per_year = null;
    protected $compensation_amount;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $type
     *           Compensation type.
     *           Default is
     *           [CompensationType.COMPENSATION_TYPE_UNSPECIFIED][google.cloud.talent.v4beta1.CompensationInfo.CompensationType.COMPENSATION_TYPE_UNSPECIFIED].
     *     @type int $unit
     *           Frequency of the specified amount.
     *           Default is
     *           [CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED][google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED].
     *     @type \Google\Type\Money $amount
     *           Compensation amount.
     *     @type \Google\Cloud\Talent\V4beta1\CompensationInfo\CompensationRange $range
     *           Compensation range.
     *     @type string $description
     *           Compensation description.  For example, could
     *           indicate equity terms or provide additional context to an estimated
     *           bonus.
     *     @type \Google\Protobuf\DoubleValue $expected_units_per_year
     *           Expected number of units paid each year. If not specified, when
     *           [Job.employment_types][google.cloud.talent.v4beta1.Job.employment_types]
     *           is FULLTIME, a default value is inferred based on
     *           [unit][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.unit].
     *           Default values:
     *           - HOURLY: 2080
     *           - DAILY: 260
     *           - WEEKLY: 52
     *           - MONTHLY: 12
     *           - ANNUAL: 1
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Talent\V4Beta1\Common::initOnce();
        parent::__construct($data);
    }

    /**
     * Compensation type.
     * Default is
     * [CompensationType.COMPENSATION_TYPE_UNSPECIFIED][google.cloud.talent.v4beta1.CompensationInfo.CompensationType.COMPENSATION_TYPE_UNSPECIFIED].
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.CompensationInfo.CompensationType type = 1;</code>
     * @return int
     */
    public function getType()
    {
        return $this->type;
    }

    /**
     * Compensation type.
     * Default is
     * [CompensationType.COMPENSATION_TYPE_UNSPECIFIED][google.cloud.talent.v4beta1.CompensationInfo.CompensationType.COMPENSATION_TYPE_UNSPECIFIED].
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.CompensationInfo.CompensationType type = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setType($var)
    {
        GPBUtil::checkEnum($var, \Google\Cloud\Talent\V4beta1\CompensationInfo_CompensationType::class);
        $this->type = $var;

        return $this;
    }

    /**
     * Frequency of the specified amount.
     * Default is
     * [CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED][google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED].
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit unit = 2;</code>
     * @return int
     */
    public function getUnit()
    {
        return $this->unit;
    }

    /**
     * Frequency of the specified amount.
     * Default is
     * [CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED][google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED].
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit unit = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setUnit($var)
    {
        GPBUtil::checkEnum($var, \Google\Cloud\Talent\V4beta1\CompensationInfo_CompensationUnit::class);
        $this->unit = $var;

        return $this;
    }

    /**
     * Compensation amount.
     *
     * Generated from protobuf field <code>.google.type.Money amount = 3;</code>
     * @return \Google\Type\Money
     */
    public function getAmount()
    {
        return $this->readOneof(3);
    }

    /**
     * Compensation amount.
     *
     * Generated from protobuf field <code>.google.type.Money amount = 3;</code>
     * @param \Google\Type\Money $var
     * @return $this
     */
    public function setAmount($var)
    {
        GPBUtil::checkMessage($var, \Google\Type\Money::class);
        $this->writeOneof(3, $var);

        return $this;
    }

    /**
     * Compensation range.
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.CompensationInfo.CompensationRange range = 4;</code>
     * @return \Google\Cloud\Talent\V4beta1\CompensationInfo\CompensationRange
     */
    public function getRange()
    {
        return $this->readOneof(4);
    }

    /**
     * Compensation range.
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.CompensationInfo.CompensationRange range = 4;</code>
     * @param \Google\Cloud\Talent\V4beta1\CompensationInfo\CompensationRange $var
     * @return $this
     */
    public function setRange($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Talent\V4beta1\CompensationInfo_CompensationRange::class);
        $this->writeOneof(4, $var);

        return $this;
    }

    /**
     * Compensation description.  For example, could
     * indicate equity terms or provide additional context to an estimated
     * bonus.
     *
     * Generated from protobuf field <code>string description = 5;</code>
     * @return string
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * Compensation description.  For example, could
     * indicate equity terms or provide additional context to an estimated
     * bonus.
     *
     * Generated from protobuf field <code>string description = 5;</code>
     * @param string $var
     * @return $this
     */
    public function setDescription($var)
    {
        GPBUtil::checkString($var, True);
        $this->description = $var;

        return $this;
    }

    /**
     * Expected number of units paid each year. If not specified, when
     * [Job.employment_types][google.cloud.talent.v4beta1.Job.employment_types]
     * is FULLTIME, a default value is inferred based on
     * [unit][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.unit].
     * Default values:
     * - HOURLY: 2080
     * - DAILY: 260
     * - WEEKLY: 52
     * - MONTHLY: 12
     * - ANNUAL: 1
     *
     * Generated from protobuf field <code>.google.protobuf.DoubleValue expected_units_per_year = 6;</code>
     * @return \Google\Protobuf\DoubleValue
     */
    public function getExpectedUnitsPerYear()
    {
        return $this->expected_units_per_year;
    }

    /**
     * Returns the unboxed value from <code>getExpectedUnitsPerYear()</code>

     * Expected number of units paid each year. If not specified, when
     * [Job.employment_types][google.cloud.talent.v4beta1.Job.employment_types]
     * is FULLTIME, a default value is inferred based on
     * [unit][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.unit].
     * Default values:
     * - HOURLY: 2080
     * - DAILY: 260
     * - WEEKLY: 52
     * - MONTHLY: 12
     * - ANNUAL: 1
     *
     * Generated from protobuf field <code>.google.protobuf.DoubleValue expected_units_per_year = 6;</code>
     * @return float|null
     */
    public function getExpectedUnitsPerYearUnwrapped()
    {
        $wrapper = $this->getExpectedUnitsPerYear();
        return is_null($wrapper) ? null : $wrapper->getValue();
    }

    /**
     * Expected number of units paid each year. If not specified, when
     * [Job.employment_types][google.cloud.talent.v4beta1.Job.employment_types]
     * is FULLTIME, a default value is inferred based on
     * [unit][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.unit].
     * Default values:
     * - HOURLY: 2080
     * - DAILY: 260
     * - WEEKLY: 52
     * - MONTHLY: 12
     * - ANNUAL: 1
     *
     * Generated from protobuf field <code>.google.protobuf.DoubleValue expected_units_per_year = 6;</code>
     * @param \Google\Protobuf\DoubleValue $var
     * @return $this
     */
    public function setExpectedUnitsPerYear($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\DoubleValue::class);
        $this->expected_units_per_year = $var;

        return $this;
    }

    /**
     * Sets the field by wrapping a primitive type in a Google\Protobuf\DoubleValue object.

     * Expected number of units paid each year. If not specified, when
     * [Job.employment_types][google.cloud.talent.v4beta1.Job.employment_types]
     * is FULLTIME, a default value is inferred based on
     * [unit][google.cloud.talent.v4beta1.CompensationInfo.CompensationEntry.unit].
     * Default values:
     * - HOURLY: 2080
     * - DAILY: 260
     * - WEEKLY: 52
     * - MONTHLY: 12
     * - ANNUAL: 1
     *
     * Generated from protobuf field <code>.google.protobuf.DoubleValue expected_units_per_year = 6;</code>
     * @param float|null $var
     * @return $this
     */
    public function setExpectedUnitsPerYearUnwrapped($var)
    {
        $wrappedVar = is_null($var) ? null : new \Google\Protobuf\DoubleValue(['value' => $var]);
        return $this->setExpectedUnitsPerYear($wrappedVar);
    }

    /**
     * @return string
     */
    public function getCompensationAmount()
    {
        return $this->whichOneof("compensation_amount");
    }

}

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(CompensationEntry::class, \Google\Cloud\Talent\V4beta1\CompensationInfo_CompensationEntry::class);

