package Consistencia;

import Excepcion.OperacionExcepcion;

public class consistencia {

    public static int observar(int dia, int mes, int ano) throws OperacionExcepcion {
        boolean temp = false;
        //-------------Año bisiesto----------------
        if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                for (int i = 1; i <= 31; i++) {
                    if (dia == i) {
                        temp = true;
                        break;
                    } else {
                        temp = false;
                    }
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                for (int i = 1; i <= 30; i++) {
                    if (dia == i) {
                        temp = true;
                        break;
                    } else {
                        temp = false;
                    }
                }
            } else if (mes == 2) {
                for (int i = 1; i <= 29; i++) {
                    if (dia == i) {
                        temp = true;
                        break;
                    } else {
                        temp = false;
                    }
                }
            }

            //--------------Año normal------------------
        } else {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                for (int i = 1; i <= 31; i++) {
                    if (dia == i) {
                        temp = true;
                        break;
                    } else {
                        temp = false;
                    }
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                for (int i = 1; i <= 30; i++) {
                    if (dia == i) {
                        temp = true;
                        break;
                    } else {
                        temp = false;
                    }
                }
            } else if (mes == 2) {
                for (int i = 1; i <= 28; i++) {
                    if (dia == i) {
                        temp = true;
                        break;
                    } else {
                        temp = false;
                    }
                }
            }
        }
        if (temp == true) {
            System.out.println("El dia ingresado es correcto");
        } else {
            throw new OperacionExcepcion("El dia ingresado es incorrecto");
        }
        return 0;
    }
}
