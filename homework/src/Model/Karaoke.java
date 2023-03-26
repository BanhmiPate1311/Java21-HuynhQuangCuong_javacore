package Model;

import java.util.Scanner;

public class Karaoke {
    String startTimeString;
    String endTimeString;

    public void tinhTien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giờ bắt đầu (hh:mm): ");
        this.startTimeString = scanner.nextLine();
        System.out.print("Nhập giờ kết thúc (hh:mm): ");
        this.endTimeString = scanner.nextLine();

        String[] startTimeParts = startTimeString.split(":");
        String[] endTimeParts = endTimeString.split(":");

        int startHour = Integer.parseInt(startTimeParts[0]);
        int startMinute = Integer.parseInt(startTimeParts[1]);
        int endHour = Integer.parseInt(endTimeParts[0]);
        int endMinute = Integer.parseInt(endTimeParts[1]);

        if(startHour < 9){
            System.out.println("Về đi, chưa mở cửa");
            return;
        }

        int totalMinutes = (endHour * 60 + endMinute) - (startHour * 60 + startMinute);
        int first3HoursCost = 30000 * 3;
        int additionalHoursCost = (int) Math.round((30.0 / 100.0) * first3HoursCost);

        if (totalMinutes > 0 && totalMinutes <= 180) {
            System.out.println("Tổng chi phí phải trả: " + first3HoursCost / 60 + " VNĐ");
        } else if (totalMinutes > 180) {
            int additionalMinutes = totalMinutes - 180;
            int additionalHours = (int) Math.ceil(additionalMinutes / 60.0);
            int totalCost = first3HoursCost + (additionalHours * additionalHoursCost);

            if (startHour >= 9 && endHour <= 17) {
                totalCost = (int) Math.round(totalCost * 0.8);
            }

            int drinkCost = 10000;
            int numberOfDrinks = (int) Math.ceil(totalMinutes / 60.0);
            int totalDrinkCost = drinkCost * numberOfDrinks;

            totalCost += totalDrinkCost;

            System.out.println("Tổng chi phí phải trả: " + totalCost / 60 + " VNĐ");
        } else {
            System.out.println("Thời gian hát không hợp lệ!");
        }

        scanner.close();
    }
}
