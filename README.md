# Rest Assured - Java - Stocbit

## Requirement
1. install java 15 <br> langkah-langkah untuk install java bisa di link dibawah ini : <br> https://www.programmerzamannow.com/pemrograman/java/dasar/menginstall-java/
2. install IDE bisa menggunakan IntelliJ IDEA atau Eclipse
3. install Maven <br> langkah-langkah untuk install maven bisa di link dibawah ini : <br> https://phoenixnap.com/kb/install-maven-windows

## setup process of the project
1. clone project dari link github dibawah ini : <br> https://github.com/FikyAnggra/restassured-java-stockbit.git
2. buka project di IDE yang sudah di install
3. Open Project dan pilih project yang sudah di clone dari github
4. struktur project :
    - src/test/java/config <br> digunakan untuk config base URL dan juga endpoint yang akan digunakan
    - src/test/java/services <br> didalam package services terdapat beberapa package yang berisi endpoint yang tersedia. dalam case disini terdapat package companies didalam package service dan didalam package companies terdapat endpoint getCompanies dan getCompaniesQuanitity
    - src/resources/jsonSchema <br> digunakan untuk menyimpan semua jsonSchema untuk setiap service. dalam case ini terdapat file getCompany.json yang berupa jsonSchema untuk verify json schemanya sudah sesuai atau belum.
5. running case
   - case 1. <br> Create automation script for this
     endpoint “https://fakerapi.it/api/v1/companies?_quantity=<number of data>”. Test this
     API using <number_of_data> values of 20, 5, and 1 <br> <br> untuk case 1 disini dapat dijalankan di file src/test/services/companies/getCompaniesQuantity.java
   - Case 2. <br> Verify the “id” is must be not null, please use loop function for verify the all
     data from the endpoint and Verify JSON Schema <br> <br> untuk case 2 disini dapat dijalankan di file src/test/services/companies/getCompanies.java