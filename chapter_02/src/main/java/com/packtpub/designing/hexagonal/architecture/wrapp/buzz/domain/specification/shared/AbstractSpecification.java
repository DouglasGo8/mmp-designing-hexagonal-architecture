package com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.specification.shared;

public abstract class AbstractSpecification<T> implements Specification<T> {

  public abstract boolean isSatisfiedBy(T t);

  @Override
  public Specification<T> and(Specification<T> specification) {
    return new AndSpecification<>(this, specification);
  }
}
