package mmayorEdad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonaTest {



		@Test 
		public void test3() {
			Persona p = new Persona(0);
			assertFalse(p.isMayorDeEdad());
		}
		
		@Test public void test4() {
			Persona p = new Persona(17);
			assertFalse(p.isMayorDeEdad());
		}
		@Test public void test5() {
			Persona p = new Persona(18);
			assertTrue(p.isMayorDeEdad());
		}
		
		@Test public void Test6() {
			Persona p = new Persona(100);
			assertTrue(p.isMayorDeEdad());
		}
		@Test()
		public void Test1() {
			Assertions.assertThrows(AssertionError.class, ()-> {
			Persona p = new Persona(-1);
			p.isMayorDeEdad();
		 
		});

}
	@Test()
	public void Test2() {
		Assertions.assertThrows(AssertionError.class, ()-> {
			Persona p= new Persona(-100);
			p.isMayorDeEdad();
		});
		
		
		
	}
}
