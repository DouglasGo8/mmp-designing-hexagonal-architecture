package com.packtpub.designing.hexagonal.architecture.intro.domain;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class RouterId {
  private final String id;

  public static RouterId of(String id) {
    return new RouterId(id);
  }

  @Override
  public String toString() {
    return "RouterId{" +
            "id='" + id + '\'' +
            '}';
  }

}
