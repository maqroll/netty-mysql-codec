package com.github.mheath.netty.codec.mysql;

import io.netty.channel.ChannelHandlerContext;

public interface ReplicationEvent extends Visitable {
  ReplicationEventHeader header();
  ReplicationEventPayload payload();

  @Override
  default void accept(MysqlServerPacketVisitor visitor, ChannelHandlerContext ctx) {
    visitor.visit(this, ctx);
  }
}
