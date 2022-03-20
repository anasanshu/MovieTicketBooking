import java.util.*;

public class Booking extends BaseModel {
    private Show show;
    private List<Seat> seatsBooked;
    private BookingStatus bookingStatus;
    private String user;

    public Booking(String id, Date createdAt, Show show, List<Seat> seatsBooked, BookingStatus bookingStatus,
            String user) {
        super(id, createdAt);
        this.show = show;
        this.seatsBooked = seatsBooked;
        this.bookingStatus = bookingStatus;
        this.user = user;
    }

    public Show getShow() {
        return show;
    }
    public void setShow(Show show) {
        this.show = show;
    }
    public List<Seat> getSeatsBooked() {
        return seatsBooked;
    }
    public void setSeatsBooked(List<Seat> seatsBooked) {
        this.seatsBooked = seatsBooked;
    }
    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }
    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    
}


/*
Screen1 = 1......100

B1 = show1, screen1 - 1,2,3

B2 = show1, screen1 - 10, 11, 12

B3 = show2 - screen1 - 2,3,10

B4 = show2 - screen1 - AvailableSeat( 1, 4....9, 11.....end)
totalNoOFSeats = 100
noOfBookedSeats = 3
List<Seat> bookedSeats = [2,3,4]
List<Seat> totalSeats = [1.....100]

List<Seat> availableSeats = totalSeats.remove(bookedSeats);

A1 A2 A3
B1 5 6


*/