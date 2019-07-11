CREATE DATABASE opentracing_demo_db2;

CREATE USER 'opentracing_dev'@'%' IDENTIFIED BY 'opentracing';

GRANT ALL ON opentracing_demo_db1.* TO 'opentracing_dev'@'%';

GRANT ALL ON opentracing_demo_db2.* TO 'opentracing_dev'@'%';

FLUSH PRIVILEGES;

