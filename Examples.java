import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class Examples {

    public  Examples(){}

    // can instantiate things here
    LinkedList<IReport> reports1 = new LinkedList<IReport>();
    LinkedList<IReport> reports2 = new LinkedList<IReport>();
    WeatherMonitor monitor1 = new WeatherMonitor(reports1);
    WeatherMonitor monitor2 = new WeatherMonitor(reports2);
    GregorianCalendar date1 = new GregorianCalendar(2002, 07, 24);
    Time time1 = new Time(5, 10);
    Time time2 = new Time(2, 14);
    Time time3 = new Time(6, 29);
    LinkedList<Reading> readings1 = new LinkedList<Reading>();
    Reading r1 = new Reading(time1, 10.0,20.0);
    Reading r2 = new Reading(time2, 14.5,113.2);
    Reading r3 = new Reading(time3, 48.2,16.8);
    LinkedList<Double> temps1 = new LinkedList<Double>();
    LinkedList<Double> rain1 = new LinkedList<Double>();

    LinkedList<IReport> reports3 = new LinkedList<IReport>();
    WeatherMonitor monitor3 = new WeatherMonitor(reports3);
    GregorianCalendar date2 = new GregorianCalendar(2020, 10, 12);
    GregorianCalendar date3 = new GregorianCalendar(2020, 10, 14);
    GregorianCalendar date4 = new GregorianCalendar(2010, 10, 14);
    LinkedList<Double> temps2 = new LinkedList<Double>();
    LinkedList<Double> temps3 = new LinkedList<Double>();
    LinkedList<Double> rain2 = new LinkedList<Double>();
    LinkedList<Double> rain3 = new LinkedList<Double>();
    LinkedList<Double> rain4 = new LinkedList<Double>();

    LinkedList<IReport> reports4 = new LinkedList<IReport>();
    WeatherMonitor monitor4 = new WeatherMonitor(reports4);

        @Test
    public void testaverageTempForMonth(){

            temps2.add(15.0);
            temps2.add(1.4);
            temps2.add(14.2);
            temps3.add(12.4);
            temps3.add(24.1);
            temps3.add(103.4);
            DailyWeatherReport report2 = new DailyWeatherReport(date2, temps2, rain2);
            DailyWeatherReport report3 = new DailyWeatherReport(date3, temps3, rain2);
            reports3.add(report2);
            reports3.add(report3);

            assertEquals(monitor3.averageTempForMonth(10,2020), 28.417, .1);

        }

        @Test
        public void testAvgTempForMonthDiffYear(){
            temps2.add(15.0);
            temps2.add(1.4);
            temps2.add(14.2);
            temps3.add(12.4);
            temps3.add(24.1);
            temps3.add(103.4);
            DailyWeatherReport report2 = new DailyWeatherReport(date4, temps2, rain2);
            DailyWeatherReport report3 = new DailyWeatherReport(date3, temps3, rain2);
            reports3.add(report2);
            reports3.add(report3);

            assertEquals(monitor3.averageTempForMonth(10,2020), 46.633, .1);

        }

        @Test
    public void testAvgTempForMonthDenom0(){
            temps2.add(15.0);
            temps2.add(1.4);
            temps2.add(14.2);
            temps3.add(12.4);
            temps3.add(24.1);
            temps3.add(103.4);
            DailyWeatherReport report2 = new DailyWeatherReport(date2, temps2, rain2);
            DailyWeatherReport report3 = new DailyWeatherReport(date3, temps3, rain2);
            reports3.add(report2);
            reports3.add(report3);

            assertEquals(monitor3.averageTempForMonth(11,2020), 0, .1);

        }

        @Test
        public void testTotalRainfall(){

            rain2.add(15.2);
            rain2.add(35.5);
            rain2.add(0.0);
            rain3.add(15.2);
            rain3.add(204.4);
            rain3.add(19.4);
            rain4.add(0.0);
            rain4.add(13.1);
            rain4.add(142.4);
            DailyWeatherReport report2 = new DailyWeatherReport(date2, temps2, rain2);
            DailyWeatherReport report3 = new DailyWeatherReport(date3, temps2, rain3);
            DailyWeatherReport report4 = new DailyWeatherReport(date4, temps2, rain4);
            reports4.add(report2);
            reports4.add(report3);
            reports4.add(report4);

            assertEquals(monitor4.totalRainfallForMonth(10,2020), 289.7, .1);

        }

    @Test
    public void testTotalRainfallDiffYear(){

        rain2.add(15.2);
        rain2.add(35.5);
        rain2.add(0.0);
        rain3.add(15.2);
        rain3.add(204.4);
        rain3.add(19.4);
        rain4.add(0.0);
        rain4.add(13.1);
        rain4.add(142.4);
        DailyWeatherReport report2 = new DailyWeatherReport(date2, temps2, rain2);
        DailyWeatherReport report3 = new DailyWeatherReport(date3, temps2, rain3);
        DailyWeatherReport report4 = new DailyWeatherReport(date4, temps2, rain4);
        reports4.add(report2);
        reports4.add(report3);
        reports4.add(report4);

        assertEquals(monitor4.totalRainfallForMonth(10,2010), 155.5, .1);
    }

    @Test
    public void testTotalRainfallNoDates(){

        rain2.add(15.2);
        rain2.add(35.5);
        rain2.add(0.0);
        rain3.add(15.2);
        rain3.add(204.4);
        rain3.add(19.4);
        rain4.add(0.0);
        rain4.add(13.1);
        rain4.add(142.4);
        DailyWeatherReport report2 = new DailyWeatherReport(date2, temps2, rain2);
        DailyWeatherReport report3 = new DailyWeatherReport(date3, temps2, rain3);
        DailyWeatherReport report4 = new DailyWeatherReport(date4, temps2, rain4);
        reports4.add(report2);
        reports4.add(report3);
        reports4.add(report4);

        assertEquals(monitor4.totalRainfallForMonth(10,2012), 0, .1);
    }











/*
    @Test
    public void testAddDailyReport(){
        readings1.add(r1);
        readings1.add(r2);
        readings1.add(r3);
        temps1.add(10.0);
        temps1.add(14.5);
        temps1.add(48.2);
        rain1.add(20.0);
        rain1.add(113.2);
        rain1.add(16.8);
        DailyWeatherReport report1 = new DailyWeatherReport(date1, temps1, rain1);
        monitor1.addDailyReport(date1, readings1);

        assertEquals(monitor1.getReports(),monitor2.getReports());

    }*/


}
