package com.packtpub.designing.hexagonal.architecture.handle.behavior.application.ports.input;

import com.packtpub.designing.hexagonal.architecture.handle.behavior.application.ports.output.RouterNetworkOutputPort;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.application.usecases.RouterNetworkUseCase;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.entity.Router;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.service.NetworkOperation;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.Network;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.RouterId;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class RouterNetworkInputPort implements RouterNetworkUseCase {
  
  private final RouterNetworkOutputPort routerNetworkOutputPort;

  @Override
  public Router addNetworkToRouter(RouterId routerId, Network network) {
    var router = this.fetchRouter(routerId);
    return this.createNetwork(router, network);
  }

  private Router fetchRouter(RouterId routerId) {
    return this.routerNetworkOutputPort.fetchRouterById(routerId);
  }

  private Router createNetwork(Router router, Network network) {
    var newRouter = NetworkOperation.createNewNetwork(router, network);
    return persistNetwork(router) ? newRouter : router;
  }

  private boolean persistNetwork(Router router) {
    return routerNetworkOutputPort.persistRouter(router);
  }


}
