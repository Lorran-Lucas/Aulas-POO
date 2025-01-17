import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos;
    private String nome;
    private String codigo;

    public Turma(String nome) {
        this.alunos = new ArrayList<>();
        this.nome = nome;
    }

    public Turma(String nome, String codigo) {
        this.alunos = new ArrayList<>();
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno) {
        int anoAtual = java.time.Year.now().getValue();
        String novoRga = nome + "/" + anoAtual + "-" + aluno.getCpf();
        aluno.matricular(novoRga);
        alunos.add(aluno);
    }

    public void removerAluno(int indice) {
        if (indice >= 0 && indice < alunos.size()) {
            alunos.remove(indice); 
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void removerAluno(Aluno aluno) {
        if (alunos.remove(aluno)) {
            System.out.println("\nAluno " + aluno.getNome() + " removido com sucesso.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void listarAlunos() {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("Posição do ArrayList [" + i + "] " + aluno.getNome() + "/" + aluno.getRga());
            System.out.println("------------------------------------------------------------------------------");
        }
    }

    public void removerTodosAlunos() {
        alunos.clear();
    }

    public boolean estavazia() {
        return alunos.isEmpty();
    }
}