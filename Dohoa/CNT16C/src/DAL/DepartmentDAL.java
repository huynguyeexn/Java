/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author Admin
 */
import Entity.Department;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DepartmentDAL extends DataAccessHelper{
private final String GET_BY_ID="select * from Department where depID=?";
private final String GET_ALL="select * from Department";

    private final String ADD_DATA="insert into Department(depID,depName)" + "values (?,?,?,?,?,?,?,?)";
    private final String UPDATE_DATA="Update "+ "Department set depID=?,depName=? where depID=?";
    public ArrayList<Department> getByID(int id) {
        ArrayList<Department> objs=new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_BY_ID);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs!=null && rs.next()){
                Department item=new Department();
                item.setDepID(rs.getInt("depID"));
                item.setDepName(rs.getString("DepName"));
                objs.add(item);
            }
            getClose();
        }catch (Exception e){
            e.printStackTrace();
        }
        return objs;
    }
    
    public ArrayList<Department> getAll(){
        ArrayList<Department> objs=new ArrayList<>();
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(GET_ALL);
            ResultSet rs=ps.executeQuery();
            if(rs!=null){
                while(rs.next()){
                    Department item=new Department();
                    item.setDepID(rs.getInt("depID"));
                    item.setDepName(rs.getString("DepName"));
                    objs.add(item);
                }
            }
            getClose();
        }catch (Exception e){
            e.printStackTrace();
        }
        return objs;
    }
public boolean AddData(Department dep){
        boolean check=false;
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(ADD_DATA);
            ps.setInt(1, dep.getDepID());
            ps.setString(2, dep.getDepName());
            int rs=ps.executeUpdate();
            if(rs>0){
                check=true;
            }
            getClose();
        }catch (Exception e){
            e.printStackTrace();
        }
        return check;
    }
    public boolean UpdateData(Department dep){
        boolean check=false;
        try{
            getConnect();
            PreparedStatement ps=con.prepareStatement(UPDATE_DATA);
            ps.setInt(1, dep.getDepID());
            ps.setString(2, dep.getDepName());
            int rs=ps.executeUpdate();
            if(rs>0){
                check=true;
            }
            getClose();
        }catch (Exception e){
            e.printStackTrace();
        }
        return check;
    }
}
