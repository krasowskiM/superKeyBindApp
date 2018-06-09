package main;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void shouldConstruct(){
        Main main = new Main();
        assertTrue(main != null);
    }
}