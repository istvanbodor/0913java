import java.util.Locale;
import java.util.Scanner;

public class feladat14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg a szöveget: ");
        String bekert = sc.nextLine();

        String menuPont ="";

        while (!menuPont.equals("f"))
        {
            System.out.println("Adja meg, hogy mit szeretne csinálni a szöveggel:");
            System.out.println("\ta - Nagybetűssé alakít" );
            System.out.println("\tb - Kisbetűssé alakít" );
            System.out.println("\tc - Hossz lekérdezés" );
            System.out.println("\td - Összehasonlít egy másik szöveggel" );
            System.out.println("\te - A szöveg egy részét kiiratni" );
            System.out.println("\tf - Kilép" );
            System.out.println("Adja meg a menüpontot: ");
            menuPont = sc.nextLine().toLowerCase();


            switch (menuPont)
            {
                case "a":
                    System.out.println(bekert.toUpperCase());
                    break;

                case "b":
                    System.out.println(bekert.toLowerCase());
                    break;

                case "c":
                    System.out.println("A szöveg hossza: "+bekert.length()+" karakter");
                    break;

                case "d":
                    System.out.print("Kérem adja meg a másik szöveget: ");
                    String szoveg2 = sc.nextLine();
                    int osszehasonlitas = bekert.compareTo(szoveg2);
                    if (osszehasonlitas<0)
                    {

                        System.out.println("Az első szöveg van előrébb az ABC-ben");


                    }
                    else if (osszehasonlitas>0)
                    {
                        System.out.println("A második szöveg van előrébb az ABC-ben");


                    }
                    else{
                        System.out.println("A két szöveg megegyezik.");
                    }
                    break;

                case "e":
                    System.out.println("Kérem adja meg a kezdő karakter sorszámát");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Kérem adja meg az utolsó karakter sorszámát");
                    int b = sc.nextInt();
                    sc.nextLine();
                    System.out.println(bekert.substring((a-1), (b)));
                    break;

                case "f":
                    System.out.println("Viszlát!");
                    break;
                default:
                    System.out.println("Rossz lehetőséget adott meg, kérem a menüpontok közül válasszon!");
                    break;

            }






        }





    }




}
