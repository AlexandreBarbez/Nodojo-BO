# Nodojo-BO - A coding event app.

This app is made by Edouard Souan and Alexandre Barbez to promote coding while learning new skills building this product.


##Compiling the sources with gradle

Thanks to [Graddle] the compilation doesn't need you to install anything, just download the sources from the repository and run the batch script if you're on windows or the shell script if you're on mac/linux :
```shell
user@computer:~/Workspace/Nodojo$ ./gradlew build 
```

##Launch the app on jetty

The WebApp is deployed on jetty, an internal app server that doesn't require you to install enything. Once the project is built, just run the following command :
```shell
user@computer:~/Workspace/Nodojo$ ./gradlew bootRun
```

By default, the server is listening on `port 8080`




##Datasources
### Section under development

Install postgresql database with homebrew :
```
user@computer:~$ brew brew install postgres
```

Install the brew services that will allow you to controll such services easily
```
user@computer:~$ brew tap homebrew/services
```

Start postgresql database with homebrew :
```
user@computer:~$ brew services start/stop postgresql
```



[Graddle]: https://spring.io/guides/gs/gradle/