## Hibernate là gì 

https://viblo.asia/p/nhung-ly-do-khien-ta-chon-hibernate-thay-vi-jdbc-Qbq5QroJKD8



Hibernate là một thư viện ORM (Object Relational Mapping) mã nguồn mở giúp lập trình viên viết ứng dụng Java có thể map các objects (pojo) với hệ quản trị cơ sở dữ liệu quan hệ, và hỗ trợ thực hiện các khái niệm lập trình hướng đối tượng với cớ dữ liệu quan hệ. 


Hibernate Workflow  Persistence object Chính là các POJO object map với các table tương ứng của cơ sở dữ liệu quan hệ. 

Nó như là những "thùng xe" chứa dữ liệu từ ứng dụng để ghi xuống database, hay chứa dữ liệu tải lên ứng dụng từ database. 

Session Factory Là một interface giúp tạo ra session kết nối đến database bằng cách đọc các cấu hình trong Hibernate configuration. Mỗi một database phải có một session factory. 