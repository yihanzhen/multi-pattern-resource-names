<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/image/image.proto

namespace Grafeas\V1beta1\Image\Layer;

use UnexpectedValueException;

/**
 * Instructions from Dockerfile.
 *
 * Protobuf type <code>grafeas.v1beta1.image.Layer.Directive</code>
 */
class Directive
{
    /**
     * Default value for unsupported/missing directive.
     *
     * Generated from protobuf enum <code>DIRECTIVE_UNSPECIFIED = 0;</code>
     */
    const DIRECTIVE_UNSPECIFIED = 0;
    /**
     * https://docs.docker.com/reference/builder/#maintainer
     *
     * Generated from protobuf enum <code>MAINTAINER = 1;</code>
     */
    const MAINTAINER = 1;
    /**
     * https://docs.docker.com/reference/builder/#run
     *
     * Generated from protobuf enum <code>RUN = 2;</code>
     */
    const RUN = 2;
    /**
     * https://docs.docker.com/reference/builder/#cmd
     *
     * Generated from protobuf enum <code>CMD = 3;</code>
     */
    const CMD = 3;
    /**
     * https://docs.docker.com/reference/builder/#label
     *
     * Generated from protobuf enum <code>LABEL = 4;</code>
     */
    const LABEL = 4;
    /**
     * https://docs.docker.com/reference/builder/#expose
     *
     * Generated from protobuf enum <code>EXPOSE = 5;</code>
     */
    const EXPOSE = 5;
    /**
     * https://docs.docker.com/reference/builder/#env
     *
     * Generated from protobuf enum <code>ENV = 6;</code>
     */
    const ENV = 6;
    /**
     * https://docs.docker.com/reference/builder/#add
     *
     * Generated from protobuf enum <code>ADD = 7;</code>
     */
    const ADD = 7;
    /**
     * https://docs.docker.com/reference/builder/#copy
     *
     * Generated from protobuf enum <code>COPY = 8;</code>
     */
    const COPY = 8;
    /**
     * https://docs.docker.com/reference/builder/#entrypoint
     *
     * Generated from protobuf enum <code>ENTRYPOINT = 9;</code>
     */
    const ENTRYPOINT = 9;
    /**
     * https://docs.docker.com/reference/builder/#volume
     *
     * Generated from protobuf enum <code>VOLUME = 10;</code>
     */
    const VOLUME = 10;
    /**
     * https://docs.docker.com/reference/builder/#user
     *
     * Generated from protobuf enum <code>USER = 11;</code>
     */
    const USER = 11;
    /**
     * https://docs.docker.com/reference/builder/#workdir
     *
     * Generated from protobuf enum <code>WORKDIR = 12;</code>
     */
    const WORKDIR = 12;
    /**
     * https://docs.docker.com/reference/builder/#arg
     *
     * Generated from protobuf enum <code>ARG = 13;</code>
     */
    const ARG = 13;
    /**
     * https://docs.docker.com/reference/builder/#onbuild
     *
     * Generated from protobuf enum <code>ONBUILD = 14;</code>
     */
    const ONBUILD = 14;
    /**
     * https://docs.docker.com/reference/builder/#stopsignal
     *
     * Generated from protobuf enum <code>STOPSIGNAL = 15;</code>
     */
    const STOPSIGNAL = 15;
    /**
     * https://docs.docker.com/reference/builder/#healthcheck
     *
     * Generated from protobuf enum <code>HEALTHCHECK = 16;</code>
     */
    const HEALTHCHECK = 16;
    /**
     * https://docs.docker.com/reference/builder/#shell
     *
     * Generated from protobuf enum <code>SHELL = 17;</code>
     */
    const SHELL = 17;

    private static $valueToName = [
        self::DIRECTIVE_UNSPECIFIED => 'DIRECTIVE_UNSPECIFIED',
        self::MAINTAINER => 'MAINTAINER',
        self::RUN => 'RUN',
        self::CMD => 'CMD',
        self::LABEL => 'LABEL',
        self::EXPOSE => 'EXPOSE',
        self::ENV => 'ENV',
        self::ADD => 'ADD',
        self::COPY => 'COPY',
        self::ENTRYPOINT => 'ENTRYPOINT',
        self::VOLUME => 'VOLUME',
        self::USER => 'USER',
        self::WORKDIR => 'WORKDIR',
        self::ARG => 'ARG',
        self::ONBUILD => 'ONBUILD',
        self::STOPSIGNAL => 'STOPSIGNAL',
        self::HEALTHCHECK => 'HEALTHCHECK',
        self::SHELL => 'SHELL',
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
class_alias(Directive::class, \Grafeas\V1beta1\Image\Layer_Directive::class);
