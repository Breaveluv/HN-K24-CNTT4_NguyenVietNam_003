import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Số lượng phần tử không hợp lệ");
        } else {
            
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            // 1. Tìm số lớn nhất 
            int max = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > max) {
                    max = list.get(i);
                }
            }

            // 2. Thuật toán sắp xếp tăng dần 
         
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = 0; j < list.size() - 1 - i; j++) {
                    if (list.get(j) > list.get(j + 1)) {
                        int temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }

            // 3. Tính giá trị trung bình (Kiểu double)
            double sum = 0;
            for (int num : list) {
                sum += num;
            }
            double average = sum / list.size();

            // 4. Đếm số lượng chẵn và lẻ
            int even = 0;
            for (int num : list) {
                if (num % 2 == 0) {
                    even++;
                }
            }

            
            int odd = list.size() - even;

            
            System.out.println("Số lớn nhất trong danh sách: " + max);
            
            System.out.print("Danh sách theo thứ tự tăng dần: ");
            for (int num : list) {
                System.out.print(num + " ");
            }
            
            System.out.println("\nAverage: " + average);
            System.out.println("Even: " + even);
            System.out.println("Odd: " + odd);
        }
    }
}