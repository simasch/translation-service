package io.seventytwo.academcy.translationservice.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@Slf4j
@RestController
@RequestMapping("/country")
public class CountryRestController {

    @GetMapping("/{isocode}")
    public String getCountryName(@PathVariable String isocode) {
        log.info("getCountryName({})",  isocode);

        Locale.setDefault(new Locale("DE", "ch"));

        Locale locale = new Locale("DE", isocode);

        return locale.getDisplayCountry();
    }
}
