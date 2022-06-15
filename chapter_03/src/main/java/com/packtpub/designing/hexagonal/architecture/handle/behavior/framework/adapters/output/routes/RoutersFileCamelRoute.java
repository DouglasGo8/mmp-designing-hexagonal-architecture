package com.packtpub.designing.hexagonal.architecture.handle.behavior.framework.adapters.output.routes;

import lombok.NoArgsConstructor;
import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;

@NoArgsConstructor
@ApplicationScoped
public class RoutersFileCamelRoute extends RouteBuilder {

  @Override
  public void configure() {

    from("file://./src/main/resources?fileName=routers.txt&noop=true")
            .log("${body}");
  }
}
