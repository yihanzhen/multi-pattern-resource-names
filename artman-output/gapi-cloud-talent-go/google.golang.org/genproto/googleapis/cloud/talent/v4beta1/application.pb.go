// Code generated by protoc-gen-go. DO NOT EDIT.
// source: google/cloud/talent/v4beta1/application.proto

package talent

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	timestamp "github.com/golang/protobuf/ptypes/timestamp"
	wrappers "github.com/golang/protobuf/ptypes/wrappers"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	date "google.golang.org/genproto/googleapis/type/date"
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

// Enum that represents the application status.
type Application_ApplicationState int32

const (
	// Default value.
	Application_APPLICATION_STATE_UNSPECIFIED Application_ApplicationState = 0
	// The current stage is in progress or pending, for example, interviews in
	// progress.
	Application_IN_PROGRESS Application_ApplicationState = 1
	// The current stage was terminated by a candidate decision.
	Application_CANDIDATE_WITHDREW Application_ApplicationState = 2
	// The current stage was terminated by an employer or agency decision.
	Application_EMPLOYER_WITHDREW Application_ApplicationState = 3
	// The current stage is successfully completed, but the next stage (if
	// applicable) has not begun.
	Application_COMPLETED Application_ApplicationState = 4
	// The current stage was closed without an exception, or terminated for
	// reasons unrealated to the candidate.
	Application_CLOSED Application_ApplicationState = 5
)

var Application_ApplicationState_name = map[int32]string{
	0: "APPLICATION_STATE_UNSPECIFIED",
	1: "IN_PROGRESS",
	2: "CANDIDATE_WITHDREW",
	3: "EMPLOYER_WITHDREW",
	4: "COMPLETED",
	5: "CLOSED",
}

var Application_ApplicationState_value = map[string]int32{
	"APPLICATION_STATE_UNSPECIFIED": 0,
	"IN_PROGRESS":                   1,
	"CANDIDATE_WITHDREW":            2,
	"EMPLOYER_WITHDREW":             3,
	"COMPLETED":                     4,
	"CLOSED":                        5,
}

func (x Application_ApplicationState) String() string {
	return proto.EnumName(Application_ApplicationState_name, int32(x))
}

func (Application_ApplicationState) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_17aa3b44422c8555, []int{0, 0}
}

// The stage of the application.
type Application_ApplicationStage int32

const (
	// Default value.
	Application_APPLICATION_STAGE_UNSPECIFIED Application_ApplicationStage = 0
	// Candidate has applied or a recruiter put candidate into consideration but
	// candidate is not yet screened / no decision has been made to move or not
	// move the candidate to the next stage.
	Application_NEW Application_ApplicationStage = 1
	// A recruiter decided to screen the candidate for this role.
	Application_SCREEN Application_ApplicationStage = 2
	// Candidate is being / was sent to the customer / hiring manager for
	// detailed review.
	Application_HIRING_MANAGER_REVIEW Application_ApplicationStage = 3
	// Candidate was approved by the client / hiring manager and is being / was
	// interviewed for the role.
	Application_INTERVIEW Application_ApplicationStage = 4
	// Candidate will be / has been given an offer of employment.
	Application_OFFER_EXTENDED Application_ApplicationStage = 5
	// Candidate has accepted their offer of employment.
	Application_OFFER_ACCEPTED Application_ApplicationStage = 6
	// Candidate has begun (or completed) their employment or assignment with
	// the employer.
	Application_STARTED Application_ApplicationStage = 7
)

var Application_ApplicationStage_name = map[int32]string{
	0: "APPLICATION_STAGE_UNSPECIFIED",
	1: "NEW",
	2: "SCREEN",
	3: "HIRING_MANAGER_REVIEW",
	4: "INTERVIEW",
	5: "OFFER_EXTENDED",
	6: "OFFER_ACCEPTED",
	7: "STARTED",
}

var Application_ApplicationStage_value = map[string]int32{
	"APPLICATION_STAGE_UNSPECIFIED": 0,
	"NEW":                           1,
	"SCREEN":                        2,
	"HIRING_MANAGER_REVIEW":         3,
	"INTERVIEW":                     4,
	"OFFER_EXTENDED":                5,
	"OFFER_ACCEPTED":                6,
	"STARTED":                       7,
}

func (x Application_ApplicationStage) String() string {
	return proto.EnumName(Application_ApplicationStage_name, int32(x))
}

func (Application_ApplicationStage) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_17aa3b44422c8555, []int{0, 1}
}

// Resource that represents a job application record of a candidate.
type Application struct {
	// Required during application update.
	//
	// Resource name assigned to an application by the API.
	//
	// The format is
	// "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}/applications/{application_id}".
	// For example, "projects/foo/tenants/bar/profiles/baz/applications/qux".
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// Required. Client side application identifier, used to uniquely identify the
	// application.
	//
	// The maximum number of allowed characters is 255.
	ExternalId string `protobuf:"bytes,31,opt,name=external_id,json=externalId,proto3" json:"external_id,omitempty"`
	// Output only. Resource name of the candidate of this application.
	//
	// The format is
	// "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}".
	// For example, "projects/foo/tenants/bar/profiles/baz".
	Profile string `protobuf:"bytes,2,opt,name=profile,proto3" json:"profile,omitempty"`
	// Required. Resource name of the job which the candidate applied for.
	//
	// The format is
	// "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}". For example,
	// "projects/foo/tenants/bar/jobs/baz".
	Job string `protobuf:"bytes,4,opt,name=job,proto3" json:"job,omitempty"`
	// Resource name of the company which the candidate applied for.
	//
	// The format is
	// "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}".
	// For example, "projects/foo/tenants/bar/companies/baz".
	Company string `protobuf:"bytes,5,opt,name=company,proto3" json:"company,omitempty"`
	// The application date.
	ApplicationDate *date.Date `protobuf:"bytes,7,opt,name=application_date,json=applicationDate,proto3" json:"application_date,omitempty"`
	// Required. What is the most recent stage of the application (that is, new,
	// screen, send cv, hired, finished work)?  This field is intentionally not
	// comprehensive of every possible status, but instead, represents statuses
	// that would be used to indicate to the ML models good / bad matches.
	Stage Application_ApplicationStage `protobuf:"varint,11,opt,name=stage,proto3,enum=google.cloud.talent.v4beta1.Application_ApplicationStage" json:"stage,omitempty"`
	// The application state.
	State Application_ApplicationState `protobuf:"varint,13,opt,name=state,proto3,enum=google.cloud.talent.v4beta1.Application_ApplicationState" json:"state,omitempty"`
	// All interviews (screen, onsite, and so on) conducted as part of this
	// application (includes details such as user conducting the interview,
	// timestamp, feedback, and so on).
	Interviews []*Interview `protobuf:"bytes,16,rep,name=interviews,proto3" json:"interviews,omitempty"`
	// If the candidate is referred by a employee.
	Referral *wrappers.BoolValue `protobuf:"bytes,18,opt,name=referral,proto3" json:"referral,omitempty"`
	// Required. Reflects the time that the application was created.
	CreateTime *timestamp.Timestamp `protobuf:"bytes,19,opt,name=create_time,json=createTime,proto3" json:"create_time,omitempty"`
	// The last update timestamp.
	UpdateTime *timestamp.Timestamp `protobuf:"bytes,20,opt,name=update_time,json=updateTime,proto3" json:"update_time,omitempty"`
	// Free text reason behind the recruitement outcome (for example, reason for
	// withdraw / reject, reason for an unsuccessful finish, and so on).
	//
	// Number of characters allowed is 100.
	OutcomeNotes string `protobuf:"bytes,21,opt,name=outcome_notes,json=outcomeNotes,proto3" json:"outcome_notes,omitempty"`
	// Outcome positiveness shows how positive the outcome is.
	Outcome Outcome `protobuf:"varint,22,opt,name=outcome,proto3,enum=google.cloud.talent.v4beta1.Outcome" json:"outcome,omitempty"`
	// Output only. Indicates whether this job application is a match to
	// application related filters. This value is only applicable in profile
	// search response.
	IsMatch *wrappers.BoolValue `protobuf:"bytes,28,opt,name=is_match,json=isMatch,proto3" json:"is_match,omitempty"`
	// Output only. Job title snippet shows how the job title is related to a
	// search query. It's empty if the job title isn't related to the search
	// query.
	JobTitleSnippet      string   `protobuf:"bytes,29,opt,name=job_title_snippet,json=jobTitleSnippet,proto3" json:"job_title_snippet,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Application) Reset()         { *m = Application{} }
func (m *Application) String() string { return proto.CompactTextString(m) }
func (*Application) ProtoMessage()    {}
func (*Application) Descriptor() ([]byte, []int) {
	return fileDescriptor_17aa3b44422c8555, []int{0}
}

func (m *Application) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Application.Unmarshal(m, b)
}
func (m *Application) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Application.Marshal(b, m, deterministic)
}
func (m *Application) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Application.Merge(m, src)
}
func (m *Application) XXX_Size() int {
	return xxx_messageInfo_Application.Size(m)
}
func (m *Application) XXX_DiscardUnknown() {
	xxx_messageInfo_Application.DiscardUnknown(m)
}

var xxx_messageInfo_Application proto.InternalMessageInfo

func (m *Application) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *Application) GetExternalId() string {
	if m != nil {
		return m.ExternalId
	}
	return ""
}

func (m *Application) GetProfile() string {
	if m != nil {
		return m.Profile
	}
	return ""
}

func (m *Application) GetJob() string {
	if m != nil {
		return m.Job
	}
	return ""
}

func (m *Application) GetCompany() string {
	if m != nil {
		return m.Company
	}
	return ""
}

func (m *Application) GetApplicationDate() *date.Date {
	if m != nil {
		return m.ApplicationDate
	}
	return nil
}

func (m *Application) GetStage() Application_ApplicationStage {
	if m != nil {
		return m.Stage
	}
	return Application_APPLICATION_STAGE_UNSPECIFIED
}

func (m *Application) GetState() Application_ApplicationState {
	if m != nil {
		return m.State
	}
	return Application_APPLICATION_STATE_UNSPECIFIED
}

func (m *Application) GetInterviews() []*Interview {
	if m != nil {
		return m.Interviews
	}
	return nil
}

func (m *Application) GetReferral() *wrappers.BoolValue {
	if m != nil {
		return m.Referral
	}
	return nil
}

func (m *Application) GetCreateTime() *timestamp.Timestamp {
	if m != nil {
		return m.CreateTime
	}
	return nil
}

func (m *Application) GetUpdateTime() *timestamp.Timestamp {
	if m != nil {
		return m.UpdateTime
	}
	return nil
}

func (m *Application) GetOutcomeNotes() string {
	if m != nil {
		return m.OutcomeNotes
	}
	return ""
}

func (m *Application) GetOutcome() Outcome {
	if m != nil {
		return m.Outcome
	}
	return Outcome_OUTCOME_UNSPECIFIED
}

func (m *Application) GetIsMatch() *wrappers.BoolValue {
	if m != nil {
		return m.IsMatch
	}
	return nil
}

func (m *Application) GetJobTitleSnippet() string {
	if m != nil {
		return m.JobTitleSnippet
	}
	return ""
}

func init() {
	proto.RegisterEnum("google.cloud.talent.v4beta1.Application_ApplicationState", Application_ApplicationState_name, Application_ApplicationState_value)
	proto.RegisterEnum("google.cloud.talent.v4beta1.Application_ApplicationStage", Application_ApplicationStage_name, Application_ApplicationStage_value)
	proto.RegisterType((*Application)(nil), "google.cloud.talent.v4beta1.Application")
}

func init() {
	proto.RegisterFile("google/cloud/talent/v4beta1/application.proto", fileDescriptor_17aa3b44422c8555)
}

var fileDescriptor_17aa3b44422c8555 = []byte{
	// 884 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xa4, 0x55, 0x5d, 0x6f, 0xe3, 0x44,
	0x14, 0x25, 0x49, 0xdb, 0xec, 0xde, 0xd0, 0xad, 0x3b, 0xd0, 0xe2, 0x76, 0xb7, 0x24, 0x94, 0x15,
	0xca, 0x0b, 0xb6, 0xb6, 0x20, 0x24, 0xba, 0x08, 0xe1, 0x3a, 0xd3, 0xae, 0x51, 0xeb, 0x84, 0xb1,
	0xd9, 0x02, 0x2f, 0xd6, 0xc4, 0x99, 0x66, 0x1d, 0xd9, 0x1e, 0xcb, 0x9e, 0xb4, 0xac, 0x56, 0x7d,
	0xe5, 0x99, 0xdf, 0xc0, 0x1b, 0xbf, 0x83, 0x3f, 0xb2, 0xcf, 0xfc, 0x84, 0x7d, 0x42, 0xe3, 0x8f,
	0xc6, 0x2a, 0x25, 0x7d, 0xe0, 0x6d, 0xee, 0xbd, 0xe7, 0x9c, 0x1c, 0x5f, 0x9f, 0x78, 0xe0, 0xf3,
	0x29, 0xe7, 0xd3, 0x90, 0xe9, 0x7e, 0xc8, 0xe7, 0x13, 0x5d, 0xd0, 0x90, 0xc5, 0x42, 0xbf, 0xfc,
	0x72, 0xcc, 0x04, 0x7d, 0xa6, 0xd3, 0x24, 0x09, 0x03, 0x9f, 0x8a, 0x80, 0xc7, 0x5a, 0x92, 0x72,
	0xc1, 0xd1, 0xe3, 0x02, 0xae, 0xe5, 0x70, 0xad, 0x80, 0x6b, 0x25, 0x7c, 0xf7, 0x49, 0xa9, 0x45,
	0x93, 0x40, 0xa7, 0x71, 0xcc, 0x45, 0xce, 0xcc, 0x0a, 0xea, 0x6e, 0xb7, 0x36, 0xbd, 0x08, 0x58,
	0x38, 0xf1, 0xc6, 0xec, 0x15, 0xbd, 0x0c, 0x78, 0x5a, 0x02, 0x76, 0x6a, 0x80, 0x94, 0x65, 0x7c,
	0x9e, 0xfa, 0xac, 0x1c, 0xf5, 0x97, 0xb9, 0xf4, 0x79, 0x14, 0x55, 0x06, 0x6f, 0x7e, 0x25, 0xaf,
	0xc6, 0xf3, 0x0b, 0x5d, 0x04, 0x11, 0xcb, 0x04, 0x8d, 0x92, 0x12, 0xf0, 0xf1, 0x6d, 0xc0, 0x55,
	0x4a, 0x93, 0x84, 0xa5, 0x95, 0xcd, 0xed, 0x72, 0x2e, 0x5e, 0x27, 0x4c, 0x9f, 0x50, 0x51, 0x5a,
	0xd8, 0xff, 0x0b, 0xa0, 0x63, 0x2c, 0xf6, 0x81, 0x10, 0xac, 0xc4, 0x34, 0x62, 0x6a, 0xa3, 0xd7,
	0xe8, 0x3f, 0x24, 0xf9, 0x19, 0x3d, 0x85, 0x0e, 0xfb, 0x55, 0xb0, 0x34, 0xa6, 0xa1, 0x17, 0x4c,
	0xd4, 0xae, 0x1c, 0x1d, 0xb5, 0xde, 0x1a, 0x4d, 0x02, 0x55, 0xdf, 0x9a, 0xa0, 0x3d, 0x68, 0x27,
	0x29, 0xbf, 0x08, 0x42, 0xa6, 0x36, 0x2b, 0x44, 0x8b, 0x54, 0x3d, 0xf4, 0x0c, 0x5a, 0x33, 0x3e,
	0x56, 0x57, 0xf2, 0x51, 0xf7, 0xad, 0xd1, 0x7c, 0x67, 0xec, 0xc0, 0x47, 0x33, 0x3e, 0xce, 0xb4,
	0xc2, 0x1a, 0x4d, 0x82, 0x4c, 0xf3, 0x79, 0xa4, 0x7f, 0xcf, 0xc7, 0x44, 0x62, 0xd1, 0x21, 0xb4,
	0x7d, 0x1e, 0x25, 0x34, 0x7e, 0xad, 0xae, 0xe6, 0xb4, 0xde, 0x3b, 0x63, 0x0f, 0x1e, 0xdf, 0xc5,
	0x31, 0x0b, 0x1c, 0xa9, 0x08, 0xe8, 0x1b, 0x50, 0x6a, 0xaf, 0xd9, 0x93, 0x4f, 0xac, 0xb6, 0x7b,
	0x8d, 0x7e, 0xe7, 0x60, 0xb3, 0xe4, 0x6a, 0x72, 0x15, 0xda, 0x80, 0x0a, 0x46, 0x36, 0x6a, 0x50,
	0xd9, 0x40, 0x2e, 0xac, 0x66, 0x82, 0x4e, 0x99, 0xda, 0xe9, 0x35, 0xfa, 0x8f, 0x0e, 0xbe, 0xd6,
	0x96, 0xe4, 0x43, 0xab, 0xad, 0xaf, 0x7e, 0x76, 0xa4, 0x40, 0xb1, 0xa6, 0x42, 0x0c, 0x0d, 0x73,
	0x55, 0xc1, 0xd4, 0xf5, 0xff, 0xa5, 0x2a, 0x18, 0x29, 0x74, 0xd0, 0x31, 0x40, 0x10, 0x0b, 0x96,
	0x5e, 0x06, 0xec, 0x2a, 0x53, 0x95, 0x5e, 0xab, 0xdf, 0x39, 0xf8, 0x6c, 0xa9, 0xaa, 0x55, 0xc1,
	0x49, 0x8d, 0x89, 0xbe, 0x82, 0x07, 0x29, 0xbb, 0x60, 0x69, 0x4a, 0x43, 0x15, 0xe5, 0x4b, 0xda,
	0xad, 0x54, 0xaa, 0x3c, 0x69, 0x47, 0x9c, 0x87, 0x2f, 0x69, 0x38, 0x67, 0xe4, 0x06, 0x8b, 0xbe,
	0x83, 0x8e, 0x9f, 0x32, 0x2a, 0x98, 0x27, 0xe3, 0xa8, 0x7e, 0xf0, 0x1f, 0x54, 0xb7, 0xca, 0x6a,
	0x19, 0x9a, 0x82, 0x23, 0xbb, 0xe8, 0x39, 0x74, 0xe6, 0xc9, 0xe4, 0x46, 0xe1, 0xc3, 0xfb, 0x14,
	0x08, 0x14, 0xf0, 0x9c, 0xfc, 0x29, 0xac, 0xf3, 0xb9, 0xf0, 0x79, 0xc4, 0xbc, 0x98, 0x0b, 0x96,
	0xa9, 0x5b, 0x79, 0x68, 0xdf, 0x2f, 0x9b, 0xb6, 0xec, 0xa1, 0x6f, 0xa1, 0x5d, 0xd6, 0xea, 0x76,
	0xbe, 0xf6, 0xa7, 0x4b, 0x17, 0x34, 0x2c, 0xb0, 0xa4, 0x22, 0xa1, 0x43, 0x78, 0x10, 0x64, 0x5e,
	0x44, 0x85, 0xff, 0x4a, 0x7d, 0x72, 0xdf, 0x6e, 0xca, 0xcc, 0x07, 0xd9, 0x99, 0xc4, 0x23, 0x1d,
	0x36, 0x67, 0x7c, 0xec, 0x89, 0x40, 0x84, 0xcc, 0xcb, 0xe2, 0x20, 0x49, 0x98, 0x50, 0xf7, 0x16,
	0x7f, 0x8e, 0x8d, 0x19, 0x1f, 0xbb, 0x72, 0xe8, 0x14, 0xb3, 0xfd, 0xdf, 0x1b, 0xa0, 0xdc, 0x7e,
	0xd9, 0xe8, 0x13, 0xd8, 0x33, 0x46, 0xa3, 0x53, 0xcb, 0x34, 0x5c, 0x6b, 0x68, 0x7b, 0x8e, 0x6b,
	0xb8, 0xd8, 0xfb, 0xd1, 0x76, 0x46, 0xd8, 0xb4, 0x8e, 0x2d, 0x3c, 0x50, 0xde, 0x43, 0x1b, 0xd0,
	0xb1, 0x6c, 0x6f, 0x44, 0x86, 0x27, 0x04, 0x3b, 0x8e, 0xd2, 0x40, 0xdb, 0x80, 0x4c, 0xc3, 0x1e,
	0x58, 0x03, 0x89, 0x3d, 0xb7, 0xdc, 0x17, 0x03, 0x82, 0xcf, 0x95, 0x26, 0xda, 0x82, 0x4d, 0x7c,
	0x36, 0x3a, 0x1d, 0xfe, 0x8c, 0xc9, 0xa2, 0xdd, 0x42, 0xeb, 0xf0, 0xd0, 0x1c, 0x9e, 0x8d, 0x4e,
	0xb1, 0x8b, 0x07, 0xca, 0x0a, 0x02, 0x58, 0x33, 0x4f, 0x87, 0x0e, 0x1e, 0x28, 0xab, 0xfb, 0x7f,
	0xfe, 0xcb, 0xd2, 0xf4, 0x2e, 0x4b, 0x27, 0xb7, 0x2d, 0xb5, 0xa1, 0x65, 0xe3, 0x73, 0xa5, 0x21,
	0xc5, 0x1c, 0x93, 0x60, 0x6c, 0x2b, 0x4d, 0xb4, 0x03, 0x5b, 0x2f, 0x2c, 0x62, 0xd9, 0x27, 0xde,
	0x99, 0x61, 0x1b, 0x27, 0x98, 0x78, 0x04, 0xbf, 0xb4, 0x2a, 0x0b, 0x96, 0xed, 0x62, 0x92, 0x97,
	0x2b, 0x08, 0xc1, 0xa3, 0xe1, 0xf1, 0x31, 0x26, 0x1e, 0xfe, 0xc9, 0xc5, 0xf6, 0x40, 0x5a, 0x59,
	0xf4, 0x0c, 0xd3, 0xc4, 0x23, 0x69, 0x75, 0x0d, 0x75, 0xa0, 0xed, 0xb8, 0x06, 0x91, 0x45, 0xfb,
	0xf0, 0xea, 0x6f, 0x43, 0x40, 0xf7, 0xae, 0xef, 0x43, 0xfd, 0x13, 0xf7, 0x43, 0x92, 0xf2, 0x19,
	0xf3, 0x45, 0xa6, 0xbf, 0x29, 0x4f, 0xd7, 0xba, 0x60, 0x31, 0x8d, 0x65, 0xa7, 0x38, 0x5c, 0xeb,
	0xe5, 0x67, 0xab, 0xc0, 0xc8, 0xd3, 0x75, 0xfd, 0xda, 0xc8, 0xf4, 0x37, 0xb5, 0xea, 0xfa, 0xe8,
	0xb7, 0x06, 0x74, 0x7d, 0x1e, 0x2d, 0x4b, 0xd6, 0x91, 0x5a, 0xf3, 0x40, 0xca, 0x7b, 0x60, 0x24,
	0x13, 0x34, 0x6a, 0xfc, 0x62, 0x94, 0xc4, 0x29, 0x0f, 0x69, 0x3c, 0xd5, 0x78, 0x3a, 0xd5, 0xa7,
	0x2c, 0xce, 0xf3, 0xa5, 0x2f, 0x9e, 0xe4, 0xce, 0x7b, 0xe2, 0x79, 0x51, 0xfe, 0xd1, 0x6c, 0x99,
	0xae, 0x33, 0x5e, 0xcb, 0x39, 0x5f, 0xfc, 0x13, 0x00, 0x00, 0xff, 0xff, 0x3e, 0x20, 0x73, 0x50,
	0x00, 0x07, 0x00, 0x00,
}
