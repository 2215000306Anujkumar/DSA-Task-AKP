class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> map = new PriorityQueue<>();
        for(int num : nums){
            map.add((long)num);
        }
        int operation = 0;
        while(map.size() > 1 && map.peek() < k){
            long x = map.poll();
            long y = map.poll();
            long newNo = (x*2)+y;
            map.add(newNo);
            operation++;
        }
        return (map.peek() >=k)? operation : -1;
    }
}