package ar.gov.rosario.administracionweb.core;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.gov.rosario.administracionweb.dao.EstructuraTipoDAO;
import ar.gov.rosario.administracionweb.model.EstructuraTipo;

@Service("estructuraTipoManager")
public class EstructuraTipoManager extends AbmManager<EstructuraTipo, Integer> {
	
	public EstructuraTipoDAO getDao() {
		return (EstructuraTipoDAO)super.getDao();
	}
	
	@Autowired
	public void setDao(EstructuraTipoDAO dao) {
		super.setDao(dao);
	}
	
	public List<EstructuraTipo> selectAll() {
		return this.getDao().findAllOrderByDescripcion();
	}
	
	public void save(EstructuraTipo e, String usuario) {
		e.setUsuario(usuario);
		e.setFechaHora(new Timestamp((new Date()).getTime()));
		this.save(e);
	}

	public boolean datosRelacionados(EstructuraTipo e) {
		return this.getDao().registrosRelacionados(e);
	}
}
