/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nambui.mathutil.main;

import com.nambui.mathutil.core.MathUtility;

/**
 *
 * @author buith
 */
public class Main {
    public static void main(String[] args) {
        //test thử hàm mình vừa viết tính giai thừa có đúng ko
        //chuẩn bị bộ data test, test case
        //Test case #1: Check if getFactorial() runs
        //                                  well with n = 0
        //Test Procedures:
        //                  Given n = 0
        //                  Invoke getFactorial(n = 0)
        //Expected Result: 1;  //0! ==1 ????
        long expected = 1;  //em hy vọng 1 dc trả về
        int n = 0;          //nếu anh đưa vào 0!
        long actual = MathUtility.getFactorial(n);    //chạy hàm mới biết
        
        //in ra và tự kết luận có giống kì vọng hay ko
        System.out.println(n + "! | expected = " + expected + 
                                " | actual = " + actual);
        
        //Test case #2: Check if getFactorial() runs
        //                                  well with n = 1
        //Test Procedures:
        //                  Given n = 0
        //                  Invoke getFactorial(n = 0)
        //Expected Result: 1;  //1! ==1 ????
        System.out.println("1! | expected = 1" + 
                                " | actual = " + MathUtility.getFactorial(1));
    }
}
