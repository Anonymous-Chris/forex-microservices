package com.chris.springboot.microservices.forex.service;

import com.chris.springboot.microservices.forex.model.ExchangeValue;
import com.chris.springboot.microservices.forex.repository.ForexRepo;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ForexServiceImp implements ForexService{
 private Environment environment;
 private ForexRepo forexRepo;

    public ForexServiceImp(Environment environment, ForexRepo forexRepo) {
        this.environment = environment;
        this.forexRepo = forexRepo;
    }

    @Override
    public ExchangeValue findByFromAndTo(String from, String to) {
       ExchangeValue exchangeValue = forexRepo.findByFromAndTo(from,to);
       exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
    return exchangeValue;
    }
}
