package org.example;

public class Computador {
    String marca;
    float preco;

    MemoriaUSB memoriaUSB;
    SistemaOperacional sistema;
    HardwareBasico []hardwareBasicos = new HardwareBasico[3];



    public Computador(String marca, float preco,String nomeS,int tipoS) {
        this.marca = marca;
        this.preco = preco;
this.sistema= new SistemaOperacional(nomeS,tipoS);

    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Sistema Operacional: " + sistema.nome + " / " + sistema.tipo + " bits");
        for (HardwareBasico hardware : hardwareBasicos) {
            if (hardware != null) {
                System.out.println("Hardware Básico: " + hardware.nome + " / " + hardware.capacidade);
            }
        }
        if (memoriaUSB != null) {
            System.out.println("Memória USB: " + memoriaUSB.nome + " / " + memoriaUSB.capacidade + " GB");
        }
    }
    void addMemoriaUSB(MemoriaUSB musb)
    {
memoriaUSB=musb;
        System.out.println("Memoria adicionada com sucesso");
    }

}
