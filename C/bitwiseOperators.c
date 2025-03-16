#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.

int max(int a, int b){
 int c = a > b ? a : b;
 return c;
}

void calculate_the_maximum(int n, int k) {
    int and = 0, or = 0, xor = 0;
    int maxofand = 0, maxofor = 0, maxofxor = 0;
  for(int a = 1; a<=n; a++){
    for(int b = a+1; b<=n; b++){
        and = a & b;
        if(and < k){
            maxofand = max(maxofand,and);
        }
        or = a | b;
        if(or < k){
            maxofor = max(maxofor,or);
        }
       xor = a ^ b;
       if(xor < k){
            maxofxor = max(maxofxor,xor);
        }
    }
  }
  printf("%d\n", maxofand); 
  printf("%d\n", maxofor);
  printf("%d\n", maxofxor);

}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}
