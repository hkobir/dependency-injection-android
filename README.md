# dependency-injection-android
DI, Android, Dagger

## Instruction : 
Android dependency Injection: Provide dependent object outside of the class rather than 
tightly coupled as created object inside a class.

=>2 types of DI: 1)Manual DI 2)Automatic DI

1) Manual DI: In coding of java we manualy pass dependent object by creation.
2) Automatic DI: But if we used a framwork called Dagger or library can pass independent object automatically for a class.

# --in this repository manual DI example are given into test directory
# --then whole project is example of Automatic DI with dagger

# DI for this project are organized with following topics with dagger:

- Android dependency injection with manual purpose
- Using @Inject and @Component
- FIELD INJECTION
- METHOD INJECTION using @Inject
- FIELD INJECTION in a class
- @MODULE and @PROVIDES annotation
- @BINDS and @MODULE to create objct
- Injecting field values at runtime
- @COMPONENT.BUILDER, @BINDINSTANCE
- @SINGLETON annotation
- Relation between @SINGLETON and @COMPONENT to create same instance everytime

# Recources:
- DI and Dagger2: https://en.proft.me/2016/12/28/getting-started-dependency-injection-android-using/
- when should use DI: http://tutorials.jenkov.com/dependency-injection/when-to-use-dependency-injection.html