import java.util.Scanner;
class Subarray
{
static long a[][]=new long[100][100];
static long b[]=new long[100];
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long noc;
long n; 
int i,j;
n=0L;
i=0;
noc=sc.nextLong();
try{
while(i<noc)
{
n=sc.nextLong();
b[i]=sc.nextLong();
for(j=0;j<n;j++)
a[i][j]=sc.nextLong();
i++;
}
}
catch(ArrayIndexOutOfBoundsException e){
}
i=0;
j=0;
while(i<noc)
{
boolean flag=false;
int k1=0;
int k2=0;
long sum=0L;
for(k2=k1;k2<a[i].length;k2++){
	sum+=a[i][k2];
	if(sum<=b[i]){
		if(sum==b[i]){
		System.out.print((k1+1)+" "+(k2+1)+"\n");
		flag=true;
		break;
		}
	}
	else{
		sum=0L;
		if(k1<a[i].length){
		++k1;
		k2=k1-1;
		continue;
		}
}
}
if(!flag)
	System.out.print(-1);
i++;
System.out.println();
}
}
}

