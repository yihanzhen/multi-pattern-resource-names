<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

namespace Grafeas\V1beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Request to create notes in batch.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.BatchCreateNotesRequest</code>
 */
final class BatchCreateNotesRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the notes are to be created.
     *
     * Generated from protobuf field <code>string parent = 1;</code>
     */
    private $parent = '';
    /**
     * The notes to create.
     *
     * Generated from protobuf field <code>map<string, .grafeas.v1beta1.Note> notes = 2;</code>
     */
    private $notes;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $parent
     *           The name of the project in the form of `projects/[PROJECT_ID]`, under which
     *           the notes are to be created.
     *     @type array|\Google\Protobuf\Internal\MapField $notes
     *           The notes to create.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Grafeas\Grafeas::initOnce();
        parent::__construct($data);
    }

    /**
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the notes are to be created.
     *
     * Generated from protobuf field <code>string parent = 1;</code>
     * @return string
     */
    public function getParent()
    {
        return $this->parent;
    }

    /**
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the notes are to be created.
     *
     * Generated from protobuf field <code>string parent = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setParent($var)
    {
        GPBUtil::checkString($var, True);
        $this->parent = $var;

        return $this;
    }

    /**
     * The notes to create.
     *
     * Generated from protobuf field <code>map<string, .grafeas.v1beta1.Note> notes = 2;</code>
     * @return \Google\Protobuf\Internal\MapField
     */
    public function getNotes()
    {
        return $this->notes;
    }

    /**
     * The notes to create.
     *
     * Generated from protobuf field <code>map<string, .grafeas.v1beta1.Note> notes = 2;</code>
     * @param array|\Google\Protobuf\Internal\MapField $var
     * @return $this
     */
    public function setNotes($var)
    {
        $arr = GPBUtil::checkMapField($var, \Google\Protobuf\Internal\GPBType::STRING, \Google\Protobuf\Internal\GPBType::MESSAGE, \Grafeas\V1beta1\Note::class);
        $this->notes = $arr;

        return $this;
    }

}

