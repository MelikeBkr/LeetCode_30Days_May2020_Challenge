class StockSpanner {

    Stack<int[]> stockSpanner;
    public StockSpanner()
    {
        stockSpanner = new Stack<int[]>();
    }

    public int next(int price)
    {
        int span = 1;
        while(!stockSpanner.isEmpty() && stockSpanner.peek()[0] <= price)
        {
            span += stockSpanner.pop()[1];
        }
        stockSpanner.push(new int[]{price, span});
        
        return span;
    }
   
    }
    
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */