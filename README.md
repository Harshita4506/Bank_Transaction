Project title - ATM Transaction System (Java Console Application)
Project Description: This is a Java console-based ATM Transaction System using OOPs through Java concepts that allows users to perform basic banking operations such as Withdraw, Deposit, and Payment after verifying a 4-digit PIN.
Features :
		1)PIN validation (3 attempts limit)
		2)Deposit money (only multiples of 100)
		3)Withdraw money (only multiples of 100)
		4)Payment transaction
		5)Multiple transactions in one session
Validations Included:
		1)PIN must be between 1111 and 9999
		2)Withdraw/Payment amount must be less than available balance
		3)Account blocked after 3 wrong PIN attempts
Technologies Used:
		1)Language: Java
		2)Concepts:
				#Classes & Objects
				#Methods
				#Conditional statements
				#Loops
				#Switch case
				#Scanner (User Input)
How It Works:
		1. User enters a 4-digit PIN
		2. If PIN is correct, user enters initial balance
		3. User selects a transaction type:
				#Withdraw
				#Deposit
				#Payment
		4. Amount is processed and updated balance is shown
		5. User can continue or exit
Sample Input
	Enter Pin:
	1234
	Enter Total Amount:
	5000
	Enter which type of transaction:
	Withdraw
	Enter Withdraw Amount:
	1000
Sample Output
	Withdraw Amount: 1000
	Total amount: 4000
	Transaction Completed Successfully
