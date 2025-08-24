-- Department 테이블 생성
CREATE TABLE department (
                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                            name VARCHAR(100) NOT NULL
);

-- Employee 테이블 생성
CREATE TABLE employee (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(100) NOT NULL,
                          department_id BIGINT NOT NULL,
                          CONSTRAINT fk_employee_department FOREIGN KEY (department_id)
                              REFERENCES department (id)
);
