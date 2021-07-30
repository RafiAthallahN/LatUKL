/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
*
* @author abi_sofyana
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class abicell {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
//input scanner
Scanner input=new Scanner(System.in);
BufferedReader input2=new BufferedReader (new InputStreamReader (System.in));

//inisialisasi variabel
int i =0;
String [] hp = new String [100];
String [] perdana = new String [100];
int [] harga = new int[100];
int [] harga2 = new int[100];
String keputusan = "Y";
int jumlah =0;
int hargatotal=0;

//buat tampilan awal
System.out.println("*******************************************");
System.out.println("Abi Cell");
System.out.println("Welcome & Happy Shopping");
System.out.println("*******************************************");
System.out.println("Ready segala merk HP dan perdana segala operator");
System.out.println("Pilihan merk HP :");
System.out.println("1. Samsung = Rp. 2.500.000,-");
System.out.println("2. Sony Ericson = Rp. 2.000.000,-");
System.out.println("3. OPPO = Rp. 2.300.000,-");
System.out.println("Pilihan Perdana :");
System.out.println("1. Perdana Telkomsel = Rp. 25.000,-");
System.out.println("2. Perdana Indosat = Rp. 23.000,-");
System.out.println("3. Perdana XL = Rp. 23.500,-");
System.out.println("");
System.out.println("*******************************************");
System.out.println("");

//pengkondisian
while (keputusan.equals("Y")||keputusan.equals("y"))
{
System.out.print("Silahkan pilih merk hp yang anda inginkan : ");
int pil = input.nextInt();
switch (pil) {
case 1:
hp [i] = "Samsung";
harga [i] = 2500000;
break;
case 2:
hp [i] = "Sony Ericson";
harga [i] = 2000000;
break;
case 3:
hp [i] = "OPPO";
harga [i] = 2300000;
break;
case 4:
default:
System.out.println("HP yang anda inginkan sedang out of stock.");
break;
}
for (int k=pil;k<4;k++){
System.out.println("Merk HP yang anda pilih adalah : "+hp[i]);
System.out.print("Jumlah pesanan : ");
int jmlhp = input.nextInt();
harga[i]=harga[i]*jmlhp;
System.out.println("Harga HP sebesar : Rp. "+harga[i]+ " ;");
break;
}
System.out.println("");
System.out.print("Silahkan pilih perdana yang anda inginkan : ");
int pil2=input.nextInt();
switch (pil2){
case 1:
perdana [i] = "Perdana Telkomsel";
harga2 [i] = 25000;
break;
case 2:
perdana [i] = "Perdana Indosat";
harga2 [i] = 23000;
break;
case 3:
perdana [i] = "Perdana XL";
harga2 [i] = 23500;
break;
case 4:
default:
System.out.println("Perdana yang anda inginkan sedang out of stock.");
break;
}
for (int j=pil2;j<4;j++){
System.out.println("Perdana yang anda pilih adalah : "+perdana[i]);
System.out.print("Jumlah pesanan : ");
int jmlperdana = input.nextInt();
harga2[i]=harga2[i]*jmlperdana;
System.out.println("Harga Perdana sebesar : Rp. "+harga2[i]+ " ;");
break;
}
System.out.println("");
int totalhp = 0;
int totalperdana = 0;
int total=harga[i]+harga2[i];
System.out.println("Total belanja anda sebesar : Rp. "+total+ " ;");

System.out.println("Apakah anda ingin order lagi ? Y/N : ");
try{
keputusan = input2.readLine();
}catch(IOException e){
System.out.println("Failed to Read Keyboard");
}
i++;
System.out.println("List Pesanan anda adalah : ");

for (int a = 0; a<i;a++){
System.out.println(hp[a]);
}
for (int b = 0; b<i;b++){
System.out.println(perdana[b]);
}

System.out.println("");

for (int c = 0; c5000000){

System.out.println("Diskon : Rp."+diskon);
}
int totalbayar=hargatotal-diskon;
System.out.println("Total pembayaran sebesar : Rp."+totalbayar);

}

}
}
