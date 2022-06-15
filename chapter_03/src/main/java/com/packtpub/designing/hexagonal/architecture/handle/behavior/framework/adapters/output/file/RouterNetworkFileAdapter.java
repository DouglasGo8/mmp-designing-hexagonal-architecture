package com.packtpub.designing.hexagonal.architecture.handle.behavior.framework.adapters.output.file;

import com.packtpub.designing.hexagonal.architecture.handle.behavior.application.ports.output.RouterNetworkOutputPort;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.entity.Router;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.entity.Switch;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.*;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;


@Singleton
public class RouterNetworkFileAdapter implements RouterNetworkOutputPort {

  private static RouterNetworkFileAdapter instance;
  private final List<Router> routers = new ArrayList<>();

  @PostConstruct
  public void createSampleRouter() {
    var routerId = RouterId.withId("ca23800e-9b5a-11eb-a8b3-0242ac130003");
    var network = new Network(new IP("10.0.0.0"), "HR", 8);
    var networkSwitch = new Switch(SwitchId.withoutId(), SwitchType.LAYER3, List.of(network), new IP("9.0.0.9"));
    var router = new Router(routerId, RouterType.EDGE, networkSwitch);
    routers.add(router);
  }

  @Override
  public Router fetchRouterById(RouterId routerId) {
    Router retrievedRouter = null;
    for(Router router: routers){
      if(router.getRouterId().id().equals(routerId.id())){
        retrievedRouter = router;
        break;
      }
    }
    return retrievedRouter;
  }

  @Override
  public boolean persistRouter(Router router) {
    return this.routers.add(router);
  }



}
