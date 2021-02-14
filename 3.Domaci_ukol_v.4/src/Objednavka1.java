import java.time.LocalDate;
import java.util.ArrayList;

public class Objednavka1 {

    public static void obj(){

        int cisloObjednavky;
        int cisloStolu;
        LocalDate datumObjednavky;
        String zpusobPlatby;

        int menu_c1 = 110;
        int menu_c2 = 125;
        int menu_c3 = 145;
        int kofola = 30;
        int pivo = 26;
        int kafe = 35;


//Objednavka 1



        ArrayList objednavka1 = new ArrayList();
        objednavka1.add(cisloObjednavky = 1);
        objednavka1.add(cisloStolu = 22);
        objednavka1.add(datumObjednavky = LocalDate.of(2020, 6, 12));
        objednavka1.add(zpusobPlatby = "Hotove");

        objednavka1.add(menu_c1);
        objednavka1.add(pivo);
        objednavka1.add(kafe);


        //Celkem:

        int soucet = (objednavka1.get(4) + objednavka1.get(5) + objednavka1.get(6));
        System.out.println(soucet);

    }
}