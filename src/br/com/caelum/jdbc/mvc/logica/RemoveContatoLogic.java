package br.com.caelum.jdbc.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class RemoveContatoLogic implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		long id = Long.parseLong(request.getParameter("id"));
		Contato contato = new Contato();
		contato.setId(id);
		ContatoDao dao = new ContatoDao();
		dao.remove(contato);
		System.out.println("Excluindo contato... ");
		return "lista-contatos-scriptlet-jstl.jsp";
	}

}
