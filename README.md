# Estimate Primary & Foreign Keys in a Database

Do you need to import CSV files into a database but no one gave you the entity–relationship model to set up the primary and foreign keys?

Say no more.

![screenshot](https://github.com/janmotl/linkifier/blob/master/ScreenShot.png)

## Usage

 1. Download the latest [release](https://github.com/janmotl/linkifier/releases)
 2. Execute the jar file (requieres JRE 8.0 or newer)
 3. Estimate the primary and foreign key constraints
 4. Export the estimates (multiple formats are supported including SQL alter queries and graphml for ER-diagram visualization)
  
## Algorithm
The algorithm works on the metadata about tables and columns that are accessible over JDBC and column and table statistics, which the database use for the execution plan optimization. That means that the algorithm is blazing fast (as it does not look at the actual data).


### Primary Key
Primary keys are identified by:

 1. Column position in the table (PKs are commonly at the beginning)
 2. Data type (e.g. integers are preferred over doubles)
 3. Presence of a keyword like "id" in the column name
 4. Similarity of the column name with the table name
 5. Ratio of nulls in the column from the column statistics
 6. Average column width in bytes from the column statistics (PKs are commonly short)

Once these features are collected, they are passed to logistic regression to estimate the probability that the column is the primary key. Since each table can have at most a single PK, the column with the highest probability in the table is declared to be the primary key of the table. 

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

## Limitations
If the schema quality is extremely low (e.g. all columns are typed as text and have irrelevant names), the PK and particularly FK estimates are going to be off. First, set correct data types and names to the columns. Then rerun Linkifier. Great [DBLint](https://dblint.codeplex.com/) may help you to identify some of the problems with your schema. 

If you have questions or suggestions, let me know.

## Acknowledgement
I would like to thank Aleš Fišer, Oliver Kerul’-Kmec, Jan Kukačka, Jiří Kukačka, Manuel Muñoz and Batal Thibaut for their help solving the problem. The code is using [Simmetrics](https://github.com/Simmetrics/simmetrics) for text similarity calculations.
