import java.util.Scanner;

public class challange2 {
    public static void main(String[] args) {


        Scanner UserInput = new Scanner(System.in);

        System.out.print("masukkan jumlah keluarga");
        int jumlahkeluarga = UserInput.nextInt();
        if (jumlahkeluarga == 3) {

            System.out.print("masukkan masukkan nama ayah");
            String nama_ayah = UserInput.nextLine();

            System.out.print("masukkan masukkan nama ibu =");
            String nama_ibu = UserInput.nextLine();

            System.out.print("masukkan masukkan nama anak_ke1 =");
            String anak_ke1 = UserInput.nextLine();


            System.out.println(nama_ayah);
            System.out.print("------");
            System.out.println(nama_ibu);
            System.out.println(" "+" "+" "+" "+" "+"|");
            System.out.println(" "+" "+" "+" "+" "+"|");
            System.out.println(" "+" "+" "+" "+" "+anak_ke1);
        }

        if (jumlahkeluarga == 4) {
            System.out.print("masukkan masukkan nama ayah =");
            String nama_ayah = UserInput.nextLine();

            System.out.print("masukkan masukkan nama ibu =");
            String nama_ibu = UserInput.nextLine();

            System.out.print("masukkan masukkan nama anak_ke1 =");
            String anak_ke1 = UserInput.nextLine();

            System.out.print("masukkan masukkan nama anak_ke2 =");
            String anak_ke2 = UserInput.nextLine();


            System.out.println(nama_ayah + "-"+"-"+"-"+"-"+"-"+nama_ibu);
            System.out.println(" "+" "+" "+" "+" "+"|");
            System.out.println(" "+" "+" "+" "+" "+"|");
            System.out.println(" "+" "+" "+" "+" "+anak_ke1);
            System.out.println(" "+" "+" "+" "+" "+"|");
            System.out.println(" "+" "+" "+" "+" "+anak_ke2);
        }


    }
}
