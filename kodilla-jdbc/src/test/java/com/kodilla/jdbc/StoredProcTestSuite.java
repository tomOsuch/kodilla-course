package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class StoredProcTestSuite {

    @Parameterized.Parameter(0)
    private String query;
    @Parameterized.Parameter(1)
    private int resultQuery;

    @Parameterized.Parameters(name = "{index}: factorial({0}) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]
                {{" = TRUE", 4}, {" = FALSE", 6}, {" IS NULL", 0}});
    }

    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER = null;";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement.executeUpdate(sqlProcedureCall);

        String sqlCheckTable = "SELECT count(*) AS BESTSELLERS_COUNT FROM BOOKS WHERE BESTSELLER " + query + ";";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        Integer bestsellerCount = null;
        if (rs.next()) {
            bestsellerCount = rs.getInt("BESTSELLERS_COUNT");
        }

        //Then
        assertEquals(resultQuery,bestsellerCount);
    }
}
