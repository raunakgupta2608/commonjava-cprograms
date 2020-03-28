#include <stdio.h>
void main()
{
    printf("Enter the no of element upto which prime no is to be found :\n");
    int n,i,j,flag=0;
    scanf("%d",&n);
    for(i=2; i<=n; i++)
    {
        for(j=2;j<=i; j++)
        {
            flag = 0;
            if(i%j == 0)
            {
                flag =1;
                break;
            }
        }
        if(i == j)
        {
            printf("%d\t",i);
        }
    }
}