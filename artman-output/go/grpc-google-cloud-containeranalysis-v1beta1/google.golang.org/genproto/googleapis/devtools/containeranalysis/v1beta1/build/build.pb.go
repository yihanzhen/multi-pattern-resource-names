// Code generated by protoc-gen-go. DO NOT EDIT.
// source: google/devtools/containeranalysis/v1beta1/build/build.proto

package build

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	provenance "google.golang.org/genproto/googleapis/devtools/containeranalysis/v1beta1/provenance"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

// Public key formats.
type BuildSignature_KeyType int32

const (
	// `KeyType` is not set.
	BuildSignature_KEY_TYPE_UNSPECIFIED BuildSignature_KeyType = 0
	// `PGP ASCII Armored` public key.
	BuildSignature_PGP_ASCII_ARMORED BuildSignature_KeyType = 1
	// `PKIX PEM` public key.
	BuildSignature_PKIX_PEM BuildSignature_KeyType = 2
)

var BuildSignature_KeyType_name = map[int32]string{
	0: "KEY_TYPE_UNSPECIFIED",
	1: "PGP_ASCII_ARMORED",
	2: "PKIX_PEM",
}

var BuildSignature_KeyType_value = map[string]int32{
	"KEY_TYPE_UNSPECIFIED": 0,
	"PGP_ASCII_ARMORED":    1,
	"PKIX_PEM":             2,
}

func (x BuildSignature_KeyType) String() string {
	return proto.EnumName(BuildSignature_KeyType_name, int32(x))
}

func (BuildSignature_KeyType) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_040ca5655a0ae0a6, []int{1, 0}
}

// Note holding the version of the provider's builder and the signature of the
// provenance message in the build details occurrence.
type Build struct {
	// Required. Immutable. Version of the builder which produced this build.
	BuilderVersion string `protobuf:"bytes,1,opt,name=builder_version,json=builderVersion,proto3" json:"builder_version,omitempty"`
	// Signature of the build in occurrences pointing to this build note
	// containing build details.
	Signature            *BuildSignature `protobuf:"bytes,2,opt,name=signature,proto3" json:"signature,omitempty"`
	XXX_NoUnkeyedLiteral struct{}        `json:"-"`
	XXX_unrecognized     []byte          `json:"-"`
	XXX_sizecache        int32           `json:"-"`
}

func (m *Build) Reset()         { *m = Build{} }
func (m *Build) String() string { return proto.CompactTextString(m) }
func (*Build) ProtoMessage()    {}
func (*Build) Descriptor() ([]byte, []int) {
	return fileDescriptor_040ca5655a0ae0a6, []int{0}
}

func (m *Build) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Build.Unmarshal(m, b)
}
func (m *Build) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Build.Marshal(b, m, deterministic)
}
func (m *Build) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Build.Merge(m, src)
}
func (m *Build) XXX_Size() int {
	return xxx_messageInfo_Build.Size(m)
}
func (m *Build) XXX_DiscardUnknown() {
	xxx_messageInfo_Build.DiscardUnknown(m)
}

var xxx_messageInfo_Build proto.InternalMessageInfo

func (m *Build) GetBuilderVersion() string {
	if m != nil {
		return m.BuilderVersion
	}
	return ""
}

func (m *Build) GetSignature() *BuildSignature {
	if m != nil {
		return m.Signature
	}
	return nil
}

// Message encapsulating the signature of the verified build.
type BuildSignature struct {
	// Public key of the builder which can be used to verify that the related
	// findings are valid and unchanged. If `key_type` is empty, this defaults
	// to PEM encoded public keys.
	//
	// This field may be empty if `key_id` references an external key.
	//
	// For Cloud Build based signatures, this is a PEM encoded public
	// key. To verify the Cloud Build signature, place the contents of
	// this field into a file (public.pem). The signature field is base64-decoded
	// into its binary representation in signature.bin, and the provenance bytes
	// from `BuildDetails` are base64-decoded into a binary representation in
	// signed.bin. OpenSSL can then verify the signature:
	// `openssl sha256 -verify public.pem -signature signature.bin signed.bin`
	PublicKey string `protobuf:"bytes,1,opt,name=public_key,json=publicKey,proto3" json:"public_key,omitempty"`
	// Required. Signature of the related `BuildProvenance`. In JSON, this is
	// base-64 encoded.
	Signature []byte `protobuf:"bytes,2,opt,name=signature,proto3" json:"signature,omitempty"`
	// An ID for the key used to sign. This could be either an ID for the key
	// stored in `public_key` (such as the ID or fingerprint for a PGP key, or the
	// CN for a cert), or a reference to an external key (such as a reference to a
	// key in Cloud Key Management Service).
	KeyId string `protobuf:"bytes,3,opt,name=key_id,json=keyId,proto3" json:"key_id,omitempty"`
	// The type of the key, either stored in `public_key` or referenced in
	// `key_id`.
	KeyType              BuildSignature_KeyType `protobuf:"varint,4,opt,name=key_type,json=keyType,proto3,enum=grafeas.v1beta1.build.BuildSignature_KeyType" json:"key_type,omitempty"`
	XXX_NoUnkeyedLiteral struct{}               `json:"-"`
	XXX_unrecognized     []byte                 `json:"-"`
	XXX_sizecache        int32                  `json:"-"`
}

func (m *BuildSignature) Reset()         { *m = BuildSignature{} }
func (m *BuildSignature) String() string { return proto.CompactTextString(m) }
func (*BuildSignature) ProtoMessage()    {}
func (*BuildSignature) Descriptor() ([]byte, []int) {
	return fileDescriptor_040ca5655a0ae0a6, []int{1}
}

func (m *BuildSignature) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_BuildSignature.Unmarshal(m, b)
}
func (m *BuildSignature) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_BuildSignature.Marshal(b, m, deterministic)
}
func (m *BuildSignature) XXX_Merge(src proto.Message) {
	xxx_messageInfo_BuildSignature.Merge(m, src)
}
func (m *BuildSignature) XXX_Size() int {
	return xxx_messageInfo_BuildSignature.Size(m)
}
func (m *BuildSignature) XXX_DiscardUnknown() {
	xxx_messageInfo_BuildSignature.DiscardUnknown(m)
}

var xxx_messageInfo_BuildSignature proto.InternalMessageInfo

func (m *BuildSignature) GetPublicKey() string {
	if m != nil {
		return m.PublicKey
	}
	return ""
}

func (m *BuildSignature) GetSignature() []byte {
	if m != nil {
		return m.Signature
	}
	return nil
}

func (m *BuildSignature) GetKeyId() string {
	if m != nil {
		return m.KeyId
	}
	return ""
}

func (m *BuildSignature) GetKeyType() BuildSignature_KeyType {
	if m != nil {
		return m.KeyType
	}
	return BuildSignature_KEY_TYPE_UNSPECIFIED
}

// Details of a build occurrence.
type Details struct {
	// Required. The actual provenance for the build.
	Provenance *provenance.BuildProvenance `protobuf:"bytes,1,opt,name=provenance,proto3" json:"provenance,omitempty"`
	// Serialized JSON representation of the provenance, used in generating the
	// build signature in the corresponding build note. After verifying the
	// signature, `provenance_bytes` can be unmarshalled and compared to the
	// provenance to confirm that it is unchanged. A base64-encoded string
	// representation of the provenance bytes is used for the signature in order
	// to interoperate with openssl which expects this format for signature
	// verification.
	//
	// The serialized form is captured both to avoid ambiguity in how the
	// provenance is marshalled to json as well to prevent incompatibilities with
	// future changes.
	ProvenanceBytes      string   `protobuf:"bytes,2,opt,name=provenance_bytes,json=provenanceBytes,proto3" json:"provenance_bytes,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Details) Reset()         { *m = Details{} }
func (m *Details) String() string { return proto.CompactTextString(m) }
func (*Details) ProtoMessage()    {}
func (*Details) Descriptor() ([]byte, []int) {
	return fileDescriptor_040ca5655a0ae0a6, []int{2}
}

func (m *Details) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Details.Unmarshal(m, b)
}
func (m *Details) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Details.Marshal(b, m, deterministic)
}
func (m *Details) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Details.Merge(m, src)
}
func (m *Details) XXX_Size() int {
	return xxx_messageInfo_Details.Size(m)
}
func (m *Details) XXX_DiscardUnknown() {
	xxx_messageInfo_Details.DiscardUnknown(m)
}

var xxx_messageInfo_Details proto.InternalMessageInfo

func (m *Details) GetProvenance() *provenance.BuildProvenance {
	if m != nil {
		return m.Provenance
	}
	return nil
}

func (m *Details) GetProvenanceBytes() string {
	if m != nil {
		return m.ProvenanceBytes
	}
	return ""
}

func init() {
	proto.RegisterEnum("grafeas.v1beta1.build.BuildSignature_KeyType", BuildSignature_KeyType_name, BuildSignature_KeyType_value)
	proto.RegisterType((*Build)(nil), "grafeas.v1beta1.build.Build")
	proto.RegisterType((*BuildSignature)(nil), "grafeas.v1beta1.build.BuildSignature")
	proto.RegisterType((*Details)(nil), "grafeas.v1beta1.build.Details")
}

func init() {
	proto.RegisterFile("google/devtools/containeranalysis/v1beta1/build/build.proto", fileDescriptor_040ca5655a0ae0a6)
}

var fileDescriptor_040ca5655a0ae0a6 = []byte{
	// 434 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x8c, 0x52, 0x4d, 0x6f, 0xd3, 0x40,
	0x10, 0xc5, 0x29, 0x6d, 0x9a, 0x69, 0x95, 0x86, 0x15, 0x91, 0x2c, 0x04, 0x52, 0x14, 0x09, 0x11,
	0x84, 0xb0, 0xd5, 0x70, 0xec, 0x29, 0x1f, 0xa6, 0xb5, 0xac, 0x82, 0xe5, 0x04, 0x44, 0xb9, 0xac,
	0xd6, 0xc9, 0x60, 0xad, 0x62, 0xed, 0x5a, 0xde, 0x4d, 0xc4, 0x1e, 0xf9, 0x2b, 0xfc, 0x4a, 0x8e,
	0x28, 0xeb, 0x40, 0x0c, 0xed, 0x21, 0x97, 0xd5, 0xcc, 0x9b, 0x99, 0x37, 0x6f, 0x67, 0x06, 0xae,
	0x32, 0x29, 0xb3, 0x1c, 0xfd, 0x25, 0x6e, 0xb4, 0x94, 0xb9, 0xf2, 0x17, 0x52, 0x68, 0xc6, 0x05,
	0x96, 0x4c, 0xb0, 0xdc, 0x28, 0xae, 0xfc, 0xcd, 0x65, 0x8a, 0x9a, 0x5d, 0xfa, 0xe9, 0x9a, 0xe7,
	0xcb, 0xea, 0xf5, 0x8a, 0x52, 0x6a, 0x49, 0xba, 0x59, 0xc9, 0xbe, 0x21, 0x53, 0xde, 0x2e, 0xc5,
	0xb3, 0xc1, 0x67, 0xc1, 0xe1, 0x9c, 0x45, 0x29, 0x37, 0x28, 0x98, 0x58, 0x60, 0xcd, 0xac, 0xd8,
	0xfb, 0x6b, 0x38, 0x1e, 0x6f, 0xf9, 0xc8, 0x2b, 0xb8, 0xb0, 0xc4, 0x58, 0xd2, 0x0d, 0x96, 0x8a,
	0x4b, 0xe1, 0x3a, 0x3d, 0x67, 0xd0, 0x4a, 0xda, 0x3b, 0xf8, 0x73, 0x85, 0x92, 0x09, 0xb4, 0x14,
	0xcf, 0x04, 0xd3, 0xeb, 0x12, 0xdd, 0x46, 0xcf, 0x19, 0x9c, 0x0d, 0x5f, 0x7a, 0x0f, 0x6a, 0xf4,
	0x2c, 0xf3, 0xec, 0x4f, 0x72, 0xb2, 0xaf, 0xeb, 0xff, 0x72, 0xa0, 0xfd, 0x6f, 0x94, 0xbc, 0x00,
	0x28, 0xd6, 0x69, 0xce, 0x17, 0x74, 0x85, 0x66, 0xd7, 0xbb, 0x55, 0x21, 0x11, 0x1a, 0xf2, 0xfc,
	0xff, 0xb6, 0xe7, 0x35, 0x3e, 0xd2, 0x85, 0x93, 0x15, 0x1a, 0xca, 0x97, 0xee, 0x91, 0x2d, 0x3c,
	0x5e, 0xa1, 0x09, 0x97, 0xe4, 0x06, 0x4e, 0xb7, 0xb0, 0x36, 0x05, 0xba, 0x8f, 0x7b, 0xce, 0xa0,
	0x3d, 0x7c, 0x7b, 0x90, 0x54, 0x2f, 0x42, 0x33, 0x37, 0x05, 0x26, 0xcd, 0x55, 0x65, 0xf4, 0x6f,
	0xa0, 0xb9, 0xc3, 0x88, 0x0b, 0x4f, 0xa3, 0xe0, 0x8e, 0xce, 0xef, 0xe2, 0x80, 0x7e, 0xfa, 0x30,
	0x8b, 0x83, 0x49, 0xf8, 0x3e, 0x0c, 0xa6, 0x9d, 0x47, 0xa4, 0x0b, 0x4f, 0xe2, 0xeb, 0x98, 0x8e,
	0x66, 0x93, 0x30, 0xa4, 0xa3, 0xe4, 0xf6, 0x63, 0x12, 0x4c, 0x3b, 0x0e, 0x39, 0x87, 0xd3, 0x38,
	0x0a, 0xbf, 0xd0, 0x38, 0xb8, 0xed, 0x34, 0xfa, 0x3f, 0x1c, 0x68, 0x4e, 0x51, 0x33, 0x9e, 0x2b,
	0x12, 0x01, 0xec, 0x37, 0x62, 0xff, 0x7c, 0x36, 0x7c, 0x73, 0x4f, 0x61, 0x6d, 0x69, 0x56, 0x66,
	0xfc, 0xd7, 0x4f, 0x6a, 0xe5, 0xe4, 0x35, 0x74, 0xf6, 0x1e, 0x4d, 0x8d, 0x46, 0x65, 0x07, 0xd5,
	0x4a, 0x2e, 0xf6, 0xf8, 0x78, 0x0b, 0x8f, 0xbf, 0x83, 0xcb, 0xe5, 0xc3, 0x93, 0x88, 0x9d, 0xaf,
	0xf3, 0xea, 0xb4, 0xbc, 0x4c, 0xe6, 0x4c, 0x64, 0x9e, 0x2c, 0x33, 0x3f, 0x43, 0x61, 0xef, 0xc5,
	0xaf, 0x42, 0xac, 0xe0, 0xea, 0xe0, 0x6b, 0xbe, 0xb2, 0xef, 0xcf, 0xc6, 0xd1, 0x75, 0x32, 0x4a,
	0x4f, 0x2c, 0xcd, 0xbb, 0xdf, 0x01, 0x00, 0x00, 0xff, 0xff, 0x06, 0x5a, 0x03, 0x5d, 0x13, 0x03,
	0x00, 0x00,
}
