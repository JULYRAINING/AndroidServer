import java.util.Scanner;

public class Sea {
	/**
	 * 二分法求某值的index
	 * 若不存在，返回-1-index，其中index为其应该出现的位置
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int target = 0;
		int length = 0;
		int[] array = null;
		int i = 0;
		while(sc.hasNext()){
			
			if(i == 0){
				target = Integer.valueOf(sc.nextLine());
			}else if(i == 1){
				length = Integer.valueOf(sc.nextLine());
			}else if (i == 2) {
				String[] values = sc.nextLine().split(" ");
				array = new int[values.length];
				for(int j = 0; j <values.length; j++){
					array[j] = Integer.valueOf(values[j]);
				}
				break;
			}
			
			i++;
		}
		sc.close();
		
		int index = binarySearch(array, target, length);
		System.out.println(index);
		
	}
	public static int binarySearch(int[] srcArray, int des, int length){ 
		
		int low = 0; 
		int high = length-1; 
		while(low <= high) { 
			int middle = (low + high)/2; 
			if(des == srcArray[middle]) { 
			    return middle; 
			}else if(des <srcArray[middle]) { 
			    high = middle - 1; 
			}else { 
			    low = middle + 1; 
			}
		}
		return -1-(low);
   }
	

}
