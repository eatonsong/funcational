package com.test.db;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mchange.v2.c3p0.ComboPooledDataSource;



public class JdbcUtils_C3P0 {

    private static ComboPooledDataSource ds = null;

    static{
        try{
            ds = new ComboPooledDataSource();
            FileInputStream in = new FileInputStream(new File("src/main/resources/jdbc.properties"));
            Properties prop = new Properties();
            prop.load(in);
            String driverClass = prop.getProperty("driverClass");
            String jdbcUrl = prop.getProperty("jdbcUrl");
            String user = prop.getProperty("user");
            String password = prop.getProperty("password");



            ds.setDriverClass(driverClass);
            ds.setJdbcUrl(jdbcUrl);
            ds.setUser(user);
            ds.setPassword(password);

        }catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static Connection getConnection() throws SQLException{
        return ds.getConnection();
    }

    public static void close(Connection conn,PreparedStatement pstmt,ResultSet rs) {
        if(rs!=null) {
            try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            rs = null;
        }
        if(pstmt!=null){
            try {
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            pstmt = null;
        }

        if(conn!=null) {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            conn = null;
        }
    }
}

