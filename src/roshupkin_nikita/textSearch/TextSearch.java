package roshupkin_nikita.textSearch;

public class TextSearch {
    public static void main(String[] args) {
        String text = "jjjaaaabaajabajabajaba";
        String serchText = "jabajab";
        System.out.println(textSearch(text,serchText));
    }
    public static int textSearch(String text, String searchText) {
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
           boolean coincidence;
            for (int j = i; j < searchText.length(); j++) {
                if (text.charAt(j+i) != searchText.charAt(j)) {
                    i += 1;
                }
                else if(text.charAt(j+i) == searchText.charAt(j)) {
                    index = i;
                    return index;
                }
            }
        }
        return -1;
    }
}
