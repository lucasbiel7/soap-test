package br.com.unibh.soap.lista.servico.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Lucas Gabriel
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cServicosCalculo", propOrder = {
        "codigo",
        "descricao",
        "calculaPreco",
        "calculaPrazo",
        "erro",
        "msgErro"
})
public class DescricaoServicosCalculo {
    @XmlElement(name = "codigo")
    private String codigo;
    @XmlElement(name = "descricao")
    private String descricao;
    @XmlElement(name = "calcula_preco")
    private String calculaPreco;
    @XmlElement(name = "calcula_prazo")
    private String calculaPrazo;
    @XmlElement(name = "erro")
    private String erro;
    @XmlElement(name = "msgErro")
    private String msgErro;

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCalculaPreco() {
        return this.calculaPreco;
    }

    public void setCalculaPreco(String calculaPreco) {
        this.calculaPreco = calculaPreco;
    }

    public String getCalculaPrazo() {
        return this.calculaPrazo;
    }

    public void setCalculaPrazo(String calculaPrazo) {
        this.calculaPrazo = calculaPrazo;
    }

    public String getErro() {
        return this.erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }

    public String getMsgErro() {
        return this.msgErro;
    }

    public void setMsgErro(String msgErro) {
        this.msgErro = msgErro;
    }
}
