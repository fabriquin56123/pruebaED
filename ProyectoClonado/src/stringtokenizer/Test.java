package stringtokenizer;

import Consistencia.consistencia;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        String fecha;
        int resultado = 0;
        int variables[] = new int[3];
        int i = 0;
        System.out.println("Digite una fecha que incluya el dia, mes y año: ");
        Scanner consola = new Scanner(System.in);
        fecha = consola.nextLine();
        StringTokenizer cadenaVariables = new StringTokenizer(fecha, "/- ");
        while (cadenaVariables.hasMoreElements()) {
            variables[i] = Integer.parseInt((String) cadenaVariables.nextElement());
            i++;
        }
        int dia, mes, ano;
        dia = variables[0];
        mes = variables[1];
        ano = variables[2];

        try {
            resultado = consistencia.observar(dia, mes, ano);
            System.out.println("dia = " + dia);
            System.out.println("mes = " + mes);
            System.out.println("ano = " + ano);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
