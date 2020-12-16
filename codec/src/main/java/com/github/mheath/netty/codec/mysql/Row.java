package com.github.mheath.netty.codec.mysql;

public interface Row {
  void accept(RowVisitor visitor);
}
