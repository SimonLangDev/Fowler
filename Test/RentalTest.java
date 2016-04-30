import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by SL-Th on 30.04.2016.
 */
public class RentalTest {
    Movie movie = new Movie("TestMovie", 50);
    Rental rental = new Rental(movie, 42);

    @Test
    public void getDaysRented() throws Exception {
        assertEquals(rental.getDaysRented(),42);
    }

    @Test
    public void getMovie() throws Exception {
        assertEquals(rental.getMovie(),movie);
    }
}
