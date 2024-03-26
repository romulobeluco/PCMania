package org.example;

public class Cliente {
    String nome;
    long cpf;

    Computador[] computador = new Computador[3];
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public float calculaTotalCompra() {
        float total = 0;

        for (int i = 0; i < computador.length; i++) {
            if (computador[i] != null) {
                total = total + computador[i].preco;
            }
            break;
        }
    return total;

    }





}
