import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String a = sc.nextLine();

            if(a.equals("esquerda")){
                System.out.println("ingles");
            }else if(a.equals("direita")){
                System.out.println("frances");
            }else if(a.equals("nenhuma")){
                System.out.println("portugues");
            }else if(a.equals("as duas")){
                System.out.println("caiu");
            }
        }

        sc.close();
    }
}
