class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int canDrink = 0;
        canDrink += numBottles;

        while(numBottles >= numExchange){
            int canExchange = numBottles - (numBottles % numExchange);
            int newBottles = canExchange / numExchange;

            canDrink += newBottles;

            numBottles = numBottles - canExchange + newBottles;
        }

        return canDrink;
    }
}
