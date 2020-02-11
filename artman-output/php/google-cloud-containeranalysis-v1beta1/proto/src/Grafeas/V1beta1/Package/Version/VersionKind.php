<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/package/package.proto

namespace Grafeas\V1beta1\Package\Version;

use UnexpectedValueException;

/**
 * Whether this is an ordinary package version or a sentinel MIN/MAX version.
 *
 * Protobuf type <code>grafeas.v1beta1.package.Version.VersionKind</code>
 */
class VersionKind
{
    /**
     * Unknown.
     *
     * Generated from protobuf enum <code>VERSION_KIND_UNSPECIFIED = 0;</code>
     */
    const VERSION_KIND_UNSPECIFIED = 0;
    /**
     * A standard package version.
     *
     * Generated from protobuf enum <code>NORMAL = 1;</code>
     */
    const NORMAL = 1;
    /**
     * A special version representing negative infinity.
     *
     * Generated from protobuf enum <code>MINIMUM = 2;</code>
     */
    const MINIMUM = 2;
    /**
     * A special version representing positive infinity.
     *
     * Generated from protobuf enum <code>MAXIMUM = 3;</code>
     */
    const MAXIMUM = 3;

    private static $valueToName = [
        self::VERSION_KIND_UNSPECIFIED => 'VERSION_KIND_UNSPECIFIED',
        self::NORMAL => 'NORMAL',
        self::MINIMUM => 'MINIMUM',
        self::MAXIMUM => 'MAXIMUM',
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
class_alias(VersionKind::class, \Grafeas\V1beta1\Package\Version_VersionKind::class);

