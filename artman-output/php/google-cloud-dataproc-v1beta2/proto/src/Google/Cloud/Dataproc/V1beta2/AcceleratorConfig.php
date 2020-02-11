<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dataproc/v1beta2/clusters.proto

namespace Google\Cloud\Dataproc\V1beta2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Specifies the type and number of accelerator cards attached to the instances
 * of an instance group (see [GPUs on Compute Engine](/compute/docs/gpus/)).
 *
 * Generated from protobuf message <code>google.cloud.dataproc.v1beta2.AcceleratorConfig</code>
 */
class AcceleratorConfig extends \Google\Protobuf\Internal\Message
{
    /**
     * Full URL, partial URI, or short name of the accelerator type resource to
     * expose to this instance. See
     * [Compute Engine
     * AcceleratorTypes](/compute/docs/reference/beta/acceleratorTypes)
     * Examples
     * * `https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80`
     * * `projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80`
     * * `nvidia-tesla-k80`
     * **Auto Zone Exception**: If you are using the Cloud Dataproc
     * [Auto Zone
     * Placement](/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
     * feature, you must use the short name of the accelerator type
     * resource, for example, `nvidia-tesla-k80`.
     *
     * Generated from protobuf field <code>string accelerator_type_uri = 1;</code>
     */
    protected $accelerator_type_uri = '';
    /**
     * The number of the accelerator cards of this type exposed to this instance.
     *
     * Generated from protobuf field <code>int32 accelerator_count = 2;</code>
     */
    protected $accelerator_count = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $accelerator_type_uri
     *           Full URL, partial URI, or short name of the accelerator type resource to
     *           expose to this instance. See
     *           [Compute Engine
     *           AcceleratorTypes](/compute/docs/reference/beta/acceleratorTypes)
     *           Examples
     *           * `https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80`
     *           * `projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80`
     *           * `nvidia-tesla-k80`
     *           **Auto Zone Exception**: If you are using the Cloud Dataproc
     *           [Auto Zone
     *           Placement](/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
     *           feature, you must use the short name of the accelerator type
     *           resource, for example, `nvidia-tesla-k80`.
     *     @type int $accelerator_count
     *           The number of the accelerator cards of this type exposed to this instance.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Dataproc\V1Beta2\Clusters::initOnce();
        parent::__construct($data);
    }

    /**
     * Full URL, partial URI, or short name of the accelerator type resource to
     * expose to this instance. See
     * [Compute Engine
     * AcceleratorTypes](/compute/docs/reference/beta/acceleratorTypes)
     * Examples
     * * `https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80`
     * * `projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80`
     * * `nvidia-tesla-k80`
     * **Auto Zone Exception**: If you are using the Cloud Dataproc
     * [Auto Zone
     * Placement](/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
     * feature, you must use the short name of the accelerator type
     * resource, for example, `nvidia-tesla-k80`.
     *
     * Generated from protobuf field <code>string accelerator_type_uri = 1;</code>
     * @return string
     */
    public function getAcceleratorTypeUri()
    {
        return $this->accelerator_type_uri;
    }

    /**
     * Full URL, partial URI, or short name of the accelerator type resource to
     * expose to this instance. See
     * [Compute Engine
     * AcceleratorTypes](/compute/docs/reference/beta/acceleratorTypes)
     * Examples
     * * `https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80`
     * * `projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80`
     * * `nvidia-tesla-k80`
     * **Auto Zone Exception**: If you are using the Cloud Dataproc
     * [Auto Zone
     * Placement](/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
     * feature, you must use the short name of the accelerator type
     * resource, for example, `nvidia-tesla-k80`.
     *
     * Generated from protobuf field <code>string accelerator_type_uri = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setAcceleratorTypeUri($var)
    {
        GPBUtil::checkString($var, True);
        $this->accelerator_type_uri = $var;

        return $this;
    }

    /**
     * The number of the accelerator cards of this type exposed to this instance.
     *
     * Generated from protobuf field <code>int32 accelerator_count = 2;</code>
     * @return int
     */
    public function getAcceleratorCount()
    {
        return $this->accelerator_count;
    }

    /**
     * The number of the accelerator cards of this type exposed to this instance.
     *
     * Generated from protobuf field <code>int32 accelerator_count = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setAcceleratorCount($var)
    {
        GPBUtil::checkInt32($var);
        $this->accelerator_count = $var;

        return $this;
    }

}

