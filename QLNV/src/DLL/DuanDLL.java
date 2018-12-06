/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;
import DAL.DuanDAL;
import ENTITY.Duan;
import java.util.ArrayList;
/**
 *
 * @author Huy
 */
public class DuanDLL {
    DuanDAL dal=new DuanDAL();
    public ArrayList<Duan> getByID(int id){
        return dal.getByID(id);
    }
    public ArrayList<Duan> getAll(){
        return dal.getAll();
    }
}
