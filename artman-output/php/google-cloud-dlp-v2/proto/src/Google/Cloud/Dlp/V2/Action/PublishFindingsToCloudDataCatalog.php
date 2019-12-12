<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/dlp.proto

namespace Google\Cloud\Dlp\V2\Action;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Publish findings of a DlpJob to Cloud Data Catalog. Labels summarizing the
 * results of the DlpJob will be applied to the entry for the resource scanned
 * in Cloud Data Catalog. Any labels previously written by another DlpJob will
 * be deleted. InfoType naming patterns are strictly enforced when using this
 * feature. Note that the findings will be persisted in Cloud Data Catalog
 * storage and are governed by Data Catalog service-specific policy, see
 * https://cloud.google.com/terms/service-terms
 * Only a single instance of this action can be specified and only allowed if
 * all resources being scanned are BigQuery tables.
 * Compatible with: Inspect
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.Action.PublishFindingsToCloudDataCatalog</code>
 */
final class PublishFindingsToCloudDataCatalog extends \Google\Protobuf\Internal\Message
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
class_alias(PublishFindingsToCloudDataCatalog::class, \Google\Cloud\Dlp\V2\Action_PublishFindingsToCloudDataCatalog::class);
