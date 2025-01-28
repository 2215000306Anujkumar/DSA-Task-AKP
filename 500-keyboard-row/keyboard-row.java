class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();            
            String row = null;
            if (row1.indexOf(lowerCaseWord.charAt(0)) != -1) {
                row = row1;
            } else if (row2.indexOf(lowerCaseWord.charAt(0)) != -1) {
                row = row2;
            } else if (row3.indexOf(lowerCaseWord.charAt(0)) != -1) {
                row = row3;
            }
            
            boolean isValid = true;
            for (char c : lowerCaseWord.toCharArray()) {
                if (row.indexOf(c) == -1) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}