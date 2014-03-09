package com.whereismymoney.model;

import android.content.Context;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Account {
    private final String myFullName;
    private final String myDisplayName;
    private final double myBalance;
    private final double myInterestRate;

    public Account(String fullName, String displayName, double balance, double interestRate) {
        myFullName = fullName;
        myDisplayName = displayName;
        myBalance = balance;
        myInterestRate = interestRate;
    }
        
    public String getFullName() {
        return myFullName;
    }

    public String getDisplayName() {
        return myDisplayName;
    }

    public double getBalance() {
        return myBalance;
    }

    public double getInterestRate() {
        return myInterestRate;
    }
    
    // display account display name, current balance and interest rate in a given table layout
    public void display(TableLayout accountTable, Context context) {
        TableRow row= new TableRow(context);

        TextView diaplayName = new TextView(context);
        diaplayName.setText(myDisplayName);
        row.addView(diaplayName);

        TextView balance = new TextView(context);
        balance.setText("" + myBalance);
        row.addView(balance);

        TextView intRate = new TextView(context);
        intRate.setText("" + myInterestRate);
        row.addView(intRate);

        accountTable.addView(row);
    }
}
