/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.ndk.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.ndk.mathutil.core.MathUtility.getFactorial;

/**
 *
 * @author Khanh
 */
public class MathUtilityAdvancedTest {
    
    //tạo mảng 2 chiều chứa data sẽ dùng cho việc assertE()
    //gồm n đưa vào và expected trả về
    // int      long -> Object (wrapper class)
    //                          Integer Long
    public static Object[][] initTestData(){
        Object testData[][] = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {4, 24},
                                {5, 1200}};
        
        return testData;
    }
    
    //nhồi data vào hàm assertE()
    @ParameterizedTest
    @MethodSource("initTestData")                       //cột 0         cột 1
    public void testFactorialGivenRightArgumentReturnWell(int n, long expected){
        //assertEquals(69, 69);
        assertEquals(expected, getFactorial(n));
    }
}

//TDD:Test Driven Development là kĩ thuật lập trình mà nó được gắn với việc viết các test case để kiểm thử ngay những hàm 
// dev mình vừa viết 
// Viết code chính và viết code test (Junit, Unit Test) xen kẽ với nhau
// 2 MÀU XANH ĐỎ LINEE TỤC DIÊN RA



//DDT: Sự mở rộng thêm cho quá trình viết code test (Junit）
// Data Driven testing
// kĩ thuật tách bộ test data ra 1 chỗ riêng, tách vào mảng
// tách vào file Excel, hay table; sau đo nhồi/fill/map
// cài data từ mảng này vào trong hàm  so sánh assertEquals()
// Giúp code dễ đọc hơn, dex kiểm tra xem còn thiếu test case nào hay ko
