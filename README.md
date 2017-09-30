# SE_HW2

### Name: Animesh Sinsinwal
### UnityID: assinsin

=====================================================================================
## Software Engineering - CSC510 - Homework 2
=====================================================================================

### Task 1 - OO Paterns
There are many design patterns that have been defined and used in building software. For object-oriented design patterns, they can be described in three major categories:

* Creational Patterns
* Structural patterns
* Behavioral patterns
Define and describe 2 design patterns from each category. </br>
#### Solution: 
1. Creation Design Patterns - Related to class instantiation. Divided into class-creation patterns and object-creational patterns. 

a) **Factory Method**
  * Why? To handle a standardized architectural model for a range of applications, but allow for individual applications to define their own domain objects and provide for their instantiation. </br>
  * It defines a interface for creating an object, but let subclasses decide which class to instantiate. </br>
  * Conceptual "virtual" constructor design. </br>
  * Factory method are routinely specified by an architectural framework, and then implemented by the user of the framework.</br>
  * Factory methods are usually called within Template Methods. </br>
  * As "new" operator considered harmful. Therer is a difference between requesting an object and creating one. The "new" operator always creates an object, and fails to encapsulate object creation.

b) **Singleton**
  * Why? Application needs one, and only one, instance of an object. Additionally, lazy initialization and global access are necessary. 
  * Ensure a class has only one instance, and provide a global point of access to it.
  * "Just-in-time initialization" and "Initialization on first use" encapsulated.
  * It's simpler to pass an object resource as a reference to the objects that need it, rather than letting objects access the resource globally.

2. Structural Design Patterns

a) **Decorator**
  * Why? To add behavior or state to individual objects at run-time. Inheritance is not feasible because it is static and applies to an entire class. 
  * Intention is to wrapping a gift, putting it in a box, and wrapping the box.
  * Client-specified embellishment of a core object by recursively wrapping it.
  * Decorator is more transparent to the client, as decorator enhances an object's reponsibilities. As a consequence, decorator supports recursive composition, which isn't possible with pure Adapters.


b) **Proxy**
  * Why? To support resource-hungry objects, and don't want to intantiate such objects unless and until they are actually requested by the client.
  * 

3. Behavioral Design Patterns

a) **Chain of Responsibility**
  * 
b) **Visitor**
  * 

=====================================================================================

### Task 2 - Free Style
Design patterns have been critized for being too specific and artifically limited by OO language constraints. Find and describe any pattern that may be useful in building software.

Define and describe 3 patterns that you have found. </br>
#### Solution:

* **Index Table Pattern**
  * Some attributes are accessed more frequently than rest in a database. Thus, we can create an index over them.</br>
  * This improves query performance as the data will be accessed faster. Eg., improved performance in NoSQL databases 3 strategies for structuring Index Tables.</br>
  * Helps in implementing Eventual Consistency for Index Tables (eg. Windows Azure storage tables and transactional updates).</br>
  * Can't be used with volatile data, or with non-discriminating secondary keys. </br>

* **Competing Consumer Pattern**
  * The Competing Consumer Pattern enables a system to process multiple messages concurrently to optimize throughput.</br>
  * This helps to improve scalability, availability and to balance the workload.</br>
  * Competing Consumers: To handle the fluctuating workload, the system can run multiple instances of the consumer service.</br>
  * Reliability: If consumers are unresponsive or overloaded, the system can still continue working and no messages would be lost.</br>
  * Resiliency: If mid-task fail, then message is not lost. Rahr returned to the queue, to be picked up by another consumer. </br>


* **Cache-Aside Pattern**
  * "Applications that rely heavily on a data-store usually can benefit greatly from using the Cahche-Aside Pattern."[2]</br>
  * Data Reading: It is used to retrieve an item from the data store. If it is available in cache, it is retireve directly. Else, one has to query the data store. </br>
  * Updating Data: If data is updated, then either the cache should be updated or the old should be invalidated. </br>
  * Lifetime of Cache: Expiration policy should be ensured, so that data matches the pattern of access.</br>
  * Consistensy: Cache-Aside pattern does not guarantee consistency between the data store and the cache. Pub/Sub pattern can be used.</br>
  * "If used correctly, this pattern can improve performance and help maintain consistency between the cache and the underlying data store."[2]</br>


=====================================================================================

### Task 3 - Selenium (For SE)

[Click Here](https://github.ncsu.edu/assinsin/SE_HW2/blob/assinsin/Selenium/src/test/java/selenium/tests/WebTest.java) to go to the WebTest.java, all four unit tests are updated at this location. 

**Screenshot** From Eclipse
![Screenshot](https://github.ncsu.edu/assinsin/SE_HW2/blob/assinsin/images/PassedTest%20-%20Screenshot.png)

=====================================================================================

### References:
1. [Design Patterns - Source Making](https://sourcemaking.com/design_patterns)
2. [Software Design - Non OO Design Patterns](https://blog.cdemi.io/tag/design-patterns/)