/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fpoly.asm1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ASM1 {

   // Ham menu
    public static void Menu() {
        System.out.println("\n========== MENU QUẢN LÝ NHÂN SỰ TIỀN LƯƠNG ==========");
        System.out.println("1. Nhập danh sách nhân viên từ bàn phím");
        System.out.println("2. Xuất danh sách nhân viên ra màn hình");
        System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím");
        System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím");
        System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
        System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím");
        System.out.println("7. Sắp xếp nhân viên theo họ và tên");
        System.out.println("8. Sắp xếp nhân viên theo thu nhập");
        System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
        System.out.println("0. Thoát chương trình");
        System.out.println("=====================================================");
    }
    public static void xulymenu(int chon){
        switch(chon){
            case 1:
                System.out.println("Nhập danh sách nhân viên từ bàn phím");
                break;
            case 2:
                System.out.println("Xuất danh sách nhân viên ra màn hình");
                break;
            case 3:
                System.out.println("Tìm và hiển thị nhân viên theo mã nhập từ bàn phím");
                break;
            case 4:
                System.out.println("Xóa nhân viên theo mã nhập từ bàn phím");
                break;
            case 5:
                System.out.println("Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
                break;
            case 6:
                System.out.println("Tìm các nhân viên theo khoảng lương nhập từ bàn phím");
                break;
            case 7:
                System.out.println("Sắp xếp nhân viên theo họ và tên");
                break;
            case 8:
                System.out.println("Sắp xếp nhân viên theo thu nhập");
                break;
            case 9:
                System.out.println("Xuất 5 nhân viên có thu nhập cao nhất");
                break;
            case 0:
                System.out.println("Thoát chương trình. Hẹn gặp lại!");
                break;
            default:
                System.out.println("️ Lựa chọn không hợp lệ! Vui lòng chọn lại.");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int chon;

        do {
            Menu();
            System.out.print("? Mời bạn chọn chức năng: ");

            while (!sc.hasNextInt()) {
                System.out.print(" Lựa chọn không hợp lệ. Vui lòng nhập lại: ");
                sc.next(); // bỏ qua giá trị sai
            }

            chon = sc.nextInt();
            xulymenu(chon);

        } while (chon != 0);

        sc.close();
    }
}
