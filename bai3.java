import java.util.Scanner;
import java.util.Stack;

public class bai3 {
    public static void main( String[] argv){
        // Viết Chương trình kiểm tra dấu ngoặc hợp lệ trong 1 chuỗi chỉ gồm các kí tự(){}[]
        // Chuỗi hợp lệ nếu các dấu đóng mở đúng cặp và đúng thứ tự
        // Phải sử dụng Stack
        // Không dùng regex hoặc các hàm xử lí chuỗi có sẵn để kiểm tra cặp ngoặc
        // In ra định dạng true/false
        Scanner input = new Scanner( System.in);
        Stack<Character> stack = new Stack<>();
        String str;
        System.out.print("Enter a character:");
        str = input.nextLine();
        stack.push(str.charAt(0));











    }
}
