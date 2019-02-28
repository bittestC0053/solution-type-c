package problem02;

public class BaseService {
	public void service(String state) {
		String result = state.equals("낮") ? day() : night();
		System.out.println(result);
	}

	public String day() {
		return "낮";
	}

	public String night() {
		return "밤";
	}
}