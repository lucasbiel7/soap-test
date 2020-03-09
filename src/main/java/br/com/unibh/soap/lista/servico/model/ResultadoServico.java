package br.com.unibh.soap.lista.servico.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Lucas Gabriel
 */
@XmlRootElement(name = "cResultadoServicos")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResultadoServico {
    @XmlElement(name = "ServicosCalculo")
    private ServicoCalculo servicoCalculo;

    public ServicoCalculo getServicoCalculo() {
        return this.servicoCalculo;
    }

    public void setServicoCalculo(ServicoCalculo servicoCalculo) {
        this.servicoCalculo = servicoCalculo;
    }
}
