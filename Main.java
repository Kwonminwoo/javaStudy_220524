public class Main {
    public static void main(String[] args) {
        /**
         *  자바 String 자료형은 불변하기 때문에 값을 변경할 수 없다
         *  값을 바꾸는 것 처럼 보이지만 실제로는 메모리에  새로운 String 변수를 할당하여 포인팅하는 것
         *  StringBuffer, StringBuilder는 값을 변경할 수 있고 내부적으로 버퍼를 가지고 있어 효율적임
         */
        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb);
        sb.append(" hhh"); // 문자열 합치기
        System.out.println(sb);
        sb.delete(0, 2); // 문자열 제거 0 ~ 2인덱스 까지
        System.out.println(sb);
        sb.insert(0, "he"); // 문자열 삽입
        System.out.println(sb);
        StringBuffer sb2 = new StringBuffer("hello hhh");
        if(sb.toString().equals(sb2.toString())){ // 비교시 String 객체로 바꿔야 비교 가능
            System.out.println("문자열이 같습니다");
        }

        // StringBuilder 클래스는 StringBuffer와 같지만 동기화를 해주지 않는다는 차이점이 있음
        // 싱글 쓰레드의 경우 StringBuilder가 더 효율적임
        StringBuilder sBuilder = new StringBuilder("Builder");
    }
}
