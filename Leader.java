import java.util.Scanner;
class Leader
{
	static int a[][];
	static int noc;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		a=new int[100][107];
		noc=sc.nextInt();
		int i=0;
		int j;
		int n;
		while(i<noc)
		{
			n=sc.nextInt();
			for(j=0;j<n;j++)
				a[i][j]=sc.nextInt();
			i++;
		}
		sc.close();
		Leader ob=new Leader();
		ob.findleaders();
	}
	public void findleaders()
	{
		int l1,l2;
		boolean flag;
		int i=0;
		while(i<noc)
		{
			l1=l2=0;
			flag=true;
		for(l1=0;l1<(a[i].length-1);l1++)
		{
			for(l2=(l1+1);l2<a[i].length;l2++)
			{
				if((a[i][l1]<a[i][l2])&&(a[i][l1]!=0)&&(a[i][l2]!=0)){
					flag=false;
					break;
				}
			}
		if(flag&&(a[i][l1]!=0))
			System.out.print(a[i][l1]+" ");
		flag=true;
		}
		i++;
		System.out.println();
		}
	}
	}
	
		
	
