import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// ��� ����� N � M.  ����� � N �� ������ �.

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int s =1;
		for(int i = 1; i <= m; i++){
		    s *= n;
		}
		System.out.println(s);
			}
	}


