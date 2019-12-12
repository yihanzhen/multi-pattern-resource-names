<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/dlp.proto

namespace Google\Cloud\Dlp\V2\RecordCondition\Expressions;

use UnexpectedValueException;

/**
 * Protobuf type <code>google.privacy.dlp.v2.RecordCondition.Expressions.LogicalOperator</code>
 */
class LogicalOperator
{
    /**
     * Generated from protobuf enum <code>LOGICAL_OPERATOR_UNSPECIFIED = 0;</code>
     */
    const LOGICAL_OPERATOR_UNSPECIFIED = 0;
    /**
     * Generated from protobuf enum <code>AND = 1;</code>
     */
    const PBAND = 1;

    private static $valueToName = [
        self::LOGICAL_OPERATOR_UNSPECIFIED => 'LOGICAL_OPERATOR_UNSPECIFIED',
        self::PBAND => 'PBAND',
    ];

    public static function name($value)
    {
        if (!isset(self::$valueToName[$value])) {
            throw new UnexpectedValueException(sprintf(
                    'Enum %s has no name defined for value %s', __CLASS__, $value));
        }
        return self::$valueToName[$value];
    }


    public static function value($name)
    {
        $const = __CLASS__ . '::' . strtoupper($name);
        if (!defined($const)) {
            throw new UnexpectedValueException(sprintf(
                    'Enum %s has no value defined for name %s', __CLASS__, $name));
        }
        return constant($const);
    }
}

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(LogicalOperator::class, \Google\Cloud\Dlp\V2\RecordCondition_Expressions_LogicalOperator::class);

