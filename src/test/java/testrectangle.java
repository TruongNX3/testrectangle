import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class testrectangle {
    @Test
    public void testFirst() {
        double width = 4;
        double height = 2;
        double expected = 8;
        Rectangle rectangle = new Rectangle(width, height);
        double actual = rectangle.getArea();
        assertEquals(expected, actual);
    }
    @Test
    public void testSecond() {
        double width = 4;
        double height = 2;
        double expected = 12;
        Rectangle rectangle = new Rectangle(width, height);
        double actual = rectangle.getprimeter();
        assertEquals(expected, actual);
    }
}
