import java.io.*;
import java.util.Scanner;

public class SScanner {
	public static void main(String args[]) {
		Scanner scanner = null;
		try {
			 // Scanner가 command line argument로 파일 입력경로 지정
			scanner = new Scanner(new File(args[0]));
			// PrintWriter가 command line argument로 파일 출력경로 지정 
			PrintWriter pw = new PrintWriter(args[1]);
			while(scanner.hasNext()) {
				String name = scanner.nextLine();
				pw.println(name);
			}
			pw.close();
		} catch (Exception e) {
			System.err.println("Exception occured!");
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}
