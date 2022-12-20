import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void test(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Harry 1");
        manager.addMovie("Harry 2");
        manager.addMovie("Harry 3");

        String[] expected = {"Harry 1", "Harry 2", "Harry 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
