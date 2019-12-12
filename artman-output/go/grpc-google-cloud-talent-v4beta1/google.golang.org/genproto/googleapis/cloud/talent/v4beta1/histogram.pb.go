// Code generated by protoc-gen-go. DO NOT EDIT.
// source: google/cloud/talent/v4beta1/histogram.proto

package talent

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
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

// The histogram request.
type HistogramQuery struct {
	// An expression specifies a histogram request against matching resources
	// (for example, jobs, profiles) for searches.
	//
	// See
	// [SearchJobsRequest.histogram_queries][google.cloud.talent.v4beta1.SearchJobsRequest.histogram_queries]
	// and
	// [SearchProfilesRequest.histogram_queries][google.cloud.talent.v4beta1.SearchProfilesRequest.histogram_queries]
	// for details about syntax.
	HistogramQuery       string   `protobuf:"bytes,1,opt,name=histogram_query,json=histogramQuery,proto3" json:"histogram_query,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *HistogramQuery) Reset()         { *m = HistogramQuery{} }
func (m *HistogramQuery) String() string { return proto.CompactTextString(m) }
func (*HistogramQuery) ProtoMessage()    {}
func (*HistogramQuery) Descriptor() ([]byte, []int) {
	return fileDescriptor_faf41faeec04126e, []int{0}
}

func (m *HistogramQuery) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_HistogramQuery.Unmarshal(m, b)
}
func (m *HistogramQuery) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_HistogramQuery.Marshal(b, m, deterministic)
}
func (m *HistogramQuery) XXX_Merge(src proto.Message) {
	xxx_messageInfo_HistogramQuery.Merge(m, src)
}
func (m *HistogramQuery) XXX_Size() int {
	return xxx_messageInfo_HistogramQuery.Size(m)
}
func (m *HistogramQuery) XXX_DiscardUnknown() {
	xxx_messageInfo_HistogramQuery.DiscardUnknown(m)
}

var xxx_messageInfo_HistogramQuery proto.InternalMessageInfo

func (m *HistogramQuery) GetHistogramQuery() string {
	if m != nil {
		return m.HistogramQuery
	}
	return ""
}

// Histogram result that matches
// [HistogramQuery][google.cloud.talent.v4beta1.HistogramQuery] specified in
// searches.
type HistogramQueryResult struct {
	// Requested histogram expression.
	HistogramQuery string `protobuf:"bytes,1,opt,name=histogram_query,json=histogramQuery,proto3" json:"histogram_query,omitempty"`
	// A map from the values of the facet associated with distinct values to the
	// number of matching entries with corresponding value.
	//
	// The key format is:
	//
	// * (for string histogram) string values stored in the field.
	// * (for named numeric bucket) name specified in `bucket()` function, like
	//   for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`.
	// * (for anonymous numeric bucket) range formatted as `<low>-<high>`, for
	//   example, `0-1000`, `MIN-0`, and `0-MAX`.
	Histogram            map[string]int64 `protobuf:"bytes,2,rep,name=histogram,proto3" json:"histogram,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"varint,2,opt,name=value,proto3"`
	XXX_NoUnkeyedLiteral struct{}         `json:"-"`
	XXX_unrecognized     []byte           `json:"-"`
	XXX_sizecache        int32            `json:"-"`
}

func (m *HistogramQueryResult) Reset()         { *m = HistogramQueryResult{} }
func (m *HistogramQueryResult) String() string { return proto.CompactTextString(m) }
func (*HistogramQueryResult) ProtoMessage()    {}
func (*HistogramQueryResult) Descriptor() ([]byte, []int) {
	return fileDescriptor_faf41faeec04126e, []int{1}
}

func (m *HistogramQueryResult) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_HistogramQueryResult.Unmarshal(m, b)
}
func (m *HistogramQueryResult) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_HistogramQueryResult.Marshal(b, m, deterministic)
}
func (m *HistogramQueryResult) XXX_Merge(src proto.Message) {
	xxx_messageInfo_HistogramQueryResult.Merge(m, src)
}
func (m *HistogramQueryResult) XXX_Size() int {
	return xxx_messageInfo_HistogramQueryResult.Size(m)
}
func (m *HistogramQueryResult) XXX_DiscardUnknown() {
	xxx_messageInfo_HistogramQueryResult.DiscardUnknown(m)
}

var xxx_messageInfo_HistogramQueryResult proto.InternalMessageInfo

func (m *HistogramQueryResult) GetHistogramQuery() string {
	if m != nil {
		return m.HistogramQuery
	}
	return ""
}

func (m *HistogramQueryResult) GetHistogram() map[string]int64 {
	if m != nil {
		return m.Histogram
	}
	return nil
}

func init() {
	proto.RegisterType((*HistogramQuery)(nil), "google.cloud.talent.v4beta1.HistogramQuery")
	proto.RegisterType((*HistogramQueryResult)(nil), "google.cloud.talent.v4beta1.HistogramQueryResult")
	proto.RegisterMapType((map[string]int64)(nil), "google.cloud.talent.v4beta1.HistogramQueryResult.HistogramEntry")
}

func init() {
	proto.RegisterFile("google/cloud/talent/v4beta1/histogram.proto", fileDescriptor_faf41faeec04126e)
}

var fileDescriptor_faf41faeec04126e = []byte{
	// 283 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0xd2, 0x4e, 0xcf, 0xcf, 0x4f,
	0xcf, 0x49, 0xd5, 0x4f, 0xce, 0xc9, 0x2f, 0x4d, 0xd1, 0x2f, 0x49, 0xcc, 0x49, 0xcd, 0x2b, 0xd1,
	0x2f, 0x33, 0x49, 0x4a, 0x2d, 0x49, 0x34, 0xd4, 0xcf, 0xc8, 0x2c, 0x2e, 0xc9, 0x4f, 0x2f, 0x4a,
	0xcc, 0xd5, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0x92, 0x86, 0x28, 0xd6, 0x03, 0x2b, 0xd6, 0x83,
	0x28, 0xd6, 0x83, 0x2a, 0x96, 0x92, 0x81, 0x9a, 0x94, 0x58, 0x90, 0xa9, 0x9f, 0x98, 0x97, 0x97,
	0x5f, 0x92, 0x58, 0x92, 0x99, 0x9f, 0x57, 0x0c, 0xd1, 0xaa, 0x64, 0xc9, 0xc5, 0xe7, 0x01, 0x33,
	0x2d, 0xb0, 0x34, 0xb5, 0xa8, 0x52, 0x48, 0x9d, 0x8b, 0x1f, 0x6e, 0x7e, 0x7c, 0x21, 0x48, 0x48,
	0x82, 0x51, 0x81, 0x51, 0x83, 0x33, 0x88, 0x2f, 0x03, 0x45, 0xa1, 0xd2, 0x5d, 0x46, 0x2e, 0x11,
	0x54, 0xbd, 0x41, 0xa9, 0xc5, 0xa5, 0x39, 0x25, 0x44, 0x9b, 0x20, 0x14, 0xc7, 0xc5, 0x09, 0x17,
	0x91, 0x60, 0x52, 0x60, 0xd6, 0xe0, 0x36, 0x72, 0xd0, 0xc3, 0xe3, 0x17, 0x3d, 0x6c, 0xd6, 0x21,
	0x04, 0x5d, 0xf3, 0x4a, 0x8a, 0x2a, 0x83, 0x10, 0x46, 0x4a, 0xd9, 0x20, 0x79, 0x0e, 0x2c, 0x29,
	0x24, 0xc0, 0xc5, 0x9c, 0x9d, 0x0a, 0x73, 0x0e, 0x88, 0x29, 0x24, 0xc2, 0xc5, 0x5a, 0x96, 0x98,
	0x53, 0x9a, 0x2a, 0xc1, 0xa4, 0xc0, 0xa8, 0xc1, 0x1c, 0x04, 0xe1, 0x58, 0x31, 0x59, 0x30, 0x3a,
	0xd5, 0x70, 0xc9, 0x27, 0xe7, 0xe7, 0xe2, 0x73, 0x8f, 0x13, 0xc2, 0xf8, 0x00, 0x50, 0x68, 0x06,
	0x30, 0x46, 0x39, 0x42, 0x95, 0xa7, 0xe7, 0xe7, 0x24, 0xe6, 0xa5, 0xeb, 0xe5, 0x17, 0xa5, 0xeb,
	0xa7, 0xa7, 0xe6, 0x81, 0xc3, 0x5a, 0x1f, 0x22, 0x95, 0x58, 0x90, 0x59, 0x8c, 0x35, 0x5a, 0xad,
	0x21, 0xdc, 0x45, 0x4c, 0xcc, 0xce, 0x21, 0xc1, 0x49, 0x6c, 0x60, 0x3d, 0xc6, 0x80, 0x00, 0x00,
	0x00, 0xff, 0xff, 0xf7, 0x89, 0x18, 0x14, 0x09, 0x02, 0x00, 0x00,
}
