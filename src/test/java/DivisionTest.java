/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.tptest.Calculador;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Estudiante
 */
public class DivisionTest {
    private static Calculador calculadora;
    public DivisionTest() {
      
    }
    
    @BeforeAll
    public static void setUpClass() {
          calculadora=new Calculador();
    }
    
   
    @BeforeEach
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() );
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("Finalizo el test de division");
    }
    @AfterAll
    public static void fin(){
        System.out.println("“La operación ha finalizado”.");
    }
     @Test
    public void testDivision(){
        assertThrows(ArithmeticException.class, () ->{
            calculadora.dividir(14,0);
        });
    }

}
