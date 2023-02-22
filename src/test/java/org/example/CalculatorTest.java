package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class CalculatorTest
{
    private final Calculator calc = new Calculator();
    @Test
    void shouldAddTwoNumbers(){
        assertEquals(4, calc.add(2,2));
        assertEquals(5, calc.add(2,3));
        assertEquals(18, calc.add(9,9));
    }
    @Test
    void shouldReturnGradeLetters(){
        assertEquals("F", calc.getGradeLetter(0));
        assertEquals("F", calc.getGradeLetter(10));
        assertEquals("D", calc.getGradeLetter(60));
        assertEquals("D", calc.getGradeLetter(61));
        assertEquals("D+", calc.getGradeLetter(65));
        assertEquals("D+", calc.getGradeLetter(66));
        assertEquals("C", calc.getGradeLetter(70));
        assertEquals("C", calc.getGradeLetter(71));
        assertEquals("C+", calc.getGradeLetter(75));
        assertEquals("C+", calc.getGradeLetter(76));
        assertEquals("B", calc.getGradeLetter(80));
        assertEquals("B", calc.getGradeLetter(84));
        assertEquals("B+", calc.getGradeLetter(85));
        assertEquals("B+", calc.getGradeLetter(88));
        assertEquals("A", calc.getGradeLetter(90));
        assertEquals("A", calc.getGradeLetter(92));
        assertEquals("A+", calc.getGradeLetter(97));
    }

    @Test
    void shouldTestWrongGradeValues(){
        assertThrows(IllegalArgumentException.class, () -> {
            calc.getGradeLetter(-10);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calc.getGradeLetter(101);
        });
    }
}
