<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4beta1/company_service.proto

namespace Google\Cloud\Talent\V4beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The Request of the CreateCompany method.
 *
 * Generated from protobuf message <code>google.cloud.talent.v4beta1.CreateCompanyRequest</code>
 */
final class CreateCompanyRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. Resource name of the tenant under which the company is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
     * is created, for example, "projects/foo".
     *
     * Generated from protobuf field <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private $parent = '';
    /**
     * Required. The company to be created.
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private $company = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $parent
     *           Required. Resource name of the tenant under which the company is created.
     *           The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     *           "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
     *           is created, for example, "projects/foo".
     *     @type \Google\Cloud\Talent\V4beta1\Company $company
     *           Required. The company to be created.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Talent\V4Beta1\CompanyService::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. Resource name of the tenant under which the company is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
     * is created, for example, "projects/foo".
     *
     * Generated from protobuf field <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return string
     */
    public function getParent()
    {
        return $this->parent;
    }

    /**
     * Required. Resource name of the tenant under which the company is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
     * is created, for example, "projects/foo".
     *
     * Generated from protobuf field <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param string $var
     * @return $this
     */
    public function setParent($var)
    {
        GPBUtil::checkString($var, True);
        $this->parent = $var;

        return $this;
    }

    /**
     * Required. The company to be created.
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return \Google\Cloud\Talent\V4beta1\Company
     */
    public function getCompany()
    {
        return $this->company;
    }

    /**
     * Required. The company to be created.
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param \Google\Cloud\Talent\V4beta1\Company $var
     * @return $this
     */
    public function setCompany($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Talent\V4beta1\Company::class);
        $this->company = $var;

        return $this;
    }

}

