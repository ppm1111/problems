class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        num1 = reverse(num1);
        num2 = reverse(num2);
        int[] array = new int[num1.length() + num2.length() + 1];
        for (int a = 0; a < num2.length(); a++) {
            for (int b = 0; b < num1.length(); b++) {
                array[a + b] = array[a + b] + ((int)num1.charAt(b) - 48) * ((int)num2.charAt(a) - 48);
                array[a + b + 1] = array[a + b + 1] + array[a + b] / 10;
                array[a + b] = array[a + b ] % 10;
            }
        }
        String result = "";
        int print = 0;
        for (int a = array.length - 1; a >= 0; a--) {
            if (array[a] != 0) {
                print = 1;
            }
            if (print == 1) {
                result = result + array[a];
            }
        }
        return result;
    }
    
    private String reverse(String num) {
        StringBuilder builder = new StringBuilder();
        builder.append(num);
        builder = builder.reverse();
        return builder.toString();
    }
}