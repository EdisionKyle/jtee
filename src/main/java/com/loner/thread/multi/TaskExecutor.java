package com.loner.thread.multi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
Executor接口只声明了一个名称为execute的方法，接收一个Runnable实参。Executor会
将传递给他的execute方法的每个Runnable对象赋予线程池中可以用的线程。如果没有可以用的线程，
则Executor会创建一个新线程，或等待某个线程会成为可用的，并会将这个线程赋予传递给execute方法的Runnable对象。
ExecutorService接口扩展了Executor接口。
 */
public class TaskExecutor {
	public static void main(String[] args) {
		// create and name each runnable
		PrintTask task1 = new PrintTask("task1");
		PrintTask task2 = new PrintTask("task2");
		PrintTask task3 = new PrintTask("task3");

		System.out.println("Starting Executor");

		// create ExecutorService to manage threads
		ExecutorService threadExecutor = Executors.newCachedThreadPool();

		// start threads and place in runnable state
		threadExecutor.execute(task1); // start task1
		threadExecutor.execute(task2); // start task2
		threadExecutor.execute(task3); // start task3

		// shut down worker threads when their tasks complete
		threadExecutor.shutdown();

		System.out.println("Tasks started, main ends.\n");
	} // end main
} // end class TaskExecutor 