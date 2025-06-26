class MyCalendar {
    public List<int[]> books;
    public MyCalendar() {
       books = new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
        for(int[] book : books){
            int existingstart = book[0];
            int existingend = book[1];

            if(startTime < existingend && endTime > existingstart){
                return false;
            }
        } 
        books.add(new int[]{startTime, endTime});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */