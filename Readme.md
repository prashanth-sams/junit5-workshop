# JUnit 5 Dumbs
> Exercise yourself with JUnit5 framework

| Exercise       | Status             | Exercise       | Status             | Exercise       | Status             |
| -------------- | ---------          | -------------- | ---------          | -------------- | ---------          |
| Hooks        | :white_check_mark: | Assumptions        | :white_check_mark: | Hamcrest        | :white_check_mark: |
| Parameterize      | :white_check_mark: | DisableTests      | :white_check_mark: | Listener      | :white_check_mark: |
| Order      | :white_check_mark: | Repeated Tests      | :white_check_mark: | Timeout      | :white_check_mark: |
| Tags      | :white_check_mark: | Assertions      | :white_check_mark: | Nested Tests      | :white_check_mark: |

___

### setup
1. Go to `IntelliJ IDEA > Preferences > Plugins`
2. Search and install plugin `Maven Archetype Catalogs`
3. Go to `IntelliJ IDEA > Preferences` and search `Maven`
4. Select `Maven Archetype Catalogs` and add this repository https://repo1.maven.org/maven2/archetype-catalog.xml
5. Go to `IntelliJ IDEA > New > Project...`
6. Select `Create from archetype > org.apache.maven.archetypes:maven-archetype-quickstart` and create a new project

> **Library Used**:
>
> JUnit Jupiter (Aggregator), Hamcrest

##### Note:
- Java JDK version 8 or higher is required for using JUnit 5
- JUnit Jupiter (Aggregator) is the best dependency to add to your project in order to have access to all the JUnit 5 features