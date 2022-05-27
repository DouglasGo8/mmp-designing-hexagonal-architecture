package com.packtpub.designing.hexagonal.architecture.wrapp.buzz;

import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.entity.Event;
import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.specification.CIDRSpecification;
import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.specification.NetworkAmountSpecification;
import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.vo.Activity;
import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.vo.EventId;
import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.vo.ParsePolicyType;
import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.vo.Protocol;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class AppTest {

  @Test
  public void isEqualsEvents() {

    var event1 = new Event(EventId.of("1"), Protocol.IPV4, new Activity("1", "2"),
            OffsetDateTime.now());

    var event2 = event1;

    assertEquals(event1, event2);

  }


  @Test
  public void parsedEvent() {
    var event = new Event(EventId.of("1"), Protocol.IPV4, new Activity("1", "2"),
            OffsetDateTime.now());

    var line = "00:44:06.906367 IP6 casanova.58183 > menuvivofibra.br.domain: 64865+ PTR? 1.0.0.224.in-addr.arpa. (40)";

    assertThrows(IllegalStateException.class, () -> Event.parsedEvent(line, ParsePolicyType.REGEX));






  }

}
