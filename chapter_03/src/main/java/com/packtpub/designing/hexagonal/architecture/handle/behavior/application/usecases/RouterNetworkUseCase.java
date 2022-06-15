package com.packtpub.designing.hexagonal.architecture.handle.behavior.application.usecases;

import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.entity.Router;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.Network;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.RouterId;

public interface RouterNetworkUseCase {
  Router addNetworkToRouter(RouterId routerId, Network network);
}
