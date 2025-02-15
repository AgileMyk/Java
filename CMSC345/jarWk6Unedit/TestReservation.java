package jarWk6Unedit;

import jarWk6.Assert;

import java.util.Date;


//Create black-box test cases to test the constructor \nand the getters methods of the Reservation

public class TestReservation {
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
    public static void main(String[] args) {
        String datePattern = "MMM dd, yyyy";

        System.out.println("Testing Constructor");
        System.out.println("--------------------------------------");
        // No testing for valid input data is required. This also means that all the
        // arguments of any test method should contain valid values.
        // ...This also means that the order of reservation dates of any test method should be valid.

        //using boundary-value construction

        /*
        (int var1 -> guestID
        String var2 -> roomType
        String var3 -> reservationStartDate
        String var4 -> reservationEndDate
         */

        String n = "NormalRoom";
        String b = "RoomWBath";
        String v = "RoomWView";

        String m1 = "Jan ";
        String m2 = "Feb ";
        String m3 = "Mar ";
        String m4 = "Apr ";
        String m5 = "May ";
        String m6 = "Jun ";
        String m7 = "Jul ";
        String m8 = "Aug ";
        String m9 = "Sep ";
        String m10 = "Oct ";
        String m11 = "Nov ";
        String m12 = "Dec ";

        String d1 = "-1, ";
        String d2 = "0, ";
        String d3 = "1, ";
        String d4 = "15, ";
        String d5 = "30, ";
        String d6 = "33, ";

        String year1 = "-1";
        String year2 = "0";
        String year3 = "0000";
        String year4 = "9999";
        String year5 = "00000";
        String year6 = "2025";

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
            Reservation tempRes = r1;
            Assert.assertEqualsDate(r.getReservationDate(), tempRes.getReservationDate());
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

    }
}


