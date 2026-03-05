import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        System.out.print("Moi ban nhap chuỗi kí tự: ");
        String s = sc.nextLine();
        s.trim();
        s = s.toLowerCase();
        System.out.println(s);

    if(s.equals("")){
        System.out.println("Chuỗi không hợp lệ");
    }else {
        // Sử dụng Map + Thuật toán
        // Sử dụng Map <Character, Integer> để lưu:
        // Key: kí tự
        // Value: Số lần xuất hiện
        // Không phân biệt chữ viết hoa, viết thường
        //Bỏ qua khoảng trắng
        // Phải tự viết thuật toán: Tìm kí tự xuất hiện nhiều nhất, Sắp xếp các kí tự theo thứ tự apphabet(A->Z)
       //

        String a = s.toLowerCase();

        System.out.println(a);
        for(int i =0; i<s.length(); i++){
            for(int j =0;j<a.length();j++){
                System.out.print(a.charAt(j));
            }
        }



    }


    }

}
