/*
	Firstly, You will have to create the schema of your desired database.
    Then you will have to select or use that created schema on MySQL Workbench
    so that your Java IDE can compile to run the data related to this schema.
    
    Only after compiling your Java program that you will see all tables and 
    entity appearing in your database structure.

*/
create database store_inventory_1;
use store_inventory_1;

/* You must compile your Java code through your IDE to generate the different tables */

select * from store_inventory_1.table_of_products_1;

