package com.sundogsoftware.spark

import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkContext

object ExerciseSpentByCustomer {

  def parse(line: String): (String, Float) ={
    val fields= line.split(",")
    val customerId= fields(0)
    val amount=fields(2).toFloat
    (customerId,amount)
  }
  def main(args: Array[String]) {

    // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)

    // Create a SparkContext using every core of the local machine
    val sc = new SparkContext("local[*]", "TotalSpentByCustomer")

    // Load each line of my book into an RDD
    val input = sc.textFile("data/customer-orders.csv")

    val customersAndSpent = input.map(parse)

    val totalSpentByCustomer = customersAndSpent.reduceByKey((x,y)=>x+y).map(x=>(x._2,x._1)).sortByKey().map(x=>(x._2,x._1))

    val result= totalSpentByCustomer.collect()

    // Print the results
    result.foreach(println)
  }
}
