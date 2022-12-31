package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Company;
import dto.Employee;

public class CompanyDao {
Configuration cfg=new Configuration().configure();

public void create(Company company)
{
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(company);
	
	for(Employee x:company.getEmployee())
	{
		x.setCompany(company);
		session.save(x);
	}
	tx.commit();
}


}
