package hibernate1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "etab")

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private int eid;
	
	@Getter
	@Setter
	private String ename;
	
	@Getter
	@Setter
	private String empAddr;
	
	@Getter
	@Setter
	private String projs;
	
	@Getter
	@Setter
	
	private String pcode;
	
	public Employee(String ename,String empAddr,String projs,String pcode) {
		this.ename = ename;
		this.empAddr = empAddr;
		this.projs = projs;
		this.pcode = pcode;
	}
}
