#include<stdio.h>
int main()
{
  //Type your code here
  int num,binaryval,decimalval=0,base=1,rem;
  scanf("%d",&num);
  binaryval=num;
  while(num>0)
  {
     rem=num%10;
     decimalval=decimalval+base*rem;
     num=num/10;
     base=base*2;
    
  }
  printf("%d",decimalval);
  return 0;
}