<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1alpha1/containeranalysis.proto

namespace Google\Devtools\Containeranalysis\V1alpha1\Discovery\Discovered;

use UnexpectedValueException;

/**
 * Analysis status for a resource.
 *
 * Protobuf type <code>google.devtools.containeranalysis.v1alpha1.Discovery.Discovered.AnalysisStatus</code>
 */
class AnalysisStatus
{
    /**
     * Unknown
     *
     * Generated from protobuf enum <code>ANALYSIS_STATUS_UNSPECIFIED = 0;</code>
     */
    const ANALYSIS_STATUS_UNSPECIFIED = 0;
    /**
     * Resource is known but no action has been taken yet.
     *
     * Generated from protobuf enum <code>PENDING = 1;</code>
     */
    const PENDING = 1;
    /**
     * Resource is being analyzed.
     *
     * Generated from protobuf enum <code>SCANNING = 2;</code>
     */
    const SCANNING = 2;
    /**
     * Analysis has finished successfully.
     *
     * Generated from protobuf enum <code>FINISHED_SUCCESS = 3;</code>
     */
    const FINISHED_SUCCESS = 3;
    /**
     * Analysis has finished unsuccessfully, the analysis itself is in a bad
     * state.
     *
     * Generated from protobuf enum <code>FINISHED_FAILED = 4;</code>
     */
    const FINISHED_FAILED = 4;
    /**
     * Analysis will not happen, the resource is not supported.
     *
     * Generated from protobuf enum <code>UNSUPPORTED_RESOURCE = 5;</code>
     */
    const UNSUPPORTED_RESOURCE = 5;

    private static $valueToName = [
        self::ANALYSIS_STATUS_UNSPECIFIED => 'ANALYSIS_STATUS_UNSPECIFIED',
        self::PENDING => 'PENDING',
        self::SCANNING => 'SCANNING',
        self::FINISHED_SUCCESS => 'FINISHED_SUCCESS',
        self::FINISHED_FAILED => 'FINISHED_FAILED',
        self::UNSUPPORTED_RESOURCE => 'UNSUPPORTED_RESOURCE',
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
class_alias(AnalysisStatus::class, \Google\Devtools\Containeranalysis\V1alpha1\Discovery_Discovered_AnalysisStatus::class);

