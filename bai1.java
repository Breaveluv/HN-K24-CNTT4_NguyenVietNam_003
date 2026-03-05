import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.print(" Số lượng phần tử không hợp lệ ");
        }else{
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());



            }
            int max = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max) {
                    max = list.get(i);
                }
            }

            // Tính giá trị trung bình (double)
            double Average = 0;
            for (int i = 0; i < list.size(); i++) {
                Average = Average + list.get(i);



            }
            Average = Average / list.size();
            // Hiển thị danh sách theo thứ tự tăng dần
            int []arr = new int[list.size()];
            for (int i = 0; i< list.size(); i++){
                arr[i]=list.get(i);

            }





            // Đếm số lượng chẵn lẻ
            int Even = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0) {
                    Even++;
                }
            }
            int Odd = 0;
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i) %2 != 0){
                    Odd++;
                }
            }

            System.out.println("Số lớn nhất trong danh sách:  "+ max );
            System.out.println("Average: "+ Average );
            System.out.println("Even: " + Even);
            System.out.println("Odd: "+ Odd);
        }



    }
}
