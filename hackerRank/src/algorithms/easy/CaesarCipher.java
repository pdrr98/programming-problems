package algorithms.easy;

public class CaesarCipher {

  public static void main(String[] args) {
    // Julius Caesar protected his confidential information by encrypting it using a
    // cipher.
    // Caesar's cipher shifts each letter by a number of letters.
    // If the shift takes you past the end of the alphabet, just rotate back to the
    // front of the alphabet.
    // In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
    // Original alphabet: abcdefghijklmnopqrstuvwxyz
    // Alphabet rotated +3: defghijklmnopqrstuvwxyzabc
    String s = "middle-Outz";
    int k = 2; // number of rotations
    String s2 = "There's-a-starman-waiting-in-the-sky";
    // encripted = Wkhuh'v-d-vwdupdq-zdlwlqj-lq-wkh-vnb
    System.out.println("");
    char[] charArray = s.toCharArray();

    for (int i = 0; i < s.length(); i++) {
      char character = charArray[i];
      // ASCII 65 = A 90 = Z
      // 97 = a 122 = z
      if (character >= 65 && character <= 90) {
        charArray[i] = rotateUppercase(character, k);
      } else if (character >= 97 && character <= 122) {
        charArray[i] = rotateLowercase(character, k);
      }
    }

    printResults(s, charArray);

  }

  private static char rotateLowercase(char character, int rotations) {
    // 97 - 122
    // ñ = 241
    for (int i = 1; i <= rotations; i++) {
      character++;
      if (character > 122) {
        character = 97;
      }
    }
    return character;
  }

  private static char rotateUppercase(char character, int rotations) {
    // 65 - 90
    // Ñ = 209
    for (int i = 1; i <= rotations; i++) {
      character++;
      if (character > 90) {
        character = 65;
      }
    }
    return character;
  }

  private static void printResults(String s, char[] charArray) {
    System.out.println(s + " Original String");

    StringBuilder sb = new StringBuilder();
    sb.append(charArray);
    System.out.println(sb + " String builder");

    String string = new String(charArray);
    System.out.println(string + " String");

    for (int i = 0; i < s.length(); i++) {
      System.out.print(charArray[i]);
    }
    System.out.println(" Char");

    System.out.println(charArray.toString() + " char.toString");
    System.out.println("toString methods on arrays, return the memory address of the array");

    System.out.println(Integer.valueOf(charArray[0]));

    Integer num = 999;
    byte bite = num.byteValue();
    System.out.println(num.BYTES);

  }

}
