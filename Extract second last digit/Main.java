#include<stdio.h>
int main()
{
  //Type your code here
  int n,fdigit,sdigit;
  scanf("%d",&n);
  fdigit=n%100;
  sdigit=fdigit/10;
  printf("%d",sdigit);
  return 0;
}