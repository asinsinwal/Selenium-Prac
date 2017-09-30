# SE_HW2

### Name: Animesh Sinsinwal
### UnityID: assinsin

=====================================================================================
## Software Engineering - CSC510 - Homework 2
=====================================================================================

### Task 1 - OO Patterns
There are many design patterns that have been defined and used in building software. For object-oriented design patterns, they can be described in three major categories:

* Creational Patterns
* Structural patterns
* Behavioral patterns
Define and describe 2 design patterns from each category. </br>
#### Solution: 
1. **Creation Design Patterns** - Related to class instantiation. Divided into class-creation patterns and object-creational patterns. 

a) **Factory Method**
  * Why? To handle a standardized architectural model for a range of applications, but allow for individual applications to define their own domain objects and provide for their instantiation. </br>
  * It defines a interface for creating an object, but let subclasses decide which class to instantiate. </br>
  * Conceptual "virtual" constructor design. </br>
  * Factory method are routinely specified by an architectural framework, and then implemented by the user of the framework.</br>
  * Factory methods are usually called within Template Methods. </br>
  * As "new" operator considered harmful. Therer is a difference between requesting an object and creating one. The "new" operator always creates an object, and fails to encapsulate object creation.</br>

b) **Singleton**
  * Why? Application needs one, and only one, instance of an object. Additionally, lazy initialization and global access are necessary. </br>
  * Ensure a class has only one instance, and provide a global point of access to it. </br>
  * "Just-in-time initialization" and "Initialization on first use" encapsulated.</br>
  * It's simpler to pass an object resource as a reference to the objects that need it, rather than letting objects access the resource globally.</br>

2. **Structural Design Patterns** - Related to all about Class and Object composition. Concerned about the ways to compose objects to obtain new functionality.

a) **Decorator**
  * Why? To add behavior or state to individual objects at run-time. Inheritance is not feasible because it is static and applies to an entire class. </br>
  * Intention is to wrapping a gift, putting it in a box, and wrapping the box.</br>
  * Client-specified embellishment of a core object by recursively wrapping it.</br>
  * Decorator is more transparent to the client, as decorator enhances an object's reponsibilities. As a consequence, decorator supports recursive composition, which isn't possible with pure Adapters.</br>


b) **Proxy**
  * Why? To support resource-hungry objects, and don't want to intantiate such objects unless and until they are actually requested by the client.</br>
  * Intention is to provide a surrogate or placeholder for another object to control access to it.</br>
  * When one has to add a wrapper and delegation to protect the real component from undue complexity. </br>
  * Needed when one uses an extra level of indirection to support distributed, controlled, or intelligent access. </br>

3. **Behavioral Design Patterns** - Related to all about Class's objects communication. Concerned with communication between objects.

a) **Chain of Responsibility**
  * Why? To handle a stream of requests, we need number of "handler" or "processing element" or "node" objects. </br>
  * Used when an object-oriented linked list with recursive traversal. </br>
  * When launch-and-leave requests with a single processing pipeline that contains many possible handlers. </br>
  * Chain the receiving objects and pass the request along the chain until an object handles it. </br>

b) **Visitor**
  * Why? To perform many distinct and unrelated operations on node objects in a heterogeneous aggregate structure. Also, one doesn't want to query the type of each node and cast the pointer to the correct type before performing the desired operation.</br>
  * Used when the classic technique is needed for recovering lost type information.</br>
  * Represent an operation to be performed on the elements of an object structure. </br>

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
  * "Applications that rely heavily on a data-store usually can benefit greatly from using the Cache-Aside Pattern."[2]</br>
  * Data Reading: It is used to retrieve an item from the data store. If it is available in cache, it is retrieve directly. Else, one has to query the data store. </br>
  * Updating Data: If data is updated, then either the cache should be updated or the old should be invalidated. </br>
  * Lifetime of Cache: Expiration policy should be ensured, so that data matches the pattern of access.</br>
  * Consistency: Cache-Aside pattern does not guarantee consistency between the data store and the cache. Pub/Sub pattern can be used.</br>
  * "If used correctly, this pattern can improve performance and help maintain consistency between the cache and the underlying data store."[2]</br>


=====================================================================================

### Task 3 - Selenium (For SE)

[Click Here](https://github.ncsu.edu/assinsin/SE_HW2/blob/assinsin/Selenium/src/test/java/selenium/tests/WebTest.java) to go to the WebTest.java, all four unit tests are updated at this location. 

**Screenshot** From Eclipse
![Screenshot](https://github.ncsu.edu/assinsin/SE_HW2/blob/master/images/PassedTest%20-%20Screenshot.png)

=====================================================================================

### References:
1. [Design Patterns - Source Making](https://sourcemaking.com/design_patterns)
2. [Software Design - Non OO Design Patterns](https://blog.cdemi.io/tag/design-patterns/)