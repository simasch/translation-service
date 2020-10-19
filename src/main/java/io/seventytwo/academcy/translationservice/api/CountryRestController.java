package io.seventytwo.academcy.translationservice.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/country")
public class CountryRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryRestController.class);

    @GetMapping("/{isocode}")
    public String getCountryName(@PathVariable String isocode) {
        LOGGER.info("getCountryName({})",  isocode);

        Locale.setDefault(new Locale("DE", "ch"));

        Locale locale = new Locale("DE", isocode);

        return locale.getDisplayCountry();
    }
}
