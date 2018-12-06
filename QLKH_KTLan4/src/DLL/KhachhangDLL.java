/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;
import DAL.KhachhangDAL;
import ENTITY.Khachhang;
import java.util.ArrayList;
/**
 *
 * @author Huy
 */
public class KhachhangDLL {
    KhachhangDAL kh=new KhachhangDAL();
    public boolean getLogin(String u,String p){
        return kh.getLogin(u, p);
    }
    public ArrayList<Khachhang> getALL(){
        return kh.getALL();
    }
    public boolean AddData(Khachhang k){
        return kh.AddData(k);
    }
    public boolean Update(Khachhang k){
        return kh.UpdateData(k);
    }
     public boolean Delete(Khachhang k){
        return kh.DeteleData(k);
    }
}
