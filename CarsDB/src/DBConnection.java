import javax.swing.*;
import java.sql.*;

public class DBConnection {
    String s = "";

    public String selectDB1() {
        Connection c = null;
        Statement stmt = null;
        StringBuffer st = new StringBuffer();
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "Ilinca2003");

            c.setAutoCommit(false);
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM car_brand;");
            while (rs.next()) {
                String name = rs.getString("brand_name");
                int noEmp = rs.getInt("nb_employees");
                s = "NAME = " + name + ", " + "NO EMPLOYEES = " + noEmp + "\n";
                st.append(s);
            }
            rs.close();
            stmt.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return st.toString();
    }

    public String selectDB2() {
        Connection c = null;
        Statement stmt = null;
        StringBuffer st = new StringBuffer();
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "Ilinca2003");

            c.setAutoCommit(false);
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM car_model;");
            while (rs.next()) {
                String name = rs.getString("model_name");
                String brand = rs.getString("brand_name");
                int year = rs.getInt("car_year");
                String bodyStyle = rs.getString("body_style");
                String price = rs.getString("car_price");
                String warranty = rs.getString("car_warranty");

                s = "NAME = " + name + ", " + "YEAR = " + year + ", " + "BRAND = " + brand + ", " + "BODY STYLE = " + bodyStyle + ", " + "PRICE = " + price + ", " + " WARRANTY = " + warranty + "\n";
                st.append(s);
            }
            rs.close();
            stmt.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return st.toString();
    }

    public String selectDB3() {
        Connection c = null;
        Statement stmt = null;
        StringBuffer st = new StringBuffer();
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "Ilinca2003");

            c.setAutoCommit(false);
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM option;");
            while (rs.next()) {
                int mot = rs.getInt("engine_motorisation(cm3)");
                int pow = rs.getInt("engine_power(hp)");

                s = "MOTORISATION(CM3) = " + mot + ", " + "POWER(HP) = " + pow + "\n";
                st.append(s);
            }
            rs.close();
            stmt.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return st.toString();
    }

    public String selectDB4() {
        Connection c = null;
        Statement stmt = null;
        StringBuffer st = new StringBuffer();
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "Ilinca2003");

            c.setAutoCommit(false);
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM dealer;");
            while (rs.next()) {
                String name = rs.getString("dealer_name");
                String location = rs.getString("dealer_location");
                String address = rs.getString("dealer_address");
                s = "NAME = " + name + "; " + "LOCATION = " + location + "; " + "ADDRESS = " + address + "\n";
                st.append(s);
            }
            rs.close();
            stmt.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return st.toString();
    }

    public String selectDB5() {
        Connection c = null;
        Statement stmt = null;
        StringBuffer st = new StringBuffer();
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "Ilinca2003");

            c.setAutoCommit(false);
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM manufacturer;");
            while (rs.next()) {
                String name = rs.getString("manufacturer_name");
                String location = rs.getString("manufacturer_location");
                s = "NAME = " + name + "; " + "LOCATION = " + location + "\n";
                st.append(s);
            }
            rs.close();
            stmt.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return st.toString();
    }

    public String selectDB6() {
        Connection c = null;
        Statement stmt = null;
        StringBuffer st = new StringBuffer();
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "Ilinca2003");

            c.setAutoCommit(false);
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM inventory;");
            while (rs.next()) {
                int carsStock = rs.getInt("nb_cars_in_stock");
                int carsSold = rs.getInt("nb_sold_cars");
                s = "NO CARS IN STOCK = " + carsStock + "; " + "NO SOLD CARS = " + carsSold + "\n";
                st.append(s);
            }
            rs.close();
            stmt.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return st.toString();
    }

    public String selectDB7() {
        Connection c = null;
        Statement stmt = null;
        StringBuffer st = new StringBuffer();
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "Ilinca2003");

            c.setAutoCommit(false);
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM customer;");
            while (rs.next()) {
                String name = rs.getString("customer_name");
                String address = rs.getString("customer_address");
                String phone = rs.getString("customer_phone");
                String gender = rs.getString("customer_gender");
                Date date = rs.getDate("customer_date_of_birth");
                s = "NAME = " + name + "; " + "ADDRESS = " + address + "; " + "PHONE= " + phone + "; " + "GENDER= " + gender + "; " + "DATE OF BIRTH=" + date + "\n";
                st.append(s);
            }
            rs.close();
            stmt.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return st.toString();
    }

    public void insertDB() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "Ilinca2003");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            PreparedStatement ps = c.prepareStatement
                    ("INSERT INTO car_model VALUES(?,?,?,?,?,?,?)");
            int id = Integer.parseInt(CarDealership.tf1.getText());
            String a = CarDealership.tf2.getText();
            int b = Integer.parseInt(CarDealership.tf3.getText());
            String mm = CarDealership.tf4.getText();
            String d = CarDealership.tf5.getText();
            String e = CarDealership.tf6.getText();
            String f = CarDealership.tf7.getText();
            ps.setInt(1, id);
            ps.setString(2, a);
            ps.setInt(3, b);
            ps.setString(4, d);
            ps.setString(5, mm);
            ps.setString(6, f);
            ps.setString(7, e);
            ps.executeUpdate();
            ps.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }


    public void deleteDB() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Ilinca2003");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            String sql = "DELETE FROM car_model WHERE model_id = ?";
            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(CarDealership.tf1.getText()));
            pstmt.executeUpdate();
            c.commit();
            pstmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }

    public void updateDB(){

                  Connection c = null;
                  try {
                      Class.forName("org.postgresql.Driver");
                      c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Ilinca2003");
                      c.setAutoCommit(false);
                      System.out.println("Opened database successfully");

                      String query = "UPDATE car_model SET model_name = ?,  car_year = ?, brand_name=?, body_style=?, car_price=?, car_warranty=? WHERE model_id = ?";
                      PreparedStatement pst = c.prepareStatement(query);
                      int num= Integer.parseInt(CarDealership.tf1.getText());
                      pst.setInt(1, num);
                      pst.setString(2, CarDealership.tf2.getText());
                      pst.setInt(3, Integer.parseInt(CarDealership.tf3.getText()));
                      pst.setString(4, CarDealership.tf4.getText());
                      pst.setString(5, CarDealership.tf5.getText());
                      pst.setString(6, CarDealership.tf6.getText());
                      pst.setString(7, CarDealership.tf7.getText());
                      pst.executeUpdate();
                      c.commit();
                      pst.close();
                      c.close();
                  } catch ( Exception e ) {
                      System.err.println( e.getClass().getName()+": "+ e.getMessage() );
                      System.exit(0);
                  }
                  System.out.println("Operation done successfully");
              }
}














