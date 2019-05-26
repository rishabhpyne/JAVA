import java.util.Scanner;
class QuickSort
{
public static void main(String args[])
{
QuickSort ob=new QuickSort();
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER OF ELEMENTS...");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ELEMENTS...");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();

System.out.println("NOW AFTER SORTING USING QUICK SORT");
ob.Quick(a,0,n-1);
for(int k=0;k<n;k++)
System.out.print(a[k]+" ");
}

void Quick(int a[],int p,int r)
{
int q;
if(p<r)
{
q=Partition(a,p,r);
Quick(a,p,q-1);
Quick(a,q+1,r);
}
}
int Partition(int a[],int p,int r)
{
int t;
int x=a[r];
int i=p-1;
for(int j=p;j<=(r-1);j++)
{
if(a[j]<=x)
{
i++;
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
t=a[i+1];
a[i+1]=a[r];
a[r]=t;
return (i+1);
}
}
