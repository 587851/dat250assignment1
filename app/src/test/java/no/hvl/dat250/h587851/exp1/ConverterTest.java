package no.hvl.dat250.h587851.exp1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {
    Converter converter = new Converter();
    @Test
    public void inchesToMeter(){
        double meter = converter.toMeters("in", 100);
        double expectedValue = 100 * 0.0254;
        assertEquals(meter, expectedValue);
    }

    @Test
    public void feetToMeter(){
        double meter = converter.toMeters("ft", 100);
        double expectedValue = 100 * 0.3048;
        assertEquals(meter, expectedValue);
    }

    @Test
    public void milesToMeter(){
        double meter = converter.toMeters("mi", 100);
        double expectedValue = 100 * 1609.344;
        assertEquals(meter, expectedValue);
    }

    @Test
    public void meterToMeter(){
        double meter = converter.toMeters("m", 100);
        double expectedValue = 100;
        assertEquals(meter, expectedValue);
    }

    //////

    @Test
    public void meterToInches(){
        double meter = converter.fromMeters("in", 100);
        double expectedValue = 100 / 0.0254;
        assertEquals(meter, expectedValue);
    }

    @Test
    public void meterToFeet(){
        double meter = converter.fromMeters("ft", 100);
        double expectedValue = 100 / 0.3048;
        assertEquals(meter, expectedValue);
    }

    @Test
    public void meterToMiles(){
        double meter = converter.fromMeters("mi", 100);
        double expectedValue = 100 / 1609.344;
        assertEquals(meter, expectedValue);
    }

    @Test
    public void meterToMeter2(){
        double meter = converter.fromMeters("m", 100);
        double expectedValue = 100;
        assertEquals(meter, expectedValue);
    }
}
