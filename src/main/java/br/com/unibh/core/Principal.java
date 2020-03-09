package br.com.unibh.core;

import br.com.unibh.soap.lista.servico.ListarServiceService;
import br.com.unibh.soap.lista.servico.model.DescricaoServicosCalculo;
import br.com.unibh.soap.lista.servico.model.ResultadoServico;

import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * @author Lucas Gabriel
 */
public class Principal {
    public static void main(String[] args) throws IOException, JAXBException {
        ListarServiceService listar = new ListarServiceService();
        ResultadoServico resultado = listar.getData();
        for (DescricaoServicosCalculo descricao : resultado.getServicoCalculo().getDescricoes()) {
            System.out.println(String.format("%s: %s", "Código", descricao.getCodigo()));
            System.out.println(String.format("%s: %s", "Descrição", descricao.getDescricao()));
            System.out.println(String.format("%s: %s", "Calcula prazo", descricao.getCalculaPrazo()));
            System.out.println(String.format("%s: %s", "Calcula preço", descricao.getCalculaPreco()));
            System.out.println("------------------------------------------------");
        }
    }
}
