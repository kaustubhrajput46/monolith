CREATE TABLE "users" (
  id UUID NOT NULL,
   first_name VARCHAR(255),
   last_name VARCHAR(255),
   email VARCHAR(255),
   password VARCHAR(255),
   roles VARCHAR(255),
   address VARCHAR(255),
   created_on TIMESTAMP WITHOUT TIME ZONE,
   created_by VARCHAR(255),
   last_modified_by VARCHAR(255),
   last_modified_on TIMESTAMP WITHOUT TIME ZONE,
   CONSTRAINT pk_users PRIMARY KEY (id)
);

insert into "users" (id, password, email, first_name, last_name, roles, address, created_on, created_by, last_modified_on, last_modified_by) values ('f81f9702-a152-43be-b89d-7a8bb6f3dea0', 'password', 'dummy@example.com', 'dummy', 'dummy', 'ADMIN', 'dummy address', '2021-01-01 00:00:00', 'admin', '2021-01-01 00:00:00', 'admin');

