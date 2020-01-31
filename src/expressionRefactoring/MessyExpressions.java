package expressionRefactoring;

@SuppressWarnings("ALL")
public class MessyExpressions {

    public static int sumUpTo(int n) {
        return n * (n+1) / 2;
    }

    public static boolean isEmphatic(String text) {
        return text.contains("!");
    }

    public static String trimParentheses(String text) {
        if (!text.isBlank() )
            if (text.charAt(0) == '(')
                if (text.charAt(text.length() - 1) == ')') {
                    return text.substring(1, text.length() - 1);
        }
        return text;
    }

    public static boolean isInBounds(int x, int min, int max) {
        return (x >= min && x <= max);
    }

    public static int nextCollatz(int x) {
        int newx = x;
        if(x % 2 == 0) {
            return x / 2;
        }
        else{
            return 3 * x + 1;
        }
    }

    public static boolean isJustScreaming(String text) {
        String upperCaseText = text.toUpperCase();
        String replaceAText = upperCaseText.replace("A", "");
        String replaceText = replaceAText.replace("!", "");
        Boolean isBlankText = replaceText.isBlank();
        return isBlankText;
    }

    public static String removeAccents(String text) {
        return text
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u");
    }

    /**
     * Returns true if the given strength contains the numerals for its own
     * length, e.g. "th15 one does!!" because it contains the string “15”.
     *
     * YOUR TASK: Refactor this method to make it as unneccessarily complicated
     *   as you possibly can (without changing the result)!
     */
    public static boolean containsOwnLength(String text) {
        int a = text.length();
        String b = String.valueOf(a);
        if (text.contains(b))
            return true;
        else
            return false;
    }
}
