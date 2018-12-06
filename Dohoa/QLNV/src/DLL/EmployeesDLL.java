/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

/**
 *
 * @author Huy
 */
import DAL.EmployeesDAL;
import ENTITY.Employees;
import java.util.ArrayList;
public class EmployeesDLL {
        EmployeesDAL dal=new EmployeesDAL();
        public boolean getLogin(String u,String p){
        return dal.getLogin(u, p);
    }
}
