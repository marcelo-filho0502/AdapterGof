interface InterfaceSistemaInternacional {
    void exibirDadosInternacionais();
}

public class AdapterInternacional implements InterfaceSistemaInternacional {
    private ArquivoOriginal arquivo; // ✅ campo

    public AdapterInternacional(ArquivoOriginal arquivo) { // ✅ construtor
        this.arquivo = arquivo;
    }
    @Override
    public void exibirDadosInternacionais() {
        double milhas = arquivo.distanciaMetros / 1609.34;
        double libras = arquivo.pesoKg * 2.20462;
        double fahrenheit = (arquivo.tempCelsius * 9.0 / 5) + 32;

        System.out.println("--- SISTEMA INTERNACIONAL ---");
        System.out.println("Nome: " + arquivo.nome);
        System.out.printf("Distância: %.4f milhas%n", milhas);
        System.out.printf("Peso: %.2f lbs%n", libras);
        System.out.printf("Temperatura: %.1f °F%n", fahrenheit);
    }
}