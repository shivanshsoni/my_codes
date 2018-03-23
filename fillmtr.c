#include<stdio.h>
int main()
{

int t;
scanf("%d", &t);
while(t--){
    int n, q;
    scanf("%d %d", &n, &q);
    int arr[n][n];
    int brr[n];
    for(int i=0;i<n;i++){
        brr[i]=1;
        for(int j=0;j<n;j++)
            arr[i][j]=-1;
    }
    int result=0;
    while(q--){
        int l, r, val;
        scanf("%d %d %d", &l, &r, &val);
        arr[l-1][r-1]=val;
        arr[r-1][l-1]=val;
        if( abs(brr[l-1]-brr[r-1])!=val  && l!=r){
            brr[r-1]=brr[r-1]-val;
        }
    }
    for(int i=0;i<n;i++)
        printf("%d ", brr[i]);
    printf("\n");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(arr[i][j]!=-1 ){
                if( abs(brr[i]-brr[j])==arr[i][j] &&  abs(brr[i]-brr[j])==arr[j][i]){
                    continue;
                }
                else{
                    result=1;
                    break;
                }
            }
        }
        if(result)
            break;
    }
    if(result)
        printf("no\n");
    else
        printf("yes\n");
}
return 0; 
}