package com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.specification;

import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.entity.Router;
import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.specification.shared.AbstractSpecification;
import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.vo.RouterType;

public class RouterTypeSpecification extends AbstractSpecification<Router> {

  @Override
  public boolean isSatisfiedBy(Router router) {
    return router.getRouterType().equals(RouterType.EDGE) ||
            router.getRouterType().equals(RouterType.CORE);
  }
}
