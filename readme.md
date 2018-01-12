
Конфигуратор доступен по http://localhost:8080/

Все репозитарии доступны по http://localhost:8080/rest/* , Конкретный ресурс подефолту определяется из имени класса обслуживаемого ресурса, с маленькой буквы и с постфиксом 's', например pumps, filterCircuits

Добавив в зависимости <artifactId>spring-data-rest-hal-browser</artifactId>, получим доступ к HAL браузеру
http://localhost:8080/rest/browser/index.html#/rest


