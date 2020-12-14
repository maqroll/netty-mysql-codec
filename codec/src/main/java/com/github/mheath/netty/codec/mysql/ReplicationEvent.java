package com.github.mheath.netty.codec.mysql;

public interface ReplicationEvent {
  ReplicationEventHeader header();
  ReplicationEventPayload payload();
}
