import java.util.Scanner;

public class Main {
    /*       ****Ödev****
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
    PI sayısını = 3.14 alınız.
    Formül : (PI * (r*r) * a) / 360         */

    public static void main(String[] args) {
        double r,a,alan,PI=3.14;


        Scanner sc=new Scanner(System.in);

        System.out.print("Daire diliminin yaricapini giriniz: ");
        r=sc.nextDouble();

        System.out.print("Daire diliminin Acisini giriniz: ");
        a=sc.nextDouble();

        alan=(PI * (r*r) * a) / 360;

        System.out.println("Daire Diliminin Alani"+alan);



    }
}
