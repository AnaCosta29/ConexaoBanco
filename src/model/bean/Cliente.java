/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Usuario
 */
public class Cliente {
     private String nome;
     private int codigo_funcionario;
     private String data;
     private int telefone;
     private int celular;
     private String email;
     private String  cpf;
     private String sexo;
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo_funcionario() {
        return codigo_funcionario;
    }

    public void setCodigo_funcionario(int codigo_funcionario) {
        this.codigo_funcionario = codigo_funcionario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   

    @Override
    public String toString() {
        return "Cad_Funcionario{" + "codigo_funcionario=" + codigo_funcionario + '}';
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
   

    
    
}   

