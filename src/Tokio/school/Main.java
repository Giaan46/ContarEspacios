package Tokio.school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        //Inicializamos variables
        int contadorEspacios = 0;
//Escribimos un texto pidiendo un carácter
        System.out.println("Inserte caracteres o frases completas por teclado (inserte un punto '.' para finalizar):");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String texto;//Hacemos un bucle do – while
//Leemos un carácter del teclado representado por un byte

        do {
            texto = reader.readLine();
            for (byte caracter : texto.getBytes()) {
                if (caracter == ' ') {
                    //Si el carácter es un espacio le sumamos 1 al número de espacios
                    contadorEspacios++;
                }
            }
        } while (!texto.equals("."));
        //Nos salimos si el carácter es un punto
        //Imprimimos el número total de espacios existentes
        System.out.println("El número total de espacios introducidos es: " + contadorEspacios);
    }
}

