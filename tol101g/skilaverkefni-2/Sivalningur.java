/******************************************************************************
 *  Nafn    : Íris Dögg Jónsdóttir
 *  T-póstur: idj8@hi.is
 *
 *  Lýsing  : Reiknar út flatarmál og rúmmál sívalings. Tekur inn radíus og hæd.
 *
 *
 *****************************************************************************/

public class Sivalningur {
    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]);
        double h = Double.parseDouble(args[1]);

        double flatarmal = (2 * Math.PI * r * (r + h));
        double rummal = (Math.PI * (Math.pow(r, 2)) * h);

        System.out.println("Flatarmál sívalnings með radíus " + r + " og hæð " + h + " er:" + flatarmal);
        System.out.println("Rúmmál sívalnings með radíus " + r + " og hæð " + h + " er:" + rummal);
    }
}
