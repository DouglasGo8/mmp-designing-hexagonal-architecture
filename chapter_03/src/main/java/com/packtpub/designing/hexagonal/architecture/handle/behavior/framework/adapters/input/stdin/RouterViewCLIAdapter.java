package com.packtpub.designing.hexagonal.architecture.handle.behavior.framework.adapters.input.stdin;

import com.packtpub.designing.hexagonal.architecture.handle.behavior.application.ports.input.RouterViewInputPort;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.application.usecases.RouterViewUseCase;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.entity.Router;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.RouterType;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.framework.adapters.output.file.RouterViewFileAdapter;

import javax.inject.Inject;
import java.util.List;

public class RouterViewCLIAdapter {
  RouterViewUseCase routerViewUseCase;

  @Inject
  RouterViewFileAdapter routerViewFileAdapter;

  public List<Router> obtainRelatedRouters(String type) {
    this.routerViewUseCase = new RouterViewInputPort(routerViewFileAdapter);
    return routerViewUseCase.getRouters(Router.filterRouterByType(RouterType.valueOf(type)));
  }


}
