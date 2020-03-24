<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/storage.proto

namespace Google\Cloud\Dlp\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Shared message indicating Cloud storage type.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.StorageConfig</code>
 */
class StorageConfig extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.google.privacy.dlp.v2.StorageConfig.TimespanConfig timespan_config = 6;</code>
     */
    protected $timespan_config = null;
    protected $type;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Cloud\Dlp\V2\DatastoreOptions $datastore_options
     *           Google Cloud Datastore options.
     *     @type \Google\Cloud\Dlp\V2\CloudStorageOptions $cloud_storage_options
     *           Google Cloud Storage options.
     *     @type \Google\Cloud\Dlp\V2\BigQueryOptions $big_query_options
     *           BigQuery options.
     *     @type \Google\Cloud\Dlp\V2\HybridOptions $hybrid_options
     *           Hybrid inspection options.
     *           Early access feature is in a pre-release state and might change or have
     *           limited support. For more information, see
     *           https://cloud.google.com/products#product-launch-stages.
     *     @type \Google\Cloud\Dlp\V2\StorageConfig\TimespanConfig $timespan_config
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Privacy\Dlp\V2\Storage::initOnce();
        parent::__construct($data);
    }

    /**
     * Google Cloud Datastore options.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.DatastoreOptions datastore_options = 2;</code>
     * @return \Google\Cloud\Dlp\V2\DatastoreOptions
     */
    public function getDatastoreOptions()
    {
        return $this->readOneof(2);
    }

    /**
     * Google Cloud Datastore options.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.DatastoreOptions datastore_options = 2;</code>
     * @param \Google\Cloud\Dlp\V2\DatastoreOptions $var
     * @return $this
     */
    public function setDatastoreOptions($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\DatastoreOptions::class);
        $this->writeOneof(2, $var);

        return $this;
    }

    /**
     * Google Cloud Storage options.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.CloudStorageOptions cloud_storage_options = 3;</code>
     * @return \Google\Cloud\Dlp\V2\CloudStorageOptions
     */
    public function getCloudStorageOptions()
    {
        return $this->readOneof(3);
    }

    /**
     * Google Cloud Storage options.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.CloudStorageOptions cloud_storage_options = 3;</code>
     * @param \Google\Cloud\Dlp\V2\CloudStorageOptions $var
     * @return $this
     */
    public function setCloudStorageOptions($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\CloudStorageOptions::class);
        $this->writeOneof(3, $var);

        return $this;
    }

    /**
     * BigQuery options.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.BigQueryOptions big_query_options = 4;</code>
     * @return \Google\Cloud\Dlp\V2\BigQueryOptions
     */
    public function getBigQueryOptions()
    {
        return $this->readOneof(4);
    }

    /**
     * BigQuery options.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.BigQueryOptions big_query_options = 4;</code>
     * @param \Google\Cloud\Dlp\V2\BigQueryOptions $var
     * @return $this
     */
    public function setBigQueryOptions($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\BigQueryOptions::class);
        $this->writeOneof(4, $var);

        return $this;
    }

    /**
     * Hybrid inspection options.
     * Early access feature is in a pre-release state and might change or have
     * limited support. For more information, see
     * https://cloud.google.com/products#product-launch-stages.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.HybridOptions hybrid_options = 9;</code>
     * @return \Google\Cloud\Dlp\V2\HybridOptions
     */
    public function getHybridOptions()
    {
        return $this->readOneof(9);
    }

    /**
     * Hybrid inspection options.
     * Early access feature is in a pre-release state and might change or have
     * limited support. For more information, see
     * https://cloud.google.com/products#product-launch-stages.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.HybridOptions hybrid_options = 9;</code>
     * @param \Google\Cloud\Dlp\V2\HybridOptions $var
     * @return $this
     */
    public function setHybridOptions($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\HybridOptions::class);
        $this->writeOneof(9, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>.google.privacy.dlp.v2.StorageConfig.TimespanConfig timespan_config = 6;</code>
     * @return \Google\Cloud\Dlp\V2\StorageConfig\TimespanConfig
     */
    public function getTimespanConfig()
    {
        return $this->timespan_config;
    }

    /**
     * Generated from protobuf field <code>.google.privacy.dlp.v2.StorageConfig.TimespanConfig timespan_config = 6;</code>
     * @param \Google\Cloud\Dlp\V2\StorageConfig\TimespanConfig $var
     * @return $this
     */
    public function setTimespanConfig($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\StorageConfig_TimespanConfig::class);
        $this->timespan_config = $var;

        return $this;
    }

    /**
     * @return string
     */
    public function getType()
    {
        return $this->whichOneof("type");
    }

}

