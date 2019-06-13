#include<stdio.h>
int main()
{
  //Type your code here
  int n,fdigit,sdigit,sum;
  scanf("%d",&n);
  fdigit=n/10;
  sdigit=n%10;
  sum=fdigit+sdigit;
  printf("%d",sum);
  return 0;
}