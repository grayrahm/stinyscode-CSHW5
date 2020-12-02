import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyWeatherReport implements IReport{

    private GregorianCalendar date;
    private LinkedList<Double> tempReadings;
    private LinkedList<Double> rainReadings;

    public DailyWeatherReport(GregorianCalendar date, LinkedList<Double> tempReadings, LinkedList<Double> rainReadings) {
        this.date = date;
        this.tempReadings = tempReadings;
        this.rainReadings = rainReadings;
    }

    @Override
    public GregorianCalendar getDate() {

        return date;
    }

    /**
     * gets LinkedList of temp readings
     * @return LinkedList<Double>
     */
    @Override
    public LinkedList<Double> getTempReadings() {
        return tempReadings;
    }

    /**
     * gets LinkedList of rain readings
     * @return LinkedList<Double>
     */
    @Override
    public LinkedList<Double> getRainReadings() {
        return rainReadings;
    }

    /**
     * sets the date
     * @param d
     */
    @Override
    public void setDate(GregorianCalendar d) {
        date = d;
    }


}
