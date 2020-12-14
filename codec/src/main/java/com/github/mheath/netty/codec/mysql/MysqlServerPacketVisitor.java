package com.github.mheath.netty.codec.mysql;

import io.netty.channel.ChannelHandlerContext;

public interface MysqlServerPacketVisitor {
  void visit(Handshake handshake, ChannelHandlerContext ctx);
  void visit(OkResponse ok, ChannelHandlerContext ctx);
  void visit(EofResponse eof, ChannelHandlerContext ctx);
  void visit(ErrorResponse error, ChannelHandlerContext ctx);

  void visit(ReplicationEvent repEvent, ChannelHandlerContext ctx);
}
