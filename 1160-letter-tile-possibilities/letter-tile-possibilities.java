class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String> result = new HashSet<>();
        boolean[] used = new boolean[tiles.length()];
        char[] chars = tiles.toCharArray();
        backtrack(chars, "", used, result);
        return result.size();
    }

    private void backtrack(char[] chars, String current, boolean[] used, Set<String> result) {
        if (!current.isEmpty()) {
            result.add(current);
        }
        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            backtrack(chars, current + chars[i], used, result);
            used[i] = false;
        }
    }
}