CREATE DATABASE students_score;
USE students_score;

CREATE TABLE faculty (
id INT NOT NULL,
specialty_name VARCHAR(40) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE group (
id INT NOT NULL,
code_name VARCHAR(30) NOT NULL,
faculty_id INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (faculty_id)
REFERENCES faculty (id)
);

CREATE TABLE scholarship (
id INT NOT NULL,
amount INT NOT NULL,
PRIMARY KEY (id)
);


CREATE TABLE student (
id INT NOT NULL,
name VARCHAR(40) NOT NULL,
middle_name VARCHAR(40) NULL,
surname VARCHAR(40) NOT NULL,
photo BLOB NULL,
biography BLOB NULL,
address VARCHAR(80) NOT NULL,
enter_year YEAR NOT NULL,
birth_year YEAR NOT NULL,
rating DECIMAL NOT NULL,
group_id INT NOT NULL,
scholarship_id INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (group_id)
REFERENCES group (id),
FOREIGN KEY (scholarship_id)
REFERENCES scholarship (id)
);

CREATE TABLE teacher (
id INT NOT NULL,
name VARCHAR(30) NOT NULL,
middle_name VARCHAR(30) NOT NULL,
surname VARCHAR(30) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE subject (
id INT NOT NULL,
name VARCHAR(30) NOT NULL,
teacher_id INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (teacher_id)
REFERENCES teacher (id)
);

CREATE TABLE module_score (
id INT NOT NULL,
number INT NOT NULL,
score INT NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE semester_score (
id INT NOT NULL,
number INT NOT NULL,
sroce_100 INT(3) NOT NULL,
score_5 INT(1) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE assessment (
id INT NOT NULL,
type ENUM('exam', 'test') NOT NULL,
module_score_id INT NOT NULL,
subject_id INT NOT NULL,
semester_score_id INT NOT NULL,
student_id INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (module_score_id)
REFERENCES module_score (id),
FOREIGN KEY (subject_id)
REFERENCES subject (id),
FOREIGN KEY (semester_score_id)
REFERENCES semester_score (id),
FOREIGN KEY (student_id)
REFERENCES student (id)
);