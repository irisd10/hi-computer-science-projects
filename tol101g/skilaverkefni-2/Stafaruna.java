/******************************************************************************
 *  Nafn    : Íris Dögg Jónsdóttir
 *  T-póstur: idj8@hi.is
 *
 *  Lýsing  : Skrifar stafalínu með ASCII kódanum.
 *
 *
 *****************************************************************************/

public class Stafaruna {
    public static void main(String[] args) {
        int aTala = Integer.parseInt(args[0]);
        int bil = Integer.parseInt(args[1]);
        char a = (char) aTala;
        char b = (char) (aTala + bil);
        char c = (char) (aTala + 2 * bil);

        System.out.print(a);
        System.out.print(b);
        System.out.print(a);
        System.out.print(c);
        System.out.print(a);
        System.out.print(b);
        System.out.print(a);


    }
}
