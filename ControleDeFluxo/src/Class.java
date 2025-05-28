public class Class {
    public static void main(String[] args) {
        Student aluno = new Student("Rhoger",71);
        Student aluno01= new Student();
        // aluno.setNome("Ivair");

        System.out.println(aluno.getNome());

        for(Cores e: Cores.values()){
            System.out.println("\nCode: "+e.getCodigo()+"\nNome: "+e.getNome());
        }
    }
}
