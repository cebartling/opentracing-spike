CREATE DATABASE opentracing_demo_db2;

CREATE USER 'opentracing_dev'@'%' IDENTIFIED BY 'opentracing';

GRANT ALL ON opentracing_demo_db1.* TO 'opentracing_dev'@'%';

GRANT ALL ON opentracing_demo_db2.* TO 'opentracing_dev'@'%';

FLUSH PRIVILEGES;

CREATE TABLE opentracing_demo_db1.participants (
  id                INTEGER AUTO_INCREMENT      NOT NULL,
  first_name        VARCHAR(40)                 NOT NULL,
  last_name         VARCHAR(50)                 NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE opentracing_demo_db2.preferences (
  id                INTEGER AUTO_INCREMENT      NOT NULL,
  participant_id    INTEGER                     NOT NULL,
  save_on_change    BOOLEAN DEFAULT 0           NOT NULL,
  PRIMARY KEY (id)
);


