package io.seventytwo.academcy.translationservice.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@Slf4j
@RestController
@RequestMapping("/language")
public class LanguageRestController {

    @GetMapping("/{isocode}")
    public String getLanguageName(@PathVariable String isocode) {
        log.info("getLanguageName({})",  isocode);

        Locale.setDefault(new Locale("DE", "ch"));

        Locale locale = new Locale(isocode);

        return locale.getDisplayLanguage();
    }
}