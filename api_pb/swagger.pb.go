// Code generated by protoc-gen-go. DO NOT EDIT.
// source: swagger.proto

package api_pb

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	_ "github.com/grpc-ecosystem/grpc-gateway/protoc-gen-swagger/options"
	_ "google.golang.org/genproto/googleapis/rpc/status"
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

func init() { proto.RegisterFile("swagger.proto", fileDescriptor_49635b75e059a131) }

var fileDescriptor_49635b75e059a131 = []byte{
	// 275 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x64, 0x8f, 0xc1, 0x4a, 0xf3, 0x40,
	0x10, 0xc7, 0xe9, 0xd7, 0xd2, 0x0f, 0x02, 0x05, 0x59, 0xc4, 0x6a, 0x4e, 0x41, 0x4f, 0x8a, 0xd9,
	0xb5, 0xa9, 0x87, 0x92, 0x93, 0xd5, 0x93, 0x88, 0x22, 0xf6, 0xae, 0x6c, 0x92, 0x71, 0xbb, 0x36,
	0xd9, 0x59, 0x76, 0x27, 0xa9, 0x7d, 0x0d, 0x1f, 0xcf, 0x83, 0xcf, 0x22, 0x6c, 0x7a, 0xf3, 0x34,
	0x33, 0xff, 0xf9, 0xcd, 0xc0, 0x2f, 0x9a, 0xf8, 0xad, 0x54, 0x0a, 0x1c, 0xb7, 0x0e, 0x09, 0xd9,
	0x58, 0x5a, 0xfd, 0x66, 0x8b, 0xf8, 0x32, 0x8c, 0x65, 0xaa, 0xc0, 0xa4, 0x7b, 0x42, 0xa0, 0x25,
	0x8d, 0xc6, 0x0b, 0x69, 0x0c, 0x92, 0x0c, 0x7d, 0x7f, 0x15, 0x4f, 0x15, 0xa2, 0xaa, 0x41, 0x38,
	0x5b, 0x0a, 0x4f, 0x92, 0xda, 0xfd, 0xe2, 0xf6, 0x67, 0xf0, 0xb5, 0xfc, 0x1e, 0xb0, 0xd7, 0x88,
	0x3d, 0x6a, 0x43, 0xe0, 0x92, 0x27, 0xac, 0x20, 0x59, 0x3e, 0xdf, 0x27, 0x5d, 0x76, 0x7a, 0x17,
	0x4d, 0x1e, 0x6a, 0xdd, 0x60, 0x97, 0xac, 0xc0, 0x29, 0xd8, 0xb1, 0x93, 0x35, 0x91, 0xf5, 0xb9,
	0x10, 0x4a, 0xd3, 0xba, 0x2d, 0x78, 0x89, 0x8d, 0xd8, 0xd4, 0xba, 0xb9, 0xea, 0xe2, 0x69, 0x5f,
	0x53, 0x1f, 0xc8, 0x9b, 0x9d, 0x34, 0x15, 0x7c, 0x72, 0xd7, 0x66, 0xc3, 0x19, 0x9f, 0xc5, 0xe7,
	0x4d, 0xf8, 0x9e, 0x1a, 0xac, 0x20, 0x9d, 0x71, 0x02, 0x4f, 0x06, 0x88, 0xf7, 0x29, 0x37, 0x40,
	0x5b, 0x74, 0x9b, 0x7c, 0xb1, 0xb8, 0x9e, 0x5f, 0x8c, 0x06, 0xff, 0x86, 0xa3, 0xec, 0x40, 0x5a,
	0x5b, 0xeb, 0x32, 0x48, 0x88, 0x0f, 0x8f, 0x26, 0xff, 0x93, 0xbc, 0x9c, 0x45, 0xff, 0x2b, 0x78,
	0x97, 0x6d, 0x4d, 0xec, 0x98, 0x1d, 0x45, 0x87, 0x31, 0xe3, 0xbd, 0x26, 0x77, 0xb6, 0xe4, 0xab,
	0xa0, 0x59, 0x8c, 0x83, 0xe7, 0xfc, 0x37, 0x00, 0x00, 0xff, 0xff, 0x2b, 0xa6, 0xbc, 0x72, 0x47,
	0x01, 0x00, 0x00,
}
