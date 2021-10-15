/******************************************************************************
 *  Nafn    : Íris Dögg Jónsdóttir
 *  T-póstur: idj8@hi.is
 *
 *  Lýsing  : Reikna út vaxtagreidslur.
 *  Notast við formúluna 𝑃 ∙ ((1+𝑖)𝑛−1) sem skilar vaxtargreidslunni
 *
 *
 *****************************************************************************/
public class Vaxtavextir {
    public static void main(String[] args) {

        double hofudstoll = Double.parseDouble(args[0]);
        double nafnvextir = Double.parseDouble(args[1]);
        int arafjoldi = Integer.parseInt(args[2]);

        double i = nafnvextir / 100;

        double vaxtagreidslur = (hofudstoll * (Math.pow(1 + i, arafjoldi) - 1));

        System.out.print("Vaxtagreiðslan er: ");
        System.out.print(vaxtagreidslur);
    }
}
