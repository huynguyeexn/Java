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

import DAL.TheloaiDAL;
import ENTITY.Theloai;
import java.util.ArrayList;

public class TheloaiDLL {
            TheloaiDAL dal=new TheloaiDAL();
    public ArrayList<Theloai> getByID(int id){
        return dal.getByID(id);
    }
    public ArrayList<Theloai> getAll(){
        return dal.getAll();
    }
}
