public class EnumTest {
    public static void main(String[] args) {
        for(Company type : Company.values()){
            System.out.println(type.getValue());
        }
        System.out.println(Company.APPLE.getValue());
    }
}