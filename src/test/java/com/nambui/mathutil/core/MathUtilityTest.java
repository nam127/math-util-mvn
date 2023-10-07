package com.nambui.mathutil.core;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author buith
 */
public class MathUtilityTest {
    //Cấu trúc TC: ID | Desc | Steps/Procedures | Expected Result | Status
    //Test case #1 - Verify getFactorial(with n = 0)
    //Steps:
    //      1. Given n = 0
    //      2. Call/invoke getFactoriall(n=0)
    //Expected Result:
    //                  the method must return 1 as the resut of 0!
    //Status: PASSED | FAILED đoán xem, chờ code
    @Test
    public void verifyFactorialGivenRightArgumentReturnOk(){
        assertEquals(1,MathUtility.getFactorial(0));
    }
    
    //Test case #2...
    @Test
    public void verifyFactorialGivenRightArgument1ReturnOk(){
        assertEquals(1,MathUtility.getFactorial(1));
    }
    
    //Test case #3...
    @Test
    public void verifyFactorialGivenRightArgument5ReturnOk(){
        assertEquals(120,MathUtility.getFactorial(5));
    }
}
