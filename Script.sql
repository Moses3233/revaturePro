select count(t.teamid) as team_count
from team t
group by t.teamid 
order by team_count;

select p.playedby, p."Rank", t."Rank", t.playername
from player p
left join team t
on p."Rank" = t."Rank";

select p.playedby, p."Rank" 
from player p
where p."Rank" < 100
order by p."Rank";

select p."Rank", t.playername , p."Name", t.teamid 
from  team t
right join player p
on p."Rank" = t."Rank"
order by p."Rank";

select *
from  team t
full join player p
on p."Rank" = t."Rank";

select *
from player p
join team t
on p."Rank" = t."Rank";

create table payout(
tourneyID int,
recipient varchar (30),
prize int,
primary key (tourneyID)
)

INSERT INTO payout
values(104, 'Juanpi', 100);

INSERT into payout (tourneyID, recipient, prize)
values(101, 'Scrub', 50);

insert into payout (tourneyID, recipient, prize)
values(102, 'Juanpi', 100);

insert into payout (tourneyID, recipient, prize)
values(103, 'Ye', 30);


select sum(prize) 
from payout;

select avg(prize)
from payout;

select min(prize)
from payout
where (recipient = 'Juanpi');

select min(prize)
from payout;


drop table payout;
