package algoritimosEprogramacao.Unidade1;

public class EstruturandooCálculodeMédias {

    public static void main(String[] args) {


        double nota1 = 9;
        double nota2 = 9;
        double nota3 = 1;
        double nota4 = 9;

        double mediaFinal = (nota1+nota2+nota3+nota4)/4;

        String situacao = (mediaFinal>=7) ? "Aprovado" : "Reprovado";

        System.out.println(situacao);
    }

}
