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

-- Найти среднюю зарплату работников каждого департамента (вывести департамент и значение средней зарплаты)

/*SELECT
    department_id,
    AVG(salary) AS average_salary
FROM
    employee
GROUP BY
    department_id;*/

-- Найти департаменты, в которых средняя зарплата сотрудников превышает 70,000,
-- и в которых количество сотрудников больше или равно 5. (вывести вывести департамент, количество сотрудников департамента и значение средней зарплаты)

/*SELECT
    department_id,
    COUNT(id) AS employee_count,
    AVG(salary) AS avg_salary
FROM
    employee
GROUP BY
    department_id
HAVING
        AVG(salary) > 70000 AND COUNT(id) >= 5;*/

-- Найти сотрудников, получающих больше своего непосредственного руководителя.
-- (вывести имя сотрудника, зарплату сотрудника, имя руководителя, зарплату руководителя)

/*SELECT
    e1.name AS employee_name,
    e1.salary AS employee_salary,
    e2.name AS boss_name,
    e2.salary AS boss_salary
FROM
    employee e1
        JOIN
    employee e2 ON e1.boss_id = e2.id
WHERE
        e1.salary > e2.salary;*/

/*SELECT  * FROM employee_001 e1
WHERE salary > (SELECT MAX(salary)
                FROM employee_001 e2 WHERE e1.boss_id = e2.id);*/
