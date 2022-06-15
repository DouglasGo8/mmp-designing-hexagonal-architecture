package com.packtpub.designing.hexagonal.architecture.handle.behavior.framework.adapters.input.stdin;

import com.packtpub.designing.hexagonal.architecture.handle.behavior.application.usecases.RouterNetworkUseCase;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.entity.Router;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.Network;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.RouterId;

public class RouterNetworkCLIAdapter {

  RouterNetworkUseCase routerNetworkUseCase;


  public Router addNetwork(RouterId routerId, Network network) {
    this.routerNetworkUseCase = null;
    return null; //routerNetworkUseCase.addNetworkToRouter(routerId, network);
  }


}
