<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/pubsub/v1/pubsub.proto

namespace Google\Cloud\PubSub\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Response for the `ListTopicSnapshots` method.
 *
 * Generated from protobuf message <code>google.pubsub.v1.ListTopicSnapshotsResponse</code>
 */
final class ListTopicSnapshotsResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * The names of the snapshots that match the request.
     *
     * Generated from protobuf field <code>repeated string snapshots = 1;</code>
     */
    private $snapshots;
    /**
     * If not empty, indicates that there may be more snapshots that match
     * the request; this value should be passed in a new
     * `ListTopicSnapshotsRequest` to get more snapshots.
     *
     * Generated from protobuf field <code>string next_page_token = 2;</code>
     */
    private $next_page_token = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string[]|\Google\Protobuf\Internal\RepeatedField $snapshots
     *           The names of the snapshots that match the request.
     *     @type string $next_page_token
     *           If not empty, indicates that there may be more snapshots that match
     *           the request; this value should be passed in a new
     *           `ListTopicSnapshotsRequest` to get more snapshots.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Pubsub\V1\Pubsub::initOnce();
        parent::__construct($data);
    }

    /**
     * The names of the snapshots that match the request.
     *
     * Generated from protobuf field <code>repeated string snapshots = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getSnapshots()
    {
        return $this->snapshots;
    }

    /**
     * The names of the snapshots that match the request.
     *
     * Generated from protobuf field <code>repeated string snapshots = 1;</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setSnapshots($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->snapshots = $arr;

        return $this;
    }

    /**
     * If not empty, indicates that there may be more snapshots that match
     * the request; this value should be passed in a new
     * `ListTopicSnapshotsRequest` to get more snapshots.
     *
     * Generated from protobuf field <code>string next_page_token = 2;</code>
     * @return string
     */
    public function getNextPageToken()
    {
        return $this->next_page_token;
    }

    /**
     * If not empty, indicates that there may be more snapshots that match
     * the request; this value should be passed in a new
     * `ListTopicSnapshotsRequest` to get more snapshots.
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

}
