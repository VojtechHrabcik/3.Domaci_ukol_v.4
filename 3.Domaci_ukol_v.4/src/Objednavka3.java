import java.time.LocalDate;
import java.util.ArrayList;

public class Objednavka3 {
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

//Objednavka 3

    ArrayList objednavka3 = new ArrayList();
        objednavka3.add(cisloObjednavky =2);
        objednavka3.add(cisloStolu =9);
        objednavka3.add(datumObjednavky =LocalDate.of(2020,6,12));
        objednavka3.add(zpusobPlatby ="Kartou");

        objednavka3.add(menu_c3);
        objednavka3.add(kofola);

    //Celkem:

    int soucet = (objednavka3.get(4) + objednavka3.get(5) + objednavka3.get(6));
    System.out.println(soucet);
}
}
