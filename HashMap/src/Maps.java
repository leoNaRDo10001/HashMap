import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		HashMap<String, Integer> empIds = new HashMap<>();
		
		empIds.put("Levan", 333);
		empIds.put("Anna-Marie", 444);
		
		System.out.println(empIds);
		
		System.out.println(empIds.get("Levan"));
		
		System.out.println(empIds.containsKey("Levan"));
		
		System.out.println(empIds.containsValue(333));
		
		empIds.put("Levan", 999);
		System.out.println(empIds); //gadaawera
		
		empIds.replace("Levan", 979797);
		System.out.println(empIds);
		
		empIds.putIfAbsent("Marie", 333777);
		System.out.println(empIds);
	}

}
