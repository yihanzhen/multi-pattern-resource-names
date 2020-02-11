<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

namespace Grafeas\V1beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Request to delete a occurrence.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.DeleteOccurrenceRequest</code>
 */
class DeleteOccurrenceRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * The name of the occurrence in the form of
     * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    protected $name = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $name
     *           The name of the occurrence in the form of
     *           `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Grafeas\Grafeas::initOnce();
        parent::__construct($data);
    }

    /**
     * The name of the occurrence in the form of
     * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * The name of the occurrence in the form of
     * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

}

