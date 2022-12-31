package dto;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="tableComp")
public class Company implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
private Integer cid;
private String cname;
private String caddress;

@OneToMany(cascade=CascadeType.ALL)
private Collection <Employee> employee;

public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCaddress() {
	return caddress;
}
public void setCaddress(String caddress) {
	this.caddress = caddress;
}
public Collection<Employee> getEmployee() {
	return employee;
}
public void setEmployee(Collection<Employee> employee) {
	this.employee = employee;
}


}
