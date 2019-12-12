<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dataproc/v1beta2/workflow_templates.proto

namespace Google\Cloud\Dataproc\V1beta2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The workflow graph.
 *
 * Generated from protobuf message <code>google.cloud.dataproc.v1beta2.WorkflowGraph</code>
 */
final class WorkflowGraph extends \Google\Protobuf\Internal\Message
{
    /**
     * Output only. The workflow nodes.
     *
     * Generated from protobuf field <code>repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private $nodes;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Cloud\Dataproc\V1beta2\WorkflowNode[]|\Google\Protobuf\Internal\RepeatedField $nodes
     *           Output only. The workflow nodes.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Dataproc\V1Beta2\WorkflowTemplates::initOnce();
        parent::__construct($data);
    }

    /**
     * Output only. The workflow nodes.
     *
     * Generated from protobuf field <code>repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getNodes()
    {
        return $this->nodes;
    }

    /**
     * Output only. The workflow nodes.
     *
     * Generated from protobuf field <code>repeated .google.cloud.dataproc.v1beta2.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param \Google\Cloud\Dataproc\V1beta2\WorkflowNode[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setNodes($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Cloud\Dataproc\V1beta2\WorkflowNode::class);
        $this->nodes = $arr;

        return $this;
    }

}

