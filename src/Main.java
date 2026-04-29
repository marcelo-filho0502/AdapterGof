public class Main {
    public static void main(String[] args) {
        BibliotecaAnalises bibliotecajson = new XmlParaJsonAdapter();
        BibliotecaAnalises bibliotecabinario = new XmlParaBinarioAdapter();
        FornecedorDados xml = new FornecedorDados();

        System.out.println("=== ANTES (XML) ===");
        System.out.println(xml);

        bibliotecajson.analisar();

        bibliotecabinario.analisar();

    }
}