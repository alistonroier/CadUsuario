package br.edu.atitus.pooavancado.CadUsuario.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "departamento")
public class Departamento extends GenericEntity{
	
		private static final long serialVersionUID = 1L;
		
		private String email;
		@Column(nullable = false)
		private Integer ramal;
		
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Integer getRamal() {
			return ramal;
		}
		public void setRamal(Integer ramal) {
			this.ramal = ramal;
		}
		
		

}
