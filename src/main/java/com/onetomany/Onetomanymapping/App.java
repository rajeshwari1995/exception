package com.onetomany.Onetomanymapping;

import java.util.ArrayList;
import java.util.Collection;

import dao.CompanyDao;
import dto.Company;
import dto.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Company company=new Company();
       //company.setCid(1);
       company.setCname("chegus infotech");
       company.setCaddress(" k r puram bangalore");
       
		Employee e=new Employee();
      e.setName("siri");
       e.setDesignation("java");
       
       Employee e1=new Employee();
       e1.setName("devika");
       e.setDesignation("jsp");
       
       Employee e2=new Employee();
       e2.setName("Bhavya");
       e2.setDesignation("sql");
       
       Employee e3=new Employee();
       e3.setName("Shruthi");
       e3.setDesignation("spring");
       
       Collection<Employee> emp=new ArrayList<Employee>();
       emp.add(e);
       emp.add(e1);
       emp.add(e2);
       emp.add(e3);
       company.setEmployee(emp);
       
       
       CompanyDao cdao=new CompanyDao();
       cdao.create(company);
       
    }
    
}
