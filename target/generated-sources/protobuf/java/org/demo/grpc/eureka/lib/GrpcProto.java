// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcRequest.proto

package org.demo.grpc.eureka.lib;

public final class GrpcProto {
  private GrpcProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcrequest_GrpcRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcrequest_GrpcRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcrequest_GrpcReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcrequest_GrpcReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GrpcRequest.proto\022\013grpcrequest\"\034\n\013Grpc" +
      "Request\022\r\n\005param\030\001 \001(\t\"\033\n\tGrpcReply\022\016\n\006r" +
      "esult\030\001 \001(\t2K\n\007Greeter\022@\n\ngetRequest\022\030.g" +
      "rpcrequest.GrpcRequest\032\026.grpcrequest.Grp" +
      "cReply\"\000B\'\n\030org.demo.grpc.eureka.libB\tGr" +
      "pcProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_grpcrequest_GrpcRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpcrequest_GrpcRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcrequest_GrpcRequest_descriptor,
        new java.lang.String[] { "Param", });
    internal_static_grpcrequest_GrpcReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpcrequest_GrpcReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcrequest_GrpcReply_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
