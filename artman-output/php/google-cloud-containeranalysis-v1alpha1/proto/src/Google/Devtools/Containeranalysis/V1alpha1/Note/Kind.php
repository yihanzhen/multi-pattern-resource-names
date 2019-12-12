<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1alpha1/containeranalysis.proto

namespace Google\Devtools\Containeranalysis\V1alpha1\Note;

use UnexpectedValueException;

/**
 * This must be 1:1 with members of our oneofs, it can be used for filtering
 * Note and Occurrence on their kind.
 *
 * Protobuf type <code>google.devtools.containeranalysis.v1alpha1.Note.Kind</code>
 */
class Kind
{
    /**
     * Unknown
     *
     * Generated from protobuf enum <code>KIND_UNSPECIFIED = 0;</code>
     */
    const KIND_UNSPECIFIED = 0;
    /**
     * The note and occurrence represent a package vulnerability.
     *
     * Generated from protobuf enum <code>PACKAGE_VULNERABILITY = 2;</code>
     */
    const PACKAGE_VULNERABILITY = 2;
    /**
     * The note and occurrence assert build provenance.
     *
     * Generated from protobuf enum <code>BUILD_DETAILS = 3;</code>
     */
    const BUILD_DETAILS = 3;
    /**
     * This represents an image basis relationship.
     *
     * Generated from protobuf enum <code>IMAGE_BASIS = 4;</code>
     */
    const IMAGE_BASIS = 4;
    /**
     * This represents a package installed via a package manager.
     *
     * Generated from protobuf enum <code>PACKAGE_MANAGER = 5;</code>
     */
    const PACKAGE_MANAGER = 5;
    /**
     * The note and occurrence track deployment events.
     *
     * Generated from protobuf enum <code>DEPLOYABLE = 6;</code>
     */
    const DEPLOYABLE = 6;
    /**
     * The note and occurrence track the initial discovery status of a resource.
     *
     * Generated from protobuf enum <code>DISCOVERY = 7;</code>
     */
    const DISCOVERY = 7;
    /**
     * This represents a logical "role" that can attest to artifacts.
     *
     * Generated from protobuf enum <code>ATTESTATION_AUTHORITY = 8;</code>
     */
    const ATTESTATION_AUTHORITY = 8;

    private static $valueToName = [
        self::KIND_UNSPECIFIED => 'KIND_UNSPECIFIED',
        self::PACKAGE_VULNERABILITY => 'PACKAGE_VULNERABILITY',
        self::BUILD_DETAILS => 'BUILD_DETAILS',
        self::IMAGE_BASIS => 'IMAGE_BASIS',
        self::PACKAGE_MANAGER => 'PACKAGE_MANAGER',
        self::DEPLOYABLE => 'DEPLOYABLE',
        self::DISCOVERY => 'DISCOVERY',
        self::ATTESTATION_AUTHORITY => 'ATTESTATION_AUTHORITY',
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
class_alias(Kind::class, \Google\Devtools\Containeranalysis\V1alpha1\Note_Kind::class);
