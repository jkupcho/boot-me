## Boot-Me

### Interface and Implementation
* Located in package ```com.dardo.mke.mg```
* Uses Spring to inject the implementations
  * See ```com.dardo.mke.mg.config``` package for configuration.

### Algorithms
* Located in package ```com.dardo.mke.mg.alg```
* All methods are pure, and implementations are thread-safe.
* Tried to implement with Quickest implementation in mind.
* Accounted for case sensitivity within the ```Used``` implementation through constructor-arg.

### Spring
* If using Spring to bootstrap implementations, case-sensitivity of ```Used``` can be changed through the ```used.case.sensitive``` property.

### Unit Tests
* Unit tests for all of the code, should have 100% code coverage.