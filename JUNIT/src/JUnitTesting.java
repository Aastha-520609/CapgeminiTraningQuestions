import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JUnitTesting {
	String message = "Aastha";
	@Test
	public void unitMethod() {
		System.out.println("Inside unit method");
	    assertEquals(message, "Aastha1");
	}
	public static void main(String args[]) {
		JUnitTesting result = new JUnitTesting();
		result.unitMethod();
	}

}
