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
    @Test
    public void test2(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Harry 1");
        manager.addMovie("Harry 2");
        manager.addMovie("Harry 3");

        String[] expected = {"Harry 3", "Harry 2", "Harry 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Harry 1");
        manager.addMovie("Harry 2");
        manager.addMovie("Harry 3");
        manager.addMovie("Harry 4");
        manager.addMovie("Harry 5");
        manager.addMovie("Harry 6");
        manager.addMovie("Harry 7");
        manager.addMovie("Harry 8");
        manager.addMovie("Harry 9");
        manager.addMovie("Harry 10");

        String[] expected = {"Harry 1","Harry 2","Harry 3","Harry 4","Harry 5","Harry 6","Harry 7","Harry 8", "Harry 9", "Harry 10"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Harry 1");
        manager.addMovie("Harry 2");
        manager.addMovie("Harry 3");
        manager.addMovie("Harry 4");
        manager.addMovie("Harry 5");
        manager.addMovie("Harry 6");
        manager.addMovie("Harry 7");
        manager.addMovie("Harry 8");
        manager.addMovie("Harry 9");
        manager.addMovie("Harry 10");
        manager.addMovie("Harry 11");

        String[] expected = {"Harry 1","Harry 2","Harry 3","Harry 4","Harry 5","Harry 6","Harry 7","Harry 8", "Harry 9", "Harry 10", "Harry 11"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Harry 1");
        manager.addMovie("Harry 2");
        manager.addMovie("Harry 3");
        manager.addMovie("Harry 4");
        manager.addMovie("Harry 5");
        manager.addMovie("Harry 6");
        manager.addMovie("Harry 7");
        manager.addMovie("Harry 8");
        manager.addMovie("Harry 9");
        manager.addMovie("Harry 10");

        String[] expected = {"Harry 10", "Harry 9", "Harry 8", "Harry 7", "Harry 6", "Harry 5", "Harry 4", "Harry 3", "Harry 2", "Harry 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Harry 1");
        manager.addMovie("Harry 2");
        manager.addMovie("Harry 3");
        manager.addMovie("Harry 4");
        manager.addMovie("Harry 5");
        manager.addMovie("Harry 6");
        manager.addMovie("Harry 7");
        manager.addMovie("Harry 8");
        manager.addMovie("Harry 9");
        manager.addMovie("Harry 10");
        manager.addMovie("Harry 11");

        String[] expected = {"Harry 11","Harry 10", "Harry 9", "Harry 8", "Harry 7", "Harry 6", "Harry 5", "Harry 4", "Harry 3", "Harry 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
