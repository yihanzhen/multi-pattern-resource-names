<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

namespace Grafeas\V1beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Request to get a note.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.GetNoteRequest</code>
 */
final class GetNoteRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * The name of the note in the form of
     * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    private $name = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $name
     *           The name of the note in the form of
     *           `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Grafeas\Grafeas::initOnce();
        parent::__construct($data);
    }

    /**
     * The name of the note in the form of
     * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * The name of the note in the form of
     * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
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

