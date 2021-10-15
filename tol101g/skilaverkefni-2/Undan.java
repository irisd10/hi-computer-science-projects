/******************************************************************************
 *  Nafn    : Íris Dögg Jónsdóttir
 *  T-póstur: idj8@hi.is
 *
 *  Lýsing  : Reiknar út hvort fyrri dagsetning sé á undan þeirri seinni.
 *  Notast við skammstöfun fyrir dag (d), mánud (m) og ár (ar).
 *
 *
 *****************************************************************************/
public class Undan {
    public static void main(String[] args) {
        int d1 = Integer.parseInt(args[0]);
        int m1 = Integer.parseInt(args[1]);
        int ar1 = Integer.parseInt(args[2]);
        int d2 = Integer.parseInt(args[3]);
        int m2 = Integer.parseInt(args[4]);
        int ar2 = Integer.parseInt(args[5]);

        boolean undan;
        undan = (ar1 < ar2 || (ar1 == ar2 && m1 < m2) || (ar1 == ar2 && m1 == m2 && d1 < d2));


        System.out.print("Fyrri dagsetningin er á undan seinni: ");
        System.out.print(undan);


    }

}
