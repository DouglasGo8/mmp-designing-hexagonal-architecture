package com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.service;

import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.entity.Event;
import com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.vo.ParsePolicyType;

import java.util.ArrayList;
import java.util.List;

public class EventSearch {

  public List<Event> retrieveEvents(List<String> unparsedEvents, ParsePolicyType policyType) {
    var parsedEvents = new ArrayList<Event>();
    unparsedEvents.forEach(event -> {
      parsedEvents.add(Event.parsedEvent(event, policyType));
    });
    return parsedEvents;
  }
}
