# Estimate Primary & Foreign Keys in a Database

Do you need to import CSV files into a database but no one gave you the entity–relationship model to set up the primary and foreign keys?

Say no more.

## Download

See [releases](https://github.com/janmotl/linkifier/releases).

## Usage

The code performs following steps:

 1. Connects to the database with JDBC 
 2. Reads metadata about the tables and columns in the specified schema 
 3. Estimates the primary keys
 4. Estimates the foreign keys
 5. Returns SQL alter queries to the user

Following example code connects to the example database (can be changed in Setting.java) and reverse engines "financial" database:

```
Scoring.main("financial");
```

## Algorithm
The algorithm works exclusively on the metadata about tables and columns that are accessible over JDBC. That means that the algorithm is blazing fast (as it does not look at the actual data), works with any database out of box (assuming a corresponding JDBC driver is provided) and the estimates are not affected by the data quality (that can be a both, an advantage or a disadvantage).


### Primary Key
Primary keys are identified by:

 1. Column position in the table (PKs are commonly at the the beginning)
 2. Data type (e.g. integers are preferred over doubles)
 3. Presence of a keyword like "id" in the column name
 4. Similarity of the column name with the table name

Once these features are collected, they are passed to logistic regression to estimate the probability that the column is the primary key. Since each table can have at most a single PK, the column with the highest probability in the table is declared to be the primary key of the table.

### Foreign keys
Foreign keys are identified by:

 1. Known PKs (relationships must be between a PK and non-PK)
 2. Data types (relationships must be between agreeing data types)
 3. Data type properties (e.g. data type sizes should agree) 
 4. Similarity of the FK name with the PK name (should be high)
 5. Similarity of the FK name with the PK table name (should be high)
 6. Similarity of the FK name with the FK table name (should be low)

Once again, probabilities are estimated with logistic regression. And the most likely FKs are returned.
