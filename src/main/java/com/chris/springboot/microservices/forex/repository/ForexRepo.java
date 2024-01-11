package com.chris.springboot.microservices.forex.repository;

import com.chris.springboot.microservices.forex.model.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForexRepo extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}
