public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[]  l = new Livro[3];
        p[0] = new Pessoa("Bob", 42, "M");
        p[1] = new  Pessoa("Siris", 15, "F");

        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, 0, p[0]);
        l[1] = new Livro("POO para iniciantes", "Soraya Montenegro", 100, 0, p[1]);
        l[2] = new Livro("Java Avançado", "Sebastião Alves", 122, 0, p[0] );


        l[0].abrir();
        System.out.println(l[0].toString());
    }

}
