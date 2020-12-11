package com.github.mheath.netty.codec.mysql;

import io.netty.channel.ChannelHandlerContext;

public interface Visitable {
  default void accept(MysqlServerPacketVisitor visitor, ChannelHandlerContext ctx) {
    throw new IllegalStateException("Failed to accept");
  }
}
