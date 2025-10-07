import java.util.ArrayList;
import java.util.List;

public class Paciente {

    //declaramos atributos
    private String nome;
    private int idade;
    private List<String> históricoMedico;

    //construtor vazio
    public Paciente(){
        this.históricoMedico = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<String> getHistóricoMedico() {
        return históricoMedico;
    }

    public void setHistóricoMedico(List<String> históricoMedico) {
        this.históricoMedico = históricoMedico;
    }

    public void adicionarHistorico(String registro){
        this.históricoMedico.add(registro);
    }

    public void exibirHistorico(){
        System.out.println("---Histórivo dp Paciente" + this.nome + "---\n");
        for (String historico : this.históricoMedico){
            System.out.println(historico);

        }
    }

}
