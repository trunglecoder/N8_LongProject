/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package View;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Validation {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getValue(String msg) {
        System.out.print(msg);
        return scanner.nextLine().trim();
    }
    
     //Xem lại viết hàm đơn check giá trị-----------
     //Check Int:
     public static int checkInt (String s, String msg) {
         int num = 0;
         while (true) {
             try {
                 num = Integer.parseInt(getValue(s));
                 if (num <=0) {
                     System.out.println("Nhập số lớn hơn 0");
                 } else {
                     return num;
                 }
             } catch (Exception e) {
                 System.out.println(msg);
             }
         }
     }
     
    public static int checkIntAgain(String prompt, String errorMessage) {
        while (true) {
            String input = getValue(prompt); // Giả sử getValue là phương thức lấy giá trị từ người dùng
            if (input.isEmpty()) {
                return -1; // Trả về -1 nếu người dùng nhấn Enter
            }
            try {
                int num = Integer.parseInt(input);
                if (num <= 0) {
                    System.out.println("Nhập số lớn hơn 0");
                } else {
                    return num; // Trả về số hợp lệ
                }
            } catch (NumberFormatException e) {
                System.out.println(errorMessage); // Thông báo lỗi nếu không phải số nguyên
            }
        }
    }
    
     
     //Check String:
     public static String checkString (String inputmsg, String msg, String regex) {
         while (true) {
             try {    
                String s = getValue (inputmsg) ;
                if (s.matches(regex)) {
                    return s;
                } else {
                    System. out. println (msg) ;
                }
             } catch (Exception e) {
                 System.err.println(msg);
             }
         }
     }
     
     //Check double:
    public static Double checkDouble (String s, String msg) {
         Double num = 0.0;
         while (true) {
             try {
                 num = Double.parseDouble(getValue(s));
                 if (num <=0) {
                     System.out.println("Nhập số thực");
                 } else {
                     return num;
                 }
             } catch (Exception e) {
                 System.err.println(msg);
             }
         }
     }

    public static boolean continueConfirm(String msg) {
        String input = getValue(msg);
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    // Hiển thị tiền
    public static String showMoney(double money) {
        return String.format("$%.2f", money);
    }

    // Cắt khoảng trắng
    public static String trimName(String name) {
        return name == null ? null : name.trim();
    }

    // Viết hoa ký tự đầu tiên
    public static String upcaseFirst(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    //Viết hoa hết
    public static String uppercase(String input) {
        if (input == null) {
            return null; // Trả về null nếu đầu vào là null
        }
        return input.toUpperCase(); // Chuyển đổi chuỗi thành chữ hoa
    }
    
// Nhận và xác thực giá trị có hợp lệ theo điều kiện truyền vào hay không
//    public static String getAndValidValue(String msg, String condition, String cause, String para) {
//        String value;
//        while (true) {
//            value = getValue(msg);
//            if (value == null || value.isEmpty()) {
//                System.out.println(para + " is required");
//            } else if (Pattern.matches(condition, value)) { //Thư viện 
//                return value;
//            } else {
//                System.out.println(cause);
//            }
//        }
//    }
    
    //Viết đơn:
//     public static String getIntValue(String input, String msg, String condition) {
//        String value;
//        while (true) {
//            value = getValue(msg);
//            if (value == null || value.isEmpty()) {
//                System.out.println(input + " is required");
//            } else if (Pattern.matches(input, value)) { //Thư viện 
//                return value;
//            } else {
//                System.out.println(msg);
//            }
//        }
//    }
     
}
