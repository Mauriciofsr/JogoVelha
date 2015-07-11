import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mauricio on 11/07/2015.
 */
public class Player {
    ArrayList Jogos;

    public Player(ArrayList Jogosdela) {
        this.Jogos = Jogosdela;
        Player1();
    }
    public void Player1(){
        System.out.println("Sua vez Player");
    System.out.println("Digite o numero onde deseja jogar: ");
    int jog;
    Scanner scan = new Scanner(System.in);
    jog = scan.nextInt();
    //Jogada jogada = new Jogada();
    //jogada.setJogada(jog);
    //jogada.Jogo();

    switch (jog){
        case 0:
            Jogos.remove(0);
            Jogos.add(0,"X");
            break;
        case 1:
            Jogos.remove(1);
            Jogos.add(1,"X");
            break;
        case 2:
            Jogos.remove(2);
            Jogos.add(2,"X");
            break;
        case 3:
            Jogos.remove(3);
            Jogos.add(3,"X");
            break;
        case 4:
            Jogos.remove(4);
            Jogos.add(4,"X");
            break;
        case 5:
            Jogos.remove(5);
            Jogos.add(5,"X");
            break;
        case 6:
            Jogos.remove(6);
            Jogos.add(6,"X");
            break;
        case 7:
            Jogos.remove(7);
            Jogos.add(7,"X");
            break;
        case 8:
            Jogos.remove(8);
            Jogos.add(8,"X");
            break;
        default:
            System.out.println("Erro encontrado");
    }

        System.out.println("["+Jogos.get(0)+" "+Jogos.get(1)+" "+Jogos.get(2)+"]");
        System.out.println("["+Jogos.get(3)+" "+Jogos.get(4)+" "+Jogos.get(5)+"]");
        System.out.println("["+Jogos.get(6)+" "+Jogos.get(7)+" "+Jogos.get(8)+"]");
        System.out.println();


      Ganhador();
      Computador();

}
    public void Computador(){
        int jog, i;
        System.out.println("Vez do Computador");
        Random random = new Random();
        int intervalo_randomico = random.nextInt(8);

       if(Jogos.get(intervalo_randomico) != "X"){
           Jogos.remove(intervalo_randomico);
           Jogos.add(intervalo_randomico, "O");
       }else if(Jogos.get(intervalo_randomico) == "X" && (intervalo_randomico+ 1 < 8)){
           intervalo_randomico=+ 1;
           Jogos.remove(intervalo_randomico);
           Jogos.add(intervalo_randomico, "O");
       }else if(Jogos.get(intervalo_randomico) == "X" && (intervalo_randomico +1 == 8)){
           intervalo_randomico=- 1;
           Jogos.remove(intervalo_randomico);
           Jogos.add(intervalo_randomico, "O");
       }

        System.out.println("["+Jogos.get(0)+" "+Jogos.get(1)+" "+Jogos.get(2)+"]");
        System.out.println("["+Jogos.get(3)+" "+Jogos.get(4)+" "+Jogos.get(5)+"]");
        System.out.println("["+Jogos.get(6)+" "+Jogos.get(7)+" "+Jogos.get(8)+"]");
        System.out.println();

        Ganhador();
        Player1();
    }

    public void Ganhador(){
        if(Jogos.get(0) == "X" && Jogos.get(1) == "X" && Jogos.get(2) == "X"){
            System.out.println("Temos um ganhador!!!");
            System.out.println("Parabens Player, voce combateu a maquina !!!");
            ContinuarJogo();
        }else if(Jogos.get(3) == "X" && Jogos.get(4) == "X" && Jogos.get(5) == "X"){
            System.out.println("Temos um ganhador!!!");
            System.out.println("Parabens Player, voce combateu a maquina !!!");
            ContinuarJogo();
        }else if(Jogos.get(6) == "X" && Jogos.get(7) == "X" && Jogos.get(8) == "X"){
            System.out.println("Temos um ganhador!!!");
            System.out.println("Parabens Player, voce combateu a maquina !!!");
            ContinuarJogo();
        }else if(Jogos.get(0) == "X" && Jogos.get(4) == "X" && Jogos.get(8) == "X"){
            System.out.println("Temos um ganhador!!!");
            System.out.println("Parabens Player, voce combateu a maquina !!!");
            ContinuarJogo();
        }else if(Jogos.get(2) == "X" && Jogos.get(4) == "X" && Jogos.get(6) == "X"){
            System.out.println("Temos um ganhador!!!");
            System.out.println("Parabens Player, voce combateu a maquina !!!");
            ContinuarJogo();
        }else if(Jogos.get(0) == "X" && Jogos.get(3) == "X" && Jogos.get(6) == "X") {
            System.out.println("Temos um ganhador!!!");
            System.out.println("Parabens Player, voce combateu a maquina !!!");
            ContinuarJogo();
        }else if(Jogos.get(1) == "X" && Jogos.get(4) == "X" && Jogos.get(7) == "X") {
            System.out.println("Temos um ganhador!!!");
            System.out.println("Parabens Player, voce combateu a maquina !!!");
            ContinuarJogo();
        }else if(Jogos.get(2) == "X" && Jogos.get(5) == "X" && Jogos.get(8) == "X") {
            System.out.println("Temos um ganhador!!!");
            System.out.println("Parabens Player, voce combateu a maquina !!!");
            ContinuarJogo();
        }


        if(Jogos.get(0) == "O" && Jogos.get(1) == "O" && Jogos.get(2) == "O"){
            System.out.println("Temos um ganhador!!!");
            System.out.println("Essa nao :(, a maquina ganhou!!!");
            ContinuarJogo();
        }else if(Jogos.get(3) == "O" && Jogos.get(4) == "O" && Jogos.get(5) == "O"){
            System.out.println("Temos um ganhador!!!");
            System.out.println("Essa nao :(, a maquina ganhou!!!");
            ContinuarJogo();
        }else if(Jogos.get(6) == "O" && Jogos.get(7) == "O" && Jogos.get(8) == "O"){
            System.out.println("Temos um ganhador!!!");
            System.out.println("Essa nao :(, a maquina ganhou!!!");
            ContinuarJogo();
        }else if(Jogos.get(0) == "O" && Jogos.get(4) == "O" && Jogos.get(8) == "O"){
            System.out.println("Temos um ganhador!!!");
            System.out.println("Essa nao :(, a maquina ganhou!!!");
            ContinuarJogo();
        }else if(Jogos.get(2) == "O" && Jogos.get(4) == "O" && Jogos.get(6) == "O"){
            System.out.println("Temos um ganhador!!!");
            System.out.println("Essa nao :(, a maquina ganhou!!!");
            ContinuarJogo();
        }else if(Jogos.get(0) == "O" && Jogos.get(3) == "O" && Jogos.get(6) == "O"){
            System.out.println("Temos um ganhador!!!");
            System.out.println("Essa nao :(, a maquina ganhou!!!");
            ContinuarJogo();
        }else if(Jogos.get(1) == "O" && Jogos.get(4) == "O" && Jogos.get(7) == "O"){
            System.out.println("Temos um ganhador!!!");
            System.out.println("Essa nao :(, a maquina ganhou!!!");
            ContinuarJogo();
        }else if(Jogos.get(2) == "O" && Jogos.get(5) == "O" && Jogos.get(8) == "O"){
            System.out.println("Temos um ganhador!!!");
            System.out.println("Essa nao :(, a maquina ganhou!!!");
            ContinuarJogo();
        }
    }


    public void ContinuarJogo(){
        String resp;
        Scanner s = new Scanner(System.in);
        System.out.println("Deseja jogar novamente? [S] ou [N]");
        resp = s.nextLine();

        if(resp.equals("S")  || resp.equals("s") ){
            JogoVelha p = new JogoVelha();
            JogoVelha.Intro();
        }else{
            System.exit(0);
        }
    }
}
