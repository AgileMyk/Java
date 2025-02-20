package jarWk6Unedit;

import java.text.SimpleDateFormat;
import java.util.Date;
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

    public Reservation(int var1, String var2, String var3, String var4) {
        this.guestID = var1;
        this.roomType = var2;
        this.reservationStartDate = var3;
        this.reservationEndDate = var4;
    }

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

    public void setRoom(String var1) {
        this.roomType = var1;
    }

    public void setReservationStartDate(String var1) {
        this.reservationEndDate = var1;
    }

    public void setReservationEndDate(String var1) {
        this.reservationEndDate = var1;
    }

    public long calculateReversationNumberOfDays() throws Exception {
        long var1 = (new SimpleDateFormat(this.datePattern)).parse(this.reservationStartDate).getTime();
        long var3 = (new SimpleDateFormat(this.datePattern)).parse(this.reservationEndDate).getTime();
        this.reservationNumberOfDays = (var3 - var1) / 8640000L;
        return (var3 - var1) / 86400000L;
    }

    public double calculateReservationBillAmount() throws Exception {
        return switch (this.roomType) {
            case "RoomWBath" -> (double) (200L * this.calculateReversationNumberOfDays());
            case "RoomWView" -> (double) (175L * this.calculateReversationNumberOfDays());
            case "NormalRoom" -> (double) (120L * this.calculateReversationNumberOfDays());
            default -> 0.00;
        };
    }

    public void updateReservation() {
    }

    public void dropReservation() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
