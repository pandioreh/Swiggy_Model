//Swiggy Application

import java.util.Scanner;

public class Swiggy {
	static Scanner sc = new Scanner(System.in);
	static boolean user_food = true;

	public static void main(String[] args) throws Exception {

		do {
			Thread.sleep(5000);
			System.out.println("\n\n\n\t\tWelcome to \"Swiggy\"");
			System.out.println("Select the Input");
			System.out.println("1.Buhari\n2.Al-Safa\n3.Eats-of-Arab\n4.A2B\n");

			int user_hotel = sc.nextInt();
			switch (user_hotel) {
			case 1: {// This code will execute if user select buhari
				System.out.println("\t\tThankyou for selecting \"BUHARI HOTEL\"");
				System.out.println("Select your Favarite Food");
				System.out.println("1.Mutton Biryani\n2.Chicken Biryani\n3.Vanjaram Fish\n4.Chicken-65\n");

				int user_wish_food = sc.nextInt();
				switch (user_wish_food) {
				case 1: {// Mutton Biryani
							// Lets fix the per plate price
					System.out.println("\t\tYour Selecting Mutton Biryani\n");
					double per_plate_price = 340;
					// lets ask user to select the quantity
					System.out.println("\t\tSelect the Quantity");
					int qty = sc.nextInt(); // quantity stored
					double total_bill = qty * per_plate_price; // we are having total bill
					System.out.println("Total Bill: " + total_bill);

					System.out.println("\t\tSelect the Payment Mode\n");
					System.out.println("1.Google Pay\n2.Phone Pay");
					int user_payment = sc.nextInt();
					switch (user_payment) {
					case 1: { // User selecting Google Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();// user entered dill is strored
						if (user_bill_amount == total_bill) {// this code will execute if user enter correct price
																// Gen OTP
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(3000);
							System.out.println("Sys_OTP: " + sys_otp);// user is seeing the OTP
							// ask user to enter the otp
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");

							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".......Please Try Again......");
							}

						} else {
							System.err.println("Invalid Input\n");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}
					case 2: {// User selecting Phone Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();
						if (user_bill_amount == total_bill) {
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(4000);
							System.out.println("Sys_OTP: " + sys_otp);
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");
							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".........Please Try Again.......");
							}
						} else {
							System.err.println("Invalid Input");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}

					default: {// Payment End
						System.err.println("Invalid Input for Selecting Payment");
						break;
					}
					}

					break;
				}
				case 2: { // Chicken Biryani
							// lets fix the per plate price
					System.out.println("\t\tYour Selecting Chicken Biryani");
					double per_plate_price = 450;
					// lets ask user to select the quantity
					System.out.println("\t\tSelect the Quantity");
					int qty = sc.nextInt();// quantity stored
					double total_bill = qty * per_plate_price;// we are having total bil
					System.out.println("Total Bill: " + total_bill);

					System.out.println("\t\tSelect the Payment Mode\n");
					System.out.println("1.Google Pay\n2.Phone Pay");
					int user_payment = sc.nextInt();
					switch (user_payment) {
					case 1: { // User selecting Google Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();// user entered dill is strored
						if (user_bill_amount == total_bill) {// this code will execute if user enter correct price
																// Gen OTP
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(3000);
							System.out.println("Sys_OTP: " + sys_otp);// user is seeing the OTP
							// ask user to enter the otp
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");

							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println("........Please Try Again.......");
							}

						} else {
							System.err.println("Invalid Input");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}
					case 2: {// User selecting Phone Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();
						if (user_bill_amount == total_bill) {
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(4000);
							System.out.println("Sys_OTP: " + sys_otp);
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");
							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".........Please Try Again.......");
							}
						} else {
							System.err.println("Invalid Input\n");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}

					default: {// {Payment End
						System.err.println("Invalid Input for Selecting Payment");
						break;
					}
					}

					break;
				}
				case 3: {// Vanjaram Fish
					System.out.println("\t\tYour Selecting Vanjaram Fish");
					double per_plate_price = 987;
					System.out.println("\t\tSelect the Quantity");
					int qty = sc.nextInt();
					double total_bill = qty * per_plate_price;
					System.out.println("Total Bill: " + total_bill);

					System.out.println("\t\tSelect the Payment Mode\n");
					System.out.println("1.Google Pay\n2.Phone Pay");
					int user_payment = sc.nextInt();
					switch (user_payment) {
					case 1: { // User selecting Google Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();// user entered dill is strored
						if (user_bill_amount == total_bill) {// this code will execute if user enter correct price
																// Gen OTP
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(3000);
							System.out.println("Sys_OTP: " + sys_otp);// user is seeing the OTP
							// ask user to enter the otp
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");

							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".......Please Try Again......");
							}

						} else {
							System.err.println("Invalid Input");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}
					case 2: {// User selecting Phone Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();
						if (user_bill_amount == total_bill) {
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(4000);
							System.out.println("Sys_OTP: " + sys_otp);
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");
							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".........Please Try Again......");
							}
						} else {
							System.err.println("Invalid Input\n");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}

					default: {// Payment end
						System.err.println("Invalid Input for Selecting Payment");
						break;
					}
					}

					break;
				}
				case 4: {// Chicken-65
					System.out.println("\t\tYour Selecting Chicken-65");
					double per_plate_price = 378;
					System.out.println("\t\tSelect the quantity");
					int qty = sc.nextInt();
					double total_bill = qty * per_plate_price;
					System.out.println("Total Bill: " + total_bill);

					System.out.println("\t\tSelect the Payment Mode\n");
					System.out.println("1.Google Pay\n2.Phone Pay");
					int user_payment = sc.nextInt();
					switch (user_payment) {
					case 1: { // User selecting Google Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();// user entered dill is strored
						if (user_bill_amount == total_bill) {// this code will execute if user enter correct price
																// Gen OTP
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(3000);
							System.out.println("Sys_OTP: " + sys_otp);// user is seeing the OTP
							// ask user to enter the otp
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully");
								System.out.println("It will be Deliver to you\n\n\n");
								System.out.println("*******Thank You for Food Ordered********");

							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println("........Please Try Again......");
							}

						} else {
							System.err.println("Invalid Input\n");
							System.out.println("Entered Amount is Wrong");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}
					case 2: {// User selecting Phone Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();
						if (user_bill_amount == total_bill) {
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(4000);
							System.out.println("Sys_OTP: " + sys_otp);
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");
							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".......Please Try Again......");
							}
						} else {
							System.err.println("Invalid Input");
							System.out.println("Entered Amount is Wrong");
							System.out.println("Please enter the Correct Amount");
						}
						break;
					}

					default: {// Payment End
						System.err.println("Invalid Input for Selecting Payment");
						break;
					}
					}
					break;
				}

				// crt
				default: {// User Food End
					System.err.println("Invalid Input for Selecting Food\n\n");
					System.out.println("Please check the input");
					break;
				}

				}

				break;
			}

			case 2: {// This code is execute if user is selecting Al-Safa

				System.out.println("\t\tThankyou for selecting \"Al-Safa\"");
				System.out.println("Select your Favarite Food");
				System.out.println("1.Fried Rice\n2.Chicken Rice\n3.Mushroom Rice\n4.Curd Rice\n");

				int user_wish_food = sc.nextInt();
				switch (user_wish_food) {
				case 1: {// Fried Rice
							// Lets fix the per plate price
					System.out.println("\t\tYour Selecting Fried Rice\n");
					double per_plate_price = 140;
					// lets ask user to select the quantity
					System.out.println("\t\tSelect the Quantity");
					int qty = sc.nextInt(); // quantity stored
					double total_bill = qty * per_plate_price; // we are having total bill
					System.out.println("Total Bill: " + total_bill);

					System.out.println("\t\tSelect the Payment Mode\n");
					System.out.println("1.Google Pay\n2.Phone Pay");
					int user_payment = sc.nextInt();
					switch (user_payment) {
					case 1: { // User selecting Google Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();// user entered dill is strored
						if (user_bill_amount == total_bill) {// this code will execute if user enter correct price
																// Gen OTP
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(3000);
							System.out.println("Sys_OTP: " + sys_otp);// user is seeing the OTP
							// ask user to enter the otp
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");

							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".......Please Try Again......");
							}

						} else {
							System.err.println("Invalid Input\n");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}
					case 2: {// User selecting Phone Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();
						if (user_bill_amount == total_bill) {
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(4000);
							System.out.println("Sys_OTP: " + sys_otp);
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");
							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".........Please Try Again.......");
							}
						} else {
							System.err.println("Invalid Input");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}

					default: {// Payment End
						System.err.println("Invalid Input for Selecting Payment");
						break;
					}
					}

					break;
				}
				case 2: { // Chicken Rice
							// lets fix the per plate price
					System.out.println("\t\tYour Selecting Chicken Rice");
					double per_plate_price = 180;
					// lets ask user to select the quantity
					System.out.println("\t\tSelect the Quantity");
					int qty = sc.nextInt();// quantity stored
					double total_bill = qty * per_plate_price;// we are having total bil
					System.out.println("Total Bill: " + total_bill);

					System.out.println("\t\tSelect the Payment Mode\n");
					System.out.println("1.Google Pay\n2.Phone Pay");
					int user_payment = sc.nextInt();
					switch (user_payment) {
					case 1: { // User selecting Google Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();// user entered dill is strored
						if (user_bill_amount == total_bill) {// this code will execute if user enter correct price
																// Gen OTP
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(3000);
							System.out.println("Sys_OTP: " + sys_otp);// user is seeing the OTP
							// ask user to enter the otp
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");

							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println("........Please Try Again.......");
							}

						} else {
							System.err.println("Invalid Input");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}
					case 2: {// User selecting Phone Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();
						if (user_bill_amount == total_bill) {
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(4000);
							System.out.println("Sys_OTP: " + sys_otp);
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");
							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".........Please Try Again.......");
							}
						} else {
							System.err.println("Invalid Input\n");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}

					default: {// {Payment End
						System.err.println("Invalid Input for Selecting Payment");
						break;
					}
					}

					break;
				}
				case 3: {// Mushroom Rice
					System.out.println("\t\tYour Selecting Mushroom Rice");
					double per_plate_price = 200;
					System.out.println("\t\tSelect the Quantity");
					int qty = sc.nextInt();
					double total_bill = qty * per_plate_price;
					System.out.println("Total Bill: " + total_bill);

					System.out.println("\t\tSelect the Payment Mode\n");
					System.out.println("1.Google Pay\n2.Phone Pay");
					int user_payment = sc.nextInt();
					switch (user_payment) {
					case 1: { // User selecting Google Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();// user entered dill is strored
						if (user_bill_amount == total_bill) {// this code will execute if user enter correct price
																// Gen OTP
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(3000);
							System.out.println("Sys_OTP: " + sys_otp);// user is seeing the OTP
							// ask user to enter the otp
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");

							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".......Please Try Again......");
							}

						} else {
							System.err.println("Invalid Input");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}
					case 2: {// User selecting Phone Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();
						if (user_bill_amount == total_bill) {
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(4000);
							System.out.println("Sys_OTP: " + sys_otp);
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");
							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".........Please Try Again......");
							}
						} else {
							System.err.println("Invalid Input\n");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}

					default: {// Payment end
						System.err.println("Invalid Input for Selecting Payment");
						break;
					}
					}

					break;
				}
				case 4: {// Curd Rice
					System.out.println("\t\tYour Selecting Curd Rice");
					double per_plate_price = 50;
					System.out.println("\t\tSelect the quantity");
					int qty = sc.nextInt();
					double total_bill = qty * per_plate_price;
					System.out.println("Total Bill: " + total_bill);

					System.out.println("\t\tSelect the Payment Mode\n");
					System.out.println("1.Google Pay\n2.Phone Pay");
					int user_payment = sc.nextInt();
					switch (user_payment) {
					case 1: { // User selecting Google Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();// user entered dill is strored
						if (user_bill_amount == total_bill) {// this code will execute if user enter correct price
																// Gen OTP
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(3000);
							System.out.println("Sys_OTP: " + sys_otp);// user is seeing the OTP
							// ask user to enter the otp
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully");
								System.out.println("It will be Deliver to you\n\n\n");
								System.out.println("*******Thank You for Food Ordered********");

							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println("........Please Try Again......");
							}

						} else {
							System.err.println("Invalid Input\n");
							System.out.println("Entered Amount is Wrong");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}
					case 2: {// User selecting Phone Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();
						if (user_bill_amount == total_bill) {
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(4000);
							System.out.println("Sys_OTP: " + sys_otp);
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");
							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".......Please Try Again......");
							}
						} else {
							System.err.println("Invalid Input");
							System.out.println("Entered Amount is Wrong");
							System.out.println("Please enter the Correct Amount");
						}
						break;
					}

					default: {// Payment End
						System.err.println("Invalid Input for Selecting Payment");
						break;
					}
					}
					break;
				}

				default: {// User Food End
					System.err.println("Invalid Input for Selecting Food\n\n");
					System.out.println("Please check the input");
					break;
				}

				}

				break;
			}
			case 3: {// eats-of-arab
				// This code will execute if user select Eats-of-arab
				System.out.println("\t\tThankyou for selecting \"Eats-of-Arab\"");
				System.out.println("Select your Favarite Food");
				System.out.println("1.Mutton Chukka\n2.Chicken Halwa\n3.Vairamin Fish\n4.Fish Fry\n");

				int user_wish_food = sc.nextInt();
				switch (user_wish_food) {
				case 1: {// Mutton Chukka
							// Lets fix the per plate price
					System.out.println("\t\tYour Selecting Mutton Chukka\n");
					double per_plate_price = 127;
					// lets ask user to select the quantity
					System.out.println("\t\tSelect the Quantity");
					int qty = sc.nextInt(); // quantity stored
					double total_bill = qty * per_plate_price; // we are having total bill
					System.out.println("Total Bill: " + total_bill);

					System.out.println("\t\tSelect the Payment Mode\n");
					System.out.println("1.Google Pay\n2.Phone Pay");
					int user_payment = sc.nextInt();
					switch (user_payment) {
					case 1: { // User selecting Google Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();// user entered dill is strored
						if (user_bill_amount == total_bill) {// this code will execute if user enter correct price
																// Gen OTP
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(3000);
							System.out.println("Sys_OTP: " + sys_otp);// user is seeing the OTP
							// ask user to enter the otp
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");

							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".......Please Try Again......");
							}

						} else {
							System.err.println("Invalid Input\n");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}
					case 2: {// User selecting Phone Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();
						if (user_bill_amount == total_bill) {
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(4000);
							System.out.println("Sys_OTP: " + sys_otp);
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");
							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".........Please Try Again.......");
							}
						} else {
							System.err.println("Invalid Input");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}

					default: {// Payment End
						System.err.println("Invalid Input for Selecting Payment");
						break;
					}
					}

					break;
				}
				case 2: { // Chicken Halwa
							// lets fix the per plate price
					System.out.println("\t\tYour Selecting Chicken Halwa");
					double per_plate_price = 420;
					// lets ask user to select the quantity
					System.out.println("\t\tSelect the Quantity");
					int qty = sc.nextInt();// quantity stored
					double total_bill = qty * per_plate_price;// we are having total bil
					System.out.println("Total Bill: " + total_bill);

					System.out.println("\t\tSelect the Payment Mode\n");
					System.out.println("1.Google Pay\n2.Phone Pay");
					int user_payment = sc.nextInt();
					switch (user_payment) {
					case 1: { // User selecting Google Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();// user entered dill is strored
						if (user_bill_amount == total_bill) {// this code will execute if user enter correct price
																// Gen OTP
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(3000);
							System.out.println("Sys_OTP: " + sys_otp);// user is seeing the OTP
							// ask user to enter the otp
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");

							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println("........Please Try Again.......");
							}

						} else {
							System.err.println("Invalid Input");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}
					case 2: {// User selecting Phone Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();
						if (user_bill_amount == total_bill) {
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(4000);
							System.out.println("Sys_OTP: " + sys_otp);
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");
							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".........Please Try Again.......");
							}
						} else {
							System.err.println("Invalid Input\n");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}

					default: {// {Payment End
						System.err.println("Invalid Input for Selecting Payment");
						break;
					}
					}

					break;
				}
				case 3: {// Vairamin Fish
					System.out.println("\t\tYour Selecting Vairamin Fish");
					double per_plate_price = 608;
					System.out.println("\t\tSelect the Quantity");
					int qty = sc.nextInt();
					double total_bill = qty * per_plate_price;
					System.out.println("Total Bill: " + total_bill);

					System.out.println("\t\tSelect the Payment Mode\n");
					System.out.println("1.Google Pay\n2.Phone Pay");
					int user_payment = sc.nextInt();
					switch (user_payment) {
					case 1: { // User selecting Google Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();// user entered dill is strored
						if (user_bill_amount == total_bill) {// this code will execute if user enter correct price
																// Gen OTP
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(3000);
							System.out.println("Sys_OTP: " + sys_otp);// user is seeing the OTP
							// ask user to enter the otp
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");

							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".......Please Try Again......");
							}

						} else {
							System.err.println("Invalid Input");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}
					case 2: {// User selecting Phone Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();
						if (user_bill_amount == total_bill) {
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(4000);
							System.out.println("Sys_OTP: " + sys_otp);
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");
							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".........Please Try Again......");
							}
						} else {
							System.err.println("Invalid Input\n");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}

					default: {// Payment end
						System.err.println("Invalid Input for Selecting Payment");
						break;
					}
					}

					break;
				}
				case 4: {// Fish Fry
					System.out.println("\t\tYour Selecting Fish Fry");
					double per_plate_price = 227;
					System.out.println("\t\tSelect the quantity");
					int qty = sc.nextInt();
					double total_bill = qty * per_plate_price;
					System.out.println("Total Bill: " + total_bill);

					System.out.println("\t\tSelect the Payment Mode\n");
					System.out.println("1.Google Pay\n2.Phone Pay");
					int user_payment = sc.nextInt();
					switch (user_payment) {
					case 1: { // User selecting Google Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();// user entered dill is strored
						if (user_bill_amount == total_bill) {// this code will execute if user enter correct price
																// Gen OTP
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(3000);
							System.out.println("Sys_OTP: " + sys_otp);// user is seeing the OTP
							// ask user to enter the otp
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully");
								System.out.println("It will be Deliver to you\n\n\n");
								System.out.println("*******Thank You for Food Ordered********");

							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println("........Please Try Again......");
							}

						} else {
							System.err.println("Invalid Input\n");
							System.out.println("Entered Amount is Wrong");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}
					case 2: {// User selecting Phone Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();
						if (user_bill_amount == total_bill) {
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(4000);
							System.out.println("Sys_OTP: " + sys_otp);
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");
							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".......Please Try Again......");
							}
						} else {
							System.err.println("Invalid Input");
							System.out.println("Entered Amount is Wrong");
							System.out.println("Please enter the Correct Amount");
						}
						break;
					}

					default: {// Payment End
						System.err.println("Invalid Input for Selecting Payment");
						break;
					}
					}
					break;
				}

				// crt
				default: {// User Food End
					System.err.println("Invalid Input for Selecting Food\n\n");
					System.out.println("Please check the input");
					break;
				}

				}

				break;

			}
			case 4: {
				// This code will execute if user select A2B
				System.out.println("\t\tThankyou for selecting \"A2B\"");
				System.out.println("Select your Favarite Food");
				System.out.println("1.Chappathi\n2.Pongal\n3.Masala Dosa\n4.Veg-Biryani\n");

				int user_wish_food = sc.nextInt();
				switch (user_wish_food) {
				case 1: {// Chappthi
							// Lets fix the per plate price
					System.out.println("\t\tYour Selecting Chappthi\n");
					double per_plate_price = 80;
					// lets ask user to select the quantity
					System.out.println("\t\tSelect the Quantity");
					int qty = sc.nextInt(); // quantity stored
					double total_bill = qty * per_plate_price; // we are having total bill
					System.out.println("Total Bill: " + total_bill);

					System.out.println("\t\tSelect the Payment Mode\n");
					System.out.println("1.Google Pay\n2.Phone Pay");
					int user_payment = sc.nextInt();
					switch (user_payment) {
					case 1: { // User selecting Google Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();// user entered dill is strored
						if (user_bill_amount == total_bill) {// this code will execute if user enter correct price
																// Gen OTP
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(3000);
							System.out.println("Sys_OTP: " + sys_otp);// user is seeing the OTP
							// ask user to enter the otp
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");

							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".......Please Try Again......");
							}

						} else {
							System.err.println("Invalid Input\n");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}
					case 2: {// User selecting Phone Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();
						if (user_bill_amount == total_bill) {
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(4000);
							System.out.println("Sys_OTP: " + sys_otp);
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");
							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".........Please Try Again.......");
							}
						} else {
							System.err.println("Invalid Input");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}

					default: {// Payment End
						System.err.println("Invalid Input for Selecting Payment");
						break;
					}
					}

					break;
				}
				case 2: { // Pongal
							// lets fix the per plate price
					System.out.println("\t\tYour Selecting Pongal");
					double per_plate_price = 47;
					// lets ask user to select the quantity
					System.out.println("\t\tSelect the Quantity");
					int qty = sc.nextInt();// quantity stored
					double total_bill = qty * per_plate_price;// we are having total bil
					System.out.println("Total Bill: " + total_bill);

					System.out.println("\t\tSelect the Payment Mode\n");
					System.out.println("1.Google Pay\n2.Phone Pay");
					int user_payment = sc.nextInt();
					switch (user_payment) {
					case 1: { // User selecting Google Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();// user entered dill is strored
						if (user_bill_amount == total_bill) {// this code will execute if user enter correct price
																// Gen OTP
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(3000);
							System.out.println("Sys_OTP: " + sys_otp);// user is seeing the OTP
							// ask user to enter the otp
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");

							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println("........Please Try Again.......");
							}

						} else {
							System.err.println("Invalid Input");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}
					case 2: {// User selecting Phone Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();
						if (user_bill_amount == total_bill) {
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(4000);
							System.out.println("Sys_OTP: " + sys_otp);
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");
							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".........Please Try Again.......");
							}
						} else {
							System.err.println("Invalid Input\n");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}

					default: {// {Payment End
						System.err.println("Invalid Input for Selecting Payment");
						break;
					}
					}

					break;
				}
				case 3: {// Masala Dosa
					System.out.println("\t\tYour Selecting Vanjaram Fish");
					double per_plate_price = 87;
					System.out.println("\t\tSelect the Quantity");
					int qty = sc.nextInt();
					double total_bill = qty * per_plate_price;
					System.out.println("Total Bill: " + total_bill);

					System.out.println("\t\tSelect the Payment Mode\n");
					System.out.println("1.Google Pay\n2.Phone Pay");
					int user_payment = sc.nextInt();
					switch (user_payment) {
					case 1: { // User selecting Google Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();// user entered dill is strored
						if (user_bill_amount == total_bill) {// this code will execute if user enter correct price
																// Gen OTP
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(3000);
							System.out.println("Sys_OTP: " + sys_otp);// user is seeing the OTP
							// ask user to enter the otp
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");

							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".......Please Try Again......");
							}

						} else {
							System.err.println("Invalid Input");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}
					case 2: {// User selecting Phone Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();
						if (user_bill_amount == total_bill) {
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(4000);
							System.out.println("Sys_OTP: " + sys_otp);
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully\n");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");
							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".........Please Try Again......");
							}
						} else {
							System.err.println("Invalid Input\n");
							System.out.println("Enter Amount is Wrong\n");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}

					default: {// Payment end
						System.err.println("Invalid Input for Selecting Payment");
						break;
					}
					}

					break;
				}
				case 4: {// Veg-Biryani
					System.out.println("\t\tYour Selecting Veg-Biryani");
					double per_plate_price = 235;
					System.out.println("\t\tSelect the quantity");
					int qty = sc.nextInt();
					double total_bill = qty * per_plate_price;
					System.out.println("Total Bill: " + total_bill);

					System.out.println("\t\tSelect the Payment Mode\n");
					System.out.println("1.Google Pay\n2.Phone Pay");
					int user_payment = sc.nextInt();
					switch (user_payment) {
					case 1: { // User selecting Google Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();// user entered dill is strored
						if (user_bill_amount == total_bill) {// this code will execute if user enter correct price
																// Gen OTP
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(3000);
							System.out.println("Sys_OTP: " + sys_otp);// user is seeing the OTP
							// ask user to enter the otp
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully");
								System.out.println("It will be Deliver to you\n\n\n");
								System.out.println("*******Thank You for Food Ordered********");

							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println("........Please Try Again......");
							}

						} else {
							System.err.println("Invalid Input\n");
							System.out.println("Entered Amount is Wrong");
							System.out.println("Please enter the Correct Amount");
						}

						break;
					}
					case 2: {// User selecting Phone Pay
						System.out.println("\t\tEnter the Bill Amount: " + total_bill);
						double user_bill_amount = sc.nextDouble();
						if (user_bill_amount == total_bill) {
							int sys_otp = (int) (Math.random() * 9999 + 9999);
							Thread.sleep(4000);
							System.out.println("Sys_OTP: " + sys_otp);
							System.out.println("\t\tEnter the OTP");

							int user_entered_otp = sc.nextInt();
							if (user_entered_otp == sys_otp) {
								System.out.println("\t\tOrder Placed Successfully");
								System.out.println("It will be Deliver to you\n\n");
								System.out.println("*******Thank You for Food Ordered********");
							} else {
								System.err.println("\t\tOrder Failed\n\n");
								System.out.println(".......Please Try Again......");
							}
						} else {
							System.err.println("Invalid Input");
							System.out.println("Entered Amount is Wrong");
							System.out.println("Please enter the Correct Amount");
						}
						break;
					}

					default: {// Payment End
						System.err.println("Invalid Input for Selecting Payment");
						break;
					}
					}
					break;
				}

				// crt
				default: {// User Food End
					System.err.println("Invalid Input for Selecting Food\n\n");
					System.out.println("Please check the input");
					break;
				}

				}

				break;
			}

			// crt
			default: {// User Hotel End
				System.err.println("Invalid Selected Hotel");
				break;
			}

			}

		} while (user_food);

	}
}
