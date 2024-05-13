package com.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setSexo("Masculino");
        felipe.setNome("Felipe José");
        felipe.setIdade(15);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos e é do sexo " + felipe.getSexo());
    }
}
