#include <stdio.h>
void main()
{
    int n, m=0, i, flag=0;
    printf("Enter a no :\n");
    scanf("%d",&n);
    m = n/2;
    if( n == 1)
    {
        printf("Invalid Input\n");
    }
    else
    {
        for(i=2; i<=m; i++)
        {
            flag=0;
            if(n%i == 0)
            {
                flag =1;
            }
        }
        if(flag == 0)
        {
            printf("%d is a prime no",n);
        }
        else
        {
            printf("%d is not a prime no",n);
        }
    }
}
