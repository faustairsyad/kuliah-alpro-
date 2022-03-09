import java.util.Scanner;

public class challange2 {
    public static void main(String[] args) {


        Scanner UserInput = new Scanner(System.in);

        System.out.print("selamat datang di program convert celcius ke kelvin apakah anda ingin melanjutkannya? 1 untuk ya dan 0 untuk tidak");
        int pembukaaan = UserInput.nextInt();
        if (pembukaaan == 1) {
          System.out.print("masukkan suhu yang mau diubah =");
            float suhu_celcius = UserInput.nextFloat();
          
          double hasil = suhu_celcius - 273,15
            System.out.println("hasil convert" + " " + hasil + "K");
        } else {
            System.out.println("yah sayang sekali, selamat tinggal :)");
        }
          
      }
}


          
