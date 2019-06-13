#include<stdio.h>
int main()
{
  //Type your code here
  int n,firstdigit,thirddigit,sum;
  scanf("%d",&n);
  firstdigit=n/100;
  thirddigit=n%10;
  sum=firstdigit+thirddigit;
  printf("%d",sum);
  return 0;
}