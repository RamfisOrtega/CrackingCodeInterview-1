package arrayLeftRotation;

public class LeftRotationArray {

	private int k;
	private int a[]= new int[5];
	private static LeftRotationArray n;
	
	//constructor
	public LeftRotationArray(int[] array,int d) {
		this.setA(array);
		this.setK(d);
	}

	//key method 1
	public int[] ShiftToLeft(int[] arr,int d){
		int newArray[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
            if(d > i) 
                newArray[arr.length - d + i] =arr[i];
            else
                newArray[i - d] = arr[i];
        }
		return newArray;
	}
	
	//key method 2
	public int[] ShiftToLeft_2(){
		return null;
	}
	
	//Main method
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5};
		int newNum[] = new int[num.length];
		n = new LeftRotationArray(num, 4);
		System.out.println("The array before been sorted looks like: ");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		
		newNum = n.ShiftToLeft(n.getA(), n.getK());
		System.out.println(" ");
		System.out.println("The array after been sorted 4 times to the left: ");
		for(int i=0;i<num.length;i++){
			System.out.print(newNum[i]+" ");
		}

		
	}

	/**
	 * @return the k
	 */
	public int getK() {
		return k;
	}

	/**
	 * @param k the k to set
	 */
	public void setK(int k) {
		this.k = k;
	}

	/**
	 * @return the a
	 */
	public int[] getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(int a[]) {
		this.a = a;
	}

}
