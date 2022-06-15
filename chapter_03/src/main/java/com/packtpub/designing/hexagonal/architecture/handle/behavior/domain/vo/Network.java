package com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Network {

  private IP address;
  private String name;
  private int cidr;

  public Network() {
    if (cidr < 1 || cidr > 32) {
      throw new IllegalArgumentException("Invalid CIDR value");
    }
  }

  @Override
  public String toString() {
    return "Network{" +
            "address=" + address +
            ", name='" + name + '\'' +
            ", cidr=" + cidr +
            '}';
  }
}
