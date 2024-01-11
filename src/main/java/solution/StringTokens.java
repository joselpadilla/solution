package solution;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringTokens {

	public static void main(String[] args) {
		String s = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
		String[] stringTokens = s.split("[!,?.*_'@\\ ]+");
		stringTokens = Arrays.asList(stringTokens).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
		System.out.println(stringTokens.length);
		for (int i = 0; i < stringTokens.length; i++) {
			System.out.println("---" + stringTokens[i] + "---");
		}

	}

}
