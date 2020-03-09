package br.com.unibh.soap.lista.servico;

import br.com.unibh.soap.BaseService;
import br.com.unibh.soap.lista.servico.model.ResultadoServico;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;

/**
 * @author Lucas Gabriel
 */
public class ListarServiceService extends BaseService {

    @Override
    protected String getServico() {
        return "http://ws.correios.com.br/calculador/CalcPrecoPrazo.asmx/ListaServicos";
    }


    public ResultadoServico getData() throws IOException, JAXBException {
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet get = new HttpGet(this.getServico());
        HttpResponse response = httpClient.execute(get);
        JAXBContext context = JAXBContext.newInstance(ResultadoServico.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (ResultadoServico) unmarshaller.unmarshal(response.getEntity().getContent());
    }
}
