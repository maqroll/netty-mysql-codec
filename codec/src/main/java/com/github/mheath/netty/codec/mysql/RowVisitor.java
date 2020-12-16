package com.github.mheath.netty.codec.mysql;

public interface RowVisitor {
  void visit(int idx, ColumnType type);
  // FIXME add methods for every value type
}
