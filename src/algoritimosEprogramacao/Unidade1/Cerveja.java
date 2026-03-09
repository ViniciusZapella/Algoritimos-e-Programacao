package algoritimosEprogramacao.Unidade1;

import java.util.Scanner;

public class Cerveja {

    static int cerveja5 = 0;
    static int cerveja3 = 0;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;

        System.out.println("=== DESAFIO DA CERVEJARIA BREWTECH ===");
        System.out.println("Você consegue distribuir 4 litros de cerveja?");

        while (total != 4){

            System.out.println("Qual ação você deseja realizar?");
            System.out.println("1 - Encher completamente a garrafa de 5 litros");
            System.out.println("2 - Encher completamente a garrafa de 3 litros");
            System.out.println("3 - Esvaziar a garrafa de 5 litros no litro de 3 litros");
            System.out.println("4 - Esvaziar a garrafa de 3 litros no litro de 5 litros");
            System.out.println("5 - Esvaziar a garrafa de 5 litros jogando fora");
            System.out.println("6 - Esvaziar a garrafa de 3 litros jogando fora");
            System.out.println("7 - Sair");
            System.out.println("Escolha uma opção");
            int escolha = input.nextInt();

            switch (escolha){
                case 1:
                    encherCerveja5();
                    break;
                case 2:
                    encherCerveja3();
                    break;
                case 3:
                    distribuirCerveja5();
                    break;
                case 4:
                    distribuirCerveja3();
                    break;
                case 5:
                    jogarCerveja5();
                    break;
                case 6:
                    jogarCerveja3();
                    break;
                case 7:
                    return;
            }

            mostrarDados();

            total = cerveja3 + cerveja5;

            if (total == 4){
                System.out.println("=== PARABÉNS VOCÊ CONSEGUIU FINALIZAR O DESAFIO === ");
            }
        }

    }

    public static void encherCerveja5(){
        cerveja5 = 5;
    }

    public static void encherCerveja3(){
        cerveja3 = 3;
    }

    public static void distribuirCerveja5(){
        int espaco = 3 - cerveja3;
        int transferir = Math.min(cerveja5, espaco);
        cerveja5 -= transferir;
        cerveja3 += transferir;
    }

    public static void distribuirCerveja3(){
        int espaco = 5 - cerveja5;
        int transferir = Math.min(cerveja3, espaco);
        cerveja3 -= transferir;
        cerveja5 += transferir;
    }

    public static void jogarCerveja5(){
        cerveja5 = 0;
    }

    public static void jogarCerveja3(){
        cerveja3 = 0;
    }

    public static void mostrarDados(){
        System.out.println("Cerveja 5: " + cerveja5);
        System.out.println("Cerveja 3: " + cerveja3);
    }

}
