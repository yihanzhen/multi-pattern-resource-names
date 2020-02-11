# Copyright 2020 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

module Grafeas
  module V1beta1
    module Package
      # This represents a particular channel of distribution for a given package.
      # E.g., Debian's jessie-backports dpkg mirror.
      # @!attribute [rw] cpe_uri
      #   @return [String]
      #     Required. The cpe_uri in [CPE format](https://cpe.mitre.org/specification/)
      #     denoting the package manager version distributing a package.
      # @!attribute [rw] architecture
      #   @return [Grafeas::V1beta1::Package::Architecture]
      #     The CPU architecture for which packages in this distribution channel were
      #     built.
      # @!attribute [rw] latest_version
      #   @return [Grafeas::V1beta1::Package::Version]
      #     The latest available version of this package in this distribution channel.
      # @!attribute [rw] maintainer
      #   @return [String]
      #     A freeform string denoting the maintainer of this package.
      # @!attribute [rw] url
      #   @return [String]
      #     The distribution channel-specific homepage for this package.
      # @!attribute [rw] description
      #   @return [String]
      #     The distribution channel-specific description of this package.
      class Distribution; end

      # An occurrence of a particular package installation found within a system's
      # filesystem. E.g., glibc was found in `/var/lib/dpkg/status`.
      # @!attribute [rw] cpe_uri
      #   @return [String]
      #     Required. The CPE URI in [CPE format](https://cpe.mitre.org/specification/)
      #     denoting the package manager version distributing a package.
      # @!attribute [rw] version
      #   @return [Grafeas::V1beta1::Package::Version]
      #     The version installed at this location.
      # @!attribute [rw] path
      #   @return [String]
      #     The path from which we gathered that this package/version is installed.
      class Location; end

      # This represents a particular package that is distributed over various
      # channels. E.g., glibc (aka libc6) is distributed by many, at various
      # versions.
      # @!attribute [rw] name
      #   @return [String]
      #     Required. Immutable. The name of the package.
      # @!attribute [rw] distribution
      #   @return [Array<Grafeas::V1beta1::Package::Distribution>]
      #     The various channels by which a package is distributed.
      class Package; end

      # Details of a package occurrence.
      # @!attribute [rw] installation
      #   @return [Grafeas::V1beta1::Package::Installation]
      #     Required. Where the package was installed.
      class Details; end

      # This represents how a particular software package may be installed on a
      # system.
      # @!attribute [rw] name
      #   @return [String]
      #     Output only. The name of the installed package.
      # @!attribute [rw] location
      #   @return [Array<Grafeas::V1beta1::Package::Location>]
      #     Required. All of the places within the filesystem versions of this package
      #     have been found.
      class Installation; end

      # Version contains structured information about the version of a package.
      # @!attribute [rw] epoch
      #   @return [Integer]
      #     Used to correct mistakes in the version numbering scheme.
      # @!attribute [rw] name
      #   @return [String]
      #     Required only when version kind is NORMAL. The main part of the version
      #     name.
      # @!attribute [rw] revision
      #   @return [String]
      #     The iteration of the package build from the above version.
      # @!attribute [rw] kind
      #   @return [Grafeas::V1beta1::Package::Version::VersionKind]
      #     Required. Distinguishes between sentinel MIN/MAX versions and normal
      #     versions.
      class Version
        # Whether this is an ordinary package version or a sentinel MIN/MAX version.
        module VersionKind
          # Unknown.
          VERSION_KIND_UNSPECIFIED = 0

          # A standard package version.
          NORMAL = 1

          # A special version representing negative infinity.
          MINIMUM = 2

          # A special version representing positive infinity.
          MAXIMUM = 3
        end
      end

      # Instruction set architectures supported by various package managers.
      module Architecture
        # Unknown architecture.
        ARCHITECTURE_UNSPECIFIED = 0

        # X86 architecture.
        X86 = 1

        # X64 architecture.
        X64 = 2
      end
    end
  end
end