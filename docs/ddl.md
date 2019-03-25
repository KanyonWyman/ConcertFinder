```sql
CREATE TABLE IF NOT EXISTS `${Concert}` (
`_id` INTEGER NOT NULL, 
`_name` TEXT, 
`_phone_number` TEXT, 
`_email` TEXT, 
PRIMARY KEY(`_id`));

CREATE TABLE IF NOT EXISTS `${TABLE_NAME}` (`_name` TEXT NOT NULL, `_location` TEXT, PRIMARY KEY(`_name`))
```