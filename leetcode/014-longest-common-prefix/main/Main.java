
class Main {

    public static String longestCommonPrefix(String[] strs) {

        String result = "";

        int min_len = 9999;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min_len) {
                min_len = strs[i].length();
            }
        }

        for (int i = 0; i < min_len; i++) {
            char c = strs[0].charAt(i);
            int all = 0;
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) == c) {
                    all = all + 1;
                }
            }
            if (all == strs.length) {
                all = 0;
                result = result + c;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("014 - Longest Common Prefix");

        // Ejemplo 1
        String[] example1 = { "flower", "flow", "flight" };
        System.out.println("Longest Common Prefix (example 1): " + longestCommonPrefix(example1));

        // Ejemplo 2
        String[] example2 = { "dog", "racecar", "car" };
        System.out.println("Longest Common Prefix (example 2): " + longestCommonPrefix(example2));

        // Ejemplo 3
        String[] example3 = { "interspecies", "interstellar", "interstate" };
        System.out.println("Longest Common Prefix (example 3): " + longestCommonPrefix(example3));

        // Ejemplo 4
        String[] example4 = { "throne", "throne" };
        System.out.println("Longest Common Prefix (example 4): " + longestCommonPrefix(example4));

        // Ejemplo 5
        String[] example5 = { "throne", "dungeon" };
        System.out.println("Longest Common Prefix (example 5): " + longestCommonPrefix(example5));

        // Ejemplo 6
        String[] example6 = { "cheese" };
        System.out.println("Longest Common Prefix (example 6): " + longestCommonPrefix(example6));
    }
}