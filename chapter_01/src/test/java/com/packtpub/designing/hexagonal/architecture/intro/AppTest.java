package com.packtpub.designing.hexagonal.architecture.intro;

import com.packtpub.designing.hexagonal.architecture.intro.domain.Router;
import com.packtpub.designing.hexagonal.architecture.intro.domain.RouterId;
import com.packtpub.designing.hexagonal.architecture.intro.domain.RouterType;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


@Slf4j
public class AppTest {

  @Test
  public void predicatedConcept() {

    final Predicate<Integer> greaterThanFive = p -> p > 5;
    //
    var count = Stream.of(10, 340, 4, 23, 1, 23, 5, 2).filter(greaterThanFive)
            .count();

    assertEquals(count, 4);
  }

  @Test
  public void makeARouter() {
    //
    var router1 = new Router(RouterId.of(UUID.randomUUID().toString()), RouterType.CORE);
    var router2 = new Router(RouterId.of(UUID.randomUUID().toString()), RouterType.EDGE);
    var router3 = new Router(RouterId.of(UUID.randomUUID().toString()), RouterType.CORE);
    var router4 = new Router(RouterId.of(UUID.randomUUID().toString()), RouterType.EDGE);
    var router5 = new Router(RouterId.of(UUID.randomUUID().toString()), RouterType.CORE);
    // ::List
    var myRouters = List.of(router1, router2, router3, router4, router5);
    // ::filter reusable
    var size = Router.retrieveRouter(myRouters, Router.filterRouteByType(RouterType.CORE))
            .size();

    assertEquals(size, 3);
  }

}
