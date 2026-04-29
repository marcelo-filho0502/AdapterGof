public class XmlParaJsonAdapter implements BibliotecaAnalises {

    private FornecedorDados fornecedor = new FornecedorDados();

    @Override
    public void analisar() {
        String xml = fornecedor.getDados();



        String json = xml
                .replace("<usuario>", "{\"usuario\": \"").replace("</usuario>", "\", ")
                .replace("<senha>",   "\"senha\": \"")   .replace("</senha>",   "\", ")
                .replace("<cor>",     "\"cor\": \"")     .replace("</cor>",     "\"}");

        System.out.println("\n=== DEPOIS (JSON) ===");
        System.out.println(json);

    }
}