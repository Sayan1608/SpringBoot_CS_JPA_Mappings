--patients
INSERT INTO mappings.patient (name, email, birth_date, gender, blood_group_type, created_at) VALUES
    ('Rahul Sharma', 'rahul.sharma@example.com', '1990-05-12', 'MALE', 'O_POSITIVE', NOW()),
    ('Anjali Mehta', 'anjali.mehta@example.com', '1995-08-21', 'FEMALE', 'A_POSITIVE', NOW()),
    ('Sourav Das', 'sourav.das@example.com', '1988-03-15', 'MALE', 'B_POSITIVE', NOW()),
    ('Priya Nair', 'priya.nair@example.com', '1992-11-30', 'FEMALE', 'AB_POSITIVE', NOW()),
    ('Amit Verma', 'amit.verma@example.com', '1985-07-09', 'MALE', 'O_NEGATIVE', NOW()),
    ('Neha Kapoor', 'neha.kapoor@example.com', '1998-01-18', 'FEMALE', 'A_NEGATIVE', NOW()),
    ('Rohit Singh', 'rohit.singh@example.com', '1991-06-25', 'MALE', 'B_NEGATIVE', NOW()),
    ('Kavita Iyer', 'kavita.iyer@example.com', '1993-09-14', 'FEMALE', 'AB_NEGATIVE', NOW()),
    ('Arjun Reddy', 'arjun.reddy@example.com', '1987-12-05', 'MALE', 'O_POSITIVE', NOW()),
    ('Sneha Patil', 'sneha.patil@example.com', '1996-04-22', 'FEMALE', 'A_POSITIVE', NOW()),

    ('Vikram Joshi', 'vikram.joshi@example.com', '1989-02-11', 'MALE', 'B_POSITIVE', NOW()),
    ('Pooja Chatterjee', 'pooja.chatterjee@example.com', '1994-10-03', 'FEMALE', 'AB_POSITIVE', NOW()),
    ('Karan Malhotra', 'karan.malhotra@example.com', '1990-01-27', 'MALE', 'O_NEGATIVE', NOW()),
    ('Divya Shetty', 'divya.shetty@example.com', '1997-07-19', 'FEMALE', 'A_NEGATIVE', NOW()),
    ('Manish Gupta', 'manish.gupta@example.com', '1986-05-08', 'MALE', 'B_NEGATIVE', NOW()),
    ('Ritu Saxena', 'ritu.saxena@example.com', '1993-12-29', 'FEMALE', 'AB_NEGATIVE', NOW()),
    ('Aditya Kulkarni', 'aditya.kulkarni@example.com', '1988-08-16', 'MALE', 'O_POSITIVE', NOW()),
    ('Meera Pillai', 'meera.pillai@example.com', '1995-03-07', 'FEMALE', 'A_POSITIVE', NOW()),
    ('Nikhil Bansal', 'nikhil.bansal@example.com', '1992-06-13', 'MALE', 'B_POSITIVE', NOW()),
    ('Shreya Ghosh', 'shreya.ghosh@example.com', '1999-11-25', 'FEMALE', 'AB_POSITIVE', NOW());


--doctors

INSERT INTO doctor (name, specialization, email) VALUES
     ('Dr. Rajesh Kumar', 'Cardiology', 'rajesh.kumar@hospital.com'),
     ('Dr. Priya Sharma', 'Dermatology', 'priya.sharma@hospital.com'),
     ('Dr. Amit Verma', 'Orthopedics', 'amit.verma@hospital.com'),
     ('Dr. Sneha Reddy', 'Pediatrics', 'sneha.reddy@hospital.com'),
     ('Dr. Vikram Singh', 'Neurology', 'vikram.singh@hospital.com'),
     ('Dr. Neha Kapoor', 'Gynecology', 'neha.kapoor@hospital.com'),
     ('Dr. Arjun Mehta', 'General Medicine', 'arjun.mehta@hospital.com'),
     ('Dr. Kavita Iyer', 'Ophthalmology', 'kavita.iyer@hospital.com'),
     ('Dr. Rohit Das', 'ENT', 'rohit.das@hospital.com'),
     ('Dr. Anjali Nair', 'Psychiatry', 'anjali.nair@hospital.com');