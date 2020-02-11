<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/dlp.proto

namespace Google\Cloud\Dlp\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Configuration for a custom dictionary created from a data source of any size
 * up to the maximum size defined in the
 * [limits](https://cloud.google.com/dlp/limits) page. The artifacts of
 * dictionary creation are stored in the specified Google Cloud Storage
 * location. Consider using `CustomInfoType.Dictionary` for smaller dictionaries
 * that satisfy the size requirements.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.LargeCustomDictionaryConfig</code>
 */
class LargeCustomDictionaryConfig extends \Google\Protobuf\Internal\Message
{
    /**
     * Location to store dictionary artifacts in Google Cloud Storage. These files
     * will only be accessible by project owners and the DLP API. If any of these
     * artifacts are modified, the dictionary is considered invalid and can no
     * longer be used.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.CloudStoragePath output_path = 1;</code>
     */
    protected $output_path = null;
    protected $source;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Cloud\Dlp\V2\CloudStoragePath $output_path
     *           Location to store dictionary artifacts in Google Cloud Storage. These files
     *           will only be accessible by project owners and the DLP API. If any of these
     *           artifacts are modified, the dictionary is considered invalid and can no
     *           longer be used.
     *     @type \Google\Cloud\Dlp\V2\CloudStorageFileSet $cloud_storage_file_set
     *           Set of files containing newline-delimited lists of dictionary phrases.
     *     @type \Google\Cloud\Dlp\V2\BigQueryField $big_query_field
     *           Field in a BigQuery table where each cell represents a dictionary phrase.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Privacy\Dlp\V2\Dlp::initOnce();
        parent::__construct($data);
    }

    /**
     * Location to store dictionary artifacts in Google Cloud Storage. These files
     * will only be accessible by project owners and the DLP API. If any of these
     * artifacts are modified, the dictionary is considered invalid and can no
     * longer be used.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.CloudStoragePath output_path = 1;</code>
     * @return \Google\Cloud\Dlp\V2\CloudStoragePath
     */
    public function getOutputPath()
    {
        return $this->output_path;
    }

    /**
     * Location to store dictionary artifacts in Google Cloud Storage. These files
     * will only be accessible by project owners and the DLP API. If any of these
     * artifacts are modified, the dictionary is considered invalid and can no
     * longer be used.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.CloudStoragePath output_path = 1;</code>
     * @param \Google\Cloud\Dlp\V2\CloudStoragePath $var
     * @return $this
     */
    public function setOutputPath($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\CloudStoragePath::class);
        $this->output_path = $var;

        return $this;
    }

    /**
     * Set of files containing newline-delimited lists of dictionary phrases.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.CloudStorageFileSet cloud_storage_file_set = 2;</code>
     * @return \Google\Cloud\Dlp\V2\CloudStorageFileSet
     */
    public function getCloudStorageFileSet()
    {
        return $this->readOneof(2);
    }

    /**
     * Set of files containing newline-delimited lists of dictionary phrases.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.CloudStorageFileSet cloud_storage_file_set = 2;</code>
     * @param \Google\Cloud\Dlp\V2\CloudStorageFileSet $var
     * @return $this
     */
    public function setCloudStorageFileSet($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\CloudStorageFileSet::class);
        $this->writeOneof(2, $var);

        return $this;
    }

    /**
     * Field in a BigQuery table where each cell represents a dictionary phrase.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.BigQueryField big_query_field = 3;</code>
     * @return \Google\Cloud\Dlp\V2\BigQueryField
     */
    public function getBigQueryField()
    {
        return $this->readOneof(3);
    }

    /**
     * Field in a BigQuery table where each cell represents a dictionary phrase.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.BigQueryField big_query_field = 3;</code>
     * @param \Google\Cloud\Dlp\V2\BigQueryField $var
     * @return $this
     */
    public function setBigQueryField($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\BigQueryField::class);
        $this->writeOneof(3, $var);

        return $this;
    }

    /**
     * @return string
     */
    public function getSource()
    {
        return $this->whichOneof("source");
    }

}

