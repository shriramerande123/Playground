#include<stdio.h>
int main()
{
  //Type your code here
  long int year;
  scanf("%d",&year);
  if((year%4==0))
  {
    printf("Leap year");
  }
  else
    printf("Not Leap year");
  return 0;
}