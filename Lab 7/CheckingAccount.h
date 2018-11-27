//
// Created by super on 11/20/2018.
//

#ifndef LAB7_CHECKINGACCOUNT_H
#define LAB7_CHECKINGACCOUNT_H

#include <stdio.h>
#include "BankAccount.h"

#include <iostream>

#include <string>

using namespace std;


class CheckingAccount :public BankAccount
{
public:
    CheckingAccount(string n, double b);

    void withdraw(double a) override;
    void deposit (double a) override;

    void deductFees();


private:
    int transactionCount=0;
    const double TRANSACTION_FEE = 3.0;

};


#endif //LAB7_CHECKINGACCOUNT_H
