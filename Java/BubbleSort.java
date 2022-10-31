class BubbleSort
{
	public static void main(String[] args) 
	{
		int data[]={37,3,6,7,40,5,100,49,80};
		System.out.println("Data before sorting:-");
		for (int i=0; i<data.length; i++) 
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();

		bubbleSort(data);

		System.out.println("Data after sorting:-");
		for (int i=0; i<data.length; i++) 
		{
			System.out.print(data[i] + " ");
		}
	}
		static void bubbleSort(int arr[])
		{
			int temp=0;
			for (int i=0; i<arr.length; i++) 
			{
				for (int j=1; j<arr.length-i; j++) 
				{
					if (arr[j-1]>arr[j])
					{
						temp=arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
	
}