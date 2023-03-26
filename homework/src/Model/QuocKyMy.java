package Model;

public class QuocKyMy {
    public void inQuocKy(){
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 20; j++) {
                if (i < 9 && j < 6) {
                    if(i%2==0){
                        System.out.print("* ");
                    } else if (j==5){
                        System.out.print("  ");
                    } else{
                        System.out.print(" *");
                    }
                } else {
                    System.out.print("==");
                }
            }
            System.out.println("");
        }
    }
}
