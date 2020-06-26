# Rest Spring Boot

Rest using spring boot. part service untuk menggunakan JWT (Json Web Token).


This is Hello world of REST using Spring Boot.

untuk compile dan package di eclipse (mvn) pake goal repacakge


'clean compile package spring-boot:repackage'


request token ke jwt auth:


curl -X POST -H 'Content-Type: application/json' -i http://localhost:8080/authenticate --data '{  "username":"javainuse",  "password":"password" }'

lalu request ke service ini dengan Bearer token:


curl -X POST -H 'Content-Type: application/json' -H 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYXZhaW51c2UiLCJleHAiOjE1NzIwMDg3MjAsImlhdCI6MTU3MTk5MDcyMH0.CEF47f8qwV4FJeGKCJm4bYcxmvKaGfeozoFxQ7244Qxzru_x8I0ZG8nQ07uKu-Llmic4GDZNde4ZNkUcICaImQ' -i http://localhost:8080/hello --data '{  "helloMessage":"theHu" }'

### parts

repo ini untuk Rest service yg memanfaatkan JWT
untuk service yg menyediakan link [authenticate](http://localhost:8080/authenticate) nya adalah repo [ini](https://github.com/suryogumilar/sgrest-jwt-auth/tree/split-jwt-lib)

link penyedia authenticate service menggunakan lib dari repo [ini](https://github.com/suryogumilar/sgrest-jwt-lib) (dependant) 
