## docker-compose influxdb

https://towardsdatascience.com/get-system-metrics-for-5-min-with-docker-telegraf-influxdb-and-grafana-97cfd957f0ac

https://www.influxdata.com/blog/running-influxdb-2-0-and-telegraf-using-docker/

https://github.com/jkehres/docker-compose-influxdb-grafana/blob/master/docker-compose.yml


https://github.com/gstearmit/docker-compose-influxdb-grafana
https://github.com/gstearmit/docker-compose-grafana-influxdb


Các cổng
Các dịch vụ trong ứng dụng chạy trên các cổng sau:

Tổ cổng	Dịch vụ
3000	Grafana
8086	InfluxDB
127.0.0.1:8888	Chronograf
## Lưu ý rằng Chronograf không hỗ trợ xác thực tên người dùng / mật khẩu. Bất kỳ ai có thể kết nối với dịch vụ đều có toàn quyền truy cập quản trị viên. Do đó, dịch vụ không được công khai và chỉ có thể được truy cập thông qua giao diện loopback trên cùng một máy chạy docker.

Nếu docker đang chạy trên máy từ xa hỗ trợ SSH, hãy sử dụng lệnh sau để thiết lập đường hầm SSH để truy cập Chronograf một cách an toàn bằng cách chuyển tiếp cổng 8888 trên máy từ xa tới cổng 8888 trên máy cục bộ:

ssh [options] <user>@<docker-host> -L 8888:localhost:8888 -N