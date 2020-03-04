// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Code generated by gapic-generator. DO NOT EDIT.

package dataproc

import (
	"context"
	"fmt"
	"math"
	"net/url"
	"time"

	"github.com/golang/protobuf/proto"
	gax "github.com/googleapis/gax-go/v2"
	"google.golang.org/api/iterator"
	"google.golang.org/api/option"
	"google.golang.org/api/transport"
	dataprocpb "google.golang.org/genproto/googleapis/cloud/dataproc/v1beta2"
	"google.golang.org/grpc"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/metadata"
)

// AutoscalingPolicyCallOptions contains the retry settings for each method of AutoscalingPolicyClient.
type AutoscalingPolicyCallOptions struct {
	CreateAutoscalingPolicy []gax.CallOption
	UpdateAutoscalingPolicy []gax.CallOption
	GetAutoscalingPolicy    []gax.CallOption
	ListAutoscalingPolicies []gax.CallOption
	DeleteAutoscalingPolicy []gax.CallOption
}

func defaultAutoscalingPolicyClientOptions() []option.ClientOption {
	return []option.ClientOption{
		option.WithEndpoint("dataproc.googleapis.com:443"),
		option.WithScopes(DefaultAuthScopes()...),
		option.WithGRPCDialOption(grpc.WithDefaultCallOptions(
			grpc.MaxCallRecvMsgSize(math.MaxInt32))),
	}
}

func defaultAutoscalingPolicyCallOptions() *AutoscalingPolicyCallOptions {
	retry := map[[2]string][]gax.CallOption{
		{"default", "idempotent"}: {
			gax.WithRetry(func() gax.Retryer {
				return gax.OnCodes([]codes.Code{
					codes.DeadlineExceeded,
					codes.Unavailable,
				}, gax.Backoff{
					Initial:    100 * time.Millisecond,
					Max:        60000 * time.Millisecond,
					Multiplier: 1.3,
				})
			}),
		},
	}
	return &AutoscalingPolicyCallOptions{
		CreateAutoscalingPolicy: retry[[2]string{"default", "non_idempotent"}],
		UpdateAutoscalingPolicy: retry[[2]string{"default", "idempotent"}],
		GetAutoscalingPolicy:    retry[[2]string{"default", "idempotent"}],
		ListAutoscalingPolicies: retry[[2]string{"default", "idempotent"}],
		DeleteAutoscalingPolicy: retry[[2]string{"default", "non_idempotent"}],
	}
}

// AutoscalingPolicyClient is a client for interacting with Google Cloud Dataproc API.
//
// Methods, except Close, may be called concurrently. However, fields must not be modified concurrently with method calls.
type AutoscalingPolicyClient struct {
	// The connection to the service.
	conn *grpc.ClientConn

	// The gRPC API client.
	autoscalingPolicyClient dataprocpb.AutoscalingPolicyServiceClient

	// The call options for this service.
	CallOptions *AutoscalingPolicyCallOptions

	// The x-goog-* metadata to be sent with each request.
	xGoogMetadata metadata.MD
}

// NewAutoscalingPolicyClient creates a new autoscaling policy service client.
//
// The API interface for managing autoscaling policies in the
// Google Cloud Dataproc API.
func NewAutoscalingPolicyClient(ctx context.Context, opts ...option.ClientOption) (*AutoscalingPolicyClient, error) {
	conn, err := transport.DialGRPC(ctx, append(defaultAutoscalingPolicyClientOptions(), opts...)...)
	if err != nil {
		return nil, err
	}
	c := &AutoscalingPolicyClient{
		conn:        conn,
		CallOptions: defaultAutoscalingPolicyCallOptions(),

		autoscalingPolicyClient: dataprocpb.NewAutoscalingPolicyServiceClient(conn),
	}
	c.setGoogleClientInfo()
	return c, nil
}

// Connection returns the client's connection to the API service.
func (c *AutoscalingPolicyClient) Connection() *grpc.ClientConn {
	return c.conn
}

// Close closes the connection to the API service. The user should invoke this when
// the client is no longer required.
func (c *AutoscalingPolicyClient) Close() error {
	return c.conn.Close()
}

// setGoogleClientInfo sets the name and version of the application in
// the `x-goog-api-client` header passed on each request. Intended for
// use by Google-written clients.
func (c *AutoscalingPolicyClient) setGoogleClientInfo(keyval ...string) {
	kv := append([]string{"gl-go", versionGo()}, keyval...)
	kv = append(kv, "gapic", versionClient, "gax", gax.Version, "grpc", grpc.Version)
	c.xGoogMetadata = metadata.Pairs("x-goog-api-client", gax.XGoogHeader(kv...))
}

// CreateAutoscalingPolicy creates new autoscaling policy.
func (c *AutoscalingPolicyClient) CreateAutoscalingPolicy(ctx context.Context, req *dataprocpb.CreateAutoscalingPolicyRequest, opts ...gax.CallOption) (*dataprocpb.AutoscalingPolicy, error) {
	md := metadata.Pairs("x-goog-request-params", fmt.Sprintf("%s=%v", "parent", url.QueryEscape(req.GetParent())))
	ctx = insertMetadata(ctx, c.xGoogMetadata, md)
	opts = append(c.CallOptions.CreateAutoscalingPolicy[0:len(c.CallOptions.CreateAutoscalingPolicy):len(c.CallOptions.CreateAutoscalingPolicy)], opts...)
	var resp *dataprocpb.AutoscalingPolicy
	err := gax.Invoke(ctx, func(ctx context.Context, settings gax.CallSettings) error {
		var err error
		resp, err = c.autoscalingPolicyClient.CreateAutoscalingPolicy(ctx, req, settings.GRPC...)
		return err
	}, opts...)
	if err != nil {
		return nil, err
	}
	return resp, nil
}

// UpdateAutoscalingPolicy updates (replaces) autoscaling policy.
//
// Disabled check for update_mask, because all updates will be full
// replacements.
func (c *AutoscalingPolicyClient) UpdateAutoscalingPolicy(ctx context.Context, req *dataprocpb.UpdateAutoscalingPolicyRequest, opts ...gax.CallOption) (*dataprocpb.AutoscalingPolicy, error) {
	md := metadata.Pairs("x-goog-request-params", fmt.Sprintf("%s=%v", "policy.name", url.QueryEscape(req.GetPolicy().GetName())))
	ctx = insertMetadata(ctx, c.xGoogMetadata, md)
	opts = append(c.CallOptions.UpdateAutoscalingPolicy[0:len(c.CallOptions.UpdateAutoscalingPolicy):len(c.CallOptions.UpdateAutoscalingPolicy)], opts...)
	var resp *dataprocpb.AutoscalingPolicy
	err := gax.Invoke(ctx, func(ctx context.Context, settings gax.CallSettings) error {
		var err error
		resp, err = c.autoscalingPolicyClient.UpdateAutoscalingPolicy(ctx, req, settings.GRPC...)
		return err
	}, opts...)
	if err != nil {
		return nil, err
	}
	return resp, nil
}

// GetAutoscalingPolicy retrieves autoscaling policy.
func (c *AutoscalingPolicyClient) GetAutoscalingPolicy(ctx context.Context, req *dataprocpb.GetAutoscalingPolicyRequest, opts ...gax.CallOption) (*dataprocpb.AutoscalingPolicy, error) {
	md := metadata.Pairs("x-goog-request-params", fmt.Sprintf("%s=%v", "name", url.QueryEscape(req.GetName())))
	ctx = insertMetadata(ctx, c.xGoogMetadata, md)
	opts = append(c.CallOptions.GetAutoscalingPolicy[0:len(c.CallOptions.GetAutoscalingPolicy):len(c.CallOptions.GetAutoscalingPolicy)], opts...)
	var resp *dataprocpb.AutoscalingPolicy
	err := gax.Invoke(ctx, func(ctx context.Context, settings gax.CallSettings) error {
		var err error
		resp, err = c.autoscalingPolicyClient.GetAutoscalingPolicy(ctx, req, settings.GRPC...)
		return err
	}, opts...)
	if err != nil {
		return nil, err
	}
	return resp, nil
}

// ListAutoscalingPolicies lists autoscaling policies in the project.
func (c *AutoscalingPolicyClient) ListAutoscalingPolicies(ctx context.Context, req *dataprocpb.ListAutoscalingPoliciesRequest, opts ...gax.CallOption) *AutoscalingPolicyIterator {
	md := metadata.Pairs("x-goog-request-params", fmt.Sprintf("%s=%v", "parent", url.QueryEscape(req.GetParent())))
	ctx = insertMetadata(ctx, c.xGoogMetadata, md)
	opts = append(c.CallOptions.ListAutoscalingPolicies[0:len(c.CallOptions.ListAutoscalingPolicies):len(c.CallOptions.ListAutoscalingPolicies)], opts...)
	it := &AutoscalingPolicyIterator{}
	req = proto.Clone(req).(*dataprocpb.ListAutoscalingPoliciesRequest)
	it.InternalFetch = func(pageSize int, pageToken string) ([]*dataprocpb.AutoscalingPolicy, string, error) {
		var resp *dataprocpb.ListAutoscalingPoliciesResponse
		req.PageToken = pageToken
		if pageSize > math.MaxInt32 {
			req.PageSize = math.MaxInt32
		} else {
			req.PageSize = int32(pageSize)
		}
		err := gax.Invoke(ctx, func(ctx context.Context, settings gax.CallSettings) error {
			var err error
			resp, err = c.autoscalingPolicyClient.ListAutoscalingPolicies(ctx, req, settings.GRPC...)
			return err
		}, opts...)
		if err != nil {
			return nil, "", err
		}
		return resp.Policies, resp.NextPageToken, nil
	}
	fetch := func(pageSize int, pageToken string) (string, error) {
		items, nextPageToken, err := it.InternalFetch(pageSize, pageToken)
		if err != nil {
			return "", err
		}
		it.items = append(it.items, items...)
		return nextPageToken, nil
	}
	it.pageInfo, it.nextFunc = iterator.NewPageInfo(fetch, it.bufLen, it.takeBuf)
	it.pageInfo.MaxSize = int(req.PageSize)
	it.pageInfo.Token = req.PageToken
	return it
}

// DeleteAutoscalingPolicy deletes an autoscaling policy. It is an error to delete an autoscaling
// policy that is in use by one or more clusters.
func (c *AutoscalingPolicyClient) DeleteAutoscalingPolicy(ctx context.Context, req *dataprocpb.DeleteAutoscalingPolicyRequest, opts ...gax.CallOption) error {
	md := metadata.Pairs("x-goog-request-params", fmt.Sprintf("%s=%v", "name", url.QueryEscape(req.GetName())))
	ctx = insertMetadata(ctx, c.xGoogMetadata, md)
	opts = append(c.CallOptions.DeleteAutoscalingPolicy[0:len(c.CallOptions.DeleteAutoscalingPolicy):len(c.CallOptions.DeleteAutoscalingPolicy)], opts...)
	err := gax.Invoke(ctx, func(ctx context.Context, settings gax.CallSettings) error {
		var err error
		_, err = c.autoscalingPolicyClient.DeleteAutoscalingPolicy(ctx, req, settings.GRPC...)
		return err
	}, opts...)
	return err
}

// AutoscalingPolicyIterator manages a stream of *dataprocpb.AutoscalingPolicy.
type AutoscalingPolicyIterator struct {
	items    []*dataprocpb.AutoscalingPolicy
	pageInfo *iterator.PageInfo
	nextFunc func() error

	// InternalFetch is for use by the Google Cloud Libraries only.
	// It is not part of the stable interface of this package.
	//
	// InternalFetch returns results from a single call to the underlying RPC.
	// The number of results is no greater than pageSize.
	// If there are no more results, nextPageToken is empty and err is nil.
	InternalFetch func(pageSize int, pageToken string) (results []*dataprocpb.AutoscalingPolicy, nextPageToken string, err error)
}

// PageInfo supports pagination. See the google.golang.org/api/iterator package for details.
func (it *AutoscalingPolicyIterator) PageInfo() *iterator.PageInfo {
	return it.pageInfo
}

// Next returns the next result. Its second return value is iterator.Done if there are no more
// results. Once Next returns Done, all subsequent calls will return Done.
func (it *AutoscalingPolicyIterator) Next() (*dataprocpb.AutoscalingPolicy, error) {
	var item *dataprocpb.AutoscalingPolicy
	if err := it.nextFunc(); err != nil {
		return item, err
	}
	item = it.items[0]
	it.items = it.items[1:]
	return item, nil
}

func (it *AutoscalingPolicyIterator) bufLen() int {
	return len(it.items)
}

func (it *AutoscalingPolicyIterator) takeBuf() interface{} {
	b := it.items
	it.items = nil
	return b
}