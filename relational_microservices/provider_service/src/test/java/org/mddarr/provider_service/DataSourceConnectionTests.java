package org.mddarr.provider_service;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
//

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {RelationalProviderServiceApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)

public class DataSourceConnectionTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void test1() throws SQLException {
        Connection connection1 = dataSource.getConnection();
        Connection connection2 = dataSource.getConnection();
        connection1.close();
        Connection connection3 = dataSource.getConnection();
    }


}
