package injection;

public class InjectMain {

	public static void main(String[] args) {
		Injection injection = new Injection("JavaScript");
		//다른 메소드들을 호출
		
		
		//다른 메소드를 호출
		injection.setDiff2("Spring");
		injection.disp();
		
		//setDiff2를 호출하지 않았기 때문에 diff2가 null 인 상태에서 toUpperCase를 호출해서 예외
		injection = new Injection("FrontEnd");
		injection.disp();

	}

}
