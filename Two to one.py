def longest(s1, s2):
    # your code
    s=s1+s2
    st="".join(sorted(set(s)))    
    return st
    
    
longest("xyaabbbccccdefww","xxxxyyyyabklmopq")
