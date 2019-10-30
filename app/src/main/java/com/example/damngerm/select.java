
package com.example.damngerm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class select{
    private Connection conn=null;
    private PreparedStatement ps=null;

    public int selectptt(){
        conn=null;
        int result,result1=0;
        if(true){
            //获取链接数据库对象
            conn= DBUtils.getConn();
            //MySQL 语句
            String sql="select ptt from game1 where connet=80808080";

            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps= (PreparedStatement) conn.prepareStatement(sql);
                    ResultSet rs= ps.executeQuery(sql);
                    if(rs!=null){
                        while(rs.next()){
                            result=rs.getInt("ptt");
                            result1=result;
                        }
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBUtils.closeAll(conn,ps);//关闭相关操作
        return result1;
    }

    public int selectxws(){
        conn=null;
        int result,result1=0;
        if(true){
            //获取链接数据库对象
            conn= DBUtils.getConn();
            //MySQL 语句
            String sql="select xws from game1 where connet=80808080";

            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps= (PreparedStatement) conn.prepareStatement(sql);
                    ResultSet rs= ps.executeQuery(sql);
                    if(rs!=null){
                        while(rs.next()){
                            result=rs.getInt("xws");
                            result1=result;
                        }
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBUtils.closeAll(conn,ps);//关闭相关操作
        return result1;
    }

    public int selectdjt(){
        conn=null;
        int result,result1=0;
        if(true){
            //获取链接数据库对象
            conn= DBUtils.getConn();
            //MySQL 语句
            String sql="select djt from game1 where connet=80808080";

            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps= (PreparedStatement) conn.prepareStatement(sql);
                    ResultSet rs= ps.executeQuery(sql);
                    if(rs!=null){
                        while(rs.next()){
                            result=rs.getInt("djt");
                            result1=result;
                        }
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBUtils.closeAll(conn,ps);//关闭相关操作
        return result1;
    }

    public int selectpttA(){
        conn=null;
        int result,result1=0;
        if(true){
            //获取链接数据库对象
            conn= DBUtils.getConn();
            //MySQL 语句
            String sql="select pttA from game1 where connet=80808080";

            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps= (PreparedStatement) conn.prepareStatement(sql);
                    ResultSet rs= ps.executeQuery(sql);
                    if(rs!=null){
                        while(rs.next()){
                            result=rs.getInt("pttA");
                            result1=result;
                        }
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBUtils.closeAll(conn,ps);//关闭相关操作
        return result1;
    }
    public int selectpttB(){
        conn=null;
        int result,result1=0;
        if(true){
            //获取链接数据库对象
            conn= DBUtils.getConn();
            //MySQL 语句
            String sql="select pttB from game1 where connet=80808080";

            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps= (PreparedStatement) conn.prepareStatement(sql);
                    ResultSet rs= ps.executeQuery(sql);
                    if(rs!=null){
                        while(rs.next()){
                            result=rs.getInt("pttB");
                            result1=result;
                        }
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBUtils.closeAll(conn,ps);//关闭相关操作
        return result1;
    }
    public int selectpttC(){
        conn=null;
        int result,result1=0;
        if(true){
            //获取链接数据库对象
            conn= DBUtils.getConn();
            //MySQL 语句
            String sql="select pttC from game1 where connet=80808080";

            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps= (PreparedStatement) conn.prepareStatement(sql);
                    ResultSet rs= ps.executeQuery(sql);
                    if(rs!=null){
                        while(rs.next()){
                            result=rs.getInt("pttC");
                            result1=result;
                        }
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBUtils.closeAll(conn,ps);//关闭相关操作
        return result1;
    }
    public int selectpttD(){
        conn=null;
        int result,result1=0;
        if(true){
            //获取链接数据库对象
            conn= DBUtils.getConn();
            //MySQL 语句
            String sql="select pttD from game1 where connet=80808080";

            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps= (PreparedStatement) conn.prepareStatement(sql);
                    ResultSet rs= ps.executeQuery(sql);
                    if(rs!=null){
                        while(rs.next()){
                            result=rs.getInt("pttD");
                            result1=result;
                        }
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBUtils.closeAll(conn,ps);//关闭相关操作
        return result1;
    }

    public int selectxwsA(){
        conn=null;
        int result,result1=0;
        if(true){
            //获取链接数据库对象
            conn= DBUtils.getConn();
            //MySQL 语句
            String sql="select xwsA from game1 where connet=80808080";

            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps= (PreparedStatement) conn.prepareStatement(sql);
                    ResultSet rs= ps.executeQuery(sql);
                    if(rs!=null){
                        while(rs.next()){
                            result=rs.getInt("xwsA");
                            result1=result;
                        }
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBUtils.closeAll(conn,ps);//关闭相关操作
        return result1;
    }
    public int selectxwsB(){
        conn=null;
        int result,result1=0;
        if(true){
            //获取链接数据库对象
            conn= DBUtils.getConn();
            //MySQL 语句
            String sql="select xwsB from game1 where connet=80808080";

            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps= (PreparedStatement) conn.prepareStatement(sql);
                    ResultSet rs= ps.executeQuery(sql);
                    if(rs!=null){
                        while(rs.next()){
                            result=rs.getInt("xwsB");
                            result1=result;
                        }
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBUtils.closeAll(conn,ps);//关闭相关操作
        return result1;
    }
    public int selectxwsC(){
        conn=null;
        int result,result1=0;
        if(true){
            //获取链接数据库对象
            conn= DBUtils.getConn();
            //MySQL 语句
            String sql="select xwsC from game1 where connet=80808080";

            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps= (PreparedStatement) conn.prepareStatement(sql);
                    ResultSet rs= ps.executeQuery(sql);
                    if(rs!=null){
                        while(rs.next()){
                            result=rs.getInt("xwsC");
                            result1=result;
                        }
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBUtils.closeAll(conn,ps);//关闭相关操作
        return result1;
    }
    public int selectxwsD(){
        conn=null;
        int result,result1=0;
        if(true){
            //获取链接数据库对象
            conn= DBUtils.getConn();
            //MySQL 语句
            String sql="select xwsD from game1 where connet=80808080";

            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps= (PreparedStatement) conn.prepareStatement(sql);
                    ResultSet rs= ps.executeQuery(sql);
                    if(rs!=null){
                        while(rs.next()){
                            result=rs.getInt("xwsD");
                            result1=result;
                        }
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBUtils.closeAll(conn,ps);//关闭相关操作
        return result1;
    }

    public int selectdjtA(){
        conn=null;
        int result,result1=0;
        if(true){
            //获取链接数据库对象
            conn= DBUtils.getConn();
            //MySQL 语句
            String sql="select djtA from game1 where connet=80808080";

            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps= (PreparedStatement) conn.prepareStatement(sql);
                    ResultSet rs= ps.executeQuery(sql);
                    if(rs!=null){
                        while(rs.next()){
                            result=rs.getInt("djtA");
                            result1=result;
                        }
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBUtils.closeAll(conn,ps);//关闭相关操作
        return result1;
    }
    public int selectdjtB(){
        conn=null;
        int result,result1=0;
        if(true){
            //获取链接数据库对象
            conn= DBUtils.getConn();
            //MySQL 语句
            String sql="select djtB from game1 where connet=80808080";

            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps= (PreparedStatement) conn.prepareStatement(sql);
                    ResultSet rs= ps.executeQuery(sql);
                    if(rs!=null){
                        while(rs.next()){
                            result=rs.getInt("djtB");
                            result1=result;
                        }
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBUtils.closeAll(conn,ps);//关闭相关操作
        return result1;
    }
    public int selectdjtC(){
        conn=null;
        int result,result1=0;
        if(true){
            //获取链接数据库对象
            conn= DBUtils.getConn();
            //MySQL 语句
            String sql="select djtC from game1 where connet=80808080";

            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps= (PreparedStatement) conn.prepareStatement(sql);
                    ResultSet rs= ps.executeQuery(sql);
                    if(rs!=null){
                        while(rs.next()){
                            result=rs.getInt("djtC");
                            result1=result;
                        }
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBUtils.closeAll(conn,ps);//关闭相关操作
        return result1;
    }
    public int selectdjtD(){
        conn=null;
        int result,result1=0;
        if(true){
            //获取链接数据库对象
            conn= DBUtils.getConn();
            //MySQL 语句
            String sql="select djtD from game1 where connet=80808080";

            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps= (PreparedStatement) conn.prepareStatement(sql);
                    ResultSet rs= ps.executeQuery(sql);
                    if(rs!=null){
                        while(rs.next()){
                            result=rs.getInt("djtD");
                            result1=result;
                        }
                    }

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBUtils.closeAll(conn,ps);//关闭相关操作
        return result1;
    }




    /*public List<User> getUserData(){
        //结果存放集合
        List<User> list=new ArrayList<User>();
        //MySQL 语句
        String sql="select * from user";
        //获取链接数据库对象
        conn= DBOpenHelper.getConn();
        try {
            if(conn!=null&&(!conn.isClosed())){
                ps= (PreparedStatement) conn.prepareStatement(sql);
                if(ps!=null){
                    rs= ps.executeQuery();
                    if(rs!=null){
                        while(rs.next()){
                            User u=new User();
                            u.setId(rs.getString("id"));
                            u.setName(rs.getString("name"));
                            u.setPhone(rs.getString("phone"));
                            u.setContent(rs.getString("content"));
                            u.setState(rs.getString("state"));
                            list.add(u);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DBOpenHelper.closeAll(conn,ps,rs);//关闭相关操作
        return list;
    }*/


}