<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/dlp.proto

namespace Google\Cloud\Dlp\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Configuration for a risk analysis job. See
 * https://cloud.google.com/dlp/docs/concepts-risk-analysis to learn more.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.RiskAnalysisJobConfig</code>
 */
final class RiskAnalysisJobConfig extends \Google\Protobuf\Internal\Message
{
    /**
     * Privacy metric to compute.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.PrivacyMetric privacy_metric = 1;</code>
     */
    private $privacy_metric = null;
    /**
     * Input dataset to compute metrics over.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.BigQueryTable source_table = 2;</code>
     */
    private $source_table = null;
    /**
     * Actions to execute at the completion of the job. Are executed in the order
     * provided.
     *
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2.Action actions = 3;</code>
     */
    private $actions;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Cloud\Dlp\V2\PrivacyMetric $privacy_metric
     *           Privacy metric to compute.
     *     @type \Google\Cloud\Dlp\V2\BigQueryTable $source_table
     *           Input dataset to compute metrics over.
     *     @type \Google\Cloud\Dlp\V2\Action[]|\Google\Protobuf\Internal\RepeatedField $actions
     *           Actions to execute at the completion of the job. Are executed in the order
     *           provided.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Privacy\Dlp\V2\Dlp::initOnce();
        parent::__construct($data);
    }

    /**
     * Privacy metric to compute.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.PrivacyMetric privacy_metric = 1;</code>
     * @return \Google\Cloud\Dlp\V2\PrivacyMetric
     */
    public function getPrivacyMetric()
    {
        return $this->privacy_metric;
    }

    /**
     * Privacy metric to compute.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.PrivacyMetric privacy_metric = 1;</code>
     * @param \Google\Cloud\Dlp\V2\PrivacyMetric $var
     * @return $this
     */
    public function setPrivacyMetric($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\PrivacyMetric::class);
        $this->privacy_metric = $var;

        return $this;
    }

    /**
     * Input dataset to compute metrics over.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.BigQueryTable source_table = 2;</code>
     * @return \Google\Cloud\Dlp\V2\BigQueryTable
     */
    public function getSourceTable()
    {
        return $this->source_table;
    }

    /**
     * Input dataset to compute metrics over.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.BigQueryTable source_table = 2;</code>
     * @param \Google\Cloud\Dlp\V2\BigQueryTable $var
     * @return $this
     */
    public function setSourceTable($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\BigQueryTable::class);
        $this->source_table = $var;

        return $this;
    }

    /**
     * Actions to execute at the completion of the job. Are executed in the order
     * provided.
     *
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2.Action actions = 3;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getActions()
    {
        return $this->actions;
    }

    /**
     * Actions to execute at the completion of the job. Are executed in the order
     * provided.
     *
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2.Action actions = 3;</code>
     * @param \Google\Cloud\Dlp\V2\Action[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setActions($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Cloud\Dlp\V2\Action::class);
        $this->actions = $arr;

        return $this;
    }

}
