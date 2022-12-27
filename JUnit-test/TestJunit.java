import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
 
	@Test
  public void testAdd() {
    Calculadora calc = new Calculadora(8, 10);
    assertEquals(18, calc.soma());

  }
	
	@Test
	  public void testSub() {
	    Calculadora calc = new Calculadora(10, 2);
	    assertEquals(8, calc.subtrair());

	  }
	
	@Test
	  public void testMult() {
	    Calculadora calc = new Calculadora(8, 10);
	    assertEquals(80, calc. multiplicar());

	  }
	
	@Test
	  public void testDiv() {
	    Calculadora calc = new Calculadora(10, 10);
	    assertEquals(1,0, calc.dividir());

	  }
  
  
  
}