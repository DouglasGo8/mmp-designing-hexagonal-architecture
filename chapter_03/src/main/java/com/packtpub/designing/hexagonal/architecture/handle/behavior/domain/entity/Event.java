package com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.entity;


import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.policy.RegexEventParser;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.policy.SplitEventParser;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.Activity;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.EventId;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.ParsePolicyType;
import com.packtpub.designing.hexagonal.architecture.handle.behavior.domain.vo.Protocol;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;


@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Event implements Comparable<Event> {

  private EventId id; // Value Object
  private Protocol protocol; // Value Object
  private Activity activity; // Value Object
  //
  private OffsetDateTime timestamp;

  public static Event parsedEvent(String unparsedEvent, ParsePolicyType policy) {
    return switch (policy) {
      case REGEX -> new RegexEventParser().parseEvent(unparsedEvent);
      case SPLIT -> new SplitEventParser().parseEvent(unparsedEvent);
    };
  }


  @Override
  public int compareTo(Event event) {
    return timestamp.compareTo(event.timestamp);
  }
}
