public class Main {
    public static void main(String[] args) {

        ArquivoOriginal meuArquivo = new ArquivoOriginal();

        InterfaceSistemaRH rh = new AdapterRH(meuArquivo);
        rh.processarDadosRH();

        System.out.println();

        InterfaceSistemaMarketing mkt = new AdapterMarketing(meuArquivo);
        mkt.publicarConteudo();
    }
}