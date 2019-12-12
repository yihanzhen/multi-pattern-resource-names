<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4beta1/filters.proto

namespace Google\Cloud\Talent\V4beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Filter on person name.
 *
 * Generated from protobuf message <code>google.cloud.talent.v4beta1.PersonNameFilter</code>
 */
final class PersonNameFilter extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. The person name. For example, "John Smith".
     * Can be any combination of [PersonName.structured_name.given_name][],
     * [PersonName.structured_name.middle_initial][],
     * [PersonName.structured_name.family_name][], and
     * [PersonName.formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name].
     *
     * Generated from protobuf field <code>string person_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private $person_name = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $person_name
     *           Required. The person name. For example, "John Smith".
     *           Can be any combination of [PersonName.structured_name.given_name][],
     *           [PersonName.structured_name.middle_initial][],
     *           [PersonName.structured_name.family_name][], and
     *           [PersonName.formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name].
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Talent\V4Beta1\Filters::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. The person name. For example, "John Smith".
     * Can be any combination of [PersonName.structured_name.given_name][],
     * [PersonName.structured_name.middle_initial][],
     * [PersonName.structured_name.family_name][], and
     * [PersonName.formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name].
     *
     * Generated from protobuf field <code>string person_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return string
     */
    public function getPersonName()
    {
        return $this->person_name;
    }

    /**
     * Required. The person name. For example, "John Smith".
     * Can be any combination of [PersonName.structured_name.given_name][],
     * [PersonName.structured_name.middle_initial][],
     * [PersonName.structured_name.family_name][], and
     * [PersonName.formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name].
     *
     * Generated from protobuf field <code>string person_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param string $var
     * @return $this
     */
    public function setPersonName($var)
    {
        GPBUtil::checkString($var, True);
        $this->person_name = $var;

        return $this;
    }

}

