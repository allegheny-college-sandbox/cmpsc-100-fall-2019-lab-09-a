package wordgames;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestAnagram {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    File file = null;
    Scanner input = null;
    try {
      file = new File("inputs/names.list");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    AnagramTest anagramTest;
    System.out.println("NAME\t\tIS ANAGRAM");
    System.out.println("----\t\t----------");
    while (input.hasNext()) {
      String name = input.nextLine();
      anagramTest = new AnagramTest("Gator Wizard",name);
      System.out.print(name + "\t");
      if (anagramTest.testWords()) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}