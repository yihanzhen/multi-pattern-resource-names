<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/discovery/discovery.proto

namespace Grafeas\V1beta1\Discovery;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Provides information about the analysis status of a discovered resource.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.discovery.Discovered</code>
 */
class Discovered extends \Google\Protobuf\Internal\Message
{
    /**
     * Whether the resource is continuously analyzed.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.discovery.Discovered.ContinuousAnalysis continuous_analysis = 1;</code>
     */
    private $continuous_analysis = 0;
    /**
     * The last time continuous analysis was done for this resource.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp last_analysis_time = 2;</code>
     */
    private $last_analysis_time = null;
    /**
     * The status of discovery for the resource.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.discovery.Discovered.AnalysisStatus analysis_status = 3;</code>
     */
    private $analysis_status = 0;
    /**
     * When an error is encountered this will contain a LocalizedMessage under
     * details to show to the user. The LocalizedMessage is output only and
     * populated by the API.
     *
     * Generated from protobuf field <code>.google.rpc.Status analysis_status_error = 4;</code>
     */
    private $analysis_status_error = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $continuous_analysis
     *           Whether the resource is continuously analyzed.
     *     @type \Google\Protobuf\Timestamp $last_analysis_time
     *           The last time continuous analysis was done for this resource.
     *     @type int $analysis_status
     *           The status of discovery for the resource.
     *     @type \Google\Rpc\Status $analysis_status_error
     *           When an error is encountered this will contain a LocalizedMessage under
     *           details to show to the user. The LocalizedMessage is output only and
     *           populated by the API.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Discovery\Discovery::initOnce();
        parent::__construct($data);
    }

    /**
     * Whether the resource is continuously analyzed.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.discovery.Discovered.ContinuousAnalysis continuous_analysis = 1;</code>
     * @return int
     */
    public function getContinuousAnalysis()
    {
        return $this->continuous_analysis;
    }

    /**
     * Whether the resource is continuously analyzed.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.discovery.Discovered.ContinuousAnalysis continuous_analysis = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setContinuousAnalysis($var)
    {
        GPBUtil::checkEnum($var, \Grafeas\V1beta1\Discovery\Discovered_ContinuousAnalysis::class);
        $this->continuous_analysis = $var;

        return $this;
    }

    /**
     * The last time continuous analysis was done for this resource.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp last_analysis_time = 2;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getLastAnalysisTime()
    {
        return $this->last_analysis_time;
    }

    /**
     * The last time continuous analysis was done for this resource.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp last_analysis_time = 2;</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setLastAnalysisTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->last_analysis_time = $var;

        return $this;
    }

    /**
     * The status of discovery for the resource.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.discovery.Discovered.AnalysisStatus analysis_status = 3;</code>
     * @return int
     */
    public function getAnalysisStatus()
    {
        return $this->analysis_status;
    }

    /**
     * The status of discovery for the resource.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.discovery.Discovered.AnalysisStatus analysis_status = 3;</code>
     * @param int $var
     * @return $this
     */
    public function setAnalysisStatus($var)
    {
        GPBUtil::checkEnum($var, \Grafeas\V1beta1\Discovery\Discovered_AnalysisStatus::class);
        $this->analysis_status = $var;

        return $this;
    }

    /**
     * When an error is encountered this will contain a LocalizedMessage under
     * details to show to the user. The LocalizedMessage is output only and
     * populated by the API.
     *
     * Generated from protobuf field <code>.google.rpc.Status analysis_status_error = 4;</code>
     * @return \Google\Rpc\Status
     */
    public function getAnalysisStatusError()
    {
        return $this->analysis_status_error;
    }

    /**
     * When an error is encountered this will contain a LocalizedMessage under
     * details to show to the user. The LocalizedMessage is output only and
     * populated by the API.
     *
     * Generated from protobuf field <code>.google.rpc.Status analysis_status_error = 4;</code>
     * @param \Google\Rpc\Status $var
     * @return $this
     */
    public function setAnalysisStatusError($var)
    {
        GPBUtil::checkMessage($var, \Google\Rpc\Status::class);
        $this->analysis_status_error = $var;

        return $this;
    }

}
