package space.jojoh.fc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;

@RestController
public class DbCheckController {

    private final DataSource dataSource;

    public DbCheckController(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @GetMapping("/dbcheck")
    public String checkDbConnection() {
        try (Connection conn = dataSource.getConnection()) {
            if (conn.isValid(2)) {
                return "Database connection works!";
            } else {
                return "Database connection failed!";
            }
        } catch (Exception e) {
            return "Database connection failed: " + e.getMessage();
        }
    }
}


