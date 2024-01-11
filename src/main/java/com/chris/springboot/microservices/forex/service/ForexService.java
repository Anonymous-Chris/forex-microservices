package com.chris.springboot.microservices.forex.service;

import com.chris.springboot.microservices.forex.model.ExchangeValue;

public interface ForexService {
    ExchangeValue findByFromAndTo(String from, String to);
}
