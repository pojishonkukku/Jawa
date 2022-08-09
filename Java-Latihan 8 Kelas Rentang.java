public class Lt9_kelasrentang{
   int[]buatrentang(int bawah, int atas){ //larik dari variabel buatrentang
   int rentang[]=new int[(atas-bawah)+1];
  for (int i=0; i<rentang.length; i++){ // perulangan
       rentang[i]=bawah++;
  }
 return rentang;
}

public static void main(String rentang[]){
   int inilarik[];
   Lt9_kelasrentang inirentang=new Lt9_kelasrentang();
   inilarik=inirentang.buatrentang(5,20); // larik dari 5 ke 20
   System.out.print("Lariknya adalah : [ ");
   for (int i=0; i<inilarik.length; i++){ //perulangan
   System.out.print(inilarik[i]+" ");
   }
   System.out.println("]");
  }
}
