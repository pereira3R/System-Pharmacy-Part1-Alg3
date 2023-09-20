package com.mycompany.service;

import java.util.ArrayList;
import com.mycompany.products.Produtos;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private double valorTotalCompra;
    ArrayList<Produtos> compras = new ArrayList<Produtos>();

    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.valorTotalCompra = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCPF(String cpf) {
        // Adicione validações de CPF aqui, se necessário
        this.cpf = cpf;
    }

    public String getCPF() {
        return this.cpf;
    }

    public void setTelefone(String telefone) {
        // Adicione validações de telefone aqui, se necessário
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setCompras(Produtos compraCliente) {
        compras.add(compraCliente);
    }

    public ArrayList<Produtos> getCompras() {
        // Retornar uma cópia da lista para evitar modificações externas
        return this.compras;
    }
}
