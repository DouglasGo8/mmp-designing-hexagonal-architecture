package com.packtpub.designing.hexagonal.architecture.handle.behavior.application.ports.input;

import com.packtpub.designing.hexagonal.architecture.handle.behavior.application.ports.output.RouterViewOutputPort;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.application.usecases.RouterViewUseCase;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.entity.Router;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.service.RouterSearch;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.function.Predicate;

@AllArgsConstructor
public class RouterViewInputPort implements RouterViewUseCase {

  private final RouterViewOutputPort routeListOutputPort;

  @Override
  public List<Router> getRouters(Predicate<Router> filter) {
    var routers = this.routeListOutputPort.fetchRouters();
    return RouterSearch.retrieveRouter(routers, filter);
  }
}
