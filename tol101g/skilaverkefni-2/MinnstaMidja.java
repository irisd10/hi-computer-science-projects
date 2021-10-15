/******************************************************************************
 *  Nafn    : Íris Dögg Jónsdóttir
 *  T-póstur: idj8@hi.is
 *
 *  Lýsing  : Skrifar út hvort midjustakid sé minnst af þremur.
 *
 *
 *****************************************************************************/
public class MinnstaMidja {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean minnst;

        minnst = (b < c);
        minnst = minnst && (b < a);

        System.out.printf("miðjustakið af %d,%d,%d er minnst:%b", a, b, c, minnst);
    }
}
