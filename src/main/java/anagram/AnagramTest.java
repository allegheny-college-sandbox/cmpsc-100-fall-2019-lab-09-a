package wordgames;

/** Tests if two terms are anagrams.
 *
 * @author Douglas Luman
 */
public class AnagramTest {
 
  private char[] nameA;
  private char[] nameB;
  
  
  /** Constructor.
   *
   * @param nameA The first name to compare
   * @param nameB The second name to compare
   */
  public AnagramTest(String nameA, String nameB) {
    nameA = nameA.toLowerCase().replace(" ","");
    nameB = nameB.toLowerCase().replace(" ","");
    this.nameA = nameA.toCharArray();
    this.nameB = nameB.toCharArray();
    sortCharacters();
  }
  
  /** Calls the sort method.
   *
   */
  private void sortCharacters() {
    this.nameA = sort(this.nameA);
    this.nameB = sort(this.nameB);
  }
  
  /** Sorts arrays representing names.
   *
   * @param array The array to sort
   */
  private char[] sort(char[] array) {
    for (int a = 0; a < array.length; a++) {
      for (int b = a + 1; b < array.length; b++) {
        if (array[b] < array[a]) {
          char temp = array[a];
          array[a] = array[b];
          array[b] = temp;
        }
      }
    }
    return array;
  }
  
  /** Returns result of various anagram tests.
   *
   */
  public boolean testWords() {
    if (this.nameA.length != this.nameB.length) {
      return false;
    }
    for (int i = 0; i < this.nameA.length; i++) {
      if (this.nameA[i] != this.nameB[i]) {
        return false;
      }
    }
    return true;
  }
}