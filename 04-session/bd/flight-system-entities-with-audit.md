# Flight Management System — Entities & Attributes (with Audit Fields)

> Conventions: Primary key = `id`. Foreign keys follow `<entity>_id`.

---

## module_security

### person
- `id`
- `first_name`
- `last_name`
- `document_type`
- `document_number`
- `birth_date`
- `email`
- `phone`
- `address`
- `city_id`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### user
- `id`
- `person_id`
- `username`
- `email`
- `password_hash`
- `password_updated_at`
- `mfa_enabled`
- `last_login_at`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### role
- `id`
- `name`
- `code`
- `description`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### permission
- `id`
- `role_id`
- `resource`
- `action`
- `code`
- `description`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

---

## geolocation

### continent
- `id`
- `name`
- `code`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### country
- `id`
- `continent_id`
- `name`
- `iso2`
- `iso3`
- `phone_code`
- `currency_code`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### department
- `id`
- `country_id`
- `name`
- `code`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### city
- `id`
- `department_id`
- `name`
- `iata_code`
- `latitude`
- `longitude`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

---

## module_infrastructure

### airport
- `id`
- `city_id`
- `name`
- `iata_code`
- `icao_code`
- `latitude`
- `longitude`
- `elevation_ft`
- `timezone`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### terminal
- `id`
- `airport_id`
- `name`
- `code`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### boarding_gate
- `id`
- `terminal_id`
- `code`
- `level`
- `type`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### runway
- `id`
- `airport_id`
- `identifier`
- `length_m`
- `width_m`
- `surface`
- `lighting`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### maintenance_facility
- `id`
- `airport_id`
- `name`
- `provider`
- `certifications`
- `capacity_aircraft`
- `contact_email`
- `contact_phone`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

---

## module_managementFlight

### airline
- `id`
- `name`
- `iata_code`
- `icao_code`
- `callsign`
- `country_id`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### aircraft
- `id`
- `airline_id`
- `aircraft_type_id`
- `tail_number`
- `manufacture_date`
- `seat_capacity_total`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### route
- `id`
- `origin_airport_id`
- `destination_airport_id`
- `distance_nm`
- `duration_scheduled_min`
- `is_international`
- `route_code`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### flight
- `id`
- `airline_id`
- `route_id`
- `aircraft_id`
- `flight_type_id`
- `flight_number`
- `effective_from`
- `effective_to`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### flight_schedule
- `id`
- `flight_id`
- `departure_datetime_local`
- `arrival_datetime_local`
- `departure_timezone`
- `arrival_timezone`
- `recurrence_rule`
- `boarding_gate_id`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### flight_status
- `id`
- `code`
- `name`
- `description`
- `is_final`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### crew_role
- `id`
- `code`
- `name`
- `description`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### crew_member
- `id`
- `person_id`
- `airline_id`
- `hire_date`
- `license_number`
- `license_valid_until`
- `medical_class`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### crew_assignment
- `id`
- `flight_id`
- `crew_member_id`
- `crew_role_id`
- `duty_start_utc`
- `duty_end_utc`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

---

## passengers_and_services

### passenger
- `id`
- `person_id`
- `nationality_country_id`
- `frequent_flyer_number`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### reservation
- `id`
- `passenger_id`
- `flight_id`
- `reservation_code`
- `booked_at`
- `payment_status`
- `hold_until`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### ticket
- `id`
- `reservation_id`
- `ticket_class_id`
- `ticket_number`
- `issued_at`
- `fare_amount`
- `tax_amount`
- `currency_code`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### baggage
- `id`
- `ticket_id`
- `pieces`
- `weight_kg`
- `length_cm`
- `width_cm`
- `height_cm`
- `is_overweight`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### checkin
- `id`
- `ticket_id`
- `checked_in_at`
- `seat_number`
- `boarding_group`
- `boarding_gate_id`
- `bag_drop_counter`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

---

## parameterization

### aircraft_type
- `id`
- `manufacturer`
- `model`
- `icao_code`
- `iata_code`
- `typical_range_km`
- `typical_seat_capacity`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### flight_type
- `id`
- `code`
- `name`
- `description`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`

### ticket_class
- `id`
- `code`
- `name`
- `description`
- `created_by`
- `updated_by`
- `deleted_by`
- `created_at`
- `updated_at`
- `deleted_at`
- `status`
