CREATE TABLE student_dbo.student(
  id VARCHAR(8),
  name NVARCHAR(64),
  gender VARCHAR(5),
  birthday DATE,
  address NVARCHAR(128),
  CONSTRAINT primary_key_student
  PRIMARY KEY(id)
)