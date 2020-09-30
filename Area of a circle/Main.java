#include <stdio.h>
int main()
{
   // Try out your code here
   int dia;
   float area,r;
   scanf("%d",&dia);
   r = (float) dia/2;
   area = 3.14 * r * r;
   printf("%.2f",area);
   return 0;
}