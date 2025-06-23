import java.util.Calendar;
import java.util.GregorianCalendar;
// MyDate class used to generate dates and times
public class MyDate {
  private int year;
  private int month;
  private int day;
  // creates a MyDate object with current date and time
  public MyDate() {
    GregorianCalendar calendar = new GregorianCalendar();
    this.year = calendar.get(Calendar.YEAR);
    this.month = calendar.get(Calendar.MONTH);
    this.day = calendar.get(Calendar.DAY_OF_MONTH);
  }
  // creates a MyDate object with elapsed time
  public MyDate(long elapsedTime) {
    setDate(elapsedTime);
  }
  // creates a MyDate object with year, month, and day
  public MyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }
  // grabs year
  public int getYear() {
    return year;
  }
  // grabs month
  public int getMonth() {
    return month;
  }
  // grabs day 
  public int getDay() {
    return day;
  }
 // sets date with elapsed time
  public void setDate(long elapsedTime) {
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.setTimeInMillis(elapsedTime);
    this.year = calendar.get(Calendar.YEAR);
    this.month = calendar.get(Calendar.MONTH);
    this.day = calendar.get(Calendar.DAY_OF_MONTH);
  }
}
