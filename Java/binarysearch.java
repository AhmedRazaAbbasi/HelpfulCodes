class binarysearch
{
	public static void main(String[] args) 
	{
		int data[]={10,20,30,40,50,60,70,80,90,100};
		int low, mid, high;
		low=0;
		high=data.length-1;
		int item=7;
		int loc=-1; 

		while(high>=low)
		{
			mid=(high+low)/2;
			if (item==data[mid]) 
			{
				loc=mid;
				System.out.println(item + " is found at location " + loc);
				break;
			}

			else if (item>data[mid])
			{
				low=mid+1;
			}

			else if (item<data[mid])
			{
				high=mid-1;
			}
		}

		if (loc==-1) 
		{
			System.out.println(item + " is not found in list.");
		}
	}
}