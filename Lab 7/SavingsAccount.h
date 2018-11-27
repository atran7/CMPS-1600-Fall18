//
// Created by super on 11/20/2018.
//

#ifndef LAB7_SAVINGSACCOUNT_H
#define LAB7_SAVINGSACCOUNT_H

#include "BankAccount.h"
#include <string>

using namespace std;

class SavingsAccount : public BankAccount {
public:
    SavingsAccount(string n, double b, double i);

    void addInterest();

private:
    double interest;
};


#endif //LAB7_SAVINGSACCOUNT_H
