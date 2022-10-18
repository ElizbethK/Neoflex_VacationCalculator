package ru.kurochkina.neoflex.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void fifteenUsdAndTenDaysResult(){
        assertEquals(17.1, new Calculator(50,10).getResult());
    }

    @Test
    void nineHundredUsdAndTenDaysResult(){
        assertEquals(337.9, new Calculator(900,11).getResult());
    }

    @Test
    void zeroUsdAndTwentyDays(){
        assertEquals(0.0, new Calculator(0,20).getResult());
    }

    @Test
    void oneHundredUsdAndZeroDays(){
        assertEquals(0,new Calculator(100,00).getResult());
    }

    @Test
    void negativeSalaryValue(){
        assertEquals(0,new Calculator(-20,10).getResult());
    }

    @Test
    void negativeDaysValue(){
        assertEquals(0,new Calculator(20,-10).getResult());
    }
}