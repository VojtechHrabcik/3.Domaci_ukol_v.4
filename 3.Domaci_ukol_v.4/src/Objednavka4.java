import java.time.LocalDate;
import java.util.ArrayList;

public class Objednavka4 {
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

//Objednavka 4

        ArrayList objednavka4 = new ArrayList();
        objednavka4.add(cisloObjednavky =2);
        objednavka4.add(cisloStolu =9);
        objednavka4.add(datumObjednavky =LocalDate.of(2020,6,12));
        objednavka4.add(zpusobPlatby ="Kartou");

        objednavka4.add(menu_c3);
        objednavka4.add(kofola);

        //Celkem:

        int soucet = (objednavka4.get(4) + objednavka4.get(5) + objednavka4.get(6));
        System.out.println(soucet);
    }
}