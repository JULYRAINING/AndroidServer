import java.util.Scanner;

public class Cal {
	/**
	 * 给出一行数字，用逗号隔开，模拟股市股价，求一天可获最高利润
	 * 
	 * 解法：最大值减去最小值
	 * 
	 * 需要注意的：最大值应该在最小值后面，应该说极大值和极小值(因为是套利，所以只能低价进高价出)
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] values = input.split(",");
		int[] values_int = new int[values.length];
		for(int i = 0; i <values.length; i++){
			values_int[i] = Integer.valueOf(values[i]);
		}
		
		int max = 0;
		int min = 0;
		for(int i = 0; i <values_int.length;i++){
			if(values_int[i] >= values_int[min]){
				if(max <= min||values_int[i] <= values_int[max]){
					max = i;
					min = i;
				}
				
			}else if(values_int[i] <=values_int[min]){
				min = i;
			}
				
			
			
		}
		System.out.println(values_int[max] - values_int[min]);
	}
}
