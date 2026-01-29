package session05;
import java.util.Scanner;

public class miniproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[100];
        int n = 0;
        int chon;

        do {
            System.out.println("\n1.Hien thi  2.Them  3.Sua  4.Xoa  5.Tim  6.Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();


            switch (chon) {
                case 1:
                    if (n == 0) {
                        System.out.println("danh sach rong");
                    } else {
                        for (int i = 0; i < n; i++) {
                            System.out.println((i + 1) + ". " + arr[i]);
                        }
                    }
                    break;

                case 2:
                    if (n == 100) {
                        System.out.println("mang day");
                        break;
                    }
                    String msv;
                    do {
                        System.out.print("Nhap MSSV (B + 7 so): ");
                        msv = sc.nextLine().trim().toUpperCase();
                        if (!msv.matches("^B\\d{7}$"))
                            System.out.println("Sai dinh dang!");
                    } while (!msv.matches("^B\\d{7}$"));

                    arr[n++] = msv;
                    System.out.println("Da them");
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("danh sach rong");
                        break;
                    }
                    System.out.print("Nhap index can sua : ");
                    int idx = sc.nextInt();
                    sc.nextLine();

                    if (idx < 0 || idx >= n) {
                        System.out.printf("nhập sai index");
                        break;
                    }

                    do {
                        System.out.print("Nhap MSSV moi: ");
                        msv = sc.nextLine().trim().toUpperCase();
                        if (!msv.matches("^B\\d{7}$"))
                            System.out.println("Sai dinh dang!");
                    } while (!msv.matches("^B\\d{7}$"));

                    arr[idx] = msv;
                    System.out.println("Da cap nhat");
                    break;

                case 4:
                    if (n == 0) {
                        System.out.println("danh sach rong");
                        break;
                    }
                    System.out.print("Nhap MSSV can xoa: ");
                    String del = sc.nextLine().trim().toUpperCase();

                    int pos = -1;
                    for (int i = 0; i < n; i++) {
                        if (arr[i].equalsIgnoreCase(del)) {
                            pos = i;
                            break;
                        }
                    }

                    if (pos == -1) {
                        System.out.println("khong tim thay");
                    } else {
                        for (int i = pos; i < n - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        arr[--n] = null;
                        System.out.println("Da xoa");
                    }
                    break;

                case 5:
                    break;
                case 6:
                    System.out.println("thoat");
                    break;

                default:
                    System.out.println("chon 1-6");
            }

        } while (chon != 6);


    }
}
