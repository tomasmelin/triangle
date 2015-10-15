import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * Created by Tomas on 2015-05-18.
 */
public class TriangleTest extends TestCase {

    Triangle triangle = new Triangle();
    @Test
    public void testIsWithinLimits() throws Exception {
        int limitTestInteger = 50;
        assertTrue(triangle.isWithinLimits(limitTestInteger));
    }

    @Test
    public void testCheckTriangleType() throws Exception {

    }

    @Test
    public void testCheckRightAngledTriangle() throws Exception {

    }

    @Test
    public void testIsIsoscele() throws Exception {
        triangle.isIsoscele();
    }

    @Test
    public void testIsEquilateral() throws Exception {

    }

    @Test
    public void testIsWithinBasicConditions() throws Exception {

    }

    @Test
    public void testGetA() throws Exception {

    }

    @Test
    public void testSetA() throws Exception {

    }

    @Test
    public void testGetB() throws Exception {

    }

    @Test
    public void testSetB() throws Exception {

    }

    @Test
    public void testGetC() throws Exception {

    }

    @Test
    public void testSetC() throws Exception {

    }

    @Test
    public void testGetLowerLimit() throws Exception {

    }

    @Test
    public void testGetUpperLimit() throws Exception {

    }
}