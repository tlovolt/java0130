package injection;

public class Injection {
	private String common; //모든 인스턴스들이 "Java"라고 저장해서 사용
	private String diff1;  //인스턴스들 마다 다름
	private String diff2;  //인스턴스들 마다 다름
	
	public Injection(String diff1) {
		common = "Java";
		//생성자를 이용한 주입
		this.diff1 = diff1;
	}
	
	//diff2 에 대한 setter 메소드 - setter 나 getter를 소유한 인스턴스 변수를 property라고 합니다.
	public void setDiff2(String diff2) {
		this.diff2 = diff2;
	}
	
	//common 과 diff1 은 null 일 가능성이 없지만 
	//diff2는 setter를 이용해서 대입받기 때문에 null일 가능성이 존재
	//서버 프로그래밍을 할 때는 메모리 부담이 되더라도 처음부터 만들어두고 사용하는 것이 좋고
	//클라이언트 프로그래밍을 할 때는 속도가 느리더라도 필요할 때 생성하는 것이 좋습니다.
	public void disp() {
		System.out.println(common.toUpperCase());
		System.out.println(diff1.toUpperCase());
		System.out.println(diff2.toUpperCase());
	}
	
}






