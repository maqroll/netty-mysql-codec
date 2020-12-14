package com.github.mheath.netty.codec.mysql;

public class ReplicationEventHeader {

  private long timestamp;
  private ReplicationEventType eventType;
  private long serverId;
  private long eventLength;
  // v3 (MySQL 4.0.2-4.1)
  private long nextPosition;
  private int flags; // TODO

  public ReplicationEventHeader(Builder builder) {
    timestamp = builder.timestamp;
    eventType = builder.eventType;
    serverId = builder.serverId;
    eventLength = builder.eventLength;
    nextPosition = builder.nextPosition;
    flags = builder.flags;
  }

  public static Builder builder() {
    return new Builder();
  }

  public long getTimestamp() {
    return timestamp;
  }

  public ReplicationEventType getEventType() {
    return eventType;
  }

  public long getServerId() {
    return serverId;
  }

  public long getEventLength() {
    return eventLength;
  }

  public long getNextPosition() {
    return nextPosition;
  }

  public int getFlags() {
    return flags;
  }

  public static class Builder {
    private long timestamp;
    private ReplicationEventType eventType;
    private long serverId;
    private long eventLength;
    // v3 (MySQL 4.0.2-4.1)
    private long nextPosition;
    private int flags; // TODO

    public Builder timestamp(long timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    public Builder eventType(ReplicationEventType eventType) {
      this.eventType = eventType;
      return this;
    }

    public Builder serverId(long serverId) {
      this.serverId = serverId;
      return this;
    }

    public Builder eventLength(long eventLength) {
      this.eventLength = eventLength;
      return this;
    }

    public Builder nextPosition(long nextPosition) {
      this.nextPosition = nextPosition;
      return this;
    }

    public Builder flags(int flags) {
      this.flags = flags;
      return this;
    }

    public ReplicationEventHeader build() {
      return new ReplicationEventHeader(this);
    }
  }
}
