interface InterfaceSistemaEngenharia {
    void exibirDadosTecnicos();
}


public class AdapterEngenharia implements InterfaceSistemaEngenharia {
    private ArquivoOriginal arquivo;

    public AdapterEngenharia(ArquivoOriginal arquivo) {
        this.arquivo = arquivo;
    }

    public void exibirDadosTecnicos() {
        System.out.println("--- SISTEMA ENGENHARIA ---");
        System.out.println("Nome: " + arquivo.nome);
        System.out.println("Distância: " + (arquivo.distanciaMetros * 100) + " cm");
        System.out.println("Distância: " + (arquivo.distanciaMetros / 1000) + " km");
        System.out.println("Peso: " + arquivo.pesoKg + " kg");
        System.out.println("Temperatura: " + arquivo.tempCelsius + " °C");
    }
}
