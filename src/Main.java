
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcion = 0;

        Festival festival = new Festival();
        festival.setName("BBK LIVE");
        festival.setSponsor("BBK");
        festival.load_data("src/files/performances.txt");
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("\n\t\tFESTIVAL MENU \n");
            System.out.println("\n\t1.Festibaleko informazio dena erakutsi\n\tMostrar toda la info del festival");
            System.out.println("\n\t2.Aktuazio berri bat gehitu\n\tAñadir actuacion al festival");
            System.out.println("\n\t3.Festibalaren iraupena atera kontuan izanda taldeen artean 15 minutuko atsedenaldia dagoela"
                    + "\n\tTeniendo en cuenta que entre grupo y grupo hay un intervalo de 15mins, mostrar la duracion del festival hay un intervalo de 15mins, mostrar la duracion del festival");
            System.out.println("\n\t4.Erabilzaileari testu kate bat eskatu eta izenean letra hoiek dituzten aktuazioak atera ( maiuskulak / minuskulak kontuan izan Gabe)"
                    + "\n\tPedir una cadena de texto por pantalla y mostrar las actuaciones que tengan esa cadena en el nombre, indistintamente de que el usuario haya metido mayusculas o minusculas");
            System.out.println("\n\t5.100 minuto baino motzagoak diren aktuazio denei 10 min gehitu, eta esan zenbat izan diren"
                    + "\n\tPara todas las duraciones menores de 100 mins, sumarles 10misn a cada una y mostrar cuantos son");
            System.out.println("\n\t6.Atera iraupen gehien duen aktuazioaren datuak. (bat baino gehiago badira atera denak ) "
                    + "\n\t Hallar los datos de la actuacion con mas larga. Si hay varias iguales, sacar todas");
            System.out.println("\n\t7.Irten / Salir");

            System.out.print("\n\n\tEnter an option (1-7) 8.End : ");
            opcion = Integer.parseInt(scan.nextLine());

            switch (opcion) {

                case 1:
                    //Festibaleko informazio dena erakutsi 
                    //Mostrar toda la info del festival

                    festival.printFestivalData();
                    break;

                case 2:
                    //Aktuazio berri bat gehitu 
                    //Añadir actuacion al festival

                    festival.nuevo();
                    break;

                case 3:
                    //Festibalaren iraupena atera kontuan izanda taldeen artean 15 minutuko atsedenaldia dagoela
                    // Teniendo en cuenta que entre grupo y grupo hay un intervalo de 15mins, mostrar la duracion del festival hay un intervalo de 15mins, mostrar la duracion del festival

                    break;
                case 4:
                    //Erabilzaileari testu kate bat eskatu eta izenean letra hoiek dituzten aktuazioak atera ( maiuskulak / minuskulak kontuan izan Gabe
                    // Pedir una cadena de texto por pantalla y mostrar las actuaciones que tengan esa cadena en el nombre, indistintamente de que el usuario haya metido mayusculas o minusculas
                    festival.buscar();
                    break;
                case 5:
                    // 100 minuto baino motzagoak diren aktuazio denei 10 min gehitu, eta esan zenbat izan diren
                    // Para todas las duraciones menores de 100 mins, sumarles 10misn a cada una y mostrar cu�ntos son

                    break;

                case 6:
                    //Iraupen gehien dituen aktuazioaren datuak. (bat baino gehiago badira atera denak )
                    // Hallar los datos de la actuaci�n m�s larga. Si hay varias iguales, sacar todas
                    festival.mostrarActuacionLargo();
                    break;
                case 7:
                    System.out.println("Coming out...");
                    break;
                default:
                    System.out.println("Wrong option (1-6) 7-go out");

            }

        } while (opcion != 7);

        scan.close();
    }

}
