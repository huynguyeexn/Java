/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

/**
 *
 * @author Admin
 */
import DAL.EmployeesDAL;
import Entity.Employees;
import java.util.ArrayList;
public class EmployeesDLL {
    EmployeesDAL dal=new EmployeesDAL();
    public boolean getLogin(String u,String p){
        return dal.getLogin(u, p);
    }
    public ArrayList<Employees> getALL(){
        return dal.getALL();
    }
    public boolean AddData(Employees emp){
        return dal.AddData(emp);
    }
    public boolean Update(Employees emp){
        return dal.UpdateData(emp);
    }
}
