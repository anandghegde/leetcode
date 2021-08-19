class Solution {
    public String reverseWords(String s) {
        String[] s2 = s.trim().split(" +");
        Collections.reverse(Arrays.asList(s2));
        return String.join(" ", s2);
    }
}
