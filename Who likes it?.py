def likes(names):
    st=""
    leng=len(names)
    if leng==0:
        print("no one likes this")
        st="no one likes this"
    elif leng==1:
        print(names[0]+" likes this")
        st=names[0]+" likes this"
    elif leng==2:
        print(names[0]+" and "+names[1]+" like this")
        st=names[0]+" and "+names[1]+" like this"
    elif leng==3:
        print(names[0]+", "+names[1]+", "+names[2]+" like this")
        st=names[0]+", "+names[1]+" and "+names[2]+" like this"
    else:
        st=names[0]+", "+names[1]+" and "+str(leng-2)+" others like this"
        
    return st
    
    
likes([])
likes(['Max'])
likes(['Max','Alex'])
likes(['Max','Alex','Nat','Arthur'])
