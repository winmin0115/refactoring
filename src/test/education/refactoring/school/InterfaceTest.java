package test.education.refactoring.school;

import java.util.Collection;

import education.refactoring.school.SchoolService;
import education.refactoring.school.SchoolServiceFactory;
import education.refactoring.school.SchoolServiceImpl;
import education.refactoring.school.Subject;

public class InterfaceTest {
	final static int DEFAULT_VALUE = 200;
	public static void main(String[] args) {
		//
		System.out.println(Thread.currentThread().getName());
		int num=100;
		System.out.println(num);
		System.out.println(DEFAULT_VALUE);
		//DEAULT_VALUE = 300; //사용자가 정한 상수는 final지정 변수와 구분하기 위해서 대문자 표기 권장
		System.out.println(DEFAULT_VALUE);
		
		SchoolService service; 
		//service = new SchoolService(); //인터페이스는 생성자 없다.
		//다형성을 쓰기 위해서 상속 필수, 상속을 유도하기 위해서 인터페이스 또는 추상 클래스를 사용한다. => 내가 모르더라도 일을 시킬수 있다.
		service = new SchoolServiceImpl(); //1. 자식 클래스를 직접 만든다. => 상속 LV.1
		service = SchoolServiceFactory.getInstance(); //2. 디자인 패턴을 써서 has a 관계로 표현 LV.999
		service = new SchoolService() {		//3.anonymous inner class, 1회성으로 재사용하지 않을 때 (UI EVENT) 
			@Override
			public Collection<Subject> getSubjects() {
				// TODO Auto-generated method stub
				return null;
			}};
			Collection<Subject> list=service.getSubjects();
			System.out.println(list);
	}
}
