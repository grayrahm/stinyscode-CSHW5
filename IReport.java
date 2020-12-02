import java.util.GregorianCalendar;
import java.util.LinkedList;

public interface IReport {

    public GregorianCalendar getDate();
    public LinkedList<Double> getTempReadings();
    public LinkedList<Double> getRainReadings();

    public void setDate(GregorianCalendar d);



}
