class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
     Arrays.sort(deck); 
        int n = deck.length;
        Deque<Integer> queue = new LinkedList<>();
        
        for (int i = n - 1; i >= 0; i--) {
            if (!queue.isEmpty()) {
                queue.addFirst(queue.removeLast());
            }
            queue.addFirst(deck[i]);
        }
        
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = queue.removeFirst();
        }
        
        return result;
    }
}