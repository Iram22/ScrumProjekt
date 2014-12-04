
DROP TABLE første_runde;
DROP TABLE student;
DROP TABLE valgfag;


Create TABLE valgfag(
    id INTEGER NOT NULL PRIMARY KEY,
    fag VARCHAR(20)
);

Create TABLE student(
    id INTEGER NOT NULL PRIMARY KEY,
    navn VARCHAR(20)
);

Create TABLE første_runde(
    id INTEGER NOT NULL PRIMARY KEY,
    studentId INTEGER REFERENCES student(id),
    første_prioritet INTEGER REFERENCES valgfag(id),
    anden_prioritet INTEGER REFERENCES valgfag(id)
);





  
