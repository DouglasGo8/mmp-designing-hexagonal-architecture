package com.packtpub.designing.hexagonal.architecture.handle.behavior.application.ports.output;

import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.entity.Router;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.RouterId;

public interface RouterNetworkOutputPort {
  Router fetchRouterById(RouterId routerId);

  boolean persistRouter(Router router);
}
