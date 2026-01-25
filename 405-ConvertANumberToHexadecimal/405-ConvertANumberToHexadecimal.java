// Last updated: 1/25/2026, 2:29:41 PM
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0"; 
        StringBuilder sb = new StringBuilder();
        while (num != 0 && sb.length() < 8) {
            int hexDigit = num & 0xf;
            if (hexDigit < 10) {
                sb.append((char) ('0' + hexDigit));
            } else {
                sb.append((char) ('a' + (hexDigit - 10)));
            }
            num >>>= 4; 
        }
         return sb.reverse().toString(); 
    }
}
