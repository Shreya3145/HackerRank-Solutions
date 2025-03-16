#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    int n;
    scanf("%d", &n);
    int m =(2*n - 1); 
     for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= m; j++) {
    
            int top = i - 1;
            int left = j - 1;
            int bottom = m - i;
            int right = m - j;
            int layer = top;
            if (left < layer) 
            layer = left;
            if (bottom < layer) 
            layer = bottom;
            if (right < layer) 
            layer = right;

            printf("%d ", n - layer);
        }
        printf("\n");
    }
    return 0;
}
