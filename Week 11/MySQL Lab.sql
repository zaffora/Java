select app_name, app_id
from apps

where app_id = 1;

select a.app_name, av.reviews
from apps a
	left join apps_reviews  av on a.app_id = av.app_id

where app_name = 'Coloring book moana';

select app_id, app_name, price;

update apps
set price = 0

where app_id = 1;

delete apps, apps_reviews
from apps
	inner join apps_reviews on apps.app_id = apps_reviews.app_id
where apps.app_id = 2;

insert into apps_reviews (review_id, app_id, reviews) values (1611, 1, "It's OK");
insert into apps_reviews (review_id, app_id, reviews) values (1612, 1, "Not bad");

delete from apps_reviews
where review_id = 1611;

delete from apps_reviews
where review_id = 1612;
    