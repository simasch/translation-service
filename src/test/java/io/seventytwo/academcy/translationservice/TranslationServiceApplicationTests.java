package io.seventytwo.academcy.translationservice;

import io.seventytwo.academcy.translationservice.api.CountryRestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TranslationServiceApplicationTests {

    @Autowired
    private CountryRestController countryRestController;

    @Test
    public void contextLoads() {
        assertThat(countryRestController).isNotNull();
    }

}
