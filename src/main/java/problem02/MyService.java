package problem02;

public class MyService extends BaseService {

	@Override
	public void service(String state) {
		String result = null;
		if(state.equals("오후")) {
			result=afternoon().concat("서비스시작");
			System.out.println(result);
		}else {
			super.day().concat("서비스시작");//이걸 넣어줘야하는데 result에ㅠㅠ
			super.night().concat("서비스시작");
			super.service(state);
		}
	}
	public String afternoon() {
		return "오후";

	}
}
