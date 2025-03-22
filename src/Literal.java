public class Literal {
    public void StudyLiteral() {
        //literal: 프로그램에서 직접 표현한 값. ex) 34, 42.195, '%', true, "hello"

        // int literal
        int d = 15;         // 10진수
        int o = 015;        // 8진수
        int h = 0x15;       // 16진수
        int b = 0b0101;     // 2진수
        // 10진수는 사람이 보기에 직관적이고, 8, 16, 2진수는 비트 단위로 접근하기 용이하다.
        // 정수 리터럴은 int로 컴파일
        // long 타입 리터럴은? -> 숫자 뒤에 L/l 붙여 표시! ex) long g = 24L;

        // 실수 타입 리터럴은 double 타입으로 컴파일
        double du = 0.1234;
        // 숫자 뒤에 f나 d를 명시적으로 붙이기도 한다.
        float f = 0.1234f;
        double w = 0.1234D;
        
        // 문자 리터럴은 ' '로 표현
        char a = 'A';
        char A = '\u0041'; // 'A'
        // \u0041처럼 'A'를 코드 포인트로도 사용가능

        // 논리 리터럴은 true, false 2개뿐
        boolean t = true;
        boolean tt = 10 > 0; // tt = true;
        //boolean c = 1; 타입 불일치 오류. 1/0을 참 거짓으로 사용 불가!
        //무한루프에서도 while(1)로 사용하면 안됨!
    }
}
