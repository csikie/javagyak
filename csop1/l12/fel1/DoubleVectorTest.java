import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class DoubleVectorTest
{
    @Test
    public void equalsIsReflexiv()
    {
        DoubleVector v1 = new DoubleVector(1, 3);
        assertTrue(v1.equals(v1));
    }

    @Test
    public void equalsIsSymmetric1()
    {
        DoubleVector v1 = new DoubleVector(1, 3);
        DoubleVector v2 = new DoubleVector(1, 3);
        if (v1.equals(v2))
        {
            assertTrue(v2.equals(v1));
        }
        if (v2.equals(v1))
        {
            assertTrue(v1.equals(v2));
        }
    }

    @Test
    public void equalsIsSymmetric2()
    {
        DoubleVector v1 = new DoubleVector(1, 3);
        DoubleVector v2 = new DoubleVector(1, 5);
        if (v1.equals(v2))
        {
            assertTrue(v2.equals(v1));
        }
        if (v2.equals(v1))
        {
            assertTrue(v1.equals(v2));
        }
    }

    @Test
    public void equalsIsTransitive1()
    {
        DoubleVector v1 = new DoubleVector(1, 3);
        DoubleVector v2 = new DoubleVector(1, 3);
        DoubleVector v3 = new DoubleVector(1, 3);
        if (v1.equals(v2) && v2.equals(v3))
        {
            assertTrue(v1.equals(v3));
        }
    }

    @Test
    public void equalsIsTransitive2()
    {
        DoubleVector v1 = new DoubleVector(1, 3);
        DoubleVector v2 = new DoubleVector(1, 5);
        DoubleVector v3 = new DoubleVector(1, 3);
        if (v1.equals(v2) && v2.equals(v3))
        {
            assertTrue(v1.equals(v3));
        }
    }

    @Test
    public void equalsWithNullParam()
    {
        DoubleVector v = new DoubleVector(10, 20);
        assertFalse(v.equals(null));
    }

    @Test(expected = NullPointerException.class)
    public void equalsOnNullref()
    {
        DoubleVector v1 = new DoubleVector(10, 20);
        DoubleVector v2 = null;
        v2.equals(v1);
    }

    @Test
    public void equalObjHashCodeIsSame()
    {
        DoubleVector v1 = new DoubleVector(1, 3);
        DoubleVector v2 = new DoubleVector(1, 3);
        assertTrue(v1.equals(v2));
        assertTrue(v1.hashCode() == v2.hashCode());
    }
}
