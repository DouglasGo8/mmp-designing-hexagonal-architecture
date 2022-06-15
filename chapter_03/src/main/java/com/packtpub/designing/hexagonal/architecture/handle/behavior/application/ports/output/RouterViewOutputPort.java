package com.packtpub.designing.hexagonal.architecture.handle.behavior.application.ports.output;

import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.entity.Router;

import java.util.List;

public interface RouterViewOutputPort {
  List<Router> fetchRouters();
}
