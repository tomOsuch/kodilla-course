package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTestSuite {

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

    @ParameterizedTest
    @ValueSource(strings = {"= TRUE;", "= FALSE;", "IS NULL;"})
    public void testUpdateBestsellers(String sqlWhere) throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER = null;";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement.executeUpdate(sqlProcedureCall);
        //Then
        String sqlCheckTable = "SELECT count(*) AS BESTSELLERS_COUNT FROM BOOKS WHERE BESTSELLER " + sqlWhere;
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        Integer bestsellerCount = null;
        if (rs.next()) {
            bestsellerCount = rs.getInt("BESTSELLERS_COUNT");
        }
        if (sqlWhere.equals("= TRUE;")) {
            assertEquals(4, bestsellerCount);
        } else if (sqlWhere.equals("= FALSE;")) {
            assertEquals(6, bestsellerCount);
        } else {
            assertEquals(0, bestsellerCount);
        }
    }
}
