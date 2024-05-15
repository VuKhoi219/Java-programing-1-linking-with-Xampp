import java.sql.*;

public class ConnectSQL {
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";
    public ConnectSQL() {
        try(Connection connectSQL =  DriverManager.getConnection(url,user,password)) {
            System.out.println("Connected");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void show(PostList postList){
        String sql = "select * from <tên bảng>";
        try(Connection connection = DriverManager.getConnection(url,user,password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                System.out.println("ID"+resultSet.getString(1));
                System.out.println("Article title"+resultSet.getString(2));
                System.out.println("Describe"+resultSet.getString(3));
                System.out.println("Avatar"+resultSet.getString(4));
                System.out.println("writer"+resultSet.getString(5));
                System.out.println("Day of birth"+resultSet.getString(6));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void Search(long id) {
        String sql = "select * from <tên bảng> where id = ?";
        try (Connection connection = DriverManager.getConnection(url,user,password)) {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                System.out.println("ID"+resultSet.getString(1));
                System.out.println("Article title"+resultSet.getString(2));
                System.out.println("Describe"+resultSet.getString(3));
                System.out.println("Avatar"+resultSet.getString(4));
                System.out.println("writer"+resultSet.getString(5));
                System.out.println("Day of birth"+resultSet.getString(6));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void insert(PostList postList){
        PreparedStatement statement = null;
        try(Connection connection= DriverManager.getConnection(url,user,password)) {
            String sql = "INSERT INTO <Tên bảng> Values(?, ?, ?, ?, ?, ?, ?, ?, ?)>";
            statement = connection.prepareStatement(sql);

            statement.setLong(1, postList.getId());
            statement.setString(2, postList.getArticleTitle());
            statement.setString(3, postList.getDescribe());
            statement.setString(4, postList.getAvatar());
            statement.setString(5, postList.getWriter());
            statement.setString(6,postList.getDateofwriting());
            System.out.println("Save");        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void delete(long id){
        PreparedStatement statement = null;
        try(Connection connection= DriverManager.getConnection(url,user,password)) {
            String sql = "DELETE FROM <Tên bảng> WHERE id=?";
            statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            statement.executeUpdate();
            System.out.println("Save");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
