CREATE TABLE department
(
    id   SERIAL       NOT NULL,
    name VARCHAR(255) NOT NULL,
    CONSTRAINT pk_departmant PRIMARY KEY (id),
    CONSTRAINT uq_department_name UNIQUE (name)
);

CREATE TABLE employee
(
    id            SERIAL  NOT NULL,
    department_id INTEGER NOT NULL,
    boss_id       INTEGER,
    name          VARCHAR(255),
    salary        DECIMAL NOT NULL,
    CONSTRAINT pk_employee PRIMARY KEY (id),
    CONSTRAINT uq_employee_name UNIQUE (name),
    CONSTRAINT fk_employee_department FOREIGN KEY (department_id) REFERENCES department (id),
    CONSTRAINT fk_employee_boss FOREIGN KEY (boss_id) REFERENCES employee (id)
);

-- Найти сотрудников, получающих больше своего непосредственного руководителя.
