# Write your MySQL query statement below
select distinct  id from ( select author_id as id from Views where author_id = viewer_id )  as t order by id ;