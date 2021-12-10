package view;
import model.Contact;

import java.util.Scanner;
import java.util.regex.Pattern;
public class ViewContact {
    Scanner scanner = new Scanner(System.in);

    public int menuManagerContact() {
        System.out.println("            MENU  ");
        System.out.println(" 1. Hiển thị Contact List");
        System.out.println(" 2. Thêm Contact");
        System.out.println(" 3. Sửa Contact");
        System.out.println(" 4. Xóa Contact");
        System.out.println(" 5. Tìm kiếm theo tên");
        System.out.println(" 6. Đọc file");
        System.out.println(" 7. Ghi file");
        System.out.println(" 8. Thoát");
        return checkId();
    }

    public Contact menuAddList() {
        System.out.println("Nhập tên");
        String name = checkName();
        System.out.println("Số điện thoại");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập đại chỉ");
        String address = checkName();
        System.out.println("Nhập email");
        String mail = checkName();
        System.out.println("Nhập Facebook");
        String facebook = checkName();
        return new Contact(name, phoneNumber, address, mail, facebook);

    }

    public String editByName() {
        System.out.println("Nhập tên cần sửa");
        String name = checkName();
        return name;
    }

    public String menudeleteByName() {
        System.out.println("Nhập tên cần xóa");
        String name = checkName();
        return name;
    }

    public String menusearchByName() {
        System.out.println("Nhập tên cần tim");
        return scanner.nextLine();
    }


    public Contact menuEditContact(String name) {
        System.out.println(" Nhập lại số điện thoại");
        String phoneNumber = checkName();
        System.out.println(" Nhập lại đại chỉ");
        String address = checkName();
        System.out.println(" Nhập lại Email");
        String mail = checkName();
        System.out.println(" Nhập lại Facebook ");
        String facebook = checkName();
        return new Contact(name, phoneNumber, address, mail, facebook);

    }

    private int checkId() {
        Scanner scanner = new Scanner(System.in);
        boolean checkId;
        int id = 0;
        do {
            checkId = true;
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                checkId = false;
                System.err.println(" MỜI NHẬP SỐ ");
            }
        } while (!checkId);
        return id;
    }

    private int checkLuaChon() {
        Scanner scanner = new Scanner(System.in);
        boolean checklogin;
        int id = 0;
        do {
            checklogin = true;
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                checklogin = false;
                System.err.println(" MỜI CHỌN LẠI :");
            }
        } while (!checklogin);
        return id;
    }

    public String checkName() {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (true) {

            name = scanner.nextLine();
            Pattern p = Pattern.compile("^\\pL+[\\pL\\pZ\\pP ]{0,}$");
            if (p.matcher(name).find()) {
                break;
            } else {
                System.err.println(" KHÔNG ĐƯỢC NHẬP SỐ ");
            }
        }
        return name;
    }
}
