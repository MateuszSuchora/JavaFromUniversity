package Kolokwium;

public class ImpPalindromChecker implements PalindromChecker {

    @Override
    public boolean check(String s) {
        char x;
        char y;
        int dl;
        String text = s;
        text = text.replaceAll(".", "");
        text = text.replaceAll(",", "");
        text = text.replaceAll(" ", "");
        text = text.replaceAll(",", "");
        text = text.replaceAll("!", "");
        text = text.replaceAll("-", "");
        text = text.replaceAll("/?", "");

        text = text.toLowerCase();
        dl = text.length();
        for (int i = 0; i < dl; i++) {
            x = text.charAt(i);
            y = text.charAt(dl - 1 - i);
            if (x != y) {
                return false;
            }
        }
        return true;
    }

}
