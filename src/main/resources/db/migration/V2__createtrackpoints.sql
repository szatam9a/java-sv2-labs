create table track_point (
id bigint auto_increment,
activities_id bigint,
time date,
lat float,
lon float,
primary key(id)
)