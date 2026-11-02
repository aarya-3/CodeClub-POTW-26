class Solution {
    public int addDigits(int num) {
        int temp = num;

        while(temp > 9){
            temp = add(temp);
        }

        return temp;
        
    }

    int add(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
