package com.github.mheath.netty.codec.mysql;

// TODO add parameters
public interface RowsChangedVisitor {
  void columnAddedRow();
  void endAddedRow();
  void columnDeletedRow();
  void endDeletedRow();
  void columnUpdatedRow();
  void endUpdatedRow();
}
