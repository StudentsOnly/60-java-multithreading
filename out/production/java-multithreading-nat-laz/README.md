## Exercise: Multithreading

#### Objective:

The objective of this exercise is to practice creating and managing threads in Java to simulate a basic task that requires parallel processing.

#### Instructions:

1.	Create a Java class named ParallelTaskExercise with a main method.
2.	Create a class named ParallelTask that represents a task that takes a long time to compute. This task can be represented by a simple method that calculates the factorial of a given number.
3.	Create three instances of the ParallelTask class to represent three tasks that will be processed in parallel.
4.	Create three threads, and each thread should be responsible for executing one of the ParallelTask instances.
5.	Start all three threads to execute the tasks in parallel.
6.	Each ParallelTask instance should print its result when it finishes its computation.
7.	Use the join method to ensure all threads have completed their tasks.
