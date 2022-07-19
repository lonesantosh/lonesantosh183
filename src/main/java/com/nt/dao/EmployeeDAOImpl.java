package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;

@Component("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private final String GET_EMPS_BY_DESGS = "SELECT EMPID,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeDAOImpl.getEmployeeByDesgs():: DS class Name::" + ds.getClass());
		List<Employee> list = null;					//DS class Name::class com.zaxxer.hikari.HikariDataSource  O/P Result
		try (Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(GET_EMPS_BY_DESGS)) {
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			try (ResultSet rs = ps.executeQuery()) {
				// copy each records of ResultSet obj into list<Employee> obj
				list = new ArrayList();
				while (rs.next()) {
					// copy records of RS to emp obj
					Employee emp = new Employee();
					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setDesg(rs.getString(3));
					emp.setSal(rs.getDouble(4));
					// emp.setDeptno(rs.getInt(5));
					list.add(emp);
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}

}
