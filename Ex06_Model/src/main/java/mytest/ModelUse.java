package mytest;

import java.util.HashMap;
import java.util.Map;

public class ModelUse {
	
	public static void main(String[] args) {
		//지역 변수라 메서드가 종료되면 메모리에서 제거된다. 
		//힙에 객체가 생성되고 스택에 그 객체의 위치를 저장한 참조변수가 생성 
		
		Map<String, String>	model = new HashMap<>();
		//리퀘스트 맵핑 정보에 따라 메소드 호출 
		String sReturn = root(model);
		//리턴받은 뷰 펭지 이름과 모델 객체를 위해 다시 넘김 
		printData(sReturn, model);
		
		
	}
	
	public static String root(Map model) {
		model.put("name1", "홍길동");
		model.put("name2", "전우치");
		
		return "Hello";
	}
	
	public static void printData(String s, Map model) {
		String str1 = (String)model.get("name1");
		System.out.println(str1);
		System.out.println("WEB-INF/views" + s + ".jsp");
	}

}
