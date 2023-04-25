package test;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;

public enum Application {
    INSTANCE;
    private DataSource dataSource;

    public DataSource dataSource() {
        if (dataSource == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("root");
            dataSource.setPassword("Barsukov28071992");
            dataSource.setURL("jdbc:postgresql://localhost:5432/postgres");
            this.dataSource = dataSource;
        }
        return dataSource;
    }
}
