import java.util.Scanner;

public class Bai8 {
    String string;
    Scanner scanner = new Scanner(System.in);

    public Bai8() {
        System.out.println("Nhập vào 1 chuỗi: ");
        this.string = scanner.nextLine();
    }

    public void chuoiVietHoa(){
        String[] words = string.split("\\s");
        String ketQua = "";
        for (String w : words) {
            char firstChar = Character.toUpperCase(w.charAt(0));
            ketQua += firstChar + w.substring(1) + " ";
        }
        System.out.println("Chuỗi mới là: " + ketQua);
    }
}
