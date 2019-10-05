#**********************************
//  Author : Hitesh Bhavsar
//  Date : 10/04/2019
#********************************
def disemvowel(s):
    for i in "aeiouAEIOU":
        s = s.replace(i,'')
    return s
