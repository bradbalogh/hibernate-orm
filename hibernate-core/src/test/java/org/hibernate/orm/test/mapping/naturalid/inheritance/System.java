package org.hibernate.orm.test.mapping.naturalid.inheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Steve Ebersole
 */
@Entity
@Table( name = "GK_SYSTEM" )
public class System extends Principal {
	private String code;

	public System() {
	}

	public System(String uid) {
		super( uid );
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
