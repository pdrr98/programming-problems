package datastructures.Binary;

public class BinaryOperations {
  public static void main(String[] args) {
    System.out.println("Asies");
    int binario = 0b1001000;// 72 en decimal
    char letra = (char) binario;// se puede convertir a una letra equivalente al valor del numero en la tabla
                                // ascii
    String ascii = String.valueOf(letra);// se puede convertir char a String
    String numberoBinario = Integer.toBinaryString(binario); // convierte un int a una String con su valor binario

    System.out.println("Valor en decimal = " + binario);
    System.out.println("Valor en binario = " + numberoBinario);
    System.out.println("Valor ASCII = " + letra);
  }
}
