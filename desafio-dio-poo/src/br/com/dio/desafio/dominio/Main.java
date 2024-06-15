package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setCargaHoraria(8);
        curso.setDescricao("descrição curso java");
        curso.setTitulo("Curso java");

        System.out.println(curso);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

    }
}