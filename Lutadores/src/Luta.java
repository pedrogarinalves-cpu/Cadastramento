import java.util.Random;

    public class Luta {
        //Atributos
        private  lutadores desafiado;
        private  lutadores desafiante;
        private int rounds;
        private boolean aprovada;

        //metodos
        public void marcarluta(lutadores l1, lutadores l2){
            if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
                this.aprovada = true;
                this.desafiado = l1;
                this.desafiante = l2;
            }else {
                this.aprovada = false;
                this.desafiado = null;
                this.desafiante = null;
            }
        }
        public void lutar(){
            if (this.aprovada){
                System.out.println("##DESAFIADO##");
                this.desafiado.apresentar();
                System.out.println("##DESAFIANTE##");
                this.desafiante.apresentar();

                Random aleatorio = new Random();
                int vencedor = aleatorio.nextInt(3);
                System.out.println("========Resultado========");
                switch (vencedor) {
                    case 0:
                        System.out.println("empatou!");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                        break;
                    case 1:
                        System.out.println("a vitoria vai para o" + this.desafiado.getNome());
                        this.desafiado.ganharluta();
                        this.desafiante.perderluta();
                        break;
                    case 2:
                        System.out.println("A vitoria vai para o" + this.desafiante.getNome());
                        this.desafiado.perderluta();
                        this.desafiante.ganharluta();
                        break;


                }
                System.out.println("----------------------------");
            }else {
                System.out.println("ela nâo pode acontecer");
            }
        }

        //metodos especiais


        public lutadores getDesafiado() {
            return desafiado;
        }

        public void setDesafiado(lutadores desafiado) {
            this.desafiado = desafiado;
        }

        public lutadores getDesafiante() {
            return desafiante;
        }

        public void setDesafiante(lutadores desafiante) {
            this.desafiante = desafiante;
        }

        public int getRounds() {
            return rounds;
        }

        public void setRounds(int rounds) {
            this.rounds = rounds;
        }

        public boolean isAprovada() {
            return aprovada;
        }

        public void setAprovada(boolean aprovada) {
            this.aprovada = aprovada;
        }
    }



