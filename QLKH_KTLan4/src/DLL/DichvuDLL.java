/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;
import DAL.DichvuDAL;
import ENTITY.Dichvu;
import java.util.ArrayList;
/**
 *
 * @author Huy
 */
public class DichvuDLL {
    DichvuDAL dal=new DichvuDAL();
    public ArrayList<Dichvu> getByID(int id){
        return dal.getByID(id);
    }
    public ArrayList<Dichvu> getAll(){
        return dal.getAll();
    }
//    public boolean AddData(DichvuDAL dep){
//        return dal.AddData(dep);
//    }
//    public boolean Update(DichvuDAL dep){
//        return dal.UpdateData(dep);
//    }
}
