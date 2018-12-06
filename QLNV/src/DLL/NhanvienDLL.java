/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;
import DAL.NhanvienDAL;
import ENTITY.Nhanvien;
import java.util.ArrayList;
/**
 *
 * @author Huy
 */
public class NhanvienDLL {
    NhanvienDAL dal=new NhanvienDAL();
   public boolean getLogin(String u,String p){
        return dal.getLogin(u);
    }
    public ArrayList<Nhanvien> getALL(){
        return dal.getALL();
    }
    public boolean AddData(Nhanvien s){
        return dal.AddData(s);
    }
    public boolean Update(Nhanvien s){
        return dal.UpdateData(s);
    }
     public boolean Delete(Nhanvien s){
        return dal.DeteleData(s);
    }
}
