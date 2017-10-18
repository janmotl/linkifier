# Estimate Primary & Foreign Keys in a Database

Do you need to import CSV files into a database but no one gave you the entity–relationship model to set up the primary and foreign keys?

Say no more.

![screenshot](https://github.com/janmotl/linkifier/blob/master/ScreenShot.png)

## Usage

 1. Download the latest [release](https://github.com/janmotl/linkifier/releases)
 2. Execute the jar file (requieres JRE 8.0 or newer)
 3. Connect to a database (Microsoft SQL Server, MySQL, Oracle or PostgreSQL)
 4. Estimate the primary and foreign key constraints
 5. Export the estimates (multiple formats are supported including SQL alter queries and graphml for ER-diagram visualization)
  
## Algorithm
The algorithm works on the *metadata* about tables and columns, which are accessible over JDBC, and column and table *statistics*, which the database use for the execution plan optimization. That means that the algorithm is blazing fast (as it does not look at the actual data).


### Primary Key
Primary keys are identified by:

 1. Column position in the table (PKs are commonly at the beginning)
 2. Data type (e.g. integers are preferred over doubles)
 3. Presence of a keyword like "id" in the column name
 4. Similarity of the column name with the table name
 5. Ratio of nulls in the column from the column statistics
 6. Average column width in bytes from the column statistics (PKs are commonly short)

Once these features are collected, they are passed to logistic regression to estimate the probability that the column is a primary key or is in a compound primary key. Since each table can have at most a single PK, the column with the highest probability in the table is declared to be the primary key of the table. If the estimated count of unique values in the estimated PK is smaller than the count of the rows in the table, it is a sign of a compound PK. In that case columns are incrementally added into the PK by their descending probability of being in the PK until the estimated unique row count ≥ estimated table row count. The estimate is optimistic and is defined as a product of the estimated row counts of the columns in the PK.

### Foreign keys
Foreign keys are identified by:

 1. Known PKs (relationships must be between a PK and non-PK)
 2. Data types (relationships must be between agreeing data types)
 3. Data type properties (e.g. data type sizes should agree) 
 4. Similarity of the FK name with the PK name (should be high)
 5. Similarity of the FK name with the PK table name (should be high)
 6. Similarity of the FK name with the FK table name (should be low)
 7. Average column width of the FK is similar to the PK width
 8. Minimum and maximum values of the FK is in the range of the PK
 9. Minimum and maximum values of the FK cover a significant range of the PK values

Once again, probabilities are estimated with logistic regression. And the most likely FK constraints are returned (a compound FK is returned if the PK is compound).

## How to improve the quality of the estimates
 1. Calculate (sample) statistics on all tables in the schema. Example queries for calculating the statistics for a table "molecule" in "mutagenesis" schema: 
    - Microsoft SQL Server: `CREATE STATISTICS mutagenesis.molecule`
    - MySQL: `ANALYZE TABLE mutagenesis.molecule`
    - Oracle: `EXEC DBMS_STATS.gather_table_stats('mutagenesis', 'molecule')`
    - PostgreSQL: `ANALYZE mutagenesis.molecule`
 2. Set primary keys in the schema. Once Linkifier knows for sure what are the PKs, the accuracy of the foreign key constraint estimates increases.
 3. Use the export into a csv file. The csv files allow you to filter out uninteresting tables while providing more details than the export into SQL.

## Limitations
If the schema quality is extremely low (e.g. all columns are typed as text and have irrelevant names), the PK and particularly FK estimates are going to be off. First, set correct data types and names to the columns. Then rerun Linkifier. [DBLint](https://dblint.codeplex.com/) may help you to identify some of the problems with your schema. 

## Known issues
If you are using MySQL and get `Access to data dictionary table 'mysql.table_stats' is rejected` then it is because MySQL, contrary to MariaDB, prevents access to internal tables. To be able to run Linkifier, start the db in the [debug mode](http://datacharmer.blogspot.com/2016/09/showing-hidden-tables-in-mysql-8-data.html).

If you have any question or suggestion, let me know.

## How to cite
[Foreign Key Constraint Identification in Relational Databases](http://ceur-ws.org/Vol-1885/106.pdf),
Jan Motl and Pavel Kordík,
2017,
ITAT 2017 Proceedings.

## Acknowledgement
I would like to thank Aleš Fišer, Oliver Kerul’-Kmec, Jan Kukačka, Jiří Kukačka, Manuel Muñoz and Batal Thibaut for their help solving the problem. The code is using [Simmetrics](https://github.com/Simmetrics/simmetrics) for text similarity calculations.
