package main;

import org.junit.Assert;
import org.junit.Test;
import utility.Chen;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SuppressWarnings("ALL") public class RegressionTest {

    public static boolean debug = false;


    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        double d1 = OptimizationRelationship.piecewise((-1.0d));
        Assert.assertTrue(d1 == 0.9d);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Training training0 = new Training();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        List<String> list_str0 = Setting.SYNONYM_COUNTRY;
        Assert.assertNotNull(list_str0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Setting setting0 = new Setting();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Accuracy accuracy0 = new Accuracy();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Chen chen2 = null;
        try {
            relationship0.setMediumFeatures(chen2);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        OptimizationRelationship.expectedCount = (byte) 10;
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        double d0 = OptimizationRelationship.expectedCount;
        Assert.assertTrue(d0 == 10.0d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Doppelganger doppelganger0 = new Doppelganger();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        String str0 = Setting.CSV_SEPARATOR;
        Assert.assertTrue("'" + str0 + "' != '" + "," + "'", str0.equals(","));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        List<String> list_str0 = Setting.SYNONYM_PRODUCT;
        Assert.assertNotNull(list_str0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Relationship relationship0 = new Relationship();
        Double d1 = relationship0.getForeignKeyProbability();
        Chen chen2 = null;
        try {
            relationship0.setMediumFeatures(chen2);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        OptimizationRelationship.upperEstimate = (byte) 10;
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Relationship relationship0 = new Relationship();
        Double d1 = relationship0.getForeignKeyProbability();
        Table table2 = null;
        try {
            relationship0.setFkTable(table2);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Table table2 = null;
        try {
            relationship0.setFkTable(table2);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        OptimizationRelationship.lowerEstimate = (short) 0;
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        OptimizationRelationship.upperEstimate = (byte) -1;
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        String str0 = Setting.CSV_QUOTE;
        Assert.assertTrue("'" + str0 + "' != '" + "\"" + "'", str0.equals("\""));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Table table2 = new Table("", ",");
        DatabaseMetaData databaseMetaData3 = null;
        try {
            table2.getPrimaryKeys(databaseMetaData3, ",", "hi!", "");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        Connection connection6 = null;
        try {
            column2.isNotNull(connection6, "", "hi!");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        double d0 = OptimizationRelationship.lowerEstimate;
        Assert.assertTrue(d0 == 0.0d);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Relationship relationship0 = new Relationship();
        Double d1 = relationship0.getForeignKeyProbability();
        Connection connection2 = null;
        try {
            relationship0.setRatioSatisfiedFKConstraint(connection2);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        OptimizationRelationship optimizationRelationship0 = new OptimizationRelationship();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Connection connection0 = null;
        try {
            List<Table> list_table3 = Schema.getPrimaryKeys(connection0, ",.", "\"");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        String str0 = Relationship.getHeader();
        Assert.assertEquals("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_isJunctionTable2,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_suspiciousNullRatio,pk_nullCountAsFirstColumn,pk_previousColumnsAreNotSufficient,pk_isEmptyTable,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_isJunctionTable2,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_suspiciousNullRatio,fk_nullCountAsFirstColumn,fk_previousColumnsAreNotSufficient,fk_isEmptyTable,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,isSpecialization,specializationTightness,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", str0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Optimization optimization0 = new Optimization();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        List<Relationship> list_relationship0 = null;
        try {
            double d1 = Accuracy.getFkPrecision(list_relationship0);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        OptimizationRelationship.upperEstimate = (byte) 1;
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getPkTableName();
        Connection connection3 = null;
        try {
            relationship0.setRatioSatisfiedFKConstraint(connection3);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(str2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        DatabaseMetaData databaseMetaData7 = null;
        try {
            table5.getColumns(databaseMetaData7, "", ",.", ",.");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Scoring scoring0 = new Scoring();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Table table2 = new Table("", ",");
        List<String> list_str3 = table2.getTokenizedLowerCaseTrimmedName();
        DatabaseMetaData databaseMetaData4 = null;
        try {
            table2.getColumns(databaseMetaData4, ",.", ",.", "hi!");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(list_str3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setBestAttemptPk(false);
        double[] d_array7 = null;
        column2.setHistogramBounds(d_array7);
        try {
            column2.setLD("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        relationship0.setForeignKey(false);
        Chen chen6 = null;
        try {
            relationship0.setMediumFeatures(chen6);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        OptimizationRelationship.lowerEstimate = (-1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        String str1 = Table.getHeader("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        DatabaseMetaData databaseMetaData5 = null;
        try {
            table2.getUniqueConstraint(databaseMetaData5, "\"", "\"", ",.");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        TrainingRelationship trainingRelationship0 = new TrainingRelationship();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Table table2 = new Table("", ",");
        try {
            String str5 = table2.toQuery('4', 'a');
            Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (IllegalStateException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Table table2 = new Table("", ",");
        List<String> list_str3 = table2.getTokenizedLowerCaseTrimmedName();
        DatabaseMetaData databaseMetaData4 = null;
        try {
            table2.getColumns(databaseMetaData4, "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", "", ",.");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(list_str3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Schema schema0 = new Schema();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Table table4 = new Table("", ",");
        table4.setTrimmedName("hi!");
        String str7 = table4.getLowerCaseTrimmedName();
        List<Column> list_column8 = table4.getEstimatedPk();
        Column column9 = new Column("", ",", table4);
        DatabaseMetaData databaseMetaData10 = null;
        try {
            table4.getUniqueConstraint(databaseMetaData10, "", ",", "hi!");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(str7);
        Assert.assertNotNull(list_column8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        column2.setEstimatedRowCount(10);
        Connection connection9 = null;
        try {
            column2.isNotNull(connection9, "", "hi!");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        Connection connection7 = null;
        try {
            relationship0.setRatioSatisfiedFKConstraint(connection7);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.toString();
        Connection connection3 = null;
        try {
            relationship0.setSlowFeatures(connection3);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertTrue("'" + str2 + "' != '" + "null --> null" + "'", str2.equals("null --> null"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        String str0 = Table.getHeader();
        Assert.assertEquals("schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,isJunctionTable2,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,suspiciousNullRatio,nullCountAsFirstColumn,previousColumnsAreNotSufficient,isEmptyTable,isPrimaryKey", str0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Stack<Relationship> stack_relationship0 = null;
        try {
            boolean b1 = OptimizationRelationship.isAcyclic(stack_relationship0);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        OptimizationRelationship.expectedCount = 1L;
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        String str4 = column2.getLongName();
        column2.setUniqueConstraint(true);
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue("'" + str4 + "' != '" + ",." + "'", str4.equals(",."));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Column column4 = new Column(",", "");
        column4.setEstimatedRowCount((int) (byte) 0);
        relationship0.setFk(column4);
        Boolean b8 = column4.isPrimaryKey();
        Assert.assertNull(column1);
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getEstimatedPk();
        DatabaseMetaData databaseMetaData8 = null;
        try {
            table5.getColumns(databaseMetaData8, "\"", "\"", ",");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        String str1 = Table.getHeader("schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        relationship0.setForeignKeyProbability(100.0d);
        Chen chen4 = null;
        try {
            relationship0.setMediumFeatures(chen4);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Column column2 = new Column("null --> null", ",.");
        column2.setColumnSize((int) (byte) 100);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        OptimizationRelationship.expectedCount = (short) -1;
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Connection connection3 = null;
        try {
            relationship0.setRatioSatisfiedFKConstraint(connection3);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(str2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Column column2 = new Column(",", "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        column2.setTextMax("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        column2.setNullable(true);
        int i12 = column2.getDataType();
        Column column15 = new Column(",", "");
        int i16 = column15.getColumnSize();
        String str17 = column15.getLongName();
        boolean b18 = column2.equals(column15);
        column2.setTableColumnCount(100);
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i12 == 0);
        Assert.assertTrue(i16 == 0);
        Assert.assertTrue("'" + str17 + "' != '" + ",." + "'", str17.equals(",."));
        Assert.assertTrue(b18 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        OptimizationRelationship.expectedCount = (-1.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Table table2 = new Table("schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey", "hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Connection connection0 = null;
        try {
            List<Table> list_table3 = Schema.getPrimaryKeys(connection0, "\"", "null --> null");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        relationship0.setForeignKeyProbability(100.0d);
        Boolean b4 = relationship0.getDataTypeCategoryAgree();
        Assert.assertNull(column1);
        Assert.assertNull(b4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = relationship0.isForeignKey();
        Boolean b12 = relationship0.isTheSameColumn();
        Relationship relationship13 = new Relationship();
        Column column14 = relationship13.getPk();
        String str15 = relationship13.getSchema();
        Boolean b16 = relationship13.getDataTypeCategoryAgree();
        Boolean b17 = relationship13.isEstimatedFk();
        Relationship relationship18 = new Relationship();
        String str19 = relationship18.getSchema();
        Boolean b20 = relationship18.isTheSameColumn();
        Relationship relationship21 = new Relationship();
        Column column22 = relationship21.getPk();
        Boolean b23 = relationship21.getDataTypeCategoryAgree();
        Table table26 = new Table("", ",");
        relationship21.setPkTable(table26);
        Relationship relationship28 = new Relationship();
        Column column29 = relationship28.getPk();
        String str30 = relationship28.toString();
        Relationship relationship31 = new Relationship();
        Column column32 = relationship31.getPk();
        String str33 = relationship31.getSchema();
        Boolean b34 = relationship31.getDataTypeCategoryAgree();
        String str35 = relationship31.getFkTableName();
        Relationship relationship36 = new Relationship();
        Column column37 = relationship36.getPk();
        String str38 = relationship36.getSchema();
        Relationship relationship39 = new Relationship();
        Column column40 = relationship39.getPk();
        String str41 = relationship39.getSchema();
        Boolean b42 = relationship39.getDataTypeCategoryAgree();
        Column column45 = new Column(",", "");
        column45.setEstimatedRowCount((int) (byte) 0);
        Boolean b48 = column45.isBestAttemptPk();
        relationship39.setPk(column45);
        Boolean b50 = relationship39.isForeignKey();
        Boolean b51 = relationship39.isTheSameColumn();
        Relationship relationship52 = new Relationship();
        Column column53 = relationship52.getPk();
        Boolean b54 = relationship52.getDataTypeCategoryAgree();
        Boolean b55 = relationship52.isForeignKey();
        Column column58 = new Column(",", "");
        int i59 = column58.getColumnSize();
        int i60 = column58.getDataType();
        int i61 = column58.getDecimalDigits();
        column58.setHasMultiplePK(true);
        Boolean b64 = column58.isBestAttemptPk();
        Relationship relationship65 = new Relationship();
        Column column66 = relationship65.getPk();
        Boolean b67 = relationship65.getDataTypeCategoryAgree();
        Table table70 = new Table("", ",");
        relationship65.setPkTable(table70);
        column58.setDoppelganger(table70);
        relationship52.setFkTable(table70);
        Relationship relationship74 = new Relationship();
        Double d75 = relationship74.getForeignKeyProbability();
        Relationship[] relationship_array76 = new Relationship[] { relationship0, relationship13, relationship18, relationship21, relationship28, relationship31, relationship36, relationship39, relationship52, relationship74 };
        ArrayList<Relationship> arraylist_relationship77 = new ArrayList<Relationship>();
        boolean b78 = Collections.addAll(arraylist_relationship77, relationship_array76);
        Table[] table_array79 = new Table[] {};
        ArrayList<Table> arraylist_table80 = new ArrayList<Table>();
        boolean b81 = Collections.addAll(arraylist_table80, table_array79);
        List<Table> list_table82 = Optimization.optimize(arraylist_table80);
        Connection connection83 = null;
        List<Table> list_table85 = Schema.getExpensiveFeatures(arraylist_table80, connection83, "");
        List<Table> list_table86 = Optimization.optimize(arraylist_table80);
        try {
            int i87 = OptimizationRelationship.optimize(arraylist_relationship77, list_table86);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        Assert.assertNull(b12);
        Assert.assertNull(column14);
        Assert.assertNull(str15);
        Assert.assertNull(b16);
        Assert.assertTrue("'" + b17 + "' != '" + false + "'", b17.equals(false));
        Assert.assertNull(str19);
        Assert.assertNull(b20);
        Assert.assertNull(column22);
        Assert.assertNull(b23);
        Assert.assertNull(column29);
        Assert.assertTrue("'" + str30 + "' != '" + "null --> null" + "'", str30.equals("null --> null"));
        Assert.assertNull(column32);
        Assert.assertNull(str33);
        Assert.assertNull(b34);
        Assert.assertNull(str35);
        Assert.assertNull(column37);
        Assert.assertNull(str38);
        Assert.assertNull(column40);
        Assert.assertNull(str41);
        Assert.assertNull(b42);
        Assert.assertTrue("'" + b48 + "' != '" + false + "'", b48.equals(false));
        Assert.assertTrue("'" + b50 + "' != '" + false + "'", b50.equals(false));
        Assert.assertNull(b51);
        Assert.assertNull(column53);
        Assert.assertNull(b54);
        Assert.assertTrue("'" + b55 + "' != '" + false + "'", b55.equals(false));
        Assert.assertTrue(i59 == 0);
        Assert.assertTrue(i60 == 0);
        Assert.assertTrue(i61 == 0);
        Assert.assertTrue("'" + b64 + "' != '" + false + "'", b64.equals(false));
        Assert.assertNull(column66);
        Assert.assertNull(b67);
        Assert.assertTrue("'" + d75 + "' != '" + 0.0d + "'", d75.equals(0.0d));
        Assert.assertNotNull(relationship_array76);
        Assert.assertTrue(b78 == true);
        Assert.assertNotNull(table_array79);
        Assert.assertTrue(b81 == false);
        Assert.assertNotNull(list_table82);
        Assert.assertNotNull(list_table85);
        Assert.assertNotNull(list_table86);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Column column2 = new Column(",", "");
        column2.setUniqueRatio(Double.NaN);
        column2.setTrimmedName(",.");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = column6.isBestAttemptPk();
        column6.setUniqueConstraint(false);
        Boolean b14 = column6.isDoppelganger();
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        Assert.assertTrue("'" + b14 + "' != '" + false + "'", b14.equals(false));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        column2.setTextMax("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        column2.setNullable(true);
        int i12 = column2.getDataType();
        Column column15 = new Column(",", "");
        int i16 = column15.getColumnSize();
        String str17 = column15.getLongName();
        boolean b18 = column2.equals(column15);
        Connection connection19 = null;
        try {
            column2.isUnique(connection19, "", "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i12 == 0);
        Assert.assertTrue(i16 == 0);
        Assert.assertTrue("'" + str17 + "' != '" + ",." + "'", str17.equals(",."));
        Assert.assertTrue(b18 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Table table2 = new Table(",", ",");
        DatabaseMetaData databaseMetaData3 = null;
        try {
            table2.getPrimaryKeys(databaseMetaData3, ",", "", "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        Table[] table_array6 = new Table[] {};
        ArrayList<Table> arraylist_table7 = new ArrayList<Table>();
        boolean b8 = Collections.addAll(arraylist_table7, table_array6);
        List<Table> list_table9 = Optimization.optimize(arraylist_table7);
        Connection connection10 = null;
        List<Table> list_table12 = Schema.getExpensiveFeatures(arraylist_table7, connection10, "");
        table2.isJunctionTable(list_table12);
        List<Table> list_table14 = Optimization.optimize(list_table12);
        double d15 = Accuracy.getPkRecall(list_table12);
        Assert.assertNull(str5);
        Assert.assertNotNull(table_array6);
        Assert.assertTrue(b8 == false);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table12);
        Assert.assertNotNull(list_table14);
        Assert.assertEquals(d15, Double.NaN, 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Table table2 = new Table(",", ",");
        List<Column> list_column3 = table2.getBestAttemptPk();
        String str4 = table2.toProbability();
        try {
            String str7 = table2.toQuery('#', 'a');
            Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (IllegalStateException e) {
        }
        Assert.assertNotNull(list_column3);
        Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Table table2 = new Table("", ",");
        List<String> list_str3 = table2.getTokenizedLowerCaseTrimmedName();
        table2.setColumnTokenWeight();
        DatabaseMetaData databaseMetaData5 = null;
        try {
            table2.getUniqueConstraint(databaseMetaData5, "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey", ",", "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(list_str3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Relationship relationship3 = new Relationship();
        Column column4 = relationship3.getPk();
        Boolean b5 = relationship3.getDataTypeCategoryAgree();
        Table table8 = new Table("", ",");
        relationship3.setPkTable(table8);
        String str10 = relationship3.getSchema();
        Relationship relationship11 = new Relationship();
        Column column12 = relationship11.getPk();
        Boolean b13 = relationship11.getDataTypeCategoryAgree();
        Table table16 = new Table("", ",");
        relationship11.setPkTable(table16);
        String str18 = relationship11.getFkTableName();
        relationship11.setForeignKey(true);
        Relationship relationship21 = new Relationship();
        Double d22 = relationship21.getForeignKeyProbability();
        Table table25 = new Table("", ",");
        table25.setTrimmedName("hi!");
        String str28 = table25.getLowerCaseTrimmedName();
        String str29 = table25.toProbability();
        String str30 = table25.toFeature();
        relationship21.setFkTable(table25);
        String str32 = relationship21.getPkTableName();
        Relationship relationship33 = new Relationship();
        Column column34 = relationship33.getPk();
        String str35 = relationship33.getSchema();
        Boolean b36 = relationship33.getDataTypeCategoryAgree();
        Column column39 = new Column(",", "");
        column39.setEstimatedRowCount((int) (byte) 0);
        Boolean b42 = column39.isBestAttemptPk();
        relationship33.setPk(column39);
        Boolean b44 = relationship33.isForeignKey();
        Relationship[] relationship_array45 = new Relationship[] { relationship0, relationship3, relationship11, relationship21, relationship33 };
        ArrayList<Relationship> arraylist_relationship46 = new ArrayList<Relationship>();
        boolean b47 = Collections.addAll(arraylist_relationship46, relationship_array45);
        Table[] table_array48 = new Table[] {};
        ArrayList<Table> arraylist_table49 = new ArrayList<Table>();
        boolean b50 = Collections.addAll(arraylist_table49, table_array48);
        List<Table> list_table51 = Optimization.optimize(arraylist_table49);
        Connection connection52 = null;
        List<Table> list_table54 = Schema.getExpensiveFeatures(arraylist_table49, connection52, "");
        List<Table> list_table55 = Optimization.optimize(arraylist_table49);
        Connection connection56 = null;
        List<Table> list_table58 = Schema.getExpensiveFeatures(list_table55, connection56, ",");
        Connection connection59 = null;
        List<Table> list_table61 = Schema.getExpensiveFeatures(list_table58, connection59, "null --> null");
        try {
            int i62 = OptimizationRelationship.optimize(arraylist_relationship46, list_table58);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(column4);
        Assert.assertNull(b5);
        Assert.assertNull(str10);
        Assert.assertNull(column12);
        Assert.assertNull(b13);
        Assert.assertNull(str18);
        Assert.assertTrue("'" + d22 + "' != '" + 0.0d + "'", d22.equals(0.0d));
        Assert.assertNull(str28);
        Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        Assert.assertNull(str32);
        Assert.assertNull(column34);
        Assert.assertNull(str35);
        Assert.assertNull(b36);
        Assert.assertTrue("'" + b42 + "' != '" + false + "'", b42.equals(false));
        Assert.assertTrue("'" + b44 + "' != '" + false + "'", b44.equals(false));
        Assert.assertNotNull(relationship_array45);
        Assert.assertTrue(b47 == true);
        Assert.assertNotNull(table_array48);
        Assert.assertTrue(b50 == false);
        Assert.assertNotNull(list_table51);
        Assert.assertNotNull(list_table54);
        Assert.assertNotNull(list_table55);
        Assert.assertNotNull(list_table58);
        Assert.assertNotNull(list_table61);
    }


    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Relationship relationship0 = new Relationship();
        String str1 = relationship0.getSchema();
        Boolean b2 = relationship0.isTheSameColumn();
        relationship0.setForeignKeyProbability(10.0d);
        Boolean b5 = relationship0.getDataTypeCategoryAgree();
        Connection connection6 = null;
        try {
            relationship0.setRatioSatisfiedFKConstraint(connection6);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(str1);
        Assert.assertNull(b2);
        Assert.assertNull(b5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        Table[] table_array6 = new Table[] {};
        ArrayList<Table> arraylist_table7 = new ArrayList<Table>();
        boolean b8 = Collections.addAll(arraylist_table7, table_array6);
        List<Table> list_table9 = Optimization.optimize(arraylist_table7);
        Connection connection10 = null;
        List<Table> list_table12 = Schema.getExpensiveFeatures(arraylist_table7, connection10, "");
        table2.isJunctionTable(list_table12);
        List<Column> list_column14 = table2.getBestAttemptPk();
        Assert.assertNull(str5);
        Assert.assertNotNull(table_array6);
        Assert.assertTrue(b8 == false);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table12);
        Assert.assertNotNull(list_column14);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setBestAttemptPk(false);
        String str7 = column2.getName();
        Boolean b8 = column2.isEstimatedPk();
        Integer i9 = column2.getRowCount();
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertTrue("'" + i9 + "' != '" + 0 + "'", i9.equals(0));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        try {
            String str9 = table5.toQuery('4', '4');
            Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (IllegalStateException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Relationship relationship0 = new Relationship();
        String str1 = relationship0.getSchema();
        Boolean b2 = relationship0.isTheSameColumn();
        relationship0.setSchema("");
        Connection connection5 = null;
        try {
            relationship0.setRatioSatisfiedFKConstraint(connection5);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(str1);
        Assert.assertNull(b2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        OptimizationRelationship.expectedCount = (short) 0;
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Column column2 = new Column("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", "null --> null");
        Connection connection3 = null;
        try {
            column2.isNotNull(connection3, "null --> null", "");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        OptimizationRelationship.expectedCount = 10.0f;
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Connection connection0 = null;
        try {
            List<Table> list_table3 = Schema.getPrimaryKeys(connection0, "\"", ",.");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Connection connection11 = null;
        try {
            relationship0.setSlowFeatures(connection11);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Table table4 = new Table("", ",");
        table4.setTrimmedName("hi!");
        String str7 = table4.getLowerCaseTrimmedName();
        List<Column> list_column8 = table4.getEstimatedPk();
        Column column9 = new Column("", ",", table4);
        List<Column> list_column10 = table4.getPk();
        Assert.assertNull(str7);
        Assert.assertNotNull(list_column8);
        Assert.assertNotNull(list_column10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        double d1 = OptimizationRelationship.piecewise(0.9d);
        Assert.assertTrue(d1 == 4.37d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        String str6 = table2.toProbability();
        Table[] table_array7 = new Table[] {};
        ArrayList<Table> arraylist_table8 = new ArrayList<>();
        boolean b9 = Collections.addAll(arraylist_table8, table_array7);
        List<Table> list_table10 = Optimization.optimize(arraylist_table8);
        Connection connection11 = null;
        List<Table> list_table13 = Schema.getExpensiveFeatures(arraylist_table8, connection11, "");
        List<Table> list_table14 = Optimization.optimize(list_table13);
        table2.isJunctionTable(list_table14);
        Assert.assertNull(str5);
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        Assert.assertNotNull(table_array7);
        Assert.assertTrue(b9 == false);
        Assert.assertNotNull(list_table10);
        Assert.assertNotNull(list_table13);
        Assert.assertNotNull(list_table14);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        Boolean b9 = column2.getContains();
        column2.setAutoincrement(true);
        column2.setTableContainsLob(true);
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        double d1 = OptimizationRelationship.piecewise((double) (short) 1);
        Assert.assertTrue(d1 == 4.3d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        String str6 = column2.getName();
        Double d7 = column2.getUniqueRatio();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        Assert.assertNull(d7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Column column2 = new Column(",", "");
        column2.setUniqueRatio(0.0d);
        double[] d_array5 = column2.getHistogramBounds();
        Connection connection6 = null;
        try {
            column2.isUnique(connection6, "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey", "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(d_array5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        column2.setTextMax("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        column2.setNullable(true);
        column2.setKeywords();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Boolean b3 = relationship0.isEstimatedFk();
        String str4 = relationship0.toString();
        Boolean b5 = relationship0.getDataTypeCategoryAgree();
        Connection connection6 = null;
        try {
            relationship0.setSlowFeatures(connection6);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertTrue("'" + b3 + "' != '" + false + "'", b3.equals(false));
        Assert.assertTrue("'" + str4 + "' != '" + "null --> null" + "'", str4.equals("null --> null"));
        Assert.assertNull(b5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        List<Column> list_column6 = table2.getEstimatedPk();
        table2.setLowerCaseTrimmedName("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        String str9 = table2.toString();
        try {
            String str12 = table2.toQuery(' ', ' ');
            Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (IllegalStateException e) {
        }
        Assert.assertNull(str5);
        Assert.assertNotNull(list_column6);
        Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Column column4 = new Column(",", "");
        column4.setEstimatedRowCount((int) (byte) 0);
        relationship0.setFk(column4);
        column4.setDataType((int) (byte) 100);
        column4.setDataType((int) (byte) 1);
        Assert.assertNull(column1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setColumnTokenWeight();
        List<String> list_str9 = null;
        table5.setTokenizedLowerCaseTrimmedName(list_str9);
        String str11 = table5.getLowerCaseTrimmedName();
        DatabaseMetaData databaseMetaData12 = null;
        try {
            table5.getUniqueConstraint(databaseMetaData12, "\"", "null --> null", ",.");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNull(str11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Column column2 = new Column(",", "");
        column2.setUniqueRatio(0.0d);
        column2.setNullRatio(0.0d);
        Connection connection7 = null;
        try {
            column2.isUnique(connection7, ",", "");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        OptimizationRelationship.upperEstimate = (short) -1;
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        List<Column> list_column6 = table2.getEstimatedPk();
        table2.hasMultiplePK();
        List<Column> list_column8 = table2.getEstimatedPk();
        String str9 = table2.getLowerCaseTrimmedName();
        Assert.assertNull(str5);
        Assert.assertNotNull(list_column6);
        Assert.assertNotNull(list_column8);
        Assert.assertNull(str9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Column column2 = new Column("null --> null", ",.");
        int i3 = column2.getDataType();
        Double d4 = column2.getNullRatio();
        Assert.assertTrue(i3 == 0);
        Assert.assertNull(d4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        List<String> list_str5 = column2.getTokenizedLowerCaseTrimmedName();
        column2.setDecimalDigits((int) ' ');
        column2.setHasDefault(false);
        column2.setUniqueConstraint(false);
        Assert.assertNotNull(list_str5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        int i5 = column2.getDecimalDigits();
        column2.setHasMultiplePK(true);
        Boolean b8 = column2.isBestAttemptPk();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        column2.setDoppelganger(table14);
        try {
            String str19 = table14.toQuery(' ', 'a');
            Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (IllegalStateException e) {
        }
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(i5 == 0);
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(column10);
        Assert.assertNull(b11);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        String str4 = column2.getLongName();
        column2.setTextMin("");
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue("'" + str4 + "' != '" + ",." + "'", str4.equals(",."));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        double d1 = OptimizationRelationship.piecewise((double) 10);
        Assert.assertTrue(d1 == (-1.5000000000000004d));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setBestAttemptPk(false);
        String str7 = column2.getName();
        Boolean b8 = column2.isEstimatedPk();
        Double d9 = column2.getUniqueRatio();
        Boolean b10 = column2.isEstimatedPk();
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(d9);
        Assert.assertTrue("'" + b10 + "' != '" + false + "'", b10.equals(false));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        List<Column> list_column6 = table2.getEstimatedPk();
        table2.setLowerCaseTrimmedName("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        String str9 = table2.toString();
        List<Column> list_column10 = table2.getPk();
        Assert.assertNull(str5);
        Assert.assertNotNull(list_column6);
        Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
        Assert.assertNotNull(list_column10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        List<Column> list_column6 = table2.getEstimatedPk();
        table2.setLowerCaseTrimmedName("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        String str9 = table2.toString();
        try {
            String str12 = table2.toQuery('4', 'a');
            Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (IllegalStateException e) {
        }
        Assert.assertNull(str5);
        Assert.assertNotNull(list_column6);
        Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Boolean b4 = relationship0.isEstimatedFk();
        Connection connection5 = null;
        try {
            relationship0.setSlowFeatures(connection5);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        String str6 = column2.getName();
        Table[] table_array7 = new Table[] {};
        ArrayList<Table> arraylist_table8 = new ArrayList<Table>();
        boolean b9 = Collections.addAll(arraylist_table8, table_array7);
        List<Table> list_table10 = Optimization.optimize(arraylist_table8);
        column2.setMinLDOtherTable(arraylist_table8);
        Integer i12 = column2.getRowCount();
        int i13 = column2.getColumnSize();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        Assert.assertNotNull(table_array7);
        Assert.assertTrue(b9 == false);
        Assert.assertNotNull(list_table10);
        Assert.assertTrue("'" + i12 + "' != '" + 0 + "'", i12.equals(0));
        Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = relationship0.isForeignKey();
        Boolean b12 = relationship0.isTheSameColumn();
        Table table13 = null;
        try {
            relationship0.setPkTable(table13);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        Assert.assertNull(b12);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        List<String> list_str0 = Setting.KEYWORD_RELATIONSHIP;
        Assert.assertNotNull(list_str0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setPrimaryKey(true);
        String str7 = column2.getTextMax();
        Assert.assertNull(str7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        String str4 = column2.getLongName();
        column2.setCorrelation(4.37d);
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue("'" + str4 + "' != '" + ",." + "'", str4.equals(",."));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setPrimaryKey(true);
        column2.setKeywordSingleton();
        String str8 = column2.getTextMin();
        String str9 = column2.toString();
        Assert.assertNull(str8);
        Assert.assertTrue("'" + str9 + "' != '" + ",." + "'", str9.equals(",."));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        column2.setTextMin("null --> null");
        Connection connection9 = null;
        try {
            column2.isUnique(connection9, "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", ",");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setLowerCaseTrimmedName("");
        List<Column> list_column10 = table5.getBestAttemptPk();
        List<Column> list_column11 = table5.getEstimatedPk();
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNotNull(list_column10);
        Assert.assertNotNull(list_column11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMin(",");
        String str7 = column2.getLowerCaseTrimmedName();
        column2.setNullRatio(100.0d);
        Boolean b10 = column2.getContains();
        Integer i11 = column2.getLD();
        Double d12 = column2.getWidthAvg();
        Assert.assertNull(str7);
        Assert.assertNull(b10);
        Assert.assertNull(i11);
        Assert.assertNull(d12);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        double d1 = OptimizationRelationship.piecewise((-0.3999999999999999d));
        Assert.assertTrue(d1 == 5.859999999999999d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Table table2 = new Table("", ",");
        List<String> list_str3 = table2.getTokenizedLowerCaseTrimmedName();
        DatabaseMetaData databaseMetaData4 = null;
        try {
            table2.getPrimaryKeys(databaseMetaData4, ",", "", ",");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(list_str3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Table table9 = column2.getTable();
        column2.setCorrelation(-1.0d);
        column2.setBestAttemptPk(true);
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(table9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMax(",");
        column2.setDataTypeName(",");
        column2.setTrimmedName("");
        column2.setUniqueConstraint(true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        Table[] table_array6 = new Table[] {};
        ArrayList<Table> arraylist_table7 = new ArrayList<Table>();
        boolean b8 = Collections.addAll(arraylist_table7, table_array6);
        List<Table> list_table9 = Optimization.optimize(arraylist_table7);
        Connection connection10 = null;
        List<Table> list_table12 = Schema.getExpensiveFeatures(arraylist_table7, connection10, "");
        table2.isJunctionTable(list_table12);
        String str14 = table2.toFeature();
        try {
            String str17 = table2.toQuery('a', 'a');
            Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (IllegalStateException e) {
        }
        Assert.assertNull(str5);
        Assert.assertNotNull(table_array6);
        Assert.assertTrue(b8 == false);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table12);
        Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        OptimizationRelationship.upperEstimate = (-1L);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        column2.setTableColumnCount(100);
        Double d23 = column2.getNullRatio();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        Assert.assertNull(d23);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        List<String> list_str5 = column2.getTokenizedLowerCaseTrimmedName();
        column2.setNullRatio(-1.5000000000000004d);
        Assert.assertNotNull(list_str5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        int i5 = column2.getDecimalDigits();
        column2.setHasMultiplePK(true);
        Boolean b8 = column2.isBestAttemptPk();
        Boolean b9 = column2.isKeywordSingleton();
        Double d10 = column2.getUniqueRatio();
        Integer i11 = column2.getLD();
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(i5 == 0);
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b9);
        Assert.assertNull(d10);
        Assert.assertNull(i11);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Column column4 = new Column(",", "");
        column4.setEstimatedRowCount((int) (byte) 0);
        Boolean b7 = column4.isBestAttemptPk();
        column4.setEstimatedPk(true);
        int i10 = column4.getDecimalDigits();
        Relationship relationship11 = new Relationship();
        Column column12 = relationship11.getPk();
        Boolean b13 = relationship11.getDataTypeCategoryAgree();
        Table table16 = new Table("", ",");
        relationship11.setPkTable(table16);
        List<Column> list_column18 = table16.getPk();
        table16.setColumnTokenWeight();
        String str20 = table16.toProbability();
        String str21 = table16.toProbability();
        column4.setDoppelganger(table16);
        Table table25 = new Table("", ",");
        table25.setTrimmedName("hi!");
        String str28 = table25.getLowerCaseTrimmedName();
        List<Column> list_column29 = table25.getEstimatedPk();
        column4.setDoppelganger(table25);
        Column column31 = new Column("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", "null --> null", table25);
        table25.setTrimmedName(",.");
        Assert.assertTrue("'" + b7 + "' != '" + false + "'", b7.equals(false));
        Assert.assertTrue(i10 == 0);
        Assert.assertNull(column12);
        Assert.assertNull(b13);
        Assert.assertNotNull(list_column18);
        Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        Assert.assertNull(str28);
        Assert.assertNotNull(list_column29);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        String str6 = table2.toProbability();
        String str7 = table2.toFeature();
        String str8 = table2.toFeature();
        Assert.assertNull(str5);
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        relationship0.setForeignKeyProbability(100.0d);
        Boolean b4 = relationship0.isEstimatedFk();
        Chen chen5 = null;
        try {
            relationship0.setMediumFeatures(chen5);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        List<Column> list_column5 = table2.getColumnList();
        String str6 = table2.toFeature();
        String str7 = table2.toFeature();
        String str8 = table2.getLowerCaseTrimmedName();
        table2.tableContainsLob();
        Assert.assertNotNull(list_column5);
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertNull(str8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setColumnTokenWeight();
        List<String> list_str9 = null;
        table5.setTokenizedLowerCaseTrimmedName(list_str9);
        List<Column> list_column11 = table5.getEstimatedPk();
        DatabaseMetaData databaseMetaData12 = null;
        try {
            table5.getPrimaryKeys(databaseMetaData12, ",", "hi!", "");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNotNull(list_column11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        Column column10 = new Column(",", "");
        column10.setEstimatedRowCount((int) (byte) 0);
        List<String> list_str13 = column10.getTokenizedLowerCaseTrimmedName();
        column2.setTokenizedLowerCaseTrimmedName(list_str13);
        column2.setTableColumnCount(10);
        column2.setColumnSize(0);
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertNotNull(list_str13);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Connection connection4 = null;
        try {
            relationship0.setSlowFeatures(connection4);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNull(b3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setBestAttemptPk(false);
        String str7 = column2.getName();
        String str8 = column2.getDataTypeName();
        String str9 = column2.getDataTypeName();
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertNull(str8);
        Assert.assertNull(str9);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        Boolean b9 = column2.getContains();
        column2.setDataType(10);
        Double d12 = column2.getValueMin();
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b9);
        Assert.assertNull(d12);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        String str7 = relationship0.getSchema();
        Connection connection8 = null;
        try {
            relationship0.setRatioSatisfiedFKConstraint(connection8);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNull(str7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Relationship relationship0 = new Relationship();
        String str1 = relationship0.getSchema();
        Boolean b2 = relationship0.isTheSameColumn();
        relationship0.setForeignKeyProbability(10.0d);
        Column column7 = new Column(",", "");
        column7.setAutoincrement(false);
        column7.setTextMax(",");
        column7.setDataTypeName(",");
        column7.setTrimmedName("");
        relationship0.setPk(column7);
        column7.setAutoincrement(false);
        Assert.assertNull(str1);
        Assert.assertNull(b2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setNullRatio(4.3d);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        Table[] table_array6 = new Table[] {};
        ArrayList<Table> arraylist_table7 = new ArrayList<Table>();
        boolean b8 = Collections.addAll(arraylist_table7, table_array6);
        List<Table> list_table9 = Optimization.optimize(arraylist_table7);
        Connection connection10 = null;
        List<Table> list_table12 = Schema.getExpensiveFeatures(arraylist_table7, connection10, "");
        table2.isJunctionTable(list_table12);
        Column column15 = table2.getColumn("");
        Assert.assertNull(str5);
        Assert.assertNotNull(table_array6);
        Assert.assertTrue(b8 == false);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table12);
        Assert.assertNull(column15);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setBestAttemptPk(false);
        String str7 = column2.getName();
        column2.setTableContainsLob(true);
        Boolean b10 = column2.isDoppelganger();
        column2.setNullable(true);
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertTrue("'" + b10 + "' != '" + false + "'", b10.equals(false));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Boolean b3 = relationship0.isTheSameColumn();
        String str4 = relationship0.getFkTableName();
        Boolean b5 = relationship0.isForeignKey();
        Relationship relationship6 = null;
        try {
            int i7 = relationship0.compareTo(relationship6);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNull(b3);
        Assert.assertNull(str4);
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Connection connection9 = null;
        try {
            column2.isUnique(connection9, ",.", ",.");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        column6.setBestAttemptPk(false);
        int i13 = column6.getColumnSize();
        column6.setUniqueRatio(0.0d);
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        int i5 = column2.getDecimalDigits();
        column2.setHasMultiplePK(true);
        Boolean b8 = column2.isBestAttemptPk();
        column2.setKeywordSingleton();
        boolean b11 = column2.equals(false);
        column2.setEstimatedRowCount(10);
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(i5 == 0);
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertTrue(b11 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        String str4 = column2.getDataTypeName();
        Double d5 = column2.getNullRatio();
        String str6 = column2.getName();
        Assert.assertTrue(i3 == 0);
        Assert.assertNull(str4);
        Assert.assertNull(d5);
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Relationship relationship0 = new Relationship();
        String str1 = relationship0.getSchema();
        Boolean b2 = relationship0.isTheSameColumn();
        relationship0.setForeignKeyProbability(10.0d);
        Boolean b5 = relationship0.isEstimatedFk();
        Chen chen6 = null;
        try {
            relationship0.setMediumFeatures(chen6);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(str1);
        Assert.assertNull(b2);
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        String str6 = column2.getName();
        Table[] table_array7 = new Table[] {};
        ArrayList<Table> arraylist_table8 = new ArrayList<Table>();
        boolean b9 = Collections.addAll(arraylist_table8, table_array7);
        List<Table> list_table10 = Optimization.optimize(arraylist_table8);
        column2.setMinLDOtherTable(arraylist_table8);
        Integer i12 = column2.getRowCount();
        Double d13 = column2.getWidthAvg();
        column2.setKeywords();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        Assert.assertNotNull(table_array7);
        Assert.assertTrue(b9 == false);
        Assert.assertNotNull(list_table10);
        Assert.assertTrue("'" + i12 + "' != '" + 0 + "'", i12.equals(0));
        Assert.assertNull(d13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Column column2 = new Column(",", "");
        column2.setLowerCaseTrimmedName(",.");
        String str5 = column2.getTextMin();
        Double d6 = column2.getNullRatio();
        column2.setTableColumnCount(-1);
        Assert.assertNull(str5);
        Assert.assertNull(d6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = column6.isBestAttemptPk();
        column6.setEstimatedRowCount((int) ' ');
        String str14 = column6.toString();
        Table table15 = column6.getTable();
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        Assert.assertTrue("'" + str14 + "' != '" + ",." + "'", str14.equals(",."));
        Assert.assertNull(table15);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Table table2 = new Table("", "\"");
        DatabaseMetaData databaseMetaData3 = null;
        try {
            table2.getUniqueConstraint(databaseMetaData3, "schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", "null --> null");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        List<Table> list_table0 = null;
        Connection connection1 = null;
        try {
            List<Table> list_table3 = Schema.getExpensiveFeatures(list_table0, connection1, ",");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        column2.setAutoincrement(false);
        Boolean b11 = column2.getContains();
        Double d12 = column2.getNullRatio();
        column2.setDecimalDigits((int) (byte) 100);
        int i15 = column2.getDecimalDigits();
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b11);
        Assert.assertTrue("'" + d12 + "' != '" + 100.0d + "'", d12.equals(100.0d));
        Assert.assertTrue(i15 == 100);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Connection connection0 = null;
        Table[] table_array3 = new Table[] {};
        ArrayList<Table> arraylist_table4 = new ArrayList<Table>();
        boolean b5 = Collections.addAll(arraylist_table4, table_array3);
        List<Table> list_table6 = Optimization.optimize(arraylist_table4);
        Connection connection7 = null;
        List<Table> list_table9 = Schema.getExpensiveFeatures(arraylist_table4, connection7, "");
        List<Table> list_table10 = Optimization.optimize(arraylist_table4);
        Connection connection11 = null;
        List<Table> list_table13 = Schema.getExpensiveFeatures(list_table10, connection11, ",");
        Connection connection14 = null;
        List<Table> list_table16 = Schema.getExpensiveFeatures(list_table13, connection14, "null --> null");
        List<Relationship> list_relationship18 = Schema.getRelationships(connection0, "", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", list_table16, true);
        List<CompoundRelationship> list_compoundRelationship19 = CompoundRelationship.buildFrom(list_relationship18);
        List<CompoundRelationship> list_compoundRelationship20 = CompoundRelationship.buildFrom(list_relationship18);
        Assert.assertNotNull(table_array3);
        Assert.assertTrue(b5 == false);
        Assert.assertNotNull(list_table6);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table10);
        Assert.assertNotNull(list_table13);
        Assert.assertNotNull(list_table16);
        Assert.assertNotNull(list_relationship18);
        Assert.assertNotNull(list_compoundRelationship19);
        Assert.assertNotNull(list_compoundRelationship20);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        Boolean b9 = column2.getContains();
        column2.setDataType(10);
        Integer i12 = column2.getLD();
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b9);
        Assert.assertNull(i12);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        OptimizationRelationship.expectedCount = 4.37d;
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        double[] d_array9 = column2.getHistogramBounds();
        int i10 = column2.getDataType();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(d_array9);
        Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Relationship relationship0 = new Relationship();
        String str1 = relationship0.getSchema();
        Boolean b2 = relationship0.isTheSameColumn();
        relationship0.setForeignKeyProbability(10.0d);
        Column column7 = new Column(",", "");
        column7.setAutoincrement(false);
        column7.setTextMax(",");
        column7.setDataTypeName(",");
        column7.setTrimmedName("");
        relationship0.setPk(column7);
        column7.setUniqueConstraint(true);
        column7.setCorrelation(10.0d);
        column7.setOrdinalPosition((int) (byte) 100);
        Assert.assertNull(str1);
        Assert.assertNull(b2);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMax(",");
        column2.setDataTypeName(",");
        Boolean b9 = column2.isBestAttemptPk();
        column2.setUniqueConstraint(false);
        Boolean b12 = column2.isBestAttemptPk();
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        List<Column> list_column6 = table2.getEstimatedPk();
        table2.setLowerCaseTrimmedName("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        String str9 = table2.toString();
        List<Column> list_column10 = table2.getBestAttemptPk();
        Assert.assertNull(str5);
        Assert.assertNotNull(list_column6);
        Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
        Assert.assertNotNull(list_column10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Connection connection0 = null;
        try {
            List<Table> list_table3 = Schema.getPrimaryKeys(connection0, "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        Boolean b8 = column2.isKeywordSingleton();
        Double d9 = column2.getValueMax();
        Connection connection10 = null;
        try {
            column2.isNotNull(connection10, "schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey", "schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertNull(b8);
        Assert.assertNull(d9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        OptimizationRelationship.upperEstimate = (byte) 0;
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setTrimmedName("table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Column column2 = new Column(",", "");
        column2.setLowerCaseTrimmedName(",.");
        String str5 = column2.getTextMin();
        Connection connection6 = null;
        try {
            column2.isUnique(connection6, "schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey", "");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(str5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Column column4 = new Column(",", "");
        column4.setEstimatedRowCount((int) (byte) 0);
        Boolean b7 = column4.isBestAttemptPk();
        column4.setEstimatedPk(true);
        int i10 = column4.getDecimalDigits();
        Relationship relationship11 = new Relationship();
        Column column12 = relationship11.getPk();
        Boolean b13 = relationship11.getDataTypeCategoryAgree();
        Table table16 = new Table("", ",");
        relationship11.setPkTable(table16);
        List<Column> list_column18 = table16.getPk();
        table16.setColumnTokenWeight();
        String str20 = table16.toProbability();
        String str21 = table16.toProbability();
        column4.setDoppelganger(table16);
        Table table25 = new Table("", ",");
        table25.setTrimmedName("hi!");
        String str28 = table25.getLowerCaseTrimmedName();
        List<Column> list_column29 = table25.getEstimatedPk();
        column4.setDoppelganger(table25);
        Column column31 = new Column("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", "null --> null", table25);
        DatabaseMetaData databaseMetaData32 = null;
        try {
            table25.getUniqueConstraint(databaseMetaData32, "hi!", ",", "hi!");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + b7 + "' != '" + false + "'", b7.equals(false));
        Assert.assertTrue(i10 == 0);
        Assert.assertNull(column12);
        Assert.assertNull(b13);
        Assert.assertNotNull(list_column18);
        Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        Assert.assertNull(str28);
        Assert.assertNotNull(list_column29);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        OptimizationRelationship.upperEstimate = 0L;
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Table[] table_array0 = new Table[] {};
        ArrayList<Table> arraylist_table1 = new ArrayList<Table>();
        boolean b2 = Collections.addAll(arraylist_table1, table_array0);
        List<Table> list_table3 = Optimization.optimize(arraylist_table1);
        Connection connection4 = null;
        List<Table> list_table6 = Schema.getExpensiveFeatures(arraylist_table1, connection4, "");
        double d7 = Accuracy.getPkPrecision(arraylist_table1);
        Assert.assertNotNull(table_array0);
        Assert.assertTrue(b2 == false);
        Assert.assertNotNull(list_table3);
        Assert.assertNotNull(list_table6);
        Assert.assertEquals(d7, Double.NaN, 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Table table2 = new Table("", ",");
        List<String> list_str3 = table2.getTokenizedLowerCaseTrimmedName();
        String str4 = table2.toString();
        List<Column> list_column5 = table2.getBestAttemptPk();
        Column column7 = table2.getColumn("table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        List<Column> list_column8 = table2.getColumnList();
        Assert.assertNull(list_str3);
        Assert.assertTrue("'" + str4 + "' != '" + "," + "'", str4.equals(","));
        Assert.assertNotNull(list_column5);
        Assert.assertNull(column7);
        Assert.assertNotNull(list_column8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Relationship relationship0 = new Relationship();
        Double d1 = relationship0.getForeignKeyProbability();
        Table table4 = new Table("", ",");
        table4.setTrimmedName("hi!");
        String str7 = table4.getLowerCaseTrimmedName();
        String str8 = table4.toProbability();
        String str9 = table4.toFeature();
        relationship0.setFkTable(table4);
        relationship0.setForeignKey(true);
        Chen chen13 = null;
        try {
            relationship0.setMediumFeatures(chen13);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
        Assert.assertNull(str7);
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Relationship relationship0 = new Relationship();
        Double d1 = relationship0.getForeignKeyProbability();
        relationship0.setSchema("table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setColumnTokenWeight();
        String str9 = table5.toProbability();
        String str10 = table5.toProbability();
        try {
            String str13 = table5.toQuery('a', 'a');
            Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (IllegalStateException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Boolean b4 = relationship0.isEstimatedFk();
        relationship0.setEstimatedFk(true);
        Connection connection7 = null;
        try {
            relationship0.setSlowFeatures(connection7);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.isTheSameColumn();
        String str3 = relationship0.getPkTableName();
        Boolean b4 = relationship0.isForeignKey();
        Connection connection5 = null;
        try {
            relationship0.setRatioSatisfiedFKConstraint(connection5);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNull(str3);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.isTheSameColumn();
        Boolean b3 = relationship0.isTheSameColumn();
        Connection connection4 = null;
        try {
            relationship0.setSlowFeatures(connection4);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNull(b3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        Boolean b4 = column2.isEstimatedPk();
        column2.setDataTypeName("hi!");
        Boolean b7 = column2.isKeywordSingleton();
        column2.setDataType((int) 'a');
        String str10 = column2.getLowerCaseTrimmedName();
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        Assert.assertNull(b7);
        Assert.assertNull(str10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        List<String> list_str5 = column2.getTokenizedLowerCaseTrimmedName();
        column2.setDecimalDigits((int) ' ');
        column2.setTableContainsLob(false);
        String str10 = column2.getName();
        Assert.assertNotNull(list_str5);
        Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        Table table23 = new Table("", ",");
        table23.setTrimmedName("hi!");
        String str26 = table23.getLowerCaseTrimmedName();
        List<Column> list_column27 = table23.getEstimatedPk();
        column2.setDoppelganger(table23);
        table23.hasMultiplePK();
        Column column31 = table23.getColumn("");
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        Assert.assertNull(str26);
        Assert.assertNotNull(list_column27);
        Assert.assertNull(column31);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        OptimizationRelationship.upperEstimate = ' ';
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        Table table23 = new Table("", ",");
        table23.setTrimmedName("hi!");
        String str26 = table23.getLowerCaseTrimmedName();
        List<Column> list_column27 = table23.getEstimatedPk();
        column2.setDoppelganger(table23);
        table23.hasMultiplePK();
        table23.setTrimmedName("hi!");
        List<Column> list_column32 = table23.getEstimatedPk();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        Assert.assertNull(str26);
        Assert.assertNotNull(list_column27);
        Assert.assertNotNull(list_column32);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        int i5 = column2.getDecimalDigits();
        column2.setHasMultiplePK(true);
        Boolean b8 = column2.isBestAttemptPk();
        column2.setKeywordSingleton();
        boolean b11 = column2.equals(false);
        column2.setJunctionTable(false);
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(i5 == 0);
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertTrue(b11 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Boolean b3 = relationship0.isForeignKey();
        relationship0.setForeignKey(true);
        Boolean b6 = relationship0.isTheSameColumn();
        relationship0.setForeignKey(false);
        Column column9 = relationship0.getPk();
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertTrue("'" + b3 + "' != '" + false + "'", b3.equals(false));
        Assert.assertNull(b6);
        Assert.assertNull(column9);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        column6.setBestAttemptPk(false);
        int i13 = column6.getColumnSize();
        Table[] table_array14 = new Table[] {};
        ArrayList<Table> arraylist_table15 = new ArrayList<Table>();
        boolean b16 = Collections.addAll(arraylist_table15, table_array14);
        List<Table> list_table17 = Optimization.optimize(arraylist_table15);
        Connection connection18 = null;
        List<Table> list_table20 = Schema.getExpensiveFeatures(arraylist_table15, connection18, "");
        column6.setMinLDOtherTable(list_table20);
        List<Table> list_table22 = Optimization.optimize(list_table20);
        double d23 = Accuracy.getPkPrecision(list_table20);
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue(i13 == 0);
        Assert.assertNotNull(table_array14);
        Assert.assertTrue(b16 == false);
        Assert.assertNotNull(list_table17);
        Assert.assertNotNull(list_table20);
        Assert.assertNotNull(list_table22);
        Assert.assertEquals(d23, Double.NaN, 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMin(",");
        String str7 = column2.getLowerCaseTrimmedName();
        column2.setNullRatio(100.0d);
        column2.setOrdinalPositionEnd(1);
        String str12 = column2.getDataTypeName();
        String str13 = column2.getTrimmedName();
        Assert.assertNull(str7);
        Assert.assertNull(str12);
        Assert.assertNull(str13);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMin(",");
        String str7 = column2.getLowerCaseTrimmedName();
        column2.setNullRatio(100.0d);
        Boolean b10 = column2.getContains();
        Double d11 = column2.getValueMax();
        String str12 = column2.getTrimmedName();
        column2.setTableColumnCount(10);
        column2.setHasMultiplePK(true);
        Assert.assertNull(str7);
        Assert.assertNull(b10);
        Assert.assertNull(d11);
        Assert.assertNull(str12);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setColumnTokenWeight();
        String str9 = table5.toProbability();
        String str10 = table5.toProbability();
        DatabaseMetaData databaseMetaData11 = null;
        try {
            table5.getUniqueConstraint(databaseMetaData11, "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey", "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Column column2 = new Column("tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        String str4 = column2.getDataTypeName();
        Double d5 = column2.getNullRatio();
        String str6 = column2.toString();
        String str7 = column2.getTextMax();
        Double d8 = column2.getValueMax();
        Assert.assertTrue(i3 == 0);
        Assert.assertNull(str4);
        Assert.assertNull(d5);
        Assert.assertTrue("'" + str6 + "' != '" + ",." + "'", str6.equals(",."));
        Assert.assertNull(str7);
        Assert.assertNull(d8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        Table table23 = new Table("", ",");
        table23.setTrimmedName("hi!");
        String str26 = table23.getLowerCaseTrimmedName();
        List<Column> list_column27 = table23.getEstimatedPk();
        column2.setDoppelganger(table23);
        try {
            String str31 = table23.toQuery('a', '#');
            Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (IllegalStateException e) {
        }
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        Assert.assertNull(str26);
        Assert.assertNotNull(list_column27);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMin(",");
        Connection connection7 = null;
        try {
            column2.isUnique(connection7, ",", ",");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        OptimizationRelationship.upperEstimate = (byte) 100;
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Relationship relationship0 = new Relationship();
        Double d1 = relationship0.getForeignKeyProbability();
        Table table4 = new Table("", ",");
        List<String> list_str5 = table4.getTokenizedLowerCaseTrimmedName();
        String str6 = table4.toString();
        List<Column> list_column7 = table4.getBestAttemptPk();
        relationship0.setFkTable(table4);
        String str9 = table4.getLowerCaseTrimmedName();
        Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
        Assert.assertNull(list_str5);
        Assert.assertTrue("'" + str6 + "' != '" + "," + "'", str6.equals(","));
        Assert.assertNotNull(list_column7);
        Assert.assertNull(str9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Table table2 = new Table("", ",");
        List<String> list_str3 = table2.getTokenizedLowerCaseTrimmedName();
        List<Column> list_column4 = table2.getEstimatedPk();
        Assert.assertNull(list_str3);
        Assert.assertNotNull(list_column4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setColumnTokenWeight();
        String str9 = table5.toProbability();
        table5.setLowerCaseTrimmedName("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        table5.setColumnTokenWeight();
        List<String> list_str13 = Setting.SYNONYM_PERSON;
        table5.setTokenizedLowerCaseTrimmedName(list_str13);
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        Assert.assertNotNull(list_str13);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Column column2 = new Column(",", "");
        column2.setUniqueRatio(Double.NaN);
        List<String> list_str5 = column2.getTokenizedName();
        column2.setKeywords();
        Assert.assertNotNull(list_str5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Column column4 = new Column(",", "");
        column4.setEstimatedRowCount((int) (byte) 0);
        Boolean b7 = column4.isBestAttemptPk();
        column4.setEstimatedPk(true);
        int i10 = column4.getDecimalDigits();
        Relationship relationship11 = new Relationship();
        Column column12 = relationship11.getPk();
        Boolean b13 = relationship11.getDataTypeCategoryAgree();
        Table table16 = new Table("", ",");
        relationship11.setPkTable(table16);
        List<Column> list_column18 = table16.getPk();
        table16.setColumnTokenWeight();
        String str20 = table16.toProbability();
        String str21 = table16.toProbability();
        column4.setDoppelganger(table16);
        Table table25 = new Table("", ",");
        table25.setTrimmedName("hi!");
        String str28 = table25.getLowerCaseTrimmedName();
        List<Column> list_column29 = table25.getEstimatedPk();
        column4.setDoppelganger(table25);
        Column column31 = new Column("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", "null --> null", table25);
        table25.setColumnTokenWeight();
        Assert.assertTrue("'" + b7 + "' != '" + false + "'", b7.equals(false));
        Assert.assertTrue(i10 == 0);
        Assert.assertNull(column12);
        Assert.assertNull(b13);
        Assert.assertNotNull(list_column18);
        Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        Assert.assertNull(str28);
        Assert.assertNotNull(list_column29);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        OptimizationRelationship.upperEstimate = (short) 0;
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Relationship relationship0 = new Relationship();
        String str1 = relationship0.getSchema();
        Boolean b2 = relationship0.isEstimatedFk();
        String str3 = relationship0.getSchema();
        Relationship relationship4 = new Relationship(relationship0);
        Column column5 = relationship0.getPk();
        Assert.assertNull(str1);
        Assert.assertTrue("'" + b2 + "' != '" + false + "'", b2.equals(false));
        Assert.assertNull(str3);
        Assert.assertNull(column5);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        int i5 = column2.getDecimalDigits();
        column2.setHasMultiplePK(true);
        Boolean b8 = column2.isBestAttemptPk();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        column2.setDoppelganger(table14);
        Double d17 = column2.getValueMax();
        Table table18 = column2.getTable();
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(i5 == 0);
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNull(d17);
        Assert.assertNull(table18);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Connection connection0 = null;
        Table[] table_array3 = new Table[] {};
        ArrayList<Table> arraylist_table4 = new ArrayList<Table>();
        boolean b5 = Collections.addAll(arraylist_table4, table_array3);
        List<Table> list_table6 = Optimization.optimize(arraylist_table4);
        Connection connection7 = null;
        List<Table> list_table9 = Schema.getExpensiveFeatures(arraylist_table4, connection7, "");
        List<Table> list_table10 = Optimization.optimize(arraylist_table4);
        Connection connection11 = null;
        List<Table> list_table13 = Schema.getExpensiveFeatures(list_table10, connection11, ",");
        Connection connection14 = null;
        List<Table> list_table16 = Schema.getExpensiveFeatures(list_table13, connection14, "null --> null");
        List<Relationship> list_relationship18 = Schema.getRelationships(connection0, "", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", list_table16, true);
        Connection connection19 = null;
        Table[] table_array22 = new Table[] {};
        ArrayList<Table> arraylist_table23 = new ArrayList<Table>();
        boolean b24 = Collections.addAll(arraylist_table23, table_array22);
        List<Table> list_table25 = Optimization.optimize(arraylist_table23);
        Connection connection26 = null;
        List<Table> list_table28 = Schema.getExpensiveFeatures(arraylist_table23, connection26, "");
        List<Table> list_table29 = Optimization.optimize(arraylist_table23);
        Connection connection30 = null;
        List<Table> list_table32 = Schema.getExpensiveFeatures(list_table29, connection30, ",");
        Connection connection33 = null;
        List<Table> list_table35 = Schema.getExpensiveFeatures(list_table32, connection33, "null --> null");
        List<Relationship> list_relationship37 = Schema.getRelationships(connection19, "", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", list_table35, true);
        List<CompoundRelationship> list_compoundRelationship38 = CompoundRelationship.buildFrom(list_relationship37);
        Table table41 = new Table("", ",");
        table41.setTrimmedName("hi!");
        String str44 = table41.getLowerCaseTrimmedName();
        Table[] table_array45 = new Table[] {};
        ArrayList<Table> arraylist_table46 = new ArrayList<Table>();
        boolean b47 = Collections.addAll(arraylist_table46, table_array45);
        List<Table> list_table48 = Optimization.optimize(arraylist_table46);
        Connection connection49 = null;
        List<Table> list_table51 = Schema.getExpensiveFeatures(arraylist_table46, connection49, "");
        table41.isJunctionTable(list_table51);
        List<Table> list_table53 = Optimization.optimize(list_table51);
        int i54 = OptimizationRelationship.optimize(list_relationship37, list_table51);
        Connection connection55 = null;
        List<Table> list_table57 = Schema.getExpensiveFeatures(list_table51, connection55, "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey");
        int i58 = OptimizationRelationship.optimize(list_relationship18, list_table57);
        Assert.assertNotNull(table_array3);
        Assert.assertTrue(b5 == false);
        Assert.assertNotNull(list_table6);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table10);
        Assert.assertNotNull(list_table13);
        Assert.assertNotNull(list_table16);
        Assert.assertNotNull(list_relationship18);
        Assert.assertNotNull(table_array22);
        Assert.assertTrue(b24 == false);
        Assert.assertNotNull(list_table25);
        Assert.assertNotNull(list_table28);
        Assert.assertNotNull(list_table29);
        Assert.assertNotNull(list_table32);
        Assert.assertNotNull(list_table35);
        Assert.assertNotNull(list_relationship37);
        Assert.assertNotNull(list_compoundRelationship38);
        Assert.assertNull(str44);
        Assert.assertNotNull(table_array45);
        Assert.assertTrue(b47 == false);
        Assert.assertNotNull(list_table48);
        Assert.assertNotNull(list_table51);
        Assert.assertNotNull(list_table53);
        Assert.assertTrue(i54 == 0);
        Assert.assertNotNull(list_table57);
        Assert.assertTrue(i58 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        String str6 = table2.toProbability();
        String str7 = table2.toString();
        Assert.assertNull(str5);
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        column2.setLowerCaseTrimmedName("hi!");
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        Relationship relationship7 = new Relationship();
        Column column8 = relationship7.getPk();
        Boolean b9 = relationship7.getDataTypeCategoryAgree();
        Table table12 = new Table("", ",");
        relationship7.setPkTable(table12);
        List<Column> list_column14 = table12.getPk();
        table12.setColumnTokenWeight();
        List<String> list_str16 = null;
        table12.setTokenizedLowerCaseTrimmedName(list_str16);
        List<Column> list_column18 = table12.getEstimatedPk();
        String str19 = table12.getLowerCaseTrimmedName();
        String str20 = table12.getTrimmedName();
        List<Column> list_column21 = table12.getPk();
        List<Column> list_column22 = table12.getEstimatedPk();
        relationship0.setFkTable(table12);
        try {
            String str26 = relationship0.toQuery('#', 'a');
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNull(column8);
        Assert.assertNull(b9);
        Assert.assertNotNull(list_column14);
        Assert.assertNotNull(list_column18);
        Assert.assertNull(str19);
        Assert.assertNull(str20);
        Assert.assertNotNull(list_column21);
        Assert.assertNotNull(list_column22);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        List<Column> list_column5 = table2.getColumnList();
        String str6 = table2.toFeature();
        table2.setColumnTokenWeight();
        Assert.assertNotNull(list_column5);
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        Boolean b4 = column2.isEstimatedPk();
        column2.setCorrelation(1.0d);
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        String str9 = column2.getTextMin();
        column2.setTrimmedName("");
        column2.setDoppelgangerName("tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey");
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(str9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        String str8 = table5.toProbability();
        Column column11 = new Column(",", "");
        column11.setAutoincrement(false);
        boolean b14 = Doppelganger.isDoppelganger(table5, column11);
        DatabaseMetaData databaseMetaData15 = null;
        try {
            table5.getColumns(databaseMetaData15, "null --> null", "schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey", "");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        Assert.assertTrue(b14 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        List<String> list_str5 = column2.getTokenizedLowerCaseTrimmedName();
        column2.setPrimaryKey(true);
        column2.setPrimaryKey(false);
        Assert.assertNotNull(list_str5);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        column2.setDoppelgangerName(",");
        double[] d_array7 = column2.getHistogramBounds();
        String str8 = column2.getTextMin();
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertNull(d_array7);
        Assert.assertNull(str8);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setColumnTokenWeight();
        table5.setLowerCaseTrimmedName("\"");
        DatabaseMetaData databaseMetaData11 = null;
        try {
            table5.getColumns(databaseMetaData11, "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", "null --> null", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        OptimizationRelationship.lowerEstimate = (short) 10;
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Table table2 = new Table(",", ",");
        List<Column> list_column3 = table2.getBestAttemptPk();
        String str4 = table2.toProbability();
        String str5 = table2.toProbability();
        Column column7 = table2.getColumn("hi!");
        DatabaseMetaData databaseMetaData8 = null;
        try {
            table2.getUniqueConstraint(databaseMetaData8, "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey", "", "\"");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNotNull(list_column3);
        Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        Assert.assertNull(column7);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        int i5 = column2.getDecimalDigits();
        column2.setHasMultiplePK(true);
        column2.setJunctionTable(false);
        Integer i10 = column2.getOrdinalPosition();
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(i5 == 0);
        Assert.assertNull(i10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Connection connection0 = null;
        Table[] table_array3 = new Table[] {};
        ArrayList<Table> arraylist_table4 = new ArrayList<Table>();
        boolean b5 = Collections.addAll(arraylist_table4, table_array3);
        List<Table> list_table6 = Optimization.optimize(arraylist_table4);
        Connection connection7 = null;
        List<Table> list_table9 = Schema.getExpensiveFeatures(arraylist_table4, connection7, "");
        List<Table> list_table10 = Optimization.optimize(arraylist_table4);
        Connection connection11 = null;
        List<Table> list_table13 = Schema.getExpensiveFeatures(list_table10, connection11, ",");
        Connection connection14 = null;
        List<Table> list_table16 = Schema.getExpensiveFeatures(list_table13, connection14, "null --> null");
        List<Relationship> list_relationship18 = Schema.getRelationships(connection0, "", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", list_table16, true);
        Connection connection19 = null;
        List<Table> list_table21 = Schema.getExpensiveFeatures(list_table16, connection19, "hi!");
        Assert.assertNotNull(table_array3);
        Assert.assertTrue(b5 == false);
        Assert.assertNotNull(list_table6);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table10);
        Assert.assertNotNull(list_table13);
        Assert.assertNotNull(list_table16);
        Assert.assertNotNull(list_relationship18);
        Assert.assertNotNull(list_table21);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setBestAttemptPk(false);
        String str7 = column2.getName();
        column2.setTableContainsLob(true);
        column2.setColumnSize(1);
        String str12 = column2.getDoppelgangerName();
        column2.setTableContainsLob(true);
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertNull(str12);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        Table[] table_array6 = new Table[] {};
        ArrayList<Table> arraylist_table7 = new ArrayList<Table>();
        boolean b8 = Collections.addAll(arraylist_table7, table_array6);
        List<Table> list_table9 = Optimization.optimize(arraylist_table7);
        Connection connection10 = null;
        List<Table> list_table12 = Schema.getExpensiveFeatures(arraylist_table7, connection10, "");
        table2.isJunctionTable(list_table12);
        double d14 = Accuracy.getPkPrecision(list_table12);
        Connection connection15 = null;
        List<Table> list_table17 = Schema.getExpensiveFeatures(list_table12, connection15, "");
        Assert.assertNull(str5);
        Assert.assertNotNull(table_array6);
        Assert.assertTrue(b8 == false);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table12);
        Assert.assertEquals(d14, Double.NaN, 0);
        Assert.assertNotNull(list_table17);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Table table2 = new Table("", ",");
        List<String> list_str3 = table2.getTokenizedLowerCaseTrimmedName();
        String str4 = table2.toString();
        List<Column> list_column5 = table2.getBestAttemptPk();
        Column column7 = table2.getColumn("table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        DatabaseMetaData databaseMetaData8 = null;
        try {
            table2.getUniqueConstraint(databaseMetaData8, "null --> null", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", "null --> null");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(list_str3);
        Assert.assertTrue("'" + str4 + "' != '" + "," + "'", str4.equals(","));
        Assert.assertNotNull(list_column5);
        Assert.assertNull(column7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        double d1 = OptimizationRelationship.piecewise((double) '#');
        Assert.assertTrue(d1 == (-5.5d));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        OptimizationRelationship.expectedCount = (-0.3999999999999999d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Column column2 = new Column(",", "");
        column2.setUniqueRatio(Double.NaN);
        List<String> list_str5 = column2.getTokenizedName();
        int i6 = column2.getDecimalDigits();
        String str7 = column2.getTextMin();
        Assert.assertNotNull(list_str5);
        Assert.assertTrue(i6 == 0);
        Assert.assertNull(str7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Table table2 = new Table(",.", "hi!");
        String str3 = table2.toProbability();
        DatabaseMetaData databaseMetaData4 = null;
        try {
            table2.getColumns(databaseMetaData4, ",", ",", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMax(",");
        column2.setNullRatio(4.37d);
        Double d9 = column2.getValueMax();
        column2.setEstimatedRowCount((int) (short) 10);
        Column column14 = new Column(",", "");
        int i15 = column14.getColumnSize();
        Boolean b16 = column14.getContains();
        boolean b17 = column2.equals(b16);
        Assert.assertTrue("'" + d9 + "' != '" + (-1.0d) + "'", d9.equals((-1.0d)));
        Assert.assertTrue(i15 == 0);
        Assert.assertNull(b16);
        Assert.assertTrue(b17 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        relationship0.setForeignKey(false);
        String str6 = relationship0.getSchema();
        Column column9 = new Column(",", "");
        int i10 = column9.getColumnSize();
        relationship0.setFk(column9);
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertNull(str6);
        Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        OptimizationRelationship.upperEstimate = (-1.5000000000000004d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        relationship0.setForeignKey(false);
        String str6 = relationship0.getSchema();
        Chen chen7 = null;
        try {
            relationship0.setMediumFeatures(chen7);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertNull(str6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        column2.setHasDefault(false);
        Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        String str8 = table5.toProbability();
        Column column11 = new Column(",", "");
        column11.setAutoincrement(false);
        boolean b14 = Doppelganger.isDoppelganger(table5, column11);
        column11.setNullRatio(10.0d);
        String str17 = column11.getLongName();
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        Assert.assertTrue(b14 == false);
        Assert.assertTrue("'" + str17 + "' != '" + ",." + "'", str17.equals(",."));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        int i11 = column6.getDataType();
        column6.setTrimmedName("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Column column2 = new Column(",", "");
        column2.setUniqueRatio(0.0d);
        column2.setNullRatio(0.0d);
        Boolean b7 = column2.hasMultiplePK();
        Assert.assertNull(b7);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        OptimizationRelationship.upperEstimate = 100.0d;
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        String str4 = column2.getDataTypeName();
        Boolean b5 = column2.isDoppelganger();
        column2.setEstimatedPk(false);
        List<String> list_str8 = null;
        column2.setTokenizedLowerCaseTrimmedName(list_str8);
        Assert.assertTrue(i3 == 0);
        Assert.assertNull(str4);
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        Boolean b4 = column2.isEstimatedPk();
        Boolean b5 = column2.isPrimaryKey();
        column2.setDoppelgangerName("");
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        column2.setHasDefault(true);
        Integer i7 = column2.getLD();
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertNull(i7);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        column2.setAutoincrement(false);
        Boolean b11 = column2.getContains();
        column2.setTableColumnCount(0);
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b11);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Column column2 = new Column(",", "");
        column2.setUniqueRatio(0.0d);
        column2.setNullRatio(0.0d);
        column2.setNullRatio(0.9d);
        column2.setNullable(false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        relationship0.setForeignKey(false);
        relationship0.setForeignKey(true);
        Boolean b8 = relationship0.isTheSameColumn();
        Column column11 = new Column(",", "");
        int i12 = column11.getColumnSize();
        String str13 = column11.getDataTypeName();
        Double d14 = column11.getNullRatio();
        relationship0.setFk(column11);
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertNull(b8);
        Assert.assertTrue(i12 == 0);
        Assert.assertNull(str13);
        Assert.assertNull(d14);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        column2.setAutoincrement(false);
        Boolean b11 = column2.getContains();
        column2.setColumnSize(10);
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b11);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        List<Column> list_column6 = table2.getEstimatedPk();
        table2.setLowerCaseTrimmedName("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        String str9 = table2.getLowerCaseTrimmedName();
        Relationship relationship10 = new Relationship();
        Column column11 = relationship10.getPk();
        String str12 = relationship10.getSchema();
        Boolean b13 = relationship10.getDataTypeCategoryAgree();
        Column column16 = new Column(",", "");
        column16.setEstimatedRowCount((int) (byte) 0);
        Boolean b19 = column16.isBestAttemptPk();
        relationship10.setPk(column16);
        Boolean b21 = column16.isBestAttemptPk();
        Table[] table_array22 = new Table[] {};
        ArrayList<Table> arraylist_table23 = new ArrayList<Table>();
        boolean b24 = Collections.addAll(arraylist_table23, table_array22);
        List<Table> list_table25 = Optimization.optimize(arraylist_table23);
        column16.setMinLDOtherTable(arraylist_table23);
        table2.isJunctionTable(arraylist_table23);
        String str28 = table2.toFeature();
        Column column30 = table2.getColumn(",.");
        Assert.assertNull(str5);
        Assert.assertNotNull(list_column6);
        Assert.assertTrue("'" + str9 + "' != '" + "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey" + "'", str9.equals("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey"));
        Assert.assertNull(column11);
        Assert.assertNull(str12);
        Assert.assertNull(b13);
        Assert.assertTrue("'" + b19 + "' != '" + false + "'", b19.equals(false));
        Assert.assertTrue("'" + b21 + "' != '" + false + "'", b21.equals(false));
        Assert.assertNotNull(table_array22);
        Assert.assertTrue(b24 == false);
        Assert.assertNotNull(list_table25);
        Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        Assert.assertNull(column30);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        Boolean b4 = column2.isEstimatedPk();
        column2.setDataTypeName("hi!");
        Boolean b7 = column2.isKeywordSingleton();
        column2.setDataType((int) 'a');
        column2.setTableColumnCount(10);
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        Assert.assertNull(b7);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        String str4 = column2.getDataTypeName();
        Boolean b5 = column2.isDoppelganger();
        column2.setJunctionTable(false);
        column2.setOrdinalPosition((int) (byte) 0);
        Assert.assertTrue(i3 == 0);
        Assert.assertNull(str4);
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Relationship relationship0 = new Relationship();
        Double d1 = relationship0.getForeignKeyProbability();
        Table table4 = new Table("", ",");
        List<String> list_str5 = table4.getTokenizedLowerCaseTrimmedName();
        String str6 = table4.toString();
        List<Column> list_column7 = table4.getBestAttemptPk();
        relationship0.setFkTable(table4);
        Connection connection9 = null;
        try {
            relationship0.setRatioSatisfiedFKConstraint(connection9);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
        Assert.assertNull(list_str5);
        Assert.assertTrue("'" + str6 + "' != '" + "," + "'", str6.equals(","));
        Assert.assertNotNull(list_column7);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Column column2 = relationship0.getFk();
        Relationship relationship3 = new Relationship();
        Column column4 = relationship3.getPk();
        String str5 = relationship3.getSchema();
        Boolean b6 = relationship3.getDataTypeCategoryAgree();
        relationship3.setForeignKey(false);
        Boolean b9 = relationship3.isEstimatedFk();
        int i10 = relationship0.compareTo(relationship3);
        relationship3.setForeignKeyProbability(10.0d);
        Assert.assertNull(column1);
        Assert.assertNull(column2);
        Assert.assertNull(column4);
        Assert.assertNull(str5);
        Assert.assertNull(b6);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Table table2 = new Table("hi!", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = column6.isBestAttemptPk();
        column6.setDataTypeName("tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey");
        String str14 = column6.getLongName();
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        Assert.assertTrue("'" + str14 + "' != '" + ",." + "'", str14.equals(",."));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = relationship0.isForeignKey();
        Boolean b12 = relationship0.isTheSameColumn();
        relationship0.setForeignKeyProbability(-0.3999999999999999d);
        Chen chen15 = null;
        try {
            relationship0.setMediumFeatures(chen15);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        Assert.assertNull(b12);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getTextMax();
        Boolean b8 = column2.getTableContainsLob();
        column2.setDataType((int) (byte) 1);
        Assert.assertNull(str7);
        Assert.assertNull(b8);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        Boolean b9 = column2.getContains();
        column2.setAutoincrement(true);
        column2.setDataTypeName("");
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b9);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        Table[] table_array6 = new Table[] {};
        ArrayList<Table> arraylist_table7 = new ArrayList<Table>();
        boolean b8 = Collections.addAll(arraylist_table7, table_array6);
        List<Table> list_table9 = Optimization.optimize(arraylist_table7);
        Connection connection10 = null;
        List<Table> list_table12 = Schema.getExpensiveFeatures(arraylist_table7, connection10, "");
        table2.isJunctionTable(list_table12);
        Column column15 = table2.getColumn("null --> null");
        Assert.assertNull(str5);
        Assert.assertNotNull(table_array6);
        Assert.assertTrue(b8 == false);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table12);
        Assert.assertNull(column15);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        Boolean b4 = column2.isEstimatedPk();
        column2.setDataTypeName("hi!");
        Boolean b7 = column2.isKeywordSingleton();
        Boolean b8 = column2.isBestAttemptPk();
        column2.setUniqueRatio(-0.3999999999999999d);
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        Assert.assertNull(b7);
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        String str6 = column2.getName();
        Table[] table_array7 = new Table[] {};
        ArrayList<Table> arraylist_table8 = new ArrayList<Table>();
        boolean b9 = Collections.addAll(arraylist_table8, table_array7);
        List<Table> list_table10 = Optimization.optimize(arraylist_table8);
        column2.setMinLDOtherTable(arraylist_table8);
        String str12 = column2.getName();
        String str13 = column2.getTrimmedName();
        column2.setKeywords();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        Assert.assertNotNull(table_array7);
        Assert.assertTrue(b9 == false);
        Assert.assertNotNull(list_table10);
        Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        Assert.assertNull(str13);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        Boolean b4 = column2.isEstimatedPk();
        column2.setDataTypeName("hi!");
        Boolean b7 = column2.isKeywordSingleton();
        Boolean b8 = column2.isBestAttemptPk();
        column2.setDataTypeName("hi!");
        column2.setNullable(true);
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        Assert.assertNull(b7);
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = column6.isBestAttemptPk();
        Table[] table_array12 = new Table[] {};
        ArrayList<Table> arraylist_table13 = new ArrayList<Table>();
        boolean b14 = Collections.addAll(arraylist_table13, table_array12);
        List<Table> list_table15 = Optimization.optimize(arraylist_table13);
        column6.setMinLDOtherTable(arraylist_table13);
        column6.setTableColumnCount(100);
        Double d19 = column6.getValueMax();
        String str20 = column6.getTextMax();
        int i21 = column6.getColumnSize();
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        Assert.assertNotNull(table_array12);
        Assert.assertTrue(b14 == false);
        Assert.assertNotNull(list_table15);
        Assert.assertNull(d19);
        Assert.assertNull(str20);
        Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        OptimizationRelationship.expectedCount = (short) 100;
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setColumnTokenWeight();
        List<String> list_str9 = null;
        table5.setTokenizedLowerCaseTrimmedName(list_str9);
        List<Column> list_column11 = table5.getEstimatedPk();
        String str12 = table5.getLowerCaseTrimmedName();
        String str13 = table5.getTrimmedName();
        List<String> list_str14 = table5.getTokenizedLowerCaseTrimmedName();
        String str15 = table5.getName();
        table5.setLowerCaseTrimmedName("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNotNull(list_column11);
        Assert.assertNull(str12);
        Assert.assertNull(str13);
        Assert.assertNull(list_str14);
        Assert.assertTrue("'" + str15 + "' != '" + "," + "'", str15.equals(","));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Column column2 = new Column(",", "");
        column2.setUniqueRatio(0.0d);
        column2.setNullRatio(0.0d);
        column2.setHasMultiplePK(true);
        column2.setTextMin(",.");
        column2.setTableColumnCount(100);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        column2.setDataTypeName("table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        String str4 = column2.getDataTypeName();
        column2.setWidthAvg(-1.0d);
        column2.setJunctionTable(false);
        column2.setTableContainsLob(true);
        column2.setHasDefault(true);
        Assert.assertTrue(i3 == 0);
        Assert.assertNull(str4);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setLowerCaseTrimmedName("");
        List<Column> list_column10 = table5.getBestAttemptPk();
        DatabaseMetaData databaseMetaData11 = null;
        try {
            table5.getUniqueConstraint(databaseMetaData11, "table\"column\"dataTypeName\"isUnique\"isUniqueConstraint\"columnSize\"decimalDigits\"isDecimal\"hasDefault\"ordinalPosition\"ordinalPositionEnd\"tableColumnCount\"tableContainsLob\"estimatedRowCount\"isAutoincrement\"isNotNull\"nullRatio\"isNullable\"uniqueRatio\"minValue\"maxValue\"avgWidth\"avgWidthBigger10\"correlationAbs\"isKeywordSingleton\"isJunctionTable\"hasMultiplePK\"levenshteinDistance\"minLDOtherTable\"isDoppelganger\"contains\"isPrimaryKey", ",.", "null --> null");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNotNull(list_column10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        int i5 = column2.getDecimalDigits();
        column2.setHasMultiplePK(true);
        Integer i8 = column2.getOrdinalPosition();
        column2.setEstimatedRowCount((int) (byte) 1);
        String str11 = column2.getName();
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(i5 == 0);
        Assert.assertNull(i8);
        Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Boolean b4 = relationship0.isEstimatedFk();
        relationship0.setSchema("schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        Connection connection7 = null;
        try {
            relationship0.setSlowFeatures(connection7);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Relationship relationship0 = new Relationship();
        Double d1 = relationship0.getForeignKeyProbability();
        Table table4 = new Table("", ",");
        table4.setTrimmedName("hi!");
        String str7 = table4.getLowerCaseTrimmedName();
        String str8 = table4.toProbability();
        String str9 = table4.toFeature();
        relationship0.setFkTable(table4);
        String str11 = relationship0.getPkTableName();
        Boolean b12 = relationship0.isEstimatedFk();
        relationship0.setForeignKeyProbability(Double.NaN);
        relationship0.setEstimatedFk(false);
        String str17 = relationship0.getSchema();
        Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
        Assert.assertNull(str7);
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        Assert.assertNull(str11);
        Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        Assert.assertNull(str17);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        column2.setPrimaryKey(false);
        String str11 = column2.getLongName();
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertTrue("'" + str11 + "' != '" + ",." + "'", str11.equals(",."));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMax(",");
        column2.setDataTypeName(",");
        Boolean b9 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        double[] d_array12 = column2.getHistogramBounds();
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertNull(d_array12);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        column6.setBestAttemptPk(false);
        int i13 = column6.getColumnSize();
        column6.setTableContainsLob(true);
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        column2.setAutoincrement(false);
        Boolean b11 = column2.getContains();
        column2.setNullRatio(0.0d);
        column2.setPrimaryKey(false);
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b11);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Boolean b3 = relationship0.isForeignKey();
        Column column6 = new Column(",", "");
        int i7 = column6.getColumnSize();
        int i8 = column6.getDataType();
        int i9 = column6.getDecimalDigits();
        column6.setHasMultiplePK(true);
        Boolean b12 = column6.isBestAttemptPk();
        Relationship relationship13 = new Relationship();
        Column column14 = relationship13.getPk();
        Boolean b15 = relationship13.getDataTypeCategoryAgree();
        Table table18 = new Table("", ",");
        relationship13.setPkTable(table18);
        column6.setDoppelganger(table18);
        relationship0.setFkTable(table18);
        Column column24 = new Column(",", "");
        column24.setEstimatedRowCount((int) (byte) 0);
        column24.setNullRatio(100.0d);
        column24.setEstimatedRowCount(10);
        Table[] table_array31 = new Table[] {};
        ArrayList<Table> arraylist_table32 = new ArrayList<Table>();
        boolean b33 = Collections.addAll(arraylist_table32, table_array31);
        List<Table> list_table34 = Optimization.optimize(arraylist_table32);
        Connection connection35 = null;
        List<Table> list_table37 = Schema.getExpensiveFeatures(arraylist_table32, connection35, ",.");
        double d38 = Accuracy.getPkPrecision(list_table37);
        column24.setMinLDOtherTable(list_table37);
        relationship0.setPk(column24);
        Boolean b41 = relationship0.isTheSameColumn();
        try {
            String str44 = relationship0.toQuery(' ', 'a');
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertTrue("'" + b3 + "' != '" + false + "'", b3.equals(false));
        Assert.assertTrue(i7 == 0);
        Assert.assertTrue(i8 == 0);
        Assert.assertTrue(i9 == 0);
        Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        Assert.assertNull(column14);
        Assert.assertNull(b15);
        Assert.assertNotNull(table_array31);
        Assert.assertTrue(b33 == false);
        Assert.assertNotNull(list_table34);
        Assert.assertNotNull(list_table37);
        Assert.assertEquals(d38, Double.NaN, 0);
        Assert.assertNull(b41);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        table5.setLowerCaseTrimmedName("schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        table5.setColumnTokenWeight();
        Assert.assertNull(column1);
        Assert.assertNull(b2);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        Table table2 = new Table("", ",");
        List<String> list_str3 = table2.getTokenizedLowerCaseTrimmedName();
        String str4 = table2.toString();
        List<Column> list_column5 = table2.getBestAttemptPk();
        List<String> list_str6 = table2.getTokenizedLowerCaseTrimmedName();
        List<String> list_str7 = table2.getTokenizedLowerCaseTrimmedName();
        String str8 = table2.toProbability();
        List<String> list_str9 = table2.getTokenizedLowerCaseTrimmedName();
        Assert.assertNull(list_str3);
        Assert.assertTrue("'" + str4 + "' != '" + "," + "'", str4.equals(","));
        Assert.assertNotNull(list_column5);
        Assert.assertNull(list_str6);
        Assert.assertNull(list_str7);
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        Assert.assertNull(list_str9);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTrimmedName("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        int i7 = column2.getColumnSize();
        String str8 = column2.getDoppelgangerName();
        Assert.assertTrue(i7 == 0);
        Assert.assertNull(str8);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Table table2 = new Table("", ",");
        List<String> list_str3 = table2.getTokenizedLowerCaseTrimmedName();
        String str4 = table2.toProbability();
        table2.hasMultiplePK();
        try {
            String str8 = table2.toQuery(' ', 'a');
            Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (IllegalStateException e) {
        }
        Assert.assertNull(list_str3);
        Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Relationship relationship0 = new Relationship();
        String str1 = relationship0.getSchema();
        Boolean b2 = relationship0.isTheSameColumn();
        relationship0.setForeignKeyProbability(10.0d);
        Column column7 = new Column(",", "");
        column7.setAutoincrement(false);
        column7.setTextMax(",");
        column7.setDataTypeName(",");
        column7.setTrimmedName("");
        relationship0.setPk(column7);
        column7.setUniqueConstraint(true);
        column7.setCorrelation(10.0d);
        Boolean b21 = column7.isKeywordSingleton();
        column7.setColumnSize((int) (short) 0);
        Assert.assertNull(str1);
        Assert.assertNull(b2);
        Assert.assertNull(b21);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        column2.setTextMax("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        column2.setNullable(true);
        int i12 = column2.getDataType();
        List<String> list_str13 = Setting.SYNONYM_CITY;
        column2.setTokenizedLowerCaseTrimmedName(list_str13);
        int i15 = column2.getDecimalDigits();
        column2.setEstimatedRowCount((int) (short) 10);
        double[] d_array18 = column2.getHistogramBounds();
        String str19 = column2.getName();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i12 == 0);
        Assert.assertNotNull(list_str13);
        Assert.assertTrue(i15 == 0);
        Assert.assertNull(d_array18);
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        Column column2 = new Column(",", "");
        column2.setUniqueRatio(0.0d);
        column2.setNullRatio(0.0d);
        column2.setHasMultiplePK(true);
        Connection connection9 = null;
        try {
            column2.isNotNull(connection9, "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        OptimizationRelationship.expectedCount = '#';
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        OptimizationRelationship.upperEstimate = 0.0d;
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        Boolean b8 = column2.isKeywordSingleton();
        Double d9 = column2.getValueMax();
        Double d10 = column2.getUniqueRatio();
        String str11 = column2.getTrimmedName();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertNull(b8);
        Assert.assertNull(d9);
        Assert.assertNull(d10);
        Assert.assertNull(str11);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Double d11 = column6.getWidthAvg();
        Double d12 = column6.getWidthAvg();
        column6.setTrimmedName("schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        Connection connection15 = null;
        try {
            column6.isNotNull(connection15, "schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey", "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertNull(d11);
        Assert.assertNull(d12);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Column column13 = new Column(",", "");
        int i14 = column13.getColumnSize();
        int i15 = column13.getDataType();
        relationship0.setPk(column13);
        Table table19 = new Table(",", ",");
        List<Column> list_column20 = table19.getBestAttemptPk();
        column13.setDoppelganger(table19);
        column13.setTrimmedName("hi!");
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue(i14 == 0);
        Assert.assertTrue(i15 == 0);
        Assert.assertNotNull(list_column20);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setColumnTokenWeight();
        List<String> list_str9 = null;
        table5.setTokenizedLowerCaseTrimmedName(list_str9);
        List<Column> list_column11 = table5.getEstimatedPk();
        String str12 = table5.getLowerCaseTrimmedName();
        String str13 = table5.getTrimmedName();
        List<String> list_str14 = table5.getTokenizedLowerCaseTrimmedName();
        DatabaseMetaData databaseMetaData15 = null;
        try {
            table5.getColumns(databaseMetaData15, "\"", "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNotNull(list_column11);
        Assert.assertNull(str12);
        Assert.assertNull(str13);
        Assert.assertNull(list_str14);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        String str8 = table5.toProbability();
        try {
            String str11 = table5.toQuery('a', ' ');
            Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (IllegalStateException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setColumnTokenWeight();
        List<String> list_str9 = null;
        table5.setTokenizedLowerCaseTrimmedName(list_str9);
        table5.setLowerCaseTrimmedName("null --> null");
        DatabaseMetaData databaseMetaData13 = null;
        try {
            table5.getPrimaryKeys(databaseMetaData13, "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", ",.", "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        int i5 = column2.getDecimalDigits();
        column2.setHasMultiplePK(true);
        Boolean b8 = column2.isBestAttemptPk();
        Boolean b9 = column2.isKeywordSingleton();
        column2.setAutoincrement(true);
        String str12 = column2.getName();
        column2.setLowerCaseTrimmedName(",");
        Table table15 = column2.getTable();
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(i5 == 0);
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b9);
        Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        Assert.assertNull(table15);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        int i5 = column2.getDecimalDigits();
        column2.setHasMultiplePK(true);
        Boolean b8 = column2.isBestAttemptPk();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        column2.setDoppelganger(table14);
        Double d17 = column2.getUniqueRatio();
        Integer i18 = column2.getLD();
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(i5 == 0);
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNull(d17);
        Assert.assertNull(i18);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        Table table2 = new Table("hi!", ",");
        List<Column> list_column3 = table2.getBestAttemptPk();
        String str4 = table2.toFeature();
        DatabaseMetaData databaseMetaData5 = null;
        try {
            table2.getPrimaryKeys(databaseMetaData5, "\"", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", "");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNotNull(list_column3);
        Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        Table table2 = new Table("", ",");
        List<String> list_str3 = table2.getTokenizedLowerCaseTrimmedName();
        String str4 = table2.toString();
        List<Column> list_column5 = table2.getBestAttemptPk();
        Column column7 = table2.getColumn("table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        table2.setLowerCaseTrimmedName("");
        Assert.assertNull(list_str3);
        Assert.assertTrue("'" + str4 + "' != '" + "," + "'", str4.equals(","));
        Assert.assertNotNull(list_column5);
        Assert.assertNull(column7);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        int i11 = column6.getDataType();
        String str12 = column6.getTrimmedName();
        Boolean b13 = column6.getTableContainsLob();
        Table[] table_array14 = new Table[] {};
        ArrayList<Table> arraylist_table15 = new ArrayList<Table>();
        boolean b16 = Collections.addAll(arraylist_table15, table_array14);
        List<Table> list_table17 = Optimization.optimize(arraylist_table15);
        Connection connection18 = null;
        List<Table> list_table20 = Schema.getExpensiveFeatures(arraylist_table15, connection18, "");
        List<Table> list_table21 = Optimization.optimize(list_table20);
        double d22 = Accuracy.getPkRecall(list_table21);
        List<Table> list_table23 = Optimization.optimize(list_table21);
        column6.setMinLDOtherTable(list_table21);
        Table[] table_array25 = new Table[] {};
        ArrayList<Table> arraylist_table26 = new ArrayList<Table>();
        boolean b27 = Collections.addAll(arraylist_table26, table_array25);
        List<Table> list_table28 = Optimization.optimize(arraylist_table26);
        Connection connection29 = null;
        List<Table> list_table31 = Schema.getExpensiveFeatures(arraylist_table26, connection29, ",.");
        double d32 = Accuracy.getPkPrecision(list_table31);
        List<Table> list_table33 = Optimization.optimize(list_table31);
        double d34 = Accuracy.getPkRecall(list_table33);
        column6.setMinLDOtherTable(list_table33);
        Boolean b36 = column6.getContains();
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue(i11 == 0);
        Assert.assertNull(str12);
        Assert.assertNull(b13);
        Assert.assertNotNull(table_array14);
        Assert.assertTrue(b16 == false);
        Assert.assertNotNull(list_table17);
        Assert.assertNotNull(list_table20);
        Assert.assertNotNull(list_table21);
        Assert.assertEquals(d22, Double.NaN, 0);
        Assert.assertNotNull(list_table23);
        Assert.assertNotNull(table_array25);
        Assert.assertTrue(b27 == false);
        Assert.assertNotNull(list_table28);
        Assert.assertNotNull(list_table31);
        Assert.assertEquals(d32, Double.NaN, 0);
        Assert.assertNotNull(list_table33);
        Assert.assertEquals(d34, Double.NaN, 0);
        Assert.assertNull(b36);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        double d1 = OptimizationRelationship.piecewise(Double.NaN);
        Assert.assertEquals(d1, Double.NaN, 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        int i5 = column2.getDecimalDigits();
        column2.setOrdinalPositionEnd(0);
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        Column column2 = new Column(",", "");
        column2.setUniqueRatio(0.0d);
        column2.setNullRatio(0.0d);
        column2.setNullRatio(0.9d);
        Connection connection9 = null;
        try {
            column2.isUnique(connection9, "table\"column\"dataTypeName\"isUnique\"isUniqueConstraint\"columnSize\"decimalDigits\"isDecimal\"hasDefault\"ordinalPosition\"ordinalPositionEnd\"tableColumnCount\"tableContainsLob\"estimatedRowCount\"isAutoincrement\"isNotNull\"nullRatio\"isNullable\"uniqueRatio\"minValue\"maxValue\"avgWidth\"avgWidthBigger10\"correlationAbs\"isKeywordSingleton\"isJunctionTable\"hasMultiplePK\"levenshteinDistance\"minLDOtherTable\"isDoppelganger\"contains\"isPrimaryKey", "hi!");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Column column13 = new Column(",", "");
        int i14 = column13.getColumnSize();
        int i15 = column13.getDataType();
        relationship0.setPk(column13);
        Table table19 = new Table(",", ",");
        List<Column> list_column20 = table19.getBestAttemptPk();
        column13.setDoppelganger(table19);
        Boolean b22 = column13.isBestAttemptPk();
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue(i14 == 0);
        Assert.assertTrue(i15 == 0);
        Assert.assertNotNull(list_column20);
        Assert.assertTrue("'" + b22 + "' != '" + false + "'", b22.equals(false));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        String str6 = table2.toProbability();
        String str7 = table2.toFeature();
        List<Column> list_column8 = table2.getPk();
        List<Column> list_column9 = table2.getColumnList();
        Assert.assertNull(str5);
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertNotNull(list_column8);
        Assert.assertNotNull(list_column9);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        OptimizationRelationship.lowerEstimate = 0.0f;
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Table table9 = column2.getTable();
        column2.setCorrelation(-1.0d);
        String str12 = column2.getDataTypeName();
        column2.setTableContainsLob(false);
        Boolean b15 = column2.getContains();
        column2.setTableColumnCount(10);
        column2.setDecimalDigits(0);
        column2.setUniqueConstraint(false);
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(table9);
        Assert.assertNull(str12);
        Assert.assertNull(b15);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        Connection connection0 = null;
        try {
            List<Table> list_table3 = Schema.getPrimaryKeys(connection0, ",", "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setLowerCaseTrimmedName("");
        List<Column> list_column10 = table5.getBestAttemptPk();
        String str11 = table5.toFeature();
        table5.setLowerCaseTrimmedName("");
        table5.tableContainsLob();
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNotNull(list_column10);
        Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        Table[] table_array6 = new Table[] {};
        ArrayList<Table> arraylist_table7 = new ArrayList<Table>();
        boolean b8 = Collections.addAll(arraylist_table7, table_array6);
        List<Table> list_table9 = Optimization.optimize(arraylist_table7);
        Connection connection10 = null;
        List<Table> list_table12 = Schema.getExpensiveFeatures(arraylist_table7, connection10, "");
        table2.isJunctionTable(list_table12);
        List<Column> list_column14 = table2.getPk();
        String str15 = table2.toFeature();
        String str16 = table2.getLowerCaseTrimmedName();
        Assert.assertNull(str5);
        Assert.assertNotNull(table_array6);
        Assert.assertTrue(b8 == false);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table12);
        Assert.assertNotNull(list_column14);
        Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        Assert.assertNull(str16);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMin(",");
        String str7 = column2.getLowerCaseTrimmedName();
        column2.setNullRatio(100.0d);
        column2.setEstimatedPk(true);
        String str12 = column2.getDataTypeName();
        Double d13 = column2.getValueMin();
        column2.setDataType((int) (byte) 10);
        Assert.assertNull(str7);
        Assert.assertNull(str12);
        Assert.assertTrue("'" + d13 + "' != '" + (-1.0d) + "'", d13.equals((-1.0d)));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        List<String> list_str5 = column2.getTokenizedLowerCaseTrimmedName();
        column2.setPrimaryKey(true);
        column2.setNullable(false);
        column2.setTrimmedName("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        List<String> list_str12 = Setting.SYNONYM_CITY;
        column2.setTokenizedLowerCaseTrimmedName(list_str12);
        Column column16 = new Column(",", "");
        column16.setEstimatedRowCount((int) (byte) 0);
        column16.setPrimaryKey(true);
        column16.setKeywordSingleton();
        String str22 = column16.getDataTypeName();
        boolean b23 = column2.equals(str22);
        column2.setHasDefault(false);
        Assert.assertNotNull(list_str5);
        Assert.assertNotNull(list_str12);
        Assert.assertNull(str22);
        Assert.assertTrue(b23 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        Table table2 = new Table("", ",");
        List<String> list_str3 = table2.getTokenizedLowerCaseTrimmedName();
        String str4 = table2.toString();
        List<Column> list_column5 = table2.getBestAttemptPk();
        List<String> list_str6 = table2.getTokenizedLowerCaseTrimmedName();
        List<String> list_str7 = table2.getTokenizedLowerCaseTrimmedName();
        List<Column> list_column8 = table2.getColumnList();
        String str9 = table2.getName();
        Assert.assertNull(list_str3);
        Assert.assertTrue("'" + str4 + "' != '" + "," + "'", str4.equals(","));
        Assert.assertNotNull(list_column5);
        Assert.assertNull(list_str6);
        Assert.assertNull(list_str7);
        Assert.assertNotNull(list_column8);
        Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        Column column2 = new Column("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", "hi!");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        Table[] table_array0 = new Table[] {};
        ArrayList<Table> arraylist_table1 = new ArrayList<Table>();
        boolean b2 = Collections.addAll(arraylist_table1, table_array0);
        List<Table> list_table3 = Optimization.optimize(arraylist_table1);
        Connection connection4 = null;
        List<Table> list_table6 = Schema.getExpensiveFeatures(arraylist_table1, connection4, "");
        List<Table> list_table7 = Optimization.optimize(arraylist_table1);
        Connection connection8 = null;
        List<Table> list_table10 = Schema.getExpensiveFeatures(list_table7, connection8, ",");
        Connection connection11 = null;
        List<Table> list_table13 = Schema.getExpensiveFeatures(list_table10, connection11, "null --> null");
        double d14 = Accuracy.getPkRecall(list_table10);
        double d15 = Accuracy.getPkPrecision(list_table10);
        List<Table> list_table16 = Optimization.optimize(list_table10);
        List<Table> list_table17 = Optimization.optimize(list_table10);
        Connection connection18 = null;
        List<Table> list_table20 = Schema.getExpensiveFeatures(list_table17, connection18, "\"");
        Assert.assertNotNull(table_array0);
        Assert.assertTrue(b2 == false);
        Assert.assertNotNull(list_table3);
        Assert.assertNotNull(list_table6);
        Assert.assertNotNull(list_table7);
        Assert.assertNotNull(list_table10);
        Assert.assertNotNull(list_table13);
        Assert.assertEquals(d14, Double.NaN, 0);
        Assert.assertEquals(d15, Double.NaN, 0);
        Assert.assertNotNull(list_table16);
        Assert.assertNotNull(list_table17);
        Assert.assertNotNull(list_table20);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        Column column2 = new Column("null --> null", "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        Double d3 = column2.getValueMax();
        Boolean b4 = column2.isBestAttemptPk();
        Integer i5 = column2.getRowCount();
        Assert.assertNull(d3);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        Assert.assertTrue("'" + i5 + "' != '" + 0 + "'", i5.equals(0));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        Table[] table_array6 = new Table[] {};
        ArrayList<Table> arraylist_table7 = new ArrayList<Table>();
        boolean b8 = Collections.addAll(arraylist_table7, table_array6);
        List<Table> list_table9 = Optimization.optimize(arraylist_table7);
        Connection connection10 = null;
        List<Table> list_table12 = Schema.getExpensiveFeatures(arraylist_table7, connection10, "");
        table2.isJunctionTable(list_table12);
        List<Table> list_table14 = Optimization.optimize(list_table12);
        double d15 = Accuracy.getPkRecall(list_table14);
        List<Table> list_table16 = Optimization.optimize(list_table14);
        Assert.assertNull(str5);
        Assert.assertNotNull(table_array6);
        Assert.assertTrue(b8 == false);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table12);
        Assert.assertNotNull(list_table14);
        Assert.assertEquals(d15, Double.NaN, 0);
        Assert.assertNotNull(list_table16);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        OptimizationRelationship.expectedCount = 0.9d;
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = column6.isBestAttemptPk();
        column6.setDataTypeName("tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey");
        column6.setLowerCaseTrimmedName("null --> null");
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        Relationship relationship0 = new Relationship();
        Double d1 = relationship0.getForeignKeyProbability();
        Table table4 = new Table("", ",");
        table4.setTrimmedName("hi!");
        String str7 = table4.getLowerCaseTrimmedName();
        String str8 = table4.toProbability();
        String str9 = table4.toFeature();
        relationship0.setFkTable(table4);
        String str11 = relationship0.getPkTableName();
        Boolean b12 = relationship0.isEstimatedFk();
        Column column13 = relationship0.getPk();
        Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
        Assert.assertNull(str7);
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        Assert.assertNull(str11);
        Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        Assert.assertNull(column13);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMin(",");
        String str7 = column2.getLowerCaseTrimmedName();
        column2.setUniqueConstraint(false);
        Connection connection10 = null;
        try {
            column2.isUnique(connection10, "", "schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(str7);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        column2.setHasDefault(true);
        column2.setUniqueRatio(0.0d);
        column2.setBestAttemptPk(true);
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setColumnTokenWeight();
        List<String> list_str9 = null;
        table5.setTokenizedLowerCaseTrimmedName(list_str9);
        List<Column> list_column11 = table5.getEstimatedPk();
        Column column14 = new Column(",", "");
        column14.setEstimatedRowCount((int) (byte) 0);
        Boolean b17 = column14.isBestAttemptPk();
        column14.setEstimatedPk(true);
        column14.setTextMax("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        column14.setNullable(true);
        int i24 = column14.getDataType();
        List<String> list_str25 = Setting.SYNONYM_CITY;
        column14.setTokenizedLowerCaseTrimmedName(list_str25);
        table5.setTokenizedLowerCaseTrimmedName(list_str25);
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNotNull(list_column11);
        Assert.assertTrue("'" + b17 + "' != '" + false + "'", b17.equals(false));
        Assert.assertTrue(i24 == 0);
        Assert.assertNotNull(list_str25);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        int i5 = column2.getColumnSize();
        column2.setEstimatedPk(true);
        Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setBestAttemptPk(false);
        String str7 = column2.getName();
        column2.setTableContainsLob(true);
        column2.setColumnSize(1);
        String str12 = column2.getDoppelgangerName();
        String str13 = column2.getTextMax();
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertNull(str12);
        Assert.assertNull(str13);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMin(",");
        String str7 = column2.getLowerCaseTrimmedName();
        column2.setNullRatio(100.0d);
        Boolean b10 = column2.getContains();
        Double d11 = column2.getValueMax();
        String str12 = column2.getTrimmedName();
        column2.setTableColumnCount(10);
        String str15 = column2.getLowerCaseTrimmedName();
        column2.setEstimatedPk(false);
        Assert.assertNull(str7);
        Assert.assertNull(b10);
        Assert.assertNull(d11);
        Assert.assertNull(str12);
        Assert.assertNull(str15);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        column2.setPrimaryKey(false);
        Boolean b11 = column2.isKeywordSingleton();
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b11);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        int i5 = column2.getDecimalDigits();
        column2.setHasMultiplePK(true);
        Boolean b8 = column2.isBestAttemptPk();
        column2.setKeywordSingleton();
        column2.setEstimatedRowCount((int) (byte) 100);
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(i5 == 0);
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        column2.setAutoincrement(false);
        Boolean b11 = column2.getContains();
        String str12 = column2.getLongName();
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b11);
        Assert.assertTrue("'" + str12 + "' != '" + ",." + "'", str12.equals(",."));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMin(",");
        String str7 = column2.getLowerCaseTrimmedName();
        column2.setNullRatio(100.0d);
        column2.setOrdinalPositionEnd(1);
        String str12 = column2.getDataTypeName();
        column2.setTrimmedName("tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey");
        String str15 = column2.getLongName();
        Assert.assertNull(str7);
        Assert.assertNull(str12);
        Assert.assertTrue("'" + str15 + "' != '" + ",." + "'", str15.equals(",."));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        String str6 = column2.getName();
        column2.setKeywords();
        Double d8 = column2.getValueMin();
        Boolean b9 = column2.getContains();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        Assert.assertNull(d8);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = relationship0.isForeignKey();
        Boolean b12 = relationship0.isEstimatedFk();
        Column column15 = new Column(",", "");
        column15.setEstimatedRowCount((int) (byte) 0);
        Boolean b18 = column15.isBestAttemptPk();
        column15.setEstimatedPk(true);
        int i21 = column15.getDecimalDigits();
        Table table22 = column15.getTable();
        column15.setCorrelation(-1.0d);
        String str25 = column15.getDataTypeName();
        column15.setCorrelation(10.0d);
        Table table30 = new Table("", ",");
        table30.setTrimmedName("hi!");
        String str33 = table30.getLowerCaseTrimmedName();
        String str34 = table30.toProbability();
        String str35 = table30.toFeature();
        List<Column> list_column36 = table30.getPk();
        column15.setDoppelganger(table30);
        relationship0.setPkTable(table30);
        Boolean b39 = relationship0.isForeignKey();
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        Assert.assertTrue("'" + b18 + "' != '" + false + "'", b18.equals(false));
        Assert.assertTrue(i21 == 0);
        Assert.assertNull(table22);
        Assert.assertNull(str25);
        Assert.assertNull(str33);
        Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        Assert.assertNotNull(list_column36);
        Assert.assertTrue("'" + b39 + "' != '" + false + "'", b39.equals(false));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setLowerCaseTrimmedName("");
        List<Column> list_column10 = table5.getBestAttemptPk();
        String str11 = table5.toProbability();
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNotNull(list_column10);
        Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        String str8 = table5.toProbability();
        Column column11 = new Column(",", "");
        column11.setAutoincrement(false);
        boolean b14 = Doppelganger.isDoppelganger(table5, column11);
        List<Column> list_column15 = table5.getEstimatedPk();
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        Assert.assertTrue(b14 == false);
        Assert.assertNotNull(list_column15);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = column6.isBestAttemptPk();
        Table[] table_array12 = new Table[] {};
        ArrayList<Table> arraylist_table13 = new ArrayList<Table>();
        boolean b14 = Collections.addAll(arraylist_table13, table_array12);
        List<Table> list_table15 = Optimization.optimize(arraylist_table13);
        column6.setMinLDOtherTable(arraylist_table13);
        column6.setKeywords();
        column6.setDecimalDigits((int) 'a');
        column6.setUniqueConstraint(true);
        Integer i22 = column6.getLD();
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        Assert.assertNotNull(table_array12);
        Assert.assertTrue(b14 == false);
        Assert.assertNotNull(list_table15);
        Assert.assertNull(i22);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        Boolean b9 = column2.getContains();
        column2.setDataType(10);
        column2.setKeywordSingleton();
        String str13 = column2.getLowerCaseTrimmedName();
        String str14 = column2.getLongName();
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b9);
        Assert.assertNull(str13);
        Assert.assertTrue("'" + str14 + "' != '" + ",." + "'", str14.equals(",."));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Double d11 = column6.getWidthAvg();
        Double d12 = column6.getWidthAvg();
        column6.setOrdinalPosition((int) (short) 0);
        String str15 = column6.getTextMax();
        column6.setPrimaryKey(false);
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertNull(d11);
        Assert.assertNull(d12);
        Assert.assertNull(str15);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setPrimaryKey(true);
        column2.setKeywordSingleton();
        String str8 = column2.getDataTypeName();
        String str9 = column2.getLongName();
        Assert.assertNull(str8);
        Assert.assertTrue("'" + str9 + "' != '" + ",." + "'", str9.equals(",."));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        Relationship relationship8 = new Relationship();
        Column column9 = relationship8.getPk();
        Boolean b10 = relationship8.getDataTypeCategoryAgree();
        Table table13 = new Table("", ",");
        relationship8.setPkTable(table13);
        List<Column> list_column15 = table13.getPk();
        table13.setLowerCaseTrimmedName("");
        String str18 = table13.toFeature();
        column2.setDoppelganger(table13);
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertNull(column9);
        Assert.assertNull(b10);
        Assert.assertNotNull(list_column15);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        Table table4 = new Table("", ",");
        table4.setTrimmedName("hi!");
        String str7 = table4.getLowerCaseTrimmedName();
        List<Column> list_column8 = table4.getEstimatedPk();
        Column column9 = new Column("", ",", table4);
        Connection connection10 = null;
        try {
            column9.isNotNull(connection10, "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", "schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(str7);
        Assert.assertNotNull(list_column8);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        Table table2 = new Table("", ",");
        table2.setTrimmedName(",");
        table2.setLowerCaseTrimmedName("");
        String str7 = table2.toProbability();
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        Table[] table_array6 = new Table[] {};
        ArrayList<Table> arraylist_table7 = new ArrayList<Table>();
        boolean b8 = Collections.addAll(arraylist_table7, table_array6);
        List<Table> list_table9 = Optimization.optimize(arraylist_table7);
        Connection connection10 = null;
        List<Table> list_table12 = Schema.getExpensiveFeatures(arraylist_table7, connection10, "");
        table2.isJunctionTable(list_table12);
        String str14 = table2.toString();
        table2.hasMultiplePK();
        table2.setColumnTokenWeight();
        Assert.assertNull(str5);
        Assert.assertNotNull(table_array6);
        Assert.assertTrue(b8 == false);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table12);
        Assert.assertTrue("'" + str14 + "' != '" + "," + "'", str14.equals(","));
    }


    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        String str8 = table5.getTrimmedName();
        List<Column> list_column9 = table5.getPk();
        table5.setTrimmedName("\"");
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNull(str8);
        Assert.assertNotNull(list_column9);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        String str7 = relationship0.getSchema();
        Relationship relationship8 = new Relationship(relationship0);
        Double d9 = relationship0.getForeignKeyProbability();
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNull(str7);
        Assert.assertTrue("'" + d9 + "' != '" + 0.0d + "'", d9.equals(0.0d));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        Table table2 = new Table("", ",");
        List<String> list_str3 = table2.getTokenizedLowerCaseTrimmedName();
        String str4 = table2.toProbability();
        table2.setLowerCaseTrimmedName("null --> null");
        Assert.assertNull(list_str3);
        Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        String str8 = table5.toProbability();
        Column column11 = new Column(",", "");
        column11.setAutoincrement(false);
        boolean b14 = Doppelganger.isDoppelganger(table5, column11);
        column11.setNullRatio(10.0d);
        Integer i17 = column11.getLD();
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        Assert.assertTrue(b14 == false);
        Assert.assertNull(i17);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        Connection connection0 = null;
        Table[] table_array3 = new Table[] {};
        ArrayList<Table> arraylist_table4 = new ArrayList<Table>();
        boolean b5 = Collections.addAll(arraylist_table4, table_array3);
        List<Table> list_table6 = Optimization.optimize(arraylist_table4);
        Connection connection7 = null;
        List<Table> list_table9 = Schema.getExpensiveFeatures(arraylist_table4, connection7, "");
        List<Table> list_table10 = Optimization.optimize(arraylist_table4);
        Connection connection11 = null;
        List<Table> list_table13 = Schema.getExpensiveFeatures(list_table10, connection11, ",");
        Connection connection14 = null;
        List<Table> list_table16 = Schema.getExpensiveFeatures(list_table13, connection14, "null --> null");
        List<Relationship> list_relationship18 = Schema.getRelationships(connection0, "", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", list_table16, true);
        List<CompoundRelationship> list_compoundRelationship19 = CompoundRelationship.buildFrom(list_relationship18);
        double d20 = Accuracy.getFkPrecision(list_relationship18);
        Table[] table_array21 = new Table[] {};
        ArrayList<Table> arraylist_table22 = new ArrayList<Table>();
        boolean b23 = Collections.addAll(arraylist_table22, table_array21);
        List<Table> list_table24 = Optimization.optimize(arraylist_table22);
        Connection connection25 = null;
        List<Table> list_table27 = Schema.getExpensiveFeatures(arraylist_table22, connection25, "");
        List<Table> list_table28 = Optimization.optimize(list_table27);
        int i29 = OptimizationRelationship.optimize(list_relationship18, list_table28);
        double d30 = Accuracy.getPkRecall(list_table28);
        Assert.assertNotNull(table_array3);
        Assert.assertTrue(b5 == false);
        Assert.assertNotNull(list_table6);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table10);
        Assert.assertNotNull(list_table13);
        Assert.assertNotNull(list_table16);
        Assert.assertNotNull(list_relationship18);
        Assert.assertNotNull(list_compoundRelationship19);
        Assert.assertEquals(d20, Double.NaN, 0);
        Assert.assertNotNull(table_array21);
        Assert.assertTrue(b23 == false);
        Assert.assertNotNull(list_table24);
        Assert.assertNotNull(list_table27);
        Assert.assertNotNull(list_table28);
        Assert.assertTrue(i29 == 0);
        Assert.assertEquals(d30, Double.NaN, 0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setBestAttemptPk(false);
        String str7 = column2.getName();
        column2.setTableContainsLob(true);
        column2.setEstimatedPk(false);
        String str12 = column2.getTextMin();
        Connection connection13 = null;
        try {
            column2.isNotNull(connection13, "\"", "schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertNull(str12);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        column2.setDataType((int) (byte) -1);
        String str10 = column2.getDoppelgangerName();
        Column column13 = new Column(",", "");
        column13.setEstimatedRowCount((int) (byte) 0);
        Boolean b16 = column13.isBestAttemptPk();
        column13.setEstimatedPk(true);
        Boolean b19 = column13.isKeywordSingleton();
        Double d20 = column13.getValueMax();
        Double d21 = column13.getUniqueRatio();
        double[] d_array22 = Column.WEIGHTS;
        column13.setHistogramBounds(d_array22);
        column2.setHistogramBounds(d_array22);
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertNull(str10);
        Assert.assertTrue("'" + b16 + "' != '" + false + "'", b16.equals(false));
        Assert.assertNull(b19);
        Assert.assertNull(d20);
        Assert.assertNull(d21);
        Assert.assertNotNull(d_array22);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setBestAttemptPk(false);
        String str7 = column2.getName();
        String str8 = column2.getName();
        Boolean b9 = column2.getContains();
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        Assert.assertNull(b9);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setPrimaryKey(true);
        column2.setKeywordSingleton();
        String str8 = column2.getTextMin();
        Boolean b9 = column2.isKeywordSingleton();
        String str10 = column2.getLongName();
        Assert.assertNull(str8);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + str10 + "' != '" + ",." + "'", str10.equals(",."));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMax(",");
        column2.setDataTypeName(",");
        Boolean b9 = column2.hasMultiplePK();
        Assert.assertNull(b9);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Boolean b4 = relationship0.isForeignKey();
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        Connection connection0 = null;
        try {
            List<Table> list_table3 = Schema.getPrimaryKeys(connection0, "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey.null --> null", "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        List<Column> list_column6 = table2.getEstimatedPk();
        table2.hasMultiplePK();
        String str8 = table2.getTrimmedName();
        String str9 = table2.getName();
        Assert.assertNull(str5);
        Assert.assertNotNull(list_column6);
        Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMin(",");
        List<String> list_str7 = column2.getTokenizedName();
        String str8 = column2.toString();
        Assert.assertNotNull(list_str7);
        Assert.assertTrue("'" + str8 + "' != '" + ",." + "'", str8.equals(",."));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        Relationship relationship0 = new Relationship();
        Double d1 = relationship0.getForeignKeyProbability();
        Table table4 = new Table("", ",");
        table4.setTrimmedName("hi!");
        String str7 = table4.getLowerCaseTrimmedName();
        String str8 = table4.toProbability();
        String str9 = table4.toFeature();
        relationship0.setFkTable(table4);
        String str11 = relationship0.getPkTableName();
        Boolean b12 = relationship0.isEstimatedFk();
        Table table15 = new Table("", ",");
        table15.setTrimmedName("hi!");
        String str18 = table15.getLowerCaseTrimmedName();
        Table[] table_array19 = new Table[] {};
        ArrayList<Table> arraylist_table20 = new ArrayList<Table>();
        boolean b21 = Collections.addAll(arraylist_table20, table_array19);
        List<Table> list_table22 = Optimization.optimize(arraylist_table20);
        Connection connection23 = null;
        List<Table> list_table25 = Schema.getExpensiveFeatures(arraylist_table20, connection23, "");
        table15.isJunctionTable(list_table25);
        String str27 = table15.toString();
        table15.hasMultiplePK();
        relationship0.setFkTable(table15);
        try {
            String str32 = relationship0.toQuery('#', 'a');
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
        Assert.assertNull(str7);
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        Assert.assertNull(str11);
        Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        Assert.assertNull(str18);
        Assert.assertNotNull(table_array19);
        Assert.assertTrue(b21 == false);
        Assert.assertNotNull(list_table22);
        Assert.assertNotNull(list_table25);
        Assert.assertTrue("'" + str27 + "' != '" + "," + "'", str27.equals(","));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        Connection connection0 = null;
        Table[] table_array3 = new Table[] {};
        ArrayList<Table> arraylist_table4 = new ArrayList<Table>();
        boolean b5 = Collections.addAll(arraylist_table4, table_array3);
        List<Table> list_table6 = Optimization.optimize(arraylist_table4);
        Connection connection7 = null;
        List<Table> list_table9 = Schema.getExpensiveFeatures(arraylist_table4, connection7, "");
        List<Table> list_table10 = Optimization.optimize(arraylist_table4);
        Connection connection11 = null;
        List<Table> list_table13 = Schema.getExpensiveFeatures(list_table10, connection11, ",");
        Connection connection14 = null;
        List<Table> list_table16 = Schema.getExpensiveFeatures(list_table13, connection14, "null --> null");
        List<Relationship> list_relationship18 = Schema.getRelationships(connection0, "", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", list_table16, true);
        List<CompoundRelationship> list_compoundRelationship19 = CompoundRelationship.buildFrom(list_relationship18);
        double d20 = Accuracy.getFkRecall(list_relationship18);
        double d21 = Accuracy.getFkPrecision(list_relationship18);
        List<CompoundRelationship> list_compoundRelationship22 = CompoundRelationship.buildFrom(list_relationship18);
        Assert.assertNotNull(table_array3);
        Assert.assertTrue(b5 == false);
        Assert.assertNotNull(list_table6);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table10);
        Assert.assertNotNull(list_table13);
        Assert.assertNotNull(list_table16);
        Assert.assertNotNull(list_relationship18);
        Assert.assertNotNull(list_compoundRelationship19);
        Assert.assertEquals(d20, Double.NaN, 0);
        Assert.assertEquals(d21, Double.NaN, 0);
        Assert.assertNotNull(list_compoundRelationship22);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        Table table4 = new Table("", ",");
        table4.setTrimmedName("hi!");
        String str7 = table4.getLowerCaseTrimmedName();
        List<Column> list_column8 = table4.getEstimatedPk();
        Column column9 = new Column("", ",", table4);
        column9.setNullable(true);
        column9.setNullRatio(5.859999999999999d);
        column9.setNullRatio(-0.3999999999999999d);
        Assert.assertNull(str7);
        Assert.assertNotNull(list_column8);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        Column column2 = new Column("\"", "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        column2.setUniqueRatio(4.37d);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        List<String> list_str5 = column2.getTokenizedLowerCaseTrimmedName();
        column2.setPrimaryKey(true);
        Column column10 = new Column(",", "");
        column10.setEstimatedRowCount((int) (byte) 0);
        column10.setNullRatio(100.0d);
        column10.setEstimatedRowCount(10);
        Table[] table_array17 = new Table[] {};
        ArrayList<Table> arraylist_table18 = new ArrayList<Table>();
        boolean b19 = Collections.addAll(arraylist_table18, table_array17);
        List<Table> list_table20 = Optimization.optimize(arraylist_table18);
        Connection connection21 = null;
        List<Table> list_table23 = Schema.getExpensiveFeatures(arraylist_table18, connection21, ",.");
        double d24 = Accuracy.getPkPrecision(list_table23);
        column10.setMinLDOtherTable(list_table23);
        column2.setMinLDOtherTable(list_table23);
        Assert.assertNotNull(list_str5);
        Assert.assertNotNull(table_array17);
        Assert.assertTrue(b19 == false);
        Assert.assertNotNull(list_table20);
        Assert.assertNotNull(list_table23);
        Assert.assertEquals(d24, Double.NaN, 0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setBestAttemptPk(false);
        double[] d_array7 = null;
        column2.setHistogramBounds(d_array7);
        column2.setDataType((int) (short) -1);
        int i11 = column2.getDataType();
        Integer i12 = column2.getLD();
        Assert.assertTrue(i11 == (-1));
        Assert.assertNull(i12);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        column6.setBestAttemptPk(false);
        int i13 = column6.getColumnSize();
        column6.setNullRatio(100.0d);
        column6.setNullable(false);
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        Relationship relationship0 = new Relationship();
        String str1 = relationship0.getSchema();
        Boolean b2 = relationship0.isTheSameColumn();
        relationship0.setForeignKeyProbability(10.0d);
        Boolean b5 = relationship0.isEstimatedFk();
        String str6 = relationship0.getSchema();
        Assert.assertNull(str1);
        Assert.assertNull(b2);
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertNull(str6);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setAutoincrement(true);
        column2.setTableColumnCount(1);
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setBestAttemptPk(false);
        String str7 = column2.getName();
        column2.setTableContainsLob(true);
        column2.setEstimatedPk(false);
        String str12 = column2.getTextMin();
        column2.setDataTypeName("schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        Boolean b15 = column2.isBestAttemptPk();
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertNull(str12);
        Assert.assertTrue("'" + b15 + "' != '" + false + "'", b15.equals(false));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        Relationship relationship0 = new Relationship();
        Double d1 = relationship0.getForeignKeyProbability();
        Table table4 = new Table("", ",");
        table4.setTrimmedName("hi!");
        String str7 = table4.getLowerCaseTrimmedName();
        String str8 = table4.toProbability();
        String str9 = table4.toFeature();
        relationship0.setFkTable(table4);
        String str11 = relationship0.getPkTableName();
        Boolean b12 = relationship0.isEstimatedFk();
        Boolean b13 = relationship0.isEstimatedFk();
        Double d14 = relationship0.getForeignKeyProbability();
        Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
        Assert.assertNull(str7);
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        Assert.assertNull(str11);
        Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        Assert.assertTrue("'" + b13 + "' != '" + false + "'", b13.equals(false));
        Assert.assertTrue("'" + d14 + "' != '" + 0.0d + "'", d14.equals(0.0d));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        column2.setEstimatedRowCount(10);
        Integer i9 = column2.getOrdinalPosition();
        Double d10 = column2.getValueMin();
        Assert.assertNull(i9);
        Assert.assertNull(d10);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        int i5 = column2.getDecimalDigits();
        column2.setHasMultiplePK(true);
        Integer i8 = column2.getOrdinalPosition();
        String str9 = column2.getTextMax();
        Boolean b10 = column2.isPrimaryKey();
        List<String> list_str11 = column2.getTokenizedLowerCaseTrimmedName();
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(i5 == 0);
        Assert.assertNull(i8);
        Assert.assertNull(str9);
        Assert.assertTrue("'" + b10 + "' != '" + false + "'", b10.equals(false));
        Assert.assertNotNull(list_str11);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        Table table2 = new Table("", ",");
        List<String> list_str3 = table2.getTokenizedLowerCaseTrimmedName();
        String str4 = table2.toProbability();
        List<Column> list_column5 = table2.getPk();
        Assert.assertNull(list_str3);
        Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        Assert.assertNotNull(list_column5);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        Table table2 = new Table("", ",");
        List<String> list_str3 = table2.getTokenizedLowerCaseTrimmedName();
        table2.setColumnTokenWeight();
        List<Column> list_column5 = table2.getColumnList();
        String str6 = table2.getName();
        Assert.assertNull(list_str3);
        Assert.assertNotNull(list_column5);
        Assert.assertTrue("'" + str6 + "' != '" + "," + "'", str6.equals(","));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        int i5 = column2.getDecimalDigits();
        column2.setHasMultiplePK(true);
        Boolean b8 = column2.isBestAttemptPk();
        Boolean b9 = column2.isKeywordSingleton();
        column2.setAutoincrement(true);
        String str12 = column2.getName();
        Double d13 = column2.getUniqueRatio();
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(i5 == 0);
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b9);
        Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        Assert.assertNull(d13);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = column6.isBestAttemptPk();
        Table[] table_array12 = new Table[] {};
        ArrayList<Table> arraylist_table13 = new ArrayList<Table>();
        boolean b14 = Collections.addAll(arraylist_table13, table_array12);
        List<Table> list_table15 = Optimization.optimize(arraylist_table13);
        column6.setMinLDOtherTable(arraylist_table13);
        List<Table> list_table17 = Optimization.optimize(arraylist_table13);
        Connection connection18 = null;
        List<Table> list_table20 = Schema.getExpensiveFeatures(list_table17, connection18, "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey.null --> null");
        double d21 = Accuracy.getPkRecall(list_table17);
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        Assert.assertNotNull(table_array12);
        Assert.assertTrue(b14 == false);
        Assert.assertNotNull(list_table15);
        Assert.assertNotNull(list_table17);
        Assert.assertNotNull(list_table20);
        Assert.assertEquals(d21, Double.NaN, 0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        Relationship relationship0 = new Relationship();
        String str1 = relationship0.getSchema();
        Boolean b2 = relationship0.isTheSameColumn();
        relationship0.setForeignKeyProbability(10.0d);
        Column column7 = new Column(",", "");
        column7.setAutoincrement(false);
        column7.setTextMax(",");
        column7.setDataTypeName(",");
        column7.setTrimmedName("");
        relationship0.setPk(column7);
        column7.setDataType((int) 'a');
        List<String> list_str19 = column7.getTokenizedName();
        Double d20 = column7.getNullRatio();
        Assert.assertNull(str1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_str19);
        Assert.assertNull(d20);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getTextMax();
        Boolean b8 = column2.getContains();
        String str9 = column2.getLowerCaseTrimmedName();
        column2.setDecimalDigits(100);
        Table table12 = column2.getTable();
        Assert.assertNull(str7);
        Assert.assertNull(b8);
        Assert.assertNull(str9);
        Assert.assertNull(table12);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        Relationship relationship0 = new Relationship();
        Double d1 = relationship0.getForeignKeyProbability();
        Table table4 = new Table("", ",");
        table4.setTrimmedName("hi!");
        String str7 = table4.getLowerCaseTrimmedName();
        String str8 = table4.toProbability();
        String str9 = table4.toFeature();
        relationship0.setFkTable(table4);
        String str11 = relationship0.getPkTableName();
        String str12 = relationship0.getSchema();
        Connection connection13 = null;
        try {
            relationship0.setRatioSatisfiedFKConstraint(connection13);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
        Assert.assertNull(str7);
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        Assert.assertNull(str11);
        Assert.assertNull(str12);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setBestAttemptPk(false);
        String str7 = column2.getName();
        column2.setTableContainsLob(true);
        column2.setEstimatedPk(false);
        String str12 = column2.getTextMin();
        column2.setKeywords();
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertNull(str12);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        column2.setHasDefault(true);
        String str23 = column2.getLongName();
        Double d24 = column2.getUniqueRatio();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        Assert.assertTrue("'" + str23 + "' != '" + ",." + "'", str23.equals(",."));
        Assert.assertNull(d24);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMax(",");
        column2.setDataTypeName(",");
        Boolean b9 = column2.isBestAttemptPk();
        Boolean b10 = column2.isDoppelganger();
        Column column13 = new Column(",", "");
        column13.setEstimatedRowCount((int) (byte) 0);
        Boolean b16 = column13.isBestAttemptPk();
        column13.setEstimatedPk(true);
        int i19 = column13.getDecimalDigits();
        String str20 = column13.getTextMin();
        Column column23 = new Column(",", "");
        column23.setEstimatedRowCount((int) (byte) 0);
        Boolean b26 = column23.isBestAttemptPk();
        column23.setEstimatedPk(true);
        int i29 = column23.getDecimalDigits();
        Relationship relationship30 = new Relationship();
        Column column31 = relationship30.getPk();
        Boolean b32 = relationship30.getDataTypeCategoryAgree();
        Table table35 = new Table("", ",");
        relationship30.setPkTable(table35);
        List<Column> list_column37 = table35.getPk();
        table35.setColumnTokenWeight();
        String str39 = table35.toProbability();
        String str40 = table35.toProbability();
        column23.setDoppelganger(table35);
        double[] d_array42 = Relationship.WEIGHTS;
        column23.setHistogramBounds(d_array42);
        column13.setHistogramBounds(d_array42);
        column2.setHistogramBounds(d_array42);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b10 + "' != '" + false + "'", b10.equals(false));
        Assert.assertTrue("'" + b16 + "' != '" + false + "'", b16.equals(false));
        Assert.assertTrue(i19 == 0);
        Assert.assertNull(str20);
        Assert.assertTrue("'" + b26 + "' != '" + false + "'", b26.equals(false));
        Assert.assertTrue(i29 == 0);
        Assert.assertNull(column31);
        Assert.assertNull(b32);
        Assert.assertNotNull(list_column37);
        Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        Assert.assertNotNull(d_array42);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        column6.setBestAttemptPk(false);
        int i13 = column6.getColumnSize();
        Table[] table_array14 = new Table[] {};
        ArrayList<Table> arraylist_table15 = new ArrayList<Table>();
        boolean b16 = Collections.addAll(arraylist_table15, table_array14);
        List<Table> list_table17 = Optimization.optimize(arraylist_table15);
        Connection connection18 = null;
        List<Table> list_table20 = Schema.getExpensiveFeatures(arraylist_table15, connection18, "");
        column6.setMinLDOtherTable(list_table20);
        column6.setKeywordSingleton();
        column6.setWidthAvg(4.37d);
        Connection connection25 = null;
        try {
            column6.isNotNull(connection25, "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey.null --> null", ",");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue(i13 == 0);
        Assert.assertNotNull(table_array14);
        Assert.assertTrue(b16 == false);
        Assert.assertNotNull(list_table17);
        Assert.assertNotNull(list_table20);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        OptimizationRelationship.upperEstimate = 1L;
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        Table table23 = new Table("", ",");
        table23.setTrimmedName("hi!");
        String str26 = table23.getLowerCaseTrimmedName();
        List<Column> list_column27 = table23.getEstimatedPk();
        column2.setDoppelganger(table23);
        table23.hasMultiplePK();
        String str30 = table23.toProbability();
        List<String> list_str31 = table23.getTokenizedLowerCaseTrimmedName();
        String str32 = table23.toString();
        DatabaseMetaData databaseMetaData33 = null;
        try {
            table23.getColumns(databaseMetaData33, "null --> null", ",.", "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey.null --> null");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        Assert.assertNull(str26);
        Assert.assertNotNull(list_column27);
        Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        Assert.assertNull(list_str31);
        Assert.assertTrue("'" + str32 + "' != '" + "," + "'", str32.equals(","));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        Column column2 = new Column(",", "");
        column2.setUniqueRatio(Double.NaN);
        column2.setEstimatedPk(false);
        Boolean b7 = column2.getTableContainsLob();
        Assert.assertNull(b7);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        Column column4 = new Column(",", "");
        column4.setEstimatedRowCount((int) (byte) 0);
        Boolean b7 = column4.isBestAttemptPk();
        column4.setEstimatedPk(true);
        int i10 = column4.getDecimalDigits();
        Relationship relationship11 = new Relationship();
        Column column12 = relationship11.getPk();
        Boolean b13 = relationship11.getDataTypeCategoryAgree();
        Table table16 = new Table("", ",");
        relationship11.setPkTable(table16);
        List<Column> list_column18 = table16.getPk();
        table16.setColumnTokenWeight();
        String str20 = table16.toProbability();
        String str21 = table16.toProbability();
        column4.setDoppelganger(table16);
        Column column23 = new Column(",", ",.", table16);
        String str24 = table16.toProbability();
        String str25 = table16.toString();
        Assert.assertTrue("'" + b7 + "' != '" + false + "'", b7.equals(false));
        Assert.assertTrue(i10 == 0);
        Assert.assertNull(column12);
        Assert.assertNull(b13);
        Assert.assertNotNull(list_column18);
        Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        Assert.assertTrue("'" + str25 + "' != '" + "," + "'", str25.equals(","));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setBestAttemptPk(false);
        Integer i7 = column2.getLD();
        column2.setEstimatedPk(true);
        Connection connection10 = null;
        try {
            column2.isNotNull(connection10, "schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey", "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(i7);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMin(",");
        Boolean b7 = column2.getTableContainsLob();
        Assert.assertNull(b7);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        column2.setEstimatedRowCount(10);
        Integer i9 = column2.getOrdinalPosition();
        column2.setOrdinalPositionEnd(10);
        Assert.assertNull(i9);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        column2.setDoppelgangerName(",");
        double[] d_array7 = column2.getHistogramBounds();
        column2.setTextMax("table\"column\"dataTypeName\"isUnique\"isUniqueConstraint\"columnSize\"decimalDigits\"isDecimal\"hasDefault\"ordinalPosition\"ordinalPositionEnd\"tableColumnCount\"tableContainsLob\"estimatedRowCount\"isAutoincrement\"isNotNull\"nullRatio\"isNullable\"uniqueRatio\"minValue\"maxValue\"avgWidth\"avgWidthBigger10\"correlationAbs\"isKeywordSingleton\"isJunctionTable\"hasMultiplePK\"levenshteinDistance\"minLDOtherTable\"isDoppelganger\"contains\"isPrimaryKey");
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertNull(d_array7);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        Table table23 = new Table("", ",");
        table23.setTrimmedName("hi!");
        String str26 = table23.getLowerCaseTrimmedName();
        List<Column> list_column27 = table23.getEstimatedPk();
        column2.setDoppelganger(table23);
        table23.hasMultiplePK();
        table23.setTrimmedName("hi!");
        table23.setTrimmedName("schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        table23.tableContainsLob();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        Assert.assertNull(str26);
        Assert.assertNotNull(list_column27);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        OptimizationRelationship.lowerEstimate = (byte) -1;
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        column2.setTextMax("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        column2.setNullable(true);
        int i12 = column2.getDataType();
        List<String> list_str13 = Setting.SYNONYM_CITY;
        column2.setTokenizedLowerCaseTrimmedName(list_str13);
        int i15 = column2.getDecimalDigits();
        String str16 = column2.toString();
        column2.setKeywords();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i12 == 0);
        Assert.assertNotNull(list_str13);
        Assert.assertTrue(i15 == 0);
        Assert.assertTrue("'" + str16 + "' != '" + ",." + "'", str16.equals(",."));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        List<Column> list_column5 = table2.getColumnList();
        String str6 = table2.toFeature();
        String str7 = table2.toFeature();
        List<Column> list_column8 = table2.getColumnList();
        Assert.assertNotNull(list_column5);
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertNotNull(list_column8);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Boolean b3 = relationship0.isEstimatedFk();
        String str4 = relationship0.toString();
        Chen chen5 = null;
        try {
            relationship0.setMediumFeatures(chen5);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertTrue("'" + b3 + "' != '" + false + "'", b3.equals(false));
        Assert.assertTrue("'" + str4 + "' != '" + "null --> null" + "'", str4.equals("null --> null"));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Table table9 = column2.getTable();
        column2.setLowerCaseTrimmedName("table\"column\"dataTypeName\"isUnique\"isUniqueConstraint\"columnSize\"decimalDigits\"isDecimal\"hasDefault\"ordinalPosition\"ordinalPositionEnd\"tableColumnCount\"tableContainsLob\"estimatedRowCount\"isAutoincrement\"isNotNull\"nullRatio\"isNullable\"uniqueRatio\"minValue\"maxValue\"avgWidth\"avgWidthBigger10\"correlationAbs\"isKeywordSingleton\"isJunctionTable\"hasMultiplePK\"levenshteinDistance\"minLDOtherTable\"isDoppelganger\"contains\"isPrimaryKey");
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(table9);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMin(",");
        String str7 = column2.getLowerCaseTrimmedName();
        column2.setNullRatio(100.0d);
        Boolean b10 = column2.getContains();
        Double d11 = column2.getValueMax();
        String str12 = column2.getTrimmedName();
        column2.setTableColumnCount(10);
        String str15 = column2.getLowerCaseTrimmedName();
        column2.setEstimatedRowCount((int) (byte) -1);
        Assert.assertNull(str7);
        Assert.assertNull(b10);
        Assert.assertNull(d11);
        Assert.assertNull(str12);
        Assert.assertNull(str15);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        Relationship relationship0 = new Relationship();
        Double d1 = relationship0.getForeignKeyProbability();
        Table table4 = new Table("", ",");
        table4.setTrimmedName("hi!");
        String str7 = table4.getLowerCaseTrimmedName();
        String str8 = table4.toProbability();
        String str9 = table4.toFeature();
        relationship0.setFkTable(table4);
        String str11 = relationship0.getPkTableName();
        relationship0.setSchema("\"");
        Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
        Assert.assertNull(str7);
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        Assert.assertNull(str11);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setLowerCaseTrimmedName("");
        List<Column> list_column10 = table5.getBestAttemptPk();
        List<String> list_str11 = Setting.SYNONYM_CITY;
        table5.setTokenizedLowerCaseTrimmedName(list_str11);
        table5.tableContainsLob();
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNotNull(list_column10);
        Assert.assertNotNull(list_str11);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        String str6 = column2.getName();
        Table[] table_array7 = new Table[] {};
        ArrayList<Table> arraylist_table8 = new ArrayList<Table>();
        boolean b9 = Collections.addAll(arraylist_table8, table_array7);
        List<Table> list_table10 = Optimization.optimize(arraylist_table8);
        column2.setMinLDOtherTable(arraylist_table8);
        Integer i12 = column2.getRowCount();
        int i13 = column2.getDataType();
        String str14 = column2.getDoppelgangerName();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        Assert.assertNotNull(table_array7);
        Assert.assertTrue(b9 == false);
        Assert.assertNotNull(list_table10);
        Assert.assertTrue("'" + i12 + "' != '" + 0 + "'", i12.equals(0));
        Assert.assertTrue(i13 == 0);
        Assert.assertNull(str14);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        Table[] table_array0 = new Table[] {};
        ArrayList<Table> arraylist_table1 = new ArrayList<Table>();
        boolean b2 = Collections.addAll(arraylist_table1, table_array0);
        List<Table> list_table3 = Optimization.optimize(arraylist_table1);
        Connection connection4 = null;
        List<Table> list_table6 = Schema.getExpensiveFeatures(arraylist_table1, connection4, "");
        List<Table> list_table7 = Optimization.optimize(list_table6);
        double d8 = Accuracy.getPkRecall(list_table7);
        List<Table> list_table9 = Optimization.optimize(list_table7);
        List<Table> list_table10 = Optimization.optimize(list_table7);
        Assert.assertNotNull(table_array0);
        Assert.assertTrue(b2 == false);
        Assert.assertNotNull(list_table3);
        Assert.assertNotNull(list_table6);
        Assert.assertNotNull(list_table7);
        Assert.assertEquals(d8, Double.NaN, 0);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table10);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        OptimizationRelationship.expectedCount = (-1.5000000000000004d);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        Boolean b9 = column2.getContains();
        String str10 = column2.getDataTypeName();
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b9);
        Assert.assertNull(str10);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        Table table2 = new Table("", ",");
        List<String> list_str3 = table2.getTokenizedLowerCaseTrimmedName();
        String str4 = table2.toString();
        List<Column> list_column5 = table2.getBestAttemptPk();
        List<String> list_str6 = table2.getTokenizedLowerCaseTrimmedName();
        List<String> list_str7 = table2.getTokenizedLowerCaseTrimmedName();
        String str8 = table2.toProbability();
        DatabaseMetaData databaseMetaData9 = null;
        try {
            table2.getUniqueConstraint(databaseMetaData9, "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", "", "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(list_str3);
        Assert.assertTrue("'" + str4 + "' != '" + "," + "'", str4.equals(","));
        Assert.assertNotNull(list_column5);
        Assert.assertNull(list_str6);
        Assert.assertNull(list_str7);
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        Column column2 = new Column(",", "");
        column2.setLowerCaseTrimmedName(",.");
        String str5 = column2.getTextMin();
        Double d6 = column2.getNullRatio();
        Boolean b7 = column2.isDoppelganger();
        Boolean b8 = column2.isDoppelganger();
        column2.setAutoincrement(false);
        column2.setDoppelgangerName("table\"column\"dataTypeName\"isUnique\"isUniqueConstraint\"columnSize\"decimalDigits\"isDecimal\"hasDefault\"ordinalPosition\"ordinalPositionEnd\"tableColumnCount\"tableContainsLob\"estimatedRowCount\"isAutoincrement\"isNotNull\"nullRatio\"isNullable\"uniqueRatio\"minValue\"maxValue\"avgWidth\"avgWidthBigger10\"correlationAbs\"isKeywordSingleton\"isJunctionTable\"hasMultiplePK\"levenshteinDistance\"minLDOtherTable\"isDoppelganger\"contains\"isPrimaryKey");
        Assert.assertNull(str5);
        Assert.assertNull(d6);
        Assert.assertTrue("'" + b7 + "' != '" + false + "'", b7.equals(false));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = column6.isBestAttemptPk();
        Table[] table_array12 = new Table[] {};
        ArrayList<Table> arraylist_table13 = new ArrayList<Table>();
        boolean b14 = Collections.addAll(arraylist_table13, table_array12);
        List<Table> list_table15 = Optimization.optimize(arraylist_table13);
        column6.setMinLDOtherTable(arraylist_table13);
        String str17 = column6.getLowerCaseTrimmedName();
        Boolean b18 = column6.isPrimaryKey();
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        Assert.assertNotNull(table_array12);
        Assert.assertTrue(b14 == false);
        Assert.assertNotNull(list_table15);
        Assert.assertNull(str17);
        Assert.assertTrue("'" + b18 + "' != '" + false + "'", b18.equals(false));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        Connection connection0 = null;
        Table[] table_array3 = new Table[] {};
        ArrayList<Table> arraylist_table4 = new ArrayList<Table>();
        boolean b5 = Collections.addAll(arraylist_table4, table_array3);
        List<Table> list_table6 = Optimization.optimize(arraylist_table4);
        Connection connection7 = null;
        List<Table> list_table9 = Schema.getExpensiveFeatures(arraylist_table4, connection7, "");
        List<Table> list_table10 = Optimization.optimize(arraylist_table4);
        Connection connection11 = null;
        List<Table> list_table13 = Schema.getExpensiveFeatures(list_table10, connection11, ",");
        Connection connection14 = null;
        List<Table> list_table16 = Schema.getExpensiveFeatures(list_table13, connection14, "null --> null");
        List<Relationship> list_relationship18 = Schema.getRelationships(connection0, "", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", list_table16, true);
        List<CompoundRelationship> list_compoundRelationship19 = CompoundRelationship.buildFrom(list_relationship18);
        Table table22 = new Table("", ",");
        table22.setTrimmedName("hi!");
        String str25 = table22.getLowerCaseTrimmedName();
        Table[] table_array26 = new Table[] {};
        ArrayList<Table> arraylist_table27 = new ArrayList<Table>();
        boolean b28 = Collections.addAll(arraylist_table27, table_array26);
        List<Table> list_table29 = Optimization.optimize(arraylist_table27);
        Connection connection30 = null;
        List<Table> list_table32 = Schema.getExpensiveFeatures(arraylist_table27, connection30, "");
        table22.isJunctionTable(list_table32);
        List<Table> list_table34 = Optimization.optimize(list_table32);
        int i35 = OptimizationRelationship.optimize(list_relationship18, list_table32);
        Connection connection36 = null;
        List<Table> list_table38 = Schema.getExpensiveFeatures(list_table32, connection36, "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey");
        Connection connection39 = null;
        List<Table> list_table41 = Schema.getExpensiveFeatures(list_table38, connection39, "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        double d42 = Accuracy.getPkPrecision(list_table38);
        Assert.assertNotNull(table_array3);
        Assert.assertTrue(b5 == false);
        Assert.assertNotNull(list_table6);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table10);
        Assert.assertNotNull(list_table13);
        Assert.assertNotNull(list_table16);
        Assert.assertNotNull(list_relationship18);
        Assert.assertNotNull(list_compoundRelationship19);
        Assert.assertNull(str25);
        Assert.assertNotNull(table_array26);
        Assert.assertTrue(b28 == false);
        Assert.assertNotNull(list_table29);
        Assert.assertNotNull(list_table32);
        Assert.assertNotNull(list_table34);
        Assert.assertTrue(i35 == 0);
        Assert.assertNotNull(list_table38);
        Assert.assertNotNull(list_table41);
        Assert.assertEquals(d42, Double.NaN, 0);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        Column column2 = new Column(",", "");
        column2.setUniqueRatio(0.0d);
        column2.setNullRatio(0.0d);
        column2.setTableContainsLob(false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        int i21 = column2.getDataType();
        String str22 = column2.getTextMax();
        column2.setColumnSize((int) (short) 1);
        Connection connection25 = null;
        try {
            column2.isNotNull(connection25, "schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey", "");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        Assert.assertTrue(i21 == 0);
        Assert.assertNull(str22);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        Column column2 = new Column("null --> null", "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        Double d3 = column2.getValueMax();
        column2.setTrimmedName("tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey");
        int i6 = column2.getDataType();
        Assert.assertNull(d3);
        Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Boolean b4 = relationship0.isEstimatedFk();
        Relationship relationship5 = new Relationship();
        Column column6 = relationship5.getPk();
        Boolean b7 = relationship5.getDataTypeCategoryAgree();
        Table table10 = new Table("", ",");
        relationship5.setPkTable(table10);
        List<Column> list_column12 = table10.getPk();
        table10.setColumnTokenWeight();
        String str14 = table10.toProbability();
        table10.setLowerCaseTrimmedName("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        relationship0.setFkTable(table10);
        Boolean b18 = relationship0.isTheSameColumn();
        Boolean b19 = relationship0.getDataTypeCategoryAgree();
        relationship0.setSchema("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey.null --> null");
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        Assert.assertNull(column6);
        Assert.assertNull(b7);
        Assert.assertNotNull(list_column12);
        Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        Assert.assertNull(b18);
        Assert.assertNull(b19);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        OptimizationRelationship.upperEstimate = 10;
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setColumnTokenWeight();
        List<String> list_str9 = null;
        table5.setTokenizedLowerCaseTrimmedName(list_str9);
        table5.setColumnTokenWeight();
        List<String> list_str12 = table5.getTokenizedLowerCaseTrimmedName();
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNull(list_str12);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        List<Column> list_column5 = table2.getColumnList();
        String str6 = table2.toFeature();
        String str7 = table2.toFeature();
        Column column9 = table2.getColumn("hi!");
        List<Column> list_column10 = table2.getBestAttemptPk();
        Connection connection11 = null;
        Table[] table_array14 = new Table[] {};
        ArrayList<Table> arraylist_table15 = new ArrayList<Table>();
        boolean b16 = Collections.addAll(arraylist_table15, table_array14);
        List<Table> list_table17 = Optimization.optimize(arraylist_table15);
        Connection connection18 = null;
        List<Table> list_table20 = Schema.getExpensiveFeatures(arraylist_table15, connection18, "");
        List<Table> list_table21 = Optimization.optimize(arraylist_table15);
        List<Relationship> list_relationship23 = Schema.getRelationships(connection11, "\"", "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", list_table21, false);
        Column column26 = new Column(",", "");
        column26.setEstimatedRowCount((int) (byte) 0);
        Boolean b29 = column26.isBestAttemptPk();
        column26.setEstimatedPk(true);
        int i32 = column26.getDecimalDigits();
        Relationship relationship33 = new Relationship();
        Column column34 = relationship33.getPk();
        Boolean b35 = relationship33.getDataTypeCategoryAgree();
        Table table38 = new Table("", ",");
        relationship33.setPkTable(table38);
        List<Column> list_column40 = table38.getPk();
        table38.setColumnTokenWeight();
        String str42 = table38.toProbability();
        String str43 = table38.toProbability();
        column26.setDoppelganger(table38);
        Table[] table_array45 = new Table[] {};
        ArrayList<Table> arraylist_table46 = new ArrayList<Table>();
        boolean b47 = Collections.addAll(arraylist_table46, table_array45);
        List<Table> list_table48 = Optimization.optimize(arraylist_table46);
        Connection connection49 = null;
        List<Table> list_table51 = Schema.getExpensiveFeatures(arraylist_table46, connection49, "");
        List<Table> list_table52 = Optimization.optimize(arraylist_table46);
        Connection connection53 = null;
        List<Table> list_table55 = Schema.getExpensiveFeatures(list_table52, connection53, ",");
        table38.isJunctionTable(list_table52);
        int i57 = OptimizationRelationship.optimize(list_relationship23, list_table52);
        table2.isJunctionTable(list_table52);
        Assert.assertNotNull(list_column5);
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertNull(column9);
        Assert.assertNotNull(list_column10);
        Assert.assertNotNull(table_array14);
        Assert.assertTrue(b16 == false);
        Assert.assertNotNull(list_table17);
        Assert.assertNotNull(list_table20);
        Assert.assertNotNull(list_table21);
        Assert.assertNotNull(list_relationship23);
        Assert.assertTrue("'" + b29 + "' != '" + false + "'", b29.equals(false));
        Assert.assertTrue(i32 == 0);
        Assert.assertNull(column34);
        Assert.assertNull(b35);
        Assert.assertNotNull(list_column40);
        Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        Assert.assertNotNull(table_array45);
        Assert.assertTrue(b47 == false);
        Assert.assertNotNull(list_table48);
        Assert.assertNotNull(list_table51);
        Assert.assertNotNull(list_table52);
        Assert.assertNotNull(list_table55);
        Assert.assertTrue(i57 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        column2.setTextMax("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        column2.setNullable(true);
        column2.setTableColumnCount(-1);
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        Relationship relationship0 = new Relationship();
        String str1 = relationship0.getSchema();
        Boolean b2 = relationship0.isTheSameColumn();
        relationship0.setForeignKeyProbability(10.0d);
        Column column7 = new Column(",", "");
        column7.setAutoincrement(false);
        column7.setTextMax(",");
        column7.setDataTypeName(",");
        column7.setTrimmedName("");
        relationship0.setPk(column7);
        column7.setUniqueConstraint(true);
        column7.setDoppelgangerName("tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey");
        column7.setUniqueRatio(0.0d);
        List<String> list_str23 = column7.getTokenizedLowerCaseTrimmedName();
        Assert.assertNull(str1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_str23);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        String str6 = table2.toProbability();
        String str7 = table2.toFeature();
        Column column10 = new Column(",", "");
        column10.setEstimatedRowCount((int) (byte) 0);
        Boolean b13 = column10.isBestAttemptPk();
        column10.setEstimatedPk(true);
        int i16 = column10.getDecimalDigits();
        Relationship relationship17 = new Relationship();
        Column column18 = relationship17.getPk();
        Boolean b19 = relationship17.getDataTypeCategoryAgree();
        Table table22 = new Table("", ",");
        relationship17.setPkTable(table22);
        List<Column> list_column24 = table22.getPk();
        table22.setColumnTokenWeight();
        String str26 = table22.toProbability();
        String str27 = table22.toProbability();
        column10.setDoppelganger(table22);
        List<String> list_str29 = column10.getTokenizedName();
        table2.setTokenizedLowerCaseTrimmedName(list_str29);
        Assert.assertNull(str5);
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertTrue("'" + b13 + "' != '" + false + "'", b13.equals(false));
        Assert.assertTrue(i16 == 0);
        Assert.assertNull(column18);
        Assert.assertNull(b19);
        Assert.assertNotNull(list_column24);
        Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        Assert.assertNotNull(list_str29);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        Relationship relationship2 = new Relationship();
        Column column3 = relationship2.getPk();
        String str4 = relationship2.getSchema();
        Boolean b5 = relationship2.getDataTypeCategoryAgree();
        Column column8 = new Column(",", "");
        column8.setEstimatedRowCount((int) (byte) 0);
        Boolean b11 = column8.isBestAttemptPk();
        relationship2.setPk(column8);
        Column column15 = new Column(",", "");
        int i16 = column15.getColumnSize();
        int i17 = column15.getDataType();
        relationship2.setPk(column15);
        Table table21 = new Table(",", ",");
        List<Column> list_column22 = table21.getBestAttemptPk();
        column15.setDoppelganger(table21);
        Column column24 = new Column("hi!", "", table21);
        String str25 = table21.getName();
        Assert.assertNull(column3);
        Assert.assertNull(str4);
        Assert.assertNull(b5);
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        Assert.assertTrue(i16 == 0);
        Assert.assertTrue(i17 == 0);
        Assert.assertNotNull(list_column22);
        Assert.assertTrue("'" + str25 + "' != '" + "," + "'", str25.equals(","));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        Boolean b9 = column2.getContains();
        column2.setDataType(10);
        column2.setKeywordSingleton();
        column2.setWidthAvg(10.0d);
        column2.setHasDefault(true);
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b9);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        Boolean b9 = column2.getContains();
        column2.setDataType(10);
        column2.setDataTypeName("");
        column2.setWidthAvg(1.0d);
        List<String> list_str16 = column2.getTokenizedName();
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b9);
        Assert.assertNotNull(list_str16);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        column2.setTextMax("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        column2.setNullable(true);
        int i12 = column2.getDataType();
        List<String> list_str13 = Setting.SYNONYM_CITY;
        column2.setTokenizedLowerCaseTrimmedName(list_str13);
        int i15 = column2.getDecimalDigits();
        String str16 = column2.toString();
        Boolean b17 = column2.isDoppelganger();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i12 == 0);
        Assert.assertNotNull(list_str13);
        Assert.assertTrue(i15 == 0);
        Assert.assertTrue("'" + str16 + "' != '" + ",." + "'", str16.equals(",."));
        Assert.assertTrue("'" + b17 + "' != '" + false + "'", b17.equals(false));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        Relationship relationship0 = new Relationship();
        String str1 = relationship0.getSchema();
        Boolean b2 = relationship0.isEstimatedFk();
        String str3 = relationship0.getSchema();
        Relationship relationship4 = new Relationship(relationship0);
        String str5 = relationship4.getPkTableName();
        Boolean b6 = relationship4.isTheSameColumn();
        Chen chen7 = null;
        try {
            relationship4.setMediumFeatures(chen7);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(str1);
        Assert.assertTrue("'" + b2 + "' != '" + false + "'", b2.equals(false));
        Assert.assertNull(str3);
        Assert.assertNull(str5);
        Assert.assertNull(b6);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        Relationship relationship0 = new Relationship();
        String str1 = relationship0.getSchema();
        Boolean b2 = relationship0.isEstimatedFk();
        String str3 = relationship0.getSchema();
        Relationship relationship4 = new Relationship(relationship0);
        String str5 = relationship4.getPkTableName();
        Boolean b6 = relationship4.isTheSameColumn();
        Relationship relationship7 = new Relationship();
        Column column8 = relationship7.getPk();
        Boolean b9 = relationship7.getDataTypeCategoryAgree();
        Boolean b10 = relationship7.isEstimatedFk();
        String str11 = relationship7.toString();
        Boolean b12 = relationship7.getDataTypeCategoryAgree();
        Double d13 = relationship7.getForeignKeyProbability();
        int i14 = relationship4.compareTo(relationship7);
        Assert.assertNull(str1);
        Assert.assertTrue("'" + b2 + "' != '" + false + "'", b2.equals(false));
        Assert.assertNull(str3);
        Assert.assertNull(str5);
        Assert.assertNull(b6);
        Assert.assertNull(column8);
        Assert.assertNull(b9);
        Assert.assertTrue("'" + b10 + "' != '" + false + "'", b10.equals(false));
        Assert.assertTrue("'" + str11 + "' != '" + "null --> null" + "'", str11.equals("null --> null"));
        Assert.assertNull(b12);
        Assert.assertTrue("'" + d13 + "' != '" + 0.0d + "'", d13.equals(0.0d));
        Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        Relationship relationship0 = new Relationship();
        String str1 = relationship0.getSchema();
        Boolean b2 = relationship0.isTheSameColumn();
        relationship0.setForeignKeyProbability(10.0d);
        Column column7 = new Column(",", "");
        column7.setAutoincrement(false);
        column7.setTextMax(",");
        column7.setDataTypeName(",");
        column7.setTrimmedName("");
        relationship0.setPk(column7);
        String str17 = relationship0.getFkTableName();
        Boolean b18 = relationship0.isTheSameColumn();
        Assert.assertNull(str1);
        Assert.assertNull(b2);
        Assert.assertNull(str17);
        Assert.assertNull(b18);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        String str4 = column2.getDataTypeName();
        column2.setWidthAvg(-1.0d);
        column2.setJunctionTable(false);
        column2.setKeywordSingleton();
        Assert.assertTrue(i3 == 0);
        Assert.assertNull(str4);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMin(",");
        String str7 = column2.getLowerCaseTrimmedName();
        column2.setNullRatio(100.0d);
        column2.setEstimatedPk(true);
        String str12 = column2.getDataTypeName();
        double[] d_array13 = column2.getHistogramBounds();
        column2.setOrdinalPosition((int) (short) 1);
        Assert.assertNull(str7);
        Assert.assertNull(str12);
        Assert.assertNull(d_array13);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setBestAttemptPk(false);
        String str7 = column2.getName();
        column2.setTableContainsLob(true);
        column2.setEstimatedPk(false);
        column2.setNullable(true);
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        Connection connection0 = null;
        Connection connection3 = null;
        Table[] table_array6 = new Table[] {};
        ArrayList<Table> arraylist_table7 = new ArrayList<Table>();
        boolean b8 = Collections.addAll(arraylist_table7, table_array6);
        List<Table> list_table9 = Optimization.optimize(arraylist_table7);
        Connection connection10 = null;
        List<Table> list_table12 = Schema.getExpensiveFeatures(arraylist_table7, connection10, "");
        List<Table> list_table13 = Optimization.optimize(arraylist_table7);
        Connection connection14 = null;
        List<Table> list_table16 = Schema.getExpensiveFeatures(list_table13, connection14, ",");
        Connection connection17 = null;
        List<Table> list_table19 = Schema.getExpensiveFeatures(list_table16, connection17, "null --> null");
        List<Relationship> list_relationship21 = Schema.getRelationships(connection3, "", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", list_table19, true);
        List<CompoundRelationship> list_compoundRelationship22 = CompoundRelationship.buildFrom(list_relationship21);
        double d23 = Accuracy.getFkPrecision(list_relationship21);
        Table[] table_array24 = new Table[] {};
        ArrayList<Table> arraylist_table25 = new ArrayList<Table>();
        boolean b26 = Collections.addAll(arraylist_table25, table_array24);
        List<Table> list_table27 = Optimization.optimize(arraylist_table25);
        Connection connection28 = null;
        List<Table> list_table30 = Schema.getExpensiveFeatures(arraylist_table25, connection28, "");
        List<Table> list_table31 = Optimization.optimize(list_table30);
        int i32 = OptimizationRelationship.optimize(list_relationship21, list_table31);
        Table table35 = new Table("", ",");
        table35.setTrimmedName("hi!");
        String str38 = table35.getLowerCaseTrimmedName();
        List<Column> list_column39 = table35.getEstimatedPk();
        table35.setLowerCaseTrimmedName("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        String str42 = table35.getLowerCaseTrimmedName();
        Relationship relationship43 = new Relationship();
        Column column44 = relationship43.getPk();
        String str45 = relationship43.getSchema();
        Boolean b46 = relationship43.getDataTypeCategoryAgree();
        Column column49 = new Column(",", "");
        column49.setEstimatedRowCount((int) (byte) 0);
        Boolean b52 = column49.isBestAttemptPk();
        relationship43.setPk(column49);
        Boolean b54 = column49.isBestAttemptPk();
        Table[] table_array55 = new Table[] {};
        ArrayList<Table> arraylist_table56 = new ArrayList<Table>();
        boolean b57 = Collections.addAll(arraylist_table56, table_array55);
        List<Table> list_table58 = Optimization.optimize(arraylist_table56);
        column49.setMinLDOtherTable(arraylist_table56);
        table35.isJunctionTable(arraylist_table56);
        int i61 = OptimizationRelationship.optimize(list_relationship21, arraylist_table56);
        Table[] table_array62 = new Table[] {};
        ArrayList<Table> arraylist_table63 = new ArrayList<Table>();
        boolean b64 = Collections.addAll(arraylist_table63, table_array62);
        List<Table> list_table65 = Optimization.optimize(arraylist_table63);
        Connection connection66 = null;
        List<Table> list_table68 = Schema.getExpensiveFeatures(arraylist_table63, connection66, "");
        List<Table> list_table69 = Optimization.optimize(arraylist_table63);
        Connection connection70 = null;
        List<Table> list_table72 = Schema.getExpensiveFeatures(list_table69, connection70, ",");
        Connection connection73 = null;
        List<Table> list_table75 = Schema.getExpensiveFeatures(list_table72, connection73, "null --> null");
        double d76 = Accuracy.getPkRecall(list_table72);
        double d77 = Accuracy.getPkPrecision(list_table72);
        List<Table> list_table78 = Optimization.optimize(list_table72);
        int i79 = OptimizationRelationship.optimize(list_relationship21, list_table78);
        List<Relationship> list_relationship81 = Schema.getRelationships(connection0, "null --> null", ",.", list_table78, true);
        double d82 = Accuracy.getFkPrecision(list_relationship81);
        Assert.assertNotNull(table_array6);
        Assert.assertTrue(b8 == false);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table12);
        Assert.assertNotNull(list_table13);
        Assert.assertNotNull(list_table16);
        Assert.assertNotNull(list_table19);
        Assert.assertNotNull(list_relationship21);
        Assert.assertNotNull(list_compoundRelationship22);
        Assert.assertEquals(d23, Double.NaN, 0);
        Assert.assertNotNull(table_array24);
        Assert.assertTrue(b26 == false);
        Assert.assertNotNull(list_table27);
        Assert.assertNotNull(list_table30);
        Assert.assertNotNull(list_table31);
        Assert.assertTrue(i32 == 0);
        Assert.assertNull(str38);
        Assert.assertNotNull(list_column39);
        Assert.assertTrue("'" + str42 + "' != '" + "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey" + "'", str42.equals("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey"));
        Assert.assertNull(column44);
        Assert.assertNull(str45);
        Assert.assertNull(b46);
        Assert.assertTrue("'" + b52 + "' != '" + false + "'", b52.equals(false));
        Assert.assertTrue("'" + b54 + "' != '" + false + "'", b54.equals(false));
        Assert.assertNotNull(table_array55);
        Assert.assertTrue(b57 == false);
        Assert.assertNotNull(list_table58);
        Assert.assertTrue(i61 == 0);
        Assert.assertNotNull(table_array62);
        Assert.assertTrue(b64 == false);
        Assert.assertNotNull(list_table65);
        Assert.assertNotNull(list_table68);
        Assert.assertNotNull(list_table69);
        Assert.assertNotNull(list_table72);
        Assert.assertNotNull(list_table75);
        Assert.assertEquals(d76, Double.NaN, 0);
        Assert.assertEquals(d77, Double.NaN, 0);
        Assert.assertNotNull(list_table78);
        Assert.assertTrue(i79 == 0);
        Assert.assertNotNull(list_relationship81);
        Assert.assertEquals(d82, Double.NaN, 0);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        column2.setDataType(0);
        column2.setKeywordSingleton();
        int i12 = column2.getDecimalDigits();
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        column2.setDoppelgangerName(",");
        String str7 = column2.getLongName();
        Double d8 = column2.getValueMin();
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertNull(d8);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Boolean b4 = relationship0.isEstimatedFk();
        Relationship relationship5 = new Relationship();
        Column column6 = relationship5.getPk();
        Boolean b7 = relationship5.getDataTypeCategoryAgree();
        Table table10 = new Table("", ",");
        relationship5.setPkTable(table10);
        List<Column> list_column12 = table10.getPk();
        table10.setColumnTokenWeight();
        String str14 = table10.toProbability();
        table10.setLowerCaseTrimmedName("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        relationship0.setFkTable(table10);
        Boolean b18 = relationship0.isTheSameColumn();
        Boolean b19 = relationship0.getDataTypeCategoryAgree();
        Column column20 = relationship0.getPk();
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        Assert.assertNull(column6);
        Assert.assertNull(b7);
        Assert.assertNotNull(list_column12);
        Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        Assert.assertNull(b18);
        Assert.assertNull(b19);
        Assert.assertNull(column20);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMax(",");
        String str7 = column2.getLongName();
        double[] d_array8 = column2.getHistogramBounds();
        Table[] table_array9 = new Table[] {};
        ArrayList<Table> arraylist_table10 = new ArrayList<Table>();
        boolean b11 = Collections.addAll(arraylist_table10, table_array9);
        List<Table> list_table12 = Optimization.optimize(arraylist_table10);
        Connection connection13 = null;
        List<Table> list_table15 = Schema.getExpensiveFeatures(arraylist_table10, connection13, "");
        List<Table> list_table16 = Optimization.optimize(list_table15);
        Connection connection17 = null;
        List<Table> list_table19 = Schema.getExpensiveFeatures(list_table15, connection17, "hi!");
        Connection connection20 = null;
        List<Table> list_table22 = Schema.getExpensiveFeatures(list_table19, connection20, "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        column2.setMinLDOtherTable(list_table22);
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertNull(d_array8);
        Assert.assertNotNull(table_array9);
        Assert.assertTrue(b11 == false);
        Assert.assertNotNull(list_table12);
        Assert.assertNotNull(list_table15);
        Assert.assertNotNull(list_table16);
        Assert.assertNotNull(list_table19);
        Assert.assertNotNull(list_table22);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        Table table2 = new Table("hi!", ",");
        String str3 = table2.toProbability();
        String str4 = table2.toFeature();
        List<String> list_str5 = table2.getTokenizedLowerCaseTrimmedName();
        try {
            String str8 = table2.toQuery(' ', '#');
            Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (IllegalStateException e) {
        }
        Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        Assert.assertNull(list_str5);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setLowerCaseTrimmedName("");
        List<Column> list_column10 = table5.getBestAttemptPk();
        String str11 = table5.toFeature();
        String str12 = table5.getTrimmedName();
        String str13 = table5.getLowerCaseTrimmedName();
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNotNull(list_column10);
        Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        Assert.assertNull(str12);
        Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        column2.setTextMax("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        column2.setNullable(true);
        int i12 = column2.getDataType();
        Column column15 = new Column(",", "");
        int i16 = column15.getColumnSize();
        String str17 = column15.getLongName();
        boolean b18 = column2.equals(column15);
        column15.setDataTypeName("schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        String str21 = column15.toString();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i12 == 0);
        Assert.assertTrue(i16 == 0);
        Assert.assertTrue("'" + str17 + "' != '" + ",." + "'", str17.equals(",."));
        Assert.assertTrue(b18 == true);
        Assert.assertTrue("'" + str21 + "' != '" + ",." + "'", str21.equals(",."));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Double d11 = column6.getWidthAvg();
        Double d12 = column6.getWidthAvg();
        column6.setOrdinalPosition((int) (short) 0);
        String str15 = column6.getTextMax();
        column6.setEstimatedRowCount((int) (short) 0);
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertNull(d11);
        Assert.assertNull(d12);
        Assert.assertNull(str15);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        Relationship relationship0 = new Relationship();
        Double d1 = relationship0.getForeignKeyProbability();
        relationship0.setForeignKeyProbability(0.9d);
        Boolean b4 = relationship0.isForeignKey();
        Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        column2.setDoppelgangerName(",");
        Connection connection7 = null;
        try {
            column2.isUnique(connection7, "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        Column column2 = new Column(",", "");
        column2.setUniqueRatio(0.0d);
        column2.setNullRatio(0.0d);
        column2.setNullRatio(0.9d);
        String str9 = column2.toString();
        Assert.assertTrue("'" + str9 + "' != '" + ",." + "'", str9.equals(",."));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = column6.isBestAttemptPk();
        column6.setDataTypeName("tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey");
        Integer i14 = column6.getOrdinalPosition();
        Boolean b15 = column6.isKeywordSingleton();
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        Assert.assertNull(i14);
        Assert.assertNull(b15);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        int i5 = column2.getDecimalDigits();
        column2.setHasMultiplePK(true);
        Boolean b8 = column2.isBestAttemptPk();
        column2.setKeywordSingleton();
        column2.setDataType((int) (short) 100);
        String str12 = column2.toString();
        Boolean b13 = column2.isEstimatedPk();
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(i5 == 0);
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertTrue("'" + str12 + "' != '" + ",." + "'", str12.equals(",."));
        Assert.assertTrue("'" + b13 + "' != '" + false + "'", b13.equals(false));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        OptimizationRelationship.lowerEstimate = 100.0d;
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        Table table23 = new Table("", ",");
        table23.setTrimmedName("hi!");
        String str26 = table23.getLowerCaseTrimmedName();
        List<Column> list_column27 = table23.getEstimatedPk();
        column2.setDoppelganger(table23);
        List<Column> list_column29 = table23.getColumnList();
        DatabaseMetaData databaseMetaData30 = null;
        try {
            table23.getColumns(databaseMetaData30, "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey", "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        Assert.assertNull(str26);
        Assert.assertNotNull(list_column27);
        Assert.assertNotNull(list_column29);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMin(",");
        String str7 = column2.getLowerCaseTrimmedName();
        column2.setNullRatio(100.0d);
        column2.setEstimatedPk(true);
        String str12 = column2.getDataTypeName();
        Double d13 = column2.getValueMin();
        column2.setOrdinalPositionEnd(-1);
        column2.setTableColumnCount(0);
        Assert.assertNull(str7);
        Assert.assertNull(str12);
        Assert.assertTrue("'" + d13 + "' != '" + (-1.0d) + "'", d13.equals((-1.0d)));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = column6.isDoppelganger();
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        String str4 = relationship0.getFkTableName();
        Column column7 = new Column(",", "");
        int i8 = column7.getColumnSize();
        int i9 = column7.getDataType();
        int i10 = column7.getDecimalDigits();
        column7.setHasMultiplePK(true);
        Boolean b13 = column7.isBestAttemptPk();
        Relationship relationship14 = new Relationship();
        Column column15 = relationship14.getPk();
        Boolean b16 = relationship14.getDataTypeCategoryAgree();
        Table table19 = new Table("", ",");
        relationship14.setPkTable(table19);
        column7.setDoppelganger(table19);
        column7.setUniqueRatio(Double.NaN);
        relationship0.setPk(column7);
        relationship0.setEstimatedFk(true);
        Boolean b27 = relationship0.isTheSameColumn();
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertNull(str4);
        Assert.assertTrue(i8 == 0);
        Assert.assertTrue(i9 == 0);
        Assert.assertTrue(i10 == 0);
        Assert.assertTrue("'" + b13 + "' != '" + false + "'", b13.equals(false));
        Assert.assertNull(column15);
        Assert.assertNull(b16);
        Assert.assertNull(b27);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        Table[] table_array6 = new Table[] {};
        ArrayList<Table> arraylist_table7 = new ArrayList<Table>();
        boolean b8 = Collections.addAll(arraylist_table7, table_array6);
        List<Table> list_table9 = Optimization.optimize(arraylist_table7);
        Connection connection10 = null;
        List<Table> list_table12 = Schema.getExpensiveFeatures(arraylist_table7, connection10, "");
        table2.isJunctionTable(list_table12);
        List<Column> list_column14 = table2.getColumnList();
        Assert.assertNull(str5);
        Assert.assertNotNull(table_array6);
        Assert.assertTrue(b8 == false);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table12);
        Assert.assertNotNull(list_column14);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        String str4 = column2.getLongName();
        column2.setColumnSize((int) '#');
        column2.setTableContainsLob(true);
        column2.setWidthAvg(-1.5000000000000004d);
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue("'" + str4 + "' != '" + ",." + "'", str4.equals(",."));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        String str4 = column2.getDataTypeName();
        Double d5 = column2.getNullRatio();
        String str6 = column2.toString();
        column2.setEstimatedPk(true);
        Assert.assertTrue(i3 == 0);
        Assert.assertNull(str4);
        Assert.assertNull(d5);
        Assert.assertTrue("'" + str6 + "' != '" + ",." + "'", str6.equals(",."));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Double d11 = column6.getWidthAvg();
        Double d12 = column6.getWidthAvg();
        String str13 = column6.getName();
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertNull(d11);
        Assert.assertNull(d12);
        Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setPrimaryKey(true);
        column2.setKeywordSingleton();
        String str8 = column2.getTextMin();
        column2.setNullRatio(5.859999999999999d);
        Integer i11 = column2.getOrdinalPosition();
        Assert.assertNull(str8);
        Assert.assertNull(i11);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        Table table23 = new Table("", ",");
        table23.setTrimmedName("hi!");
        String str26 = table23.getLowerCaseTrimmedName();
        List<Column> list_column27 = table23.getEstimatedPk();
        column2.setDoppelganger(table23);
        List<Column> list_column29 = table23.getColumnList();
        List<Column> list_column30 = table23.getBestAttemptPk();
        List<String> list_str31 = table23.getTokenizedLowerCaseTrimmedName();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        Assert.assertNull(str26);
        Assert.assertNotNull(list_column27);
        Assert.assertNotNull(list_column29);
        Assert.assertNotNull(list_column30);
        Assert.assertNull(list_str31);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMax(",");
        column2.setNullRatio(4.37d);
        column2.setBestAttemptPk(true);
        Table table11 = null;
        try {
            column2.setDoppelganger(table11);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.isTheSameColumn();
        String str3 = relationship0.getPkTableName();
        Boolean b4 = relationship0.isForeignKey();
        Relationship relationship5 = new Relationship(relationship0);
        Connection connection6 = null;
        try {
            relationship0.setRatioSatisfiedFKConstraint(connection6);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNull(str3);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        Column column10 = new Column(",", "");
        column10.setEstimatedRowCount((int) (byte) 0);
        List<String> list_str13 = column10.getTokenizedLowerCaseTrimmedName();
        column2.setTokenizedLowerCaseTrimmedName(list_str13);
        String str15 = column2.getDoppelgangerName();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertNotNull(list_str13);
        Assert.assertNull(str15);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setBestAttemptPk(false);
        double[] d_array7 = null;
        column2.setHistogramBounds(d_array7);
        column2.setDataType((int) (short) -1);
        try {
            String str11 = column2.toFeature();
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        List<Table> list_table0 = null;
        try {
            double d1 = Accuracy.getPkPrecision(list_table0);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMin(",");
        String str7 = column2.getLowerCaseTrimmedName();
        column2.setNullRatio(100.0d);
        Boolean b10 = column2.getContains();
        Integer i11 = column2.getLD();
        column2.setDataType(10);
        column2.setUniqueRatio(-1.5000000000000004d);
        Assert.assertNull(str7);
        Assert.assertNull(b10);
        Assert.assertNull(i11);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        String str9 = column2.getTextMin();
        column2.setTrimmedName("");
        column2.setDecimalDigits(10);
        column2.setNullRatio(0.0d);
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(str9);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMin(",");
        String str7 = column2.getLowerCaseTrimmedName();
        column2.setNullRatio(100.0d);
        Boolean b10 = column2.getContains();
        int i11 = column2.getColumnSize();
        Assert.assertNull(str7);
        Assert.assertNull(b10);
        Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = column6.isBestAttemptPk();
        Table[] table_array12 = new Table[] {};
        ArrayList<Table> arraylist_table13 = new ArrayList<Table>();
        boolean b14 = Collections.addAll(arraylist_table13, table_array12);
        List<Table> list_table15 = Optimization.optimize(arraylist_table13);
        column6.setMinLDOtherTable(arraylist_table13);
        column6.setKeywords();
        column6.setDecimalDigits((int) 'a');
        column6.setUniqueConstraint(true);
        Connection connection22 = null;
        try {
            column6.isUnique(connection22, "table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey", "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey.null --> null");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        Assert.assertNotNull(table_array12);
        Assert.assertTrue(b14 == false);
        Assert.assertNotNull(list_table15);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        Table[] table_array0 = new Table[] {};
        ArrayList<Table> arraylist_table1 = new ArrayList<Table>();
        boolean b2 = Collections.addAll(arraylist_table1, table_array0);
        List<Table> list_table3 = Optimization.optimize(arraylist_table1);
        double d4 = Accuracy.getPkPrecision(arraylist_table1);
        Connection connection5 = null;
        List<Table> list_table7 = Schema.getExpensiveFeatures(arraylist_table1, connection5, "hi!");
        Assert.assertNotNull(table_array0);
        Assert.assertTrue(b2 == false);
        Assert.assertNotNull(list_table3);
        Assert.assertEquals(d4, Double.NaN, 0);
        Assert.assertNotNull(list_table7);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMax(",");
        column2.setDataTypeName(",");
        Boolean b9 = column2.isBestAttemptPk();
        column2.setUniqueConstraint(false);
        Boolean b12 = column2.isPrimaryKey();
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        relationship0.setForeignKeyProbability(4.37d);
        Column column7 = new Column(",", "");
        column7.setAutoincrement(false);
        column7.setTextMax(",");
        String str12 = column7.getLongName();
        double[] d_array13 = column7.getHistogramBounds();
        String str14 = column7.getName();
        Table table15 = column7.getTable();
        String str16 = column7.getLowerCaseTrimmedName();
        relationship0.setPk(column7);
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertTrue("'" + str12 + "' != '" + ",." + "'", str12.equals(",."));
        Assert.assertNull(d_array13);
        Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        Assert.assertNull(table15);
        Assert.assertNull(str16);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        column6.setEstimatedPk(true);
        int i12 = column6.getDecimalDigits();
        Relationship relationship13 = new Relationship();
        Column column14 = relationship13.getPk();
        Boolean b15 = relationship13.getDataTypeCategoryAgree();
        Table table18 = new Table("", ",");
        relationship13.setPkTable(table18);
        List<Column> list_column20 = table18.getPk();
        table18.setColumnTokenWeight();
        String str22 = table18.toProbability();
        String str23 = table18.toProbability();
        column6.setDoppelganger(table18);
        Column column25 = new Column(",", ",.", table18);
        Column column26 = new Column("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", "tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", table18);
        List<Column> list_column27 = table18.getBestAttemptPk();
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue(i12 == 0);
        Assert.assertNull(column14);
        Assert.assertNull(b15);
        Assert.assertNotNull(list_column20);
        Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        Assert.assertNotNull(list_column27);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        int i21 = column2.getDataType();
        Table table22 = column2.getTable();
        Double d23 = column2.getWidthAvg();
        String str24 = column2.getLongName();
        String str25 = column2.getDataTypeName();
        Table table28 = new Table("", ",");
        table28.setTrimmedName(",");
        Column column33 = new Column(",", "");
        column33.setAutoincrement(false);
        column33.setTextMax(",");
        boolean b38 = Doppelganger.isDoppelganger(table28, column33);
        column2.setDoppelganger(table28);
        List<String> list_str40 = column2.getTokenizedName();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        Assert.assertTrue(i21 == 0);
        Assert.assertNull(table22);
        Assert.assertNull(d23);
        Assert.assertTrue("'" + str24 + "' != '" + ",." + "'", str24.equals(",."));
        Assert.assertNull(str25);
        Assert.assertTrue(b38 == false);
        Assert.assertNotNull(list_str40);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        Relationship relationship0 = new Relationship();
        Double d1 = relationship0.getForeignKeyProbability();
        Table table4 = new Table("", ",");
        table4.setTrimmedName("hi!");
        String str7 = table4.getLowerCaseTrimmedName();
        String str8 = table4.toProbability();
        String str9 = table4.toFeature();
        relationship0.setFkTable(table4);
        relationship0.setForeignKey(true);
        String str13 = relationship0.getPkTableName();
        Assert.assertTrue("'" + d1 + "' != '" + 0.0d + "'", d1.equals(0.0d));
        Assert.assertNull(str7);
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        Assert.assertNull(str13);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        Column column2 = new Column("tablenull --> nullcolumnnull --> nulldataTypeNamenull --> nullisUniquenull --> nullisUniqueConstraintnull --> nullcolumnSizenull --> nulldecimalDigitsnull --> nullisDecimalnull --> nullhasDefaultnull --> nullordinalPositionnull --> nullordinalPositionEndnull --> nulltableColumnCountnull --> nulltableContainsLobnull --> nullestimatedRowCountnull --> nullisAutoincrementnull --> nullisNotNullnull --> nullnullRationull --> nullisNullablenull --> nulluniqueRationull --> nullminValuenull --> nullmaxValuenull --> nullavgWidthnull --> nullavgWidthBigger10null --> nullcorrelationAbsnull --> nullisKeywordSingletonnull --> nullisJunctionTablenull --> nullhasMultiplePKnull --> nulllevenshteinDistancenull --> nullminLDOtherTablenull --> nullisDoppelgangernull --> nullcontainsnull --> nullisPrimaryKey", "hi!");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        Table table2 = new Table("", "\"");
        DatabaseMetaData databaseMetaData3 = null;
        try {
            table2.getColumns(databaseMetaData3, "hi!", "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey.null --> null", "null --> null");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        Connection connection0 = null;
        Table[] table_array3 = new Table[] {};
        ArrayList<Table> arraylist_table4 = new ArrayList<Table>();
        boolean b5 = Collections.addAll(arraylist_table4, table_array3);
        List<Table> list_table6 = Optimization.optimize(arraylist_table4);
        Connection connection7 = null;
        List<Table> list_table9 = Schema.getExpensiveFeatures(arraylist_table4, connection7, "");
        List<Table> list_table10 = Optimization.optimize(arraylist_table4);
        List<Relationship> list_relationship12 = Schema.getRelationships(connection0, "\"", "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey", list_table10, false);
        Column column15 = new Column(",", "");
        column15.setEstimatedRowCount((int) (byte) 0);
        Boolean b18 = column15.isBestAttemptPk();
        column15.setEstimatedPk(true);
        int i21 = column15.getDecimalDigits();
        Relationship relationship22 = new Relationship();
        Column column23 = relationship22.getPk();
        Boolean b24 = relationship22.getDataTypeCategoryAgree();
        Table table27 = new Table("", ",");
        relationship22.setPkTable(table27);
        List<Column> list_column29 = table27.getPk();
        table27.setColumnTokenWeight();
        String str31 = table27.toProbability();
        String str32 = table27.toProbability();
        column15.setDoppelganger(table27);
        Table[] table_array34 = new Table[] {};
        ArrayList<Table> arraylist_table35 = new ArrayList<Table>();
        boolean b36 = Collections.addAll(arraylist_table35, table_array34);
        List<Table> list_table37 = Optimization.optimize(arraylist_table35);
        Connection connection38 = null;
        List<Table> list_table40 = Schema.getExpensiveFeatures(arraylist_table35, connection38, "");
        List<Table> list_table41 = Optimization.optimize(arraylist_table35);
        Connection connection42 = null;
        List<Table> list_table44 = Schema.getExpensiveFeatures(list_table41, connection42, ",");
        table27.isJunctionTable(list_table41);
        int i46 = OptimizationRelationship.optimize(list_relationship12, list_table41);
        double d47 = Accuracy.getFkRecall(list_relationship12);
        Assert.assertNotNull(table_array3);
        Assert.assertTrue(b5 == false);
        Assert.assertNotNull(list_table6);
        Assert.assertNotNull(list_table9);
        Assert.assertNotNull(list_table10);
        Assert.assertNotNull(list_relationship12);
        Assert.assertTrue("'" + b18 + "' != '" + false + "'", b18.equals(false));
        Assert.assertTrue(i21 == 0);
        Assert.assertNull(column23);
        Assert.assertNull(b24);
        Assert.assertNotNull(list_column29);
        Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        Assert.assertNotNull(table_array34);
        Assert.assertTrue(b36 == false);
        Assert.assertNotNull(list_table37);
        Assert.assertNotNull(list_table40);
        Assert.assertNotNull(list_table41);
        Assert.assertNotNull(list_table44);
        Assert.assertTrue(i46 == 0);
        Assert.assertEquals(d47, Double.NaN, 0);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        Table table2 = new Table("hi!", ",");
        List<Column> list_column3 = table2.getBestAttemptPk();
        String str4 = table2.toFeature();
        table2.tableContainsLob();
        Assert.assertNotNull(list_column3);
        Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        Table table23 = new Table("", ",");
        table23.setTrimmedName("hi!");
        String str26 = table23.getLowerCaseTrimmedName();
        List<Column> list_column27 = table23.getEstimatedPk();
        column2.setDoppelganger(table23);
        table23.hasMultiplePK();
        String str30 = table23.toProbability();
        String str31 = table23.getName();
        String str32 = table23.getName();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        Assert.assertNull(str26);
        Assert.assertNotNull(list_column27);
        Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        Assert.assertTrue("'" + str31 + "' != '" + "," + "'", str31.equals(","));
        Assert.assertTrue("'" + str32 + "' != '" + "," + "'", str32.equals(","));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        Column column2 = new Column("null --> null", "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.isTheSameColumn();
        String str3 = relationship0.getPkTableName();
        Boolean b4 = relationship0.isForeignKey();
        Relationship relationship5 = new Relationship();
        Column column6 = relationship5.getPk();
        Boolean b7 = relationship5.getDataTypeCategoryAgree();
        Table table10 = new Table("", ",");
        relationship5.setPkTable(table10);
        List<Column> list_column12 = table10.getPk();
        String str13 = table10.toProbability();
        Column column16 = new Column(",", "");
        column16.setAutoincrement(false);
        boolean b19 = Doppelganger.isDoppelganger(table10, column16);
        relationship0.setPk(column16);
        Boolean b21 = relationship0.getDataTypeCategoryAgree();
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNull(str3);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        Assert.assertNull(column6);
        Assert.assertNull(b7);
        Assert.assertNotNull(list_column12);
        Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        Assert.assertTrue(b19 == false);
        Assert.assertNull(b21);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = column6.isBestAttemptPk();
        Table[] table_array12 = new Table[] {};
        ArrayList<Table> arraylist_table13 = new ArrayList<Table>();
        boolean b14 = Collections.addAll(arraylist_table13, table_array12);
        List<Table> list_table15 = Optimization.optimize(arraylist_table13);
        column6.setMinLDOtherTable(arraylist_table13);
        column6.setKeywords();
        column6.setDecimalDigits((int) 'a');
        int i20 = column6.getColumnSize();
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        Assert.assertNotNull(table_array12);
        Assert.assertTrue(b14 == false);
        Assert.assertNotNull(list_table15);
        Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        column2.setEstimatedRowCount(10);
        Integer i9 = column2.getOrdinalPosition();
        column2.setUniqueConstraint(true);
        Assert.assertNull(i9);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        Relationship relationship0 = new Relationship();
        String str1 = relationship0.getSchema();
        Boolean b2 = relationship0.isTheSameColumn();
        relationship0.setForeignKeyProbability(10.0d);
        Boolean b5 = relationship0.getDataTypeCategoryAgree();
        Relationship relationship6 = new Relationship(relationship0);
        Assert.assertNull(str1);
        Assert.assertNull(b2);
        Assert.assertNull(b5);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Boolean b3 = relationship0.getDataTypeCategoryAgree();
        Column column6 = new Column(",", "");
        column6.setEstimatedRowCount((int) (byte) 0);
        Boolean b9 = column6.isBestAttemptPk();
        relationship0.setPk(column6);
        Boolean b11 = relationship0.isForeignKey();
        Boolean b12 = relationship0.isEstimatedFk();
        Double d13 = relationship0.getForeignKeyProbability();
        String str14 = relationship0.getFkTableName();
        Table table19 = new Table("", ",");
        table19.setTrimmedName("hi!");
        String str22 = table19.getLowerCaseTrimmedName();
        List<Column> list_column23 = table19.getEstimatedPk();
        Column column24 = new Column("", ",", table19);
        relationship0.setPk(column24);
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(b3);
        Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        Assert.assertTrue("'" + d13 + "' != '" + 0.0d + "'", d13.equals(0.0d));
        Assert.assertNull(str14);
        Assert.assertNull(str22);
        Assert.assertNotNull(list_column23);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        Table table4 = new Table("", ",");
        List<String> list_str5 = table4.getTokenizedLowerCaseTrimmedName();
        String str6 = table4.toString();
        List<Column> list_column7 = table4.getBestAttemptPk();
        Column column9 = table4.getColumn("table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        Column column10 = new Column("null --> null", "hi!", table4);
        table4.setColumnTokenWeight();
        Table[] table_array12 = new Table[] {};
        ArrayList<Table> arraylist_table13 = new ArrayList<Table>();
        boolean b14 = Collections.addAll(arraylist_table13, table_array12);
        List<Table> list_table15 = Optimization.optimize(arraylist_table13);
        Connection connection16 = null;
        List<Table> list_table18 = Schema.getExpensiveFeatures(arraylist_table13, connection16, "");
        List<Table> list_table19 = Optimization.optimize(arraylist_table13);
        Connection connection20 = null;
        List<Table> list_table22 = Schema.getExpensiveFeatures(list_table19, connection20, ",");
        double d23 = Accuracy.getPkRecall(list_table19);
        table4.isJunctionTable(list_table19);
        table4.setTrimmedName("");
        Assert.assertNull(list_str5);
        Assert.assertTrue("'" + str6 + "' != '" + "," + "'", str6.equals(","));
        Assert.assertNotNull(list_column7);
        Assert.assertNull(column9);
        Assert.assertNotNull(table_array12);
        Assert.assertTrue(b14 == false);
        Assert.assertNotNull(list_table15);
        Assert.assertNotNull(list_table18);
        Assert.assertNotNull(list_table19);
        Assert.assertNotNull(list_table22);
        Assert.assertEquals(d23, Double.NaN, 0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        Column column7 = new Column(",", "");
        column7.setEstimatedRowCount((int) (byte) 0);
        List<String> list_str10 = column7.getTokenizedLowerCaseTrimmedName();
        column7.setDecimalDigits((int) ' ');
        boolean b13 = Doppelganger.isDoppelganger(table2, column7);
        String str14 = column7.getDataTypeName();
        Column column17 = new Column(",", "");
        column17.setEstimatedRowCount((int) (byte) 0);
        Boolean b20 = column17.isBestAttemptPk();
        column17.setEstimatedPk(true);
        int i23 = column17.getDecimalDigits();
        Relationship relationship24 = new Relationship();
        Column column25 = relationship24.getPk();
        Boolean b26 = relationship24.getDataTypeCategoryAgree();
        Table table29 = new Table("", ",");
        relationship24.setPkTable(table29);
        List<Column> list_column31 = table29.getPk();
        table29.setColumnTokenWeight();
        String str33 = table29.toProbability();
        String str34 = table29.toProbability();
        column17.setDoppelganger(table29);
        double[] d_array36 = Relationship.WEIGHTS;
        column17.setHistogramBounds(d_array36);
        column7.setHistogramBounds(d_array36);
        column7.setNullable(false);
        Assert.assertNotNull(list_str10);
        Assert.assertTrue(b13 == false);
        Assert.assertNull(str14);
        Assert.assertTrue("'" + b20 + "' != '" + false + "'", b20.equals(false));
        Assert.assertTrue(i23 == 0);
        Assert.assertNull(column25);
        Assert.assertNull(b26);
        Assert.assertNotNull(list_column31);
        Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        Assert.assertNotNull(d_array36);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        Table table2 = new Table(",", ",");
        List<Column> list_column3 = table2.getBestAttemptPk();
        String str4 = table2.toProbability();
        DatabaseMetaData databaseMetaData5 = null;
        try {
            table2.getColumns(databaseMetaData5, "table\"column\"dataTypeName\"isUnique\"isUniqueConstraint\"columnSize\"decimalDigits\"isDecimal\"hasDefault\"ordinalPosition\"ordinalPositionEnd\"tableColumnCount\"tableContainsLob\"estimatedRowCount\"isAutoincrement\"isNotNull\"nullRatio\"isNullable\"uniqueRatio\"minValue\"maxValue\"avgWidth\"avgWidthBigger10\"correlationAbs\"isKeywordSingleton\"isJunctionTable\"hasMultiplePK\"levenshteinDistance\"minLDOtherTable\"isDoppelganger\"contains\"isPrimaryKey", "", "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNotNull(list_column3);
        Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Column column2 = relationship0.getFk();
        Chen chen3 = null;
        try {
            relationship0.setMediumFeatures(chen3);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(column2);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        List<String> list_str5 = column2.getTokenizedLowerCaseTrimmedName();
        column2.setKeywords();
        Assert.assertNotNull(list_str5);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        int i21 = column2.getDataType();
        String str22 = column2.getTextMax();
        column2.setDoppelgangerName("null --> null");
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        Assert.assertTrue(i21 == 0);
        Assert.assertNull(str22);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        Column column2 = new Column(",", "");
        column2.setAutoincrement(false);
        column2.setTextMin(",");
        String str7 = column2.getLowerCaseTrimmedName();
        column2.setNullRatio(100.0d);
        Boolean b10 = column2.getContains();
        Double d11 = column2.getValueMax();
        String str12 = column2.getTrimmedName();
        column2.setOrdinalPosition((int) '#');
        Assert.assertNull(str7);
        Assert.assertNull(b10);
        Assert.assertNull(d11);
        Assert.assertNull(str12);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        Table table2 = new Table("hi!", ",");
        List<Column> list_column3 = table2.getBestAttemptPk();
        String str4 = table2.toProbability();
        Column column7 = new Column(",", "");
        column7.setEstimatedRowCount((int) (byte) 0);
        column7.setBestAttemptPk(false);
        String str12 = column7.getName();
        Boolean b13 = column7.isEstimatedPk();
        Double d14 = column7.getUniqueRatio();
        boolean b15 = Doppelganger.isDoppelganger(table2, column7);
        Assert.assertNotNull(list_column3);
        Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        Assert.assertTrue("'" + b13 + "' != '" + false + "'", b13.equals(false));
        Assert.assertNull(d14);
        Assert.assertTrue(b15 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        String str4 = column2.getDataTypeName();
        column2.setWidthAvg(-1.0d);
        column2.setJunctionTable(false);
        column2.setTableContainsLob(true);
        String str11 = column2.getLowerCaseTrimmedName();
        Assert.assertTrue(i3 == 0);
        Assert.assertNull(str4);
        Assert.assertNull(str11);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setBestAttemptPk(false);
        String str7 = column2.getName();
        column2.setTableContainsLob(true);
        column2.setEstimatedPk(false);
        String str12 = column2.getTextMin();
        column2.setDataTypeName("schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey");
        column2.setUniqueRatio(0.0d);
        Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        Assert.assertNull(str12);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setLowerCaseTrimmedName("");
        List<Column> list_column10 = table5.getBestAttemptPk();
        List<Column> list_column11 = table5.getBestAttemptPk();
        Column column14 = new Column(",", "");
        column14.setEstimatedRowCount((int) (byte) 0);
        column14.setNullRatio(100.0d);
        String str19 = column14.getLongName();
        Boolean b20 = column14.isPrimaryKey();
        int i21 = column14.getDataType();
        column14.setNullRatio(0.0d);
        Table[] table_array24 = new Table[] {};
        ArrayList<Table> arraylist_table25 = new ArrayList<Table>();
        boolean b26 = Collections.addAll(arraylist_table25, table_array24);
        List<Table> list_table27 = Optimization.optimize(arraylist_table25);
        Connection connection28 = null;
        List<Table> list_table30 = Schema.getExpensiveFeatures(arraylist_table25, connection28, ",.");
        double d31 = Accuracy.getPkPrecision(list_table30);
        column14.setMinLDOtherTable(list_table30);
        List<String> list_str33 = column14.getTokenizedName();
        table5.setTokenizedLowerCaseTrimmedName(list_str33);
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNotNull(list_column10);
        Assert.assertNotNull(list_column11);
        Assert.assertTrue("'" + str19 + "' != '" + ",." + "'", str19.equals(",."));
        Assert.assertTrue("'" + b20 + "' != '" + false + "'", b20.equals(false));
        Assert.assertTrue(i21 == 0);
        Assert.assertNotNull(table_array24);
        Assert.assertTrue(b26 == false);
        Assert.assertNotNull(list_table27);
        Assert.assertNotNull(list_table30);
        Assert.assertEquals(d31, Double.NaN, 0);
        Assert.assertNotNull(list_str33);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        OptimizationRelationship.expectedCount = 0.0f;
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        String str8 = table5.toProbability();
        Column column11 = new Column(",", "");
        column11.setAutoincrement(false);
        boolean b14 = Doppelganger.isDoppelganger(table5, column11);
        column11.setNullRatio(4.3d);
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        Assert.assertTrue(b14 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Boolean b3 = relationship0.isEstimatedFk();
        String str4 = relationship0.getSchema();
        Double d5 = relationship0.getForeignKeyProbability();
        Connection connection6 = null;
        try {
            relationship0.setRatioSatisfiedFKConstraint(connection6);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertTrue("'" + b3 + "' != '" + false + "'", b3.equals(false));
        Assert.assertNull(str4);
        Assert.assertTrue("'" + d5 + "' != '" + 0.0d + "'", d5.equals(0.0d));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Boolean b3 = relationship0.isEstimatedFk();
        Connection connection4 = null;
        try {
            relationship0.setSlowFeatures(connection4);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertTrue("'" + b3 + "' != '" + false + "'", b3.equals(false));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setColumnTokenWeight();
        List<String> list_str9 = null;
        table5.setTokenizedLowerCaseTrimmedName(list_str9);
        table5.setLowerCaseTrimmedName("null --> null");
        Column column14 = table5.getColumn("null --> null");
        List<Column> list_column15 = table5.getPk();
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNull(column14);
        Assert.assertNotNull(list_column15);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        column2.setTextMax("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        column2.setNullable(true);
        int i12 = column2.getDataType();
        Connection connection13 = null;
        try {
            column2.isNotNull(connection13, ",", "");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setLowerCaseTrimmedName("");
        List<Column> list_column10 = table5.getBestAttemptPk();
        List<Column> list_column11 = table5.getBestAttemptPk();
        table5.setTrimmedName("\"");
        List<Column> list_column14 = table5.getEstimatedPk();
        table5.setTrimmedName("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey.null --> null");
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNotNull(list_column10);
        Assert.assertNotNull(list_column11);
        Assert.assertNotNull(list_column14);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        Relationship relationship0 = new Relationship();
        String str1 = relationship0.getSchema();
        Boolean b2 = relationship0.isEstimatedFk();
        String str3 = relationship0.getSchema();
        Relationship relationship4 = new Relationship(relationship0);
        Table table9 = new Table("", ",");
        table9.setTrimmedName("hi!");
        String str12 = table9.getLowerCaseTrimmedName();
        List<Column> list_column13 = table9.getEstimatedPk();
        Column column14 = new Column("", ",", table9);
        relationship0.setPkTable(table9);
        relationship0.setForeignKey(false);
        Assert.assertNull(str1);
        Assert.assertTrue("'" + b2 + "' != '" + false + "'", b2.equals(false));
        Assert.assertNull(str3);
        Assert.assertNull(str12);
        Assert.assertNotNull(list_column13);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        column2.setDoppelgangerName(",");
        String str7 = column2.getLongName();
        String str8 = column2.getName();
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        Table table23 = new Table("", ",");
        table23.setTrimmedName("hi!");
        String str26 = table23.getLowerCaseTrimmedName();
        List<Column> list_column27 = table23.getEstimatedPk();
        column2.setDoppelganger(table23);
        Boolean b29 = column2.isPrimaryKey();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        Assert.assertNull(str26);
        Assert.assertNotNull(list_column27);
        Assert.assertTrue("'" + b29 + "' != '" + false + "'", b29.equals(false));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        Boolean b4 = column2.isEstimatedPk();
        column2.setDataType(0);
        column2.setTableColumnCount(-1);
        column2.setDecimalDigits(1);
        column2.setTextMin("");
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        String str6 = column2.getName();
        Table[] table_array7 = new Table[] {};
        ArrayList<Table> arraylist_table8 = new ArrayList<Table>();
        boolean b9 = Collections.addAll(arraylist_table8, table_array7);
        List<Table> list_table10 = Optimization.optimize(arraylist_table8);
        column2.setMinLDOtherTable(arraylist_table8);
        String str12 = column2.getName();
        column2.setColumnSize((int) (byte) 0);
        Table table17 = new Table("", ",");
        table17.setTrimmedName("hi!");
        String str20 = table17.getLowerCaseTrimmedName();
        List<Column> list_column21 = table17.getEstimatedPk();
        table17.hasMultiplePK();
        List<Column> list_column23 = table17.getEstimatedPk();
        column2.setDoppelganger(table17);
        table17.tableContainsLob();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        Assert.assertNotNull(table_array7);
        Assert.assertTrue(b9 == false);
        Assert.assertNotNull(list_table10);
        Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        Assert.assertNull(str20);
        Assert.assertNotNull(list_column21);
        Assert.assertNotNull(list_column23);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        OptimizationRelationship.lowerEstimate = 'a';
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        String str2 = relationship0.getSchema();
        Relationship relationship3 = new Relationship();
        Column column4 = relationship3.getPk();
        String str5 = relationship3.getSchema();
        Double d6 = relationship3.getForeignKeyProbability();
        Double d7 = relationship3.getForeignKeyProbability();
        relationship3.setForeignKeyProbability(-0.3999999999999999d);
        int i10 = relationship0.compareTo(relationship3);
        String str11 = relationship0.toString();
        Connection connection12 = null;
        try {
            relationship0.setRatioSatisfiedFKConstraint(connection12);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(column1);
        Assert.assertNull(str2);
        Assert.assertNull(column4);
        Assert.assertNull(str5);
        Assert.assertTrue("'" + d6 + "' != '" + 0.0d + "'", d6.equals(0.0d));
        Assert.assertTrue("'" + d7 + "' != '" + 0.0d + "'", d7.equals(0.0d));
        Assert.assertTrue(i10 == (-1));
        Assert.assertTrue("'" + str11 + "' != '" + "null --> null" + "'", str11.equals("null --> null"));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        String str21 = table14.toProbability();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        String str7 = column2.getLongName();
        Boolean b8 = column2.isPrimaryKey();
        column2.setAutoincrement(false);
        Boolean b11 = column2.getContains();
        Double d12 = column2.getNullRatio();
        column2.setDecimalDigits((int) (byte) 100);
        String str15 = column2.getName();
        Table table16 = null;
        try {
            column2.setDoppelganger(table16);
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertTrue("'" + str7 + "' != '" + ",." + "'", str7.equals(",."));
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(b11);
        Assert.assertTrue("'" + d12 + "' != '" + 100.0d + "'", d12.equals(100.0d));
        Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        Boolean b5 = column2.isBestAttemptPk();
        column2.setEstimatedPk(true);
        int i8 = column2.getDecimalDigits();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        List<Column> list_column16 = table14.getPk();
        table14.setColumnTokenWeight();
        String str18 = table14.toProbability();
        String str19 = table14.toProbability();
        column2.setDoppelganger(table14);
        int i21 = column2.getDataType();
        Table table22 = column2.getTable();
        int i23 = column2.getDecimalDigits();
        Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        Assert.assertTrue(i8 == 0);
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNotNull(list_column16);
        Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        Assert.assertTrue(i21 == 0);
        Assert.assertNull(table22);
        Assert.assertTrue(i23 == 0);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        Table table2 = new Table("", ",");
        table2.setTrimmedName("hi!");
        String str5 = table2.getLowerCaseTrimmedName();
        List<Column> list_column6 = table2.getEstimatedPk();
        table2.setLowerCaseTrimmedName("schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey");
        DatabaseMetaData databaseMetaData9 = null;
        try {
            table2.getColumns(databaseMetaData9, "schema,table,column,dataTypeName,isUnique,isUniqueConstraint,columnSize,decimalDigits,isDecimal,hasDefault,ordinalPosition,ordinalPositionEnd,tableColumnCount,tableContainsLob,estimatedRowCount,isAutoincrement,isNotNull,nullRatio,isNullable,uniqueRatio,minValue,maxValue,avgWidth,avgWidthBigger10,correlationAbs,isKeywordSingleton,isJunctionTable,hasMultiplePK,levenshteinDistance,minLDOtherTable,isDoppelganger,contains,isPrimaryKey", "schema,pk_table,pk_column,pk_dataTypeName,pk_isUnique,pk_isUniqueConstraint,pk_columnSize,pk_decimalDigits,pk_isDecimal,pk_hasDefault,pk_ordinalPosition,pk_ordinalPositionEnd,pk_tableColumnCount,pk_tableContainsLob,pk_estimatedRowCount,pk_isAutoincrement,pk_isNotNull,pk_nullRatio,pk_isNullable,pk_uniqueRatio,pk_minValue,pk_maxValue,pk_avgWidth,pk_avgWidthBigger10,pk_correlationAbs,pk_isKeywordSingleton,pk_isJunctionTable,pk_hasMultiplePK,pk_levenshteinDistance,pk_minLDOtherTable,pk_isDoppelganger,pk_contains,pk_isPrimaryKey,fk_table,fk_column,fk_dataTypeName,fk_isUnique,fk_isUniqueConstraint,fk_columnSize,fk_decimalDigits,fk_isDecimal,fk_hasDefault,fk_ordinalPosition,fk_ordinalPositionEnd,fk_tableColumnCount,fk_tableContainsLob,fk_estimatedRowCount,fk_isAutoincrement,fk_isNotNull,fk_nullRatio,fk_isNullable,fk_uniqueRatio,fk_minValue,fk_maxValue,fk_avgWidth,fk_avgWidthBigger10,fk_correlationAbs,fk_isKeywordSingleton,fk_isJunctionTable,fk_hasMultiplePK,fk_levenshteinDistance,fk_minLDOtherTable,fk_isDoppelganger,fk_contains,fk_isPrimaryKey,dataTypeAgree,dataTypeCategoryAgree,dataLengthAgree,decimalAgree,isTheSameColumn,isTheSameTable,firstCharAgree,nameAgree,levenshteinColumns,levenshteinToTable,levenshteinFromTable,tpcSimilarity,tokenShareRatioLd,chenColumnSimilarity,chenTableSimilarity,pkDoesNotHaveMoreTokensThanFk,avgWidthDiff,violatesCardinalityConstraint,isInRange,satisfiesFKConstraint,satisfiedFKRatio,rangeCoverage,histogramOverlap,violatesSpecialization,contains,isForeignKey.null --> null", "");
            Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (NullPointerException e) {
        }
        Assert.assertNull(str5);
        Assert.assertNotNull(list_column6);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        Relationship relationship0 = new Relationship();
        Column column1 = relationship0.getPk();
        Boolean b2 = relationship0.getDataTypeCategoryAgree();
        Table table5 = new Table("", ",");
        relationship0.setPkTable(table5);
        List<Column> list_column7 = table5.getPk();
        table5.setColumnTokenWeight();
        List<String> list_str9 = null;
        table5.setTokenizedLowerCaseTrimmedName(list_str9);
        List<Column> list_column11 = table5.getEstimatedPk();
        Column column14 = new Column(",", "");
        column14.setEstimatedRowCount((int) (byte) 0);
        column14.setDataType((int) (short) 10);
        List<String> list_str19 = column14.getTokenizedLowerCaseTrimmedName();
        table5.setTokenizedLowerCaseTrimmedName(list_str19);
        Assert.assertNull(column1);
        Assert.assertNull(b2);
        Assert.assertNotNull(list_column7);
        Assert.assertNotNull(list_column11);
        Assert.assertNotNull(list_str19);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        OptimizationRelationship.expectedCount = 1;
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        int i5 = column2.getDecimalDigits();
        column2.setHasMultiplePK(true);
        Boolean b8 = column2.isBestAttemptPk();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        column2.setDoppelganger(table14);
        column2.setUniqueRatio(Double.NaN);
        column2.setBestAttemptPk(true);
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(i5 == 0);
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(column10);
        Assert.assertNull(b11);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        Column column2 = new Column(",", "");
        column2.setEstimatedRowCount((int) (byte) 0);
        column2.setNullRatio(100.0d);
        column2.setCorrelation(-0.3999999999999999d);
        column2.setKeywordSingleton();
        Double d10 = column2.getWidthAvg();
        Assert.assertNull(d10);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        Column column2 = new Column(",", "");
        int i3 = column2.getColumnSize();
        int i4 = column2.getDataType();
        int i5 = column2.getDecimalDigits();
        column2.setHasMultiplePK(true);
        Boolean b8 = column2.isBestAttemptPk();
        Relationship relationship9 = new Relationship();
        Column column10 = relationship9.getPk();
        Boolean b11 = relationship9.getDataTypeCategoryAgree();
        Table table14 = new Table("", ",");
        relationship9.setPkTable(table14);
        column2.setDoppelganger(table14);
        Column column19 = new Column(",", "");
        column19.setAutoincrement(false);
        column19.setTextMin(",");
        String str24 = column19.getLowerCaseTrimmedName();
        column19.setNullRatio(100.0d);
        Boolean b27 = column19.getContains();
        Double d28 = column19.getValueMax();
        boolean b29 = Doppelganger.isDoppelganger(table14, column19);
        column19.setKeywordSingleton();
        Assert.assertTrue(i3 == 0);
        Assert.assertTrue(i4 == 0);
        Assert.assertTrue(i5 == 0);
        Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        Assert.assertNull(column10);
        Assert.assertNull(b11);
        Assert.assertNull(str24);
        Assert.assertNull(b27);
        Assert.assertNull(d28);
        Assert.assertTrue(b29 == false);
    }
}

