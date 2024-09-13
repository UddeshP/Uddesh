class Msort
{
	
	public static void merge(int arr[],int l,int m,int r)
	{
		//Size of two 
		int n1=m-l+1;
		int n2=r-m;
		
		//Create temp arrays
		int L[]=new int[n1];
		int R[]=new int [n2];
		
		//Copy data to temp arrays
		for(int i=0;i<n1;i++)
			L[i]=arr[l+i];
		for(int j=0;j<n2;j++)
			R[j]=arr[m+1+j];
		
		//merge the temp arrays//intial indices of first and second subarrays
		int i=0;int j=0;
		int k=l;
		
		while(i<n1&&j<n2)
		{
			if(L[i]<=R[j])
			{
				arr[k]=L[i];
				i++;
			}
			else{
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
		//Copy remaining elem L[] if
		
		while(i<n1)
		{
			arr[k]=L[i];
			i++;
			k++;
		}
		
		//Copy remaining elem R[] if
		while(j<n2)
		{
			arr[k]=R[j];
			j++;
			k++;
		}
	}
	
	public static void mergeSort(int arr[],int l,int r)
	{
		if(l<r)
		{
			//Find middle pt
			int m=l+(r-l)/2;																																					
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			merge(arr,l,m,r);
		}
		
	}
		
		
		
		
		
	
	static void print(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
	public static void main(String []args)
	{
		
		int arr[] = { 50,22,45,76,78};

        print(arr);

        Msort m1 = new Msort();
        mergeSort(arr, 0, arr.length-1 );

        System.out.println("\nSorted array is");
        print(arr);
		
	}
}

