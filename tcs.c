#include <stdio.h>
int tcs(int n)
{
    int t1=1, t2=1, j;
    int nextTerm=0;
    int x = 0 ,h = 2;
    int arr[n];
        for (j = 0; j < n; ++j)
        {
            if(j % 2 == 0)
            {
                arr[j] = t1;
                nextTerm = t1 + t2;
                t1 = t2;
                t2 = nextTerm;    
            }
            else
            {
                arr[j] = x + h;
                x = x + 2;
            }

        }
        for(j=0;j<n;j++)
        {
            printf("%d\n", arr[j]);
        }
}
void main()
{
    int n;
    printf("Enter a no: ");
    scanf("%d", &n);
        tcs(n);
}