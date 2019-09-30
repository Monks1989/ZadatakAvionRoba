package zadaci;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
//import orm.lite.model.*;

public class Zadatak1KreiranjeTabela {
    public static void main(String[] args) {
        ConnectionSource connectionSource = null;
       try {
           connectionSource  = new JdbcConnectionSource("jdbc:sqlite:avionRoba.db");
           connectionSource.close();
       }catch (Exception e) {
           e.printStackTrace();
        }
    }
}
