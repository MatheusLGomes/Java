/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Medico extends Funcionario {

    private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, EstadoCivil estadoCivil, Genero genero, Date dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, estadoCivil, genero, dataNascimento, id, nome, telefone, email, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return " Dados do(a) Medico(a): "
                + "\nCPF: " + super.cpf
                + "\nRG: " + super.rg
                + "\nMatricula: " + super.matricula
                + "\nSetor: " + super.setor
                + "\nSalario: " + super.salario
                + "\nGênero: " + super.genero
                + "\nCRM: " + this.crm
                + "\nID: " + super.id
                + "\nNome: " + super.nome
                + "\nTelefone: " + super.telefone
                + "\nEmail: " + super.email
                + "\n---------------------------------------\nEndereço:\n" + super.endereco.logradouro
                + "\nNumero: " + super.endereco.numero
                + "\nComplemento:" + super.endereco.complemento
                + "\nCEP: " + super.endereco.cep
                + "\nCidade:" + super.endereco.cidade
                + "\nUF: " + super.endereco.uf
                + "\n.........................";
    }

}
