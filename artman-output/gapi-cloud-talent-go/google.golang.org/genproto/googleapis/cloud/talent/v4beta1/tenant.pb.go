// Code generated by protoc-gen-go. DO NOT EDIT.
// source: google/cloud/talent/v4beta1/tenant.proto

package talent

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	_ "github.com/golang/protobuf/ptypes/timestamp"
	_ "google.golang.org/genproto/googleapis/api/annotations"
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

// Enum that represents how user data owned by the tenant is used.
type Tenant_DataUsageType int32

const (
	// Default value.
	Tenant_DATA_USAGE_TYPE_UNSPECIFIED Tenant_DataUsageType = 0
	// Data owned by this tenant is used to improve search/recommendation
	// quality across tenants.
	Tenant_AGGREGATED Tenant_DataUsageType = 1
	// Data owned by this tenant is used to improve search/recommendation
	// quality for this tenant only.
	Tenant_ISOLATED Tenant_DataUsageType = 2
)

var Tenant_DataUsageType_name = map[int32]string{
	0: "DATA_USAGE_TYPE_UNSPECIFIED",
	1: "AGGREGATED",
	2: "ISOLATED",
}

var Tenant_DataUsageType_value = map[string]int32{
	"DATA_USAGE_TYPE_UNSPECIFIED": 0,
	"AGGREGATED":                  1,
	"ISOLATED":                    2,
}

func (x Tenant_DataUsageType) String() string {
	return proto.EnumName(Tenant_DataUsageType_name, int32(x))
}

func (Tenant_DataUsageType) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_4b0da31c41aea5f3, []int{0, 0}
}

// A Tenant resource represents a tenant in the service. A tenant is a group or
// entity that shares common access with specific privileges for resources like
// profiles. Customer may create multiple tenants to provide data isolation for
// different groups.
type Tenant struct {
	// Required during tenant update.
	//
	// The resource name for a tenant. This is generated by the service when a
	// tenant is created.
	//
	// The format is "projects/{project_id}/tenants/{tenant_id}", for example,
	// "projects/foo/tenants/bar".
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// Required. Client side tenant identifier, used to uniquely identify the tenant.
	//
	// The maximum number of allowed characters is 255.
	ExternalId string `protobuf:"bytes,2,opt,name=external_id,json=externalId,proto3" json:"external_id,omitempty"`
	// Indicates whether data owned by this tenant may be used to provide product
	// improvements across other tenants.
	//
	// Defaults behavior is [DataUsageType.ISOLATED][google.cloud.talent.v4beta1.Tenant.DataUsageType.ISOLATED] if it's unset.
	UsageType Tenant_DataUsageType `protobuf:"varint,3,opt,name=usage_type,json=usageType,proto3,enum=google.cloud.talent.v4beta1.Tenant_DataUsageType" json:"usage_type,omitempty"`
	// A list of keys of filterable [Profile.custom_attributes][google.cloud.talent.v4beta1.Profile.custom_attributes], whose
	// corresponding `string_values` are used in keyword searches. Profiles with
	// `string_values` under these specified field keys are returned if any
	// of the values match the search keyword. Custom field values with
	// parenthesis, brackets and special symbols are not searchable as-is,
	// and must be surrounded by quotes.
	KeywordSearchableProfileCustomAttributes []string `protobuf:"bytes,4,rep,name=keyword_searchable_profile_custom_attributes,json=keywordSearchableProfileCustomAttributes,proto3" json:"keyword_searchable_profile_custom_attributes,omitempty"`
	XXX_NoUnkeyedLiteral                     struct{} `json:"-"`
	XXX_unrecognized                         []byte   `json:"-"`
	XXX_sizecache                            int32    `json:"-"`
}

func (m *Tenant) Reset()         { *m = Tenant{} }
func (m *Tenant) String() string { return proto.CompactTextString(m) }
func (*Tenant) ProtoMessage()    {}
func (*Tenant) Descriptor() ([]byte, []int) {
	return fileDescriptor_4b0da31c41aea5f3, []int{0}
}

func (m *Tenant) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Tenant.Unmarshal(m, b)
}
func (m *Tenant) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Tenant.Marshal(b, m, deterministic)
}
func (m *Tenant) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Tenant.Merge(m, src)
}
func (m *Tenant) XXX_Size() int {
	return xxx_messageInfo_Tenant.Size(m)
}
func (m *Tenant) XXX_DiscardUnknown() {
	xxx_messageInfo_Tenant.DiscardUnknown(m)
}

var xxx_messageInfo_Tenant proto.InternalMessageInfo

func (m *Tenant) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *Tenant) GetExternalId() string {
	if m != nil {
		return m.ExternalId
	}
	return ""
}

func (m *Tenant) GetUsageType() Tenant_DataUsageType {
	if m != nil {
		return m.UsageType
	}
	return Tenant_DATA_USAGE_TYPE_UNSPECIFIED
}

func (m *Tenant) GetKeywordSearchableProfileCustomAttributes() []string {
	if m != nil {
		return m.KeywordSearchableProfileCustomAttributes
	}
	return nil
}

func init() {
	proto.RegisterEnum("google.cloud.talent.v4beta1.Tenant_DataUsageType", Tenant_DataUsageType_name, Tenant_DataUsageType_value)
	proto.RegisterType((*Tenant)(nil), "google.cloud.talent.v4beta1.Tenant")
}

func init() {
	proto.RegisterFile("google/cloud/talent/v4beta1/tenant.proto", fileDescriptor_4b0da31c41aea5f3)
}

var fileDescriptor_4b0da31c41aea5f3 = []byte{
	// 483 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x8c, 0x93, 0x41, 0x6f, 0xd3, 0x3e,
	0x14, 0xc0, 0xff, 0x69, 0xa7, 0xe9, 0x5f, 0x03, 0xd3, 0x64, 0x2e, 0xa5, 0x43, 0x6a, 0xb5, 0x71,
	0xe8, 0x01, 0xc5, 0x1a, 0x70, 0x82, 0x93, 0xdb, 0x86, 0xaa, 0x12, 0xda, 0xa2, 0x34, 0x3d, 0xc0,
	0x61, 0x96, 0x93, 0xbe, 0x66, 0x19, 0x89, 0x1d, 0xd9, 0xce, 0xa0, 0x9a, 0xf6, 0x05, 0xf8, 0x18,
	0x7c, 0x32, 0xc4, 0x71, 0x9f, 0x02, 0x35, 0x76, 0xc7, 0x10, 0x30, 0x71, 0x7b, 0x2f, 0xef, 0xf7,
	0x7b, 0xcf, 0x4e, 0x5e, 0xd0, 0x30, 0x93, 0x32, 0x2b, 0x80, 0xa4, 0x85, 0xac, 0x97, 0xc4, 0xf0,
	0x02, 0x84, 0x21, 0x97, 0xaf, 0x12, 0x30, 0xfc, 0x98, 0x18, 0x10, 0x5c, 0x18, 0xbf, 0x52, 0xd2,
	0x48, 0x7c, 0x60, 0x49, 0xbf, 0x21, 0x7d, 0x4b, 0xfa, 0x8e, 0xec, 0xf5, 0x5d, 0x1b, 0x5e, 0xe5,
	0x64, 0x95, 0x43, 0xb1, 0x64, 0x09, 0x9c, 0xf3, 0xcb, 0x5c, 0x2a, 0x6b, 0xf7, 0x9e, 0xdc, 0x01,
	0x14, 0x68, 0x59, 0xab, 0x14, 0x5c, 0x69, 0xeb, 0x36, 0x59, 0x52, 0xaf, 0x88, 0xc9, 0x4b, 0xd0,
	0x86, 0x97, 0x95, 0x03, 0x9e, 0xde, 0x71, 0xb9, 0x10, 0xd2, 0x70, 0x93, 0x4b, 0xa1, 0x6d, 0xf5,
	0xf0, 0x4b, 0x1b, 0xed, 0xc6, 0xcd, 0x41, 0x31, 0x46, 0x3b, 0x82, 0x97, 0xd0, 0xf5, 0x06, 0xde,
	0xb0, 0x13, 0x35, 0x31, 0x7e, 0x86, 0x1e, 0xc0, 0x67, 0x03, 0x4a, 0xf0, 0x82, 0xe5, 0xcb, 0x6e,
	0x6b, 0x53, 0x1a, 0xb5, 0xbf, 0xd1, 0x56, 0x84, 0xb6, 0xcf, 0x67, 0x4b, 0x1c, 0x22, 0x54, 0x6b,
	0x9e, 0x01, 0x33, 0xeb, 0x0a, 0xba, 0xed, 0x81, 0x37, 0xdc, 0x7b, 0x71, 0xec, 0xdf, 0x73, 0x63,
	0xdf, 0x8e, 0xf4, 0x27, 0xdc, 0xf0, 0xc5, 0xc6, 0x8c, 0xd7, 0x15, 0x44, 0x9d, 0x7a, 0x1b, 0xe2,
	0x33, 0xf4, 0xfc, 0x23, 0xac, 0x3f, 0x49, 0xb5, 0x64, 0x1a, 0xb8, 0x4a, 0xcf, 0x79, 0x52, 0x00,
	0xab, 0x94, 0x5c, 0xe5, 0x05, 0xb0, 0xb4, 0xd6, 0x46, 0x96, 0x8c, 0x1b, 0xa3, 0xf2, 0xa4, 0x36,
	0xa0, 0xbb, 0x3b, 0x83, 0xf6, 0xb0, 0x13, 0x0d, 0x9d, 0x33, 0xbf, 0x55, 0x42, 0x6b, 0x8c, 0x1b,
	0x81, 0xde, 0xf2, 0x87, 0x27, 0xe8, 0xd1, 0x2f, 0xb3, 0x71, 0x1f, 0x1d, 0x4c, 0x68, 0x4c, 0xd9,
	0x62, 0x4e, 0xa7, 0x01, 0x8b, 0xdf, 0x87, 0x01, 0x5b, 0x9c, 0xcc, 0xc3, 0x60, 0x3c, 0x7b, 0x3b,
	0x0b, 0x26, 0xfb, 0xff, 0xe1, 0x3d, 0x84, 0xe8, 0x74, 0x1a, 0x05, 0x53, 0x1a, 0x07, 0x93, 0x7d,
	0x0f, 0x3f, 0x44, 0xff, 0xcf, 0xe6, 0xa7, 0xef, 0x9a, 0xac, 0xf5, 0x7a, 0x72, 0x43, 0x29, 0xea,
	0x5d, 0xc8, 0x44, 0xbb, 0x6b, 0xf3, 0x2a, 0xd7, 0x7e, 0x2a, 0x4b, 0xe2, 0x5e, 0xee, 0x51, 0xa5,
	0xe4, 0x05, 0xa4, 0x46, 0x93, 0x2b, 0x17, 0x5d, 0xbb, 0x05, 0xd1, 0xe4, 0xca, 0x06, 0xd7, 0xa3,
	0xef, 0xde, 0x0d, 0x3d, 0x43, 0x47, 0x7f, 0x6f, 0x73, 0xaa, 0x42, 0x2b, 0xff, 0x53, 0x3f, 0x8c,
	0x7f, 0x87, 0x50, 0x3f, 0x95, 0xe5, 0x7d, 0x9f, 0x66, 0xf4, 0xd8, 0x8e, 0x8a, 0xdc, 0x9a, 0x85,
	0x9b, 0x35, 0x09, 0xbd, 0x0f, 0xd4, 0x39, 0x99, 0x2c, 0xb8, 0xc8, 0x7c, 0xa9, 0x32, 0x92, 0x81,
	0x68, 0x96, 0x88, 0xfc, 0x3c, 0xeb, 0x1f, 0xff, 0x84, 0x37, 0x36, 0xfd, 0xda, 0x6a, 0x8f, 0xe3,
	0x79, 0xb2, 0xdb, 0x38, 0x2f, 0x7f, 0x04, 0x00, 0x00, 0xff, 0xff, 0x53, 0x34, 0x80, 0xd9, 0x3c,
	0x03, 0x00, 0x00,
}
