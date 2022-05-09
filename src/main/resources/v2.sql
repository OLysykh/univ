USE hogwardsv2;

-- populating persons with students and professors
INSERT INTO persons (personName,personSurrname,personAge)
VALUES
('Harry','Potter',10),
('Harry','Styles',12),
('Harry','Kane', 14),
('Lilly','Potter', 15),
('Bill','Gates', 10),
('Jack','Daniels', 12),
('Tullamore','Dew', 14),
('Michael','Jordan', 11),
('Ronald','Mcdonald', 12),
('Arnold','Swartzneger', 16),
('Tom','Cruise', 11),
('Harrison','Ford', 13),
('Penelopa','Cruise', 12),
('Kira','Knightley', 13),
('Draco','MALFOY', 10),
('Tom','Riddle', 14),
('Ariana','Riddle', 12),
('Justin','Trudeo', 13),
('Marvo','Trudeo', 11),
('Helga','Huffepuff', 10),
('Ariana','Jonkins', 12),
('Molly','Weasley', 16),
('Charlie','Weasley', 15),
('George','Weasley', 13),
('Percy','Weasley', 16),
('Lee','Jordan', 16),
('Ariana','Jonkins', 16),
('Narcissa','Malfoy', 12),
('Ted','Tonks', 10),
('Ariana','Tonks', 16),
('Oliver','Wood', 11),
('Oliver','Weasley', 12),
('Ron','Weasley', 10),
('Germiona','Greyndjow', 10),
('Bertha','Jordan', 16),
('Kanye','Wes', 16),
('George','Clooney', 15),
('Kobe','Bryant', 12),
('Nichael','Scott', 11),
('Anakin','Skywalker', 16),
('Severus','Snape', 35),
('Horas','Slughorn', 40),
('Albus','Dumbledore', 77),
('Amycus','Carrow', 55),
('Severus','Snape', 43),
('Minerva','McGonagall', 53),
('Pomona',' Sprout', 63),
('Filius','Flitwick', 61),
('Minevra','McGonall', 45),
('Doloreus','Ambridge', 66),
('Rubeus','Hagrid', 55),
('Remus','Lupin', 35);

-- populating groups 
INSERT INTO studentgroups (studentQuantity, yearOfStudy)
VALUES
(25,1),
(30,2),
(21,3),
(21,1);


 -- populating subjects - one subject can be teached by several professors. One professor - one subject
 INSERT INTO subjects (subjectName)
VALUES
('Potions'),
('Dark Arts'),
('Alchemy'),
('History of Magic'),
('Transfiguration'),
('Herbology');

-- populating professors with persons
INSERT INTO professors (person_id)
SELECT id
FROM persons
WHERE personAge >=20;

  -- populating houses with data
INSERT INTO houses (houseName,houseFounder,houseAnimal,houseCommonRoom,houseHead_id)
VALUES
('Gryffindor','Godric Gryffindor','Lion','Gryffindor Tower',6),
('Hufflepuff','Helga Hufflepuff','Badger','Hufflepuff Basement',8),
('Ravenclaw','Rowena Ravenclawr','Eagle','Ravenclaw Tower',7 ),
('Slytherin','Salazar Slytherin','Snake','Slytherin Dungeon',1 );

-- updating professors academic degree according to age 
UPDATE professors
SET  academicDegree = "Architect" 
WHERE person_id IN (
SELECT id 
FROM persons where personAge > 65);

UPDATE professors
SET  academicDegree = "Master" 
WHERE person_id IN (
SELECT id 
FROM persons where personAge > 55 AND  personAge <= 65);

UPDATE professors
SET  academicDegree = "Senior" 
WHERE person_id IN (
SELECT id 
FROM persons where personAge <= 35 AND  personAge < 55);

-- updating professors slary according to degree

UPDATE professors
SET salary = 500
WHERE academicDegree = "Senior";

UPDATE professors
SET salary = 800
WHERE academicDegree = "Master";

UPDATE professors
SET salary = 1000
WHERE academicDegree = "Architect";

UPDATE professors
SET salary = 250
WHERE academicDegree = "Junior";

-- populating students with persons
INSERT INTO students (person_id)
SELECT id
FROM persons
WHERE personAge <20;

-- populating studentCharacteristics with students
 INSERT INTO studentcharacteristicssetup (student_id)
 SELECT id
 FROM students;
 
 -- populating studentCharacteristics with Characteristics(Bravery....)
UPDATE studentcharacteristicssetup
SET bravery = 5, hardWork = 3, intelligence = 3, ambition = 1
WHERE id <11;

UPDATE studentcharacteristicssetup
SET bravery = 3, hardWork = 5, intelligence = 1, ambition = 2
WHERE id > 10 AND id <21;

UPDATE studentcharacteristicssetup
SET bravery = 2, hardWork = 3, intelligence = 5, ambition = 2
WHERE id > 20 AND id <31;

UPDATE studentcharacteristicssetup
SET bravery = 0, hardWork = 2, intelligence = 4, ambition = 5
WHERE id > 30 AND id <=50;


-- populating students with Houses Names(that`s equal to Faculties here, in Hogwarts) based on their characteriistics

UPDATE students
SET studentHouse = "Gryffindor" 
WHERE id IN (
SELECT student_id 
FROM studentcharacteristicssetup where bravery = 5);

UPDATE students
SET studentHouse = "Ravenclaw" 
WHERE id IN (
SELECT student_id 
FROM studentcharacteristicssetup where hardWork = 5);

UPDATE students
SET studentHouse = "Hufflepuff" 
WHERE id IN (
SELECT student_id 
FROM studentcharacteristicssetup where intelligence = 5);

UPDATE students
SET studentHouse = "Slytherin" 
WHERE id IN (
SELECT student_id 
FROM studentcharacteristicssetup where ambition = 5);



 -- populating professors with subject id`s so we hace 12 professors and 6 subjects
UPDATE professors
SET subject_id = 2 
LIMIT 2;

UPDATE professors
SET subject_id = 3
WHERE subject_id = 1
LIMIT 2;

UPDATE professors
SET subject_id = 4
WHERE subject_id = 1
LIMIT 2;

UPDATE professors
SET subject_id = 4
WHERE subject_id = 1
LIMIT 2;
 
UPDATE professors
SET subject_id = 5
WHERE subject_id = 1
LIMIT 2;
 


-- JOINS!
 
SELECT persons.personName,persons.personSurrname,professors.academicDegree, professors.salary
 FROM persons
 INNER JOIN professors ON persons.id = professors.person_id
 ORDER BY professors.salary DESC;
 
SELECT professors.academicDegree, persons.personName, persons.personSurrname,subjects.subjectName
  FROM professors
  INNER JOIN persons ON professors.person_id = persons.id
  INNER JOIN subjects ON subjects.id = professors.subject_id;

SELECT professors.academicDegree, persons.personName, persons.personSurrname,houses.houseName,houseCommonRoom
FROM professors
INNER JOIN persons ON professors.person_id = persons.id
RIGHT JOIN houses ON professors.id = houseHead_id;

SELECT * FROM professors
 LEFT join persons ON professors.person_id = persons.id;
 
 SELECT * FROM students 
 LEFT JOIN persons on students.person_id = persons.id;