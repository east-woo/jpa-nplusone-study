
-- Department 데이터 삽입 (4개 부서)
INSERT INTO department (name) VALUES ('HR');
INSERT INTO department (name) VALUES ('Finance');
INSERT INTO department (name) VALUES ('IT');
INSERT INTO department (name) VALUES ('Marketing');

-- Employee 데이터 삽입 (각 부서당 4명씩 총 20명)
-- HR 부서
INSERT INTO employee (name, department_id) VALUES ('Alice', 1);
INSERT INTO employee (name, department_id) VALUES ('Bob', 1);
INSERT INTO employee (name, department_id) VALUES ('Charlie', 1);
INSERT INTO employee (name, department_id) VALUES ('Diana', 1);

-- Finance 부서
INSERT INTO employee (name, department_id) VALUES ('Eve', 2);
INSERT INTO employee (name, department_id) VALUES ('Frank', 2);
INSERT INTO employee (name, department_id) VALUES ('Grace', 2);
INSERT INTO employee (name, department_id) VALUES ('Heidi', 2);

-- IT 부서
INSERT INTO employee (name, department_id) VALUES ('Ivan', 3);
INSERT INTO employee (name, department_id) VALUES ('Judy', 3);
INSERT INTO employee (name, department_id) VALUES ('Kevin', 3);
INSERT INTO employee (name, department_id) VALUES ('Laura', 3);

-- Marketing 부서
INSERT INTO employee (name, department_id) VALUES ('Mallory', 4);
INSERT INTO employee (name, department_id) VALUES ('Niaj', 4);
INSERT INTO employee (name, department_id) VALUES ('Olivia', 4);
INSERT INTO employee (name, department_id) VALUES ('Peggy', 4);

-- 추가 예시 (총 20명 만들기)
INSERT INTO employee (name, department_id) VALUES ('Trent', 1);
INSERT INTO employee (name, department_id) VALUES ('Victor', 2);
INSERT INTO employee (name, department_id) VALUES ('Walter', 3);
INSERT INTO employee (name, department_id) VALUES ('Xavier', 4);