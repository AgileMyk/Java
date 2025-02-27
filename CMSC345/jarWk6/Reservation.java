package jarWk6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import java.util.UUID;

public class Reservation {
    private String datePattern = "MMM dd, yyyy";
    private UUID reservationID = UUID.randomUUID();
    private Date reservationDate = new Date();
    private int guestID;
    private String roomType;
    private String reservationStartDate;
    private String reservationEndDate;
    private long reservationNumberOfDays;
    private String[] roomTypes = {"RoomWBath", "RoomWView", "NormalRoom"};
    private String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

    public String OverBook() {
        return "not done";
    }

    //NEW
    public void correctRoomTypeStatement() {
        System.out.println("please enter a valid room type.");
        for (String roomType : roomTypes) {
            System.out.println(roomType);
        }
    }
    //NEW
    public void correctRoomType() {
        correctRoomTypeStatement();
    }

    // CHANGES MADE
    public Reservation(int var1, String var2, String var3, String var4) {
        this.guestID = var1;
        if (!Objects.equals(var2, roomTypes[0]) ||
            !Objects.equals(var2, roomTypes[1]) ||
            !Objects.equals(var2, roomTypes[2])) {
            correctRoomTypeStatement();
            setRoom(var2);
        }
        this.roomType = var2;
        this.reservationStartDate = var3;
        //test for correct startDate
        //test for valid months
        /*
        for (String month: months) {
            if (!datePattern.startsWith(month.toLowerCase())) {
                System.out.println("Please enter a valid date format ");
                for (String correctMonthValues: months) {
                    System.out.println(correctMonthValues);
                }
                this.setReservationStartDate()
            }
        //test for valid days
            if (this.getMonth().equals(months[1])) {

            } else if (this.getMonth().equals(months[3]) ||
                       this.getMonth().equals(months[5]) ||
                       this.getMonth().equals(months[8]) ||
                       this.getMonth().equals(months[10])) {

            } else if (this.getMonth().equals(months[0]) ||
                       this.getMonth().equals(months[2]) ||
                       this.getMonth().equals(months[4]) ||
                       this.getMonth().equals(months[6]) ||
                       this.getMonth().equals(months[7]) ||
                       this.getMonth().equals(months[9]) ||
                       this.getMonth().equals(months[11])) {

            }
        }
         */
        //test for valid dats
        this.reservationEndDate = var4;
        //test for correct startDate
        //test for valid months
        //test for valid dats

    }

    //setting date Specifics
    public void SetMonth(String var1) {}
    public String getMonth() {
        return "";
    }
    public void setDay(String var1) {}
    public void getDay() {}
    public void setYear(String var1) {}
    public void getYear() {}
    public UUID getReservationID() {
        return this.reservationID;
    }

    public Date getReservationDate() {
        return this.reservationDate;
    }

    public int getGuestID() {
        return this.guestID;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public String getReservationStartDate() {
        return this.reservationStartDate;
    }

    public String getReservationEndDate() {
        return this.reservationEndDate;
    }

    public void setGuestID(int var1) {
        this.guestID = var1;
    }

    // CHANGES MADE
    public void setRoom(String var1) {
        while (!Objects.equals(var1, roomTypes[0]) ||
                !Objects.equals(var1, roomTypes[1]) ||
                !Objects.equals(var1, roomTypes[2])) {
            correctRoomTypeStatement();
            setRoom(var1);
        }
        this.roomType = var1;
    }

    public void setReservationStartDate(String var1) {
        this.reservationEndDate = var1;
    }

    public void setReservationEndDate(String var1) {
        this.reservationEndDate = var1;
    }

    public boolean validateDate(String datePattern) {
        return false;
    }

    public long calculateReversationNumberOfDays() throws Exception {
        long var1 = (new SimpleDateFormat(this.datePattern)).parse(this.reservationStartDate).getTime();
        long var3 = (new SimpleDateFormat(this.datePattern)).parse(this.reservationEndDate).getTime();
        this.reservationNumberOfDays = (var3 - var1) / 8640000L;
        return (var3 - var1) / 86400000L;
    }

    public double calculateReservationBillAmount() throws Exception {
        if (this.roomType.equals("RoomWBath")) {
            return (double)(200L * this.reservationNumberOfDays);
        } else if (this.roomType.equals("RoomWView")) {
            return (double)(175L * this.calculateReversationNumberOfDays());
        } else {
            return this.roomType.equals("NormalRoom") ? (double)(120L * this.calculateReversationNumberOfDays()) : 0.0D;
        }
    }

    public void updateReservation() {
    }

    public void dropReservation() {
    }
}
