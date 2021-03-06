package quick.sort;

public class Quick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		*
		* if the array is sorted in stricly decresing order then TC is O(N2) its Worst case and sorted in
		 * incresing order its beast case which will be O()N
		*s
		*
		* */
		int[] a={6,5,4,3,2,1};
		int left = 0;
		int right = a.length - 1;
		new Quick().quick(a, left, right);
		for(int j : a){
			System.out.print(j+",");
		}
	}

	public void quick(int[] a,int left,int right){
		if(left>=right){
			return;
		}
		int p = a[right];
		int ind = partioned(a, left, right, p);
		quick(a, left, ind-1);
		quick(a, ind+1, right);
		
		
	}
	
	
	public int partioned(int[] a,int left,int right,int p){
		int i = left;
		int j = right;
		while(i < j){
			while(a[i] < p){
				i++;
			}
			while(p < a[j]){
				j--;
			}
			if(i < j){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}
	
}
