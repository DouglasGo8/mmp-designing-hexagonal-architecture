package com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo;

import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class SwitchId {

  private final UUID id;

  public static SwitchId withId(String id){
    return new SwitchId(UUID.fromString(id));
  }

  public static SwitchId withoutId(){
    return new SwitchId(UUID.randomUUID());
  }

  @Override
  public String toString() {
    return "SwitchId{" +
            "id='" + id + '\'' +
            '}';
  }

}
