<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/pubsub/v1/pubsub.proto

namespace Google\Cloud\PubSub\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Request for the UpdateSnapshot method.
 *
 * Generated from protobuf message <code>google.pubsub.v1.UpdateSnapshotRequest</code>
 */
final class UpdateSnapshotRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * The updated snapshot object.
     *
     * Generated from protobuf field <code>.google.pubsub.v1.Snapshot snapshot = 1;</code>
     */
    private $snapshot = null;
    /**
     * Indicates which fields in the provided snapshot to update.
     * Must be specified and non-empty.
     *
     * Generated from protobuf field <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private $update_mask = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Cloud\PubSub\V1\Snapshot $snapshot
     *           The updated snapshot object.
     *     @type \Google\Protobuf\FieldMask $update_mask
     *           Indicates which fields in the provided snapshot to update.
     *           Must be specified and non-empty.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Pubsub\V1\Pubsub::initOnce();
        parent::__construct($data);
    }

    /**
     * The updated snapshot object.
     *
     * Generated from protobuf field <code>.google.pubsub.v1.Snapshot snapshot = 1;</code>
     * @return \Google\Cloud\PubSub\V1\Snapshot
     */
    public function getSnapshot()
    {
        return $this->snapshot;
    }

    /**
     * The updated snapshot object.
     *
     * Generated from protobuf field <code>.google.pubsub.v1.Snapshot snapshot = 1;</code>
     * @param \Google\Cloud\PubSub\V1\Snapshot $var
     * @return $this
     */
    public function setSnapshot($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\PubSub\V1\Snapshot::class);
        $this->snapshot = $var;

        return $this;
    }

    /**
     * Indicates which fields in the provided snapshot to update.
     * Must be specified and non-empty.
     *
     * Generated from protobuf field <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return \Google\Protobuf\FieldMask
     */
    public function getUpdateMask()
    {
        return $this->update_mask;
    }

    /**
     * Indicates which fields in the provided snapshot to update.
     * Must be specified and non-empty.
     *
     * Generated from protobuf field <code>.google.protobuf.FieldMask update_mask = 2;</code>
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

