/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.tptest.Calculador;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Estudiante
 */

public class ParameterTest {
    private final Calculador calculador = new Calculador();
;
    public ParameterTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() );
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("Finalizo el test afterAll");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Comienza el test parametrizado");
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0 afterEach");
    }

     public static Stream<Object[]> tomarDatosSuma() {
        return Stream.of(
            new Object[] {8.3, 7.3, 15.6},
            new Object[] {2.1, 0.6, 2.7},
            new Object[] {10.88, -1, 9.88},
            new Object[] {-9.3, -1.5, -10.8}
        );
    }
     public static Stream<Object[]> tomarDatos() {
        return Stream.of(
            new Object[] {8, 0},
            new Object[] {15, 0},
            new Object[] {-2, 0}
        );
    }
     @ParameterizedTest
     @MethodSource("tomarDatosSuma")
     public void testSuma(double n1, double n2, double resultadoEsperado) {
        assertEquals(resultadoEsperado, calculador.sumar(n1, n2), 0.001);
      }
   @ParameterizedTest
    @MethodSource("tomarDatos") 
    public void testDivCero(int n1,int n2){
        assertThrows(ArithmeticException.class, () -> {
            calculador.dividir(n1,n2);
            });
    }
}
