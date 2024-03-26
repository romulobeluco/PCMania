package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

boolean op=true;


Cliente cliente = new Cliente("Romulo",134013551);
       Computador computador1=new Computador("Positivo",3300,"Linux Ubunto",32);
        Computador computador2 = new Computador("Acer", 8800, "Windows 8", 64);
        Computador computador3= new Computador("Vaio",4800,"Windows 10",64);

        computador1.hardwareBasicos[0] = new HardwareBasico("Processor Core i3", 2200);
        computador1.hardwareBasicos[1] = new HardwareBasico("RAM", 8);
        computador1.hardwareBasicos[2] = new HardwareBasico("HD", 500);

        computador2.hardwareBasicos[0] = new HardwareBasico("Processor Core i5", 3370);
        computador2.hardwareBasicos[1] = new HardwareBasico("RAM", 16);
        computador2.hardwareBasicos[2] = new HardwareBasico("HD", 1);

        computador3.hardwareBasicos[0] = new HardwareBasico("Processor Core i7", 4500);
        computador3.hardwareBasicos[1] = new HardwareBasico("RAM", 32);
        computador3.hardwareBasicos[2] = new HardwareBasico("HD", 2);

        MemoriaUSB memoriaUSB1 = new MemoriaUSB("Pen-Drive",16);
        MemoriaUSB memoriaUSB2= new MemoriaUSB("Pen-Drive",32);
        MemoriaUSB memoriaUSB3= new MemoriaUSB("HD externo",1000);


        Scanner sc= new Scanner(System.in);

        while(op)
        {



            System.out.println("Digite o número de qual promeção vai querer");
            System.out.println("Promoção 1 ");
            System.out.println("Marca:Positivo, Preço: R$3300, Pentium Core I3(2200 Mhz), 8Gb de Memoria RAM, 500 Gb de HD, Sistema Operacional Linux Ubuntu(32 bits), Acompanha Pen-drive de 16Gb");
            System.out.println();
            System.out.println("Promoção 2 ");
            System.out.println("Marca:Acer, Preço: R$8800, Pentium Core I5(3370 Mhz), 16Gb de Memoria RAM, 1Tb de HD, Sistema Operacional Windows 8 (64 bits), Acompanha Pen-drive de 32Gb");
            System.out.println();
            System.out.println("Promoção 3 ");
            System.out.println("Marca:Vaio, Preço: R$4800, Pentium Core I7(4500 Mhz), 32Gb de Memoria RAM, 2Tb de HD, Sistema Operacional Windows 10 (64 bits), Acompanha HD Externo 1Tb");
            System.out.println();
            System.out.println("Digite qual promoção vai querer");
        int x=sc.nextInt();

        switch (x)
            {
                case 1:
                    computador1.addMemoriaUSB(memoriaUSB1);
                    computador1.mostraPCConfigs();
                    break;

                case 2:
                    computador2.addMemoriaUSB(memoriaUSB2);
                    computador2.mostraPCConfigs();
                    break;
                case 3:
                    computador3.addMemoriaUSB(memoriaUSB3);
                    computador3.mostraPCConfigs();
                    break;

                case 0:
                    System.out.println("Saindo do programa");
                    op=false;
                    break;

            }
            System.out.println(cliente.calculaTotalCompra());
        }

    }
}