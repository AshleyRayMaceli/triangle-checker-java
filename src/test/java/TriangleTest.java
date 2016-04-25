import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void isEqualateral_whenAllSidesEqual_true() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(true, testTriangle.isEqualateral());
  }

  @Test
  public void isIsosolese_whenTwoSidesEqual_true() {
    Triangle testTriangle = new Triangle(2, 2, 3);
    assertEquals(true, testTriangle.isIsosolese());
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
