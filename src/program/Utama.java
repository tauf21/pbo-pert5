package program;
import java.io.*;
public class Utama {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new
InputStreamReader(System.in));
Login user1 = new Login();
Login user2 = new Login("","");
while (true) {
//menu
System.out.println("===================================");
System.out.println("*********** MENU LOGIN ************");
System.out.println("===================================");
System.out.println("1. Login admin");System.out.println("2. Ubah password admin");
System.out.println("3. Buat User");
System.out.println("4. Lihat Data User");
System.out.println("5. Keluar");
System.out.println("===================================");
//input
System.out.print("Masukan Pilihan : ");
int pilih = Integer.parseInt(br.readLine());
System.out.println();
//proses output
switch(pilih){
case 1:
System.out.print("Masukan username : ");
String my_user = br.readLine();
System.out.print("Masukan password : ");
String my_password = br.readLine();
System.out.println();
if (my_user.equals(user1.getUsername()) &&
my_password.equals(user1.getPassword())) {
System.out.println("*** Login Sukses ***");
} else {
System.out.println("*** Login Gagal ***");
}
break;
case 2:
System.out.print("Masukan password lama : ");
String old_password =br.readLine();
System.out.print("Masukan paassword baru : ");
String new_password = br.readLine();
System.out.println();
if (old_password.equals(user1.getPassword())) {
user1.setPassword(new_password);
System.out.println("*** password berhasil dirubah***");
}
else{
System.out.println("*** anda salah memasukan password lama ***");
}
break;
case 3:
System.out.print("Masukan username : ");
String create_user = br.readLine();
System.out.print("Masukan password : ");
String create_password = br.readLine();
user2 = new Login(create_user,create_password);
System.out.println();
System.out.println("*** User telah berhasil dibuat");
break;
case 4:
System.out.println("===================================");
System.out.println("Username\t"+"Password");
System.out.println("===================================");System.out.println(user1.getUsername()+" "+user1.getPassword());
System.out.println(user2.getUsername()+" "+user2.getPassword());
break;
default:
System.exit(0);
}
}
}
}