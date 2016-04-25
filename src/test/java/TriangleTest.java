import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void isEqualiteral_whenAllSidesEqual_true() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(true, testTriangle.isEquilateral());
  }

  @Test
  public void isIsosceles_whenTwoSidesEqual_true() {
    Triangle testTriangle = new Triangle(2, 2, 3);
    assertEquals(true, testTriangle.isIsosceles());
  }

  @Test
  public void isScalene_whenNoSidesEqual_true() {
    Triangle testTriangle = new Triangle(2, 3, 4);
    assertEquals(true, testTriangle.isScalene());
  }

  @Test
  public void isScalene_whenNotTriangle_false() {
    Triangle testTriangle = new Triangle(4, 10, 3);
    assertEquals(false, testTriangle.isScalene());
  }
}
