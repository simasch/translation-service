package io.seventytwo.academcy.translationservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/country")
public class CountryRestController {

    @GetMapping("/{isocode}")
    public String getCountryName(@PathVariable String isocode) {
        Locale.setDefault(new Locale("DE", "ch"));

        Locale locale = new Locale("DE", isocode);

        return locale.getDisplayCountry();
    }
}
