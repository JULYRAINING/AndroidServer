import java.util.Scanner;

public class Sea2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] values = input.split(",");
		int[] values_int = new int[values.length];
		for(int i = 0; i <values.length; i++){
			values_int[i] = Integer.valueOf(values[i]);
		}
		int[] flag = new int[values.length];
		for(int i = 0; i <values.length; i++){
			
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
