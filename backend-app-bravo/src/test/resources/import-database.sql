/** Privilege **/
INSERT INTO public.privilege (id, name)
VALUES (1, 'TECHNICIAN_PRIVILEGE');
INSERT INTO public.privilege (id, name)
VALUES (2, 'CLIENT_PRIVILEGE');

/** Role **/
INSERT INTO public.role (id, name)
VALUES (1, 'ROLE_TECH');
INSERT INTO public.role (id, name)
VALUES (2, 'ROLE_CLI');

/** Role-Privilege **/
INSERT INTO public.role_privilege (role_id, privilege_id)
VALUES (1, 1);

/** Users **/
INSERT INTO public.users (id, create_date, email, enabled, first_name, last_name, password, token_expired)
VALUES (1, '2020-04-18 22:26:00.000000', 'myemail@test.com', true, 'John', 'Doe', '$2a$12$88XiNViQ1kzUr4NDKKm6juIvWc/CH22QcXfLeBV.sIAfeu4lyLJd6', false);
INSERT INTO public.users (id, create_date, email, enabled, first_name, last_name, password, token_expired)
VALUES (2, '2020-04-18 22:26:00.000000', 'jane@test.com', true, 'Jane', 'Doe', '$2a$12$88XiNViQ1kzUr4NDKKm6juIvWc/CH22QcXfLeBV.sIAfeu4lyLJd6', false);
INSERT INTO public.users (id, create_date, email, enabled, first_name, last_name, password, token_expired)
VALUES (3, '2020-04-18 22:26:00.000000', 'willian@test.com', true, 'Willian', 'Brown', '$2a$12$88XiNViQ1kzUr4NDKKm6juIvWc/CH22QcXfLeBV.sIAfeu4lyLJd6', false);
INSERT INTO public.users (id, create_date, email, enabled, first_name, last_name, password, token_expired)
VALUES (4, '2020-04-18 22:26:00.000000', 'bruce@test.com', true, 'Bruce', 'Rowland', '$2a$12$88XiNViQ1kzUr4NDKKm6juIvWc/CH22QcXfLeBV.sIAfeu4lyLJd6', false);
INSERT INTO public.users (id, create_date, email, enabled, first_name, last_name, password, token_expired)
VALUES (5, '2020-04-18 22:26:00.000000', 'dorothy@test.com', true, 'Dorothy', 'Rowland', '$2a$12$88XiNViQ1kzUr4NDKKm6juIvWc/CH22QcXfLeBV.sIAfeu4lyLJd6', false);
INSERT INTO public.users (id, create_date, email, enabled, first_name, last_name, password, token_expired)
VALUES (6, '2020-04-18 22:26:00.000000', 'dorothy@test.com', true, 'Emily', 'Smith', '$2a$12$88XiNViQ1kzUr4NDKKm6juIvWc/CH22QcXfLeBV.sIAfeu4lyLJd6', false);

/** User-Role **/
INSERT INTO public.user_role (user_id, role_id)
VALUES (1, 1);
INSERT INTO public.user_role (user_id, role_id)
VALUES (2, 1);
INSERT INTO public.user_role (user_id, role_id)
VALUES (3, 1);
INSERT INTO public.user_role (user_id, role_id)
VALUES (4, 2);
INSERT INTO public.user_role (user_id, role_id)
VALUES (5, 2);
INSERT INTO public.user_role (user_id, role_id)
VALUES (6, 2);
/** Vehicles**/
INSERT INTO public.vehicle (id, brand, motor_serial, motor_type, plate_number, vehicle_class, vin_number)
VALUES (1, 'Audi', 'A12BC', 'Motor electrico', 'A34589', 'Deportivo', '123');
INSERT INTO public.vehicle (id, brand, motor_serial, motor_type, plate_number, vehicle_class, vin_number)
VALUES (2, 'Toyota', 'A12BC', 'Motor diesel', 'A98543', 'Pickup', '124');


/** Services**/
INSERT INTO public.service (id, observations, state)
VALUES (1, 'Cambio de aceite', 1);
INSERT INTO public.service (id, observations, state)
VALUES (2, 'Mantenimiento preventivo', 1);
INSERT INTO public.service (id, observations, state)
VALUES (3, 'Mantenimiento de neumaticos', 1);


/** reports**/
INSERT INTO public.report (id, creation_date, description, client_id, technician_id, vehicle_id)
VALUES (1, '2020-04-26 14:26:00.000000', 'Reparacion cambio de aceite y neumaticos', 1, 5, 2);
INSERT INTO public.report (id, creation_date, description, client_id, technician_id, vehicle_id)
VALUES (2, '2020-04-28 11:45:00.000000', 'Mantenimiento preventivo de vehiculo', 2, 5, 1);

/**report_services**/
INSERT INTO public.report_services (report_id, service_id)
VALUES (1, 1);
INSERT INTO public.report_services (report_id, service_id)
VALUES (1, 3);
INSERT INTO public.report_services (report_id, service_id)
VALUES (2, 2);