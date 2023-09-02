package no.hvl.dat250.h587851.exp1;

public class Converter {

    private static final double IN_TO_METER = 0.0254;
    private static final double FT_TO_METER = 0.3048;
    private static final double MI_TO_METER = 1609.344;

    /**
     * Takes in a value in the unit specified in fromUnit and returns the value in meter
     * @param fromUnit
     * @param value
     * @return value in meters
     */
    public double toMeters(String fromUnit, double value){
        double inMeters;
        if (fromUnit.equals("in")) {
            inMeters = value * IN_TO_METER;
        } else if (fromUnit.equals("ft")) {
            inMeters = value * FT_TO_METER;
        } else if (fromUnit.equals("mi")) {
            inMeters = value * MI_TO_METER;
        } else if (fromUnit.equals("m")) {
            inMeters = value;
        } else {
            inMeters = Double.NaN;
        }
        return inMeters;
    }

    /**
     * Takes in a value in meters and return the value in the unit specified in toUnit
     * @param toUnit
     * @param inMeters
     * @return value in specified unit
     */
    public double fromMeters(String toUnit, double inMeters){
        double result;
        if (toUnit.equals("in")) {
            result = inMeters / IN_TO_METER;
        } else if (toUnit.equals("ft")) {
            result = inMeters / FT_TO_METER;
        } else if (toUnit.equals("mi")) {
            result = inMeters / MI_TO_METER;
        } else if (toUnit.equals("m")) {
            result = inMeters;
        } else {
            result = Double.NaN;
        }
        return result;
    }


}
