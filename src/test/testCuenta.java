package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class testCuenta {
	
	private static Cuenta cuenta;
	private static Cuenta cuenta1;
	private static Cuenta cuenta2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta(0.0);
		cuenta1 = new Cuenta(50.0);
		cuenta2 = new Cuenta(0.0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(0.0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(200.0);
		assertEquals(200.0, cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(200.0);
		assertEquals(-200, cuenta.getSaldo());
	}
	
	@Test
	void test0014() {
		cuenta1.retirar(200.0);
		assertEquals(-150, cuenta1.getSaldo());
		cuenta2.retirar(350.0);
		assertEquals(-350, cuenta2.getSaldo());
		cuenta1.ingresar(100.0);
		assertEquals(-50, cuenta1.getSaldo());
		cuenta2.retirar(200.0);
		assertEquals(-350, cuenta2.getSaldo());
		cuenta2.retirar(150.0);
		assertEquals(-500, cuenta2.getSaldo()); 
		cuenta1.retirar(200.0);
		assertEquals(-250, cuenta1.getSaldo());
		cuenta2.ingresar(50.0);
		assertEquals(-450, cuenta2.getSaldo()); 
		cuenta2.retirar(100.0);
		assertEquals(-450, cuenta2.getSaldo()); 
	}

}
