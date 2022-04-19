public class Forstar2 {
    public static void main(String[] args) {
        //행과 열이 동일하게 늘어나는 직각삼각형을 출력하는 프로그램을 작성하세요.

        int i, j;

        for( i = 0; i <4; i++){
            for( j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
