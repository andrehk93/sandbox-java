DROP TABLE IF EXISTS measurement;
CREATE TABLE measurement (id SERIAL PRIMARY KEY , ts INTEGER(64) , temp DECIMAL(10, 5) , humidity DECIMAL(10, 5) , pressure DECIMAL(10, 5));
