package in.arfajsheru.array;

class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] stocks = {7,1,5,3,6,4};
        System.out.println(solution(stocks));
    }


    public static int solution(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){ //
            minPrice = Math.min(minPrice, price); // (max, 7)=7,
            System.out.println("minPrice = " + minPrice + ", Price = " + price);
            maxProfit = Math.max(maxProfit, price - minPrice); //
            System.out.println("maxProfit = " + maxProfit );
        }
        return maxProfit;
    }
}

/*
* Ek minumum price store karenge jo abhi talak mila he thik he
* Profit tab milega jab current price me se minmum price ko minus karenge
* Or Maximum profit ko track karte chalenge*/
