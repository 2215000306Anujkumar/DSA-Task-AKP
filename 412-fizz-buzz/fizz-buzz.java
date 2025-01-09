class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        
        res.add("1");
        if(n <2) return res;
        res.add("2");
        for(int i=3; i<=n ; i++){
            if(i%3==0 && i%5==0) res.add("FizzBuzz");
            else if(i%3==0) res.add("Fizz");
            else if(i%5==0) res.add("Buzz");
            else res.add(i+"");
        }
        return res;
    }
}