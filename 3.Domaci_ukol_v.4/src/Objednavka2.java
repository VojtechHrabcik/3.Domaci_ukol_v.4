import java.time.LocalDate;
import java.util.ArrayList;

public class Objednavka2 {
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

//Objednavka 2

    ArrayList objednavka2 = new ArrayList();
        objednavka2.add(cisloObjednavky =2);
        objednavka2.add(cisloStolu =9);
        objednavka2.add(datumObjednavky =LocalDate.of(2020,6,12));
        objednavka2.add(zpusobPlatby ="Kartou");

        objednavka2.add(menu_c3);
        objednavka2.add(kofola);

        //Celkem:

        int soucet = (objednavka2.get(4) + objednavka2.get(5) + objednavka2.get(6));
        System.out.println(soucet);
}
}
