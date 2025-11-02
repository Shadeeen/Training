create table students(
id serial primary key,
Sname Text ,
Semail text ,
registered_at date 
)

create table courses(
id serial primary key,
Ctitle text ,
Ccat text,
created_at date
)

create table enrollments(
id serial primary key,
student_id serial REFERENCES students(id),
course_id serial REFERENCES courses(id),
enrolled_at date
)

create table lessons(
id serial primary key,
course_id serial REFERENCES courses(id),
ltitle text,
duration_minutes integer 
)

create table quiz_scores(
id serial primary key,
student_id serial REFERENCES students(id),
lesson_id serial REFERENCES lessons(id),
score float ,
submitted_at date
)

/*List all students with their enrolled course titles.*/

select  s.sname ,c.ctitle from students s
inner join enrollments e  on  s.id=e.student_id
inner join courses c  on  c.id=e.course_id

/*List all courses along with the students enrolled (if any).*/

select  s.sname , c.ctitle from courses c 
left join enrollments e on e.course_id=c.id
left join students s  on  s.id=e.student_id

/*List all students and the course(s) they are enrolled in, if any.*/

SELECT s.sname, c.ctitle FROM students s
LEFT JOIN enrollments e ON s.id = e.student_id
LEFT JOIN courses c ON c.id = e.course_id;

/*Find the number of students enrolled in each course.*/

select c.ctitle , count(*) as number_of_students from courses c
left join enrollments e  on  c.id=e.course_id
group by c.ctitle

/*Find the average quiz score per student.*/

select s.sname , avg(q.score)  FROM students s
left join quiz_scores q on q.student_id =s.id
group by s.sname

/*Find the total duration of lessons per course.*/

select c.ctitle , sum(l.duration_minutes) as total FROM courses c
left join lessons l on l.course_id=c.id
group by c.ctitle

/*For each student, rank their quiz scores from highest to lowest*/

SELECT s.sname , q.score ,
RANK() OVER (PARTITION BY s.sname ORDER BY q.score DESC) AS Srank
FROM students s
left join quiz_scores q on q.student_id =s.id;

/*Show the previous quiz score of each student using LAG*/

select q.student_id, q.score,
LAG (q.score,1,0)
OVER (PARTItiON by q.student_id order by q.submitted_at) as previous_score
FROM quiz_scores q;

/*For each course, get the student who scored the highest quiz on any lesson*/

SELECT 
  ctitle as course,
  sname as student_name,
  score
FROM (
  SELECT 
    c.ctitle,
    s.sname,
    q.score,
RANK() OVER (PARTITION BY c.ctitle ORDER BY q.score DESC) as rankk
  FROM courses c
  left join lessons l ON l.course_id = c.id
  left join quiz_scores q ON q.lesson_id = l.id
  left join students s ON s.id = q.student_id
) 
where rankk = 1;


/*Show each student’s cumulative average quiz score*/

select s.sname ,q.score,
avg(q.score)OVER (PARTITION BY q.student_id order by q.submitted_at) as cumulative_avg
from students s
left join quiz_scores q on s.id=q.student_id


/*List all students who never submitted a quiz*/

select s.id , s.sname from students s
left join quiz_scores q on q.student_id=s.id
WHERE q.student_id IS NULL;

/*Find students who have enrolled in more than 2 courses*/

select s.id , count(e.course_id) as courses_count
from students s
inner join enrollments e on e.student_id=s.id
group by  s.id
having  count(e.course_id)> 2





