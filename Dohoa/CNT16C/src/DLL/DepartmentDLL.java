/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;
import DAL.DepartmentDAL;
import Entity.Department;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class DepartmentDLL {
    int depID;
    String DepName;
    public int getDepID(){
        return depID;
    }
    public void setDepID(int depID){
        this.depID=depID;
    }
    public String getDepName(){
        return DepName;
    }
    public void setDepName(String DepName){
        this.DepName=DepName;
    }
    DepartmentDAL dal=new DepartmentDAL();
    public ArrayList<Department> getByID(int id){
        return dal.getByID(id);
    }
    public ArrayList<Department> getAll(){
        return dal.getAll();
    }
    public boolean AddData(Department dep){
        return dal.AddData(dep);
    }
    public boolean Update(Department dep){
        return dal.UpdateData(dep);
    }
}
