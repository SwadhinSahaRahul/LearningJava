create database health_care_management;

create table password
(
    password varchar(255),
    name     varchar(255)
);

insert into password(password, name)
values ('123456', 'Admin'),
       ('123456', 'Swadhin');

drop table drugs;
create table drugs
(
    drugname varchar(255) not null,
    istock   int          null,
    ostock   int          null,
    mfgdate  varchar(255) null,
    field1   varchar(255) null,
    expdate  varchar(255) null,
    field2   varchar(255) null,
    total    int          null
);

drop table registration;
create table registration
(
    opno    varchar(255) primary key  not null,
    name    varchar(255)              not null,
    dep     varchar(255)              not null,
    age     int                       not null,
    sex     varchar(255)              not null,
    address varchar(255) default null null,
    symptom varchar(255) default null null
);

drop table inpacaserec;
create table inpacaserec
(
    opno                varchar(255) primary key not null,
    name                varchar(255)             not null,
    age                 int                      not null,
    sex                 varchar(255)             not null,
    occupation          varchar(255)             null,
    doa                 varchar(255)             null,
    dod                 varchar(255)             null,
    diagnosis           varchar(255)             null,
    presetcomplaint     varchar(255)             null,
    pasthis             varchar(255)             null,
    physicalexamination varchar(255)             null,
    investigation       varchar(255)             null
);

drop table registerout;
create table registerout
(
    opno       varchar(255) primary key not null,
    name       varchar(255)             not null,
    age        int                      not null,
    sex        varchar(255)             not null,
    occupation varchar(255)             null,
    doa        varchar(255)             null,
    diagnosis  varchar(255)             null
);