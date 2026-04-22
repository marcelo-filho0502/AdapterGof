interface InterfaceSistemaMarketing {
    void publicarConteudo();
}

public class AdapterMarketing implements InterfaceSistemaMarketing {
    private ArquivoOriginal arquivo;

    public AdapterMarketing(ArquivoOriginal arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public void publicarConteudo() {
        System.out.println("--- PUBLICANDO NO MARKETING ---");
        System.out.println("Nome: " + arquivo.nome);
        System.out.println("Sexo: " + arquivo.sexo);
        System.out.println("Região: " + arquivo.cidade);
    }
}