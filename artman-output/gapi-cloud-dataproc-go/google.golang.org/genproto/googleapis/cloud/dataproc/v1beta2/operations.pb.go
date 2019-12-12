// Code generated by protoc-gen-go. DO NOT EDIT.
// source: google/cloud/dataproc/v1beta2/operations.proto

package dataproc

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
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

// The operation state.
type ClusterOperationStatus_State int32

const (
	// Unused.
	ClusterOperationStatus_UNKNOWN ClusterOperationStatus_State = 0
	// The operation has been created.
	ClusterOperationStatus_PENDING ClusterOperationStatus_State = 1
	// The operation is running.
	ClusterOperationStatus_RUNNING ClusterOperationStatus_State = 2
	// The operation is done; either cancelled or completed.
	ClusterOperationStatus_DONE ClusterOperationStatus_State = 3
)

var ClusterOperationStatus_State_name = map[int32]string{
	0: "UNKNOWN",
	1: "PENDING",
	2: "RUNNING",
	3: "DONE",
}

var ClusterOperationStatus_State_value = map[string]int32{
	"UNKNOWN": 0,
	"PENDING": 1,
	"RUNNING": 2,
	"DONE":    3,
}

func (x ClusterOperationStatus_State) String() string {
	return proto.EnumName(ClusterOperationStatus_State_name, int32(x))
}

func (ClusterOperationStatus_State) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_e6e7a565fff113fd, []int{0, 0}
}

// The status of the operation.
type ClusterOperationStatus struct {
	// Output only. A message containing the operation state.
	State ClusterOperationStatus_State `protobuf:"varint,1,opt,name=state,proto3,enum=google.cloud.dataproc.v1beta2.ClusterOperationStatus_State" json:"state,omitempty"`
	// Output only. A message containing the detailed operation state.
	InnerState string `protobuf:"bytes,2,opt,name=inner_state,json=innerState,proto3" json:"inner_state,omitempty"`
	// Output only. A message containing any operation metadata details.
	Details string `protobuf:"bytes,3,opt,name=details,proto3" json:"details,omitempty"`
	// Output only. The time this state was entered.
	StateStartTime       *timestamp.Timestamp `protobuf:"bytes,4,opt,name=state_start_time,json=stateStartTime,proto3" json:"state_start_time,omitempty"`
	XXX_NoUnkeyedLiteral struct{}             `json:"-"`
	XXX_unrecognized     []byte               `json:"-"`
	XXX_sizecache        int32                `json:"-"`
}

func (m *ClusterOperationStatus) Reset()         { *m = ClusterOperationStatus{} }
func (m *ClusterOperationStatus) String() string { return proto.CompactTextString(m) }
func (*ClusterOperationStatus) ProtoMessage()    {}
func (*ClusterOperationStatus) Descriptor() ([]byte, []int) {
	return fileDescriptor_e6e7a565fff113fd, []int{0}
}

func (m *ClusterOperationStatus) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ClusterOperationStatus.Unmarshal(m, b)
}
func (m *ClusterOperationStatus) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ClusterOperationStatus.Marshal(b, m, deterministic)
}
func (m *ClusterOperationStatus) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ClusterOperationStatus.Merge(m, src)
}
func (m *ClusterOperationStatus) XXX_Size() int {
	return xxx_messageInfo_ClusterOperationStatus.Size(m)
}
func (m *ClusterOperationStatus) XXX_DiscardUnknown() {
	xxx_messageInfo_ClusterOperationStatus.DiscardUnknown(m)
}

var xxx_messageInfo_ClusterOperationStatus proto.InternalMessageInfo

func (m *ClusterOperationStatus) GetState() ClusterOperationStatus_State {
	if m != nil {
		return m.State
	}
	return ClusterOperationStatus_UNKNOWN
}

func (m *ClusterOperationStatus) GetInnerState() string {
	if m != nil {
		return m.InnerState
	}
	return ""
}

func (m *ClusterOperationStatus) GetDetails() string {
	if m != nil {
		return m.Details
	}
	return ""
}

func (m *ClusterOperationStatus) GetStateStartTime() *timestamp.Timestamp {
	if m != nil {
		return m.StateStartTime
	}
	return nil
}

// Metadata describing the operation.
type ClusterOperationMetadata struct {
	// Output only. Name of the cluster for the operation.
	ClusterName string `protobuf:"bytes,7,opt,name=cluster_name,json=clusterName,proto3" json:"cluster_name,omitempty"`
	// Output only. Cluster UUID for the operation.
	ClusterUuid string `protobuf:"bytes,8,opt,name=cluster_uuid,json=clusterUuid,proto3" json:"cluster_uuid,omitempty"`
	// Output only. Current operation status.
	Status *ClusterOperationStatus `protobuf:"bytes,9,opt,name=status,proto3" json:"status,omitempty"`
	// Output only. The previous operation status.
	StatusHistory []*ClusterOperationStatus `protobuf:"bytes,10,rep,name=status_history,json=statusHistory,proto3" json:"status_history,omitempty"`
	// Output only. The operation type.
	OperationType string `protobuf:"bytes,11,opt,name=operation_type,json=operationType,proto3" json:"operation_type,omitempty"`
	// Output only. Short description of operation.
	Description string `protobuf:"bytes,12,opt,name=description,proto3" json:"description,omitempty"`
	// Output only. Labels associated with the operation
	Labels map[string]string `protobuf:"bytes,13,rep,name=labels,proto3" json:"labels,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
	// Output only. Errors encountered during operation execution.
	Warnings             []string `protobuf:"bytes,14,rep,name=warnings,proto3" json:"warnings,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *ClusterOperationMetadata) Reset()         { *m = ClusterOperationMetadata{} }
func (m *ClusterOperationMetadata) String() string { return proto.CompactTextString(m) }
func (*ClusterOperationMetadata) ProtoMessage()    {}
func (*ClusterOperationMetadata) Descriptor() ([]byte, []int) {
	return fileDescriptor_e6e7a565fff113fd, []int{1}
}

func (m *ClusterOperationMetadata) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ClusterOperationMetadata.Unmarshal(m, b)
}
func (m *ClusterOperationMetadata) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ClusterOperationMetadata.Marshal(b, m, deterministic)
}
func (m *ClusterOperationMetadata) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ClusterOperationMetadata.Merge(m, src)
}
func (m *ClusterOperationMetadata) XXX_Size() int {
	return xxx_messageInfo_ClusterOperationMetadata.Size(m)
}
func (m *ClusterOperationMetadata) XXX_DiscardUnknown() {
	xxx_messageInfo_ClusterOperationMetadata.DiscardUnknown(m)
}

var xxx_messageInfo_ClusterOperationMetadata proto.InternalMessageInfo

func (m *ClusterOperationMetadata) GetClusterName() string {
	if m != nil {
		return m.ClusterName
	}
	return ""
}

func (m *ClusterOperationMetadata) GetClusterUuid() string {
	if m != nil {
		return m.ClusterUuid
	}
	return ""
}

func (m *ClusterOperationMetadata) GetStatus() *ClusterOperationStatus {
	if m != nil {
		return m.Status
	}
	return nil
}

func (m *ClusterOperationMetadata) GetStatusHistory() []*ClusterOperationStatus {
	if m != nil {
		return m.StatusHistory
	}
	return nil
}

func (m *ClusterOperationMetadata) GetOperationType() string {
	if m != nil {
		return m.OperationType
	}
	return ""
}

func (m *ClusterOperationMetadata) GetDescription() string {
	if m != nil {
		return m.Description
	}
	return ""
}

func (m *ClusterOperationMetadata) GetLabels() map[string]string {
	if m != nil {
		return m.Labels
	}
	return nil
}

func (m *ClusterOperationMetadata) GetWarnings() []string {
	if m != nil {
		return m.Warnings
	}
	return nil
}

func init() {
	proto.RegisterEnum("google.cloud.dataproc.v1beta2.ClusterOperationStatus_State", ClusterOperationStatus_State_name, ClusterOperationStatus_State_value)
	proto.RegisterType((*ClusterOperationStatus)(nil), "google.cloud.dataproc.v1beta2.ClusterOperationStatus")
	proto.RegisterType((*ClusterOperationMetadata)(nil), "google.cloud.dataproc.v1beta2.ClusterOperationMetadata")
	proto.RegisterMapType((map[string]string)(nil), "google.cloud.dataproc.v1beta2.ClusterOperationMetadata.LabelsEntry")
}

func init() {
	proto.RegisterFile("google/cloud/dataproc/v1beta2/operations.proto", fileDescriptor_e6e7a565fff113fd)
}

var fileDescriptor_e6e7a565fff113fd = []byte{
	// 537 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x9c, 0x54, 0x5f, 0x8b, 0xd3, 0x4e,
	0x14, 0xfd, 0xa5, 0xff, 0x7b, 0xb3, 0xed, 0xaf, 0x0c, 0x22, 0x43, 0x51, 0x36, 0x5b, 0x10, 0xfa,
	0x94, 0x60, 0x45, 0x58, 0xdd, 0xb7, 0xdd, 0x16, 0x15, 0xdd, 0xb4, 0x66, 0xb7, 0x08, 0x2a, 0x94,
	0x69, 0x33, 0xc6, 0x60, 0x3a, 0x13, 0x66, 0x26, 0x2b, 0x7d, 0xf0, 0x0b, 0xf8, 0x41, 0xfc, 0x9c,
	0x32, 0x33, 0x49, 0xa9, 0xa2, 0x0b, 0xee, 0x53, 0xe7, 0x9e, 0x39, 0xe7, 0xcc, 0xb9, 0xb7, 0x97,
	0x80, 0x9f, 0x70, 0x9e, 0x64, 0x34, 0xd8, 0x64, 0xbc, 0x88, 0x83, 0x98, 0x28, 0x92, 0x0b, 0xbe,
	0x09, 0x6e, 0x1e, 0xaf, 0xa9, 0x22, 0x93, 0x80, 0xe7, 0x54, 0x10, 0x95, 0x72, 0x26, 0xfd, 0x5c,
	0x70, 0xc5, 0xd1, 0x43, 0xcb, 0xf7, 0x0d, 0xdf, 0xaf, 0xf8, 0x7e, 0xc9, 0x1f, 0x1e, 0x97, 0x76,
	0x86, 0xbc, 0x2e, 0x3e, 0x05, 0x2a, 0xdd, 0x52, 0xa9, 0xc8, 0x36, 0xb7, 0xfa, 0xe1, 0x83, 0x92,
	0x40, 0xf2, 0x34, 0x20, 0x8c, 0x71, 0x75, 0xe8, 0x3e, 0xfa, 0x51, 0x83, 0xfb, 0x17, 0x59, 0x21,
	0x15, 0x15, 0xf3, 0xea, 0xe5, 0x2b, 0x45, 0x54, 0x21, 0xd1, 0x5b, 0x68, 0x4a, 0x45, 0x14, 0xc5,
	0x8e, 0xe7, 0x8c, 0xfb, 0x93, 0x33, 0xff, 0xd6, 0x20, 0xfe, 0x9f, 0x5d, 0x7c, 0xfd, 0x43, 0x23,
	0xeb, 0x84, 0x8e, 0xc1, 0x4d, 0x19, 0xa3, 0x62, 0x65, 0x8d, 0x6b, 0x9e, 0x33, 0xee, 0x46, 0x60,
	0x20, 0xc3, 0x43, 0x18, 0xda, 0x31, 0x55, 0x24, 0xcd, 0x24, 0xae, 0x9b, 0xcb, 0xaa, 0x44, 0x53,
	0x18, 0x18, 0x91, 0x96, 0x0a, 0xb5, 0xd2, 0x5d, 0xe2, 0x86, 0xe7, 0x8c, 0xdd, 0xc9, 0xb0, 0x0a,
	0x56, 0x8d, 0xc0, 0xbf, 0xae, 0x46, 0x10, 0xf5, 0x8d, 0xe6, 0x4a, 0x4b, 0x34, 0x38, 0x3a, 0x85,
	0xa6, 0x7d, 0xc8, 0x85, 0xf6, 0x32, 0x7c, 0x1d, 0xce, 0xdf, 0x85, 0x83, 0xff, 0x74, 0xb1, 0x98,
	0x85, 0xd3, 0x57, 0xe1, 0x8b, 0x81, 0xa3, 0x8b, 0x68, 0x19, 0x86, 0xba, 0xa8, 0xa1, 0x0e, 0x34,
	0xa6, 0xf3, 0x70, 0x36, 0xa8, 0x8f, 0xbe, 0x37, 0x00, 0xff, 0xde, 0xe2, 0x25, 0x55, 0x44, 0xcf,
	0x01, 0x9d, 0xc0, 0xd1, 0xc6, 0xde, 0xad, 0x18, 0xd9, 0x52, 0xdc, 0x36, 0xd9, 0xdd, 0x12, 0x0b,
	0xc9, 0x96, 0x1e, 0x52, 0x8a, 0x22, 0x8d, 0x71, 0xe7, 0x17, 0xca, 0xb2, 0x48, 0x63, 0x74, 0x09,
	0x2d, 0x69, 0x86, 0x86, 0xbb, 0xa6, 0xb1, 0xa7, 0x77, 0x9a, 0x78, 0x54, 0x9a, 0xa0, 0x8f, 0xd0,
	0xb7, 0xa7, 0xd5, 0xe7, 0x54, 0x2a, 0x2e, 0x76, 0x18, 0xbc, 0xfa, 0xdd, 0x6d, 0x7b, 0xd6, 0xec,
	0xa5, 0xf5, 0x42, 0x8f, 0xa0, 0xbf, 0x5f, 0xd5, 0x95, 0xda, 0xe5, 0x14, 0xbb, 0xa6, 0xa3, 0xde,
	0x1e, 0xbd, 0xde, 0xe5, 0x14, 0x79, 0xe0, 0xc6, 0x54, 0x6e, 0x44, 0x9a, 0x6b, 0x08, 0x1f, 0xd9,
	0xae, 0x0f, 0x20, 0xf4, 0x01, 0x5a, 0x19, 0x59, 0xd3, 0x4c, 0xe2, 0x9e, 0x89, 0x77, 0xf1, 0x8f,
	0xf1, 0xaa, 0x3f, 0xc1, 0x7f, 0x63, 0x5c, 0x66, 0x4c, 0x89, 0x5d, 0x54, 0x5a, 0xa2, 0x21, 0x74,
	0xbe, 0x12, 0xc1, 0x52, 0x96, 0x48, 0xdc, 0xf7, 0xea, 0xe3, 0x6e, 0xb4, 0xaf, 0x87, 0xcf, 0xc0,
	0x3d, 0x90, 0xa0, 0x01, 0xd4, 0xbf, 0xd0, 0x9d, 0x59, 0xf6, 0x6e, 0xa4, 0x8f, 0xe8, 0x1e, 0x34,
	0x6f, 0x48, 0x56, 0x54, 0x7b, 0x6a, 0x8b, 0xe7, 0xb5, 0x53, 0xe7, 0xfc, 0x1b, 0x9c, 0x6c, 0xf8,
	0xf6, 0xf6, 0xa0, 0xe7, 0xff, 0xef, 0x23, 0xca, 0x85, 0xde, 0xcc, 0x85, 0xf3, 0x7e, 0x56, 0x2a,
	0x12, 0x9e, 0x11, 0x96, 0xf8, 0x5c, 0x24, 0x41, 0x42, 0x99, 0xd9, 0xdb, 0xc0, 0x5e, 0x91, 0x3c,
	0x95, 0x7f, 0xf9, 0x34, 0x9c, 0x55, 0xc0, 0xba, 0x65, 0x14, 0x4f, 0x7e, 0x06, 0x00, 0x00, 0xff,
	0xff, 0xaf, 0x94, 0xc4, 0x36, 0x4b, 0x04, 0x00, 0x00,
}
