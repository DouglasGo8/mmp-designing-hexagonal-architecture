package com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.policy;

import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.entity.Event;
import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.vo.Activity;
import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.vo.EventId;
import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.vo.Protocol;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.regex.Pattern;

public class RegexEventParser implements EventParser {

  @Override
  public Event parseEvent(String event) {
    final String regex = "(\\\"[^\\\"]+\\\")|\\S+";
    final var pattern = Pattern.compile(regex, Pattern.MULTILINE);
    final var matcher = pattern.matcher(event);

    // Event
    var timestamp = LocalDateTime.parse(matcher.group(0), formatter).atOffset(ZoneOffset.UTC);
    var id = EventId.of(matcher.group(1));
    var protocol = Protocol.valueOf(matcher.group(2));
    var activity = new Activity(matcher.group(3), matcher.group(5));

    //
    return new Event(id, protocol, activity, timestamp);
  }
}
