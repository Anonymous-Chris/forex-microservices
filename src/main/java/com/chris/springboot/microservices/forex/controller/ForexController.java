package com.chris.springboot.microservices.forex.controller;

import com.chris.springboot.microservices.forex.model.ExchangeValue;
import com.chris.springboot.microservices.forex.service.ForexService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class ForexController {

    private ForexService forexService;

    public ForexController(ForexService forexService) {
        this.forexService = forexService;
    }

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue getExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to){
        return forexService.findByFromAndTo(from,to);
    }

}
