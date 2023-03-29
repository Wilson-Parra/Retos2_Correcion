public class Reto3 {
    public static void main(String[] args) {
    String [][]teclado= {{"Esc ","F1 ","F2 ","F3 ","F4 ","F5 ","F6 ","F7 ","F8 ","F9 ","F10 ","F11 ","F12 ","Impr Pant ","Supr ","Power"},
 {"|°¬ ","1! ","2 ","3# ","4$ ","5% ","6& ","7/ ","8( ","9) ","0= ","''? ","¿¡ ","BORRAR ","",""},
 {"Tabulador ","Q@ ","W ","E ","R ","T ","Y ","U ","I ","O ","P ","¨ ","+*~ ","enter","",""},
{"Bloq","Mayus","A ","S ","D ","F ","G ","H ","J ","K ","L ","Ñ ","{[^ ","}] ","ENTER",""},
{"Shift ","<> ","Z ","X ","C ","V ","B ","N ","M ",",; ",".:","-_ ","SHIF","T","",""},
{"Ctrl ","Fn ","Windows ","Alt ","Es","p","a","c","io","AltGr ","Ctrl ","←","↑","→","",""}};
           
    for (int i=0;i<6;i++){
                for(int j=0;j<16;j++){
            System.out.print(teclado[i][j]);
          }
          System.out.println("   ");
    }
}
}