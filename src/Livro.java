public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas,  int pagAtual, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.leitor = leitor;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public  void abrir(){
        this.aberto = true;
    }

    public  void fechar(){
        this.aberto = false;
    }

    public  void folhear(int p){
        if (this.aberto == true && (p < this.totPaginas)) {
            this.totPaginas = p;
        }else {
            this.totPaginas = 0;
        }
    }

    public  void avancarPag(){
        this.pagAtual++;
    }
    public  void voltarPag(){
        this.pagAtual--;
    }

    @Override
    public String toString() {
        return "Livro | " +
                "totPaginas = " + totPaginas +
                ", pagAtual = " + pagAtual +
                ", aberto = " + aberto +
                ", autor = '" + autor + '\'' +
                ", titulo = '" + titulo + '\'' +
                ", leitor = " +  leitor.getNome() +
                ", idade = " + leitor.getIdade() +
                ", sexo = " + leitor.getSexo();
    }
}
