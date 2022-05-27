package com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.specification;

import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.entity.Router;
import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.specification.shared.AbstractSpecification;

public class NetworkAmountSpecification extends AbstractSpecification<Router> {

  final static public int MAXIMUM_ALLOWED_NETWORKS = 6;

  @Override
  public boolean isSatisfiedBy(Router router) {
    return router.retrieveNetworks().size() <= MAXIMUM_ALLOWED_NETWORKS;
  }
}