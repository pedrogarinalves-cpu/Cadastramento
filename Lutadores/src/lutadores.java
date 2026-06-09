public class lutadores {
    //atrubutos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int wins;
    private int loses;
    private int draws;

    //constutores
    public lutadores(String no, String naci, int id, float alt, float pes, int win, int los, int dr) {
        this.nome = no;
        this.nacionalidade = naci ;
        this.idade = id;
        this.altura = alt;
        this.setPeso(pes);
        this.wins = win;
        this.loses = los;
        this.draws = dr;

    }



    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String naci) {
        this.nacionalidade = naci;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float alt) {
        this.altura = alt;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pes) {
        this.peso = pes;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        this.categoria = categoria;
        if (peso < 52.5) {
            categoria = "invalida";
        } else if (peso <= 70.5) {
            categoria = "leve";
        } else if (peso <= 83.5) {
            categoria = "medio";
        } else if (peso <= 120.5) {
            categoria = "pesado";
        }else {
            categoria = "invalida";
        }

    }

    public int getWins() {
        return wins;
    }

    public void setWins(int win) {
        this.wins = win;
        setWins(getWins() + 1);
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int los) {
        this.loses = los;
        setLoses(getLoses() + 1);
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int dr) {
        this.draws = dr;
        setDraws(getDraws() + 1);

    }

    //metodos

    public void apresentar(){
        System.out.println("-------------------------");
        System.out.print("Lutador : " + getNome());
        System.out.println("vindo de : " + getNacionalidade());
        System.out.println("pesando : " + getPeso() + "Kg");
        System.out.println(getAltura() + " de largura");
        System.out.println(getIdade() + "anos");
        System.out.println("ganhou :" + getWins());
        System.out.println("perdeu :" + getLoses());
        System.out.println("empatou :" + getDraws());
    }

    public void Status(){
        System.out.println(getNome());
        System.out.println("é um peso " + getCategoria());
        System.out.println(getWins() + "vitoras");
        System.out.println(getLoses() + " derrotas");
        System.out.println(getDraws() + "empates");
    }

    public void ganharluta(){

    }

    public void perderluta(){

    }

    public void empatarLuta(){

    }

}
