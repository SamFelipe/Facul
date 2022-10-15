import java.util.Scanner;


public class FerramentasEmpresariais {
    public static void main(String[] args) {
        Boolean controlador = true;
        Scanner entrada = new Scanner(System.in);
        while(controlador){
            System.out.print("MENU DE OPÇÕES:\n" +
                    "1. Aumento salarial\n" +
                    "2. Férias\n" +
                    "3. Décimo terceiro\n" +
                    "4. Sair\n\n" +
                    "Digite a opção desejada: ");
            int selecionado = entrada.nextInt();
            System.out.print("\n\n\n");
            switch (selecionado){
                case 1:
                    System.out.print("CALCULO DE AUMENTO SALARIAL\n\n");
                    System.out.print("Insira o valor bruto do seu atual salário: ");
                    double salario = entrada.nextDouble();
                    if (salario <= 3500){
                        System.out.println("Seu aumento é de R$" + (salario*15/100) + ", totalizando o valor bruto de R$" + (salario+salario*15/100));
                    }
                    if (salario > 3500 && salario <= 6000){
                        System.out.println("Seu aumento é de R$" + (salario*10/100) + ", totalizando o valor bruto de R$" + (salario+salario*10/100));
                    }
                    if (salario > 6000){
                        System.out.println("Seu aumento é de R$" + (salario*5/100) + ", totalizando o valor bruto de R$" + (salario+salario*5/100));
                    }
                    break;
                case 2:
                    System.out.print("CALCULO DE REMUNERAÇÃO DE FÉRIAS\n\n");
                    System.out.print("Insira o valor do seu sálario atual: ");
                    salario = entrada.nextDouble();
                    System.out.println("A remuneração de suas férias é de: R$" + (salario + salario/3));
                    break;
                case 3:
                    System.out.print("CALCULO DE REMUNERAÇÃO DE 13° SALÁRIO\n\n");
                    System.out.print("Insira o valor do seu sálario atual: ");
                    salario = entrada.nextDouble();
                    int mesesTrabalhados;
                    System.out.print("Insira o numero de meses correspondente ao tempo de trabalho: ");
                    mesesTrabalhados = entrada.nextInt();
                    System.out.println("A remuneração de seu 13° salário é de R$" + (salario*mesesTrabalhados/12) + ",\ntotalizando uma bonificação total de R$" + (salario*mesesTrabalhados/12+salario));
                    break;
                case 4:
                    controlador = false;
            }
        }
        System.out.println("Fim do programa.");
    }
}