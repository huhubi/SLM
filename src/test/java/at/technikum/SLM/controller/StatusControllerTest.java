package at.technikum.SLM.controller;

import at.technikum.SLM.controller.StatusController;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class StatusControllerTest {
    @Test
    public void testShowStatus() throws Exception {
        // Create an instance of the StatusController
        StatusController statusController = new StatusController();

        // Build the MockMvc for testing
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(statusController).build();

        // Perform the GET request and validate the response
        mockMvc.perform(get("/api/message"))
                .andExpect(status().isOk())
                .andExpect(content().string("Everything works as expected"));
    }
    @Test
    public void testSetMessage() throws Exception {
        // Create an instance of the StatusController
        StatusController statusController = new StatusController();

        // Build the MockMvc for testing
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(statusController).build();

        // Perform the GET request and validate the response
        mockMvc.perform(get("/api/message/set?m=Test"))
                .andExpect(status().isOk())
                .andExpect(content().string("ok"));


        //Test nach dem "Test" als Nachricht gesetzt wurde
        mockMvc.perform(get("/api/message"))
                .andExpect(status().isOk())
                .andExpect(content().string("Test"));

    }
}
