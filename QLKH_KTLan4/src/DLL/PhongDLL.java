/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;
import DAL.PhongDAL;
import ENTITY.Phong ;
import java.util.ArrayList;

/**
 *
 * @author Huy
 */
public class PhongDLL {
    PhongDAL dal=new PhongDAL();
    public ArrayList<Phong> getByID(int id){
        return dal.getByID(id);
    }
    public ArrayList<Phong> getAll(){
        return dal.getAll();
    }
//    public boolean AddData(DichvuDAL dep){
//        return dal.AddData(dep);
//    }
//    public boolean Update(DichvuDAL dep){
//        return dal.UpdateData(dep);
//    }
}
