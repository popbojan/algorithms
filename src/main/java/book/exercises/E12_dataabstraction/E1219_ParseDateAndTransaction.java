package book.exercises.E12_dataabstraction;

/**
 * Exercise 1.2.19:
 * Parsing. Develop the parse constructors for your Date and Transaction implementations
 * of EXERCISE 1.2.13 that take a single String argument to specify the initialization values,
 * using the formats given in the table below:
 * <p>
 * Partial solution:
 * <p>
 * public Date(String date)
 * {
 *  String[] fields = date.split("/");
 *  month = Integer.parseInt(fields[0]);
 *  day = Integer.parseInt(fields[1]);
 *  year = Integer.parseInt(fields[2]);
 * }
 * <p>
 * Date         -> integers separated by slashes                     -> 5/22/1939
 * Transaction  -> customer, date and amount separated by whitespace -> Turing 5/22/1939 11.99
 * <p>
 */
 public class E1219_ParseDateAndTransaction {

 }
