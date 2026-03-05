import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập chuỗi kí tự: ");
        
       
        if (!sc.hasNextLine()) {
            return;
        }
        String input = sc.nextLine();
        
      
        String processed = input.toLowerCase().replace(" ", "");

        if (processed.equals("")) {
            System.out.println("Lỗi: Chuỗi không hợp lệ");
        } else {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < processed.length(); i++) {
                char c = processed.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

           
            List<Character> keys = new ArrayList<>(map.keySet());
            for (int i = 0; i < keys.size() - 1; i++) {
                for (int j = 0; j < keys.size() - 1 - i; j++) {
                    if (keys.get(j) > keys.get(j + 1)) {
                        char temp = keys.get(j);
                        keys.set(j, keys.get(j + 1));
                        keys.set(j + 1, temp);
                    }
                }
            }

           
            int max = 0;
            for (int freq : map.values()) {
                if (freq > max) {
                    max = freq;
                }
            }

           
            for (char c : keys) {
                System.out.println(c + " xuất hiện: " + map.get(c) + " lần");
            }

            System.out.print("Ký tự xuất hiện nhiều nhất: ");
            List<String> maxChars = new ArrayList<>();
            for (char c : keys) {
                if (map.get(c) == max) {
                    maxChars.add(c + " (" + max + " lần)");
                }
            }
            System.out.println(String.join(", ", maxChars));
        }
    }
}