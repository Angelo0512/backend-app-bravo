

/** Privilege **/
INSERT INTO public.privilege (id, name) VALUES (1, 'TECHNICIAN_PRIVILEGE');
INSERT INTO public.privilege (id, name) VALUES (2, 'CLIENT_PRIVILEGE');

/** Role **/
INSERT INTO public.role (id, name) VALUES (1, 'ROLE_TECH');
INSERT INTO public.role (id, name) VALUES (2, 'ROLE_CLI');

/** Role-Privilege **/
INSERT INTO public.role_privilege (role_id, privilege_id) VALUES (1, 1);

/** Users **/
INSERT INTO public.users (id, create_date, email, enabled, first_name, last_name, password, token_expired)
VALUES (1, '2020-04-18 22:26:00.000000', 'myemail@test.com', true, 'John', 'Doe', 'pass$123', false);

INSERT INTO public.users (id, create_date, email, enabled, first_name, last_name, password, token_expired)
VALUES (2, '2020-04-18 22:26:00.000000', 'jane@test.com', true, 'Jane', 'Doe', 'pass$456', false);

/** User-Role **/
INSERT INTO public.user_role (user_id, role_id) VALUES (1, 1);

/** Vehicles **/
INSERT INTO public.vehicle (id, brand,motor_serial, motor_type,plate_number,vehicle_class,vin_number)
VALUES (1, 'Audi','A12BC','Motor electrico','A34589','Deportivo', '123');
INSERT INTO public.vehicle (id, brand,motor_serial, motor_type,plate_number,vehicle_class,vin_number)
VALUES (2, 'Toyota','A12BC','Motor diesel','A98543','Pickup', '124');

/** Services **/
INSERT INTO public.service (id, oberservations, state)
VALUES (1, 'Cambio de aceite','ACTIVO');
INSERT INTO public.service (id, oberservations, state)
VALUES (2, 'Mantenimiento preventivo', 'COMPLETO');
INSERT INTO public.service (id, oberservations, state)
VALUES (3, 'Mantenimiento de neumaticos','ACTIVO');

/** Clients **/
INSERT INTO public.service (id, ,email, name, telephone)
VALUES (1, 'jane@test.com','Jane Doe', 61234567);
INSERT INTO public.service (id, ,email, name, telephone)
VALUES (2, 'bruce@test.com','Bruce Doe', 62234566);