import java.util.Date;

public class PersonTest {
    public static void main(String[] args) {
        Person Mike = new Person();
        Mike.EmployeeStatus(true);
        Mike.setAttributes("Mike", 68, 160, "brown", "brown", "logistics", 40);
        System.out.println("BMI: " + Mike.getBMI());

        Person test = new Person();

        Date newDate = new Date(2000-01-01);
        Date elapsedDate = new Date(1177312);
        String Date = newDate.toString();
        System.out.println(newDate);
        long newDateCopy = newDate.getTime();
        Date now = new Date();
        System.out.println("present: " + now);

        System.out.println("elapsed time: " + newDate.getTime());

        System.out.println("new date:" + newDateCopy);
        System.out.println("tester method for undeclared double:");
        System.out.println(Mike.tester());
    }
}
