<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1alpha1/containeranalysis.proto

namespace Google\Devtools\Containeranalysis\V1alpha1\Discovery;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Provides information about the scan status of a discovered resource.
 *
 * Generated from protobuf message <code>google.devtools.containeranalysis.v1alpha1.Discovery.Discovered</code>
 */
final class Discovered extends \Google\Protobuf\Internal\Message
{
    /**
     * Output only. An operation that indicates the status of the current scan.
     *
     * Generated from protobuf field <code>.google.longrunning.Operation operation = 1;</code>
     */
    private $operation = null;
    /**
     * The status of discovery for the resource.
     *
     * Generated from protobuf field <code>.google.devtools.containeranalysis.v1alpha1.Discovery.Discovered.AnalysisStatus analysis_status = 5;</code>
     */
    private $analysis_status = 0;
    /**
     * When an error is encountered this will contain a LocalizedMessage under
     * details to show to the user. The LocalizedMessage output only and
     * populated by the API.
     *
     * Generated from protobuf field <code>.google.rpc.Status analysis_status_error = 6;</code>
     */
    private $analysis_status_error = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\LongRunning\Operation $operation
     *           Output only. An operation that indicates the status of the current scan.
     *     @type int $analysis_status
     *           The status of discovery for the resource.
     *     @type \Google\Rpc\Status $analysis_status_error
     *           When an error is encountered this will contain a LocalizedMessage under
     *           details to show to the user. The LocalizedMessage output only and
     *           populated by the API.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Alpha1\Containeranalysis::initOnce();
        parent::__construct($data);
    }

    /**
     * Output only. An operation that indicates the status of the current scan.
     *
     * Generated from protobuf field <code>.google.longrunning.Operation operation = 1;</code>
     * @return \Google\LongRunning\Operation
     */
    public function getOperation()
    {
        return $this->operation;
    }

    /**
     * Output only. An operation that indicates the status of the current scan.
     *
     * Generated from protobuf field <code>.google.longrunning.Operation operation = 1;</code>
     * @param \Google\LongRunning\Operation $var
     * @return $this
     */
    public function setOperation($var)
    {
        GPBUtil::checkMessage($var, \Google\LongRunning\Operation::class);
        $this->operation = $var;

        return $this;
    }

    /**
     * The status of discovery for the resource.
     *
     * Generated from protobuf field <code>.google.devtools.containeranalysis.v1alpha1.Discovery.Discovered.AnalysisStatus analysis_status = 5;</code>
     * @return int
     */
    public function getAnalysisStatus()
    {
        return $this->analysis_status;
    }

    /**
     * The status of discovery for the resource.
     *
     * Generated from protobuf field <code>.google.devtools.containeranalysis.v1alpha1.Discovery.Discovered.AnalysisStatus analysis_status = 5;</code>
     * @param int $var
     * @return $this
     */
    public function setAnalysisStatus($var)
    {
        GPBUtil::checkEnum($var, \Google\Devtools\Containeranalysis\V1alpha1\Discovery_Discovered_AnalysisStatus::class);
        $this->analysis_status = $var;

        return $this;
    }

    /**
     * When an error is encountered this will contain a LocalizedMessage under
     * details to show to the user. The LocalizedMessage output only and
     * populated by the API.
     *
     * Generated from protobuf field <code>.google.rpc.Status analysis_status_error = 6;</code>
     * @return \Google\Rpc\Status
     */
    public function getAnalysisStatusError()
    {
        return $this->analysis_status_error;
    }

    /**
     * When an error is encountered this will contain a LocalizedMessage under
     * details to show to the user. The LocalizedMessage output only and
     * populated by the API.
     *
     * Generated from protobuf field <code>.google.rpc.Status analysis_status_error = 6;</code>
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

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(Discovered::class, \Google\Devtools\Containeranalysis\V1alpha1\Discovery_Discovered::class);
