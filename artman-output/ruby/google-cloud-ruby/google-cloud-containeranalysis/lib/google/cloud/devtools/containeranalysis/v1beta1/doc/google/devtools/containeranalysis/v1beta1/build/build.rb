# Copyright 2019 Google LLC
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
    module Build
      # Note holding the version of the provider's builder and the signature of the
      # provenance message in linked BuildDetails.
      # @!attribute [rw] builder_version
      #   @return [String]
      #     Version of the builder which produced this Note.
      # @!attribute [rw] signature
      #   @return [Grafeas::V1beta1::Build::BuildSignature]
      #     Signature of the build in Occurrences pointing to the Note containing this
      #     `BuilderDetails`.
      class Build; end

      # Message encapsulating the signature of the verified build.
      # @!attribute [rw] public_key
      #   @return [String]
      #     Public key of the builder which can be used to verify that the related
      #     findings are valid and unchanged. If `key_type` is empty, this defaults
      #     to PEM encoded public keys.
      #
      #     This field may be empty if `key_id` references an external key.
      #
      #     For Cloud Container Builder based signatures, this is a PEM encoded public
      #     key. To verify the Cloud Container Builder signature, place the contents of
      #     this field into a file (public.pem). The signature field is base64-decoded
      #     into its binary representation in signature.bin, and the provenance bytes
      #     from `BuildDetails` are base64-decoded into a binary representation in
      #     signed.bin. OpenSSL can then verify the signature:
      #     `openssl sha256 -verify public.pem -signature signature.bin signed.bin`
      # @!attribute [rw] signature
      #   @return [String]
      #     Signature of the related `BuildProvenance`. In JSON, this is base-64
      #     encoded.
      # @!attribute [rw] key_id
      #   @return [String]
      #     An ID for the key used to sign. This could be either an Id for the key
      #     stored in `public_key` (such as the Id or fingerprint for a PGP key, or the
      #     CN for a cert), or a reference to an external key (such as a reference to a
      #     key in Cloud Key Management Service).
      # @!attribute [rw] key_type
      #   @return [Grafeas::V1beta1::Build::BuildSignature::KeyType]
      #     The type of the key, either stored in `public_key` or referenced in
      #     `key_id`
      class BuildSignature
        # Public key formats
        module KeyType
          # `KeyType` is not set.
          KEY_TYPE_UNSPECIFIED = 0

          # `PGP ASCII Armored` public key.
          PGP_ASCII_ARMORED = 1

          # `PKIX PEM` public key.
          PKIX_PEM = 2
        end
      end

      # Details of a build occurrence.
      # @!attribute [rw] provenance
      #   @return [Grafeas::V1beta1::Provenance::BuildProvenance]
      #     The actual provenance for the build.
      # @!attribute [rw] provenance_bytes
      #   @return [String]
      #     Serialized JSON representation of the provenance, used in generating the
      #     `BuildSignature` in the corresponding Result. After verifying the
      #     signature, `provenance_bytes` can be unmarshalled and compared to the
      #     provenance to confirm that it is unchanged. A base64-encoded string
      #     representation of the provenance bytes is used for the signature in order
      #     to interoperate with openssl which expects this format for signature
      #     verification.
      #
      #     The serialized form is captured both to avoid ambiguity in how the
      #     provenance is marshalled to json as well to prevent incompatibilities with
      #     future changes.
      class Details; end
    end
  end
end