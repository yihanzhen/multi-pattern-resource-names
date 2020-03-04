<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4beta1/profile.proto

namespace Google\Cloud\Talent\V4beta1\PersonName;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Resource that represents a person's structured name.
 *
 * Generated from protobuf message <code>google.cloud.talent.v4beta1.PersonName.PersonStructuredName</code>
 */
class PersonStructuredName extends \Google\Protobuf\Internal\Message
{
    /**
     * Given/first name.
     * It's derived from [formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name] if not provided.
     * Number of characters allowed is 100.
     *
     * Generated from protobuf field <code>string given_name = 1;</code>
     */
    protected $given_name = '';
    /**
     * Preferred given/first name or nickname.
     * Number of characters allowed is 100.
     *
     * Generated from protobuf field <code>string preferred_name = 6;</code>
     */
    protected $preferred_name = '';
    /**
     * Middle initial.
     * It's derived from [formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name] if not provided.
     * Number of characters allowed is 20.
     *
     * Generated from protobuf field <code>string middle_initial = 2;</code>
     */
    protected $middle_initial = '';
    /**
     * Family/last name.
     * It's derived from [formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name] if not provided.
     * Number of characters allowed is 100.
     *
     * Generated from protobuf field <code>string family_name = 3;</code>
     */
    protected $family_name = '';
    /**
     * Suffixes.
     * Number of characters allowed is 20.
     *
     * Generated from protobuf field <code>repeated string suffixes = 4;</code>
     */
    private $suffixes;
    /**
     * Prefixes.
     * Number of characters allowed is 20.
     *
     * Generated from protobuf field <code>repeated string prefixes = 5;</code>
     */
    private $prefixes;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $given_name
     *           Given/first name.
     *           It's derived from [formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name] if not provided.
     *           Number of characters allowed is 100.
     *     @type string $preferred_name
     *           Preferred given/first name or nickname.
     *           Number of characters allowed is 100.
     *     @type string $middle_initial
     *           Middle initial.
     *           It's derived from [formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name] if not provided.
     *           Number of characters allowed is 20.
     *     @type string $family_name
     *           Family/last name.
     *           It's derived from [formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name] if not provided.
     *           Number of characters allowed is 100.
     *     @type string[]|\Google\Protobuf\Internal\RepeatedField $suffixes
     *           Suffixes.
     *           Number of characters allowed is 20.
     *     @type string[]|\Google\Protobuf\Internal\RepeatedField $prefixes
     *           Prefixes.
     *           Number of characters allowed is 20.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Talent\V4Beta1\Profile::initOnce();
        parent::__construct($data);
    }

    /**
     * Given/first name.
     * It's derived from [formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name] if not provided.
     * Number of characters allowed is 100.
     *
     * Generated from protobuf field <code>string given_name = 1;</code>
     * @return string
     */
    public function getGivenName()
    {
        return $this->given_name;
    }

    /**
     * Given/first name.
     * It's derived from [formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name] if not provided.
     * Number of characters allowed is 100.
     *
     * Generated from protobuf field <code>string given_name = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setGivenName($var)
    {
        GPBUtil::checkString($var, True);
        $this->given_name = $var;

        return $this;
    }

    /**
     * Preferred given/first name or nickname.
     * Number of characters allowed is 100.
     *
     * Generated from protobuf field <code>string preferred_name = 6;</code>
     * @return string
     */
    public function getPreferredName()
    {
        return $this->preferred_name;
    }

    /**
     * Preferred given/first name or nickname.
     * Number of characters allowed is 100.
     *
     * Generated from protobuf field <code>string preferred_name = 6;</code>
     * @param string $var
     * @return $this
     */
    public function setPreferredName($var)
    {
        GPBUtil::checkString($var, True);
        $this->preferred_name = $var;

        return $this;
    }

    /**
     * Middle initial.
     * It's derived from [formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name] if not provided.
     * Number of characters allowed is 20.
     *
     * Generated from protobuf field <code>string middle_initial = 2;</code>
     * @return string
     */
    public function getMiddleInitial()
    {
        return $this->middle_initial;
    }

    /**
     * Middle initial.
     * It's derived from [formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name] if not provided.
     * Number of characters allowed is 20.
     *
     * Generated from protobuf field <code>string middle_initial = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setMiddleInitial($var)
    {
        GPBUtil::checkString($var, True);
        $this->middle_initial = $var;

        return $this;
    }

    /**
     * Family/last name.
     * It's derived from [formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name] if not provided.
     * Number of characters allowed is 100.
     *
     * Generated from protobuf field <code>string family_name = 3;</code>
     * @return string
     */
    public function getFamilyName()
    {
        return $this->family_name;
    }

    /**
     * Family/last name.
     * It's derived from [formatted_name][google.cloud.talent.v4beta1.PersonName.formatted_name] if not provided.
     * Number of characters allowed is 100.
     *
     * Generated from protobuf field <code>string family_name = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setFamilyName($var)
    {
        GPBUtil::checkString($var, True);
        $this->family_name = $var;

        return $this;
    }

    /**
     * Suffixes.
     * Number of characters allowed is 20.
     *
     * Generated from protobuf field <code>repeated string suffixes = 4;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getSuffixes()
    {
        return $this->suffixes;
    }

    /**
     * Suffixes.
     * Number of characters allowed is 20.
     *
     * Generated from protobuf field <code>repeated string suffixes = 4;</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setSuffixes($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->suffixes = $arr;

        return $this;
    }

    /**
     * Prefixes.
     * Number of characters allowed is 20.
     *
     * Generated from protobuf field <code>repeated string prefixes = 5;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getPrefixes()
    {
        return $this->prefixes;
    }

    /**
     * Prefixes.
     * Number of characters allowed is 20.
     *
     * Generated from protobuf field <code>repeated string prefixes = 5;</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setPrefixes($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->prefixes = $arr;

        return $this;
    }

}

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(PersonStructuredName::class, \Google\Cloud\Talent\V4beta1\PersonName_PersonStructuredName::class);
