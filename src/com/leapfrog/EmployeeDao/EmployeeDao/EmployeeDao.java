/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.EmployeeDao.EmployeeDao;

import com.leapfrog.Employee.Employee.Employee;

/**
 *
 * @author Toshiba
 */
public interface EmployeeDao {
    
    boolean insert(Employee e);
    boolean delete(int id);
    Employee getById(int id);
    Employee[] getAll();
    
        
        
}
