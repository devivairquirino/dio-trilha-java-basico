public enum Cores {
    AMARELO(0,"Amarelo"),
    VERMELHO(1,"Vermelho"),
    AZUL(2,"Azul");

    private int codigo;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Cores(int codigo, String nome){
        this.codigo= codigo;
        this.nome= nome;
    }
}
