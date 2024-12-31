class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> a1 = new ArrayList<>();

        for(int i=0 ; i<nums1.length;i++){
            for(int j=0 ; j<nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    a1.add(nums2[j]);
                    nums2[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
        int[] res = new int[a1.size()];
        int k =0;
        for(int i : a1){
            res[k] = i;
            k++;
        }
        return res;
    }
}