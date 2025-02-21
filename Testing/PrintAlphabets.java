
public class PrintAlphabets {
    // public static void main(String[] args) {
    //     // Print uppercase alphabets
    //     System.out.println("Uppercase Alphabets:");
    //     for (char ch = 'A'; ch <= 'Z'; ch++) {
    //         System.out.print(ch + " ");
    //     }
    //     System.out.println(); // New line

    //     // Print lowercase alphabets
    //     System.out.println("Lowercase Alphabets:");
    //     for (char ch = 'a'; ch <= 'z'; ch++) {
    //         System.out.print(ch + " ");
    //     }
    //     System.out.println(); // New line
    // }

    public static void main(String []args){

        System.out.println("Uppercase Alphabets");
        for(char ch='A';ch<='Z';ch++){

            System.out.print(ch +" ");
        }
        System .out.println();
        System.out.println("Lowercase alphabets");
        for(char ch='a';ch<='z';ch++){
            System.out.print(ch + " ");
        }
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        HashSet<Character> seen = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring(s));
    }
}
