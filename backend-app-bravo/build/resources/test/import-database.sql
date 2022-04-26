

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
