package aplicacao;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import interfaces.aparelhoTelefonico;
import interfaces.navegadorInternet;
import interfaces.reprodutorMusical;
import java.util.Scanner;

public abstract class Iphone implements aparelhoTelefonico, navegadorInternet, reprodutorMusical {
    public Iphone() {

    }
    public void selecionarMusica() {
        System.out.println("Musica selecionada");
    }
    public void ligar() {
        System.out.println("Fazendo uma ligação");
    }
    public void atender() {
        System.out.println("Atendendo uma ligação");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    public void tocar() {
        System.out.println("Reproduzindo musica");
    }
    public void pausar() {
        System.out.println("Musica pausada");
    }
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone() {
            @Override
            public void atualuzarPagina() {

            }
        };

        int opcao;
        do {
            System.out.println("Selecione uma opção no menu: \n 1 - Efetuar ligação \n 2 - Atender ligação \n 3 - Iniciar correio de voz \n 4 - Selecionar música \n 5 - Tocar música \n 6 - Pausar música \n 7 - Exibir página no navegador \n 8 - Abrir nova aba no navegador \n 9 - Atualizar página no navegador \n 0 - Desligar");
            opcao = sc.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Desligar aparelho");
                    break;
                case 1:
                    iphone.ligar();
                    break;
                case 2:
                    iphone.atender();
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                    break;
                case 4:
                    iphone.selecionarMusica();
                    break;
                case 5:
                    iphone.tocar();
                    break;
                case 6:
                    iphone.pausar();
                    break;
                case 7:
                    iphone.exibirPagina();
                    break;
                case 8:
                    iphone.adicionarNovaAba();
                    break;
                case 9:
                    iphone.atualizarPagina();
                    break;
                default:
            }
        }while (opcao != 0);
        sc.close();
    }

}
