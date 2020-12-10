package com.github.mheath.netty.codec.mysql;

import io.netty.channel.ChannelHandlerContext;

public interface MysqlServerPacketVisitor {
  void visit(Handshake pkt, ChannelHandlerContext ctx);
}
