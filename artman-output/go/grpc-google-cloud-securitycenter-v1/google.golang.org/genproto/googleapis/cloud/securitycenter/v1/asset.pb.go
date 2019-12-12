// Code generated by protoc-gen-go. DO NOT EDIT.
// source: google/cloud/securitycenter/v1/asset.proto

package securitycenter

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	_struct "github.com/golang/protobuf/ptypes/struct"
	timestamp "github.com/golang/protobuf/ptypes/timestamp"
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

// Cloud Security Command Center's (Cloud SCC) representation of a Google Cloud
// Platform (GCP) resource.
//
// The Asset is a Cloud SCC resource that captures information about a single
// GCP resource. All modifications to an Asset are only within the context of
// Cloud SCC and don't affect the referenced GCP resource.
type Asset struct {
	// The relative resource name of this asset. See:
	// https://cloud.google.com/apis/design/resource_names#relative_resource_name
	// Example:
	// "organizations/{organization_id}/assets/{asset_id}".
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// Cloud SCC managed properties. These properties are managed by
	// Cloud SCC and cannot be modified by the user.
	SecurityCenterProperties *Asset_SecurityCenterProperties `protobuf:"bytes,2,opt,name=security_center_properties,json=securityCenterProperties,proto3" json:"security_center_properties,omitempty"`
	// Resource managed properties. These properties are managed and defined by
	// the GCP resource and cannot be modified by the user.
	ResourceProperties map[string]*_struct.Value `protobuf:"bytes,7,rep,name=resource_properties,json=resourceProperties,proto3" json:"resource_properties,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
	// User specified security marks. These marks are entirely managed by the user
	// and come from the SecurityMarks resource that belongs to the asset.
	SecurityMarks *SecurityMarks `protobuf:"bytes,8,opt,name=security_marks,json=securityMarks,proto3" json:"security_marks,omitempty"`
	// The time at which the asset was created in Cloud SCC.
	CreateTime *timestamp.Timestamp `protobuf:"bytes,9,opt,name=create_time,json=createTime,proto3" json:"create_time,omitempty"`
	// The time at which the asset was last updated, added, or deleted in Cloud
	// SCC.
	UpdateTime *timestamp.Timestamp `protobuf:"bytes,10,opt,name=update_time,json=updateTime,proto3" json:"update_time,omitempty"`
	// IAM Policy information associated with the GCP resource described by the
	// Cloud SCC asset. This information is managed and defined by the GCP
	// resource and cannot be modified by the user.
	IamPolicy            *Asset_IamPolicy `protobuf:"bytes,11,opt,name=iam_policy,json=iamPolicy,proto3" json:"iam_policy,omitempty"`
	XXX_NoUnkeyedLiteral struct{}         `json:"-"`
	XXX_unrecognized     []byte           `json:"-"`
	XXX_sizecache        int32            `json:"-"`
}

func (m *Asset) Reset()         { *m = Asset{} }
func (m *Asset) String() string { return proto.CompactTextString(m) }
func (*Asset) ProtoMessage()    {}
func (*Asset) Descriptor() ([]byte, []int) {
	return fileDescriptor_8afac45fcf79e390, []int{0}
}

func (m *Asset) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Asset.Unmarshal(m, b)
}
func (m *Asset) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Asset.Marshal(b, m, deterministic)
}
func (m *Asset) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Asset.Merge(m, src)
}
func (m *Asset) XXX_Size() int {
	return xxx_messageInfo_Asset.Size(m)
}
func (m *Asset) XXX_DiscardUnknown() {
	xxx_messageInfo_Asset.DiscardUnknown(m)
}

var xxx_messageInfo_Asset proto.InternalMessageInfo

func (m *Asset) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *Asset) GetSecurityCenterProperties() *Asset_SecurityCenterProperties {
	if m != nil {
		return m.SecurityCenterProperties
	}
	return nil
}

func (m *Asset) GetResourceProperties() map[string]*_struct.Value {
	if m != nil {
		return m.ResourceProperties
	}
	return nil
}

func (m *Asset) GetSecurityMarks() *SecurityMarks {
	if m != nil {
		return m.SecurityMarks
	}
	return nil
}

func (m *Asset) GetCreateTime() *timestamp.Timestamp {
	if m != nil {
		return m.CreateTime
	}
	return nil
}

func (m *Asset) GetUpdateTime() *timestamp.Timestamp {
	if m != nil {
		return m.UpdateTime
	}
	return nil
}

func (m *Asset) GetIamPolicy() *Asset_IamPolicy {
	if m != nil {
		return m.IamPolicy
	}
	return nil
}

// Cloud SCC managed properties. These properties are managed by Cloud SCC and
// cannot be modified by the user.
type Asset_SecurityCenterProperties struct {
	// The full resource name of the GCP resource this asset
	// represents. This field is immutable after create time. See:
	// https://cloud.google.com/apis/design/resource_names#full_resource_name
	ResourceName string `protobuf:"bytes,1,opt,name=resource_name,json=resourceName,proto3" json:"resource_name,omitempty"`
	// The type of the GCP resource. Examples include: APPLICATION,
	// PROJECT, and ORGANIZATION. This is a case insensitive field defined by
	// Cloud SCC and/or the producer of the resource and is immutable
	// after create time.
	ResourceType string `protobuf:"bytes,2,opt,name=resource_type,json=resourceType,proto3" json:"resource_type,omitempty"`
	// The full resource name of the immediate parent of the resource. See:
	// https://cloud.google.com/apis/design/resource_names#full_resource_name
	ResourceParent string `protobuf:"bytes,3,opt,name=resource_parent,json=resourceParent,proto3" json:"resource_parent,omitempty"`
	// The full resource name of the project the resource belongs to. See:
	// https://cloud.google.com/apis/design/resource_names#full_resource_name
	ResourceProject string `protobuf:"bytes,4,opt,name=resource_project,json=resourceProject,proto3" json:"resource_project,omitempty"`
	// Owners of the Google Cloud resource.
	ResourceOwners       []string `protobuf:"bytes,5,rep,name=resource_owners,json=resourceOwners,proto3" json:"resource_owners,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Asset_SecurityCenterProperties) Reset()         { *m = Asset_SecurityCenterProperties{} }
func (m *Asset_SecurityCenterProperties) String() string { return proto.CompactTextString(m) }
func (*Asset_SecurityCenterProperties) ProtoMessage()    {}
func (*Asset_SecurityCenterProperties) Descriptor() ([]byte, []int) {
	return fileDescriptor_8afac45fcf79e390, []int{0, 0}
}

func (m *Asset_SecurityCenterProperties) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Asset_SecurityCenterProperties.Unmarshal(m, b)
}
func (m *Asset_SecurityCenterProperties) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Asset_SecurityCenterProperties.Marshal(b, m, deterministic)
}
func (m *Asset_SecurityCenterProperties) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Asset_SecurityCenterProperties.Merge(m, src)
}
func (m *Asset_SecurityCenterProperties) XXX_Size() int {
	return xxx_messageInfo_Asset_SecurityCenterProperties.Size(m)
}
func (m *Asset_SecurityCenterProperties) XXX_DiscardUnknown() {
	xxx_messageInfo_Asset_SecurityCenterProperties.DiscardUnknown(m)
}

var xxx_messageInfo_Asset_SecurityCenterProperties proto.InternalMessageInfo

func (m *Asset_SecurityCenterProperties) GetResourceName() string {
	if m != nil {
		return m.ResourceName
	}
	return ""
}

func (m *Asset_SecurityCenterProperties) GetResourceType() string {
	if m != nil {
		return m.ResourceType
	}
	return ""
}

func (m *Asset_SecurityCenterProperties) GetResourceParent() string {
	if m != nil {
		return m.ResourceParent
	}
	return ""
}

func (m *Asset_SecurityCenterProperties) GetResourceProject() string {
	if m != nil {
		return m.ResourceProject
	}
	return ""
}

func (m *Asset_SecurityCenterProperties) GetResourceOwners() []string {
	if m != nil {
		return m.ResourceOwners
	}
	return nil
}

// IAM Policy information associated with the GCP resource described by the
// Cloud SCC asset. This information is managed and defined by the GCP
// resource and cannot be modified by the user.
type Asset_IamPolicy struct {
	// The JSON representation of the Policy associated with the asset.
	// See https://cloud.google.com/iam/reference/rest/v1/Policy for format
	// details.
	PolicyBlob           string   `protobuf:"bytes,1,opt,name=policy_blob,json=policyBlob,proto3" json:"policy_blob,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Asset_IamPolicy) Reset()         { *m = Asset_IamPolicy{} }
func (m *Asset_IamPolicy) String() string { return proto.CompactTextString(m) }
func (*Asset_IamPolicy) ProtoMessage()    {}
func (*Asset_IamPolicy) Descriptor() ([]byte, []int) {
	return fileDescriptor_8afac45fcf79e390, []int{0, 1}
}

func (m *Asset_IamPolicy) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Asset_IamPolicy.Unmarshal(m, b)
}
func (m *Asset_IamPolicy) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Asset_IamPolicy.Marshal(b, m, deterministic)
}
func (m *Asset_IamPolicy) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Asset_IamPolicy.Merge(m, src)
}
func (m *Asset_IamPolicy) XXX_Size() int {
	return xxx_messageInfo_Asset_IamPolicy.Size(m)
}
func (m *Asset_IamPolicy) XXX_DiscardUnknown() {
	xxx_messageInfo_Asset_IamPolicy.DiscardUnknown(m)
}

var xxx_messageInfo_Asset_IamPolicy proto.InternalMessageInfo

func (m *Asset_IamPolicy) GetPolicyBlob() string {
	if m != nil {
		return m.PolicyBlob
	}
	return ""
}

func init() {
	proto.RegisterType((*Asset)(nil), "google.cloud.securitycenter.v1.Asset")
	proto.RegisterMapType((map[string]*_struct.Value)(nil), "google.cloud.securitycenter.v1.Asset.ResourcePropertiesEntry")
	proto.RegisterType((*Asset_SecurityCenterProperties)(nil), "google.cloud.securitycenter.v1.Asset.SecurityCenterProperties")
	proto.RegisterType((*Asset_IamPolicy)(nil), "google.cloud.securitycenter.v1.Asset.IamPolicy")
}

func init() {
	proto.RegisterFile("google/cloud/securitycenter/v1/asset.proto", fileDescriptor_8afac45fcf79e390)
}

var fileDescriptor_8afac45fcf79e390 = []byte{
	// 627 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x8c, 0x54, 0xdd, 0x6e, 0xd3, 0x3c,
	0x18, 0x56, 0xda, 0xed, 0xdb, 0x57, 0x97, 0xfd, 0xc8, 0x48, 0x10, 0x22, 0xb4, 0x95, 0xed, 0x80,
	0x02, 0x23, 0x56, 0xb7, 0x13, 0x94, 0x09, 0xa4, 0x6d, 0x42, 0x08, 0x09, 0x46, 0x15, 0x4a, 0x0f,
	0x50, 0x51, 0xe5, 0x66, 0x26, 0x0a, 0x4b, 0xec, 0xc8, 0x76, 0x8a, 0xc2, 0xd8, 0x0d, 0x71, 0x29,
	0x5c, 0x02, 0x67, 0x9c, 0xee, 0x8c, 0x3b, 0x40, 0xb1, 0x93, 0x34, 0xd9, 0x54, 0xba, 0xa3, 0xd8,
	0xef, 0xfb, 0x3c, 0xcf, 0xfb, 0x1b, 0x83, 0xc7, 0x3e, 0x63, 0x7e, 0x48, 0x90, 0x17, 0xb2, 0xe4,
	0x14, 0x09, 0xe2, 0x25, 0x3c, 0x90, 0xa9, 0x47, 0xa8, 0x24, 0x1c, 0x4d, 0x7b, 0x08, 0x0b, 0x41,
	0xa4, 0x1d, 0x73, 0x26, 0x19, 0xdc, 0xd4, 0x58, 0x5b, 0x61, 0xed, 0x3a, 0xd6, 0x9e, 0xf6, 0xac,
	0xfb, 0xb9, 0x16, 0x8e, 0x03, 0x84, 0x29, 0x65, 0x12, 0xcb, 0x80, 0x51, 0xa1, 0xd9, 0xd6, 0xbd,
	0x8a, 0x97, 0x13, 0xc1, 0x12, 0xee, 0x91, 0xdc, 0xb5, 0xbf, 0x20, 0x89, 0xc2, 0x32, 0x8e, 0x30,
	0x3f, 0x2b, 0xf4, 0x8a, 0x68, 0xea, 0x36, 0x49, 0x3e, 0x23, 0x21, 0x79, 0xe2, 0xe5, 0xb9, 0x5a,
	0x5b, 0x57, 0xbd, 0x32, 0x88, 0x88, 0x90, 0x38, 0x8a, 0x35, 0x60, 0xfb, 0xcf, 0x0a, 0x58, 0x3e,
	0xcc, 0x8a, 0x83, 0x10, 0x2c, 0x51, 0x1c, 0x11, 0xd3, 0xe8, 0x18, 0xdd, 0x96, 0xab, 0xce, 0xf0,
	0x3b, 0xb0, 0xca, 0xa0, 0x3a, 0x8f, 0x71, 0xcc, 0x59, 0x4c, 0xb8, 0x0c, 0x88, 0x30, 0x1b, 0x1d,
	0xa3, 0xdb, 0xde, 0x7b, 0x61, 0xff, 0xbb, 0x1f, 0xb6, 0x92, 0xb7, 0xdf, 0xe7, 0xf6, 0x63, 0x65,
	0xef, 0x97, 0x2a, 0xae, 0x29, 0xe6, 0x78, 0x20, 0x05, 0xb7, 0x8b, 0x0e, 0x55, 0xc3, 0xae, 0x74,
	0x9a, 0xdd, 0xf6, 0xde, 0xf3, 0x9b, 0x85, 0x75, 0x73, 0x81, 0x99, 0xec, 0x4b, 0x2a, 0x79, 0xea,
	0x42, 0x7e, 0xcd, 0x01, 0x07, 0x60, 0xad, 0xde, 0x62, 0xf3, 0x7f, 0x55, 0xe1, 0xd3, 0x45, 0xa1,
	0x8a, 0xda, 0xde, 0x66, 0x24, 0x77, 0x55, 0x54, 0xaf, 0xf0, 0x00, 0xb4, 0x3d, 0x4e, 0xb0, 0x24,
	0xe3, 0xac, 0xf7, 0x66, 0x4b, 0x49, 0x5a, 0x85, 0x64, 0x31, 0x18, 0x7b, 0x50, 0x0c, 0xc6, 0x05,
	0x1a, 0x9e, 0x19, 0x32, 0x72, 0x12, 0x9f, 0x96, 0x64, 0xb0, 0x98, 0xac, 0xe1, 0x8a, 0x7c, 0x02,
	0x40, 0x80, 0xa3, 0x71, 0xcc, 0xc2, 0xc0, 0x4b, 0xcd, 0xb6, 0xe2, 0xa2, 0x9b, 0xb5, 0xed, 0x35,
	0x8e, 0xfa, 0x8a, 0xe6, 0xb6, 0x82, 0xe2, 0x68, 0xfd, 0x36, 0x80, 0x39, 0x6f, 0x8c, 0x70, 0x07,
	0xac, 0x96, 0xc3, 0xaa, 0xec, 0xd1, 0xad, 0xc2, 0x78, 0x92, 0xed, 0x53, 0x15, 0x24, 0xd3, 0x98,
	0xa8, 0x15, 0xaa, 0x80, 0x06, 0x69, 0x4c, 0xe0, 0x43, 0xb0, 0x3e, 0x1b, 0x3b, 0xe6, 0x84, 0x4a,
	0xb3, 0xa9, 0x60, 0x6b, 0xe5, 0xcc, 0x94, 0x15, 0x3e, 0x02, 0x1b, 0xd5, 0xfd, 0xf8, 0x42, 0x3c,
	0x69, 0x2e, 0x29, 0xe4, 0x7a, 0x65, 0xba, 0x99, 0xb9, 0xa6, 0xc9, 0xbe, 0x52, 0xc2, 0x85, 0xb9,
	0xdc, 0x69, 0x56, 0x35, 0xdf, 0x29, 0xab, 0xb5, 0x0b, 0x5a, 0x65, 0xed, 0x70, 0x0b, 0xb4, 0x75,
	0xf3, 0xc6, 0x93, 0x90, 0x4d, 0xf2, 0x8a, 0x80, 0x36, 0x1d, 0x85, 0x6c, 0x62, 0x7d, 0x02, 0x77,
	0xe7, 0x2c, 0x18, 0xdc, 0x00, 0xcd, 0x33, 0x92, 0xe6, 0x9c, 0xec, 0x08, 0x77, 0xc1, 0xf2, 0x14,
	0x87, 0x09, 0xc9, 0xff, 0x9b, 0x3b, 0xd7, 0xa6, 0x38, 0xcc, 0xbc, 0xae, 0x06, 0x39, 0x8d, 0x67,
	0x86, 0xf3, 0xe1, 0xf2, 0xd0, 0x05, 0x3b, 0x57, 0x66, 0xa4, 0x59, 0x38, 0x0e, 0x84, 0xed, 0xb1,
	0x08, 0xe9, 0x9f, 0xf7, 0x09, 0xe3, 0x3e, 0xa6, 0xc1, 0x37, 0xfd, 0xd4, 0xa0, 0xf3, 0xea, 0xf5,
	0x42, 0xbf, 0x5e, 0x02, 0x9d, 0xab, 0xef, 0xc5, 0xd1, 0x2f, 0x03, 0x6c, 0x7b, 0x2c, 0x5a, 0xb0,
	0x09, 0x7d, 0xe3, 0xe3, 0x9b, 0x1c, 0xe1, 0xb3, 0x10, 0x53, 0xdf, 0x66, 0xdc, 0x47, 0x3e, 0xa1,
	0x2a, 0x5f, 0x34, 0x4b, 0x63, 0xde, 0x7b, 0x75, 0x50, 0xb7, 0xfc, 0x68, 0x6c, 0xbe, 0xd2, 0x72,
	0xc7, 0x2a, 0x60, 0x7d, 0x93, 0xec, 0x61, 0xef, 0x67, 0x01, 0x18, 0x29, 0xc0, 0xa8, 0x0e, 0x18,
	0x0d, 0x7b, 0x97, 0x8d, 0x07, 0x1a, 0xe0, 0x38, 0x0a, 0xe1, 0x38, 0x75, 0x88, 0xe3, 0x0c, 0x7b,
	0x93, 0xff, 0x54, 0x7a, 0xfb, 0x7f, 0x03, 0x00, 0x00, 0xff, 0xff, 0x1c, 0xf7, 0x02, 0x3f, 0xd2,
	0x05, 0x00, 0x00,
}
