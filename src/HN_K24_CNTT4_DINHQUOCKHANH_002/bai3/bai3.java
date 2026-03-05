package HN_K24_CNTT4_DINHQUOCKHANH_002.bai3;

import java.util.Scanner;
import java.util.Stack;

public class bai3 {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        if (s.trim().isEmpty()){
            System.out.println("lỗi :chuỗi khônd được để trống ");
            return;
        }
        Stack<Character> stack = new Stack<>();
        for( char c :s.toCharArray()){
            if(c == '(' || c == '[' || c=='{'){
                stack.push(c);
            }
            else if (c== ')' || c == ']' || c=='}'){
                if(stack.isEmpty()){
                    System.out.println(" không hợp lệ");
                    return;
                }
                char top =stack.pop();
                if((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')

                ){
                    System.out.println(" không hợp lệ ");
                    return;
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("hợp lệ ");
        }else {
            System.out.println(" không hợp lệ ");
        }
    }
}
