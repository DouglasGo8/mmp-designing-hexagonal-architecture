package com.packtpub.designing.hexagonal.architecture.handle.behavior.framework.adapters.input.stdin.routes;


import lombok.NoArgsConstructor;
import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;

@NoArgsConstructor
@ApplicationScoped
public class AppCLIAutoSimulationRoute extends RouteBuilder {

  @Override
  public void configure() {

    from("timer://myTimer?period=10s&fixedRate=true")
            .log("Hi");

  }
}
