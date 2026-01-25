// Last updated: 1/25/2026, 2:29:59 PM
class Solution {
    public String convertToTitle(int num) {
        StringBuffer ans = new StringBuffer();
        while(num > 0) {
            num--;
            ans.append((char) ((num % 26) + 65));
            num /= 26;
        }
        return ans.reverse().toString(); 
    }
}