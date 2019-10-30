package com.example.damngerm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Update {
    private Connection conn=DBUtils.getConn();
    private PreparedStatement ps=null;

    public int updateUserDataptt(int num){
        //conn = null;
        int result=-1;
        if(true){
            //获取链接数据库对象
            //DBUtils.getConn()
            //MySQL 语句
            String sql="update game1 set ptt=? where connet=80808080";
            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, num);//第一个参数state 一定要和上面SQL语句字段顺序一致
                    result=ps.executeUpdate();//返回1 执行成功
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //DBUtils.closeAll(conn,ps);//关闭相关操作
        return result;
    }

    public int updateUserDatadjt(int num){
        //conn = null;
        int result=-1;
        if(true){
            //获取链接数据库对象
            //conn=DBUtils.getConn();
            //MySQL 语句
            String sql="update game1 set djt=? where connet=80808080";
            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, num);//第一个参数state 一定要和上面SQL语句字段顺序一致
                    result=ps.executeUpdate();//返回1 执行成功
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //DBUtils.closeAll(conn,ps);//关闭相关操作
        return result;
    }
    public int updateUserDataxws(int num){
        //conn = null;
        int result=-1;
        if(true){
            //获取链接数据库对象
            //conn=DBUtils.getConn();
            //MySQL 语句
            String sql="update game1 set xws=? where connet=80808080";
            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, num);//第一个参数state 一定要和上面SQL语句字段顺序一致
                    result=ps.executeUpdate();//返回1 执行成功
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //DBUtils.closeAll(conn,ps);//关闭相关操作
        return result;
    }

    public int updateUserDatapttA(int num){
        //conn = null;
        int result=-1;
        if(true){
            //获取链接数据库对象
            //conn=DBUtils.getConn();
            //MySQL 语句
            String sql="update game1 set pttA=? where connet=80808080";
            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, num);//第一个参数state 一定要和上面SQL语句字段顺序一致
                    result=ps.executeUpdate();//返回1 执行成功
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //DBUtils.closeAll(conn,ps);//关闭相关操作
        return result;
    }
    public int updateUserDatapttB(int num){
        //conn = null;
        int result=-1;
        if(true){
            //获取链接数据库对象
            //conn=DBUtils.getConn();
            //MySQL 语句
            String sql="update game1 set pttB=? where connet=80808080";
            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, num);//第一个参数state 一定要和上面SQL语句字段顺序一致
                    result=ps.executeUpdate();//返回1 执行成功
                    System.out.println(result);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //DBUtils.closeAll(conn,ps);//关闭相关操作
        return result;
    }
    public int updateUserDatapttC(int num){
        //conn = null;
        int result=-1;
        if(true){
            //获取链接数据库对象
            //conn=DBUtils.getConn();
            //MySQL 语句
            String sql="update game1 set pttC=? where connet=80808080";
            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, num);//第一个参数state 一定要和上面SQL语句字段顺序一致
                    result=ps.executeUpdate();//返回1 执行成功
                    System.out.println(result);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //DBUtils.closeAll(conn,ps);//关闭相关操作
        return result;
    }
    public int updateUserDatapttD(int num){
        //conn = null;
        int result=-1;
        if(true){
            //获取链接数据库对象
            //conn=DBUtils.getConn();
            //MySQL 语句
            String sql="update game1 set pttD=? where connet=80808080";
            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, num);//第一个参数state 一定要和上面SQL语句字段顺序一致
                    result=ps.executeUpdate();//返回1 执行成功
                    System.out.println(result);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //DBUtils.closeAll(conn,ps);//关闭相关操作
        return result;
    }

    public int updateUserDatadjtA(int num){
        //conn = null;
        int result=-1;
        if(true){
            //获取链接数据库对象
            //conn=DBUtils.getConn();
            //MySQL 语句
            String sql="update game1 set djtA=? where connet=80808080";
            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, num);//第一个参数state 一定要和上面SQL语句字段顺序一致
                    result=ps.executeUpdate();//返回1 执行成功
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //DBUtils.closeAll(conn,ps);//关闭相关操作
        return result;
    }
    public int updateUserDatadjtB(int num){
        //conn = null;
        int result=-1;
        if(true){
            //获取链接数据库对象
            //conn=DBUtils.getConn();
            //MySQL 语句
            String sql="update game1 set djtB=? where connet=80808080";
            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, num);//第一个参数state 一定要和上面SQL语句字段顺序一致
                    result=ps.executeUpdate();//返回1 执行成功
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //DBUtils.closeAll(conn,ps);//关闭相关操作
        return result;
    }
    public int updateUserDatadjtC(int num){
        //conn = null;
        int result=-1;
        if(true){
            //获取链接数据库对象
            //conn=DBUtils.getConn();
            //MySQL 语句
            String sql="update game1 set djtC=? where connet=80808080";
            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, num);//第一个参数state 一定要和上面SQL语句字段顺序一致
                    result=ps.executeUpdate();//返回1 执行成功
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //DBUtils.closeAll(conn,ps);//关闭相关操作
        return result;
    }
    public int updateUserDatadjtD(int num){
        //conn = null;
        int result=-1;
        if(true){
            //获取链接数据库对象
            //conn=DBUtils.getConn();
            //MySQL 语句
            String sql="update game1 set djtD=? where connet=80808080";
            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, num);//第一个参数state 一定要和上面SQL语句字段顺序一致
                    result=ps.executeUpdate();//返回1 执行成功
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //DBUtils.closeAll(conn,ps);//关闭相关操作
        return result;
    }

    public int updateUserDataxwsA(int num){
        //conn = null;
        int result=-1;
        if(true){
            //获取链接数据库对象
            //conn=DBUtils.getConn();
            //MySQL 语句
            String sql="update game1 set xwsA=? where connet=80808080";
            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, num);//第一个参数state 一定要和上面SQL语句字段顺序一致
                    result=ps.executeUpdate();//返回1 执行成功
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //DBUtils.closeAll(conn,ps);//关闭相关操作
        return result;
    }
    public int updateUserDataxwsB(int num){
        //conn = null;
        int result=-1;
        if(true){
            //获取链接数据库对象
            //conn=DBUtils.getConn();
            //MySQL 语句
            String sql="update game1 set xwsB=? where connet=80808080";
            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, num);//第一个参数state 一定要和上面SQL语句字段顺序一致
                    result=ps.executeUpdate();//返回1 执行成功
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //DBUtils.closeAll(conn,ps);//关闭相关操作
        return result;
    }
    public int updateUserDataxwsC(int num){
        //conn = null;
        int result=-1;
        if(true){
            //获取链接数据库对象
            //conn=DBUtils.getConn();
            //MySQL 语句
            String sql="update game1 set xwsC=? where connet=80808080";
            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, num);//第一个参数state 一定要和上面SQL语句字段顺序一致
                    result=ps.executeUpdate();//返回1 执行成功
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //DBUtils.closeAll(conn,ps);//关闭相关操作
        return result;
    }
    public int updateUserDataxwsD(int num){
        //conn = null;
        int result=-1;
        if(true){
            //获取链接数据库对象
            //conn=DBUtils.getConn();
            //MySQL 语句
            String sql="update game1 set xwsD=? where connet=80808080";
            try {
                boolean closed=conn.isClosed();
                if(conn!=null&&(!closed)){
                    ps = conn.prepareStatement(sql);
                    ps.setInt(1, num);//第一个参数state 一定要和上面SQL语句字段顺序一致
                    result=ps.executeUpdate();//返回1 执行成功
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //DBUtils.closeAll(conn,ps);//关闭相关操作
        return result;
    }



}
