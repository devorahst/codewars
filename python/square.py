def is_square(n): 
    square = False
    ans = 0
    int = 0
    while(ans <= n):
        ans = int * int
        int += 1
        if ans == n:
            square = True
    return square
