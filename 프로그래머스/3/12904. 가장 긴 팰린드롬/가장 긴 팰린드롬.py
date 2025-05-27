def solution(s):
    answer = 0
    
    def expand(f, l):
        while f >= 0 and l < len(s) and s[f] == s[l]:
            f -= 1
            l += 1
        return l - f - 1
    
    for i in range(len(s)):
        # 홀수
        answer = max(answer, expand(i, i))
        
        # 짝수
        answer = max(answer, expand(i, i + 1))
    
    return answer