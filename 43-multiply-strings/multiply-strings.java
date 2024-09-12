class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";

        int n1 = num1.length(), n2 = num2.length();
        int[] num = new int[n1+n2];

        for(int i=n1-1; i>=0; i--){
            for(int j=n2-1; j>=0; j--){
                num[i+j+1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); // calculating number
                num[i+j] += num[i+j+1] / 10; // carry
                num[i+j+1] = num[i + j +1] % 10; 
            }
        }

        // skipping leading zeroes
        int i=0; 
        while(i<num.length && num[i] == 0){
            i++;
        }

        // converting result into string
        StringBuilder res = new StringBuilder();
        for(; i<num.length; i++){
            res.append(num[i]);
        }

        return res.toString();
    }
}