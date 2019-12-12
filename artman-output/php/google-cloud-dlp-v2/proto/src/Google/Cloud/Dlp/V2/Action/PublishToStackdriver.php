<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/dlp.proto

namespace Google\Cloud\Dlp\V2\Action;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Enable Stackdriver metric dlp.googleapis.com/finding_count. This
 * will publish a metric to stack driver on each infotype requested and
 * how many findings were found for it. CustomDetectors will be bucketed
 * as 'Custom' under the Stackdriver label 'info_type'.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.Action.PublishToStackdriver</code>
 */
final class PublishToStackdriver extends \Google\Protobuf\Internal\Message
{

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Privacy\Dlp\V2\Dlp::initOnce();
        parent::__construct($data);
    }

}

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(PublishToStackdriver::class, \Google\Cloud\Dlp\V2\Action_PublishToStackdriver::class);

