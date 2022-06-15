package com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo;

import java.util.UUID;


public record RouterId(UUID id) {

  public static RouterId withId(String id) {
    return new RouterId(UUID.fromString(id));
  }

  public static RouterId withoutId() {
    return new RouterId(UUID.randomUUID());
  }

  @Override
  public String toString() {
    return "RouterId{" +
            "id='" + id + '\'' +
            '}';
  }

}
