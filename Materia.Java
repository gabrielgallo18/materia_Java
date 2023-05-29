import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nome;
    private boolean ativa;
    private List<String> alunosCadastrados;

    public Materia(String nome) {
        this.nome = nome;
        this.ativa = true;
        this.alunosCadastrados = new ArrayList<>();
    }

    public void desativarMateria() {
        this.ativa = false;
        this.alunosCadastrados.clear(); // Limpar a lista de alunos cadastrados ao desativar a matéria
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getQuantidadeAlunosCadastrados() {
        return alunosCadastrados.size();
    }

    public void cadastrarAluno(String nomeAluno) {
        if (!ativa) {
            System.out.println("A matéria está desativada. Não é possível cadastrar alunos.");
            return;
        }

        alunosCadastrados.add(nomeAluno);
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        Materia matematica = new Materia("Matemática");
        System.out.println("Matéria: " + matematica.getNome());
        System.out.println("Ativa: " + matematica.isAtiva());
        System.out.println("Quantidade de Alunos Cadastrados: " + matematica.getQuantidadeAlunosCadastrados());

        matematica.cadastrarAluno("João");
        matematica.cadastrarAluno("Maria");
        System.out.println("Quantidade de Alunos Cadastrados: " + matematica.getQuantidadeAlunosCadastrados());

        matematica.desativarMateria();
        System.out.println("Matéria: " + matematica.getNome());
        System.out.println("Ativa: " + matematica.isAtiva());
        System.out.println("Quantidade de Alunos Cadastrados: " + matematica.getQuantidadeAlunosCadastrados());

        matematica.cadastrarAluno("Pedro"); // Tentativa de cadastrar aluno em matéria desativada

        Materia portugues = new Materia("Português");
        System.out.println("Matéria: " + portugues.getNome());
        System.out.println("Ativa: " + portugues.isAtiva());
        System.out.println("Quantidade de Alunos Cadastrados: " + portugues.getQuantidadeAlunosCadastrados());

        portugues.cadastrarAluno("Ana");
        System.out.println("Quantidade de Alunos Cadastrados: " + portugues.getQuantidadeAlunosCadastrados());

        Materia historia = new Materia("História");
        System.out.println("Matéria: " + historia.getNome());
        System.out.println("Ativa: " + historia.isAtiva());
        System.out.println("Quantidade de Alunos Cadastrados: " + historia.getQuantidadeAlunosCadastrados());
    }
}
