<html>

<head>
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

    <script>
/*
import java.util.Scanner;

public class challange2no3 {
    public static void main(String[] args) {


        Scanner UserInput = new Scanner(System.in);

        System.out.print("selamat datang di program convert celcius ke kelvin apakah anda ingin melanjutkannya? 1 untuk ya dan 0 untuk tidak");
        int pembukaaan = UserInput.nextInt();
        if (pembukaaan == 1) {
          System.out.print("masukkan suhu yang mau diubah =");
            float suhu_celcius = UserInput.nextFloat();
          
          double hasil = suhu_celcius + 273.15
            System.out.println("hasil convert" + " " + hasil + "K");
        } else {
            System.out.println("yah sayang sekali, selamat tinggal :)");
        }
          
      }
}


*/

        function tambah() {
            var suhu1 = parseFloat (document.getElementById("suhu1").value) ;

            var hasil = suhu1 + 273.15 ;

            //console.log("Hasil Penjumlahan :" + hasil) ;
            document.getElementById("hasil").innerHTML = hasil;
        }
    </script>
</head>

<body>
    <div class="container">
        <div classs="form-group">
            <label for="bil1" >suhu1 :</label>
            <input type="number" class="form-control" id="suhu1" name="suhu1" placeholder="Silahkan Masukkan suhu1">
            <button class="btn btn-success" onclick="tambah()">TAMBAH</button>
            <h2>hasil convert suhu : <div id="hasil"></div></h2>
        </div>
    </div>
</body>
</html>
