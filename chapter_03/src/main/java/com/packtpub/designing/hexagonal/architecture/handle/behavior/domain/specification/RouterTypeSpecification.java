package com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.specification;

import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.entity.Router;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.specification.shared.AbstractSpecification;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.RouterType;

public class RouterTypeSpecification extends AbstractSpecification<Router> {

  @Override
  public boolean isSatisfiedBy(Router router) {
    return router.getRouterType().equals(RouterType.EDGE) ||
            router.getRouterType().equals(RouterType.CORE);
  }
}
