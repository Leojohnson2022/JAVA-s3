import java.util.*;
class multiplication
{
public static void main(String args[])
{
	int m,n,i,j;
	Scanner obj=new Scanner(System.in);
	int a[][] = new int[20][20];
        int b[][]= new int[20][20];
        int c[][]=new int[20][20]; 
System.out.println("enter the number of rows");
m = obj.nextInt();

System.out.println("enter the number of columns");
n = obj.nextInt();
System.out.println("enter the first matrix");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
a[i][j]=obj.nextInt();
System.out.println("enter the second matrix");
	
for(i=0;i<m;i++)
for(j=0;j<n;j++)
b[i][j]=obj.nextInt();	


System.out.println("the multiplied matrix is \n");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
{
c[i][j]=0;
for(int k=0;k<m;k++)
{
c[i][j]+=a[i][k]+b[k][i];
}
System.out.println(c[i][j]);
}
}

}
	
