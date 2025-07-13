
package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    // 2. spring-rest-handson
    //REST - Country Web Service
    @RequestMapping(value = "/country", method = RequestMethod.GET)
    public Country getCountryIndia() {
        LOGGER.info("START");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Country in = (Country) context.getBean("in");
        LOGGER.info("END");
        return in;
    }

    // 2. spring-rest-handson
    //REST - Get country based on country code
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) throws Exception {
        LOGGER.info("START");
        CountryService service = new CountryService();
        Country result = service.getCountry(code);
        LOGGER.info("END");
        return result;
    }
}
