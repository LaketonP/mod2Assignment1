public class Main {
  public static void main(String[] args) {
    MyDate date1 = new MyDate(); // grab current date and time
    MyDate date2 = new MyDate(3435555533101L); // generate different date using long
    // display dates
    System.out.println("Date 1: " + date1.getYear() + "-" + (date1.getMonth() + 1) + "-" + date1.getDay());
    System.out.println("Date 2: " + date2.getYear() + "-" + (date2.getMonth() + 1) + "-" + date2.getDay());
    // test setDate method
    date1.setDate(561555550000L); // change the long to test
    System.out.println("Set date test:");
    System.out.println("Date 1: " + date1.getYear() + "-" + (date1.getMonth() + 1) + "-" + date1.getDay());
    // test MyDate with int inputs
    MyDate date3 = new MyDate(2099, 12, 12); // change the three ints to test
    System.out.println("date declare int test:");
    System.out.println("Date 3: " + date3.getYear() + "-" + (date3.getMonth() + 1) + "-" + date3.getDay());
  }
}
