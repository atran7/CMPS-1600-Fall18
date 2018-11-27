//
// Created by super on 11/20/2018.
//

#include "CheckingAccount.h"
#include "BankAccount.h"

#include <stdio.h>

#include <string>

using namespace std;

CheckingAccount::CheckingAccount(string n, double b)
{
    this->name = n;
    this->balance = b;
}

void CheckingAccount::deposit(double a)
{
    balance += a;
    transactionCount++;
}

void CheckingAccount::withdraw(double a)
{
    balance -= a;
    transactionCount++;
}

void CheckingAccount::deductFees()
{
    balance -= transactionCount*TRANSACTION_FEE;
    transactionCount = 0;
}

