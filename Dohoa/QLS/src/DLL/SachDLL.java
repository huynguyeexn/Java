/*
 * To change this license header, choose License Headers in Sach Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

/**
 *
 * @author Huy
 */

import DAL.SachDAL;
import ENTITY.Sach;
import java.util.ArrayList;

public class SachDLL {
     SachDAL dal=new SachDAL();
   public boolean getLogin(String u,String p){
        return dal.getLogin(u);
    }
    public ArrayList<Sach> getALL(){
        return dal.getALL();
    }
    public boolean AddData(Sach s){
        return dal.AddData(s);
    }
    public boolean Update(Sach s){
        return dal.UpdateData(s);
    }
    public boolean Delete(Sach s){
        return dal.DeteleData(s);
    }
}
