package com.maksym;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class AritmeticaTest {
    
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @Test 
    @DisplayName("Sumar Test Aritmética básica")
    public void testAritmeticaSumar() {
       
        provideInput("1\n1\n5\n5\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("Solución: 10") );
        
    }

    @Test 
    @DisplayName("Restar Test Aritmética básica")
    public void testAritmeticaRestar() {
       
        provideInput("1\n2\n5\n5\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("Solución: 0") );
        
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }
}
