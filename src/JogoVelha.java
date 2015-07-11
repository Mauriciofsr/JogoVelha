import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mauricio on 10/07/2015.
 */
public class JogoVelha {
    public static void main(String args[]){
        Intro();
    }

    public static void Intro(){
        System.out.println("Bem vindo ao Jogo da Velha");
        Player();
        Scanner scan = new Scanner(System.in);
        int playervez, pontplayer1, pontplayer2, jog;

        ArrayList Jogos = new ArrayList();

        int i = 0;
        for (i = 0; i < 9; i++) {
            Jogos.add(String.valueOf(i));
        }


        System.out.println("[" + Jogos.get(0) + " " + Jogos.get(1) + " " + Jogos.get(2) + "]");
        System.out.println("[" + Jogos.get(3) + " " + Jogos.get(4) + " " + Jogos.get(5) + "]");
        System.out.println("[" + Jogos.get(6) + " " + Jogos.get(7) + " " + Jogos.get(8) + "]");
        System.out.println();

        Player p = new Player(Jogos);

    }




    public static void Player(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Deseja jogar contra o computador ? [S] ou [N]");
        String resp = scan.nextLine();

        if(resp.equals("S") || resp.equals("s")){
            System.out.println("Voce sera o player1");
            System.out.println("Pode comecar jogando :)");
            System.out.println();

        }else{
            System.out.println("Fuck you bitch");
            System.exit(0);
        }

    }

}
