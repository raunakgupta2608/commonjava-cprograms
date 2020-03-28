#include <stdio.h>
void main()
{
    int n,i,j,flag, temp=0;
    int arr[n];
    printf("Enter the no of elements:\n ");
    scanf("%d",&n);
    for(i=0; i<n; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("The array you entered is :\n");
    for(i=0; i<n; i++)
    {
        printf("%d\t",arr[i]);
    }
    for(i=0; i<n; i++)
    {
        flag = 0;
        for(j=0; j<(n-i)-1; j++)
        {
            if(arr[j] > arr[j+1])
            {
                flag = 1;
                temp =  arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        if(flag == 0)
        {
            break;
        }
    }
    printf("\nThe sorted array is:\n");
    for(i=0; i<n; i++)
    {
        printf("%d\t",arr[i]);
    }
}