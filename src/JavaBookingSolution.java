import java.time.*;
import java.time.temporal.ChronoUnit;

public class JavaBookingSolution {
    public static void main(String[] args) {
        // TODO 1: Flight Booking Date (LocalDate)
        // - Create a LocalDate object representing the flight booking date (today's date).
        // - Print the booking date.
        // - Simulate a user booking a flight for a specific future date (e.g., 2024-12-15).
        // - Print the flight booking date and the days until the flight.
        LocalDate bookingDate = LocalDate.now();
        LocalDate flightDate = LocalDate.of(2024, 12, 15);
        long daysUntilFlight = ChronoUnit.DAYS.between(bookingDate, flightDate); // Calculate days between booking and flight
        System.out.println(bookingDate);
        System.out.println(flightDate);
        System.out.println("Days until the Flight: " + daysUntilFlight);
        System.out.println();

        // TODO 2: Flight Time (LocalTime)
        // - Create a LocalTime object for the flight departure time (e.g., 14:30).
        // - Print the departure time.
        // - Simulate the flight duration (e.g., 5 hours and 45 minutes) and calculate the arrival time.
        // - Print the arrival time.
        LocalTime departureTime= LocalTime.of(14, 30);
        LocalTime arrivalTime = departureTime.plusHours(5).plusMinutes(45);
        Duration flightDuration = Duration.between(departureTime, arrivalTime);
        System.out.println("Arriving at: " + arrivalTime);
        System.out.println("Flight Lasted: " + flightDuration);

        // TODO 3: Full Flight Schedule (LocalDateTime)
        // - Create a LocalDateTime object for the full flight schedule (departure date and time).
        // - Print the departure date and time.
        // - Calculate the flight's estimated arrival date and time.
        LocalDateTime departureDateTime = LocalDateTime.of(flightDate, departureTime);
        LocalDateTime arrivalDateTime = departureDateTime.plus(flightDuration);
        System.out.println("Departure at: " + departureDateTime);
        System.out.println("Flight lasted: " + flightDuration );



    }
}


