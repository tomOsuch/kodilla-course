package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StoredProcTestSuite {

    private static Stream<Arguments> dataSql() {
        return Stream.of(
                Arguments.of(" = TRUE", 4),
                Arguments.of(" = FALSE", 6),
                Arguments.of(" Is NULL", 0)
        );
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

    @ParameterizedTest
    @MethodSource("dataSql")
    public void testUpdateBestsellers2(String query, int resultQuery) throws SQLException {
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
