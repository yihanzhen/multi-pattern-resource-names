<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/logging/v2/logging_config.proto

namespace Google\Cloud\Logging\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The parameters to `UpdateBucket` (Beta).
 *
 * Generated from protobuf message <code>google.logging.v2.UpdateBucketRequest</code>
 */
class UpdateBucketRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. The full resource name of the bucket to update.
     *     "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
     *     "organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
     *     "folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
     * Example:
     * `"projects/my-project-id/locations/my-location/buckets/my-bucket-id"`. Also
     * requires permission "resourcemanager.projects.updateLiens" to set the
     * locked property
     *
     * Generated from protobuf field <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = {</code>
     */
    protected $name = '';
    /**
     * Required. The updated bucket.
     *
     * Generated from protobuf field <code>.google.logging.v2.LogBucket bucket = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    protected $bucket = null;
    /**
     * Required. Field mask that specifies the fields in `bucket` that need an update. A
     * bucket field will be overwritten if, and only if, it is in the update
     * mask. `name` and output only fields cannot be updated.
     * For a detailed `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMask
     * Example: `updateMask=retention_days`.
     *
     * Generated from protobuf field <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    protected $update_mask = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $name
     *           Required. The full resource name of the bucket to update.
     *               "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
     *               "organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
     *               "billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
     *               "folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
     *           Example:
     *           `"projects/my-project-id/locations/my-location/buckets/my-bucket-id"`. Also
     *           requires permission "resourcemanager.projects.updateLiens" to set the
     *           locked property
     *     @type \Google\Cloud\Logging\V2\LogBucket $bucket
     *           Required. The updated bucket.
     *     @type \Google\Protobuf\FieldMask $update_mask
     *           Required. Field mask that specifies the fields in `bucket` that need an update. A
     *           bucket field will be overwritten if, and only if, it is in the update
     *           mask. `name` and output only fields cannot be updated.
     *           For a detailed `FieldMask` definition, see
     *           https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMask
     *           Example: `updateMask=retention_days`.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Logging\V2\LoggingConfig::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. The full resource name of the bucket to update.
     *     "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
     *     "organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
     *     "folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
     * Example:
     * `"projects/my-project-id/locations/my-location/buckets/my-bucket-id"`. Also
     * requires permission "resourcemanager.projects.updateLiens" to set the
     * locked property
     *
     * Generated from protobuf field <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = {</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Required. The full resource name of the bucket to update.
     *     "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
     *     "organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
     *     "folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]"
     * Example:
     * `"projects/my-project-id/locations/my-location/buckets/my-bucket-id"`. Also
     * requires permission "resourcemanager.projects.updateLiens" to set the
     * locked property
     *
     * Generated from protobuf field <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = {</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

    /**
     * Required. The updated bucket.
     *
     * Generated from protobuf field <code>.google.logging.v2.LogBucket bucket = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return \Google\Cloud\Logging\V2\LogBucket
     */
    public function getBucket()
    {
        return $this->bucket;
    }

    /**
     * Required. The updated bucket.
     *
     * Generated from protobuf field <code>.google.logging.v2.LogBucket bucket = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param \Google\Cloud\Logging\V2\LogBucket $var
     * @return $this
     */
    public function setBucket($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Logging\V2\LogBucket::class);
        $this->bucket = $var;

        return $this;
    }

    /**
     * Required. Field mask that specifies the fields in `bucket` that need an update. A
     * bucket field will be overwritten if, and only if, it is in the update
     * mask. `name` and output only fields cannot be updated.
     * For a detailed `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMask
     * Example: `updateMask=retention_days`.
     *
     * Generated from protobuf field <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return \Google\Protobuf\FieldMask
     */
    public function getUpdateMask()
    {
        return $this->update_mask;
    }

    /**
     * Required. Field mask that specifies the fields in `bucket` that need an update. A
     * bucket field will be overwritten if, and only if, it is in the update
     * mask. `name` and output only fields cannot be updated.
     * For a detailed `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMask
     * Example: `updateMask=retention_days`.
     *
     * Generated from protobuf field <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param \Google\Protobuf\FieldMask $var
     * @return $this
     */
    public function setUpdateMask($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\FieldMask::class);
        $this->update_mask = $var;

        return $this;
    }

}

