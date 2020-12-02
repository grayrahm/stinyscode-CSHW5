import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor{
    private LinkedList<IReport> reports;

    //constructor
    public WeatherMonitor(LinkedList<IReport> reports) {
        this.reports = reports;

    }

    public LinkedList<IReport> getReports() {
        return reports;
    }

    /**
     * Calculate the average temperature over all days that month
     * @param month the month that the user is looking for the average temp in
     * @param year the year that the user is looking for the average temp in
     * @return the average temperature
     */
    public double averageTempForMonth(int month, int year){

        LinkedList<IReport> list = new LinkedList<IReport>();

        for(IReport report: reports){
            if((report.getDate().get(GregorianCalendar.MONTH) == month) && (report.getDate().get(GregorianCalendar.YEAR) == year)){
                list.add(report);
            }
        }

        double sum = 0.0;
        int denom = 0;
        for(IReport report: list){
            denom = denom + report.getTempReadings().size();
            for(Double x : report.getTempReadings()){
                sum = sum + x;
            }
        }

        if(denom == 0)
            return 0.0;

        return sum/denom;
    }

    /**
     * Calculate the total rainfall over all days that month
     * @param month the month that the user is looking for the average temp in
     * @param year the year that the user is looking for the average temp in
     *@return the total rainfall
     */
    public double totalRainfallForMonth(int month, int year){

        LinkedList<IReport> list = new LinkedList<IReport>();

        for(IReport report: reports){
            if((report.getDate().get(GregorianCalendar.MONTH) == month) && (report.getDate().get(GregorianCalendar.YEAR) == year)){
                list.add(report);

            }
        }

        double sum = 0.0;

        for(IReport report: list){
            for(Double x : report.getRainReadings()){
                sum = sum + x;
            }
        }

        return sum;

    }

    /**
     * Add a new daily report to the weather monitor linked list
     * @param date the date the reading is from
     * @param readings a list of temp and rainfall readings at different times
     */
    public void addDailyReport(GregorianCalendar date,LinkedList<Reading> readings){
        LinkedList<Double> list = new LinkedList<Double>();
        IReport report = new DailyWeatherReport(date, list, list);
        report.setDate(date);

        for(Reading reading: readings){
            report.getTempReadings().add(reading.getTemp());
            report.getRainReadings().add(reading.getAmtRainfall());
        }
        reports.add(report);
    }
}
