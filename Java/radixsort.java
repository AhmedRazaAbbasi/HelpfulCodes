import java.util.*;
public class radixsort {
    public static void countsort(int a[],int n,int e)
    {
        int b[]=new int[n];
        int i;
        int c[]=new int[10];
        Arrays.fill(c,0);
        for(i=0;i<n;i++)
            c[(a[i]/e)%10]++;
        for(i=1;i<10;i++)
            c[i]=c[i]+c[i-1];
        for(i=n-1;i>=0;i--) {
            b[c[(a[i] / e) % 10] - 1] = a[i];
            c[(a[i] / e) % 10]--;
        }
        for(i=0;i<n;i++)
            a[i]=b[i];

    }
    public static void radix(int a[],int n)
    {
        int e;
        int m=getmax(a,n);
        for(e=1;(m/e)>0;e=e*10)
            countsort(a,n,e);
    }
    public static int getmax(int a[],int n)
    {
        int m=a[0],i;
        for(i=0;i<n;i++)
        {
            if(m<a[i])
                m=a[i];
        }
        return m;
    }
    public static void print(int a[],int n)
    {
        int i;
        for(i=0;i<n;i++)
            System.out.println(a[i]);
    }
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        int n,a[],i;
        System.out.println("enter the limit of the array");
        n=S.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
            a[i]=S.nextInt();
        radix(a,n);
        print(a,n);
    }
}
