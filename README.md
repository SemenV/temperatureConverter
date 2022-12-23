# temperatureConverter
Convert temperature between Kelvin, Fahrengeit and Celsius

# Start
Clone repository
> git clone https://github.com/SemenV/temperatureConverter.git

Cd working dir 
> cd temperatureConverter

Build image 
> docker build -t app .
![docker build](pictures/docker_build.png)

Run application
> docker run app (-cf | -fc | -fk | -ck | -kx | -kf) number

![run app 1 cf](pictures/run_app_1_cf.png)

![run app 2 fc](pictures/run_app_2_fc.png)

![run app 3 ck](pictures/run_app_3_ck.png)