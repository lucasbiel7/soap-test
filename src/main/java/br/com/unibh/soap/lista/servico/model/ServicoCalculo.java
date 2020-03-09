package br.com.unibh.soap.lista.servico.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


/**
 * @author Lucas Gabriel
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicoCalculo", propOrder = {
        "descricoes"
})
public class ServicoCalculo {

    @XmlElement(name = "cServicosCalculo")
    List<DescricaoServicosCalculo> descricoes;

    public List<DescricaoServicosCalculo> getDescricoes() {
        return this.descricoes;
    }

    public void setDescricoes(List<DescricaoServicosCalculo> descricoes) {
        this.descricoes = descricoes;
    }
}
