package ar.gov.rosario.administracionweb.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class Cuit implements Serializable {
	
	private static final long serialVersionUID = -2005870751914193532L;
	

	private Character cuit00;

	@NotNull(message="{required.cuit.cuit01}")
	private Integer cuit01;

	@NotNull(message="{required.cuit.cuit02}")
	private Integer cuit02;

	@NotNull(message="{required.cuit.cuit03}")
	private Integer cuit03;
	
	public Cuit() {
	
	}
	public Cuit(String cuit) {
		if (!cuit.contains("-")) {
			cuit01 = Integer.valueOf(cuit.substring(0, 2));
			cuit02 = Integer.valueOf(cuit.substring(2, 10));
			cuit03 = Integer.valueOf(cuit.substring(10, 11));
		} else {
			cuit01 = Integer.valueOf(cuit.substring(0, 2));
			cuit02 = Integer.valueOf(cuit.substring(3, 11));
			cuit03 = Integer.valueOf(cuit.substring(12, 13));
		}
	}

	public Cuit(char c, Integer cuit01, Integer cuit02, Integer cuit03) {
		this.cuit00 = c;
		this.cuit01 = cuit01;
		this.cuit02 = cuit02;
		this.cuit03 = cuit03;
	}
	public Character getCuit00() {
		return cuit00;
	}

	public void setCuit00(Character cuit00) {
		this.cuit00 = cuit00;
	}

	public Integer getCuit01() {
		return cuit01;
	}

	public void setCuit01(Integer cuit01) {
		this.cuit01 = cuit01;
	}

	public Integer getCuit02() {
		return cuit02;
	}

	public void setCuit02(Integer cuit02) {
		this.cuit02 = cuit02;
	}

	public Integer getCuit03() {
		return cuit03;
	}

	public void setCuit03(Integer cuit03) {
		this.cuit03 = cuit03;
	}
	
	public String getDisplay() {
		String padding = (cuit02 < 10000000) ? "0" : "";
	
		return cuit01 + "-" + padding + cuit02 +   "-" + cuit03;
	}
	public String getDisplayCompact() {
		//String padding = (cuit02 < 10000000) ? "0" : "";
		String padding = "";
		return cuit01 + padding + cuit02 +   cuit03;
	}
	
	public boolean equals2(Cuit obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuit other = (Cuit) obj;
		
		if (!(cuit01.equals(other.cuit01)))
			return false;
		if (!(cuit02.equals(other.cuit02)))
			return false;
		if (!(cuit03.equals(other.cuit03)))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cuit00 == null) ? 0 : cuit00.hashCode());
		result = prime * result + ((cuit01 == null) ? 0 : cuit01.hashCode());
		result = prime * result + ((cuit02 == null) ? 0 : cuit02.hashCode());
		result = prime * result + ((cuit03 == null) ? 0 : cuit03.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuit other = (Cuit) obj;
		if (cuit00 == null) {
			if (other.cuit00 != null)
				return false;
		} else if (!cuit00.equals(other.cuit00))
			return false;
		if (cuit01 == null) {
			if (other.cuit01 != null)
				return false;
		} else if (!cuit01.equals(other.cuit01))
			return false;
		if (cuit02 == null) {
			if (other.cuit02 != null)
				return false;
		} else if (!cuit02.equals(other.cuit02))
			return false;
		if (cuit03 == null) {
			if (other.cuit03 != null)
				return false;
		} else if (!cuit03.equals(other.cuit03))
			return false;
		return true;
	}
	
	

}
