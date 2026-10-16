class Solution {

    static String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", 
    "Eight", "Nine"};

    static String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
    "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    static String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", 
    "Seventy", "Eighty", "Ninety"};

    static String twoDigit(int num) {
        if (num < 10) {
            return ones[num];
        }

        if (num < 20) {
            return teens[num-10];
        }

        return tens[num/10] + (num % 10 != 0 ? " "+ones[num%10] : "");
    }

    static String threeDigit(int num) {
        StringBuilder sb = new StringBuilder();

        if (num >= 100) {
            sb.append(ones[num/100]).append(" Hundred");
            num %= 100;

            if (num > 0) {
                sb.append(" ");
            }
        }

        if (num > 0) {
            sb.append(twoDigit(num));
        }

        return sb.toString();
    }

    public String numberToWords(int num) {
        
        if (num == 0) return "Zero";

        StringBuilder sb = new StringBuilder();

        int billion = num/1000000000;
        num %= 1000000000;

        int million = num/1000000;
        num %= 1000000;

        int thousand = num/1000;
        num %= 1000;

        int remainder = num;

        if (billion > 0) {
            sb.append(threeDigit(billion)).append(" Billion ");
        }
        if (million > 0) {
            sb.append(threeDigit(million)).append(" Million ");
        }
        if (thousand > 0) {
            sb.append(threeDigit(thousand)).append(" Thousand ");
        }
        if (remainder > 0) {
            sb.append(threeDigit(remainder));
        }

        return sb.toString().trim();
        
    }
}