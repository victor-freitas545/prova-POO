public class Hopsital {

    public static void main(String[] args) {
        PacienteInternado paciente1 = new PacienteInternado();

        paciente1.adicionarHistorico("Paciente com febre");
        paciente1.adicionarHistorico("Paciente com dor de cabeça");
        paciente1.adicionarHistorico("Paciente em quadro estável");
        paciente1.adicionarHistorico("Paciente pronto para alta");

        paciente1.aumentarDias(50);
        paciente1.aumentarDias(10);

        for (int cont = 1; cont <= 5; cont++){
            if (cont % 2 == 0 ){
                paciente1.adicionarHistorico("Paciente está estável");
            }else {
                paciente1.adicionarHistorico("Paciente está com febre");
            }
        }
        paciente1.mostrarINfo();
    }

}
