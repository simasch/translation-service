package io.seventytwo.academcy.translationservice;

import io.seventytwo.academcy.translationservice.api.CountryRestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TranslationServiceApplicationTests {

    @Autowired
    private CountryRestController countryRestController;

    @Test
    public void contextLoads() {
        assertThat(countryRestController).isNotNull();
    }

}
