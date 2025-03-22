public class JavaDataType {
    public void StudyDataType() {
        // 자바의 기본 데이터 타입은 8개
        boolean b = true;   // 1bit, true false 모두 소문자!
        char c = 'c';       // 2byte, unicode! code point: 문자마다 붙여진 고유한 번호
        byte B = 1;         // 1byte
        short s = 1;        // 2byte
        int i = 1;          // 4byte
        long l = 1;         // 8byte
        float f = 1f;       // 4byte
        double d = 1d;      // 8byte
        // JAVA는 unsigned 없음!

        // 레퍼런스 타입: 1개이며 용도는 3가지(배열, 클래스, 인터페이스)
    }

    public void StudyString() {
        // 문자열은 기본 타입X, String 클래스로 문자열 표현!
        String toolName = "JDK";
        toolName = toolName + 1.8; // "JDK1.8"
        toolName = "(" + 3 + "," + 5 + ")"; //"(3,5)"
        // 여기서 toolName이 가리키는 객체는 바뀌는 것이 아니라 새로 생성되는것!
        // String은 불변 객체이다.

        System.out.println(toolName + "이 출시됨"); // "(3,5)이 출시됨"
        // String은 리터럴로 사용이 가능하다. 다른 reference type data는 리터럴 사용불가!
    }
}
