
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;
import java.util.Arrays;

public class AdderTest {
  private static final double EPSILON = 0.01;

  @Test
  public void add_isSane(){
    int result = Integer.parseInt(Adder.add("145", "972"));
    assertEquals(145+972, result);
    
    assertNotEquals(
      Adder.add("1", "2"),
      Adder.add("1", "3"));
  }

  @Test
  public void add_hasProperties(){
    // commutative
    assertEquals(
      Adder.add("250", "300"),
      Adder.add("300", "250"));

    // associative
    assertEquals(
      Adder.add("500", Adder.add("250", "300")),
      Adder.add(Adder.add("500", "250"), "300"));

    // identity element
    String r1 = Adder.add("442", "0");
    String r2 = Adder.add("0", "442");
    String r3 = "442";
    assertTrue( r1.equals(r2) && r2.equals(r3));
  }

  @Test
  public void add_acceptsDouble(){
    double result2 = Double.parseDouble(Adder.add("2.526", "4.995"));

    assertTrue(result2 - (2.526+4.995) < EPSILON);

    assertEquals(
      2.526 + 4.995,
      result2,
      EPSILON);
  }

  @Test
  public void add_acceptsBinary(){
    int result = Integer.parseInt(Adder.add("0b01", "0b11"));
    
    assertEquals(5, result);
  }

  @Test
  public void add_acceptsStrings(){
    int result = Integer.parseInt(Adder.add("eighty-nine", "four"));
    
    assertEquals("ninety-three", result);
  }


  public void add_worksAroundZero(){
    assertEquals(
      String.valueOf(0),
      Integer.parseInt(Adder.add("0", "0")));

    assertEquals(
      String.valueOf(1),
      Integer.parseInt(Adder.add("0", "1")));

    assertEquals(
      String.valueOf(-1),
      Integer.parseInt(Adder.add("-1", "0")));

    assertEquals(
      String.valueOf(0),
      Integer.parseInt(Adder.add("1", "-1")));
  }

  @Test
  public void add_recognizesNullReference(){
    try{
        Adder.add(null, "12");
        fail();
    } catch(IllegalArgumentException e){
    }

    try{
        Adder.add("12", null);
        fail();
    } catch(IllegalArgumentException e){
    }

    try{
        Adder.add(null, null);
        fail();
    } catch(IllegalArgumentException e){
    }
  }


  @Test
  public void add_recognizesInvalidString(){
    try{
        Adder.add("Abc", "Def");
        fail();
    } catch(IllegalArgumentException e){
    }

    try{
        Adder.add(" ", "12");
        fail();
    } catch(IllegalArgumentException e){
    }
  }


  @Test
  public void add_trimsString(){
    assertEquals(
        String.valueOf(21+23),
        Adder.add(" 21  ", " 23"));
  }
}
