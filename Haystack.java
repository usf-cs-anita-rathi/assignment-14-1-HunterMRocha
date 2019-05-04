
public class Haystack {

	public static boolean contains(String haystack, String needle) {
		if (haystack.contains(needle)) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		System.out.println(contains("Java Programming", "mmine"));

	}

}
