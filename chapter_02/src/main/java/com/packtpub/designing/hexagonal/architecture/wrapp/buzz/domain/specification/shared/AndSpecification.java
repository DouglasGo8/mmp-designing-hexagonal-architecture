package com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.specification.shared;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AndSpecification<T> extends AbstractSpecification<T> {
  private final Specification<T> spec1;
  private final Specification<T> spec2;
  @Override
  public boolean isSatisfiedBy(T t) {
    return spec1.isSatisfiedBy(t) && spec2.isSatisfiedBy(t);
  }
}

