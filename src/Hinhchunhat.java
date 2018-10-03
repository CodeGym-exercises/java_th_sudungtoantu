import java.util.Scanner;

public class Hinhchunhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width, height, area;
        System.out.print("Nhap chieu dai: ");
        width = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        height = sc.nextDouble();
        area = width*height;
        System.out.println("Dien tich hinh chu nhat: " + area);
    }
}
