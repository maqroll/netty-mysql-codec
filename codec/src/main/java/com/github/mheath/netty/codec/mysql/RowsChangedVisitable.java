package com.github.mheath.netty.codec.mysql;

public interface RowsChangedVisitable {
  default void accept(RowsChangedVisitor visitor) {
    throw new IllegalStateException("Failed to accept");
  }
}
