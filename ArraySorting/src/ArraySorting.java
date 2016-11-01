import java.util.*;

public class ArraySorting {

	public static void main(String[] args) {
		
		String ss[] = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra",
				"Herman"};
		Arrays.sort(ss);
		for(int i = 0; i < ss.length; i++){
			System.out.println(ss[i]);
		}		
	}

}
