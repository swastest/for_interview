import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

 /* public final class Cat4 {

    private static final int jumpsCount = 0;

    private final DataSource dataSource;
    private final String name;

    public Cat4(String name, DataSource dataSource) {
        this.name = name;
        this.dataSource = dataSource;
    }

    public void doJumps(int jumpsCount) {
        for (int i = 0; i < jumpsCount; i++) {
            new Thread(new Runnable() {
                public void run() {

                    doJump();
                
                }
            }).start();
        }
    }

    public void doJump() {
      
        jumpsCount++;
        Logger.getLogger(Cat4.class.getName()).fine("Jump!");
    }

    public void doMeow() {
        Logger.getLogger(Cat4.class.getName()).fine("Meow!");
    }

    public void doQuery(byte[] parameters) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = dataSource.getConnection();
            stmt = conn.createStatement();
            stmt.execute("insert into cats (name) values(" + new String(parameters) + ")");
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
      
    }

    protected int getJumpsCount() {
        int result = jumpsCount;
        jumpsCount = 0;
        return result;
    }

    public void finalize() {
        jumpsCount = 0;
    }

    @Override
    public boolean equals(Object otherCat) {
        if (otherCat == this) {
            return true;
        }
        if (!(otherCat instanceof Cat4)) {
            return false;
        }
        Cat4 cat4 = (Cat4) otherCat;
        return name.equals(cat4.name);
    }

    @Override
    public String toString() {
        try {
            return "Cat4{" +
                "name='" + name + '\'' +
                ", url=" + dataSource.getConnection().getMetaData().getURL() +
                '}';
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}*/
