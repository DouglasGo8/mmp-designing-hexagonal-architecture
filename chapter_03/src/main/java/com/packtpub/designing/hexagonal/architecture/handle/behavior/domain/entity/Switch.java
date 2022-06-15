package com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.entity;


import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.IP;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.Network;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.SwitchId;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.SwitchType;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Switch {


  private SwitchId switchId;
  private SwitchType switchType;

  private List<Network> networks;
  private IP address;


  public Switch addNetwork(Network network) {
    var networks = new ArrayList<>(List.of(network));
    networks.add(network);
    return new Switch(this.switchId, this.switchType, networks, this.address);
  }

  public List<Network> getNetworks() {
    return networks;
  }
}
