public class PacienteInternado extends Paciente {

    private int numeroLeito;
    private int diasINternacao;

    public PacienteInternado(){

    }

    public PacienteInternado(int numeroLeito, int diasINternacao) {
        this.numeroLeito = numeroLeito;
        this.diasINternacao = diasINternacao;
    }

    public int getNumeroLeito() {
        return numeroLeito;
    }

    public void setNumeroLeito(int numeroLeito) {
        this.numeroLeito = numeroLeito;
    }

    public int getDiasINternacao() {
        return diasINternacao;
    }

    public void setDiasINternacao(int diasINternacao) {
        this.diasINternacao = diasINternacao;
    }
    public void aumentarDias(int dias){
        int totalDias = this.diasINternacao + dias;
        if (totalDias > 30){
            System.out.println("Paciente já possui " + this.diasINternacao + "dias de internação!");
        }else {
            this.diasINternacao = totalDias;
            System.out.println(dias + "dias forma adicionados na internação!");
        }
    }
    public  void mostrarINfo(){
        System.out.println("Dados gerais do Paciente \n");
        System.out.println("Nome " + this.getNome());
        System.out.println("Idade  " + this.getIdade());
        System.out.println("Leito " + this.numeroLeito);
        this.exibirHistorico();
    }

}
