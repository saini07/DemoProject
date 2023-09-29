package controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.example.DemoProject.HelloWorldController;
import com.example.DemoProject.Service.HelloWorldService;

@SpringJUnitConfig 
public class HelloWorldControllerTest {
	

	
	@Mock
    private HelloWorldService helloWorldService;

    @InjectMocks
    private HelloWorldController helloWorldController;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetWelcomeMessage() {
        // Arrange
        String expectedMessage = "Welcome to Hello World!!";
        when(helloWorldService.getWelcomeMessage()).thenReturn(expectedMessage);

        // Act
        ResponseEntity<Object> responseEntity = helloWorldController.getWelcomeMessage();
        System.out.println(responseEntity.getBody());
        // Assert
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(expectedMessage, responseEntity.getBody());
    }

	
}
