package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WelcomeTest {

    Welcome welcome = new Welcome();

    @Test
    void whatIsAwesome() {
        welcome.setAwesomeness(10);
        assertEquals(10, 10);
        System.out.println(welcome.getAwesomeness());
    }

    @Test
    void getAndSetHej() {
        welcome.setHej("Hej David");
        assertEquals("Hej David", welcome.getHej());
        System.out.println(welcome.getHej());
    }
}