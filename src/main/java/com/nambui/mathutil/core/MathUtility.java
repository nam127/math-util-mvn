/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nambui.mathutil.core;

/**
 *
 * @author buith
 */
//Đây là bộ thư viện chứa các hàm dùng trong tính toán
//toán học, clone giống class Math bên JDK
//Khi gọi là thư viện dùng chung mà ko cần nhớ nhung gì sau khi xử lí -> thư viện chứa đồ STATIC
public class MathUtility {
    
    public static final double PI = 3.1415;
    //hàm tính n! = 1.2.3...n
    //n < 0 n > 20 ko tính do 21! tràn kiểu long
    // ko tính giai thừa âm
    //0! = 1! = 1
//    public static long getFactorial(int n){
//        long result = 10;
//        
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20.");
//        
//        if(n == 0 || n == 1) 
//            return 1;
//        
//        for (int i = 2; i <= n; i++) 
//            result *= i;
//        
//        return result;
//    }

    //NÂNG CẤP HÀM TÍNH GIAI THỪA, DÙNG THUẬT TOÁN ĐỆ QUY
    //n!= 1.2.3...n
    //5!= 1.2.3.4.5
    //5!= 4! x 5
    //n! = n x (n-1)!
    //đệ quy - recursion GỌI LẠI CHÍNH MÌNH VỚI 1 QUY MÔ NHỎ HƠN
    public static long getFactorial(int n){
        
          if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20.");
        
        if(n == 0 || n == 1) 
            return 1;
        
        return n * getFactorial(n - 1); //n! = n * (n-1)!
    }
    //CHẢNH CỜ-HÓ, KO THÈM XEM XANH ĐỎ Ở LOCAL
    //ĐỂ GITHUB ACTIONS LÀM GIÙM XANH ĐỎ
    //THỰC TẾ LÀM DỰ ÁN: ANH EM FIXBUG
    //                   ANH EM TỐI ƯU HÀM CHO CHẠY NHANH HƠN
    //                   VIỆC TỐI ƯU NÀY ĐÚNG HAY SAI VỀ CHẤT LƯỢNG CODE
    //                   LEADER CHỈ CẦN NHÌN MÀU XANH LÀ ĐỦ
    //NẾU LÀM TỐT THÌ PHẢI RA MÀU XANH, KO CARE CHI TIẾT
    //KĨ THUẬT ĐÃ XANH, TEST LẠI ĐỂ VẪN XANH, MÀ KO CẦN NHÌN CHI TIẾT CODE
    //NGƯỜI TA GỌI LÀ : REGRESSION TEST - KIỂM THỬ HỒI QUY
}
