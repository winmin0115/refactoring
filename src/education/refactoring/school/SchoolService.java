package education.refactoring.school;

import java.util.Collection;

//interface : All abstract method - 모두 구현부가 없다. => 구현부가 없으면 메모리에 올릴 수 없다 => 생성자가 없다.
//			  생성자가 없는 이유 =>  메소드를 구현할 때 필요한 멤버 데이터를 사용하라는 의미
//			  일반적으로 멤버 데이터는 private (어설프게 private 하면 자식은 못사용함)
public interface SchoolService {
	/**
	 * 	학생의 성적을 과목별 로 출력한다.
		 입력 : X - 매개인자
		 처리 : ? - 상수 - 사용자 정의 고정값(최대값, 최소값, 기본값...)
		 출력 : UI - 리턴타입 Subject or Collection<Subject> or List<Subject> (중복체크는 어딘가에서 해줬다는 전제하에 List 사용)
	 */
	Collection<Subject> getSubjects();
}
