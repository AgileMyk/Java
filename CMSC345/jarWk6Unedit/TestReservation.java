package jarWk6Unedit;
import jarWk6.Assert;
import java.util.Date;
public class TestReservation {
    public static void main(String[] args) throws Exception {
        String datePattern = "MMM dd, yyyy";
        System.out.println("Testing Constructor");
        System.out.println("--------------------------------------");
        String n = "NormalRoom";
        String b = "RoomWBath";
        String v = "RoomWView";
        int resNum1 = -1;
        int resNum2 = 0005;
        int resNum3 = 100000;

        Reservation r1 = new Reservation(resNum1, n, "Jan 01, 2012", "Jan 16, 2012");
        Reservation r2 = new Reservation(resNum2, b, "Feb 02, 2013", "Feb 17, 2013");
        Reservation r3 = new Reservation(resNum3, v, "Mar 03, 2014", "Feb 18, 2014");
        Reservation r4 = new Reservation(resNum1, n, "Apr 04, 2015", "Feb 19, 2015");
        Reservation r5 = new Reservation(resNum2, b, "May 05, 2016", "Mar 20, 2016");
        Reservation r6 = new Reservation(resNum3, v, "Jun 06, 2017", "Apr 21, 2017");
        Reservation r7 = new Reservation(resNum1, n, "Jul 07, 2018", "May 22, 2018");
        Reservation r8 = new Reservation(resNum2, b, "Aug 08, 2019", "Jun 23, 2019");
        Reservation r9 = new Reservation(resNum3, v, "Sep 09, 2020", "Jul 24, 2020");
        Reservation r10 = new Reservation(resNum1, n, "Oct 10, 2021", "Aug 25, 2021");
        Reservation r11 = new Reservation(resNum2, b, "Nov 11, 2022", "Sep 26, 2022");
        Reservation r12 = new Reservation(resNum3, v, "Dec 12, 2023", "Oct 27, 2023");
        Reservation r13 = new Reservation(resNum1, n, "Jan 13, 2024", "Nov 28, 2024");
        Reservation r14 = new Reservation(resNum2, b, "Feb 14, 2025", "Dec 29, 2025");
        Reservation r15 = new Reservation(resNum3, v, "Mar 15, 2026", "Dec 30, 2026");

        Reservation[] Reserves = {r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15};

        System.out.println("Testing Getters");
        System.out.println("-------------------------------------");

        System.out.println("reservation ID test - testing reservation IDs of object 1,2,4 & 6 against each other:");
        System.out.println("should not equal");
        Assert.assertNotEqualsUUID(r1.getReservationID(), r2.getReservationID());
        Assert.assertNotEqualsUUID(r2.getReservationID(), r4.getReservationID());
        Assert.assertNotEqualsUUID(r4.getReservationID(), r6.getReservationID());

        //guestID
        System.out.println("\ntesting getters for correct IDs");
        System.out.println("(should cycle through pre-made variables [-1, 0005, 100000)");
        for (Reservation r : Reserves) {
            System.out.println(r.getGuestID());
        }

        //reservationDate
        System.out.println("\ntesting getters for correct dates (should all be the same)\n");
        for (Reservation r : Reserves) {
            System.out.println(r.getReservationDate());
        }
        for (Reservation r : Reserves) {
            Assert.assertEqualsDate(r.getReservationDate(), r1.getReservationDate());
        }

        //testing for potential date conflicts
        System.out.println("\ntesting for Date conflicts:");
        System.out.println("testing some dates against a constructed new Date() -> should not equals");
        for (Reservation r : Reserves) {
            Assert.assertNotEqualsDate(r.getReservationDate(), new Date());
        }

        //RoomType
        System.out.println("\ntesting getters for correct roomTypes:");
        System.out.println("should cycle through NormalRoom/roomWBath/RoomWView");
        for (Reservation r : Reserves) {
            System.out.println("reservation " + r + ": " + r.getRoomType());
        }
        //startDate
        System.out.println("\ntesting getters for correct startDates");
        System.out.println("should range 1-15\n");
        System.out.println("cycles through each month repeatedly");
        System.out.println("cycles through years 2012-2026");
        for (Reservation r : Reserves) {
            System.out.println("reservation " + r + ": " + r.getReservationStartDate());
        }
        //endDate
        System.out.println("\ntesting getters for correct endDates");
        System.out.println("should range 16-30\n");
        System.out.println("cycles through each month repeatedly");
        System.out.println("cycles through years 2012-2026");
        for (Reservation r : Reserves) {
            System.out.println("reservation " + r + ": " + r.getReservationEndDate());
        }

        Reservation r1a = new Reservation(resNum1, n, "Jan 01, 2012", "Jan 11, 2012");
        Reservation r2a = new Reservation(resNum1, n, "Feb 01, 2012", "Feb 02, 2012");
        Reservation r3a = new Reservation(resNum1, n, "Jan 11, 2012", "Jan 01, 2012");
        Reservation r4a = new Reservation(resNum1, n, "Feb 02, 2012", "Feb 01, 2012");
        Reservation r5a = new Reservation(resNum1, n, "Dec 22, 2012", "Jan 01, 2013");
        Reservation r6a = new Reservation(resNum1, n, "Jan 01, 2012", "Dec 31, 2011");

        long correctValueTest1 = 10;
        long correctValueTest2 = 1;
        long correctValueTest3 = -10;
        long correctValueTest4 = -1;

        System.out.println("Testing calculateReversationNumberOfDays:");
        System.out.println("-------------------------------------");

        Assert.assertEqualsLong(r1a.calculateReversationNumberOfDays(), correctValueTest1);
        Assert.assertEqualsLong(r2a.calculateReversationNumberOfDays(), correctValueTest2);
        Assert.assertEqualsLong(r3a.calculateReversationNumberOfDays(), correctValueTest3);
        Assert.assertEqualsLong(r4a.calculateReversationNumberOfDays(), correctValueTest4);
        System.out.println("\ntesting for dates that span the new year:");
        Assert.assertEqualsLong(r5a.calculateReversationNumberOfDays(), correctValueTest1);
        Assert.assertEqualsLong(r6a.calculateReversationNumberOfDays(), correctValueTest4);


        Reservation setters = new Reservation(2, n, "Feb 02, 2222", "Feb 02, 2222");
        System.out.println("Reservation for setter testing\n");
        System.out.println("All initial numeric values set to 2 (including month of Feb)");
        System.out.println("initial room set to NormalRoom");

        System.out.println("----------getters for all set values----------");
        System.out.println(
        setters.getReservationDate() + "\n" +
        setters.getGuestID() + "\n" +
        setters.getReservationStartDate() + "\n" +
        setters.getReservationEndDate() + "\n" +
        setters.getRoomType() + "\n" +
        setters.getReservationID()
        );
        //values to test against
        int newInt = 3;
        String newDate ="Mar 03, 3333";
        String newRoom = "RoomWView";
        System.out.println("all numeric values set to 3, room set to RoomWView");
        setters.setGuestID(3);
        setters.setReservationStartDate(newDate);
        setters.setReservationEndDate(newDate);
        setters.setRoom("RoomWView");
        System.out.println("\n----------getters for all adjusted values----------\n");
        Assert.assertEqualsInt(setters.getGuestID(), newInt);
        System.out.print("start date:     ");
        Assert.assertEqualsString(setters.getReservationStartDate(), newDate);
        System.out.print("end date:     ");
        Assert.assertEqualsString(setters.getReservationEndDate(), newDate);
        Assert.assertEqualsString(setters.getRoomType(), newRoom);

        System.out.println("\nTesting calculateReversationNumberOfDays");
        System.out.println("----------------------------------------");

        Reservation lowerDate = new Reservation(resNum1, n, "Jan 01, 2022", "Jan 03, 2022");
        long correctVal1 = 2;
        Reservation overlappingDates = new Reservation(resNum1, n, "Jan 28, 2022", "Feb 03, 2022");
        long correctVal2 = 6;
        Reservation inverseDates = new Reservation(resNum1, n, "Feb 03, 2022", "Jan 28, 2022");
        long correctVal3 = -6;
        System.out.println("Testing two values within same month");
        Assert.assertEqualsLong(lowerDate.calculateReversationNumberOfDays(), correctVal1);
        System.out.println("Testing two values overlapping the end of a month");
        Assert.assertEqualsLong(overlappingDates.calculateReversationNumberOfDays(), correctVal2);
        System.out.println("Testing an end date subtracted from a start date: should return negative value");
        Assert.assertEqualsLong(inverseDates.calculateReversationNumberOfDays(), correctVal3);


        //calculateReservationBillAmount Testing

        Reservation normalTestRes1 = new Reservation(001, n, "Jan 01, 2022", "Jan 11, 2022");
        Reservation bathTestRes2 = new Reservation(002, b, "Jan 01, 2022", "Jan 11, 2022");
        Reservation viewTestRes3 = new Reservation(003, v, "Jan 01, 2022", "Jan 11, 2022");
        int correctValNormal1 = 120 * 10;
        int correctValBath2 = 200 * 10;
        int correctValView3 = 175 * 10;


        System.out.println("\nTesting calculateReversationNumberOfDays");
        System.out.println("--------------------");
        System.out.println("Prices are multiplied by 10 (10 day stays)");

        System.out.println("\n120 per NormalRoom @ 10 days:");
        System.out.println(normalTestRes1.calculateReservationBillAmount());
        Assert.assertEqualsDouble(normalTestRes1.calculateReservationBillAmount(), correctValNormal1);

        System.out.println("\n200 per RoomWBath @ 10 days:");
        System.out.println(bathTestRes2.calculateReservationBillAmount());
        Assert.assertEqualsDouble(bathTestRes2.calculateReservationBillAmount(), correctValBath2);

        System.out.println("\n175 per RoomWView @ 10 days:");
        System.out.println(viewTestRes3.calculateReservationBillAmount());
        Assert.assertEqualsDouble(viewTestRes3.calculateReservationBillAmount(), correctValView3);

    }

}


    /*
        Currently, the Reservation class makes these assumptions:
    a)
    All arguments input data values to any of the parameters of the Reservation public components are assumed
    to be valid. The Reservation class does not check for valid argument values, and it assumes they are valid.
    No testing for valid input data is required. This also means that all the arguments of any test method
    should contain valid values.
    b) It is also assumed that the order of all inputted reservation dates is valid. That is reservation end
    date > reservation start date. The Reservation class does not check for valid order for reservation dates,
    and it assumes it is valid. No testing for valid order of reservation date is required. This also means
    that the order of reservation dates of any test method should be valid.
    The reservation record includes these attributes:
    a) a unique system-generated reservation ID based on Java universally unique identifier (UUID)data type
     b) system-generated date of when the reservation is made (current date) of Java date data type
     c) the guest ID of Java int data type
     d) the reserved room type. There are 3 room types which are “RoomWBath”, “RoomWView”, and “NormalRoom”
     and they are all of type String. There are 2 rooms of room type “NormalRoom”, all other room types have
     only 1 room
     e) reservation start date of type String of this pattern: MMM dd, yyyy
    f) reservation end date of type String of this pattern: MMM dd, yyyy
    The Reservation class p\nrovides getters and setters public methods for most of these attributes.
     Additionally, the Reservation class provides two public methods as follows:
    a) Once an instance of the Reservation class is created, the calculateReversationNumberOfDays()returns
    the number of days between the end and start dates of a reservation record including the start date and
    excluding the end date. For example, for a reservation start date of “Jan 02, 2025” and a reservation end
    date of “Jan 05, 2025”, this method will return 3.
    b) Once an instance of the Reservation class is created, the calculateReservationBillAmount()returns the
    bill amount due from a guest for the reservation as a Java double value. The bill amount is simply the
    number of reservation days times the daily rate of the reserved room type. The daily rates per room types
    are as follows: “RoomWBath” -> [$200], “RoomWView” -> [$175], and “NormalRoom” -> [$125]

         */


//Create black-box test cases to test the constructor \nand the getters methods of the Reservation