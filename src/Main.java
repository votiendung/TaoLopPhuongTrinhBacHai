import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        double a = sc.nextDouble();
        System.out.println("nhap b");
        double b = sc.nextDouble();
        System.out.println("nhap c");
        double c = sc.nextDouble();


        PhuongTrinhBacHai qx = new PhuongTrinhBacHai(a, b, c);
        if (qx.getA() == 0) {
            if (qx.getB() == 0) {
                if (qx.getC() == 0) {
                    System.out.println("pt co vo so nghiem");
                } else {
                    System.out.println("pt vo nghiem");
                }
            } else {

                System.out.println("phuong trinh co mot nghiem: " + qx.getFirstDegreeEquation());
            }
        } else if (qx.getDiscriminant() < 0) {
            System.out.println("phuong trinh vo nghiem");
        } else if (qx.getDiscriminant() > 0) {
            System.out.println("phuong trinnh co hai nghiem:\n " +" x1 = "+ qx.getRoot1()+"\n x2 = " + qx.getRoot2());
        }else if (qx.getDiscriminant() ==0){
            System.out.println("phuong trinh co nghiem kep: " + qx.getDoubleSolution());
            }


    }
}
