package com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo;

public record EventId(String id) {

  public static EventId of(String id) {
    return new EventId(id);
  }

  @Override
  public String toString() {
    return "EventId{" +
            "id='" + id + '\'' +
            '}';
  }
}
