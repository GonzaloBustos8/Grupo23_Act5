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
public class testCalculador {
   static Calculador calculadora;
    public testCalculador() {
    }
      @BeforeEach
    public void setUp() {
        
         System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() );
    }
    
    @BeforeAll
    public static void bienvenido(){
      calculadora = new Calculador();
         System.out.println("Bienvenido a los test");
      
    }
  
    
    @AfterEach
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }
    @AfterAll
    public static void fin(){
        System.out.println("“La operación ha finalizado”.");
    }

     @Test
    public  void testSuma() {
        double numeros=calculadora.sumar(1.8,1.5);
        assertEquals(3.3,numeros,0.001);
    }
    
    @Test
    public void testResta() {
        double numeros=calculadora.restar(7.3,5.2);
        assertEquals(2.1,numeros,0.01);
    }
}
