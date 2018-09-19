-- select * from dept
Select * from scott.dept;

-- select employee count from each dept

select count(empno), e.deptno,d.dname from scott.emp e,scott.dept d where e.deptno=d.deptno group by e.deptno,d.dname;



--Select all rows from employe
select * from scott.emp;
-- Select max sal from emp table.
select  ename, sal from scott.emp where sal=(select max(sal) from scott.emp);
-- max sal from each dept
select  deptno, max(sal),ename from scott.emp group by deptno; 

-- 2nd highest salary

select ename,sal from (select rownum rn, sal, ename from scott.emp order by rn) where rn=2;

-- Top 4 salary

select ename,sal from(select rownum rn, ename,sal from scott.emp order by rn) where rn<=4;

-- query to count duplicate sal

select sal, count(*) from scott.emp group by sal having count(*)>1;

-- query to count department numbers

select deptno, count(*) from scott.emp group by deptno order by count(*);

-- <> Example
select * from scott.emp where empno<>7839

-- In Example
select * from scott.emp where empno IN 7839

-- Not In Example
select * from scott.emp where empno Not IN 7839


-- J oin Examples
-- Right outer join
select e.ename,d.dname from scott.emp e RIGHT Outer JOIN scott.dept d on e.deptno=d.deptno;
-- left outer join

select e.ename,d.dname from scott.emp e left outer join scott.dept d on e.deptno=d.deptno;

-- full outer join

select e.ename,d.dname from scott.emp e full outer join scott.dept d on e.deptno=d.deptno;

-- Union select combines similar data from 2 result set

select deptno from scott.emp Union select deptno from scott.dept;

-- Union select combines similar data from 2 result set allows duplicate

select deptno from scott.emp Union All select deptno from scott.dept;

-- select distinct deptno from emp

select distinct(deptno) from scott.emp;

-- Natural Join
select * from scott.emp natural join scott.dept;

-- Is null example;
select * from scott.emp where mgr is null;
-- Is null example;
select * from scott.emp where mgr is not null;

-- self join
select e.ename ||' works for ' || m.ename from scott.emp e, scott.emp m where e.mgr=m.empno;

-- nvl example
select ename, nvl(comm,0) as commision from scott.emp;

-- nvl2
select ename,sal, nvl2(comm, sal+comm,sal) as bonus from scott.emp;

-- select employees who gets max sal <1700 from each dept

select max(sal), deptno, ename from scott.emp group by deptno,ename having max(sal)<1700 order by max(sal) desc;
