-- postgresql
CREATE OR REPLACE FUNCTION update_last_updated_at()
RETURNS TRIGGER AS $$
BEGIN
    NEW.last_updated_at = NOW();
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

create table public.t_student (
	id bigint not null,
	created_at timestamp(3) default current_timestamp(3) not null,
	last_updated_at timestamp(3) default current_timestamp(3) not null,
	"name" varchar(255) not null,
	age smallint not null,
	major varchar(255) not null,
	admission date not null,
	constraint t_student_pk primary key (id)
);


create trigger trigger_update_last_updated before
update on public.t_student for each row execute function update_last_updated_at();