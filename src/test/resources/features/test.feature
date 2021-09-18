#Sebastian Metaute

@Runner

Feature: Register User
  As User
  I want to login
  To register on the platform



  @Register

  Scenario: Register User

    Given she quiere registrar sus datos en the Web Automation advantageonlines

    When she enter your personal data
      |userName|email|password|confirm_password|first_Name|last_name|phone_Number|country|city|address|state|postal_Code|
      |sebasmetaute@gmail.com|sebasmetaute@gmail.com|Daniel22*|Prueba|Sebastian|Metaute|3006295223|United States   |Medellin|Carrera 12 12-15|Florida|10120|

    Then verifies that is loading with text My account



  @Loguin

  Scenario: Loguin User

    Given that she wants to enter the system

    When she enters username and password
      |userName|password|
      |sebasmetaute@gmail.com|Daniel22*|

    Then verifies that is loading My account
