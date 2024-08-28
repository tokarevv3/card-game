public class LeetCode58 {
    public static void main(String[] args) {

    }

    static int lenghOfLastWord(String s) {
        // String[] arr = s.split(" ");
        // return arr[arr.length - 1].length();

        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            }
            if (s.charAt(i) == ' ' && count > 0) {
                break;
            }
        }
        return count;
    }
}
