class Solution {
    public int solution(String num_str) {
        int result = 0;
        for(int i = 0; i < num_str.length(); i++) {
            char ch = num_str.charAt(i);
            String dump = String.valueOf(ch);
            int temp = Integer.parseInt(dump);
            result += temp;
        } 
        System.out.println(result);
        
        return result;
    }
}
