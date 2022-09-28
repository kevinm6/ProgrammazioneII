/**
 * JavaDoc comments look like this. Used to describe the Class or various
 * attributes of a Class.
 * Main attributes:
 *
 * @author      Name (and contact information such as email) of author(s).
 * @version     Current version of the program.
 * @since       When this part of the program was first added.
 * @param       For describing the different parameters for a method.
 * @return      For describing what the method returns.
 * @deprecated  For showing the code is outdated or shouldn't be used.
 * @see         Links to another part of documentation.
*/

import java.util.Collections;

// Class HelloWorld
public class HelloWorld {
  public static void main(String[] args) {
    int x, y;
    x = 1;
    y = 10;

    System.out.println("Result: " + (x+y));

    String<int> age;

    for (int i = 0; i < len(age); i++) {
      System.out.println(i, age + "\n");
    }
  }
}
