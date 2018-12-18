public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a= {-1,6,9,3,-5,8,10};
    int n=a.length-1;
    int temp;
    while(n!=0) {
    	for(int i=0;i<n;i++) {
    		if(a[i]>a[i+1]) {
    			temp=a[i];
    			a[i]=a[i+1];
    			a[i+1]=temp;
    		}
    	}
    	n--;
    }
    for(int j=0;j<a.length;j++) {
    	System.out.print(a[j]);
    }
	}

}
