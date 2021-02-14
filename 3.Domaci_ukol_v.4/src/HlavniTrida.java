import java.time.LocalDate;
import java.util.ArrayList;


public class HlavniTrida {



    public static void main(String[] args) {


        Objednavka1.obj();
        Objednavka1 obj1 = new Objednavka1();
        Objednavka2.obj();
        Objednavka2 obj2 = new Objednavka2();
        Objednavka3.obj();
        Objednavka3 obj3 = new Objednavka3();
        Objednavka4.obj();
        Objednavka4 obj4 = new Objednavka4();
        Objednavka5.obj();
        Objednavka5 obj5 = new Objednavka5();

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



        ArrayList objednavky = new ArrayList();
        objednavky.add(obj1.objednavka1);
        objednavky.add(obj2.objednavka2);
        objednavky.add(obj3.objednavka3);
        objednavky.add(obj4.objednavka4);
        objednavky.add(obj5.objednavka5);


        //Pocet objednavek:
        System.out.println("Dohromady objednávek: " + objednavky.size());

        //Celkova cena utraty:
        int celkovySoucet = (obj1.soucet + obj2.soucet + obj3.soucet + obj4.soucet + obj5.soucet);
        System.out.println(celkovySoucet);

        //Celkový prodej dane polozky

        //Utrata u daneho cisla stolu



    }
}
