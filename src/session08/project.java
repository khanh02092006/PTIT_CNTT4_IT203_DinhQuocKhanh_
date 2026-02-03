package session08;

import java.util.Scanner;

public class project {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Student[] students = new Student[1000];
        int n = 0;

        int choice;
        do {
            printMenu();
            choice = readInt("Chon chuc nang: ", 1, 5);

            switch (choice) {
                case 1:
                    n = inputStudents(students, n);
                    break;
                case 2:
                    showStudents(students, n);
                    break;
                case 3:
                    searchByRank(students, n);
                    break;
                case 4:
                    sortByRankDesc(students, n);
                    System.out.println("Da sap xep giam dan theo hoc luc (va diem).");
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh.");
                    break;
            }
        } while (choice != 5);
    }

    static void printMenu() {
        System.out.println("\n===== QUAN LY DIEM SINH VIEN =====");
        System.out.println("1. Nhap danh sach sinh vien");
        System.out.println("2. Hien thi danh sach sinh vien");
        System.out.println("3. Tim kiem sinh vien theo Hoc luc");
        System.out.println("4. Sap xep theo hoc luc giam dan");
        System.out.println("5. Thoat");
        System.out.println("==================================");
    }


    static int inputStudents(Student[] students, int n) {
        int add = readInt("Nhap so luong sinh vien muon them: ", 1, students.length - n);

        for (int i = 0; i < add; i++) {
            System.out.println("\n--- Nhap sinh vien thu " + (i + 1) + " ---");

            String id;
            while (true) {
                id = readNonEmpty("Nhap ma SV (VD: SV001): ").toUpperCase();
                if (!isValidId(id)) {
                    System.out.println("Sai dinh dang! Ma phai bat dau bang SV va co 3 chu so (VD: SV001).");
                    continue;
                }
                if (isDuplicateId(students, n, id)) {
                    System.out.println("Ma SV da ton tai! Nhap ma khac.");
                    continue;
                }
                break;
            }

            String name = readNonEmpty("Nhap ho ten: ");
            double score = readDouble("Nhap diem trung binh (0-10): ", 0.0, 10.0);

            students[n] = new Student(id, name, score);
            n++;
        }
        System.out.println("Da them " + add + " sinh vien.");
        return n;
    }

    static boolean isValidId(String id) {
        if (id == null) return false;
        if (!id.startsWith("SV")) return false;
        if (id.length() != 5) return false; // SV + 3 so
        char c2 = id.charAt(2);
        char c3 = id.charAt(3);
        char c4 = id.charAt(4);
        return Character.isDigit(c2) && Character.isDigit(c3) && Character.isDigit(c4);
    }

    static boolean isDuplicateId(Student[] students, int n, String id) {
        for (int i = 0; i < n; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) return true;
        }
        return false;
    }


    static void showStudents(Student[] students, int n) {
        if (n == 0) {
            System.out.println("Danh sach rong.");
            return;
        }
        System.out.println("\n----- DANH SACH SINH VIEN -----");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }


    static void searchByRank(Student[] students, int n) {
        if (n == 0) {
            System.out.println("Danh sach rong.");
            return;
        }
        String key = readNonEmpty("Nhap hoc luc can tim (Gioi/Kha/Trung Binh/Yeu): ").trim();

        int count = 0;
        System.out.println("\n----- KET QUA TIM KIEM -----");
        for (int i = 0; i < n; i++) {
            String rank = students[i].getRank();
            if (rank.equalsIgnoreCase(key) || rank.toLowerCase().contains(key.toLowerCase())) {
                System.out.println((i + 1) + ". " + students[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay sinh vien co hoc luc: " + key);
        }
    }


    static void sortByRankDesc(Student[] students, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (compareStudents(students[i], students[j]) < 0) {
                    Student tmp = students[i];
                    students[i] = students[j];
                    students[j] = tmp;
                }
            }
        }
    }


    static int compareStudents(Student a, Student b) {
        int ra = rankValue(a.getRank());
        int rb = rankValue(b.getRank());

        if (ra != rb) return Integer.compare(ra, rb); // ra > rb => a manh hon
        // cung rank: diem cao hon dung truoc
        return Double.compare(a.getScore(), b.getScore());
    }

    static int rankValue(String rank) {
        // gia tri cao hon la tot hon
        if (rank.equalsIgnoreCase("Gioi")) return 4;
        if (rank.equalsIgnoreCase("Kha")) return 3;
        if (rank.equalsIgnoreCase("Trung Binh")) return 2;
        return 1; // Yeu
    }


    static int readInt(String msg, int min, int max) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            try {
                int x = Integer.parseInt(s);
                if (x < min || x > max) {
                    System.out.println("Vui long nhap so trong [" + min + " - " + max + "].");
                    continue;
                }
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so hop le!");
            }
        }
    }

    static double readDouble(String msg, double min, double max) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            try {
                double x = Double.parseDouble(s);
                if (x < min || x > max) {
                    System.out.println("Vui long nhap diem trong [" + min + " - " + max + "].");
                    continue;
                }
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so thuc hop le!");
            }
        }
    }

    static String readNonEmpty(String msg) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            if (s.isEmpty()) {
                System.out.println("Khong duoc de trong!");
                continue;
            }
            return s;
        }
    }
}
