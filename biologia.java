package trabalho_biologia;

import java.util.Scanner;

public class biologia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numerovacina;

        System.out.println("qual das vacinas infantis voce gostaria de conhecer? (digite o numero de 1 a 13)");
        System.out.println("1=BCG, 2=Hepatite B, 3=Hepatite A, 4=Pentavalente, 5=DTP, 6=VIP, 7=VOP, 8=Meningocócica C, 9=Pneumocócica 10, 10=Rotavírus, 11=Tríplice Viral, 12=Febre Amarela, 13=Varicela");
        numerovacina = sc.nextInt();
        switch (numerovacina){
            case 1:
                System.out.println("BCG (Bacillus Calmette-Guérin):\n" +
                        "\n" +
                        "Propósito: Proteger contra a tuberculose, especialmente em crianças.\n" +
                        "Agente Etiológico: Mycobacterium tuberculosis, a bactéria que causa a tuberculose.");
                break;
            case 2:
                System.out.println("Hepatite B:\n" +
                        "\n" +
                        "Propósito: Prevenir a infecção pelo vírus da hepatite B, que pode levar a doenças crônicas do fígado.\n" +
                        "Agente Etiológico: Vírus da Hepatite B (HBV).");
                break;
            case 3:
                System.out.println("Hepatite A:\n" +
                        "\n" +
                        "Propósito: Prevenir a infecção pelo vírus da hepatite A, que causa doenças hepáticas agudas.\n" +
                        "Agente Etiológico: Vírus da Hepatite A (HAV).");
                break;

            case 4:
                System.out.println("Pentavalente:\n" +
                        "\n" +
                        "Propósito: Oferece proteção contra difteria, tétano, coqueluche, hepatite B e Haemophilus influenzae tipo b (Hib) em uma única injeção.\n" +
                        "Agentes Etiológicos:\n" +
                        "Difteria: Corynebacterium diphtheriae (bactéria).\n" +
                        "Tétano: Clostridium tetani (bactéria).\n" +
                        "Coqueluche: Bordetella pertussis (bactéria).\n" +
                        "Hepatite B: Vírus da Hepatite B (HBV).\n" +
                        "Hib: Haemophilus influenzae tipo b (bactéria).");
                break;
            case 5:
                System.out.println("DTP (Difteria, Tétano e Coqueluche):\n" +
                        "\n" +
                        "Propósito: Proteger contra difteria, tétano e coqueluche.\n" +
                        "Agentes Etiológicos:\n" +
                        "Difteria: Corynebacterium diphtheriae (bactéria).\n" +
                        "Tétano: Clostridium tetani (bactéria).\n" +
                        "Coqueluche: Bordetella pertussis (bactéria).");
                break;
            case 6:
                System.out.println("VIP (Vacina Inativada da Poliomielite):\n" +
                        "\n" +
                        "Propósito: Proteger contra a poliomielite.\n" +
                        "Agente Etiológico: Vírus da Poliomielite (poliovírus).");
                break;
            case 7:
                System.out.println("VOP (Vacina Oral da Poliomielite):\n" +
                        "\n" +
                        "Propósito: Também protege contra a poliomielite.\n" +
                        "Agente Etiológico: Vírus da Poliomielite (poliovírus).");
                break;
            case 8:
                System.out.println("Meningocócica C:\n" +
                        "\n" +
                        "Propósito: Proteger contra a doença meningocócica causada pela bactéria Neisseria meningitidis do sorogrupo C.\n" +
                        "Agente Etiológico: Neisseria meningitidis sorogrupo C (bactéria).");
                break;
            case 9:
                System.out.println("Pneumocócica 10:\n" +
                        "\n" +
                        "Propósito: Proteger contra infecções causadas pela bactéria Streptococcus pneumoniae, incluindo pneumonia e meningite.\n" +
                        "Agente Etiológico: Streptococcus pneumoniae (pneumococo) (bactéria).");
                break;
            case 10:
                System.out.println("Rotavírus:\n" +
                        "\n" +
                        "Propósito: Prevenir infecções por rotavírus, uma das principais causas de gastroenterite em crianças.\n" +
                        "Agente Etiológico: Rotavírus.");
                break;
            case 11:
                System.out.println("Tríplice viral:\n" +
                        "\n" +
                        "Propósito: Proteger contra sarampo, caxumba e rubéola.\n" +
                        "Agentes Etiológicos:\n" +
                        "Sarampo: Vírus do Sarampo.\n" +
                        "Caxumba: Vírus da Caxumba.\n" +
                        "Rubéola: Vírus da Rubéola.");
                break;
            case 12:
                System.out.println("Febre Amarela:\n" +
                        "\n" +
                        "Propósito: Prevenir a infecção pelo vírus da febre amarela, uma doença transmitida por mosquitos.\n" +
                        "Agente Etiológico: Vírus da Febre Amarela.");
            case 13:
                System.out.println("Varicela:\n" +
                        "\n" +
                        "Propósito: Proteger contra a varicela, também conhecida como catapora, causada pelo vírus Varicela-Zoster.\n" +
                        "Agente Etiológico: Vírus Varicela-Zoster.");
            default:
                System.out.println("nenhuma opção correta selecionada, reinicie o programa");



        }

    }
}
