package homework_one.substringsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubstringSearch {

  public static void main(String[] args) {
    SubstringSearch substringSearch = new SubstringSearch();
    String text = "ABCDMXYT ABABCDABD ABCDABD";
    String substring = "ABCDABD";

    String text2 = "asdfjbjkakkjkljoiioiqwe";
    String substring2 = "klj";

    System.out.println(Arrays.equals(substringSearch.findSubstring(text, substring).toArray(), new Integer[]{11, 19}));
    System.out.println(Arrays.equals(substringSearch.findSubstring(text2, substring2).toArray(), new Integer[]{12}));
  }

  List<Integer> findSubstring(String text, String substring) {
    if (text == null || substring == null || substring.length() > text.length()) {
      return new ArrayList<>();
    }

    List<Integer> results = new ArrayList<>();
    char[] textChars = text.toCharArray();
    char[] substringChars = substring.toCharArray();

    for (int i = 0; i < textChars.length; i++) {

      int sameCharsCount = compareWithSubstring(textChars, i, substringChars);
      if (sameCharsCount == substringChars.length) {
        results.add(i);
      }
      if (sameCharsCount > 0) {
        i += sameCharsCount - 1;
      }
    }

    return results;

  }

  private int compareWithSubstring(char[] textChars, int startPosition, char[] substringChars) {
    int sameCharsCount = 0;
    for (int i = startPosition; (i < textChars.length) && (i - startPosition < substringChars.length); i++) {
      if (textChars[i] == substringChars[i - startPosition]) {
        sameCharsCount++;
      } else {
        return sameCharsCount;
      }
    }
    return sameCharsCount;
  }
}
