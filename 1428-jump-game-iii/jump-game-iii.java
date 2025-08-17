class Solution {
    public boolean canReach(int[] arr, int start) {
        Stack<Integer> stack  = new Stack<>();
        stack.push(start);
        while( ! stack.isEmpty()){
            int i = stack.pop();
            if(arr[i] == 0) return true;

            if(arr[i] < 0) continue;
            int jump = arr[i];
            arr[i] = -1;
            if(i+jump < arr.length) stack.push(i+jump);
            if(i-jump >=0) stack.push(i-jump);
        }
        return false;
    }
}