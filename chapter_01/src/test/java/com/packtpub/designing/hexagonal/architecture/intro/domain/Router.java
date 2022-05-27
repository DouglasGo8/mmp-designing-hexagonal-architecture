package com.packtpub.designing.hexagonal.architecture.intro.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author dougdb
 */
@AllArgsConstructor
public class Router {

  // VO Concept
  private final RouterId routerId;
  @Getter
  private final RouterType routerType;

  public static Predicate<Router> filterRouteByType(RouterType routerType) {
    return routerType.equals(RouterType.CORE) ? isCore() : isEdge();
  }

  private static Predicate<Router> isCore() {
    return p -> p.getRouterType() == RouterType.CORE;
  }

  private static Predicate<Router> isEdge() {
    return p -> p.getRouterType() == RouterType.EDGE;
  }

  public static List<Router> retrieveRouter(List<Router> routers, Predicate<Router> predicate) {
    return routers.stream().filter(predicate).collect(Collectors.<Router>toList());
  }

  @Override
  public String toString() {
    return "Router{" +
            "routerType=" + routerType +
            ", routerId=" + routerId +
            '}';
  }

}
