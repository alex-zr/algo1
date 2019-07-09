package roshupkin_nikita.textSearch;

public class TextSearch {
    public static void main(String[] args) {
        String[] text = new String[]{"jjjaaaabaajabajabajaba"};
        String[] serchText = new String[]{"jabajab"};

    }
    public int textSearch(String[] text, String[] searchText) {
        int index = 0;
        for (int i = 0; i < text.length; i++) {
          //  boolean coincidence;
            for (int j = 0; j < searchText.length; j++) {
                if (text[j] != searchText[j]) {
                    i += 1;
                }
                else if(text[i] == searchText[j]) {
                    index = i;

                }
            }
        }
        return 0;
    }
}
