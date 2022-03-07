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

public class FuncionEcuacionesTest {
    
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
    @DisplayName("Test ecuación de primer grado")
    public void testEcuacion1ºgrad() {
       
        provideInput("4\n3\n-18\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("La solución es: 6") );
        
    }

    @Test 
    @DisplayName("Test No ecuacion")
    public void TestEcuacion1ºgraderr() {
       
        provideInput("4\n0\n52\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("Esto no es una ecuación") );
        
    }

    @Test 
    @DisplayName("Test ecuación de segundo grado sin soluciones")
    public void TestEcuacion2ºgraderr() {
       
        provideInput("5\n2\n3\n4\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("No tiene soluciones reales") );
        
    }    

    @Test 
    @DisplayName("Test ecuación de segundo grado")
    public void TestEcuacion2ºgrad() {
       
        provideInput("5\n2\n3\n-4\n0");
        
        App.main(new String[0]);
        assertThat(getOutput(), containsString("Las soluciones son: 0.8507810593582121 y -2.350781059358212") );
        
    }    

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }
}
