package com.packtpub.designing.hexagonal.architecture.handle.behavior.application.usecases;

import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.entity.Router;

import java.util.List;
import java.util.function.Predicate;

public interface RouterViewUseCase {
  List<Router> getRouters(Predicate<Router> filter);
}
