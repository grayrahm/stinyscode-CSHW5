import java.util.GregorianCalendar;

public class Reading {

    private Time time;
    private double temp;
    private double amtRainfall;

    public Reading(Time time, double temp, double amtRainfall) {
        this.time = time;
        this.temp = temp;
        this.amtRainfall = amtRainfall;
    }


    /**
     * Return the temperature for the reading object
     * @return temp
     */

    public double getTemp() {
        return temp;
    }


    /**
     * Return the rainfall for the reading object
     * @return double
     */

    public double getAmtRainfall() {
        return amtRainfall;
    }
}
