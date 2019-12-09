package com.capgemini.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.springboot.beans.EmpInfoBean;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {
	// private EntityManagerFactory emf =
	// Persistence.createEntityManagerFactory("Test");

	@Autowired // @PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public EmpInfoBean getEmployee(int empId) {
		EntityManager manager = emf.createEntityManager();
		EmpInfoBean empInfoBean = manager.find(EmpInfoBean.class, empId);
		manager.close();

		return empInfoBean;
	}

	@Override
	public EmpInfoBean authenticate(int empId, String password) {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from EmpInfoBean where empId= :empId and password= :password";
		Query query = manager.createQuery(jpql);
		query.setParameter("empId", empId);
		query.setParameter("password", password);
		EmpInfoBean employeeInfoBean = null;
		try {
			employeeInfoBean = (EmpInfoBean) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeInfoBean;

	} // End of Authenticate

	@Override
	public boolean addEmployee(EmpInfoBean employeeInfoBean) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		boolean isAdded = false;
		try {
			tx.begin();
			manager.persist(employeeInfoBean);
			tx.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return isAdded;

	}// End of addEmployee

	@Override
	public boolean updateEmployee(EmpInfoBean employeeInfoBean) {
		EntityManager manager = emf.createEntityManager();
		EmpInfoBean infoBean = manager.find(EmpInfoBean.class, employeeInfoBean.getEmpId());
		boolean isUpdate = false;

		if (infoBean != null) {
			String name = employeeInfoBean.getName();
			if (name != null) {
				infoBean.setName(name);
			}
			if (employeeInfoBean.getGender() != null) {
				infoBean.setGender(employeeInfoBean.getGender());
			}
			int age = employeeInfoBean.getAge();
			if (age > 18) {
				infoBean.setAge(age);
			}
			Double salary = employeeInfoBean.getSalary();
			if (salary > 0) {
				infoBean.setSalary(salary);
			}
			Long mobile = employeeInfoBean.getMobile();
			if (mobile > 0) {
				infoBean.setMobile(mobile);
			}
			String designation = employeeInfoBean.getDesignation();
			if (designation != null) {
				infoBean.setDesignation(designation);
			}
			String gender = employeeInfoBean.getGender();
			if (gender == "M" || gender == "F" || gender == "m" || gender == "f") {
				infoBean.setGender(gender);
			}
			String password = employeeInfoBean.getPassword();
			if (password != null) {
				infoBean.setPassword(password);
			}
			try {
				EntityTransaction tx = manager.getTransaction();
				tx.begin();
				manager.persist(infoBean);
				tx.commit();
				isUpdate = true;

			} catch (Exception e) {
				e.printStackTrace();
			}
			manager.close();
		}
		return isUpdate;

	}

	@Override
	public boolean deleteEmployee(int empId) {
		// EntityManagerFactory entityManagerFactory =
		// Persistence.createEntityManagerFactory("employeePersistenceUnit");
		EntityManager entityManager = emf.createEntityManager();
		boolean isDeleted = false;

		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			EmpInfoBean employeeInfoBean = entityManager.find(EmpInfoBean.class, empId);
			entityManager.remove(employeeInfoBean);
			tx.commit();
			isDeleted = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		entityManager.close();
		return isDeleted;
	}// End of deleteEmployee()

	@Override
	public List<EmpInfoBean> getAllEmployees() {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from EmpInfoBean";
		Query query = manager.createQuery(jpql);

		List<EmpInfoBean> employeesList = null;
		try {
			employeesList = query.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeesList;

	}// End of getAllEmployees()

}// end of class
