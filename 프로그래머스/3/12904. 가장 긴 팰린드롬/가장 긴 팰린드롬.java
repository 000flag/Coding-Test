class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // 홀수
            answer = Math.max(answer, expand(s, i, i));
            
            // 짝수
            answer = Math.max(answer, expand(s, i, i + 1));
        }

        return answer;
    }
    
    public int expand(String s, int f, int l)
    {
        while (f >= 0 && l < s.length() && s.charAt(f) == s.charAt(l)) {
            f--;
            l++;
        }
        
         return l - f - 1;
    }
}