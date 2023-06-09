package Practice;

public class Study {
	
/*
상수의 선언 
ex) final(한번 정해지면 값 바꾸기x) static double PI = 3.141592; 

객체생성
클래스명 변수명 = new 클래스명;

객체 지향 프로그래밍 특징
추상화 캡슐화 상속 다형성

[접근 제한자] [예약어] class 클래스명{...}

캡슐화 : 정보은닉
접근제어자(private(같은 클래스), default(같은 패키지), protected(같은 패키지, 다른 패키지 자손 클래스), public)

변수의 종류 
지역변수 : 메서드 내에서만 사용가능
인스턴스변수, 클래스변수(static) : 클래스 영역에 생성 

오버로딩 : 한 클래스 내에 동일한 이름의 메소드를 매개변수와 자료형과 갯수, 순서가 다르게 작성되어야함
오버라이딩 : 부모클래스로부터 상속받은 메소드를 자식 클래스에서 재정의 하는 것을 오버라이딩(메서드의 이름, 매개변수, 리턴값이 모두 같아야함)

getter/setter 메소드 : 객체의 무결성을 해치지 않고 데이터를 안정하게 사용하는것이 가능
setter set메소드는 private로 선언된 필드의 값을 수정할때 필요(주로 데이터를 변경하는 역할)
getter get 메소드는 데이터를 읽어오는 역할을 주로 수행

상속(inheritance)
[접근제어자] class 자식클래스 extends 부모클래스
super(); : 해당 객체의 부모의 객체의 주소를 담고 있음

다형성(polymorphism)
하나의 객체변수가 여러가지 모양과 모습을 가지는 능력, 부모 타입으로 자식개체를 생성하는 것
ex) 다형성 방식으로 객체 생성
Employee e1 = new manager(" ");

*추상 클래스 
[접근 제어자] abstract class 클래스명{...}
미완성 클래스로 추상 메서드를 포함한 클래스, 미완성 클래스이기 때문에 new 연산자를 통해 객체 생성X

*추상 메서드
추상메서드는 구현부가 없음

*인터페이스(interface)
[접근제어자] interface 인터페이스명{...}
인터페이스를 구현하라명 implements 키워드를 사용
다중 상속 허용

*예외처리
try ~ catch
printStackTrace() : 예외발생 당시의 호출스택(Call stack에 있었던 메소드의 정보와 예외 메세지를 화면에 출력)
getMessage() : 발생한 예외클래스의 객체에 저장된 메세지를 얻을 수 있음

*예외처리 떠넘기기 : throws 키워드
리턴타입 메서드명 (매개변수, ...) throws 예외클래스1, 예외클래스2 ... {...}

*컬렉션
자바에서 제공하는 자료구조를 담당하는 프레임워크, java util 패키지에 컬렉션과 관련된 인터페이스 클래스들이 포함

List: 중복허용, 순서있음

제너릭스(Genetics) 
컴파일 시 타입을 체크해 주는 기능, <>연산자 사용 가능

컬렉션에서 사용하는 이유
명시된 타입의 객체만 저장하도록 제한을 두기 위해, 컬렉션에 저장한 객체를 사용할때 매번 형변환 안해도 됨
ex) 
ArrayList<Person> list = new ArrayList<person>(); //객체 생성
list.add(new Person(...));	//매번 형변환 안해도됨


*/
	
	
}
