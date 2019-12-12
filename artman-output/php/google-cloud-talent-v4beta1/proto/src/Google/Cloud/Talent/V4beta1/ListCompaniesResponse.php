<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4beta1/company_service.proto

namespace Google\Cloud\Talent\V4beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The List companies response object.
 *
 * Generated from protobuf message <code>google.cloud.talent.v4beta1.ListCompaniesResponse</code>
 */
final class ListCompaniesResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Companies for the current client.
     *
     * Generated from protobuf field <code>repeated .google.cloud.talent.v4beta1.Company companies = 1;</code>
     */
    private $companies;
    /**
     * A token to retrieve the next page of results.
     *
     * Generated from protobuf field <code>string next_page_token = 2;</code>
     */
    private $next_page_token = '';
    /**
     * Additional information for the API invocation, such as the request
     * tracking id.
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.ResponseMetadata metadata = 3;</code>
     */
    private $metadata = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Cloud\Talent\V4beta1\Company[]|\Google\Protobuf\Internal\RepeatedField $companies
     *           Companies for the current client.
     *     @type string $next_page_token
     *           A token to retrieve the next page of results.
     *     @type \Google\Cloud\Talent\V4beta1\ResponseMetadata $metadata
     *           Additional information for the API invocation, such as the request
     *           tracking id.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Talent\V4Beta1\CompanyService::initOnce();
        parent::__construct($data);
    }

    /**
     * Companies for the current client.
     *
     * Generated from protobuf field <code>repeated .google.cloud.talent.v4beta1.Company companies = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getCompanies()
    {
        return $this->companies;
    }

    /**
     * Companies for the current client.
     *
     * Generated from protobuf field <code>repeated .google.cloud.talent.v4beta1.Company companies = 1;</code>
     * @param \Google\Cloud\Talent\V4beta1\Company[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setCompanies($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Cloud\Talent\V4beta1\Company::class);
        $this->companies = $arr;

        return $this;
    }

    /**
     * A token to retrieve the next page of results.
     *
     * Generated from protobuf field <code>string next_page_token = 2;</code>
     * @return string
     */
    public function getNextPageToken()
    {
        return $this->next_page_token;
    }

    /**
     * A token to retrieve the next page of results.
     *
     * Generated from protobuf field <code>string next_page_token = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setNextPageToken($var)
    {
        GPBUtil::checkString($var, True);
        $this->next_page_token = $var;

        return $this;
    }

    /**
     * Additional information for the API invocation, such as the request
     * tracking id.
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.ResponseMetadata metadata = 3;</code>
     * @return \Google\Cloud\Talent\V4beta1\ResponseMetadata
     */
    public function getMetadata()
    {
        return $this->metadata;
    }

    /**
     * Additional information for the API invocation, such as the request
     * tracking id.
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.ResponseMetadata metadata = 3;</code>
     * @param \Google\Cloud\Talent\V4beta1\ResponseMetadata $var
     * @return $this
     */
    public function setMetadata($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Talent\V4beta1\ResponseMetadata::class);
        $this->metadata = $var;

        return $this;
    }

}

