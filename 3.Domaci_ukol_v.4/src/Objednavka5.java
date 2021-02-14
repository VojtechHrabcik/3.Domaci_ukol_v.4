import java.time.LocalDate;
import java.util.ArrayList;

public class Objednavka5 {
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

//Objednavka 5

        ArrayList objednavka2 = new ArrayList();
        objednavka2.add(cisloObjednavky =2);
        objednavka2.add(cisloStolu =9);
        objednavka2.add(datumObjednavky =LocalDate.of(2020,6,12));
        objednavka2.add(zpusobPlatby ="Kartou");

        objednavka2.add(menu_c3);
        objednavka2.add(kofola);

        //Celkem:

        int soucet = (objednavka5.get(4) + objednavka5.get(5) + objednavka5.get(6));
        System.out.println(soucet);
    }
}