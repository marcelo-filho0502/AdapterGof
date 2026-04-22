interface InterfaceSistemaRH {
    void processarDadosRH();
}

// Arquivo: AdapterRH.java
public class AdapterRH implements InterfaceSistemaRH {
    private ArquivoOriginal arquivo;

    public AdapterRH(ArquivoOriginal arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public void processarDadosRH() {
        // O Adapter filtra: Nome, CPF e Idade
        System.out.println("--- ENVIANDO PARA RH ---");
        System.out.println("Nome: " + arquivo.nome);
        System.out.println("Documento: " + arquivo.cpf);
        System.out.println("Idade: " + arquivo.idade + " anos");
    }
}