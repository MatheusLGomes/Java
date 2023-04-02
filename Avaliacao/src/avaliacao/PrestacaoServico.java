/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao;

import java.util.Date;

/**
 *
 * @author User
 */
public class PrestacaoServico extends Juridica{
    private Date contratoInicio;
    private Date contratoFim;

    public Date getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(Date contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public Date getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(Date contratoFim) {
        this.contratoFim = contratoFim;
    }

    public PrestacaoServico(Date contratoInicio, Date contratoFim, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }
}
