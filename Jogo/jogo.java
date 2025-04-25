import java.util.Locale; // Usado pra deixar as letras minúsculas.
import java.util.Scanner; // Usado para ler os inputs do jogador.

public class jogo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;

        // Escolhas do jogador
        String x1 = "Pedra";
        String x2 = "Papel";
        String x3 = "Tesoura";

        while (true) {

            // Loop de escolhas.
            System.out.println("\33[37m~=~=~=~=~=~=~=~=~=~=");
            System.out.print("\33[36mEscolha Entre [1]Pedra [2]Papel e [3]Tesoura.\nResposta: ");
            String escolha_jogador = scanner.nextLine();
            System.out.println("\33[37m~=~=~=~=~=~=~=~=~=~=");

            while (true) {
                if (escolha_jogador.equals("1")) {
                    escolha_jogador = x1;
                    System.out.println("\33[34mVocê escolheu: " + escolha_jogador + ".");
                    break;
                }
                else if (escolha_jogador.equals("2")) {
                    escolha_jogador = x2;
                    System.out.println("\33[34mVocê escolheu: " + escolha_jogador + ".");
                    break;
                }
                else if (escolha_jogador.equals("3")) {
                    escolha_jogador = x3;
                    System.out.println("\33[34mVocê escolheu: " + escolha_jogador + ".");
                    break;
                }
                else {
                    System.out.println("\33[31mSó aceitamos os números 1, 2 e 3 nesse programa.");
                    System.out.println("\33[37m~=~=~=~=~=~=~=~=~=~=");
                    System.out.print("\33[36mEscolha Entre [1]Pedra [2]Papel e [3]Tesoura.\nResposta: ");
                    escolha_jogador = scanner.nextLine();
                    System.out.println("\33[37m~=~=~=~=~=~=~=~=~=~=");
                }
            }

            // Escolha aleatória da máquina.
            int maquina_num = (int) (Math.random() * 3) + 1;
            String escolha_maquina = "";

            if (maquina_num == 1) {
                escolha_maquina = x1;
            }
            else if (maquina_num == 2) {
                escolha_maquina = x2;
            }
            else if (maquina_num == 3) {
                escolha_maquina = x3;
            }

            System.out.println("\33[34mA máquina escolheu: " + escolha_maquina + ".");
            System.out.println("\33[37m~=~=~=~=~=~=~=~=~=~=");

            // Resultado.
            if (escolha_jogador.equals(escolha_maquina)) {
                System.out.println("\33[33mEmpate");
            }
            else if ((escolha_jogador.equals(x1) && escolha_maquina.equals(x3)) ||
                    (escolha_jogador.equals(x2) && escolha_maquina.equals(x1)) ||
                    (escolha_jogador.equals(x3) && escolha_maquina.equals(x2)))
            {
                System.out.println("\33[32mO jogador venceu!");
                // Sistema de winstreak.
                count += 1;
                if (count > 2) {
                    System.out.println("Winstreak: " + count+" 🔥");
                }
                else {
                    System.out.println("Winstreak: " + count);
                }
            }
            else {
                System.out.println("\33[31mA máquina venceu!");
                count = 0;
            }

            // Finalização.
            System.out.println("\33[37m~=~=~=~=~=~=~=~=~=~=");
            while (true) {
                System.out.print("\33[36mQuer jogar novamente? [S] ou [N]\nResposta: ");
                String jogar_novamente = scanner.nextLine().toLowerCase(Locale.ROOT);
                System.out.println("\33[37m~=~=~=~=~=~=~=~=~=~=");
                if (jogar_novamente.equals("n")) {
                    System.out.println("\33[35mFinalizando... obrigado por jogar!");
                    System.out.println("\33[37m~=~=~=~=~=~=~=~=~=~=");
                    System.exit(0);
                }
                else if (jogar_novamente.equals("s")) {
                    System.out.println("\33[36mOk");
                    break;
                }
                else {
                    System.out.println("\33[31mSó aceitamos [S] ou [N]");
                    System.out.println("\33[37m~=~=~=~=~=~=~=~=~=~=");
                }
            }

        }
    }
}




