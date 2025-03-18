#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int  s, sum=0;
    scanf("%d", &s);
    int arr[s];
    for(int i = 0; i <= s-1; i++){
        scanf("%d", &arr[i]);
    }
    for(int i = 0; i <= s-1; i++){
       sum = sum+arr[i];
    }
    printf("%d", sum);
    

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}