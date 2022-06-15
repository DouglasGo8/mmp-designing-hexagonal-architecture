package com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.specification.shared;

public interface Specification<T> {
  boolean isSatisfiedBy(T t);
  Specification<T> and(Specification<T> specification);
}
