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
public class Cliente extends Fisica {
    private int protocoloAtendimento;

    public Cliente(int protocoloAtendimento, EstadoCivil estadoCivil, Genero genero, Date dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(estadoCivil, genero, dataNascimento, id, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    
   
    
    
    
    @Override
    public String toString() {
        return "Dados do Cliente: " +
                
                "\nGenêro: " + super.genero + 
                 "\nID: " + super.id + 
                "\nNome: " + super.nome +
                "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email +
                "\n---------------------------------------\nEndereço:\n" + super.endereco.logradouro +
                "\nNumero: " + super.endereco.numero + 
                "\nComplemento:" + super.endereco.complemento +
                "\nCEP: " + super.endereco.cep +
                "\nCidade:" + super.endereco.cidade +
                "\nUF: " + super.endereco.uf +
                
                "\nProtocolo de Atendimento: " + this.protocoloAtendimento ;
                }
    
    
}
