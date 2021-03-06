package io.seventytwo.academcy.translationservice.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@RunWith(SpringRunner.class)
public class LanguageRestControllerMockTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getLanguageName() throws Exception {
        this.mockMvc.perform(
                get("/language/DE"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Deutsch")));
    }
}
