package com.packtpub.designing.hexagonal.architecture.handle.behavior.framework.adapters.output.file;

import com.packtpub.designing.hexagonal.architecture.handle.behavior.application.ports.output.RouterViewOutputPort;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.entity.Router;
import lombok.AllArgsConstructor;
import org.apache.camel.ProducerTemplate;

import javax.inject.Singleton;
import java.util.List;

@Singleton
@AllArgsConstructor
public class RouterViewFileAdapter implements RouterViewOutputPort {
  private final ProducerTemplate template;

  @Override
  public List<Router> fetchRouters() {


    return null;


  }
}
