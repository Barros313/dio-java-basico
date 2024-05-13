package com.lanchonete;

import com.lanchonete.area.atendimento.Atendente;
import com.lanchonete.area.cliente.Cliente;

public class Estabelecimento {
    public static void main(String[] args) {

        Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();


        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

    }
}