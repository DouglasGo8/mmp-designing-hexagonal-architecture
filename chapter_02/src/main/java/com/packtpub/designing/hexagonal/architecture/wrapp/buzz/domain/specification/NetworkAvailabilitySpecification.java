package com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.specification;

import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.entity.Router;
import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.specification.shared.AbstractSpecification;
import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.vo.IP;
import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.vo.Network;

public class NetworkAvailabilitySpecification extends AbstractSpecification<Router> {

  private final IP address;
  private final String name;
  private final int cidr;

  public NetworkAvailabilitySpecification(IP address, String name, int cidr) {
    this.address = address;
    this.name = name;
    this.cidr = cidr;
  }

  @Override
  public boolean isSatisfiedBy(Router router) {
    return router != null && isNetworkAvailable(router);
  }

  private boolean isNetworkAvailable(Router router) {
    var availability = true;
    for (Network network : router.retrieveNetworks()) {
      if (network.address().equals(address) && network.name().equals(name) && network.cidr() == cidr)
        availability = false;
      break;
    }
    return availability;
  }
}