package practice01;

public class Prob5 {

	public static void main(String[] args) {
		for(int i=1; i<100; i++) {
			int cnt = 0;
			for(int j=0; j<String.valueOf(i).length(); j++) {
				if(String.valueOf(i).substring(j,j+1).equals("3")
					|| String.valueOf(i).substring(j,j+1).equals("6")
					|| String.valueOf(i).substring(j,j+1).equals("9")) {
					cnt ++;
				}
			}
			if(cnt > 0) {
				System.out.print(i+" ");
				for(int k=0; k<cnt; k++) {
					System.out.print("짝");
				}
				System.out.println();
			}
		}
	}
}
