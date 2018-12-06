/*
 * To change this license header, choose License Headers in Tacgia Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

/**
 *
 * @author Huy
 */

import DAL.TacgiaDAL;
import ENTITY.Tacgia;
import java.util.ArrayList;

public class TacgiaDLL {
        TacgiaDAL dal=new TacgiaDAL();
    public ArrayList<Tacgia> getByID(int id){
        return dal.getByID(id);
    }
    public ArrayList<Tacgia> getAll(){
        return dal.getAll();
    }
}
