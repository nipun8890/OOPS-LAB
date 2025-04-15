package Experiment8;
import java.util.HashSet;
import java.util.Set;


class SeatAlreadyBookedException extends Exception {
  
	private static final long serialVersionUID = 1L;

	public SeatAlreadyBookedException(String message) {
        super(message);
    }

    private Set<Integer> bookedSeats = new HashSet<>();

    // Method to book a seat
    public void bookSeat(int seatNumber) throws SeatAlreadyBookedException {
        if (bookedSeats.contains(seatNumber)) {
            throw new SeatAlreadyBookedException("Seat " + seatNumber + " is already booked.");
        }
        bookedSeats.add(seatNumber);
        System.out.println("Seat " + seatNumber + " successfully booked.");
    }

    public static <MovieTicketBooking> void main(String[] args) {
        MovieTicketBooking bookingSystem = new MovieTicketBooking();
        int seatToBook = 5;
        
        try {
            ((SeatAlreadyBookedException) bookingSystem).bookSeat(seatToBook); // First booking attempt
            ((SeatAlreadyBookedException) bookingSystem).bookSeat(seatToBook); // Second booking attempt (should throw exception)
        } catch (SeatAlreadyBookedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

